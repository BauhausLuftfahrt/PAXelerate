/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.astar;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.core.simulation.agent.AgentFunctions;
import com.paxelerate.core.simulation.agent.PathFinder;
import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.DoorSide;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.EPointExtensions;
import com.paxelerate.model.extensions.PassengerExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.settings.Settings;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.math.vector.IntVector;
import net.bhl.opensource.toolbox.time.StopWatch;

/**
 * This class runs and handles the a star algorithm for the simulation.
 *
 * @author Michael.Schmidt, Marc.Engelmann
 * @since 11.05.2020
 *
 */
public class SimulationHandler {

	private Deck deck;
	private Areamap areamap;
	private Settings settings;
	private List<Agent> agentList = new ArrayList<>();
	private StopWatch boarding_watch;

	/**
	 *
	 * @param pax
	 * @return
	 *
	 * @see Agent.runBoarding()
	 */
	public boolean cabinAccessGranted(Agent agent) {

		Passenger pax = agent.getPassenger();

		if (pax == pax.getDoor().getWaitingPassengers().get(0)) {
			// check if doorway is clear.
			if (!AgentFunctions.doorwayBlocked(agent, agent.getShapeHandler().getShape(Layer.ASTAR)[0].length + 4)) {

				pax.getDoor().getWaitingPassengers().remove(pax);
				return true;
			}
		}
		return false;
	}

	/**
	 * @param id
	 * @return
	 */
	public Agent getAgentByPassengerID(int id) {
		return agentList.stream().filter(a -> a.getPassenger().getId() == id).findFirst().orElse(null);
	}

	/**
	 *
	 * @return
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * @return
	 */
	public Areamap getMap() {
		return areamap;
	}

	/**
	 *
	 * @return
	 */
	public double getMasterBoardingTime() {
		return boarding_watch == null ? 0 : boarding_watch.getElapsedTime();
	}

	/**
	 * @return
	 */
	public List<Passenger> getPassengersByState(State state, boolean invert) {

		if (state == null) {
			return deck.getPassengers();
		}
		return deck.getPassengers().stream().filter(p -> p.getState().equals(state) != invert)
				.collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public Settings getSettings() {
		return EObjectHelper.getParent(Model.class, deck).getSettings();
	}

	/**
	 *
	 */
	public void reset() {

		for (Agent agent : agentList) {
			if (agent.getThread() != null) {
				agent.getThread().interrupt();
			}
		}
		deck = null;
		areamap = null;
		settings = null;
		agentList.clear();
		boarding_watch = null;
	}

	/**
	 * Start the master_boarding_time when the first passenger is set active
	 *
	 * @param pax
	 */
	public void setPassengerActive(Passenger pax) {

		if (getPassengersByState(State.NOT_ACTIVE, true).isEmpty()) {
			boarding_watch = new StopWatch();
			Log.start("Simulating");
		}
		pax.setState(State.PREPARE);
	}

	/**
	 * This method signals that a passengers has reached his goal. This is done by
	 * adding him to the finishedList ArrayList element.
	 *
	 * @param passenger
	 * @param reachedGoal
	 */
	public void setPassengerReachedGoal(Passenger passenger, Path path) {

		passenger.getPath().clear();
		passenger.getPath().addAll(path.asEList());

		// When simulation is done
		if (getPassengersByState(State.SEATED, true).isEmpty()) {

			// stop the boarding time when the last passenger reached his goal
			boarding_watch.stop();
			Log.end(boarding_watch);
		}
	}

	/**
	 *
	 * @param dimensions
	 * @param realCabin
	 * @param simulationLoopIndex
	 * @param estimationOnly
	 */
	public SimulationHandler(Deck deck, boolean estimationOnly, Areamap map) {

		this.deck = deck;

		deck.getPassengers().forEach(p -> {
			p.setStartPosition(EPointExtensions.create(0, 0));
			p.setGoalPosition(EPointExtensions.create(0, 0));
			p.setCurrentPosition(EPointExtensions.create(0, 0));
			p.setDesiredPosition(EPointExtensions.create(0, 0));
			p.setState(null);
		});

		settings = EObjectHelper.getParent(Model.class, deck).getSettings();

		areamap = map == null ? new Areamap(deck) : map;

		generateCostmapsForBoarding();
		runPathfinding();

		/* ... then start the simulations simultaneously */
		for (Agent agent : agentList) {

			if (agent.getPath() == null) {
//				throw new NullPointerException(
				System.err.println("No path for PAX " + agent.getPassenger().getSeat());
			}

			if (!agent.getPassenger().getDoor().isActive()) {
				throw new NullPointerException(agent.getPassenger().getDoor() + " is not active!");
			}

			if (!estimationOnly) {

				// Switch start and goal for deboarding!
				if (settings.getSimulationType() == SimulationType.DEBOARDING) {
					PassengerExtensions.swapStartAndGoal(agent.getPassenger());
					agent.getPath().invert();
					agent.getPassenger().setDesiredPosition(
							EPointExtensions.transformIntVector(agent.getPath().get(0).getPosition()));
					agent.getPassenger().setStartBoardingAfterDelay(0);
				}

				agent.start();

			} else {
				agent.getPassenger().getPath().clear();
				if (agent.getPath() != null) {
					agent.getPassenger().getPath().addAll(agent.getPath().asEList());
				}
			}
		}

		// ---------------------------------------------------------------------
		// De-Boarding

		// Block all doors during initial deboarding
		if (settings.getSimulationType() == SimulationType.DEBOARDING) {

			// Save the blocked nodes.
			List<Node> blockedList = new ArrayList<>();

			// Loop through all active doors
			for (Door door : DoorExtensions.getActiveDoors(deck)) {

				double y = 5;
				if (door.getSide() == DoorSide.STARBOARD) {
					y = Math.round(DeckExtensions.getMaximumSize(deck).getY() / settings.getSimulationGridResolution())
							- 5;
				}

				// Block position with last passenger
				Node node = map.get((int) Math.round((door.getXPosition() + DoorExtensions.getWidth(door) / 2.0)
						/ settings.getSimulationGridResolution()), (int) Math.round(y)).get();
				node.setPassenger(deck.getPassengers().get(deck.getPassengers().size() - 1));
				blockedList.add(node);
			}

			// After a specific time, the doors get "opened".
			new Timer().schedule(new TimerTask() {
				@Override
				public void run() {
					for (Node node : blockedList) {
						node.setPassenger(null);
					}
				}
			}, 30000);

		}
	}

	/**
	 * Every active door needs its own CostMap.java for path calculations! The
	 * CostMap.java objects are stored in the HashMap.java and can be accessed by
	 * the ID of the corresponding door.
	 */
	private void generateCostmapsForBoarding() {

		StopWatch pathTimer = new StopWatch();

		Log.start("Generate Costmaps");

		for (Door door : deck.getDoors()) {
			if (settings.getSimulationType() == SimulationType.EMERGENCY) {
				door.setActive(true);
			} else if (door.getWaitingPassengers().size() == 0) {
				door.setActive(false);
			}
		}

		for (Door door : DoorExtensions.getActiveDoors(deck)) {

			/* get the 2D position of the door object */
			IntVector start = SimulationFunctions.determineStartForDoor(door);

			/* generate a new cost map */
			Costmap costmap = new Costmap(start, SimulationFunctions.determineGoalForObject(door), areamap, null, 0);

			for (Passenger passenger : door.getWaitingPassengers()) {

				// Determine start and goal positions
				IntVector goal = SimulationFunctions.determineGoalForObject(passenger.getSeat()).get(0);

				// Create an agent object for path finding purposes.
				Agent agent = new Agent(passenger, EPointExtensions.transformIntVector(start),
						EPointExtensions.transformIntVector(goal), this);

				// The cost map is loaded from the list of cost maps accordingly
				agent.setCostMap(costmap);

				// add the agent to the list
				agentList.add(agent);
			}
		}
		pathTimer.stop();
		Log.end(pathTimer);
	}

	/**
	 *
	 */
	private void runPathfinding() {

		Log.start("Pathfinding");

		/* First generate all paths ... */
		StopWatch pathTimer = new StopWatch();

		for (Agent agent : agentList) {

			/* try to find a path! */
			try {
				PathFinder pathFinder = new PathFinder(agent);
				pathFinder.start();
				pathFinder.getThread().join();

			} catch (InterruptedException e) {
				System.out.println("SimulationHandler - PathFinder: InterruptedException");
			}

			// Set passenger not active again after finishing path calculation
			agent.getPassenger().setState(State.NOT_ACTIVE);
		}
		pathTimer.stop();
		Log.end(pathTimer);
	}
}
