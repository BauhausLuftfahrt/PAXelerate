/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent.action;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.core.simulation.covid.ContactTracingFunctions;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.EPointExtensions;

import net.bhl.opensource.toolbox.math.Distance;

/**
 * @author Marc.Engelmann, Michael.Schmidt
 * @since 11.12.2019
 *
 */
public interface Step {

	static void run(Agent agent, double stepTime) {

		Passenger passenger = agent.getPassenger();

		double scale = agent.getHandler().getSettings().getSimulationGridResolution();

		passenger.setState(State.FOLLOW_PATH);

		// Go one step ahead. Do this by unblocking the current position and blocking
		// the next position.
		agent.blockArea(passenger.getCurrentPosition(), false, true);
		agent.blockArea(passenger.getDesiredPosition(), true, true);

		if (passenger.getCurrentPosition().getX() != 0 && passenger.getCurrentPosition().getY() != 0) {

			// update the walked distance
			passenger.setDistanceWalked(passenger.getDistanceWalked()
					+ Distance.distanceBetween(EPointExtensions.transform(passenger.getDesiredPosition()),
							EPointExtensions.transform(passenger.getCurrentPosition())) * scale);
		}

		// try to submit the properties back to the passenger submit the agents position
		passenger.getCurrentPosition().setX(passenger.getDesiredPosition().getX() * scale);
		passenger.getCurrentPosition().setY(passenger.getDesiredPosition().getY() * scale);

		ContactTracingFunctions.evaluateCovidDistances(agent, stepTime);
	}

}
