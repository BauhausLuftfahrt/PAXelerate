/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.model.agent.PathFinder;
import net.bhl.cdt.paxelerate.model.agent.enums.AgentMode;
import net.bhl.cdt.paxelerate.util.math.DecimalHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;
import net.bhl.cdt.paxelerate.util.toOpenCDT.OS;
import net.bhl.cdt.paxelerate.util.toOpenCDT.ProgressHandler;

/**
 * This class runs and handles the a star algorithm an simulation.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 * @since 0.5
 *
 */
public class SimulationHandler {

	/** The cabin. */
	private static Cabin cabin;

	/** The simulation done. */
	private static Boolean simulationDone = false;

	/** The areamap handler. */
	private static AreamapHandler areamaphandler;
	


	/* Lists & Maps */

	/** The way making list. */
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>(),
			activeList = new ArrayList<Passenger>(),
			waymakingList = new ArrayList<Passenger>();

	/** The agent list. */

	private static List<Agent> agentList = new ArrayList<Agent>();

	/** The access pending. */
	private static HashMap<Passenger, Integer> accessPending = new HashMap<Passenger, Integer>();

	/* ************ */

	/** The watch. */
	private static StopWatch master_boarding_time = new StopWatch();

	/** The dimensions. */
	private static Vector dimensions;//previous non-static

	/** The scale. */
	private static int scale = 1;

	/** The simulation loop index. */
	private static int simulationLoopIndex;

	/** The Constant SHOW_AREAMAP_ANIMATION. */
	public static final boolean SHOW_AREAMAP_ANIMATION = true;

	/** The progress. */
	private static ProgressHandler progress;

	/** The costmaps. */
	private static Map<Integer, Costmap> costmaps = new HashMap<>();
	
	/** The costmapsForRearDoor. */
	private static Map<Integer, Costmap> costmapsFromRear = new HashMap<>();
	
	/** The indicator for costmaps & costmapsForRearDoor */
	private static int fromFront = 0, fromRear = 1;

	/** The progress value. */
	private static int percent = 0, progressvalue = 0;

	/**
	 * This method constructs the RunAStar algorithm.
	 *
	 * @param dimensions
	 *            is the dimension vector
	 * @param cabin
	 *            is the cabin
	 * @param simulationLoopIndex
	 *            the simulation loop index
	 */
	public SimulationHandler(Vector dimensions, Cabin cabin,
			int simulationLoopIndex) {
		this.dimensions = dimensions;
		this.simulationLoopIndex = simulationLoopIndex;
		Log.add(this, "Cabin initializing...");
		areamaphandler = new AreamapHandler(this.dimensions, cabin);
		SimulationHandler.cabin = cabin;
		scale = cabin.getSimulationSettings().getScale();
		run();
	}

	/**
	 * Gets the simulation loop index.
	 *
	 * @return the simulation loop index
	 */
	public static int getSimulationLoopIndex() {
		return simulationLoopIndex;
	}

	/**
	 * Gets the number of seated passengers.
	 *
	 * @return the number of seated passengers
	 */
	public static int getNumberOfSeatedPassengers() {
		return finishedList.size();
	}

	/**
	 * Gets the number of active passengers.
	 *
	 * @return the number of active passengers
	 */
	public static int getNumberOfActivePassengers() {
		return activeList.size();
	}

	/**
	 * Adds the to waymaking list.
	 *
	 * @param pax
	 *            the pax
	 */
	public static void addToWaymakingList(Passenger pax) {
		waymakingList.add(pax);
	}

	/**
	 * Removes the from waymaking list.
	 *
	 * @param pax
	 *            the pax
	 */
	public static void removeFromWaymakingList(Passenger pax) {
		waymakingList.remove(pax);
	}

	/**
	 * Waymaking in range.
	 *
	 * @param pax
	 *            the pax
	 * @return true, if successful
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
	public synchronized static Areamap getMap() {
		return areamaphandler.getAreamap();
	}
	
	/**
	 * Gets the agent by passenger.
	 *
	 * @param pax
	 *            the pax
	 * @return the agent by passenger
	 */
	public static synchronized Agent getAgentByPassenger(Passenger pax) {
		for (Agent agent : agentList) {
			if (agent.getPassenger().getId() == pax.getId()) {
				return agent;
			}
		}
		return null;
	}

	/**
	 * Gets the cabin.
	 *
	 * @return the cabin
	 */
	public static Cabin getCabin() {
		return cabin;
	}

	/**
	 * Removes the passenger.
	 *
	 * @param pax
	 *            the pax
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
	 * Sets the simulation status.
	 *
	 * @param status
	 *            the new simulation status
	 */
	public static void setSimulationStatus(boolean status) {
		simulationDone = status;
	}

	/**
	 * Gets the agent list.
	 *
	 * @return the agent list
	 */
	public static List<Agent> getAgentList() {
		return agentList;
	}

	/**
	 * Reset.
	 */
	public static synchronized void reset() {

		stopSimulation();

		cabin = null;
		areamaphandler = null;
		simulationDone = false;
		finishedList.clear();
		activeList.clear();
		waymakingList.clear();
		agentList.clear();
		accessPending.clear();
		master_boarding_time.reset();
		progress = null;

		System.out.println("Simulation Handler resetted!");
	}

	/**
	 * This method signals that a passengers has found his seat. This is done by
	 * adding him to the finishedList ArrayList element.
	 *
	 * @param passenger
	 *            is the passenger
	 * @param setSeated
	 *            the set seated
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

			/* stop the boarding time when the last passenger is seated */
			master_boarding_time.stop();

			System.out.println("Simulation done!");
		}

	}

	/**
	 * Launch waymaking agent.
	 *
	 * @param pax
	 *            the pax
	 * @param myself
	 *            the myself
	 */
	public static synchronized void launchWaymakingAgent(Passenger pax,
			Passenger myself) {
		Seat seat = pax.getSeat();

		int offset = 5;

		Vector start = new Vector2D(seat.getXPosition() - 2,
				seat.getYPosition() + seat.getYDimension() / 2, scale);

		if (pax.getSeat().getXPosition() < pax.getDoor().getXPosition()) {
			offset = -(offset + 2);
			System.out.println("offset mirrored");
		}

		Vector goal = new Vector2D(seat.getXPosition() + offset * scale,
				cabin.getYDimension() / 2.0, scale);
		
		Agent agent = new Agent(pax, start, goal,
				getAgentByPassenger(myself).getCostMap(), AgentMode.MAKE_WAY,
				myself);
		
		PathFinder pathFinder = new PathFinder(agent);
		pathFinder.start();
		try {
			pathFinder.getThread().join();
		} catch (InterruptedException e) {
			//Log.add(this, "SimulationHandler: InterruptedException");
			e.printStackTrace();
		}
		
		agent.start();
		pax.setNumberOfMakeWayOperations(
				pax.getNumberOfMakeWayOperations() + 1);

		System.out.println("Launching passenger " + pax.getId() + " from x:"
				+ start.getX() + ", y:" + start.getY() + " to x:" + goal.getX()
				+ ", y:" + goal.getY() + ".");
	}

	/**
	 * Gets the active passengers.
	 *
	 * @return the active passengers
	 */
	public static synchronized int getActivePassengers() {
		return activeList.size();
	}

	/**
	 * Cabin access granted.
	 *
	 * @param pax
	 *            the pax
	 * @return true, if successful
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
	 * Sets the passenger active.
	 *
	 * @param pax
	 *            the new passenger active
	 */
	public synchronized static void setPassengerActive(Passenger pax) {

		/*
		 * start the master_boarding_time when the first passenger is set active
		 */

		if (activeList.isEmpty() && finishedList.isEmpty()) {
			master_boarding_time.start();
		}

		if (!AStarHelper.PassengerAlreadyInList(pax, activeList)) {
			activeList.add(pax);
		}
	}

	/**
	 * Gets the master boarding time.
	 *
	 * @return the master boarding time
	 */
	public static StopWatch getMasterBoardingTime() {
		return master_boarding_time;
	}

	/**
	 * This method executes the path finding simulation of the agents.
	 */	
	public void run(){


		int d=0;
		for (Door door : cabin.getDoors()){
			
			door.setId(d);
			d++;
			
			if (door.isIsActive()) {

				
					Vector doorPosition = new Vector2D( (door.getXPosition()+ 
							door.getWidth() / 2), 0, scale);
					/*for passenger,who board through front-door*/
					Costmap costmap = new Costmap(dimensions, doorPosition,
							areamaphandler.getAreamap(), null, false, fromFront);
					/*for passenger,who board through rear-door*/		
					Costmap costmapFromRear = new Costmap(dimensions, doorPosition,
							areamaphandler.getAreamap(), null, false, fromRear);
					
					
					costmaps.put(door.getId(), costmap);
					
					costmapsFromRear.put(door.getId(), costmapFromRear);
				}
			}

			
			for (Passenger passenger : cabin.getPassengers()) {

				
				Seat seat = passenger.getSeat();
				Door door = passenger.getDoor();
				
				
				Vector start = new Vector2D(
						(door.getXPosition() + door.getWidth() / 2), 0, scale);
			
				Vector goal = new Vector2D((seat.getXPosition()) - 1,
						seat.getYPosition() + seat.getYDimension() / 2, scale);
				
				
			
				if( start.getX() < goal.getX() ){	
					Agent agent = new Agent(passenger, start, goal,costmaps.get(door.getId()), 
							AgentMode.GO_TO_SEAT, null);
					agentList.add(agent);
					
				}else{
						
					Agent agent = new Agent(passenger, start, goal,costmapsFromRear.get(door.getId()), 
							AgentMode.GO_TO_SEAT, null);
					agentList.add(agent);
				}
				
			}
		

		if (OS.isWindows()
				&& !cabin.getSimulationSettings().isSimulateWithoutUI()) {
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
							progress.updateText(
									"Creating the agent objects ...");
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
		} else if (OS.isMac()) {
			// TODO: implement eclipse progress bar
			Log.add(this, "Initializing Path finding algorithms ...");
			Log.add(this, "Creating the agent objects ...");
			Log.add(this, "Calculating the paths for every passenger ...");
		}
		
		/* First generate all paths ... */
		StopWatch pathTimer = new StopWatch();
		pathTimer.start();
		Thread pathfindingThreads[] = new Thread[agentList.size()];
		int i = 0;
		
		for (Agent agent : agentList) {

			/* try to find a path! 
			 * here generate the thread & join-method for his thread together.
			 * the previous version join-method is added after all thread are generated.This makes
			 * breakdown with two-boarding door running */
			try {
				PathFinder pathFinder = new PathFinder(agent);
				pathFinder.start();
				try {
					pathFinder.getThread().join();
				} catch (InterruptedException e) {
					Log.add(this, "SimulationHandler: InterruptedException");
					e.printStackTrace();
				}
				pathfindingThreads[i] = pathFinder.getThread();
				
				}
			
//			try {
//				PathFinder pathFinder = new PathFinder(agent);
//				pathFinder.start();
//				pathfindingThreads[i] = pathFinder.getThread();
//				try {
//					pathFinder.getThread().join();
//				} catch (InterruptedException e) {
//					Log.add(this, "SimulationHandler: InterruptedException");
//					e.printStackTrace();
//				}

				/* Warn if no path can be found */
			 catch (NullPointerException e) {
				Log.add(this, "Passenger " + agent.getPassenger().getName()
						+ " can not find a path to the seat at "
						+ agent.getGoal().getX() + " / "
						+ agent.getGoal().getY());

				PathFinder pathFinder = new PathFinder(agent);
				pathFinder.start();
				pathfindingThreads[i] = pathFinder.getThread();
			}
			i++;
			/* return information to the progress bar */
			progressvalue++;
		}
//		for (Thread thread : pathfindingThreads) {
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				Log.add(this, "SimulationHandler: InterruptedException");
//				e.printStackTrace();
//			}
//		}
		pathTimer.stop();
		if (SimulationHandler.getCabin().getSimulationSettings()
				.isDeveloperMode()) {
			System.out.println("Pathfinding calculations took "
					+ pathTimer.getElapsedTime() + " ms.");
		}

		/* ... then start the simulations simultaneously */
		for (Agent agent : agentList) {
			agent.start();
		}
	}

	/**
	 * Stop simulation.
	 */
	public static void stopSimulation() {
		for (Agent agent : agentList) {
			agent.getThread().interrupt();
			/*
			 * try { agent.getThread().join(); } catch (InterruptedException e)
			 * { e.printStackTrace(); }
			 */
			agent.resetAgent();
			// if (agent.getThread().isInterrupted())
			// agent = null;
		}
	}

	/**
	 * Gets the areamap handler.
	 *
	 * @return the areamap handler
	 */
	public static AreamapHandler getAreamapHandler() {
		return areamaphandler;
	}

	/**
	 * Gets the used costmaps.
	 *
	 * @return the used costmaps
	 */
	public static Map<Integer, Costmap> getUsedCostmaps() {
		return costmaps;
	}

	/**
	 * Gets the number waymaking skipped.
	 *
	 * @return the number waymaking skipped
	 */
	public static int getNumberWaymakingSkipped() {
		int numberSkipped = 0;
		for (Agent agent : agentList) {
			numberSkipped = numberSkipped + agent.getNumberWayMakingSkipped();
		}
		return numberSkipped;
	}

	/**
	 * Gets the number waymaking completed.
	 *
	 * @return the number waymaking completed
	 */
	public static int getNumberWaymakingCompleted() {
		int numberCompleted = 0;
		for (Passenger pax : finishedList) {
			numberCompleted = numberCompleted
					+ pax.getNumberOfMakeWayOperations();
		}
		return numberCompleted;
	}
	public static Vector getDimension(){
		return dimensions;
	}

}
