/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.paxelerate.model.astar.Node.Property;

/**
 * The Class AgentMood.
 *
 * @author marc.engelmann, tobias.bruegge-zobel
 * @version 1.0
 * @since 0.5
 */
public abstract class AgentMood implements Strategy {

	/** The agent. */
	private Agent agent;

	/**
	 * Instantiates a new agent mood.
	 *
	 * @param agent the agent
	 */
	public AgentMood(Agent agent) {
		this.setAgent(agent);
	}

	/* (non-Javadoc)
	 * @see net.bhl.cdt.paxelerate.model.agent.Strategy#reactToCollision(net.bhl.cdt.paxelerate.model.astar.Node.Property)
	 */
	public abstract void reactToCollision(Property property);

	/**
	 * Gets the agent.
	 *
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}

	/**
	 * Sets the agent.
	 *
	 * @param agent the new agent
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
}
