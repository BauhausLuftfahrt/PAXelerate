/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.execution.init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.AgentFactory;
import com.paxelerate.model.agent.Luggage;
import com.paxelerate.model.enums.LuggageType;
import com.paxelerate.model.extensions.LuggageExtensions;
import com.paxelerate.model.settings.LuggageProperties;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.random.RandomHelper;
import toolspecific.StudyType;

/**
 * The Luggage Generator.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 *
 */

public interface LuggageGenerator {

	static List<Luggage> create(Deck deck, StudyType input) {

		// Create a luggage percentage list
		List<Luggage> luggageList = new ArrayList<>();
		LuggageProperties settings = EObjectHelper.getParent(Model.class, deck).getSettings().getLuggageProperties();

		int pax = deck.getPassengers().size();

		// Determine the percentages
		double jackets = input.getPercentageOfPassengersWithJackets().getValue();
		double largeBags = input.getPercentageOfPassengersWithSmallBags().getValue();
		double mediumBags = input.getPercentageOfPassengersWithMediumBags().getValue();
		double smallBags = input.getPercentageOfPassengersWithLargeBags().getValue();

		// Calculate the no luggage percentage
		if (100.0 - (jackets + smallBags + mediumBags + largeBags) < 0.0) {
			throw new IllegalArgumentException(
					"Passenger Generator: Error in luggage percentages! Value greater than 100%!");
		}

		// int totalPaxWithLuggage = (int) Math.round(noLuggage / 100.0 *
		// cabin.getPassengers().size());
		//
		// // TODO: ADAPT THIS! Now every PAX gets max amount of luggage
		// int totalLuggage = totalPaxWithLuggage; // *
		// //
		// cabin.getSettings().getLuggageProperties().getMaxNumberOfLuggageItemsPerPax();

		for (int i = 0; i < jackets / 100.0 * pax; i++) {
			luggageList.add(createItem(LuggageType.JACKET, settings));
		}

		for (int i = 0; i < smallBags / 100.0 * pax; i++) {
			luggageList.add(createItem(LuggageType.SMALL_BAG, settings));
		}

		for (int i = 0; i < mediumBags / 100.0 * pax; i++) {
			luggageList.add(createItem(LuggageType.MEDIUM_BAG, settings));
		}

		for (int i = 0; i < largeBags / 100.0 * pax; i++) {
			luggageList.add(createItem(LuggageType.LARGE_BAG, settings));
		}

		Collections.shuffle(luggageList);

		// Check rounding error
		while (luggageList.size() > deck.getPassengers().size()) {
			luggageList.remove(0);
		}

		return luggageList;
	}

	/**
	 *
	 * @return
	 */
	static Luggage createItem(LuggageType type, LuggageProperties settings) {
		Luggage item = AgentFactory.eINSTANCE.createLuggage();
		item.setId(RandomHelper.randomInt());
		item.setType(type);
		item.setVolume(LuggageExtensions.adaptVolume(settings, type));
		item.setStowTime(LuggageExtensions.adaptStowTime(settings, type));
		return item;
	}
}