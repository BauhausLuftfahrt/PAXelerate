/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * This class runs and handles the a star algorithm an simulation.
 * 
 * @author marc.engelmann
 *
 */
public class RunAStar {
	private static Cabin cabin;
	private static Boolean simulationDone = false;
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	private Logger console = new Logger();
	private static AreaMap areamap;
	private CostMap costmap;
	private static ArrayList<Agent> agentList = new ArrayList<Agent>();
	private StopWatch anotherStopwatch = new StopWatch();
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
		this.dimensions = dimensions;
		console.addToLog("Cabin initializing...");
		areamap = new AreaMap(dimensions, obstaclemap);
		RunAStar.cabin = cabin;
		run();
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
	 * This method sets the value for simulationDone.
	 * 
	 * @param bool
	 *            is the boolean
	 */
	public static void setSimulationDone(Boolean bool) {
		simulationDone = bool;
	}

	/**
	 * This method returns whether the simulation is already completed or not.
	 * 
	 * @return simulationDone
	 */
	public static Boolean isSimulationDone() {
		return simulationDone;
	}

	public static ArrayList<Agent> getAgentList() {
		return agentList;
	}

	/**
	 * This method signals that a passengers has found his seat. This is done by
	 * adding him to the finishedList ArrayList element.
	 * 
	 * @param passenger
	 *            is the passenger
	 */
	public static void setPassengerSeated(Passenger passenger, Agent agent) {
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
		costmap = null;
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

			if (doItOnce) {
				/* This line generates a costmap which is used for all agents */
				costmap = new CostMap(dimensions, start, areamap, false, null,
						false);
				costmap.saveMapToFile();
				doItOnce = false;
			}

			Agent agent = new Agent(passenger, start, goal, cabin.getScale(),
					cabin.getSpeedFactor(), costmap);

			// list of all agents
			agentList.add(agent);
		}
		anotherStopwatch.start();
		/* First generate all paths ... */
		int i = 1;
		for (Agent agent : agentList) {
			console.addToLog("path calculation (" + i + "/" + agentList.size()
					+ ")");
			agent.findNewPath();
			i++;
		}
		anotherStopwatch.stop();
		System.out.println("Calculations completed in: "
				+ anotherStopwatch.getElapsedTime() + " ms");

		/* ... then start the simulations simultaneously */
		for (Agent agent : agentList) {
			agent.start();
		}
	}
}
