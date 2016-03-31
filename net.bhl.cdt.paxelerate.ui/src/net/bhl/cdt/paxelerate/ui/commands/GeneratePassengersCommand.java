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
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.util.PassengerPropertyGenerator;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.PropertyViewPart;
import net.bhl.cdt.paxelerate.util.math.RandomHelper;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * This command creates the passengers.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class GeneratePassengersCommand extends CDTCommand {

	private Cabin cabin;
	private CabinViewPart cabinViewPart;
	private PropertyViewPart propertyViewPart;
	private ArrayList<String> errorStrings = new ArrayList<String>();

	/**
	 * This method submits the cabin to be used in the file.
	 * 
	 * @param cabin
	 *            is the input parameter
	 */
	public GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * This method applies a door to a passenger.
	 * 
	 * @param pass
	 *            is the passenger to whom the door is assigned to.
	 */
	private Door getDoor(Passenger pass) {

		ArrayList<Door> sdoorage = new ArrayList<Door>();

		for (Door door : cabin.getDoors()) {
			if (door.isIsActive()) {
				sdoorage.add(door);
			}
		}

		int seatPos = pass.getSeatRef().getXPosition();

		int current = Integer.MAX_VALUE;
		Door bestDoor = null;

		for (Door door : sdoorage) {
			int diff = Math.abs(door.getXPosition() - seatPos);
			if (diff < current) {
				current = diff;
				bestDoor = door;
			}
		}
		return bestDoor;
	}

	/**
	 * This method gets the seat which is connected to a specific passenger.
	 * 
	 * @param passenger
	 *            the passenger
	 * @return the seat which is linked to the passenger
	 */
	private Seat getSeat(Passenger passenger) {
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
			if ((!seat.equals(null)) && (seat.getId() == passenger.getSeat())) {
				seat.setPassenger(passenger);

				return seat;
			}
		}

		Log.add(this, "No seat found!");

		return null;
	}

	private double calculateDelay(Passenger pax) {
		double delay = 0;
		double clocking = cabin.getSimulationSettings().getPassengersBoardingPerMinute();

		try {
			pax.getDoor().getWaitingPassengers().add(pax);
			delay = (pax.getDoor().getWaitingPassengers().size() - 1) * 60.0 / clocking;
		} catch (NullPointerException e) {
			Log.add(this, "The cabin has no doors so far, please assign one manually!");
		}

		return delay;
	}

	/**
	 * This method generates the passengers.
	 * 
	 * @param classType
	 *            specifies in which class the passengers are generated
	 */
	private void generatePassengers(TravelClass tc, int numberOfPassengers, int numberOfSeats) {

		if (numberOfPassengers != 0) {
			if (numberOfPassengers <= numberOfSeats) {

				ArrayList<Integer> randomSeatId = new ArrayList<Integer>();

				for (int i = 1; i <= numberOfPassengers; i++) {

					Passenger passenger = CabinFactory.eINSTANCE.createPassenger();
					cabin.getPassengers().add(passenger);

					int firstSeatNumber = ModelHelper.getChildrenByClass(tc, Seat.class).get(0).getId();

					passenger.setId(i);
					passenger.setSeat(RandomHelper.uniqueRandom(randomSeatId, firstSeatNumber, numberOfSeats));
					passenger.setName(passenger.getId() + " (" + getSeat(passenger).getName() + ")");
					passenger.setSeatRef(getSeat(passenger));
					passenger.setTravelClass(passenger.getSeatRef().getTravelClass());
					passenger.setDoor(getDoor(passenger));
					passenger.setStartBoardingAfterDelay(calculateDelay(passenger));

					PassengerPropertyGenerator generator = new PassengerPropertyGenerator(passenger);
					passenger = generator.getPassenger();

				}
				randomSeatId.clear();

				Log.add(this, "successfully created " + numberOfPassengers + " passengers in "
						+ StringHelper.splitCamelCase(tc.getName()));
			} else {

				Log.add(this, "Too many passengers in " + StringHelper.splitCamelCase(tc.getName()));
			}
		}
	}

	/**
	 * This method runs the passenger generation command.
	 */
	@Override
	protected void doRun() {

		cabinViewPart = ViewPartHelper.getCabinView();

		cabinViewPart.unsyncViewer();

		cabin.getPassengers().clear();

		for (TravelClass travelclass : cabin.getClasses()) {

			generatePassengers(travelclass, travelclass.getPassengers(), travelclass.getAvailableSeats());
		}

		for (Door door : cabin.getDoors()) {
			door.getWaitingPassengers().clear();
		}

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
			cabinViewPart.syncViewer();
		} catch (NullPointerException e) {
			Log.add(this, "Cabin View or Info view not visible!");
		}
	}
}
