/**
 * @author Marc.Engelmann
 *
 * @since 02.07.2021
 */
package com.paxelerate.core.sim.agent;

import java.util.HashMap;
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

		public Tracker(double time, double distance) {
			trackingList.put(time, distance);
		}

		public void add(double time, double distance) {
			trackingList.put(time, distance);
		}

		public Map<Double, Double> getList() {
			return trackingList;
		}
	}

//	public static double TRACING_TRIGGER_RADIUS = 0.5; // meters
//	public static double TRACING_TRIGGER_TIME = 10.0; // seconds

	private Map<Passenger, Tracker> contactMap = new HashMap<>();
	private int mySelf;

	public ContactTracer(int paxID) {
		mySelf = paxID;
	}

	/**
	 * @param passenger
	 * @param time
	 * @param distance
	 */
	public void addContact(Passenger passenger, double time, double distance) {

		if (passenger.getId() == mySelf) {
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
}
