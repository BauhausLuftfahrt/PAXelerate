/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.mood.options;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.model.agent.mood.AgentMood;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;

/**
 * The Class PassiveMood.
 *
 * @author marc.engelmann, tobias.bruegge-zobel, michael.schmidt
 * @version 1.0
 * @since 0.5
 * 
 */
public class PassiveMood extends AgentMood {

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
			agent.getThread().sleep(
					AStarHelper.time(agent.getWaitingTimeAfterCollision()));
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
		agent.setExitPathLoop(false);

	}

}
