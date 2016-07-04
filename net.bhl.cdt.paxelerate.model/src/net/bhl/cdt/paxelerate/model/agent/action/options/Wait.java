/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.action.options;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.action.AgentActionType;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.agent.mood.Collision;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;

/**
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.8
 *
 */
public class Wait extends AgentActionType {

	private Property property;

	public Wait(Agent agent, int scale, Property property) {
		super(agent, scale);
		this.property = property;
	}

	@Override
	public void performNextAction() {

		agent.setCurrentState(State.QUEUEING_UP);

		/* raise the interrupts counter up by one */
		agent.raiseNumberOfInterrupts();

		SimulationHandler.getMap().get(agent.getCurrentPosition())
				.raiseNumberOfInterrupts();

		/* get the correct behavior for an obstacle avoidance */
		Collision collision = new Collision(agent.getMood(), property);

		/* Perform the correct behavior */
		collision.handle();

		agent.increaseTotalWaitingTime(agent.getWaitingTimeAfterCollision());
		/*
		 * the main loop is quit, if there is a new path calculated
		 */

	}

}
