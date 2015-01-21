/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * This class runs and handles the a star algorithm an simulation.
 * @author marc.engelmann
 *
 */
public class RunAStar {
	private static Cabin cabin;
	private static Boolean simulationDone = false;
	private ObstacleMap obstaclemap;
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	private static Logger console = new Logger();
	private static AreaMap areamap;
	private CostMap costmap;
	private static ArrayList<Agent> agents = new ArrayList<Agent>();
	private static ArrayList<int[][]> pathList = new ArrayList<int[][]>();
	private static StopWatch stopwatch = new StopWatch();
	private static StopWatch anotherStopwatch = new StopWatch();
	private Vector initialStart;
	private Vector dimensions;
	

	/**
	 * This method constructs the RunAStar algorithm.
	 * 
	 * @param obstaclemap
	 *            is the obstacle map
	 * @param dimensions
	 *            is the dimension vector
	 * @param cabin
	 *            is the cabin
	 */
	public RunAStar(ObstacleMap obstaclemap, Vector dimensions, Cabin cabin) {
		this.obstaclemap = obstaclemap;
		this.dimensions = dimensions;
		console.addToLog("Cabin initializing...");
		areamap = new AreaMap(dimensions, obstaclemap);
		RunAStar.cabin = cabin;
		run();
	}

	/**
	 * This method gets the calculated shortest path.
	 * 
	 * @param areamap
	 *            is the area map
	 * @param agent
	 *            is the specific agent
	 * @return returns the shortest path
	 */
	public int[][] getPath(AreaMap areamap, Agent agent) {
		stopwatch.start();
		AStar pathFinder = new AStar(areamap,costmap);
		console.addToLog("Calculating shortest path...");
		pathFinder.calcShortestPath(agent.getStart(), agent.getGoal());
		stopwatch.stop();
		Path shortestPath = pathFinder.getShortestPath();
		if (shortestPath == null) {
			console.addToLog("No path found.");
		}
		agent.setPath(getPathCoordinates(pathFinder.getShortestPath()));
		return getPathCoordinates(pathFinder.getShortestPath());
	}

	/**
	 * This method transforms the shortest path into coordinates.
	 * 
	 * @param shortestPath
	 *            is the shortest path
	 * @return returns the coordinates of the path
	 */
	public static int[][] getPathCoordinates(Path shortestPath) {
		int[][] pathCoordinates = new int[shortestPath.getLength()][2];
		for (int i = 0; i < shortestPath.getLength(); i++) {
			pathCoordinates[i] = shortestPath.getWayPoint(i).getPosition().getValue();		
		}
		return pathCoordinates;
	}

	/**
	 * This method returns the area map.
	 *
	 * @return the area map
	 */
	public static AreaMap getMap() {
		return areamap;
	}

	/**
	 * This method runs the agents.
	 */
	public  void runAgents() {

		anotherStopwatch.start();

		/** First generate all paths ... */
		for (Agent agent : agents) {
			getPath(areamap, agent);
		}
		anotherStopwatch.stop();
		System.out.println("Calculations completed in: "
				+ anotherStopwatch.getElapsedTime() + " ms");

		/** ... then start the simulations simultaneously */
		for (Agent agent : agents) {
			agent.start();
		}
	}

	/**
	 * This method sets the value for simulationDone.
	 * 
	 * @param bool
	 *            is the boolean
	 */
	public static void setSimulationDone(Boolean bool) {
		simulationDone = bool;
	}

	/**
	 * This method submits the whole cabin.
	 * 
	 * @return the cabin
	 */
	public static Cabin getCabin() {
		return cabin;
	}

	/**
	 * This method returns whether the simulation is already completed or not.
	 * 
	 * @return simulationDone
	 */
	public static Boolean getSimulationDone() {
		return simulationDone;
	}

	/**
	 * This method saves the path object to the pathList element.
	 * 
	 * @param path
	 *            the specific path
	 */
	public static void submitPath(int[][] path) {
		pathList.add(path);
	}

	/**
	 * This method returns an array of the path list.
	 * 
	 * @return the paths in a list
	 */
	public static ArrayList<int[][]> getPathList() {
		return pathList;
	}

	/**
	 * This method signals that a passengers has found his seat. This is done by
	 * adding him to the finishedList ArrayList element.
	 * 
	 * @param passenger
	 *            is the passenger
	 */
	public static void setPassengerSeated(Passenger passenger) {
		finishedList.add(passenger);
		if (finishedList.size() == cabin.getPassengers().size()) {
			setSimulationDone(true);
		}

	}

	/**
	 * This method returns the passenger locations.
	 * 
	 * @return This is done by submitting the whole cabin.
	 */
	public Cabin getPassengerLocations() {
		return cabin;
	}

	/**
	 * This method executes the path finding simulation of the agents.
	 */
	public void run() {

		// iterate through the openCDT passenger list and create agents based on
		// passenger information
		Boolean doItOnce = true;
		for (Passenger passenger : ModelHelper.getChildrenByClass(cabin,
				Passenger.class)) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Vector start = new Vector(0,
					(int) ((door.getYPosition() + door.getWidth() / 2) / cabin
							.getScale()));
			Vector goal = new Vector(
					(int) ((seat.getXPosition() + seat.getXDimension() / 2) / cabin
							.getScale()), (int) ((seat.getYPosition() / cabin
							.getScale()) - 1));
			if(doItOnce) {
				initialStart = start;
				doItOnce = false;
			}
			Agent agent = new Agent(passenger, start, goal, (int) cabin.getScale());
			// list of all agents
			agents.add(agent);
		}

		costmap = new CostMap(dimensions, initialStart, areamap,false);
		costmap.printMap(); 
		
		// iterate through the list of all agents, calculate each agent's path,
		// then start the thread of each agent.
		runAgents();

	}
}
