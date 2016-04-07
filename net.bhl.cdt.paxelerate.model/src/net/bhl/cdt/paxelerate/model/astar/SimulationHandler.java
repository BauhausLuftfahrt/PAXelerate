/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.util.math.DecimalHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;
import net.bhl.cdt.paxelerate.util.toOpenCDT.ProgressHandler;

/**
 * This class runs and handles the a star algorithm an simulation.
 * 
 * @author marc.engelmann
 *
 */
public class SimulationHandler {

	private static Cabin cabin;

	private static Boolean simulationDone = false;

	private static AreamapHandler areamaphandler;

	/* Lists & Maps */

	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>(),
			activeList = new ArrayList<Passenger>(),
			waymakingList = new ArrayList<Passenger>();
	private static ArrayList<Agent> agentList = new ArrayList<Agent>();

	private static HashMap<Passenger, Integer> accessPending = new HashMap<Passenger, Integer>();
	private static HashMap<Door, Double> lastDoorRelease = new HashMap<Door, Double>();

	/* ************ */

	private static StopWatch watch = new StopWatch();
	private Vector dimensions;

	public static final boolean SHOW_AREAMAP_ANIMATION = true;

	private static ProgressHandler progress;

	private static int percent = 0, progressvalue = 0;

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
	public SimulationHandler(Vector dimensions, Cabin cabin) {
		this.dimensions = dimensions;
		Log.add(this, "Cabin initializing...");
		areamaphandler = new AreamapHandler(this.dimensions, cabin);
		SimulationHandler.cabin = cabin;
		run();
	}

	/**
	 * 
	 * @return
	 */
	public static int getNumberOfSeatedPassengers() {
		return finishedList.size();
	}

	/**
	 * 
	 * @param pax
	 */
	public static void addToWaymakingList(Passenger pax) {
		waymakingList.add(pax);
	}

	/**
	 * 
	 * @param pax
	 */
	public static void removeFromWaymakingList(Passenger pax) {
		waymakingList.remove(pax);
	}

	/**
	 * 
	 * @param pax
	 * @return
	 */
	public static boolean waymakingInRange(Passenger pax) {
		for (Passenger pass : waymakingList) {
			if (Math.abs(pass.getPositionY() - pax.getPositionY()) < 10) {
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
	public static Areamap getMap() {
		return areamaphandler.getAreamap();
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
	 * 
	 * @return
	 */
	public static Cabin getCabin() {
		return cabin;
	}

	/**
	 * 
	 * @param pax
	 */
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

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Agent> getAgentList() {
		return agentList;
	}

	/**
	 * 
	 */
	public static synchronized void reset() {

		cabin = null;
		simulationDone = false;
		finishedList.clear();
		activeList.clear();

		areamaphandler = null;
		agentList.clear();
		accessPending.clear();
		watch.reset();

		progress = null;

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
			simulationDone = true;
			System.out.println("Simulation done!");
		}

	}

	/**
	 * 
	 * @param pax
	 * @param myself
	 */
	public static synchronized void launchWaymakingAgent(Passenger pax,
			Passenger myself) {
		Seat seat = pax.getSeat();

		int offset = 5;

		Vector start = new Vector2D(seat.getXPosition() - 2,
				seat.getYPosition() + seat.getYDimension() / 2,
				cabin.getSimulationSettings().getScale());

		if (pax.getSeat().getXPosition() < pax.getDoor().getXPosition()) {
			offset = -(offset + 2);
			System.out.println("offset mirrored");
		}

		Vector goal = new Vector2D(
				seat.getXPosition()
						+ offset * cabin.getSimulationSettings().getScale(),
				cabin.getYDimension() / 2.0,
				cabin.getSimulationSettings().getScale());

		Agent agent = new Agent(pax, start, goal,
				getAgentByPassenger(myself).getCostMap(),
				Agent.AgentMode.MAKE_WAY, myself);
		agent.findNewPath();
		agent.start();
		pax.setNumberOfMakeWayOperations(
				pax.getNumberOfMakeWayOperations() + 1);

		System.out.println("Launching passenger " + pax.getId() + " from x:"
				+ start.getX() + ", y:" + start.getY() + " to x:" + goal.getX()
				+ ", y:" + goal.getY() + ".");
	}

	/**
	 * 
	 * @return
	 */
	public static synchronized int getActivePassengers() {
		return activeList.size();
	}

	/**
	 * 
	 * @param pax
	 * @return
	 */
	public synchronized static boolean CabinAccessGranted(Passenger pax) {

		EList<Passenger> waitingList = pax.getDoor().getWaitingPassengers();

		/* add the passenger to the waiting list of the specific door */
		if (!waitingList.contains(pax)) {
			waitingList.add(pax);
		}

		if (pax.getId() == waitingList.get(0).getId()) {

			/* check if doorway is clear. */
			if (!AgentFunctions.doorwayBlocked(pax)) {

				waitingList.remove(pax);
				return true;

			}
		}

		return false;
	}

	/**
	 * 
	 * @param pax
	 */
	public synchronized static void setPassengerActive(Passenger pax) {

		if (!AStarHelper.PassengerAlreadyInList(pax, activeList)) {
			activeList.add(pax);
		}
	}

	/**
	 * This method executes the path finding simulation of the agents.
	 */
	public void run() {

		/* start the stop watch */
		watch.start();

		/* create the list for all cost maps */
		Map<Integer, Costmap> costmaps = new HashMap<>();

		/*
		 * Every active door needs its own CostMap.java for path calculations!
		 * The CostMap.java objects are stored in the HashMap.java and can be
		 * accessed by the ID of the corresponding door.
		 */
		for (Door door : cabin.getDoors()) {

			/* check if the door is active */
			if (door.isIsActive()) {

				/* get the 2D position of the door object */
				Vector doorPosition = new Vector2D(
						(door.getXPosition() + door.getWidth() / 2), 0,
						cabin.getSimulationSettings().getScale());

				/* generate a new cost map */
				Costmap costmap = new Costmap(dimensions, doorPosition,
						areamaphandler.getAreamap(), null, false);

				/* save the CostMap to the local file system */
				costmap.saveMapToFile();

				/* add it to the list of CostMaps */
				costmaps.put(door.getId(), costmap);
			}
		}

		/* loop through all passengers and create their respective agent */
		for (Passenger passenger : cabin.getPassengers()) {

			/* get objects assigned to the passenger */
			Seat seat = passenger.getSeat();
			Door door = passenger.getDoor();

			/*
			 * create the start location - this is the position of the door
			 * which the passenger will use to board the plane
			 */
			Vector start = new Vector2D(
					(door.getXPosition() + door.getWidth() / 2), 0,
					cabin.getSimulationSettings().getScale());

			/*
			 * create the goal location. this is the position of the passengers
			 * seat. The goal is one "PIXEL" in front of the center of the seat.
			 */
			Vector goal = new Vector2D((seat.getXPosition()) - 1,
					seat.getYPosition() + seat.getYDimension() / 2,
					cabin.getSimulationSettings().getScale());

			/*
			 * Create an agent object for path finding purposes. The cost map is
			 * loaded from the list of cost maps accordingly
			 */
			Agent agent = new Agent(passenger, start, goal,
					costmaps.get(door.getId()), Agent.AgentMode.GO_TO_SEAT,
					null);

			/* add the agent to the list */
			agentList.add(agent);
		}

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				progress = new ProgressHandler(agentList.size());
				while (progressvalue < agentList.size() - 1) {
					progress.reportProgress(progressvalue);

					percent = DecimalHelper.percentage(progressvalue,
							agentList.size());

					// TODO: real progress indications for calculation of
					// cost map could be implemented!

					if (percent < 10) {
						progress.updateText(
								"Initializing Path finding algorithms ...");
					} else if (percent < 30) {
						progress.updateText("Creating the agent objects ...");
					} else if (percent < 90) {
						progress.updateText(
								"Calculating the paths for every passenger ...");
					} else {
						progress.updateText("Finishing calculations ...");
					}
				}
				progress.done();
			}
		});

		/* First generate all paths ... */
		for (Agent agent : agentList) {

			/* try to find a path! */
			try {
				agent.findNewPath();

				/* Warn if no path can be found */
			} catch (NullPointerException e) {

				System.out.println("Passenger " + agent.getPassenger().getName()
						+ " can not find a path to the seat at "
						+ agent.getGoal().getX() + " / "
						+ agent.getGoal().getY());
			}

			/* return information to the progress bar */
			progressvalue++;
		}

		/* ... then start the simulations simultaneously */
		for (Agent agent : agentList) {
			agent.start();
			agent.setInitialized(true);
		}
	}

	/**
	 * 
	 */
	public static void stopSimulation() {
		for (Agent agent : agentList) {
			agent.getThread().stop();
		}
		reset();
	}

	public static AreamapHandler getAreamapHandler() {
		return areamaphandler;
	}
}
