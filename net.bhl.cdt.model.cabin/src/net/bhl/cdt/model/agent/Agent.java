/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.agent;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import net.bhl.cdt.model.astar.AStar;
import net.bhl.cdt.model.agent.AggressiveMood;
import net.bhl.cdt.model.astar.CostMap;
import net.bhl.cdt.model.agent.PassiveMood;
import net.bhl.cdt.model.astar.AreaMap;
import net.bhl.cdt.model.astar.Path;
import net.bhl.cdt.model.astar.RunAStar;
import net.bhl.cdt.model.astar.StopWatch;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;
import net.bhl.cdt.model.observer.Subject;

/**
 * This class is the agent object. It walks a specific calculated path and
 * reacts to obstacles occurring on the go.
 * 
 * @author marc.engelmann
 *
 */
public class Agent extends Subject implements Runnable {
	private Thread thread;
	private Path path;
	private Vector start;
	private Vector goal;
	private Vector desiredPosition;
	private Vector currentPosition;
	private Passenger passenger;
	private final CostMap finalCostmap;
	private CostMap mutableCostMap;
	private AreaMap mutableAreaMap;
	private int scale;
	private int speedfactor;
	private int numbOfInterupts;
	private boolean alreadyStowed;
	private StopWatch stopwatch = new StopWatch();
	private ArrayList<Path> pathlist = new ArrayList<Path>();

	private AgentMood agentMood;
	private boolean exitTheMainLoop = false;

	private static final Boolean DEVELOPER_MODE = false;

	/**
	 * This method constructs an agent.
	 * 
	 * @param passenger
	 *            the passenger which is represented by the agent
	 * @param start
	 *            the starting vector
	 * @param goal
	 *            the goal vector
	 * @param scale
	 *            the scale of the simulation
	 */
	public Agent(Passenger passenger, Vector start, Vector goal, int scale,
			int speedFactor, CostMap costmap) {
		this.speedfactor = speedFactor;
		this.passenger = passenger;
		this.start = start;
		this.goal = goal;
		this.scale = scale;
		this.finalCostmap = costmap;

		if (passenger.getPassengerMood() == PassengerMood.AGRESSIVE) {
			this.agentMood = new AggressiveMood(this);
		} else if (passenger.getPassengerMood() == PassengerMood.PASSIVE) {
			this.agentMood = new PassiveMood(this);
		}
	}

	/**
	 * This method returns the starting point vector.
	 * 
	 * @return the start vector
	 */
	public Vector getStart() {
		return start;
	}

	/**
	 * This method returns the goal point.
	 * 
	 * @return the goal point vector
	 */
	public Vector getGoal() {
		return goal;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 * 
	 * @return the rotation in degrees.
	 */
	private int getRotation() {

		/* get the angle in radian from -Pi to Pi, so zero is EAST */
		double theta = Math.atan2(
				desiredPosition.getY() - currentPosition.getY(),
				desiredPosition.getX() - currentPosition.getX());

		/* rotate the angle by 90 degrees so that zero is NORTH */
		theta += Math.PI / 2.0;

		/* transform from radian to degree */
		int angle = (int) Math.toDegrees(theta);

		/* if degree is smaller than 0, convert it */
		if (angle < 0) {
			angle += 360;
		}
		return angle;
	}

	/**
	 * This method returns if the passenger is ready to stow his luggage
	 * 
	 * @return if the passenger is ready to stow luggage
	 */
	private boolean passengerStowsLuggage() {

		/* get the passengers seat */
		Seat seat = passenger.getSeatRef();

		/*
		 * return true if the passenger does have luggage and if he is near his
		 * seat
		 */
		return (passenger.isHasLuggage())
				&& (desiredPosition.getY() == (int) (seat.getYPosition()
						/ scale - 5));
	}

	/**
	 * This method occupies a specific area whithin the area map.
	 * 
	 * @param vector
	 *            the vector with the location
	 * @param occupy
	 *            boolean which decides if the area will be blocked or unblocked
	 */
	private void occupyNode(Vector vector, boolean occupy) {

		/* use monitor so that only one thread can occupy a node at a time */
		synchronized (vector) {
			RunAStar.getMap().getNode(vector).setOccupiedByAgent(occupy);
		}
	}

	/**
	 * When there is a new path found, this method cuts the old path up to the
	 * current point so that there is no overlapping with the new path but
	 * instead a matching complete path.
	 */
	public void redefinePathLayout() {

		/* get the path used by the agent before finding a new one. */
		Path pathhelper = pathlist.get(pathlist.size() - 1);

		/* then remove that path */
		pathlist.remove(pathhelper);

		/* cut the path up to the current location */
		pathhelper = pathhelper.cutToPoint(pathhelper, currentPosition);

		/* add the path back to the list */
		pathlist.add(pathhelper);

		/* add the newly calculated path as well */
		pathlist.add(path);
	}

	/**
	 * This method takes a cost map and adds a huge cost to the location and the
	 * area around agents. The agent triggering this method is ignored.
	 */
	private void updateCostmap() {

		/* The cost map is flooded from the agents current location to his seat */
		CostMap costmap = new CostMap(mutableAreaMap.getDimensions(), start,
				mutableAreaMap, false, this, true);

		/* the cost map is then assigned to the mutable global cost map */
		mutableCostMap = costmap;

		/*
		 * define the square dimension around the passenger that should be
		 * scanned. This is the dimension in each direction from the middle!
		 */

		int squareDimension = 10;

		/* then there is cost assigned to an area around the other agents */
		for (int xCoordinate = currentPosition.getX() - squareDimension; xCoordinate < currentPosition
				.getX() + squareDimension; xCoordinate++) {
			for (int yCoordinate = currentPosition.getY() - squareDimension; yCoordinate < currentPosition
					.getY() + squareDimension; yCoordinate++) {

				/* prevent out of bounds exceptions */
				if (xCoordinate > 0 && yCoordinate > 0) {

					/* find all nodes occupied by agents */
					if (mutableAreaMap.getNodeByCoordinate(xCoordinate,
							yCoordinate).isOccupiedByAgent()) {

						/*
						 * additionally to the surrounding points of the agents,
						 * there is also cost generated in the area in front of
						 * an agent. This is used to make the agent overtake
						 * easier
						 */
						for (int stepsAhead = 0; stepsAhead < 6; stepsAhead++) {

							/* the current agents position is excluded here! */
							if (!FuncLib.vectorsAreEqual(
									mutableAreaMap.getNodeByCoordinate(
											xCoordinate, yCoordinate)
											.getPosition(), currentPosition)) {

								/* the surrounding points are calculated */
								for (Vector point : mutableCostMap
										.getSurroundingPoints(xCoordinate,
												yCoordinate + stepsAhead)) {

									/* the surrounding costs are assigned */
									mutableCostMap.setPublicCost(point.getX(),
											point.getY(), 5000);
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * This method finds a new path. The <b>finalCostmap</b> is needed so that
	 * there is no overlapping of different agent positions over time. The cost
	 * map is always modified based on the non-editable final cost map
	 * calculated at the beginning.
	 */
	public void findNewPath() {

		/* starts the StopWatch - used for performance testing */
		stopwatch.start();

		/* reset the mutable CostMap to the original cost map */
		mutableCostMap = finalCostmap;

		/* save a "screenshot" of the AreaMap for further calculations */
		mutableAreaMap = RunAStar.getMap();

		/* this is only run if its not the initial path finding process */
		if (currentPosition != null) {

			/* print out the area map when in developer mode */
			if (DEVELOPER_MODE) {
				mutableAreaMap.printMap();
			}

			/* this sets the new start of the A* to the current position */
			start = currentPosition;

			/* this declares the area around agents as high cost terrain */
			updateCostmap();
		}

		/* run the path finding algorithm */
		AStar astar = new AStar(mutableAreaMap, mutableCostMap, this);

		/* retrieve the path information */
		path = astar.getBestPath();

		/*
		 * print the newly generated cost map including the path when in
		 * developer mode
		 */
		if (currentPosition != null && DEVELOPER_MODE) {
			mutableCostMap.printMapPathToConsole(path, mutableAreaMap, this);
		}

		/* setting the new desired and current positions */
		desiredPosition = path.get(0).getPosition();
		currentPosition = new Vector2D(0, 0);

		/* ends the stop watch performance logging */
		stopwatch.stop();
		System.out.println(stopwatch.getElapsedTime() + " ms for pathfinding");
	}

	/**
	 * This method returns the current position of the agent
	 * 
	 * @return the current position
	 */
	public Vector getPosition() {
		return currentPosition;
	}

	/**
	 * 
	 * @return
	 */
	private boolean goalReached() {
		return FuncLib.vectorsAreEqual(desiredPosition, goal);
	}

	/**
	 * 
	 * @param vector
	 * @return
	 */
	private boolean nodeBlocked(Vector vector) {
		return RunAStar.getMap().getNode(vector).isOccupiedByAgent();
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Path> getPathList() {
		return pathlist;
	}

	/**
	 * 
	 */
	private void followPath() {
		mainloop: try {
			int i = 0;
			while (i < path.getLength()) {
				if (i != 0) {
					currentPosition = path.get(i - 1).getPosition();
				}

				// if (numbOfInterupts > 20 && agentMood instanceof PassiveMood)
				// {
				// agentMood = new AggressiveMood(this);
				// System.out.println("NOW I AM ANGRY!");
				// }
				desiredPosition = path.get(i).getPosition();
				if (nodeBlocked(desiredPosition)) {
					numbOfInterupts++;
					occupyNode(currentPosition, false);
					occupyNode(desiredPosition, false);
					Situation collision = new Situation(agentMood);
					collision.handleCollision();
					if (exitTheMainLoop) {
						System.out.println(passenger.getName()
								+ " searching for new path ...");
						redefinePathLayout();
						break mainloop;
					}
				} else if (passengerStowsLuggage() && !alreadyStowed) {
					RunAStar.getMap().getNode(currentPosition)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(desiredPosition)
							.setOccupiedByAgent(true);
					occupyNode(desiredPosition, true);
					Thread.sleep((int) (passenger.getLuggageStowTime() * 1000 / 2 / speedfactor));
					occupyNode(desiredPosition, false);
					alreadyStowed = true;
					i++;
				} else {
					/* if the agent's path is not blocked, move forward */
					RunAStar.getMap().getNode(currentPosition)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(desiredPosition)
							.setOccupiedByAgent(true);
					occupyNode(currentPosition, false);
					occupyNode(desiredPosition, true);
					try {
						passenger.setPositionX(desiredPosition.getX() * scale);
						passenger.setPositionY(desiredPosition.getY() * scale);
						passenger.setOrientationInDegree(getRotation());
					} catch (ConcurrentModificationException e) {
						System.out
								.println("Concurrent modification exception!");
					}

					Thread.sleep((int) (1000 / speedfactor / (passenger
							.getWalkingSpeed() * 100 / scale)));
					i++;
				}
			}
		} catch (InterruptedException e) {
			this.getThread().interrupt();
			System.out.println("thread is now interrupted");
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isExitPathLoop() {
		return exitTheMainLoop;
	}

	/**
	 * 
	 * @param exitPathLoop
	 */
	public void setExitPathLoop(boolean exitPathLoop) {
		this.exitTheMainLoop = exitPathLoop;
	}

	/**
	 * This method runs the agents walking simulation.
	 */
	public void run() {
		try {
			/* TODO: CAUTION! This needs to be removed again!!!!! */
			agentMood = new AggressiveMood(this);
			/* **************************************************** */
			currentPosition = start;
			alreadyStowed = false;
			pathlist.add(path);
			Thread.sleep((int) (passenger.getStartBoardingAfterDelay() * 1000 / speedfactor));
			stopwatch.start();
			numbOfInterupts = 0;
			while (!goalReached()) {
				followPath();
			}
			occupyNode(desiredPosition, false);
			passenger.setIsSeated(true);
			stopwatch.stop();
			passenger
					.setBoardingTime((int) (stopwatch.getElapsedTime() / 1000 * speedfactor));
			passenger.setNumberOfWaits(numbOfInterupts);
			RunAStar.setPassengerSeated(passenger, this);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("thread got an error");
		}
	}

	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (getThread() == null) {
			setThread(new Thread(this, passenger.getName()));
			getThread().start();
		}
	}

	/**
	 * This method returns the thread.
	 * 
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * This method sets the thread.
	 * 
	 * @param thread
	 *            the thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

}