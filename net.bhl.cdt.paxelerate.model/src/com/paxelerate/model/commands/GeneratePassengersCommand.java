/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.paxelerate.model.BusinessClass;
import com.paxelerate.model.Cabin;
import com.paxelerate.model.CabinFactory;
import com.paxelerate.model.Door;
import com.paxelerate.model.EconomyClass;
import com.paxelerate.model.FirstClass;
import com.paxelerate.model.Passenger;
import com.paxelerate.model.PremiumEconomyClass;
import com.paxelerate.model.Seat;
import com.paxelerate.model.TravelClass;
import com.paxelerate.model.ui.CabinViewPart;
import com.paxelerate.model.util.PassengerPropertyGenerator;
import com.paxelerate.model.util.ShouldSoonBeDeletedWhenSolved;
import com.paxelerate.util.Func;
import com.paxelerate.util.math.RandomHelper;
import com.paxelerate.util.strings.StringOperations;

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
	private ArrayList<Integer> randomSeatId, randomPassengerId;
	private CabinViewPart cabinViewPart;
	private ILog logger;

	private int totalPax, totalSeats, paxInClass, seatsInClass, seatAreaBegin,
			passengerPerClassCount, firstpax = 0, businesspax = 0,
			premiumecopax = 0, ecopax = 0, firstseats = 0, businessseats = 0,
			premiumecoseats = 0, ecoseats = 0;

	/**
	 * This method submits the cabin to be used in the file.
	 * 
	 * @param cabin
	 *            is the input parameter
	 */
	public GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.paxelerate.model"));
	}

	/**
	 * This method generates the parameters for a specific class.
	 * 
	 * @param classT
	 *            is the specific class
	 */
	private <T extends TravelClass> void switchClass(Class<T> travelSubClass) {
		if (travelSubClass.getSimpleName().equals("BusinessClass")) {
			seatAreaBegin = firstseats + 1;
			seatsInClass = businessseats;
			paxInClass = businesspax;
		} else if (travelSubClass.getSimpleName().equals("FirstClass")) {
			seatAreaBegin = 1;
			seatsInClass = firstseats;
			paxInClass = firstpax;
		} else if (travelSubClass.getSimpleName().equals("PremiumEconomyClass")) {
			seatAreaBegin = firstseats + businessseats + 1;
			seatsInClass = premiumecoseats;
			paxInClass = premiumecopax;
		} else {
			seatAreaBegin = totalSeats - ecoseats + 1;
			seatsInClass = ecoseats;
			paxInClass = ecopax;
		}

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
		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
				"No seat found!"));

		Seat emptySeat = null;

		return emptySeat;
	}

	private double calculateDelay(Passenger pax) {
		double delay = 0;
		double clocking = cabin.getSimulationSettings()
				.getPassengersBoardingPerMinute();

		pax.getDoor().getWaitingPassengers().add(pax);

		delay = (pax.getDoor().getWaitingPassengers().size() - 1) * 60.0
				/ (double) clocking;

		return delay;
	}

	/**
	 * This method generates the passengers.
	 * 
	 * @param classType
	 *            specifies in which class the passengers are generated
	 */
	private <T extends TravelClass> void generatePassengers(

	Class<T> travelSubClass) {
		passengerPerClassCount = 0;

		/********************************************************/

		switchClass(travelSubClass);
		if (paxInClass != 0) {
			if (paxInClass <= seatsInClass) {
				for (int i = 1; i <= paxInClass; i++) {

					Passenger newPassenger = CabinFactory.eINSTANCE
							.createPassenger();
					cabin.getPassengers().add(newPassenger);
					newPassenger.setId(RandomHelper.uniqueRandom(
							randomPassengerId, 1, totalPax + 1));

					newPassenger.setSeat(RandomHelper.uniqueRandom(
							randomSeatId, seatAreaBegin, seatsInClass));

					newPassenger.setName(newPassenger.getId() + " ("
							+ getSeat(newPassenger).getName() + ")");

					newPassenger.setSeatRef(getSeat(newPassenger));

					newPassenger.setTravelClass(newPassenger.getSeatRef()
							.getTravelClass());

					newPassenger.setDoor(getDoor(newPassenger));

					newPassenger
							.setStartBoardingAfterDelay(calculateDelay(newPassenger));

					/************************ random values ***************************/

					PassengerPropertyGenerator generator = new PassengerPropertyGenerator(
							newPassenger);
					newPassenger = generator.getPassenger();

					/********************************************************************/

					passengerPerClassCount++;
				}
				randomSeatId.clear();

				logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
						"successfully created "
								+ (passengerPerClassCount)
								+ " passengers in "
								+ StringOperations
										.splitCamelCase(travelSubClass
												.getSimpleName())));
			} else {

				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.paxelerate.model",
						"Too many passengers in "
								+ StringOperations
										.splitCamelCase(travelSubClass
												.getSimpleName())));
			}
		}
	}

	/**
	 * This method runs the passenger generation command.
	 */
	@Override
	protected void doRun() {

		/************************* get the views ***********************/
		cabinViewPart = ShouldSoonBeDeletedWhenSolved.getCabinView();

		// Unsync the cabin view during the execution of the command.
		cabinViewPart.unsyncViewer();
		/**************************************************************/
		cabin.getPassengers().clear();

		try {
			firstpax = ModelHelper.getChildrenByClass(cabin, FirstClass.class)
					.get(0).getPassengers();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}
		try {
			businesspax = ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class).get(0)
					.getPassengers();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}
		try {
			premiumecopax = ModelHelper
					.getChildrenByClass(cabin, PremiumEconomyClass.class)
					.get(0).getPassengers();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}
		try {
			ecopax = ModelHelper.getChildrenByClass(cabin, EconomyClass.class)
					.get(0).getPassengers();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}

		totalPax = firstpax + businesspax + premiumecopax + ecopax;

		try {
			firstseats = ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getAvailableSeats();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}
		try {
			businessseats = ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class).get(0)
					.getAvailableSeats();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}
		try {
			premiumecoseats = ModelHelper
					.getChildrenByClass(cabin, PremiumEconomyClass.class)
					.get(0).getAvailableSeats();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}
		try {
			ecoseats = ModelHelper
					.getChildrenByClass(cabin, EconomyClass.class).get(0)
					.getAvailableSeats();
		} catch (IndexOutOfBoundsException e) {
			// ...
		}

		totalSeats = firstseats + businessseats + premiumecoseats + ecoseats;
		randomSeatId = new ArrayList<Integer>();
		randomPassengerId = new ArrayList<Integer>();

		if (totalPax <= totalSeats) {
			if (firstpax > 0) {
				generatePassengers(FirstClass.class);
			}
			if (businesspax > 0) {
				generatePassengers(BusinessClass.class);
			}
			if (premiumecopax > 0) {
				generatePassengers(PremiumEconomyClass.class);
			}
			if (ecopax > 0) {
				generatePassengers(EconomyClass.class);
			}

		} else {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.paxelerate.model",
					"Too many passengers in the cabin! Remove "
							+ (totalPax - totalSeats) + "!"));
		}

		for (Door door : cabin.getDoors()) {
			door.getWaitingPassengers().clear();
		}

		try {
			cabinViewPart.setCabin(cabin);
			cabinViewPart.syncViewer();
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.paxelerate.model",
					"Cabin View or Info view not visible!"));
		}
	}
}