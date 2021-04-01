/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import java.util.ArrayList;
import java.util.List;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.monuments.Aisle;
import com.paxelerate.model.monuments.MonumentsFactory;

import Cpacs.CabinAisleType;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringVectorExtensions;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface AisleExtensions {

	// CS 25.815 minimum aisle width in meter
	double CS25_AISLE_HEIGHT_THRESHOLD = 0.64;
	double CS25_AISLE_WIDTH_BELOW_THRESHOLD = 0.38;
	double CS25_AISLE_WIDTH_ABOVE_THRESHOLD = 0.51;

	/**
	 *
	 * @param cabin
	 * @param name
	 * @param aislePath
	 */
	static Aisle create(Deck deck, String name, List<EPoint> aislePath) {

		Aisle aisle = MonumentsFactory.eINSTANCE.createAisle();
		aisle.setName(name);
		aisle.setId(deck.getAisles().size());

		aisle.getPath().addAll(aislePath);

		aisle.setIgnoreForSimulation(name.contains("Cockpit"));

		deck.getAisles().add(aisle);

		return aisle;
	}

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void fromCPACS(Deck deck, CabinAisleType aisleType) {

		String name = aisleType.getName().getValue();

		List<Double> xValues = StringVectorExtensions.toDoubleList(aisleType.getX());
		List<Double> yValues = StringVectorExtensions.toDoubleList(aisleType.getY());

		List<EPoint> path = new ArrayList<>();

		for (int i = 0; i < xValues.size(); i++) {
			path.add(EPointExtensions.create(xValues.get(i), yValues.get(i), 0));
		}

		AisleExtensions.create(deck, name, path);
	}
}
