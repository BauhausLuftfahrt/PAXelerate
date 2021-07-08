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

	private Map<Integer, ContactTracingMap> contactMap = new HashMap<>();
	private Passenger myself;
	private boolean isTracing = false;

	/**
	 * @param myID
	 */
	public ContactTracingHandler(Passenger me) {
		myself = me;
		isTracing = true;
	}

	/**
	 * @param passenger
	 * @param time
	 * @param distance
	 */
	public void addContact(int passengerID, double timestamp, double duration, double distance, State myState,
			State contactState) {

		// Don't tracking if the tracking has been completed already.
		if (!isTracing) {
			System.err.println("Contact tracing for passenger " + passengerID + " has been completed.");
			return;
		}

		// Don't add the contact if the resulting distance is larger than allowed
		if (distance > Agent.COVID_EXPOSURE_TRESHOLD) {
			return;
		}

		// Don't track the distance to yourself
		if (passengerID == myself.getId()) {
			return;
		}

		// Add an entry to the tracker map or create a new one
		if (contactMap.containsKey(passengerID)) {
			contactMap.get(passengerID).add(timestamp, duration, distance, myState, contactState);

		} else {
			contactMap.put(passengerID, new ContactTracingMap(timestamp, duration, distance, myState, contactState));
		}
	}

	/**
	 *
	 */
	public void toConsole() {

		for (Entry<Integer, ContactTracingMap> paxList : contactMap.entrySet()) {

			System.out.println("Contact with passenger " + paxList.getKey());

			for (Entry<Double, ContactTracingEvent> list : paxList.getValue().entrySet()) {

				System.out.println("TimeStamp =  " + list.getKey() + "ms, duration = " + list.getValue().getDuration()
						+ "s, distance =  " + list.getValue().getDistance() + "m, state = "
						+ list.getValue().getMyState() + ", contactState = " + list.getValue().getContactState());

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

		for (Entry<Integer, ContactTracingMap> paxList : contactMap.entrySet()) {

			totalContactCounter++;

			List<Double> contactDurations = new ArrayList<>();

			for (Entry<Double, ContactTracingEvent> list : paxList.getValue().entrySet()) {

				distances.add(list.getValue().getDistance());
				contactDurations.add(list.getValue().getDuration());

			}

			durations.add(contactDurations.stream().mapToDouble(d -> d).sum());

		}

		// Copy the results into the data model

		myself.setCovidAverageDistanceToPassengers(distances.stream().mapToDouble(d -> d).average().orElse(0.0));
		myself.setCovidMinimumDistanceToPassengers(distances.stream().mapToDouble(d -> d).min().orElse(0.0));

		myself.setCovidAverageDurationOfContacts(durations.stream().mapToDouble(d -> d).average().orElse(0.0));
		myself.setCovidMaximumDurationOfContact(durations.stream().mapToDouble(d -> d).max().orElse(0.0));

		myself.setCovidTotalNumberOfContacts(totalContactCounter);

	}

}
