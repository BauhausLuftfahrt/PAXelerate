/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.paxelerate.model.astar.Core;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.model.astar.Path;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.observer.Subject;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class AgentPathFinder.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 * 
 */

public class PathFinder extends Subject implements Runnable {

	private Thread thread;
	private Agent agent;

	/**
	 * This method finds a new path. The <b>finalCostmap</b> is needed so that
	 * there is no overlapping of different agent positions over time. The cost
	 * map is always modified based on the non-editable final cost map
	 * calculated at the beginning.
	 * @param agent 
	 *
	 * @throws NullPointerException
	 *             the null pointer exception
	 */
	

	public PathFinder(Agent agent) {
		this.agent = agent;
	}


	@Override
	public void run() {
		findNewPath();
	}
	
	
	public void findNewPath() throws NullPointerException {

		StopWatch pathTimer = new StopWatch();
		
		/* storage for the old path before the new calculation */
		Path oldPath = null;

		/* criteria when to choose the new path */
		double pathFindingDecisionFactor = 1.1;

		/* starts the StopWatch - used for performance testing */
		pathTimer.start();
		
		/* reset the mutable CostMap to the original cost map */
		Costmap mutableCostMap = agent.getCostMap();
		
		//mutableCostMap.printMapToConsole();
		
		SimulationHandler.getAreamapHandler()
				.setStartLocation(agent.getCurrentPosition(), agent);

		/* this is only run if its not the initial path finding process */
		if (!agent.firstPathCalculation()) {

			if (true) {
				System.out.println("Path is not first path ..");
			}

			/* store the old path */
			oldPath = new Path(agent.getCurrentPath());

			/* this sets the new start of the A* to the current position */
			agent.setStartPosition(agent.getCurrentPosition());
			
			/* this declares the area around agents as high cost terrain */
			mutableCostMap = AgentFunctions.updateCostmap(agent);
		}

		//mutableCostMap.printMapToConsole();

		/* run the path finding algorithm */
		Core astar = new Core(SimulationHandler.getAreamapHandler(),
				mutableCostMap, agent);

		/* retrieve the path information */
		agent.setPath(astar.getBestPath());

		if (oldPath != null) {
			System.out.println("old: " + oldPath.getCost() + ", new: "
					+ agent.getCurrentPath().getCost() + " diff in %: "
					+ oldPath.getCost() / agent.getCurrentPath().getCost()
							* 100.0);
		}

		/* this is only run if its not the initial path finding process */
		// if (currentPosition != null) {
		//
		//
		// TODO: Calulate only the part of the path lying ahead!
		// if (oldPath.getCost() * pathFindingDecisionFactor <= path
		// .getCost()) {
		//
		/* if so, return to the old path */
		// path = oldPath;
		//
		/* exit the function */
		// return;
		// }
		// }

		/*
		 * setting the new desired and current positions. This causes a
		 * NullPointerException if no path is found!
		 */

		agent.setDesiredPosition(agent.getCurrentPath().get(0).getPosition());

		/* this is only run if its not the initial path finding process */
		if (agent.getCurrentPosition() != null)

		{
			agent.blockArea(agent.getCurrentPosition(), false, false, null);
		}

		if (agent.firstPathCalculation()) {
			agent.setCurrentPosition(new Vector2D(0, 0));
		}

		/* apply cost the the passenger element */
		agent.getPassenger().setCostOfPath(agent.getCurrentPath().getCost());

		if (!agent.firstPathCalculation()) {
			/* cut the old path and add the new one to the list */
			agent.redefinePathLayout();
		}

		/* ends the stop watch performance logging */
		pathTimer.stop();

		/*if (SimulationHandler.getCabin().getSimulationSettings()
				.isDeveloperMode()) {
			System.out.println("Pathfinding calculations for Agent "
					+ agent.getPassenger().getName() + " took "
					+ pathTimer.getElapsedTime() + " ms.");
		}*/
	}
	
	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (getThread() == null) {
			setThread(new Thread(this, agent.getPassenger().getName()));
			getThread().start();
		}
	}

	/**
	 * This method returns the thread.
	 * 
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * This method sets the thread.
	 * 
	 * @param thread
	 *            the thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

	/**
	 * Stop thread.
	 */
	public void stopThread() {
		thread.interrupt();
	}

}
