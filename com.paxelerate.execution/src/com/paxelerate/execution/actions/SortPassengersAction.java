/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import com.paxelerate.execution.init.PassengerSorter;
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
