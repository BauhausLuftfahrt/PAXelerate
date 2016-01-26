package com.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.paxelerate.model.Passenger;

public class AStarTools {
	public static boolean lowestValueInHashMap(Passenger pax,
			HashMap<Passenger, Integer> hashmap) {
		int lowestValue = Integer.MAX_VALUE;
		Passenger lowestPax = null;
		for (Entry<Passenger, Integer> entry : hashmap.entrySet()) {
			if (lowestValue > entry.getValue()) {
				lowestValue = entry.getValue();
				lowestPax = entry.getKey();
			}
		}

		if (pax.getId() == lowestPax.getId()) {
			return true;
		} else {
			return false;
		}
	}

	public synchronized static boolean PassengerAlreadyInList(Passenger pax,
			ArrayList<Passenger> list) {
		if (list != null) {
			for (Passenger pass : list) {
				if (pass.getId() == pax.getId()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * This method transforms the time for use in "Thread.sleep()" according to
	 * the speed factor. CAUTION! Time input in seconds only!
	 * 
	 * @param timeInSeconds
	 *            time in seconds
	 * @return transformed time in milliseconds
	 */
	public static long time(double timeInSeconds) {
		double value = timeInSeconds
				* 1000.0
				/ SimulationHandler.getCabin().getSimulationSettings()
						.getSimulationSpeedFactor();
		if (value < 1) {
			value = 1;
		}
		return (long) value;
	}

	// TODO NullPointer handling überarbeiten
	public static int size(double size) {
		try {
			return (int) (size / SimulationHandler.getCabin().getScale());
		} catch (NullPointerException e) {
			//return (int) (size / ShouldSoonBeDeletedWhenSolved.getCabinView()s.getCabin().getScale());
			return 5; // DIRTY FIX has no meaning
		}
	}
}
