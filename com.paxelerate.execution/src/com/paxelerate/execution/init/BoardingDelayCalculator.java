/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.execution.init;

import org.eclipse.emf.common.util.EList;

import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.monuments.Door;

import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;

/**
 * Determines the time after the simulation start when an agent is set to active
 *
 * @author Marc.Engelmann
 *
 */

public interface BoardingDelayCalculator {

	/**
	 * Calculates for the passenger the time when he enters the cabin
	 *
	 * @param passenger the passenger
	 * @param delays    the delays
	 */
	static void calculateDelay(EList<Door> list, EList<Passenger> pax) {

		StopWatch watch = new StopWatch();

		Log.start("Distibuting doors & delay");

		// Loop through all doors
		for (Door door : list) {
			door.getWaitingPassengers().clear();
		}

		for (Passenger passenger : pax) {

			Door door = PassengerGenerator.findDoor(passenger);

			if (door != null) {
				passenger.setDoor(door);
				door.getWaitingPassengers().add(passenger);
			}
		}

		// Loop through all doors
		for (Door door : list) {

			// calculate the step size for the delay
			double stepsize = 60.0 / door.getPassengerThroughputPerMinute();

			for (Passenger passenger : door.getWaitingPassengers()) {

				// read out the delay value of the door and assign it
				passenger.setStartBoardingAfterDelay(stepsize * door.getWaitingPassengers().indexOf(passenger));
			}
		}

		Log.end(watch);
	}
}
