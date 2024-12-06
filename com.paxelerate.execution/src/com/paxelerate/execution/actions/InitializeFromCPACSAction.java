/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.util.Comparator;

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
import Cpacs.DeckElementsType;
import Cpacs.DeckType;
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;

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
	static void run(CpacsType cpacs, Model model, String deckUID) {

		StopWatch watch = new StopWatch();
		Log.start("Loading '" + deckUID + "'.");

		// create new cabin object where monuments are added to at first

		AircraftModelType modelType = EObjectHelper.getChildren(cpacs, AircraftModelType.class).get(0);

		model.setName(modelType.getUID());

		DeckElementsType deckElements = cpacs.getVehicles().getDeckElements();

		DeckType deck = EObjectHelper.getFilteredChildren(cpacs, DeckType.class, d -> d.getUID().contentEquals(deckUID))
				.get(0);

		model.setDeck(InitializeFromCPACSAction.performInitialization(deck, deckElements));

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
	static Deck performInitialization(DeckType deckType, DeckElementsType deckElements) {

		Deck deck = DeckExtensions.fromCPACS(deckType);

		// Deck geometry
		DeckExtensions.geometryFromCPACS(deck, deckType);

		if (deckType.getSeatModules() != null) {
			deckType.getSeatModules().getSeatModule()
					.forEach(s -> SeatGroupExtensions.fromCPACS(deck, s, deckElements.getSeatElements()));
		}

		if (deckType.getGalleys() != null) {
			deckType.getGalleys().getGalley()
					.forEach(f -> MonumentExtensions.galleyfromCPACS(deck, f, deckElements.getGalleyElements()));
		}

		if (deckType.getLavatories() != null) {
			deckType.getLavatories().getLavatory()
					.forEach(f -> MonumentExtensions.lavatoryFromCPACS(deck, f, deckElements.getLavatoryElements()));
		}

		if (deckType.getLuggageCompartments() != null) {
			deckType.getLuggageCompartments().getLuggageCompartment().forEach(
					f -> MonumentExtensions.luggageFromCPACS(deck, f, deckElements.getLuggageCompartmentElements()));
		}

		if (deckType.getClassDividers() != null) {
			deckType.getClassDividers().getClassDivider()
					.forEach(f -> MonumentExtensions.dividerFromCPACS(deck, f, deckElements.getClassDividerElements()));
		}

		if (deckType.getDeckDoors() != null) {
			deckType.getDeckDoors().getDeckDoor().forEach(d -> DoorExtensions.fromCPACS(deck, d));
		}

		if (deckType.getAisles() != null) {
			deckType.getAisles().getAisle().forEach(a -> AisleExtensions.fromCPACS(deck, a));
		}

		// Sort seat groups per row
		for (Row row : EObjectHelper.getChildren(deck, Row.class)) {

			// Sort seats per group
			row.getSeatGroups().forEach(g -> ECollections.sort(g.getSeats(), Comparator.comparing(Seat::getLetter)));

			ECollections.sort(row.getSeatGroups(), Comparator.comparing(s -> s.getPosition().getY()));

			if (row.getSeatGroups().isEmpty()) {
				deck.getRows().remove(row);
				// TODO: This should not happen!
			}
		}

		// Sort rows per class
		ECollections.sort(deck.getRows(), Comparator.comparing(row -> row.getSeatGroups().get(0).getPosition().getX()));

		return deck;
	}

}