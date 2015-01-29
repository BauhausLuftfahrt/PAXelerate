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
	private int[][] path;

	private Vector start = new Vector(0, 0);
	private Vector goal = new Vector(0, 0);
	private Vector current = new Vector(0, 0);
	private Vector previous = new Vector(0, 0);

	private Passenger passenger;
	private int scale;
	private int speedfactor;
	private int numbOfInterupts;
	private boolean alreadyStowed;
	private static StopWatch stopwatch = new StopWatch();

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
	 * This method sets the path of the agent.
	 * 
	 * @param path
	 *            the path
	 */
	public void setPath(int[][] path) {
		this.path = path;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 * 
	 * @return the rotation in degrees.
	 */
	private int getRotation() {
		/* get the angle in radian from -Pi to Pi, so zero is EAST */
		double theta = Math.atan2(current.getY() - previous.getY(),
				current.getX() - previous.getX());
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
				&& (current.getY() == (int) (seat.getYPosition() / scale - 5));
	}

	/**
	 * This method occupies a specific area whithin the area map.
	 * 
	 * @param vector
	 *            the vector with the location
	 * @param occupy
	 *            boolean which decides if the area will be blocked or unblocked
	 */
	private void occupyArea(Vector vector, boolean occupy) {
		RunAStar.getMap().getNodeByCoordinate(vector.getX(), vector.getY())
				.setOccupiedByAgent(occupy);
	}

	/**
	 * This method waits until the path is clear.
	 */
	private void waitUntilPathIsClear() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method finds the way around an obstacle.
	 */
	private void findWayAroundObstacle() {
		findNewPath();
	}

	private void findNewPath() {
		CostMap costmap = new CostMap(RunAStar.getMap().getDimensions(),
				current, RunAStar.getMap(), false, this);
		costmap.printMapToConsole();
		occupyArea(current, false);
		start.setTwoDimensional(current.getX(), current.getY());
		current.setTwoDimensional(0, 0);
		previous.setTwoDimensional(0, 0);
		
		AStar pathFinder = new AStar(RunAStar.getMap(), costmap);
		pathFinder.calculateShortestPath(start, goal);
	    setPath(getPathCoordinates(pathFinder.getShortestPath()));
	    
	}
	
	private static int[][] getPathCoordinates(Path shortestPath) {
		int[][] pathCoordinates = new int[shortestPath.getLength()][2];
		for (int i = 0; i < shortestPath.getLength(); i++) {
			pathCoordinates[i] = shortestPath.getWayPoint(i).getPosition()
					.getValue();
		}
		return pathCoordinates;
	}
	
	public Vector getPosition() {
		return current;
	}
	
	private boolean goalReached() {
		return FunctionLibrary.vectorsAreEqual(current, goal);
	}

	private boolean willingToTakeDetour() {
		return true;
	}

	private boolean nodeBlocked(Vector vector) {
		return RunAStar.getMap().getNode(vector).isOccupiedByAgent();
	}

	private void followPath() {
		try {
			int i = 0;
			while (i < path.length) {
				if (i != 0) {
					this.previous.setFromPoint(path[i - 1]);
				}
				this.current.setFromPoint(path[i]);

				if (nodeBlocked(current)) {
					numbOfInterupts++;
					// if (willingToTakeDetour()) {
					findWayAroundObstacle();
					break;
					// } else {
					// waitUntilPathIsClear();
				} else if (passengerStowsLuggage() && !alreadyStowed) {
					RunAStar.getMap().getNode(previous)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(current).setOccupiedByAgent(true);
					occupyArea(current, true);
					Thread.sleep((int) (passenger.getLuggageStowTime() * 1000 / 2 / speedfactor));
					occupyArea(current, false);
					alreadyStowed = true;
					i++;
				} else {
					/* if the agent's path is not blocked, move forward */
					RunAStar.getMap().getNode(previous)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(current).setOccupiedByAgent(true);
					occupyArea(previous, false);
					occupyArea(current, true);

					passenger.setPositionX(current.getX() * scale);
					passenger.setPositionY(current.getY() * scale);
					passenger.setOrientationInDegree(getRotation());
					Thread.sleep((int) (1000 / speedfactor / (passenger
							.getWalkingSpeed() * 100 / scale)));
					i++;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
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

			while(!goalReached()) {
			followPath();
			}

			RunAStar.getMap().getNode(current).setOccupiedByAgent(false);
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
	 * This method interrupts the thread.
	 */
	public void interrupt() {
		if (getThread() != null) {
			getThread().interrupt();
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