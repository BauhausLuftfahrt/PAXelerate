/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;

/**
 * The Class PassiveMood.
 *
 * @author marc.engelmann, tobias.bruegge-zobel, michael.schmidt
 */
public class PassiveMood extends AgentMood implements Strategy {

	/**
	 * Instantiates a new passive mood.
	 *
	 * @param agent
	 *            the agent
	 */
	public PassiveMood(Agent agent) {
		super(agent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.bhl.cdt.paxelerate.model.agent.AgentMood#reactToCollision(net.bhl.cdt
	 * .paxelerate.model.astar.Node.Property)
	 */
	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision(Property property) {

		try {
			/* agent waits for specific time before he continues walking */
			super.getAgent().getThread().sleep(AStarHelper
					.time(super.getAgent().getWaitingTimeAfterCollision()));
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
		super.getAgent().setExitPathLoop(false);

	}

}
