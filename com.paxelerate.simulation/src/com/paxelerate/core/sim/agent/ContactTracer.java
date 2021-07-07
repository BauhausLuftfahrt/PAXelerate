/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.sim.agent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.paxelerate.model.agent.Passenger;

/**
 * A class for the contact tracing model.
 *
 * @author Marc.Engelmann
 * @since 02.07.2021
 *
 */
public class ContactTracer {

	class Tracker {

		private final Map<Double, Double> trackingList = new HashMap<>();

		Tracker(double time, double distance) {
			trackingList.put(time, distance);
		}

		void add(double time, double distance) {
			trackingList.put(time, distance);
		}

		Map<Double, Double> getList() {
			return trackingList;
		}
	}

//	public static double TRACING_TRIGGER_RADIUS = 0.5; // meters
//	public static double TRACING_TRIGGER_TIME = 10.0; // seconds

	private Map<Passenger, Tracker> contactMap = new HashMap<>();
	private Passenger mySelf;
	private boolean isTracing = false;

	public ContactTracer(Passenger pax) {
		mySelf = pax;

		isTracing = true;
	}

	/**
	 * @param passenger
	 * @param time
	 * @param distance
	 */
	public void addContact(Passenger passenger, double time, double distance) {

		if (!isTracing) {
			System.err.println("Contact tracing for passenger " + passenger.getId() + " has been completed.");
		}

		if (passenger.getId() == mySelf.getId()) {
			return;
		}

		if (contactMap.containsKey(passenger)) {
			contactMap.get(passenger).add(time, distance);
		} else {

			contactMap.put(passenger, new Tracker(time, distance));

		}

	}

	/**
	 *
	 */
	public void toConsole() {

		for (Entry<Passenger, Tracker> paxList : contactMap.entrySet()) {

			System.out.println("Contact with passenger " + paxList.getKey().getId());

			for (Entry<Double, Double> list : paxList.getValue().getList().entrySet()) {

				System.out.println(list.getKey() + ": " + list.getValue());

			}
		}
	}

	/**
	 * @return
	 */
	public Map<Passenger, Tracker> getAllContacts() {
		return contactMap;
	}

	/**
	 * Run the final contact evaluation. Only do this when the tracing is finished!
	 *
	 * @param passenger
	 * @param speedfactor
	 */
	public void evaluateContactTracing(double speedfactor) {

		if (mySelf.getId() == 1) {
			toConsole();
		}

		isTracing = false;

		double totalContactCounter = 0;

		List<Double> distances = new ArrayList<>();
		List<Double> durations = new ArrayList<>();

		for (Entry<Passenger, Tracker> paxList : getAllContacts().entrySet()) {

			totalContactCounter++;

//			List<Double> contactDistances = new ArrayList<>();
			List<Double> contactTimeStamps = new ArrayList<>();

			for (Entry<Double, Double> list : paxList.getValue().getList().entrySet()) {

				distances.add(list.getValue());
				contactTimeStamps.add(list.getKey());

			}

//			distances.add(contactDistances.stream().mapToDouble(d -> d).average().getAsDouble());

			contactTimeStamps.sort(Comparator.comparing(ts -> ts));
			durations.add((contactTimeStamps.get(contactTimeStamps.size() - 1) - contactTimeStamps.get(0)) * speedfactor
					/ 1000.0);

		}

		// Copy the results into the data model

		mySelf.setCovidAverageDistanceToPassengers(distances.stream().mapToDouble(d -> d).average().orElse(0.0));
		mySelf.setCovidMinimumDistanceToPassengers(distances.stream().mapToDouble(d -> d).min().orElse(0.0));

		mySelf.setCovidAverageDurationOfContacts(durations.stream().mapToDouble(d -> d).average().orElse(0.0));
		mySelf.setCovidMaximumDurationOfContact(durations.stream().mapToDouble(d -> d).max().orElse(0.0));

		mySelf.setCovidTotalNumberOfContacts(totalContactCounter);

	}

}
