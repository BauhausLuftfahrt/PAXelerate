/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.covid;

import java.util.Map.Entry;

import com.paxelerate.core.simulation.agent.Agent;

/**
 * Additional static functions for the contact tracing
 *
 * @author Marc.Engelmann
 * @since 08.07.2021
 *
 */
public interface ContactTracingFunctions {

	/**
	 * @param agent
	 */
	static void evaluateCovidDistances(Agent agent, double stepTime) {

		agent.getHandler().getMap().get(agent.getPassenger().getCurrentPosition()).ifPresent(node -> {

			for (Entry<Agent, Integer> entry : node.covidMap.entrySet()) {

				agent.getContactTracingHandler().addContact(entry.getKey().getPassenger(),
						agent.getHandler().getMasterBoardingTime(), stepTime,
						entry.getValue() * agent.getHandler().getSettings().getSimulationGridResolution(),
						agent.getPassenger().getState());

			}

		});
	}

}
