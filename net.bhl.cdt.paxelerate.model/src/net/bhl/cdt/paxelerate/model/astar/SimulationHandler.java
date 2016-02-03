/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.emf.common.util.EList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;
import net.bhl.cdt.paxelerate.util.toOpenCDT.OS;
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
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>(),
			activeList = new ArrayList<Passenger>(),
			waymakingList = new ArrayList<Passenger>();

	private static HashMap<Door, Double> lastDoorRelease = new HashMap<Door, Double>();

	private static AreaMap areamap;
	private static CostMap costmap;
	private static ArrayList<Agent> agentList = new ArrayList<Agent>();
	private static HashMap<Passenger, Integer> accessPending = new HashMap<Passenger, Integer>();
	private static StopWatch watch = new StopWatch();
	private Vector dimensions;

	public static final boolean SHOW_AREAMAP_ANIMATION = true;

	private static JFrame simulationFrame;
	private static ProgressHandler progress;
	private static int progressValue = 0;
	private static int percent = 0;

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
		Log.add(this, "Cabin initializing...");
		areamap = new AreaMap(this.dimensions, obstaclemap);
		SimulationHandler.cabin = cabin;
		run();
	}

	public static int getNumberOfSeatedPassengers() {
		return finishedList.size();
	}

	public static void addToWaymakingList(Passenger pax) {
		waymakingList.add(pax);
	}

	public static void removeFromWaymakingList(Passenger pax) {
		waymakingList.remove(pax);
	}

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
		watch.reset();

		simulationFrame = null;
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
		if (finishedList.size() >= (cabin.getPassengers().size() - 1)) {
			setSimulationDone(true);
			simulationFrame.dispose();
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

		Vector start = new Vector2D(AStarTools.scaleValue((seat.getYPosition() + seat
				.getYDimension() / 2)),
				AStarTools.scaleValue((seat.getXPosition()) - 2));

		if (pax.getSeatRef().getXPosition() < pax.getDoor().getXPosition()) {
			offset = -(offset + 2);
			System.out.println("offset mirrored");
		}

		Vector goal = new Vector2D(
				AStarTools.scaleValue(cabin.getCabinWidth() / 2.0),
				AStarTools.scaleValue(seat.getXPosition()) + offset);

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

		EList<Passenger> waitingList = pax.getDoor().getWaitingPassengers();

		/* add the passenger to the waiting list of the specific door */
		if (!waitingList.contains(pax)) {
			pax.getDoor().getWaitingPassengers().add(pax);
		}

		if (pax.getId() == waitingList.get(0).getId()) {

			/* check if doorway is clear. */
			if (!AgentFunctions.doorwayBlocked(pax)) {

				/* check if time has passed since releasing last one */
				if (enoughTimePassed(pax)) {
					waitingList.remove(pax);
					return true;
				}
			}
		}

		// TODO: insert minimum delays between launches!
		return false;
	}

	private static boolean enoughTimePassed(Passenger pax) {
		Door door = pax.getDoor();
		if (!lastDoorRelease.containsKey(door)) {
			lastDoorRelease.put(door, 0.0);
			return true;
		}

		// TODO: Do not use a static time stamp but consider the simulation
		// speed!
		double time = watch.getElapsedTimeTens();
		if (Math.abs(lastDoorRelease.get(door) - time) > (AStarTools.time(0.15) / 1000.0)) {
			lastDoorRelease.put(door, time);
			return true;
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

		if (!AStarTools.PassengerAlreadyInList(pax, activeList)) {
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
		watch.start();
		costmap = null;
		Boolean doItOnce = true;

		for (Passenger passenger : cabin.getPassengers()) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Vector start = new Vector2D(
					0,
					AStarTools.scaleValue((door.getXPosition() + door.getWidth() / 2)));
			Vector goal = new Vector2D(
					AStarTools
							.scaleValue((seat.getYPosition() + seat.getYDimension() / 2)),
					AStarTools.scaleValue((seat.getXPosition()) - 1));

			if (doItOnce) {
				/* This line generates a costmap which is used for all agents */
				costmap = new CostMap(dimensions, start, areamap, null,
						false);
				costmap.saveMapToFile();
				doItOnce = false;
			}

			Agent agent = new Agent(passenger, start, goal, costmap,
					Agent.AgentMode.GO_TO_SEAT, null);

			// list of all agents
			agentList.add(agent);
		}

		if (!OS.isMac()) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					progress = new ProgressHandler(agentList.size());
					while (progressValue < agentList.size() - 1) {
						progress.reportProgress(progressValue);
						percent = percentage(progressValue, agentList.size());

						// TODO: real progress indications for calculation of
						// cost map could be implemented!

						if (percent < 10) {
							progress.updateText("Initializing Path finding algorithms ...");
						} else if (percent < 30) {
							progress.updateText("Creating the agent objects ...");
						} else if (percent < 90) {
							progress.updateText("Calculating the paths for every passenger ...");
						} else {
							progress.updateText("Finishing calculations ...");
						}
					}
					progress.done();
				}
			});
		}

		/* First generate all paths ... */
		for (Agent agent : agentList) {
			agent.findNewPath();

			/* return information to the progress bar */
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

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				simulationFrame = new JFrame("Simulation Detail View");
				// TODO disabled to unlink model from ui
//				SimulationView simulationView = new SimulationView();
//				simulationView.setAreamap(areamap);
//				simulationFrame.setContentPane(simulationView);
				simulationFrame.pack();
				simulationFrame.setVisible(true);
			}
		});
	}

}
