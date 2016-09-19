/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.command.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.util.PassengerGenerator;
import net.bhl.cdt.paxelerate.util.string.StringHelper;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 * @since 0.5
 *
 */

public class RefreshCabinView {

	/** The cabin. */
	private Cabin cabin;

	/** The error strings. */
	private ArrayList<String> errorStrings = new ArrayList<String>();

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public RefreshCabinView(final Cabin cabin) {
		this.cabin = cabin;
	}

	public ArrayList<String> performCabinViewRefresh () {

		repairBoardingClassAssignments();
		repairRowAssignments();
		repairSeatAssignments();
		checkPassengerAssignments();
		checkForConstructionErrors();
		checkFoldableSeats();
		updateTravelClassProperties();
		
		return errorStrings;
	}

	/**
	 * Repair boarding class assignments.
	 */
	private void repairBoardingClassAssignments() {
		int i = 1;
		for (TravelClass tc : cabin.getClasses()) {
			tc.setSequence(i);
			i++;
		}
	}

	/**
	 * Check foldable seats.
	 */
	private void checkFoldableSeats() {
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {

			/* Bring your own seat */
			if (cabin.getSimulationSettings().getLayoutConcept() == LayoutConcept.BRING_YOUR_OWN_SEAT) {
				seat.setLayoutConcept(LayoutConcept.SIDWAYS_FOLDABLE_SEAT);

			// TODO: arbitrary seat abreast
				/* Sideways foldable seat */
			} else if (cabin.getSimulationSettings().getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT) {
				/* Aisle seats are set foldable */
				if (seat.getLetter().contains("C")) {
					seat.setLayoutConcept(LayoutConcept.SIDWAYS_FOLDABLE_SEAT);
				} else if (seat.getLetter().contains("D")) {
					seat.setLayoutConcept(LayoutConcept.SIDWAYS_FOLDABLE_SEAT);
				} else {
					seat.setLayoutConcept(LayoutConcept.DEFAULT);
				}

				/* Lifting seat pan */
			} else if (cabin.getSimulationSettings().getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS) {
				/* Aisle seats are set foldable */
				if (seat.getLetter().contains("C")) {
					seat.setLayoutConcept(LayoutConcept.LIFTING_SEAT_PAN_SEATS);
				} else if (seat.getLetter().contains("D")) {
					seat.setLayoutConcept(LayoutConcept.LIFTING_SEAT_PAN_SEATS);
				} else {
					seat.setLayoutConcept(LayoutConcept.DEFAULT);
				}
			} else {
				seat.setLayoutConcept(LayoutConcept.DEFAULT);
			}
		}
	}

	/**
	 * Update travel class properties.
	 */
	private void updateTravelClassProperties() {
		for (TravelClass travelclass : cabin.getClasses()) {

			// set number of seats
			int numberSeats = ModelHelper.getChildrenByClass(travelclass, Seat.class).size();
			travelclass.setAvailableSeats(numberSeats);

			// calculate load factor and number of passengers
			if (travelclass.getPassengers() == 0 && travelclass.getLoadFactor() != 0) {

				int numberOfPax = (int) (travelclass.getAvailableSeats() * travelclass.getLoadFactor() / 100.0);
				travelclass.setPassengers(numberOfPax);
			} else {

				double loadFactor = Math.round(travelclass.getPassengers() * 100.0 / travelclass.getAvailableSeats());
				travelclass.setLoadFactor(loadFactor);
			}
		}
	}

	/**
	 * Repair row assignments.
	 */
	private void repairRowAssignments() {
		int i = 1;
		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {

			row.setRowNumber(i);
			i++;
		}
	}

	/**
	 * Check passenger assignments.
	 */
	private void checkPassengerAssignments() {

		Map<Integer, Double> delays = new HashMap<>();

		for (Passenger passenger : cabin.getPassengers()) {
			Seat seat = passenger.getSeat();

			seat.setPassenger(passenger);

			if (passenger.getSeatID() != seat.getId()) {
				passenger.setSeatID(seat.getId());
				passenger.setName(passenger.getId() + " (" + seat.getName() + ")");
			}
			passenger.setTravelClass(ModelHelper.getParent(TravelClass.class, seat));

			PassengerGenerator.applyDelay(passenger, delays);

			// TODO: CONTINUE THIS!
			// LuggageProperties lugg =
			// cabin.getSimulationSettings().getLuggageProperties();
			// double time = passenger.getLuggageStowTime();
			//
			// switch (passenger.getLuggage()) {
			//
			// case BIG:
			// if (time != lugg.)
			// break;
			// case MEDIUM:
			// break;
			// case SMALL:
			// break;
			// case NONE:
			// break;
			//
			// }

		}
	}

	/**
	 * Repair seat assignments.
	 */
	private void repairSeatAssignments() {

		int seatCount = 1;
		int seatInRowCount = 1;
		int currentRow = 0;

		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {

			seat.setId(seatCount);

			TravelClass tc = ModelHelper.getParent(TravelClass.class, seat);
			Row row = ModelHelper.getParent(Row.class, seat);

			if (row.getRowNumber() != currentRow) {
				seatInRowCount = 1;
				currentRow = row.getRowNumber();
			}

			seat.setTravelClass(tc);
			seat.setRow(row);
			seat.setName(seat.getRow().getRowNumber() + StringHelper.toString(seatInRowCount));
			seat.setLetter(StringHelper.toString(seatInRowCount));
			seat.setYDimension(tc.getYDimensionOfSeats());
			seat.setXDimension(tc.getXDimensionOfSeats());

			seatCount++;
			seatInRowCount++;
		}

		System.out.println("Seat IDs reassigned.");
	}

	/**
	 * Check cabin out of bounds.
	 *
	 * @return the boolean
	 */
	private Boolean checkCabinOutOfBounds() {
		for (PhysicalObject object : ModelHelper.getChildrenByClass(cabin, PhysicalObject.class)) {
			if (object.getYPosition() < 0 || object.getXPosition() < 0
					|| (object.getYPosition() + object.getYDimension()) > cabin.getYDimension()
					|| (object.getXPosition() + object.getXDimension()) > cabin.getXDimension()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Check too many seats in row.
	 */
	private void checkTooManySeatsInRow() {

		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {
			int numberOfSeats = row.getSeats().size();

			String rowString = row.getSeats().get(0).getTravelClass().getRowStructure();

			int seatsPerRow = 0;

			String[] rowParts = rowString.split("-");
			for (String str : rowParts) {
				seatsPerRow += Integer.parseInt(str);
			}

			if (numberOfSeats > seatsPerRow) {
				errorStrings.add("There are too many seats in row #" + row.getRowNumber() + "!");
			}
			if (numberOfSeats < seatsPerRow) {
				errorStrings.add("There are too few seats in row #" + row.getRowNumber() + "!");
			}
		}
	}

	/**
	 * Check for construction errors.
	 */
	private void checkForConstructionErrors() {

		if (checkCabinOutOfBounds()) {
			errorStrings.add("Cabin out of bounds!");
		}

		checkTooManySeatsInRow();

		if (errorStrings.isEmpty()) {
			errorStrings.add("No issues detected!");
		}
	}
}