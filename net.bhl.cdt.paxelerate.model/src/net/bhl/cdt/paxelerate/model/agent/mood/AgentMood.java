/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.mood;

import net.bhl.cdt.paxelerate.model.agent.Agent;

/**
 * The Class AgentMood.
 *
 * @author marc.engelmann, tobias.bruegge-zobel
 * 
 */
public abstract class AgentMood implements CollisionHandler {

	/** The agent. */
	private Agent agent;

	/**
	 * Instantiates a new agent mood.
	 *
	 * @param agent
	 *            the agent
	 */
	protected AgentMood(Agent agent) {
		this.agent = agent;
	}

	/**
	 * Gets the agent.
	 *
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}
}
