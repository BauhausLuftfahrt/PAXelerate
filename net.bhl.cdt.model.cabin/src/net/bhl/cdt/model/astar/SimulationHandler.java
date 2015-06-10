/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.AboutView;
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

	private Logger console = new Logger();
	private static AreaMap areamap;
	private static CostMap costmap;
	private static ArrayList<Agent> agentList = new ArrayList<Agent>();
	private static ArrayList<Integer> grantedAccess = new ArrayList<Integer>();
	private static StopWatch anotherStopwatch = new StopWatch();
	private Vector dimensions;

	public static final boolean DEVELOPER_MODE = false;

	public static final boolean SHOW_AREAMAP_ANIMATION = true;

	private static JFrame frame;

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
		areamap = new AreaMap(dimensions, obstaclemap);
		SimulationHandler.cabin = cabin;
		run();
	}

	public static int getNumberOfSeatedPassengers() {
		return finishedList.size();
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

	public static Cabin getCabin() {
		return cabin;
	}

	public static CostMap getCostMap() {
		return costmap;
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
	public static void setPassengerSeated(Passenger passenger, boolean setSeated) {
		if (setSeated) {
			finishedList.add(passenger);
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
	public Cabin getPassengerLocations() {
		return cabin;
	}

	public static void launchWaymakingAgent(Passenger pax, Passenger myself) {
		Seat seat = pax.getSeatRef();

		Vector goal = new Vector2D((int) (cabin.getCabinWidth()
				/ cabin.getScale() / 2.0),
				(int) (seat.getYPosition() / cabin.getScale()) + 5);

		Vector start = new Vector2D(
				(int) ((seat.getXPosition() + seat.getXDimension() / 2) / cabin
						.getScale()),
				(int) ((seat.getYPosition() / cabin.getScale()) - 2));

		Agent agent = new Agent(pax, start, goal,
				SimulationHandler.getCostMap(), Agent.agentMode.MAKE_WAY,
				myself);
		agent.findNewPath();
		agent.start();
		pax.setNumberOfMakeWayOperations(pax.getNumberOfMakeWayOperations() + 1);
	}

	public static void setAgentList(ArrayList<Agent> agentList) {
		SimulationHandler.agentList = agentList;
	}

	public static int getNumberOfPassengersInCabin() {
		return activeList.size();
	}

	public synchronized static boolean CabinAccessGranted(Agent agent) {
		if (!grantedAccess.isEmpty()) {
			if (grantedAccess.get(grantedAccess.size() - 1) < anotherStopwatch
					.getElapsedTime() - 2000) {
				// System.out.println(anotherStopwatch.getElapsedTime() - 2000
				// + " > " + grantedAccess.get(grantedAccess.size() - 1)
				// + " ?");
			} else {
				return false;
			}
		}
		grantedAccess.add((int) anotherStopwatch.getElapsedTime());
		// FuncLib.printIntegerListToLog(grantedAccess);
		System.out.println("Access for agent " + agent.getPassenger().getId()
				+ " was granted at " + FuncLib.getCurrentTimeStamp() + ".");
		return true;
	}

	private static Agent getAgentByPassengerID(int id) {
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

	public static void sleepAgent(int duration, Passenger passenger) {
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
					Agent.agentMode.GO_TO_SEAT, null);

			// list of all agents
			agentList.add(agent);
		}

		/* First generate all paths ... */
		int i = 1;
		for (Agent agent : agentList) {
			console.addToLog("path calculation (" + i + "/" + agentList.size()
					+ ")");
			agent.findNewPath();
			i++;
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

	private void runAreaMapWindow() {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				AboutView view = new AboutView();
				view.setAreamap(areamap);

				frame = new JFrame("Area Map Rendering");
				frame.setContentPane(view);
				frame.pack();
				frame.setVisible(true);
				// frame.setResizable(false);
			}
		});

		final Thread gameThread = new Thread() {

			public void run() {
				while (true) {
					try {
						// view.setAreamap(RunAStar.getMap());
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start(); // Callback run()

	}

}
