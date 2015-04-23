/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PhysicalObject;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.InputChecker;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

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

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");

		repairRowAssignments();
		repairSeatAssignments();
		checkPassengerAssignments();
		checkForConstructionErrors();

		for (String str : errorStrings) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin", str));
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

	private void repairRowAssignments() {
		int i = 1;
		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {

			row.setRowNumber(i);
			i++;
		}
	}

	private void checkPassengerAssignments() {
		for (Passenger passenger : cabin.getPassengers()) {
			Seat seat = passenger.getSeatRef();

			seat.setPassenger(passenger);

			if (passenger.getSeat() != seat.getId()) {
				passenger.setSeat(seat.getId());
				passenger.setName(passenger.getId() + " (" + seat.getName()
						+ ")");
			}
			passenger.setTravelClass(seat.getTravelClass());
		}
	}

	private void repairSeatAssignments() {

		int seatCount = 1;
		int seatInRowCount = 1;

		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {

			seat.setId(seatCount);

			TravelClass tc = ModelHelper.getParent(TravelClass.class, seat);

			// TravelClass tc = seat.getTravelClass();

			seat.setTravelClass(tc);

			String seatString = InputChecker.checkStructureString(tc
					.getRowStructure());

			int seatsPerRow = 0;

			String[] rowParts = seatString.split("-");
			for (String str : rowParts) {
				seatsPerRow += Integer.parseInt(str);
			}

			seat.setName(seat.getRow().getRowNumber()
					+ FuncLib.getCharForNumber(seatInRowCount));

			seat.setXDimension(tc.getSeatWidth());
			seat.setYDimension(tc.getSeatLength());

			if (seatInRowCount == seatsPerRow) {
				seatInRowCount = 0;
			}

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

	private ArrayList<Integer> checkTooManySeatsInRow() {
		ArrayList<Integer> badRows = new ArrayList<Integer>();
		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {
			int numberOfSeats = row.getSeats().size();

			String rowString = row.getSeats().get(0).getTravelClass()
					.getRowStructure();

			int seatsPerRow = 0;

			String[] rowParts = rowString.split("-");
			for (String str : rowParts) {
				seatsPerRow += Integer.parseInt(str);
			}

			if (numberOfSeats != seatsPerRow) {
				badRows.add(row.getRowNumber());
			}

		}
		return badRows;
	}

	private void checkForConstructionErrors() {

		if (checkCabinOutOfBounds()) {
			errorStrings.add("Cabin out of bounds!");
		}

		ArrayList<Integer> rowFail = checkTooManySeatsInRow();
		for (Integer rowFailValue : rowFail) {
			errorStrings.add("There are too many seats in row #" + rowFailValue
					+ "!");
		}

		if (errorStrings.isEmpty()) {
			errorStrings.add("No issues detected!");
		}
	}
}