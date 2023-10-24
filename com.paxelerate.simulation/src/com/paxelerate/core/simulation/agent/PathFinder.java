/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent;

import com.paxelerate.core.simulation.astar.AStar;
import com.paxelerate.core.simulation.astar.Areamap;
import com.paxelerate.core.simulation.astar.Costmap;
import com.paxelerate.core.simulation.astar.Path;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.EPointExtensions;

import net.bhl.opensource.toolbox.math.vector.IntVector;
import net.bhl.opensource.toolbox.time.StopWatch;

/**
 * The Class AgentPathFinder is used to perform the path finding and overtaking
 * process.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 * @since 13.05.2020
 *
 */

public class PathFinder implements Runnable {

	// this value determines how many steps ahead the overtaking path should return
	// to the original path.
	private static final int OVERTAKING_RANGE = 10;

	// The path finder thread
	private Thread thread;

	// the agent object
	private Agent agent;

	// the original path (concerning the overtaking process)
	private final Path originalPath;

	// when overtaking, this index determines the position in the original path
	// where the agent is located right now.
	private final int currentPathIndex;

	// the start and goal position for the overtaking or path finding process.
	private final IntVector start, goal;

	// this factor is used to compare the overtaking path with the "remain" path
//	private double passingDecisionCostFactor;

	private Areamap map;

	/**
	 * This method finds a new path. The <b>finalCostmap</b> is needed so that there
	 * is no overlapping of different agent positions over time. The cost map is
	 * always modified based on the non-editable final cost map calculated at the
	 * beginning.
	 *
	 * @param agent
	 *
	 * @throws NullPointerException the null pointer exception
	 */

	public PathFinder(Agent agentObj) {

		map = agentObj.getHandler().getMap();

		// store the agent object
		agent = agentObj;
//		passingDecisionCostFactor = agent.getPassenger().getPassingDecisionCostFactor();

		// check if this is the agent's first path calculation
		if (agent.getPath() == null) {

			// if so, there is no original path yet
			originalPath = null;

			// Load agent's start and goal position
			start = EPointExtensions.transformIntVector(agent.getPassenger().getStartPosition());
			goal = EPointExtensions.transformIntVector(agent.getPassenger().getGoalPosition());

			// as there is no path, the index is null (= 0)
			currentPathIndex = 0;

		} else {

			// if this is NOT the first path finding, store the original path
			originalPath = new Path(agent.getCostMap());
			originalPath.addAll(agent.getPath());

			// the overtaking start position is the agent's current position
			start = EPointExtensions.transformIntVector(agent.getPassenger().getCurrentPosition());

			// the current index is retrieved from the current position
			currentPathIndex = originalPath.indexOf(map.get(start));

			// check if it is allowed to shorten path finding
			if (pathShorteningAllowed()) {

				// if so, determine a future way point as the goal
				goal = originalPath.get(currentPathIndex + PathFinder.OVERTAKING_RANGE).getPosition();

			} else {

				// if not, determine the seat as the goal
				goal = EPointExtensions.transformIntVector(agent.getPassenger().getGoalPosition());
			}
		}
	}

	/**
	 * This method searches for a new path.
	 *
	 * @throws NewPathTooExpensiveException this exception is thrown if the path
	 *                                      found is more expensive than the current
	 *                                      one
	 * @throws NoPathFoundException         this exception is thrown if no path is
	 *                                      found
	 */
	public void findNewPath() {

		// initialize the stop watch
		StopWatch pathTimer = new StopWatch();

		// set current status to path finding
		agent.getPassenger().setState(State.CALCULATE_NEW_PATH);

		// store the cost map which is used in the path finding process
		Costmap superCostmap = agent.getCostMap();

		// define the blank path
//		Path blankPath = null;

		// ------------------------------------------
		// Not first path calculations

		if (agent.getPath() != null) {

			throw new IllegalArgumentException("Do not use this. Not working as expected!");

//			System.out.println("PathFinder: Searching new path for Passenger at "
//					+ SeatExtensions.getName(agent.getPassenger().getSeat()));
//
//			// this sets the new start of the A* to the current position
//			agent.getPassenger().setStartPosition(EPointExtensions.transformInt(start));
//
//			// change the current position to the new start position
//			agent.changePositionTo(start);
//
//			List<IntVector> goals = new ArrayList<>();
//			goals.add(goal);
//
//			// create the new <b>blank</b> cost map for the no obstacle case
//			Costmap blankCostmap = new Costmap(start, goals, map, null, 0);
//
//			blankPath = AStar.search(map.get(goal), blankCostmap, start);
//
//			// This is the costmap which contains the agents' footprints
//			Costmap costmapWithAgents = new Costmap(start, goals, map, agent.getPassenger(), OVERTAKING_RANGE);
//
//			// apply the populated costmap to the current costmap in use!
//			superCostmap = costmapWithAgents;

		}

		// run the path finding algorithm
		Path superPath = AStar.search(map.get(goal).get(), superCostmap, start);

		// perform the evaluation of the optional overtaking path here
		if (agent.getPath() != null) {

//			// check if the two paths costs are equal
//			if (superPath.getCost() == blankPath.getCost()) {
//
//				// if so, notify that no new path is found
//				System.out.println("No path found");
//
//				// check if the new path cost is within a margin of old path
//			} else if (superPath.getCost() > blankPath.getCost() * passingDecisionCostFactor) {
//
//				// if no, notify that path is to expensive
//				System.out.println("Path too expensive");
//			}
//
//			// extend the path to the seat if it was was shortened before
//			if (pathShorteningAllowed()) {
//
//				// cut the original path to the intersection of the two paths
//				originalPath.removeAllNodesBefore(superPath.lastElement().getPosition());
//
//				// append the cut path to the new path
//				superPath.addAll(originalPath);
//
//			}
		}

		// set the desired position to the first node in the path
		agent.getPassenger().setDesiredPosition(EPointExtensions.transformIntVector(superPath.get(0).getPosition()));

		// check if it is the first path calculation
		if (agent.getPath() == null) {

			// if so, set the start to the default (0,0)
			agent.getPassenger().setCurrentPosition(EPointExtensions.transformIntVector(new IntVector(0, 0)));

		} else {

			// unblock old position, set new position and block new position
			agent.changePositionTo(start);
		}

		// retrieve the path information
		agent.setPath(superPath);

		// ends the stop watch performance logging
		pathTimer.stop();
	}

	/**
	 * This method returns the thread.
	 *
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

//	/**
//	 * Return whether the path finding process is finished
//	 *
//	 * @return the state of the process
//	 */
//	public boolean isFinished() {
//		return finished;
//	}

	/**
	 * This method determines whether the path may be shortened to a specific
	 * position on the previous path or if it needs to be calculated to the seat.
	 *
	 * @return shortening allowed
	 */
	private boolean pathShorteningAllowed() {
		return currentPathIndex + PathFinder.OVERTAKING_RANGE < originalPath.size()
				&& originalPath.get(currentPathIndex + PathFinder.OVERTAKING_RANGE).getPassenger() == null;
	}

	/**
	 * The main function of the thread.
	 */
	@Override
	public void run() {

		// check if the agent is already searching for a path
		if (!agent.isCurrentlySearchingForPath()) {

			// if not, search for it now */
			agent.setIsCurrentlySearchingForPath(true);
			try {
				// try to search for a path
				findNewPath();

				// check for no path or a too expensive path
			} catch (NullPointerException e) {

				// if there is no path, block future attempts
				agent.blockOvertakingAttempts(true);

			}
		}

		// finally finish path finding process
		agent.setIsCurrentlySearchingForPath(false);
	}

	/**
	 * This method sets the thread.
	 *
	 * @param thread the thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (getThread() == null) {
			setThread(new Thread(this, agent.getPassenger().getSeat().toString()));
			getThread().start();
		}
	}

	/**
	 * Stop thread.
	 */
	public void stopThread() {
		thread.interrupt();
	}
}
