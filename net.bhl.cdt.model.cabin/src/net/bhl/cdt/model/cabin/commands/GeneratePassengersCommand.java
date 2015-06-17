/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
//import net.bhl.cdt.cabin.ui.Activator;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.MainDoor;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.PremiumEconomyClass;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.InfoViewPart;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.SimulationResultLogger;
import net.bhl.cdt.model.cabin.util.PassengerPropertyGenerator;
import net.bhl.cdt.model.cabin.util.FuncLib.GaussOptions;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

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
	private ArrayList<Integer> randomSeatId;
	private ArrayList<Integer> randomPassengerId;
	private int passengerIdCount;
	private int passengerPerClassCount;
	private CabinViewPart cabinViewPart;
	private int totalPax;
	private int totalSeats;
	private int paxInClass;
	private int seatsInClass;
	private int seatAreaBegin;
	private ILog logger;

	private int firstpax = 0;
	private int businesspax = 0;
	private int premiumecopax = 0;
	private int ecopax = 0;
	private int firstseats = 0;
	private int businessseats = 0;
	private int premiumecoseats = 0;
	private int ecoseats = 0;

	/**
	 * This method submits the cabin to be used in the file.
	 * 
	 * @param cabin
	 *            is the input parameter
	 */
	public GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
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
	 * This method applies a door to a passenger. In this implementation, the
	 * main door is always chosen as the assigned door.
	 * 
	 * @param pass
	 *            is the passenger to whom the door is assigned to.
	 */
	private void applyDoor(Passenger pass) {
		if (!cabin.getDoors().isEmpty()) {
			for (Door door : cabin.getDoors()) {
				if (door instanceof MainDoor) {
					pass.setDoor(door);
					break;
				}
			}
		}
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
		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"No seat found!"));

		Seat emptySeat = null;
		return emptySeat;
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
		boolean hasLuggage = true;

		/********************************************************/

		switchClass(travelSubClass);
		if (paxInClass != 0) {
			if (paxInClass <= seatsInClass) {
				for (int i = 1; i <= paxInClass; i++) {
					Passenger newPassenger = CabinFactory.eINSTANCE
							.createPassenger();
					cabin.getPassengers().add(newPassenger);
					newPassenger.setId(FuncLib.uniqueRandom(randomPassengerId,
							1, totalPax + 1));

					newPassenger.setSeat(FuncLib.uniqueRandom(randomSeatId,
							seatAreaBegin, seatsInClass));
					newPassenger.setName(newPassenger.getId() + " ("
							+ getSeat(newPassenger).getName() + ")");
					newPassenger.setSeatRef(getSeat(newPassenger));
					newPassenger.setTravelClass(newPassenger.getSeatRef()
							.getTravelClass());
					applyDoor(newPassenger);
					newPassenger.setHasLuggage(hasLuggage);
					newPassenger
							.setStartBoardingAfterDelay((passengerIdCount - 1)
									* 60.0
									/ cabin.getSimulationSettings()
											.getPassengersBoardingPerMinute());

					/************************ random values ***************************/

					PassengerPropertyGenerator generator = new PassengerPropertyGenerator(
							newPassenger);
					newPassenger = generator.getPassenger();

					/********************************************************************/

					passengerIdCount++;
					passengerPerClassCount++;
				}
				randomSeatId.clear();

				logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
						"successfully created "
								+ (passengerPerClassCount)
								+ " passengers in "
								+ FuncLib.splitCamelCase(travelSubClass
										.getSimpleName())));
			} else {

				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
						"Too many passengers in "
								+ FuncLib.splitCamelCase(travelSubClass
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
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		InfoViewPart infoViewPart = (InfoViewPart) page
				.findView("net.bhl.cdt.model.cabin.infoview");
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
		passengerIdCount = 1;

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
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Too many passengers in the cabin! Remove "
							+ (totalPax - totalSeats) + "!"));
		}
		try {
			cabinViewPart.setCabin(cabin);
			infoViewPart.update(cabin);
			cabinViewPart.syncViewer();
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Cabin View or Info view not visible!"));
		}
	}
}
