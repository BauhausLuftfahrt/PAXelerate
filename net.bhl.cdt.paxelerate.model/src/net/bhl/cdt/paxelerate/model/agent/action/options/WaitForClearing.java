/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.action.options;

import net.bhl.cdt.paxelerate.model.LuggageModelOption;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.action.AgentActionType;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.GaussianRandom;

/**
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 0.8
 * @since 0.8
 *
 */
public class WaitForClearing extends AgentActionType {

	private SimulationProperties simSettings;
	private Passenger myself;
	private double multiPaxFactor;

	public WaitForClearing(Agent agent, int scale,
			SimulationProperties simSettings, Passenger myself) {
		super(agent, scale);
		this.simSettings = simSettings;
		this.myself = myself;
		this.multiPaxFactor = simSettings.getPassengerProperties()
				.getSeatInterferenceMultiPassengerFactor();
	}

	@SuppressWarnings("static-access")
	@Override
	public void performNextAction() {

		if (simSettings
				.getLuggageModelOption() == LuggageModelOption.SIMPLE_MODEL) {

			agent.setCurrentState(State.WAITING_FOR_ROW_CLEARING);

			while (agent.waymakingAllowed() == false) {
				agent.increaseTotalWaitingTime(
						simSettings.getThreadSleepTimeDefault());
				try {
					agent.getThread()
							.sleep((simSettings.getThreadSleepTimeDefault()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (!agent.getWaitingCompleted()) {
				int blockingPax = agent.getNumberOfBlockingPax();
				if (simSettings.isDeveloperMode()) {
					System.out.println("Seat interference with " + blockingPax + " passenger(s)");
				}
				
				double time = GaussianRandom.gaussianRandom(
								simSettings.getPassengerProperties()
										.getSeatInterferenceProcessTimeMean(),
								GaussOptions.PERCENT_95,
								simSettings.getPassengerProperties()
										.getSeatInterferenceProcessTimeDeviation());
				
				long sleepTime;
				if (blockingPax > 1) {
					sleepTime = AStarHelper.time(time * blockingPax * multiPaxFactor);
				} else {
					sleepTime = AStarHelper.time(time);
				}
				
				System.out.println("Interference time " + sleepTime);
				agent.increaseTotalWaitingTime(sleepTime);
				try {
					agent.getThread().sleep(sleepTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				agent.raiseNumberOfSkippedWaymakings();
				agent.setWaitingCompleted(true);
			}

		} else if (simSettings
				.getLuggageModelOption() == LuggageModelOption.ADVANCED_MODEL) {

			if (!agent.getWaitingCompleted()) {

				for (Passenger pax : agent.otherPassengersInRowBlockingMe) {
					SimulationHandler.launchWaymakingAgent(pax, myself);
				}

				while (!agent.getOtherPassengerStoodUp()) {
					agent.increaseTotalWaitingTime(
							simSettings.getThreadSleepTimeDefault());
					try {
						Thread.sleep(simSettings.getThreadSleepTimeDefault());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				long sleepTime = AStarHelper
						.time(simSettings.getPassengerProperties()
								.getSeatInterferenceProcessTimeDeviation());
				agent.increaseTotalWaitingTime(sleepTime);
				try {
					agent.getThread().sleep(sleepTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				agent.raiseNumberOfCompletedWaymakings();
				agent.setWaitingCompleted(true);

			}

		}

	}

}
