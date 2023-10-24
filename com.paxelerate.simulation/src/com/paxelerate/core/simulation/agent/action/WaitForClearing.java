/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent.action;

import java.util.List;
import java.util.stream.Collectors;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.core.simulation.agent.AgentFunctions;
import com.paxelerate.core.simulation.covid.ContactTracingFunctions;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.PassengerExtensions;
import com.paxelerate.model.monuments.Seat;

import net.bhl.opensource.toolbox.math.gaussian.Gaussian;
import net.bhl.opensource.toolbox.math.gaussian.Gaussian.Sigma;

/**
 * @author Michael.Schmidt, Marc.Engelmann
 *
 */
public interface WaitForClearing {

	/**
	 *
	 * @param agent
	 * @param scale
	 * @param simSettings
	 * @param myself
	 */
	static void run(Agent agent) {

		// change state
		agent.getPassenger().setState(State.WAIT_FOR_ROW_CLEARING);

		// change influence area
		agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
		agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);

		if (!agent.getWaitingCompleted()) {

			double numberOfPassengersBetweenMeAndMySeat = 0;

			try {
				List<Seat> interferingSeats = AgentFunctions.getSeatsBetweenMeAndMySeat(agent).stream()
						.filter(s -> PassengerExtensions.getBySeat(s).isIsSeated()).collect(Collectors.toList());

				numberOfPassengersBetweenMeAndMySeat = interferingSeats.size();

			} catch (NullPointerException e) {
				numberOfPassengersBetweenMeAndMySeat = 1;
			}

			double sleepTime = Gaussian.random(
					agent.getHandler().getSettings().getPassengerProperties().getSeatInterferenceProcessTimeMean(),
					Sigma.PERCENT_95, agent.getHandler().getSettings().getPassengerProperties()
							.getSeatInterferenceProcessTimeDeviation());

			if (numberOfPassengersBetweenMeAndMySeat > 1) {
				sleepTime = sleepTime * numberOfPassengersBetweenMeAndMySeat * agent.getHandler().getSettings()
						.getPassengerProperties().getSeatInterferenceMultiPassengerFactor();
			}

			try {

				ContactTracingFunctions.evaluateCovidDistances(agent, sleepTime);

				Thread.sleep(agent.getSimulationTimeFor(sleepTime));

			} catch (InterruptedException e) {
				System.out.println("Agent action: InterruptedException");
				// e.printStackTrace();
			}

			agent.getPassenger().setTotalTimeWaited(
					agent.getPassenger().getTotalTimeWaited() + agent.getSimulationTimeFor(sleepTime));
			// agent.raiseNumberOfSkippedWaymakings();
			agent.setWaitingCompleted(true);
		}
	}
}
