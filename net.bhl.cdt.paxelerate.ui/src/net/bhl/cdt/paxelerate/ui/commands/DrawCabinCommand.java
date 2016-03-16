/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.util.ArrayList;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.PropertyViewPart;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class DrawCabinCommand extends CDTCommand {

	private Cabin cabin;
	private CabinViewPart cabinViewPart;
	private PropertyViewPart propertyViewPart;
	private ArrayList<String> errorStrings = new ArrayList<String>();

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public DrawCabinCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected void doRun() {

		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */
		SimulationProperties settings = cabin.getSimulationSettings();

		if (settings == null) {
			settings = CabinFactory.eINSTANCE.createSimulationProperties();
			cabin.setSimulationSettings(settings);
		}

		LuggageProperties luggageSettings = cabin.getSimulationSettings().getLuggageProperties();

		if (luggageSettings == null) {
			luggageSettings = CabinFactory.eINSTANCE.createLuggageProperties();
			cabin.getSimulationSettings().setLuggageProperties(luggageSettings);
		}

		PassengerProperties paxSettings = cabin.getSimulationSettings().getPassengerProperties();

		if (paxSettings == null) {
			paxSettings = CabinFactory.eINSTANCE.createPassengerProperties();
			cabin.getSimulationSettings().setPassengerProperties(paxSettings);
		}

		double[] luggagemodel = { luggageSettings.getPercentageOfPassengersWithNoLuggage(),
				luggageSettings.getPercentageOfPassengersWithSmallLuggage(),
				luggageSettings.getPercentageOfPassengersWithMediumLuggage(),
				luggageSettings.getPercentageOfPassengersWithBigLuggage() };

		if ((luggagemodel[0] + luggagemodel[1] + luggagemodel[2] + luggagemodel[3]) == 0) {
			cabin.getSimulationSettings().getLuggageProperties().setPercentageOfPassengersWithNoLuggage(100);
		}

		cabinViewPart = ViewPartHelper.getCabinView();

		repairBoardingClassAssignments();
		repairRowAssignments();
		repairSeatAssignments();
		checkPassengerAssignments();
		checkForConstructionErrors();
		checkFoldableSeats();
		updateTravelClassProperties();

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		propertyViewPart = (PropertyViewPart) page.findView("net.bhl.cdt.paxelerate.ui.propertyview");

		for (String str : errorStrings) {
			Log.add(this, str);
		}
		try {
			propertyViewPart.updateUI(cabin);
		} catch (NullPointerException e) {
			Log.add(this, "No property view is visible!");
		}

		try {
			cabinViewPart.setCabin(cabin);
			Log.add(this, "Cabin view checked and updated");
		} catch (NullPointerException e) {
			Log.add(this, "No cabin view is visible!");
		}

		/*
		 * TODO: this is a test for storing the cabin object! It crashes the
		 * model explorer.
		 * 
		 */

		// ModelPersistor.store(cabin);
		// ModelPersistor.store(cabin.getSimulationSettings());
	}

	private void repairBoardingClassAssignments() {
		int i = 1;
		for (TravelClass tc : cabin.getClasses()) {
			tc.setSequence(i);
			i++;
		}
	}

	private void checkFoldableSeats() {
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
			if (cabin.getSimulationSettings().isBringYourOwnSeat()) {
				seat.setCurrentlyFolded(true);
			} else if (cabin.getSimulationSettings().isUseFoldableSeats()) {
				if (seat.getLetter().contains("D")) {
					seat.setCurrentlyFolded(true);
				} else {
					seat.setCurrentlyFolded(false);
				}
			} else {
				seat.setCurrentlyFolded(false);
			}
		}
	}

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

				int loadFactor = (int) (travelclass.getPassengers() * 100.0 / travelclass.getAvailableSeats());
				travelclass.setLoadFactor(loadFactor);
			}
		}
	}

	private void repairRowAssignments() {
		int i = 1;
		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {

			row.setRowNumber(i);
			i++;
		}
	}

	private void checkPassengerAssignments() {
		double passengersPerMinute = 30;
		int i = 0;
		for (Passenger passenger : cabin.getPassengers()) {
			Seat seat = passenger.getSeatRef();

			seat.setPassenger(passenger);

			if (passenger.getSeat() != seat.getId()) {
				passenger.setSeat(seat.getId());
				passenger.setName(passenger.getId() + " (" + seat.getName() + ")");
			}
			passenger.setTravelClass(ModelHelper.getParent(TravelClass.class, seat));
			passenger.setStartBoardingAfterDelay(i * 60 / passengersPerMinute);
			i++;
		}
	}

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