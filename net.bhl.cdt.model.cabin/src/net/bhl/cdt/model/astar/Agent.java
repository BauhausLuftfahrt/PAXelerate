/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.observer.Subject;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Agent extends Subject implements Runnable {
	private Thread thread;
	private String agentName;
	private int[][] path;

	private Vector start = new Vector(0, 0);
	private Vector goal = new Vector(0, 0);
	private Vector current = new Vector();
	private Vector previous = new Vector();

	private Passenger passenger;
	private int scale;
	private boolean alreadyStowed;
	private static StopWatch stopwatch = new StopWatch();
	private int[][] currentAgentPosition = new int[1][2];

	/**
	 * 
	 * @param name
	 * @param passenger
	 * @param start
	 * @param goal
	 * @param scale
	 */
	Agent(String name, Passenger passenger, Vector start, Vector goal, int scale) {
		this.passenger = passenger;
		this.agentName = name;
		this.start = start;
		this.goal = goal;
		this.scale = scale;
		this.currentAgentPosition[0] = start.getValue();

	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public int[][] getPath() {
		return path;
	}

	public Vector getStart() {
		return start;
	}

	public Vector getGoal() {
		return goal;
	}

	public void setPath(int[][] path) {
		this.path = path;
	}

	public int[][] getCurrentAgentPosition() {
		return currentAgentPosition;
	}

	public void setCurrentAgentPosition(int[][] currentAgentPosition) {
		this.currentAgentPosition = currentAgentPosition;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45° steps. North is 0°.
	 * 
	 * @param xWay
	 * @param yWay
	 * @return
	 */
	public int getRotation() {

		int xWay = (current.getX() - previous.getX());
		int yWay = (current.getY() - previous.getY());
		if (xWay > 0) {
			if (yWay == 0) {
				return 90;
			}
			if (yWay < 0) {
				return 45;
			}
			if (yWay > 0) {
				return 135;
			}
		} else if (xWay < 0) {

			if (yWay > 0) {
				return 225;
			}
			if (yWay < 0) {
				return 315;
			}
		} else if (xWay == 0) {
			if (yWay == 0) {
				return 0;
			}
			if (yWay > 0) {
				return 180;
			}
			if (yWay < 0) {
				return 0;
			}
		} 
		return 0;
	}

	private boolean passengerStowsLuggage() {
		Seat seat = passenger.getSeatRef();
		return (passenger.isHasLuggage())
				&& (current.getY() == (int) (seat.getYPosition() / scale - 5));
	}

	private void occupyArea(Vector vector, boolean occupy) {
		Seat seat = ModelHelper.getChildrenByClass(RunAStar.getCabin(),
				Seat.class).get(0);
		if (vector.getY() > (seat.getYPosition() / RunAStar.getCabin().getScale())) {
			int width = 0;
			for (int x = -width; x <= width; x++) {
				// for (int y = -square; y<0; y++) {
				// if(!(x==0&&y==0)) {
				if ((vector.getX() + x) > 0) {// &&(yLoc+y)>0) {
					RunAStar.getMap()
							.getNodeByCoordinate(vector.getX() + x,
									vector.getY()).setOccupiedByAgent(occupy);
				}
				// }
				// }
			}
		} else {
			RunAStar.getMap().getNode(vector).setOccupiedByAgent(occupy);
		}
	}

	/**
	 * 
	 */
	public void waitUntilPathIsClear() {

		// TODO: implement functionality to wait until e.g. passenger who is
		// blocking
		// path has cleared the path
	}

	/**
	 * 
	 */
	public void findWayAroundObstacle() {

		// TODO: implement functionality to find a way around e.g. the passenger
		// who is blocking the path
	}

	private boolean nodeBlocked(Vector vector) {
		return RunAStar.getMap().getNode(vector).isOccupiedByAgent();
	}

	/**
	 * 
	 */
	public void run() {
		try {
			alreadyStowed = false;
			Thread.sleep((int) (passenger.getStartBoardingAfterDelay() * 1000));
			stopwatch.start();
			this.currentAgentPosition = new int[path.length][2];
			RunAStar.submitPath(path);
			
			int numbOfInterupts = 0;
			int i = 0;
			
			while (i < path.length) {
				if (i != 0) {
					this.previous.setFromPoint(path[i - 1]);
				}
				this.current.setFromPoint(path[i]);

				if (nodeBlocked(current)) {

					// this.waitUntilPathIsClear()
					// or
					// this.findWayAroundObstacle()

					Thread.sleep(200);
					numbOfInterupts++;
				} else if (passengerStowsLuggage() && !alreadyStowed) {
					RunAStar.getMap().getNode(previous)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(current).setOccupiedByAgent(true);
					occupyArea(current, true);
					Thread.sleep((int) (passenger.getLuggageStowTime() * 1000 / 2));
					occupyArea(current, false);
					alreadyStowed = true;
					i++;
				} else {

					// if the agent's path is not blocked, move forward
					RunAStar.getMap().getNode(previous)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNode(current).setOccupiedByAgent(true);
					occupyArea(previous, false);
					occupyArea(current, true);
					this.currentAgentPosition[i] = this.current.getValue();

					passenger.setPositionX(this.currentAgentPosition[i][0]
							* scale);
					passenger.setPositionY(this.currentAgentPosition[i][1]
							* scale);
					passenger.setOrientationInDegree(getRotation());
					Thread.sleep((int) (1000 / (passenger.getWalkingSpeed() * 100 / scale)));
					i++;
				}
			}
			RunAStar.getMap().getNode(current).setOccupiedByAgent(false);
			passenger.setIsSeated(true);
			RunAStar.setPassengerSeated(passenger);
			stopwatch.stop();
			passenger.setBoardingTime(stopwatch.getElapsedTime() / 1000);
			passenger.setNumberOfWaits(numbOfInterupts);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void start() {
		if (getT() == null) {
			setT(new Thread(this, agentName));
			getT().start();
		}
	}

	/**
	 * 
	 * @return
	 */
	public Thread getT() {
		return thread;
	}

	/**
	 * 
	 * @param t
	 */
	public void setT(Thread t) {
		this.thread = t;
	}

}