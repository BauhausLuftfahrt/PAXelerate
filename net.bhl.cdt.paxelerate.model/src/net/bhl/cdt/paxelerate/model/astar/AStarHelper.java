/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import net.bhl.cdt.paxelerate.model.Passenger;


/**
 * This class is a helper class for the A* Algorithm.
 *
 * @author marc.engelmann
 */
public class AStarHelper {
	
	/**
	 * Lowest value in hash map.
	 *
	 * @param pax the pax
	 * @param hashmap the hashmap
	 * @return true, if successful
	 */
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

	/**
	 * Passenger already in list.
	 *
	 * @param pax the pax
	 * @param list the list
	 * @return true, if successful
	 */
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
}
