/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.util.Func;

public class AgressiveMood extends AgentMood implements Strategy {

	public AgressiveMood(Agent agent) {
		super(agent);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision(Property property) {
		// only pass if other passenger is stowing luggage
		// if (super.getAgent().getBlockingAgent().passengerStowsLuggage()) {
		if (property == Property.OBSTACLE) {
			super.getAgent().findNewPath();
			super.getAgent().setExitPathLoop(true);
		}
		// other wise if blocked act as passive agent
		else {
			try {
				super.getAgent().getThread().sleep(Func.time(1));
			} catch (InterruptedException e) {
			}
			super.getAgent().setExitPathLoop(false);

		}
	}
}