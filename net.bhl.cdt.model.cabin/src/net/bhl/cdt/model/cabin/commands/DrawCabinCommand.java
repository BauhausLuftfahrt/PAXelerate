/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PhysicalObject;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.SimulationProperties;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.PropertyViewPart;
import net.bhl.cdt.model.cabin.util.ShouldSoonBeDeletedWhenSolved;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.paxelerate.util.Func;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class DrawCabinCommand extends CDTCommand {

	private Cabin cabin;
	private ILog logger;
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
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
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
		double[] luggagemodel = {
				settings.getPercentageOfPassengersWithNoLuggage(),
				settings.getPercentageOfPassengersWithSmallLuggage(),
				settings.getPercentageOfPassengersWithMediumLuggage(),
				settings.getPercentageOfPassengersWithBigLuggage() };

		if ((luggagemodel[0] + luggagemodel[1] + luggagemodel[2] + luggagemodel[3]) == 0) {
			cabin.getSimulationSettings()
					.setPercentageOfPassengersWithNoLuggage(100);
		}

		cabinViewPart = ShouldSoonBeDeletedWhenSolved.getCabinView();

		repairBoardingClassAssignments();
		repairRowAssignments();
		repairSeatAssignments();
		checkPassengerAssignments();
		checkForConstructionErrors();
		checkFoldableSeats();
		updateTravelClassProperties();

		propertyViewPart = ShouldSoonBeDeletedWhenSolved.getPropertyView();

		for (String str : errorStrings) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin", str));
		}
		try {
			propertyViewPart.updateUI(cabin);
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"No property view is visible!"));
		}

		try {
			cabinViewPart.setCabin(cabin);
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"Cabin view checked and updated"));
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"No cabin view is visible!"));
		}
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
		for (TravelClass tc : cabin.getClasses()) {
			int number = ModelHelper.getChildrenByClass(tc, Seat.class).size();
			tc.setAvailableSeats(number);
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
				passenger.setName(passenger.getId() + " (" + seat.getName()
						+ ")");
			}
			passenger.setTravelClass(ModelHelper.getParent(TravelClass.class,
					seat));
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
			seat.setName(seat.getRow().getRowNumber()
					+ Func.getCharForNumber(seatInRowCount));
			seat.setXDimension(tc.getSeatWidth());
			seat.setYDimension(tc.getSeatLength());

			seatCount++;
			seatInRowCount++;
		}

		System.out.println("Seat IDs reassigned.");
	}

	private Boolean checkCabinOutOfBounds() {
		for (PhysicalObject object : ModelHelper.getChildrenByClass(cabin,
				PhysicalObject.class)) {
			if (object.getXPosition() < 0
					|| object.getYPosition() < 0
					|| (object.getXPosition() + object.getXDimension()) > cabin
							.getCabinWidth()
					|| (object.getYPosition() + object.getYDimension()) > cabin
							.getCabinLength()) {
				return true;
			}
		}
		return false;
	}

	private void checkTooManySeatsInRow() {

		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {
			int numberOfSeats = row.getSeats().size();

			String rowString = row.getSeats().get(0).getTravelClass()
					.getRowStructure();

			int seatsPerRow = 0;

			String[] rowParts = rowString.split("-");
			for (String str : rowParts) {
				seatsPerRow += Integer.parseInt(str);
			}

			if (numberOfSeats > seatsPerRow) {
				errorStrings.add("There are too many seats in row #"
						+ row.getRowNumber() + "!");
			}
			if (numberOfSeats < seatsPerRow) {
				errorStrings.add("There are too few seats in row #"
						+ row.getRowNumber() + "!");
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