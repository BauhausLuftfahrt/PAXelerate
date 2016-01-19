/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.agent;

import com.paxelerate.model.astar.Node.Property;

public abstract class AgentMood implements Strategy {

	private Agent agent;

	public AgentMood(Agent agent) {
		this.setAgent(agent);
	}

	public abstract void reactToCollision(Property property);

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}
}
