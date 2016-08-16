/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.model.util;

import java.util.Map;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;

/**
 * The Class PassengerGenerator.
 *
 * @author marc.engelmann, michael.schmidt
 * @version 1.1
 * @since 0.5
 */

public class PassengerGenerator {

	/**
	 * Apply delay.
	 *
	 * @param passenger
	 *            the passenger
	 * @param delays
	 *            the delays
	 */
	public synchronized static void  applyDelay(Passenger passenger,
			Map<Integer, Double> delays) {

		/* get the passengers parent cabin object */
		Cabin cabin = ModelHelper.getParent(Cabin.class, passenger);

		/* calculate the step size for the delay */
		double stepsize = 60.0 / cabin.getSimulationSettings()
				.getPassengersBoardingDoor();

		/* get the linked door of the passenger */
		Door door = passenger.getDoor();
		int id = door.getId();

		/* if there is no delay before, set it to zero */
		if (delays.get(id) == null) {
			delays.put(id, 0.0);
		}

		/* read out the delay value of the door and assign it */
		passenger.setStartBoardingAfterDelay(delays.get(id));

		/* increase the delay of the corresponding door */
		delays.put(id, delays.get(id) + stepsize);
	}
}
