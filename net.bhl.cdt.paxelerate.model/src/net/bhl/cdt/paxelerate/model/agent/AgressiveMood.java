/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;

/**
 * The Class AgressiveMood.
 *
 * @author marc.engelmann, tobias.bruegge-zobel
 */
public class AgressiveMood extends AgentMood implements Strategy {

	/**
	 * Instantiates a new agressive mood.
	 *
	 * @param agent the agent
	 */
	public AgressiveMood(Agent agent) {
		super(agent);
		// Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see net.bhl.cdt.paxelerate.model.agent.AgentMood#reactToCollision(net.bhl.cdt.paxelerate.model.astar.Node.Property)
	 */
	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision(Property property) {
//		// only pass if other passenger is stowing luggage
//		// if (super.getAgent().getBlockingAgent().passengerStowsLuggage()) {
//		if (property == Property.OBSTACLE) {
//			super.getAgent().findNewPath();
//		}
//		// other wise if blocked act as passive agent
//		else {
//			try {
//				super.getAgent().getThread().sleep(AStarHelper.time(1));
//			} catch (InterruptedException e) {
//			}
//		}
		
		super.getAgent().findNewPath();
		super.getAgent().setExitPathLoop(false);
	}
}