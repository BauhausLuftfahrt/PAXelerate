/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;

import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.extensions.AisleExtensions;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.MonumentExtensions;
import com.paxelerate.model.extensions.SeatGroupExtensions;
import com.paxelerate.model.monuments.Row;
import com.paxelerate.model.monuments.Seat;

import Cpacs.AircraftModelType;
import Cpacs.CpacsType;
import Cpacs.DeckType;
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;
import net.bhl.opensource.toolbox.ui.IOptionSelector;

/**
 * This class generates a cabin from a CPACS file.
 *
 * @author Marc.Engelmann
 *
 */

public interface InitializeFromCPACSAction {

	/**
	 *
	 * @param filepath
	 * @return
	 */
	static void run(CpacsType cpacs, Model model) {

		StopWatch watch = new StopWatch();
		Log.start("Loading Model");

		// create new cabin object where monuments are added to at first

		AircraftModelType modelType = EObjectHelper.getChildren(cpacs, AircraftModelType.class).get(0);

		model.setName(modelType.getUID());

		switch (EObjectHelper.getChildren(modelType, DeckType.class).size()) {

		case 0:

			throw new NullPointerException("No CPACS deck node found!");

		case 1:
			model.setDeck(InitializeFromCPACSAction
					.performInitialization(EObjectHelper.getChildren(modelType, DeckType.class).get(0)));
			break;

		default:
			List<String> ids = new ArrayList<>();

			for (DeckType deckType : EObjectHelper.getChildren(modelType, DeckType.class)) {
				ids.add(deckType.getUID());
			}

			IOptionSelector
					.getValue(ids,
							"Select deck ...")
					.ifPresent(result -> model.setDeck(InitializeFromCPACSAction.performInitialization(EObjectHelper
							.getFilteredChildren(modelType, DeckType.class, d -> d.getUID().contentEquals(result))
							.get(0))));
			break;

		}

		watch.stop();
		Log.end(watch);
	}

	/**
	 * Loop through one CPACS deck element.
	 *
	 * @param cabin
	 * @param element
	 * @return
	 */
	static Deck performInitialization(DeckType deckType) {

		Deck deck = DeckExtensions.fromCPACS(deckType);

		// Deck geometry
		DeckExtensions.geometryFromCPACS(deck, deckType);

		deckType.getSeatElements().getSeatElement().forEach(s -> SeatGroupExtensions.fromCPACS(deck, s));
		deckType.getFloorElements().getFloorElement().forEach(f -> MonumentExtensions.fromCPACS(deck, f));
		deckType.getDoors().getDoor().forEach(d -> DoorExtensions.fromCPACS(deck, d));
		deckType.getAisles().getAisle().forEach(a -> AisleExtensions.fromCPACS(deck, a));

		// Sort seat groups per row
		for (Row row : EObjectHelper.getChildren(deck, Row.class)) {

			// Sort seats per group
			row.getSeatGroups().forEach(g -> ECollections.sort(g.getSeats(), Comparator.comparing(Seat::getLetter)));

			ECollections.sort(row.getSeatGroups(), Comparator.comparing(s -> s.getPosition().getY()));
		}

		// Sort rows per class
		ECollections.sort(deck.getRows(), Comparator.comparing(row -> row.getSeatGroups().get(0).getPosition().getX()));

		return deck;
	}

}