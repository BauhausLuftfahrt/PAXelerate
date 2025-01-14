/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;

import com.paxelerate.model.Deck;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.DoorSide;
import com.paxelerate.model.enums.DoorType;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.MonumentsFactory;

import Cpacs.DeckDoorType;
import Cpacs.DoorOpeningLegacyType;
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.Distance;
import net.bhl.opensource.toolbox.math.GlobalUnits;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface DoorExtensions {

	String CPACS_DOOR_TYPE_EMERGENCY_LITERAL = "evacuation";
	String CPACS_DOOR_TYPE_BOARDING_LITERAL = "boarding";
	String CPACS_DOOR_SIDE_STARBOARD_LITERAL = "starboard";
	String CPACS_DOOR_SIDE_PORT_LITERAL = "port";

	/**
	 *
	 * @param cabin
	 * @param description
	 * @param xPosition
	 * @param width
	 * @param side
	 */
	static Door create(Deck deck, DoorType type, double xPosition, double width, DoorSide side, boolean emergency,
			double zPosition, String uid) {

		Door door = MonumentsFactory.eINSTANCE.createDoor();
		door.setEmergencyOnly(emergency);

		door.setType(type);
		door.setSide(side);
		door.setId(uid);
		door.setXPosition(xPosition);
		door.setPassengerThroughputPerMinute(18);

		deck.getDoors().add(door);
		return door;
	}
//
//	/**
//	 * @param deck
//	 * @param xPosition
//	 * @param type
//	 * @param side
//	 */
//	static Door create(Deck deck, double xPosition, DoorType type, DoorSide side) {
//		return create(deck, type, xPosition, getWidth(type), side, false, 0);
//	}

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void fromCPACS(Deck deck, DeckDoorType doorType) {

		String typeStr = doorType.getName().getValue() == null ? DoorType.A.getLiteral()
				: doorType.getName().getValue();

		DoorType type = DoorType.get(typeStr.replace("Type ", ""));

		DoorOpeningLegacyType doorOpening = doorType.getOpening().getDoorOpeningLegacy();

		double xPosition = doorOpening.getX().getValue();
		double zPosition = doorOpening.getZ() != null ? doorOpening.getZ().getValue() : 0.0;
		double width = doorOpening.getWidth().getValue();

		boolean emergency = doorType.getDoorType().getValue().contentEquals(CPACS_DOOR_TYPE_EMERGENCY_LITERAL)
				|| doorType.getDoorType().getValue().contains("emergency");

		DoorSide side = DoorSide.PORT;

		if (doorOpening.getSide().getValue().contentEquals(CPACS_DOOR_SIDE_STARBOARD_LITERAL)) {
			side = DoorSide.STARBOARD;
		}

		// Multiply by 100 because of different units. (CPACS: Meters, PAXelerate:
		// Centimeters). Minus xZero as the position is referenced to global CoSy.
		DoorExtensions.create(deck, type, xPosition, width, side, emergency, zPosition, doorType.getUID()); // -
																											// deck.getX0()
	}

	/**
	 * @param door
	 * @return
	 */
	static Double getSafetyAreaYDimension(Door door) {
		return DeckExtensions.getShapeYDimensionAtX(EObjectHelper.getParent(Deck.class, door),
				door.getXPosition() + DoorExtensions.getWidth(door) / 2.0);
	}

	/**
	 *
	 * @param doors
	 * @return
	 */
	static List<Door> getActiveDoors(Deck deck) {
		return deck.getDoors().stream().filter(Door::isActive).collect(Collectors.toList());
	}

	/**
	 *
	 * @param list
	 * @param passenger
	 * @return
	 */
	static Door getClosestDoor(List<Door> list, Passenger passenger) {

		if (list == null) {
			list = DoorExtensions.getActiveDoors(DeckExtensions.getBy(passenger));
		}

		/* Sort doors by distance to seat */
		Collections.sort(list,
				(door1, door2) -> SeatExtensions
						.getDistanceBetween(new DoubleVector(door1.getXPosition(), DoorExtensions.getYPosition(door1)),
								passenger.getSeat())
						.compareTo(SeatExtensions.getDistanceBetween(
								new DoubleVector(door2.getXPosition(), DoorExtensions.getYPosition(door2)),
								passenger.getSeat())));

		/* Return the closest door */
		return list.get(0);
	}

	/**
	 *
	 * @param list
	 * @param passenger
	 * @return
	 */
	static Door getClosestDoor(Deck deck, DoubleVector position) {

		ECollections.sort(deck.getDoors(),
				Comparator.comparing(d -> Distance.distanceBetween(d.getXPosition() + DoorExtensions.getWidth(d) / 2.0,
						DoorExtensions.getYPosition(d), position.getX(), position.getY())));
		return deck.getDoors().get(0);
	}

	/**
	 * @param door
	 * @return
	 */
	static double getYDimension(Door door) {
		return 0.25;
	}

	/**
	 *
	 * @param door
	 * @return
	 */
	static double getYPosition(Door door) {

		double YPositionOfDeckShape = DeckExtensions.getShapeYDimensionAtX(EObjectHelper.getParent(Deck.class, door),
				door.getXPosition() + DoorExtensions.getWidth(door) / 2.0);

		double factor = -1;

		if (door.getSide() == DoorSide.STARBOARD) {
			factor = 1;
		}

		return factor * YPositionOfDeckShape;
	}

	/**
	 * @param door
	 * @return
	 */
	static double getWidth(Door door) {
		return getWidth(door.getType());
	}

	/**
	 * Get door width in cm
	 *
	 * @param door
	 * @return
	 */
	static double getWidth(DoorType type) {

		double inches = 0;

		switch (type) {
		case A:
			inches = 42;
			break;
		case B:
			inches = 32;
			break;
		case C:
			inches = 30;
			break;
		case I:
			inches = 24;
			break;
		case II:
			inches = 20;
			break;
		case III:
			inches = 20;
			break;
		case IV:
			inches = 19;
			break;
		}

		return inches * GlobalUnits.METER_PER_INCH;
	}
}
