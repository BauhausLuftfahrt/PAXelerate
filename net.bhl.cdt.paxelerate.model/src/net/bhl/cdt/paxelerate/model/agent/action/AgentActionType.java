/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.action;

import net.bhl.cdt.paxelerate.model.agent.Agent;

/**
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.8
 *
 */
public abstract class AgentActionType implements AgentActionHandler {

	protected Agent agent;
	protected int scale;

	protected AgentActionType(Agent agent, int scale) {
		this.agent = agent;
		this.scale = scale;
	}

}
