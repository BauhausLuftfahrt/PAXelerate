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
import net.bhl.cdt.model.cabin.PremiumEconomyClass;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.util.FunctionLibrary;
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
 * @date 03.12.2014
 *
 */

/********************How to add a new right click command to openCDT***********************/
/**                                                                                      **/
/** (1) Create a new "newCommand.java" in "net.bhl.cdt.model.cabin.commands"             **/
/**     - Best practice: copy an existing command.                                       **/
/**     - Be sure to not modify the constructor, "this.cabin = cabin" should stay intact **/
/**                                                                                      **/
/** (2) Create a new "newCommandHandler.java" in "net.bhl.cdt.model.cabin.handlers"      **/
/**     - Best practice: copy an existing handler file.                        		     **/
/**     - Tip: Do not modify this file, only check for correct naming         			 **/
/**                         															 **/
/** (3) Open "plugin.xml" and go to "org.eclipse.ui.commands"                			 **/
/**     - Create a new command by right-clicking.                                        **/
/**     - Fill in the id, name and default handler. (Caution: case sensitive!)           **/
/**                                                        								 **/
/** (4) Go to "org.eclipse.ui.menus" in "plugin.xml"                                     **/
/**     - Expand the "popup:org.eclipse.(...)" entry.                                    **/
/**     - Add a new command by right-clicking.                                           **/
/**     - Fill in the correct commandID and your desired label name.                     **/
/**     - Add a new parameter by right-clicking.                                         **/
/**     - Set the parameter to "false (visible when)".      							 **/
/**     - Add a parameter within called "iterate".            						     **/
/**     - Add a parameter within called "instanceOf" and choose "cabin". 			     **/
/**                                            											 **/
/******************************************************************************************/

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
	
	//int cabinViewFPS = Activator.getDefault().getPreferenceStore()
	//        .getString("CabinViewFPS");


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
			seatAreaBegin = ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getAvailableSeats() + 1;
			seatsInClass = ModelHelper
					.getChildrenByClass(cabin, travelSubClass).get(0)
					.getAvailableSeats();
		} else if (travelSubClass.getSimpleName().equals("FirstClass")) {
			seatAreaBegin = 1;
			seatsInClass = ModelHelper
					.getChildrenByClass(cabin, travelSubClass).get(0)
					.getAvailableSeats();
		} else if (travelSubClass.getSimpleName().equals("PremiumEconomyClass")) {
			seatAreaBegin = ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getAvailableSeats()
					+ ModelHelper
							.getChildrenByClass(cabin, BusinessClass.class)
							.get(0).getAvailableSeats() + 1;
			seatsInClass = ModelHelper
					.getChildrenByClass(cabin, travelSubClass).get(0)
					.getAvailableSeats();
		} else {
			seatAreaBegin = totalSeats
					- ModelHelper.getChildrenByClass(cabin, EconomyClass.class)
							.get(0).getAvailableSeats() + 1;
			seatsInClass = ModelHelper
					.getChildrenByClass(cabin, travelSubClass).get(0)
					.getAvailableSeats();
		}
		paxInClass = ModelHelper.getChildrenByClass(cabin, travelSubClass)
				.get(0).getPassengers();
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

	private Seat getSeat(Passenger passenger) {
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
			if ((!seat.equals(null))
					&& (seat.getSeatNumber() == passenger.getSeat())) {
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
		Sex sex = Sex.FEMALE;
		boolean hasLuggage = true;
		double passengersPerMinute = 18;
		switchClass(travelSubClass);
		if (paxInClass != 0) {
			if (paxInClass <= seatsInClass) {
				for (int i = 1; i <= paxInClass; i++) {
					Passenger newPassenger = CabinFactory.eINSTANCE
							.createPassenger();
					cabin.getPassengers().add(newPassenger);
					newPassenger.setId(FunctionLibrary.uniqueRandom(
							randomPassengerId, 1, totalPax + 1));
					newPassenger.setSeat(FunctionLibrary.uniqueRandom(
							randomSeatId, seatAreaBegin, seatsInClass));
					newPassenger.setName(newPassenger.getId() + " ("
							+ getSeat(newPassenger).getSeatId() + ")");
					newPassenger.setSeatRef(getSeat(newPassenger));
					// newPassenger.setClass(classType);
					applyDoor(newPassenger);
					newPassenger.setHasLuggage(hasLuggage);
					newPassenger
							.setStartBoardingAfterDelay((passengerIdCount - 1)
									* 60 / passengersPerMinute);

					/******************** random values ***********************/

					/*
					 * note that the 2 integers have the following meaning:
					 * first integer: lower bound second integer: the range The
					 * upper bound is never reached!
					 */

					if (FunctionLibrary.randomValue(0, 2) == 1) {
						sex = Sex.MALE;
					}
					newPassenger.setSex(sex);
					newPassenger.setAge((int) FunctionLibrary.randomValue(18,
							70));
					newPassenger.setHeight(FunctionLibrary
							.randomValue(150, 200));
					newPassenger
							.setWeight(FunctionLibrary.randomValue(60, 110));
					newPassenger.setDepth(FunctionLibrary.randomValue(20, 50));
					newPassenger.setWidth(FunctionLibrary.randomValue(30, 60));
					newPassenger.setWalkingSpeed(FunctionLibrary.randomValue(5,
							15) / 10);
					newPassenger.setLuggageStowTime(FunctionLibrary
							.randomValue(5, 10));
					/********************************************************/
					passengerIdCount++;
					passengerPerClassCount++;
				}
				randomSeatId.clear();

				logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
						"successfully created "
								+ (passengerPerClassCount)
								+ " passengers in "
								+ FunctionLibrary.splitCamelCase(travelSubClass
										.getSimpleName())));
			} else {

				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
						"Too many passengers in "
								+ FunctionLibrary.splitCamelCase(travelSubClass
										.getSimpleName())));
			}
		}
	}

	@Override
	protected void doRun() {
		/************************* get the views ***********************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		// Unsync the cabin view during the execution of the command.
		cabinViewPart.unsyncViewer();
		/**************************************************************/
		cabin.getPassengers().clear();
		totalPax = ModelHelper.getChildrenByClass(cabin, FirstClass.class)
				.get(0).getPassengers()
				+ ModelHelper.getChildrenByClass(cabin, BusinessClass.class)
						.get(0).getPassengers()
				+ ModelHelper
						.getChildrenByClass(cabin, PremiumEconomyClass.class)
						.get(0).getPassengers()
				+ ModelHelper.getChildrenByClass(cabin, EconomyClass.class)
						.get(0).getPassengers();
		totalSeats = ModelHelper.getChildrenByClass(cabin, FirstClass.class)
				.get(0).getAvailableSeats()
				+ ModelHelper.getChildrenByClass(cabin, BusinessClass.class)
						.get(0).getAvailableSeats()
				+ ModelHelper
						.getChildrenByClass(cabin, PremiumEconomyClass.class)
						.get(0).getAvailableSeats()
				+ ModelHelper.getChildrenByClass(cabin, EconomyClass.class)
						.get(0).getAvailableSeats();
		randomSeatId = new ArrayList<Integer>();
		randomPassengerId = new ArrayList<Integer>();
		passengerIdCount = 1;

		if (totalPax <= totalSeats) {
			generatePassengers(FirstClass.class);
			generatePassengers(BusinessClass.class);
			generatePassengers(PremiumEconomyClass.class);
			generatePassengers(EconomyClass.class);

		} else {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Too many passengers in the cabin! Remove "
							+ (totalPax - totalSeats) + "!"));
		}
		if (!cabinViewPart.equals(null)) {
			cabinViewPart.setCabin(cabin);
		}
		// Resync the CabinView with the cabin object
		cabinViewPart.syncViewer();
	}
}
