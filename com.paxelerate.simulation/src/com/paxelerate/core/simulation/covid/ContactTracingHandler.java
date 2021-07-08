/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.covid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.State;

/**
 * Handle all contact tracing related functionality.
 *
 * @author Marc.Engelmann
 * @since 02.07.2021
 *
 */
public class ContactTracingHandler {

	private Map<Passenger, ContactTracingMap> contactMap = new HashMap<>();
	private Passenger mySelf;
	private boolean isTracing = false;

	public ContactTracingHandler(Passenger pax) {
		mySelf = pax;

		isTracing = true;
	}

	/**
	 * @param passenger
	 * @param time
	 * @param distance
	 */
	public void addContact(Passenger passenger, double timestamp, double duration, double distance, State state) {

		// Don't tracking if the tracking has been completed already.
		if (!isTracing) {
			System.err.println("Contact tracing for passenger " + passenger.getId() + " has been completed.");
			return;
		}

		// Don't add the contact if the resulting distance is larger than allowed
		if (distance > Agent.COVID_EXPOSURE_TRESHOLD) {
			return;
		}

		// Don't track the distance to yourself
		if (passenger.getId() == mySelf.getId()) {
			return;
		}

		// Add an entry to the tracker map or create a new one
		if (contactMap.containsKey(passenger)) {
			contactMap.get(passenger).add(timestamp, duration, distance, state);

		} else {
			contactMap.put(passenger, new ContactTracingMap(timestamp, duration, distance, state));
		}
	}

	/**
	 *
	 */
	public void toConsole() {

		for (Entry<Passenger, ContactTracingMap> paxList : contactMap.entrySet()) {

			System.out.println("Contact with passenger " + paxList.getKey().getId());

			for (Entry<Double, ContactTracingEvent> list : paxList.getValue().entrySet()) {

				System.out.println("TimeStamp =  " + list.getKey() + "ms, duration = " + list.getValue().getDuration()
						+ "s, distance =  " + list.getValue().getDistance() + "m, state = "
						+ list.getValue().getState());

			}
		}
	}

	/**
	 * Run the final contact evaluation. Only do this when the tracing is finished!
	 *
	 * @param passenger
	 * @param speedfactor
	 */
	public void evaluateContactTracing(double speedfactor) {

		isTracing = false;

		double totalContactCounter = 0;

		List<Double> distances = new ArrayList<>();
		List<Double> durations = new ArrayList<>();

		for (Entry<Passenger, ContactTracingMap> paxList : contactMap.entrySet()) {

			totalContactCounter++;

			List<Double> contactDurations = new ArrayList<>();

			for (Entry<Double, ContactTracingEvent> list : paxList.getValue().entrySet()) {

				distances.add(list.getValue().getDistance());
				contactDurations.add(list.getValue().getDuration());

			}

			durations.add(contactDurations.stream().mapToDouble(d -> d).sum());

		}

		// Copy the results into the data model

		mySelf.setCovidAverageDistanceToPassengers(distances.stream().mapToDouble(d -> d).average().orElse(0.0));
		mySelf.setCovidMinimumDistanceToPassengers(distances.stream().mapToDouble(d -> d).min().orElse(0.0));

		mySelf.setCovidAverageDurationOfContacts(durations.stream().mapToDouble(d -> d).average().orElse(0.0));
		mySelf.setCovidMaximumDurationOfContact(durations.stream().mapToDouble(d -> d).max().orElse(0.0));

		mySelf.setCovidTotalNumberOfContacts(totalContactCounter);

	}

}
