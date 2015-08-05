/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.agent.AgentFunctions;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.SimulationView;
import net.bhl.cdt.model.cabin.ui.ProgressHandler;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Logger;
import net.bhl.cdt.model.cabin.util.StopWatch;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;

/**
 * This class runs and handles the a star algorithm an simulation.
 * 
 * @author marc.engelmann
 *
 */
public class SimulationHandler {
	private static Cabin cabin;
	private static Boolean simulationDone = false;
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	private static ArrayList<Passenger> activeList = new ArrayList<Passenger>();
	private static ArrayList<Passenger> waymakingList = new ArrayList<Passenger>();

	private Logger console = new Logger();
	private static AreaMap areamap;
	private static CostMap costmap;
	private static ArrayList<Agent> agentList = new ArrayList<Agent>();
	private static HashMap<Passenger, Integer> accessPending = new HashMap<Passenger, Integer>();
	private static StopWatch anotherStopwatch = new StopWatch();
	private Vector dimensions;
	private static long latestSpawnTime = 0;

	public static final boolean DEVELOPER_MODE = false;

	public static final boolean SHOW_AREAMAP_ANIMATION = true;

	private static JFrame frame;
	private static ProgressHandler progress;
	private static int progressValue = 0;
	private static int percent = 0;

	// private static int grantedCounter = 0;

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
	public SimulationHandler(ObstacleMap obstaclemap, Vector dimensions,
			Cabin cabin) {
		this.dimensions = dimensions;
		console.addToLog("Cabin initializing...");
		areamap = new AreaMap(this.dimensions, obstaclemap);
		SimulationHandler.cabin = cabin;
		run();
	}

	public static int getNumberOfSeatedPassengers() {
		return finishedList.size();
	}

	public static void addToWaymakingList(Passenger pax) {
		System.out.println(pax.getId() + " added.");
		waymakingList.add(pax);
	}

	public static void removeFromWaymakingList(Passenger pax) {
		System.out.println(pax.getId() + " removed.");
		waymakingList.remove(pax);
	}

	public static boolean waymakingInRange(Passenger pax) {
		for (Passenger pass : waymakingList) {
			if (Math.abs(pass.getPositionY() - pax.getPositionY()) < 10) {
				System.out.println("Positive!");
				return true;
			}
		}
		return false;
	}

	/**
	 * This method returns the area map.
	 *
	 * @return the area map
	 */
	public static AreaMap getMap() {
		return areamap;
	}

	public static synchronized Agent getAgentByPassenger(Passenger pax) {
		for (Agent agent : agentList) {
			if (agent.getPassenger().getId() == pax.getId()) {
				return agent;
			}
		}
		return null;
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

	public static Cabin getCabin() {
		return cabin;
	}

	public static CostMap getCostMap() {
		return costmap;
	}

	public static synchronized void removePassenger(Passenger pax) {
		Agent agent = getAgentByPassenger(pax);
		agent.remove();
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

	public static synchronized void reset() {
		cabin = null;
		simulationDone = false;
		finishedList.clear();
		activeList.clear();

		areamap = null;
		costmap = null;
		agentList.clear();
		accessPending.clear();
		anotherStopwatch.reset();

		// dimensions = null;
		latestSpawnTime = 0;
		frame = null;
		progress = null;

		progressValue = 0;
		percent = 0;
		System.out.println("Simulation Handler resetted!");
	}

	/**
	 * This method signals that a passengers has found his seat. This is done by
	 * adding him to the finishedList ArrayList element.
	 * 
	 * @param passenger
	 *            is the passenger
	 */
	public static synchronized void setPassengerSeated(Passenger passenger,
			boolean setSeated) {
		if (setSeated) {
			if (!finishedList.contains(passenger)) {
				finishedList.add(passenger);
			}
		} else {
			finishedList.remove(passenger);
		}
		if (finishedList.size() == cabin.getPassengers().size()) {
			setSimulationDone(true);
			frame.dispose();
		}

	}

	/**
	 * This method returns the passenger locations.
	 * 
	 * @return This is done by submitting the whole cabin.
	 */
	public synchronized Cabin getPassengerLocations() {
		return cabin;
	}

	public static synchronized void launchWaymakingAgent(Passenger pax,
			Passenger myself) {
		Seat seat = pax.getSeatRef();

		int offset = 5;

		Vector start = new Vector2D(
				(int) ((seat.getXPosition() + seat.getXDimension() / 2) / cabin
						.getScale()),
				(int) ((seat.getYPosition() / cabin.getScale()) - 2));

		if (pax.getSeatRef().getYPosition() < pax.getDoor().getYPosition()) {
			offset = -(offset + 2);
			System.out.println("offset mirrored");
		}

		Vector goal = new Vector2D((int) (cabin.getCabinWidth()
				/ cabin.getScale() / 2.0),
				(int) (seat.getYPosition() / cabin.getScale()) + offset);

		Agent agent = new Agent(pax, start, goal,
				SimulationHandler.getCostMap(), Agent.AgentMode.MAKE_WAY,
				myself);
		agent.findNewPath();
		agent.start();
		pax.setNumberOfMakeWayOperations(pax.getNumberOfMakeWayOperations() + 1);

		System.out.println("Launching passenger " + pax.getId() + " from x:"
				+ start.getX() + ", y:" + start.getY() + " to x:" + goal.getX()
				+ ", y:" + goal.getY() + ".");
	}

	public static synchronized void setAgentList(ArrayList<Agent> agentList) {
		SimulationHandler.agentList = agentList;
	}

	public static synchronized int getNumberOfPassengersInCabin() {
		return activeList.size();
	}

	public synchronized static boolean CabinAccessGranted(Passenger pax) {

		/* register the passengers who want to enter the cabin */
		if (!accessPending.containsKey(pax)) {
			accessPending.put(pax, (int) anotherStopwatch.getElapsedTime());
		}

		// check if the requesting passenger is the longest waiting passenger.
		if (FuncLib.lowestValueInHashMap(pax, accessPending)) {

			// check if the neccessary time has passed.
			if (Math.abs(accessPending.get(pax)
					- anotherStopwatch.getElapsedTime()) > FuncLib
					.transformTime(0.1)) {

				// check if doorway is clear.
				if (!AgentFunctions.doorwayBlocked(pax)) {

					if (Math.abs(latestSpawnTime - System.currentTimeMillis()) > FuncLib
							.transformTime(0.3)) {
						accessPending.remove(pax);
						latestSpawnTime = System.currentTimeMillis();
						return true;
					}
				}
			}
		}
		return false;
	}

	private static synchronized Agent getAgentByPassengerID(int id) {
		for (Agent agentWhoIsIt : agentList) {
			if (agentWhoIsIt.getPassenger().getId() == id) {
				return agentWhoIsIt;
			}
		}
		return null;
	}

	public synchronized static void setPassengerActive(Passenger pax) {

		if (!FuncLib.PassengerAlreadyInList(pax, activeList)) {
			activeList.add(pax);
		}
	}

	public static synchronized void sleepAgent(int duration, Passenger passenger) {
		getAgentByPassengerID(passenger.getId()).interruptAgent(duration);
	}

	/**
	 * This method executes the path finding simulation of the agents.
	 */
	public void run() {
		anotherStopwatch.start();
		costmap = null;
		Boolean doItOnce = true;

		for (Passenger passenger : cabin.getPassengers()) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Vector start = new Vector2D(0,
					(int) ((door.getYPosition() + door.getWidth() / 2) / cabin
							.getScale()));
			Vector goal = new Vector2D(
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

			Agent agent = new Agent(passenger, start, goal, costmap,
					Agent.AgentMode.GO_TO_SEAT, null);

			// list of all agents
			agentList.add(agent);
		}

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				progress = new ProgressHandler(agentList.size());
				while (progressValue < agentList.size() - 1) {
					progress.reportProgress(progressValue);
					percent = percentage(progressValue, agentList.size());

					// TODO: real progress indications for calculation of cost
					// map could be implemented!

					if (percent <= 10) {
						progress.updateText("Initializing Path finding algorithms ...");
					} else if (percent <= 30) {
						progress.updateText("Creating the agent objects ...");
					} else if (percent <= 90) {
						progress.updateText("Calculating the paths for every passenger ...");
					} else {
						progress.updateText("Finishing calculations ...");
					}
				}
				progress.done();

			}
		});

		/* First generate all paths ... */
		// int i = 1;
		for (Agent agent : agentList) {
			// console.addToLog("path calculation (" + i + "/" +
			// agentList.size()
			// + ")");
			agent.findNewPath();
			// i++;
			progressValue++;

		}
		/* ... then start the simulations simultaneously */
		for (Agent agent : agentList) {
			agent.start();
			agent.setInitialized(true);
		}

		if (SHOW_AREAMAP_ANIMATION) {
			runAreaMapWindow();
		}
	}

	private int percentage(double now, double max) {
		return (int) ((now / max) * 100.0);
	}

	private void runAreaMapWindow() {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				SimulationView view = new SimulationView();
				view.setAreamap(areamap);

				frame = new JFrame("Simulation View");
				frame.setContentPane(view);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}

}
