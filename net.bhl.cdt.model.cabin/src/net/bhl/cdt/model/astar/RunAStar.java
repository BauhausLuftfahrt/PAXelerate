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
import net.bhl.cdt.model.observer.AgentPosition;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * 
 * @author marc.engelmann
 *
 */
public class RunAStar {
	private static Vector mapDimensions = new Vector();
	private static Cabin cabin;
	private static Boolean simulationDone = false;
	private static int[][] obstacleMap = {};
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	private static Logger console = new Logger();
	private static AreaMap map;
	private static ArrayList<Agent> agents = new ArrayList<Agent>();
	private static ArrayList<int[][]> pathList = new ArrayList<int[][]>();

	/**
	 * This is the RunAStar constructor.
	 * @param obstaclemap is the obstacle map
	 * @param mapWidth is the map width
	 * @param mapHeight is the map height
	 * @param cabinHelp is the cabin that is submitted
	 */
	public RunAStar(int[][] obstaclemap, int mapWidth, int mapHeight,
			Cabin cabinHelp) {

		obstacleMap = obstaclemap;
		mapDimensions.setVectorFromCoordinates(mapWidth, mapHeight);
		console.addToLog("Cabin initializing...");
		map = new AreaMap(mapDimensions, obstacleMap);
		cabin = cabinHelp;
		run();
	}

	/**
	 * 
	 * @param map
	 */
	public static void setMap(AreaMap map) {
		RunAStar.map = map;
	}

	/**
	 * 
	 * @param map
	 * @param agent
	 * @return
	 */
	public static int[][] getPath(AreaMap map, Agent agent) {
		AStar pathFinder = new AStar(map);
		console.addToLog("Calculating shortest path...");
		pathFinder.calcShortestPath(agent.getStart(), agent.getGoal());
		Path shortestPath = pathFinder.getShortestPath();
		if (shortestPath == null) {
			console.addToLog("No path found.");
		}
		agent.setPath(getPathCoordinates(pathFinder.getShortestPath()));
		return getPathCoordinates(pathFinder.getShortestPath());
	}

	/**
	 * 
	 * @param shortestPath
	 * @return
	 */
	public static int[][] getPathCoordinates(Path shortestPath) {
		int[][] pathCoordinates = new int[shortestPath.getLength()][2];
		for (int i = 0; i < shortestPath.getLength(); i++) {
			pathCoordinates[i][0] = shortestPath.getWayPoint(i).getX();
			pathCoordinates[i][1] = shortestPath.getWayPoint(i).getY();
		}
		return pathCoordinates;

	}

	/**
	 * This method returns the current area map.
	 * 
	 * @return returns the area map
	 */
	public static AreaMap getMap() {
		return map;
	}

	/**
	 * 
	 * @param agent
	 */
	public static void addAgentToAgentList(Agent agent) {
		agents.add(agent);
	}

	/**
	 * 
	 * @return
	 */
	public static void runAgents() {
		/** First generate all paths ... */
		for (Agent agent : agents) {
			getPath(map, agent);
			AgentPosition pos = new AgentPosition();
			agent.subscribe(pos);
		}
		console.addToLog("All paths calculated successfully.");
		
		/** ... then start the simulations simultaneously */
		for (Agent agent : agents) {
			agent.start();
		}
	}

	public static void setSimulationDone(Boolean bool) {
		simulationDone = bool;
	}

	public static Cabin getCabin() {
		return cabin;
	}

	public static Boolean getSimulationDone() {
		return simulationDone;
	}

	public static void submitPath(int[][] path) {
		pathList.add(path);
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<int[][]> getPathList() {
		return pathList;
	}

	public static void setPassengerSeated(Passenger passenger) {
		finishedList.add(passenger);
		if (finishedList.size() == cabin.getPassengers().size()) {
			setSimulationDone(true);
		}

	}

	public Cabin getPassengerLocations() {
		return cabin;
	}

	public static void run() {
		for (Passenger passenger : ModelHelper.getChildrenByClass(cabin,
				Passenger.class)) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Vector start = new Vector(0,
					(int) ((door.getYPosition() + door.getWidth() / 2) / cabin
							.getScale()));
			Vector goal = new Vector((int) ((seat
					.getXPosition() + seat.getXDimension() / 2) / cabin
					.getScale()), (int) ((seat.getYPosition() / cabin
					.getScale()) - 1));
			Agent agent = new Agent("Passenger " + passenger.getName(),
					passenger, start, goal, (int) cabin.getScale());
			addAgentToAgentList(agent);
		}
		runAgents();

	}
}
