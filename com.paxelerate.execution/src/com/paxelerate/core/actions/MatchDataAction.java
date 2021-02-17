/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.core.actions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import com.paxelerate.core.keys.ImportKeys;
import com.paxelerate.model.Model;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.monuments.Door;

import net.bhl.opensource.toolbox.emf.EObjectParser;
import net.bhl.opensource.toolbox.io.DataSet;
import net.bhl.opensource.toolbox.io.Log;

/**
 * @author Marc.Engelmann
 * @since 18.01.2019
 *
 */
public class MatchDataAction {

	private static Map<TravelClass, Integer> amounts = new HashMap<>();

	/**
	 * @param aircraft
	 * @param csv
	 * @return
	 */
	public static Map<TravelClass, Integer> run(Model model, DataSet data) {

		// Add all objects which should be loaded into the array
		final EObject[] objects = {

				model.getSettings(),

				model.getSettings().getPassengerProperties(),

				model.getSettings().getLuggageProperties()

		};

		// Parse all settings from the CSV file and try custom settings after that
		for (final Entry<String, Object> pair : EObjectParser.execute(data, objects)) {
			applyCustomSetting(pair, model);
		}

		return amounts;
	}

	/**
	 * Find settings by specific keywords and apply a setting manually.
	 *
	 * @param key
	 */
	private static void applyCustomSetting(Entry<String, Object> pair, Model model) {

		// Switch depending on key word
		switch (pair.getKey()) {

		case ImportKeys.ACTIVE_DOORS:

			// Read the door IDs into a integer list.
			List<Integer> activeDoorIDs = Arrays.asList(String.valueOf(pair.getValue()).split(",")).stream()
					.mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());

			// Loop through all the doors and look for the door IDs.
			for (Door door : model.getDeck().getDoors()) {
				door.setActive(activeDoorIDs.contains(door.getId()));
			}
			break;

		case ImportKeys.PASSENGERS_LOAD_FACTOR:

			// Loop through all classes and generate passengers by load factor.
			for (TravelClass tc : DeckExtensions.getExistingClasses(model.getDeck())) {
				double factor;
				try {
					factor = (Double) pair.getValue();
				} catch (ClassCastException e) {
					factor = (Integer) pair.getValue();
				}

				amounts.put(tc, (int) Math.round(factor * DeckExtensions.getSeatPerClass(model.getDeck(), tc)));
			}
			break;

		default:
			Log.printInfoLine("No custom match found", "'" + pair.getKey() + "'");
			break;
		}
	}

}
