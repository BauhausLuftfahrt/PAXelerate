/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.agent;

import com.paxelerate.model.astar.AStarTools;
import com.paxelerate.model.astar.Node.Property;
import com.paxelerate.util.Func;

public class PassiveMood extends AgentMood implements Strategy {

	public PassiveMood(Agent agent) {
		super(agent);
	}

	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision(Property property) {

		try {
			super.getAgent().getThread().sleep(AStarTools.time(1));
		} catch (InterruptedException e) {
		}
		super.getAgent().setExitPathLoop(false);

	}

}
