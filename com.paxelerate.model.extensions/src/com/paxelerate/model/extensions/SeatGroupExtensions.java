/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.monuments.MonumentsFactory;
import com.paxelerate.model.monuments.Row;
import com.paxelerate.model.monuments.SeatGroup;

import Cpacs.DeckComponent2DBaseType;
import Cpacs.SeatElementType;
import Cpacs.SeatElementsType;
import net.bhl.opensource.toolbox.emf.EObjectHelper;

/**
 * @author Marc.Engelmann
 *
 */
public interface SeatGroupExtensions {

	/**
	 *
	 * @param row
	 * @param groupPosition
	 * @param groupSize
	 * @param seatDefinition
	 */
	static SeatGroup create(Row row, EPoint groupPosition, EPoint groupSize, String seatDefinition, TravelClass tc,
			int amount, char letter) {

		SeatGroup group = MonumentsFactory.eINSTANCE.createSeatGroup();
		group.setTravelClass(tc);
		row.getSeatGroups().add(group);

		group.setPosition(groupPosition);
		group.setSize(groupSize);

		SeatGroupExtensions.initSeats(amount, letter, group);

		return group;
	}

	/**
	 * @param amount
	 * @param group
	 */
	static void initSeats(int amount, char begin, SeatGroup group) {

		Deck deck = EObjectHelper.getParent(Deck.class, group);
		int currentAmount = group.getSeats().size();

		if (amount != currentAmount) {
			group.getSeats().clear();
		}

		for (int j = 0; j < amount; j++) {

			double sizeY = group.getSize().getY() / amount;
			double centerY = group.getPosition().getY() + j * group.getSize().getY() / amount + sizeY / 2.0;

			SeatLocation location;

			switch (amount) {
			case 1:
				// ALL AISLE_ELEMENT
				location = SeatLocation.AISLE;
				break;

			case 2:
				// BOTH AISLE_ELEMENT OR ONE AISLE_ELEMENT AND ONE WINDOW
				if (Math.abs(DeckExtensions.getMaximumSize(deck).getY() / 2.0) - Math.abs(centerY) < sizeY / 2.0
						+ AisleExtensions.CS25_AISLE_WIDTH_BELOW_THRESHOLD) {
					location = SeatLocation.WINDOW;
				} else {
					location = SeatLocation.AISLE;
				}
				break;

			default:
				// Seats which are not on the edge are definitely middle seats
				if (j > 0 && j < amount - 1) {
					location = SeatLocation.MIDDLE;
				} else {

					// If a seat is close to the window, it is a window seat, else its at the aisle.
					if (Math.abs(DeckExtensions.getMaximumSize(deck).getY() / 2.0) - Math.abs(centerY) < sizeY / 2.0
							+ AisleExtensions.CS25_AISLE_WIDTH_BELOW_THRESHOLD) {
						location = SeatLocation.WINDOW;
					} else {
						location = SeatLocation.AISLE;
					}
				}
				break;
			}

			if (amount != currentAmount) {
				// (char) (letters.charAt(0) + j)
				char newLetter = (char) (begin + j);

				if (newLetter >= 'I') {
					newLetter++;
				}
				SeatExtensions.create(newLetter, group, location);
			} else {
				group.getSeats().get(j).setSeatLocation(location);
			}
		}
	}

	/**
	 *
	 * @param cabin
	 * @param values
	 */

	static void fromCPACS(Deck deck, DeckComponent2DBaseType seatType, SeatElementsType seatTemplates) {

		SeatElementType template = seatTemplates.getSeatElement().stream()
				.filter(s -> s.getUID().contentEquals(seatType.getDeckElementUID().getValue())).findFirst().get();

		double x = seatType.getTransformation().getTranslation().getX().getValue();
		double y = seatType.getTransformation().getTranslation().getY().getValue();

		String seatDefinition = seatType.getName().getValue().substring(6);

		int rowValue = 0;
		String letters = "";

		for (char character : seatDefinition.toCharArray()) {
			if (Character.isDigit(character)) {
				int value = Character.getNumericValue(character);

				if (rowValue == 0) {
					rowValue = value;
				} else {
					rowValue = rowValue * 10 + value;
				}
			} else {
				letters = letters + character;
			}
		}

		// Create all yet not existing rows
		for (int i = 0; i < rowValue; i++) {
			try {
				deck.getRows().get(i);
			} catch (Exception e) {
				RowExtensions.create(deck);
			}
		}

		EPoint groupPosition = EPointExtensions.create(x, y);

		EPoint groupSize = EPointExtensions.create(template.getGeometry().getBoundingBox().getDeltaX().getValue(),
				template.getGeometry().getBoundingBox().getDeltaY().getValue(),
				template.getGeometry().getBoundingBox().getDeltaZ().getValue());

		TravelClass tc = TravelClassExtensions.getClassByCPACSLiteral(template.getDescription().getValue());

		int numberOfSeats = template.getNumberOfSeats().getValue().intValue();

		SeatGroup group = SeatGroupExtensions.create(deck.getRows().get(rowValue - 1), groupPosition, groupSize,
				seatDefinition, tc, numberOfSeats, letters.charAt(0));

	}

}
