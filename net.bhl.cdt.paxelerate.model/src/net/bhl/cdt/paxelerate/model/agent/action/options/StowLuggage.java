/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.action.options;

import net.bhl.cdt.paxelerate.model.LuggageModelOption;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.action.AgentActionType;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;

/**
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 * @since 0.8
 *
 */
public class StowLuggage extends AgentActionType {

	private SimulationProperties simSettings;

	public StowLuggage(Agent agent, int scale,
			SimulationProperties simSettings) {
		super(agent, scale);
		this.simSettings = simSettings;
	}

	@Override
	public void performNextAction() {

		if (simSettings
				.getLuggageModelOption() == LuggageModelOption.SIMPLE_MODEL) {
			agent.setCurrentState(State.STOWING_LUGGAGE);
			agent.rotateAgent(90);

			/* sleep the thread as long as the luggage is stowed */
			long sleepTime = AStarHelper
					.time(agent.getPassenger().getLuggageStowTime());
			try {
				Thread.sleep(sleepTime);
				agent.increaseTotalWaitingTime(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("InterruptedException @ thread "
						+ Thread.currentThread().getName());
				Thread.currentThread().interrupt();
			}
		/* notify everyone that the luggage is now stowed */
		agent.setAlreadyStowed(true);
		} else {
			System.out.println("Advanced model not yet implemented");
		}
		

	}

}
