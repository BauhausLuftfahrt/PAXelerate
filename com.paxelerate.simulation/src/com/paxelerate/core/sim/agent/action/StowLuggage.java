/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.sim.agent.action;

import com.paxelerate.core.sim.agent.Agent;
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

		StowLuggage.sleepAgentThread(PassengerExtensions.getLuggageStowingTime(agent.getPassenger()), agent);

		agent.setAlreadyStowed(true);

	}

	/**
	 * Sleep agent thread.
	 *
	 * @param time the time
	 */
	static void sleepAgentThread(double sleepTime, Agent agent) {

		// change state
		agent.getPassenger().setState(State.STOW_LUGGAGE);

		// change influence area
		agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
		agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);

		// agent.rotateTo(180);

		try {
			Thread.sleep(agent.time(sleepTime));
			agent.getPassenger().setTotalTimeWaited(agent.getPassenger().getTotalTimeWaited() + agent.time(sleepTime));
		} catch (InterruptedException e) {
			System.out.println("Agent action: InterruptedException");
		}
	}
}
