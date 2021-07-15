/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent.action;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.core.simulation.covid.ContactTracingFunctions;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.PassengerExtensions;

/**
 * The Class StowLuggage.
 *
 * @author Michael.Schmidt, Marc.Engelmann
 */
public interface StowLuggage {

	/**
	 *
	 * @param agent
	 * @param centerLuggageStorage
	 */
	static void run(Agent agent, boolean centerLuggageStorage) {

		// Skip luggage stowing and just add a time penalty

		double sleepTime = PassengerExtensions.getLuggageStowingTime(agent.getPassenger());

		// change state
		agent.getPassenger().setState(State.STOW_LUGGAGE);

		// change influence area
		agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
		agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);

		// agent.rotateTo(180);

		try {
			Thread.sleep(agent.getSimulationTimeFor(sleepTime));

			ContactTracingFunctions.evaluateCovidDistances(agent, sleepTime);

			agent.getPassenger().setTotalTimeWaited(
					agent.getPassenger().getTotalTimeWaited() + agent.getSimulationTimeFor(sleepTime));

		} catch (InterruptedException e) {
			System.out.println("Agent action: InterruptedException");
		}

		agent.setAlreadyStowed(true);

	}
}
