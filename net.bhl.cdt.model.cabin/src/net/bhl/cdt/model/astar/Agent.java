/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.FunctionLibrary;
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
	private Vector currentPosition;
	private Vector previousPosition;
	private Passenger passenger;
	private int scale;
	private int speedfactor;
	private int numbOfInterupts;
	private boolean alreadyStowed;
	private AreaMap areamapCopy;
	private StopWatch stopwatch = new StopWatch();

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
			int speedFactor) {
		this.speedfactor = speedFactor;
		this.passenger = passenger;
		this.start = start;
		this.goal = goal;
		this.scale = scale;
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
				currentPosition.getY() - previousPosition.getY(),
				currentPosition.getX() - previousPosition.getX());
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
				&& (currentPosition.getY() == (int) (seat.getYPosition()
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
			RunAStar.getMap().getNodeByCoordinate(vector.getX(), vector.getY())
					.setOccupiedByAgent(occupy);
		}
	}

	// /**
	// * This method waits until the path is clear.
	// */
	// private void waitUntilPathIsClear() {
	// try {
	// Thread.sleep(1);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }

	// /**
	// * This method finds the way around an obstacle.
	// */
	// private void findWayAroundObstacle() {
	// findNewPath(null);
	// }

	public void findNewPath(CostMap costmap) {
		AStar astar = null;
		Path bestPath = null;
		if (costmap == null) {
			CostMap newCostmap = new CostMap(areamapCopy.getDimensions(),
					previousPosition, areamapCopy, false, this);
			newCostmap.printMapToConsole();
			costmap = newCostmap;

			//this.start = previousPosition;
			// this.goal.setX(this.goal.getX());

			System.out.println("no costmap detected - new cost map mode");
			astar = new AStar(areamapCopy, costmap,this);

			/* error in following code line */
			bestPath = astar.calculateShortestPath();

			System.out.println("Found new path ..");
		} else {
			/* at first launch, the path begins at the door */
			astar = new AStar(RunAStar.getMap(), costmap,this);
			bestPath = astar.calculateShortestPath();
			System.out.println("Found initial path ..");
		}

		path = bestPath;
		System.out.println("Found new path.");
		currentPosition = path.get(0).getPosition();
		previousPosition = new Vector(0, 0);
	}

	public Vector getPosition() {
		return previousPosition;
	}

	private boolean goalReached() {
		return FunctionLibrary.vectorsAreEqual(currentPosition, goal);
	}

	// private boolean willingToTakeDetour() {
	// return true;
	// }

	private boolean nodeBlocked(Vector vector) {
		return RunAStar.getMap().getNode(vector).isOccupiedByAgent();
	}
	
	public Path getPath() {
		return path;
	}

	private void followPath() {
		mainloop: try {
			int i = 0;
			while (i < path.getLength()) {
				if (i != 0) {
					previousPosition = path.get(i-1).getPosition();
				}
				currentPosition = path.get(i).getPosition();
				if (nodeBlocked(currentPosition)) {
					/* bisher: calculate new path every time the path is blocked */
					numbOfInterupts++;
					areamapCopy = RunAStar.getMap();
					occupyNode(previousPosition, false);
					occupyNode(currentPosition, false);

					findNewPath(null);

					i = Integer.MAX_VALUE;
					break mainloop;
				} else if (passengerStowsLuggage() && !alreadyStowed) {
					RunAStar.getMap().getNode(previousPosition)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(currentPosition)
							.setOccupiedByAgent(true);
					occupyNode(currentPosition, true);
					Thread.sleep((int) (passenger.getLuggageStowTime() * 1000 / 2 / speedfactor));
					occupyNode(currentPosition, false);
					alreadyStowed = true;
					i++;
				} else {
					/* if the agent's path is not blocked, move forward */
					RunAStar.getMap().getNode(previousPosition)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(currentPosition)
							.setOccupiedByAgent(true);
					occupyNode(previousPosition, false);
					occupyNode(currentPosition, true);

					passenger.setPositionX(currentPosition.getX() * scale);
					passenger.setPositionY(currentPosition.getY() * scale);
					passenger.setOrientationInDegree(getRotation());
					Thread.sleep((int) (1000 / speedfactor / (passenger
							.getWalkingSpeed() * 100 / scale)));
					i++;
				}
			}
		} catch (InterruptedException e) {
		}
	}

	/**
	 * This method runs the agents walking simulation.
	 */
	public void run() {
		try {

			alreadyStowed = false;
			Thread.sleep((int) (passenger.getStartBoardingAfterDelay() * 1000 / speedfactor));
			stopwatch.start();
			numbOfInterupts = 0;
			while (!goalReached()) {
				System.out.println("Following new path now");
				followPath();
				System.out.println("reached end of path following.");
			}

			RunAStar.getMap().getNode(currentPosition)
					.setOccupiedByAgent(false);
			passenger.setIsSeated(true);
			stopwatch.stop();
			passenger
					.setBoardingTime((int) (stopwatch.getElapsedTime() / 1000 * speedfactor));
			passenger.setNumberOfWaits(numbOfInterupts);
			RunAStar.setPassengerSeated(passenger, this);
		} catch (InterruptedException e) {
			e.printStackTrace();
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