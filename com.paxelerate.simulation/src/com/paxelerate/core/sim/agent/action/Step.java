/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.core.sim.agent.action;

import com.paxelerate.core.sim.agent.Agent;
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

	static void run(Agent agent) {

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
	}
}
