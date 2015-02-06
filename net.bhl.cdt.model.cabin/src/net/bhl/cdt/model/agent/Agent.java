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
	 * 
	 */
	private boolean passengerStowsLuggage() {
		Seat seat = passenger.getSeatRef();
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

		// use monitor so that only one thread can occupy a node at a time
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
		Path pathhelper = pathlist.get(pathlist.size() - 1);
		pathlist.remove(pathhelper);
		pathhelper = pathhelper.cutToPoint(pathhelper, currentPosition);
		pathlist.add(pathhelper);
		pathlist.add(path);
	}

	/**
	 * This method takes a cost map and adds a huge cost to the location and the
	 * area around agents. The agent triggering this method is ignored.
	 * 
	 * @param costmap
	 *            is the costmap
	 * @param areammapWithAgentPositions
	 *            is the area map with agents positions
	 * @param agent
	 *            is the agent triggering this method
	 * @return the modified cost map
	 */
	private void updateCostmap() {
		for (int a = 0; a < mutableAreaMap.getDimensions().getX(); a++) {
			for (int b = 0; b < mutableAreaMap.getDimensions().getY(); b++) {
				if (mutableAreaMap.getNodeByCoordinate(a, b)
						.isOccupiedByAgent()) {
					// if (!FunctionLibrary.vectorsAreEqual(modifiedAreamap
					// .getNodeByCoordinate(a, b).getPosition(), agent
					// .getPosition())) {
					for (Vector point : mutableCostMap.getSurroundingPoints(a,
							b)) {
						mutableCostMap
								.setCost(point.getX(), point.getY(), 5000);
					}
					mutableCostMap.setCost(a, b, 5000);
					// }
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
		mutableCostMap = null;
		mutableCostMap = finalCostmap;

		/* save a "screenshot" of the AreaMap for further calculations */
		mutableAreaMap = null;
		mutableAreaMap = RunAStar.getMap();

		if (currentPosition != null) {
			/* this is only run if its not the initial path finding process */
			mutableAreaMap.printMap();

			/* this sets the new start of the A* to the current position */
			start = currentPosition;

			/* this declares the area around agents as high cost terrain */
			updateCostmap();
		}

		/* run the path finding algorithm */
		AStar astar = new AStar(mutableAreaMap, mutableCostMap, this);

		/* retrieve the path information */
		path = astar.getBestPath();

		if (currentPosition != null) {
			mutableCostMap.printMapPathToConsole(path, mutableAreaMap, this);
		}

		/* setting the new desired and current positions */
		desiredPosition = path.get(0).getPosition();
		currentPosition = new Vector(0, 0);

		/* ends the stop watch performance logging */
		stopwatch.stop();
		System.out.println(stopwatch.getElapsedTime() + " ms for pathfinding");
	}

	/**
	 * 
	 * @return
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