/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.mood.options;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.PathFinder;
import net.bhl.cdt.paxelerate.model.agent.mood.AgentMood;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;

/**
 * The Class AgressiveMood.
 *
 * @author marc.engelmann, tobias.bruegge-zobel
 * @version 1.0
 * @since 0.5
 *
 */

public class AggressiveMood extends AgentMood {

	/**
	 * Instantiates a new aggressive mood.
	 *
	 * @param agent
	 *            the agent
	 */
	public AggressiveMood(Agent agent) {
		super(agent);
	}

	@Override
	public void reactToCollision(Property property) {
		/* only pass if other passenger is stowing luggage */
		if (agent.getBlockingAgent().passengerStowsLuggage()
				|| agent.getBlockingAgent().passengerUnfoldsSeat()) {

			new PathFinder().findNewPath(agent);
			agent.setExitPathLoop(true);
		}
	}
}