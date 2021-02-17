/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.core.actions;

import com.paxelerate.core.init.PassengerSorter;
import com.paxelerate.model.Deck;
import com.paxelerate.model.enums.SortingScheme;

import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;

/**
 * This class is used for sorting the Passenger.class objects depending on
 * predefined criteria.
 *
 * @author Marc.Engelmann
 */

public interface SortPassengersAction {

	/**
	 *
	 * @param cabin
	 * @param sortingScheme
	 */
	static void sort(Deck deck, SortingScheme sortingScheme) {

		StopWatch watch = new StopWatch();
		Log.start("Sorting " + sortingScheme.toString());
		PassengerSorter.sort(deck, sortingScheme);
		watch.stop();
		Log.end(watch);

	}

}
