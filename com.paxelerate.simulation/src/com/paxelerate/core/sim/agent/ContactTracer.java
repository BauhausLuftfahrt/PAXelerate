/**
 * @author Marc.Engelmann
 *
 * @since 02.07.2021
 */
package com.paxelerate.core.sim.agent;

import java.util.HashMap;

import com.paxelerate.model.agent.Passenger;

/**
 * A class for the contact tracing model.
 *
 * @author Marc.Engelmann
 * @since 02.07.2021
 *
 */
public class ContactTracer {

	public static double TRACING_TRIGGER_RADIUS = 0.5; // meters
	public static double TRACING_TRIGGER_TIME = 10.0; // seconds

	private Passenger passenger;
	private boolean didContactOccur = false;
	private HashMap<Double, Double> distanceTracker = null;
	private boolean currentlyActive = false;

	public ContactTracer() {

	}

}
