/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.util.Map;
import java.util.Map.Entry;

import com.paxelerate.execution.init.PassengerGenerator;
import com.paxelerate.model.Deck;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.monuments.Door;

import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;
import paxelerate.StudyType;

/**
 *
 * This command creates the passengers.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 *
 */

public interface GeneratePassengersAction {

	/**
	 * This method submits the cabin to be used in the file.
	 *
	 * @param cabin is the input parameter
	 */
	static void run(Deck deck, Map<TravelClass, Integer> amounts, StudyType input) {

		StopWatch watch = new StopWatch();

		Log.start("Generating " + amounts.entrySet().stream().mapToInt(Entry::getValue).sum() + " PAX");

		if (deck.getDoors().isEmpty()) {
			System.err.println();
			System.err.println("You can not continue without generating at least one door!");

		} else {

			for (Door door : deck.getDoors()) {
				door.getWaitingPassengers().clear();
			}

			/* remove current passengers and set seats free */
			deck.getPassengers().clear();

			PassengerGenerator.createAll(deck, amounts, input);
			watch.stop();
			Log.end(watch);
		}
	}
}
