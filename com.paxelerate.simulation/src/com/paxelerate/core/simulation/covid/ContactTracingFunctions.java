/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.covid;

import java.util.Map.Entry;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.model.agent.Passenger;

/**
 * Additional static functions for the contact tracing
 *
 * @author Marc.Engelmann
 * @since 08.07.2021
 *
 */
public interface ContactTracingFunctions {

	/**
	 * Evaluate the distances to other passengers at the current time.
	 *
	 * @param agent
	 * @param stepTime
	 */
	static void evaluateCovidDistances(Agent agent, double stepTime) {

		if (!Agent.ACTIVATE_CONTACT_TRACING) {
			return;
		}

		agent.getHandler().getMap().get(agent.getPassenger().getCurrentPosition()).ifPresent(node -> {

			for (Entry<Passenger, Integer> entry : node.getContactTracingMap().entrySet()) {

				agent.getContactTracingHandler().addContact(entry.getKey().getId(),
						agent.getHandler().getMasterBoardingTime(), stepTime,
						entry.getValue() * agent.getHandler().getSettings().getSimulationGridResolution(),
						agent.getPassenger().getState(), entry.getKey().getState());

			}

		});
	}

}
