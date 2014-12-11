/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.EmergencyExit;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.MainDoor;
import net.bhl.cdt.model.cabin.PremiumEconomyClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;
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
 * This script is used to build up the cabin according to predefined settings.
 * 
 * @author marc.engelmann
 * @version 1.3
 * @date 18.11.2014
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

public class GenerateCabinCommand extends CDTCommand {

	private Cabin cabin;
	private CabinViewPart cabinViewPart;
	private int seatCount;
	private int rowCount;
	private String seatIdLetter;
	private double globalSeatPositionX;
	private double globalSeatPositionY;
	private ArrayList<Integer> randomNumberCheck;
	private double spaceBetweenSeats;
	private int seats;
	private int seatsInRow;
	private int numbAisles;
	private double seatDimensionX;
	private double seatDimensionY;
	private double seatPitch;
	private String seatIdString;
	private double seatHelper;
	private TravelClass subbClazz;
	private ILog logger;

	/**
	 * Creates a cabin.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public GenerateCabinCommand(Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
	}

	/**
	 * This function creates the name of the seat according to its position.
	 * 
	 * @param letter
	 *            is the number which is converted into a letter from A to F
	 */
	private void switchLetter(int letter) {
		switch (letter) {
		case 2:
			seatIdLetter = "B";
			break;
		case 3:
			seatIdLetter = "C";
			break;
		case 4:
			seatIdLetter = "D";
			break;
		case 5:
			seatIdLetter = "E";
			break;
		case 6:
			seatIdLetter = "F";
			break;
		default:
			seatIdLetter = "A";
			break;
		}
	}

	/**
	 * Loads the settings depending on the class type.
	 * 
	 * @param type
	 *            is a specific class type
	 */
	private <T extends TravelClass> void switchSettings(Class<T> travelSubClass) {
		if (travelSubClass.getSimpleName().equals("PremiumEconomyClass")) {
			seats = 12; // cabin.getSeatsInPremiumEconomyClass();
			seatsInRow = 6; // cabin.getSeatsPerRowInPremiumEconomyClass();
			seatDimensionX = 50; // cabin.getSeatWidthInPremiumEconomy();
			seatDimensionY = 60; // cabin.getSeatLengthInPremiumEconomy();
			seatPitch = 20; // cabin.getSeatPitchInPremiumEco();
		} else if (travelSubClass.getSimpleName().equals("BusinessClass")) {
			seats = 8;// cabin.getSeatsInBusinessClass();
			seatsInRow = 4;// cabin.getSeatsPerRowInBusinessClass();
			seatDimensionX = 72; // cabin.getSeatWidthInBusiness();
			seatDimensionY = 80; // cabin.getSeatLengthInBusiness();
			seatPitch = 30;// cabin.getSeatPitchInBusiness();
		} else if (travelSubClass.getSimpleName().equals("FirstClass")) {
			seats = 2; // cabin.getSeatsInFirstClass();
			seatsInRow = 2;// cabin.getSeatsPerRowInFirstClass();
			seatDimensionX = 100;// cabin.getSeatWidthInFirst();
			seatDimensionY = 120;// cabin.getSeatLengthInFirst();
			seatPitch = 40;// cabin.getSeatPitchInFirst();
		} else {
			seats = 72;// cabin.getSeatsInEconomyClass();
			seatsInRow = 6;// cabin.getSeatsPerRowInEconomyClass();
			seatDimensionX = 50;// cabin.getSeatWidthInEconomy();
			seatDimensionY = 60;// cabin.getSeatLengthInEconomy();
			seatPitch = 20; // cabin.getSeatPitchInEconomy();
		}
	}

	private void createSeat(Row row, int j) {
		// Create new instance of Seat
		Seat newSeat = CabinFactory.eINSTANCE.createSeat();
		row.getSeats().add(newSeat);
		newSeat.setSeatNumber(seatCount);
		switchLetter(j);
		seatIdString = rowCount + seatIdLetter;
		newSeat.setSeatId(seatIdString);
		newSeat.setName(seatIdString);
		newSeat.setXDimension(seatDimensionY);
		newSeat.setYDimension(seatDimensionX);
		newSeat.setLetter(seatIdLetter);
		newSeat.setXPosition(globalSeatPositionX);
		newSeat.setYPosition(globalSeatPositionY);
		newSeat.setTravelClass(subbClazz);
		double aisleSpace = 0;
		seatCount++;
		if (j == (seatsInRow / 2)) {
			aisleSpace = cabin.getAisleWidth() + seatHelper;
		}
		globalSeatPositionX = globalSeatPositionX + seatDimensionX + aisleSpace
				+ seatHelper;
	}

	/**
	 * 
	 */
	private void checkForDoor() {
		double seatPitchMultiplicator = 1.5;
		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			if ((((door.getYPosition() + door.getWidth()) > (globalSeatPositionY - seatPitch)) && (door
					.getYPosition() < globalSeatPositionY))
					|| ((door.getYPosition() > globalSeatPositionY)
							&& (door.getYPosition() < globalSeatPositionY
									+ seatDimensionY) || ((door.getYPosition()
							+ door.getWidth() > globalSeatPositionY) && (door
							.getYPosition() < globalSeatPositionY)))) {
				globalSeatPositionY += seatPitchMultiplicator * seatPitch;
			}
		}
	}

	/**
	 * This function creates a ClassType object and populates it with rows and
	 * seats.
	 * 
	 * @param typeID
	 *            describes which ClassType Option will be created
	 * @param sequence
	 */
	private <T extends TravelClass> void createClass(Class<T> travelSubClass) {
		numbAisles = 1;
		switchSettings(travelSubClass);
		if ((seats > 0) && (seatsInRow > 0)) {
			if (seatsInRow % 2 == 0) {

				// TODO: Should be done better!!
				/**************************************************************************/
				if (travelSubClass.getSimpleName()
						.equals("PremiumEconomyClass")) {
					PremiumEconomyClass subClass = CabinFactory.eINSTANCE
							.createPremiumEconomyClass();
					// cabin.getPremiumEconomyClasses().add(subClass);
					subbClazz = subClass;
					subbClazz.setPassengers(0);
				}
				if (travelSubClass.getSimpleName().equals("EconomyClass")) {
					EconomyClass subClass = CabinFactory.eINSTANCE
							.createEconomyClass();
					// cabin.getEconomyClasses().add(subClass);
					subbClazz = subClass;
					subbClazz.setPassengers(10);
				}
				if (travelSubClass.getSimpleName().equals("FirstClass")) {
					FirstClass subClass = CabinFactory.eINSTANCE
							.createFirstClass();
					// cabin.getFirstClasses().add(subClass);
					subbClazz = subClass;
					subbClazz.setPassengers(0);
				}
				if (travelSubClass.getSimpleName().equals("BusinessClass")) {
					BusinessClass subClass = CabinFactory.eINSTANCE
							.createBusinessClass();
					// cabin.getBusinessClasses().add(subClass);
					subbClazz = subClass;
					subbClazz.setPassengers(0);
				}
				cabin.getClasses().add(subbClazz);
				subbClazz.setAvailableSeats(seats);
				subbClazz.setSeatPitch(seatPitch);
				subbClazz.setSeatsPerRow(seatsInRow);
				subbClazz.setSeatWidth(seatDimensionX);
				subbClazz.setSeatLength(seatDimensionY);
				subbClazz.setName("");

				/**************************************************************************/
				seatHelper = 0;
				for (int i = 1; i <= seats / seatsInRow; i++) {
					globalSeatPositionX = 0;
					if ((seatsInRow * seatDimensionX + cabin.getAisleWidth()) <= cabin
							.getCabinWidth()) {
						switch (numbAisles) {
						case 1:
							seatHelper = globalSeatPositionX = ((cabin
									.getCabinWidth() - cabin.getAisleWidth()) / 2 - (seatsInRow / 2)
									* seatDimensionX)
									/ (1 + seatsInRow / 2);
							break;
						default:
							// consoleViewPart
							// .printText("Number of aisles not supported!");
							logger.log(new Status(IStatus.ERROR,
									"net.bhl.cdt.model.cabin",
									"Number of aisles not supported!"));
							break;
						}
					} else {
						// consoleViewPart
						// .printText("Check your x dimensions! Cabin too narrow.");
						logger.log(new Status(IStatus.ERROR,
								"net.bhl.cdt.model.cabin",
								"Check your x dimensions! Cabin too narrow."));
						seatHelper = 0;
						globalSeatPositionX = 0;
					}
					if ((globalSeatPositionX < 0)) {
						seatHelper = 0;
						globalSeatPositionX = 0;
						// consoleViewPart
						// .printText("Check seat and cabin dimensions! Cabin too narrow.");
						logger.log(new Status(IStatus.ERROR,
								"net.bhl.cdt.model.cabin",
								"Check seat and cabin dimensions! Cabin too narrow."));
					}

					globalSeatPositionY += seatPitch;

					if (cabin.getRowNonexistent() == rowCount) {
						rowCount++;
					}

					createRows();

					rowCount++;
					globalSeatPositionY = globalSeatPositionY + seatDimensionY;
				}
				if (!travelSubClass.getSimpleName().equals("EconomyClass")) {
					createCurtain(true,
							"after " + FunctionLibrary.splitCamelCase(travelSubClass.getSimpleName()));
				}
			} else {
				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
						"Please choose an even number for SeatsPerRow"));
			}
		}
	}

	/**
	 * This function creates a row and the seats in it.
	 * 
	 * @param subClass
	 *            is the subclass
	 */
	public void createRows() {
		Row newRow = CabinFactory.eINSTANCE.createRow();
		subbClazz.getRows().add(newRow);
		newRow.setRowNumber(rowCount);

		checkForDoor();

		for (int j = 1; j <= seatsInRow; j++) {
			createSeat(newRow, j);
		}
	}

	/**
	 * This function creates a door.
	 * 
	 * @param doorType
	 *            is the type of the door
	 * @param symmetrical
	 *            describes if the door will be generated on both sides
	 * @param id
	 *            is the id of the door
	 * @param yPosition
	 *            set it to -1 to ignore value, only important for emergency
	 *            exit.
	 */
	private <T extends Door> void createDoor(Class<T> typeDoor,
			boolean symmetrical, int id, double yPosition) {
		Boolean mainDoorAlreadyExists = false;
		if (!mainDoorAlreadyExists) {
			for (Door testDoor : cabin.getDoors()) {
				if (typeDoor.getSimpleName().equals("MainDoor")
						&& (testDoor instanceof MainDoor)) {
					// consoleViewPart
					// .printText("You created more than one main door!");
					logger.log(new Status(IStatus.ERROR,
							"net.bhl.cdt.model.cabin",
							"You created more than one main door!"));
					mainDoorAlreadyExists = true;
				}
			}
		}
		Door newDoor = null;
		if (typeDoor.getSimpleName().equals("MainDoor")) {
			MainDoor mainDoor = CabinFactory.eINSTANCE.createMainDoor();
			newDoor = mainDoor;
			newDoor.setWidth(newDoor.getWidthOfMainDoor());
			newDoor.setYPosition(globalSeatPositionY);
			globalSeatPositionY += newDoor.getWidthOfMainDoor();
		} else {
			EmergencyExit emergencyExit = CabinFactory.eINSTANCE
					.createEmergencyExit();
			newDoor = emergencyExit;
			newDoor.setWidth(newDoor.getWidthOfEmergencyExit());
			newDoor.setYPosition(yPosition);
			if (yPosition < 0) {
				// consoleViewPart
				// .printText("Emergency Exit has a illegal yPosition.");
				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
						"Emergency Exit has a illegal yPosition."));
			}
		}
		cabin.getDoors().add(newDoor);
		newDoor.setId(id);
		newDoor.setOnBothSides(symmetrical);
	}

	/**
	 * This method creates a curtain. Curtains are generated automatically in
	 * the class generation.
	 * 
	 * @param openOrNot
	 *            describes whether the curtain is open or not.
	 * @param name
	 *            is the name of the door.
	 */
	private void createCurtain(boolean openOrNot, String name) {
		Curtain newCurtainLeft = CabinFactory.eINSTANCE.createCurtain();
		Curtain newCurtainRight = CabinFactory.eINSTANCE.createCurtain();
		cabin.getCurtains().add(newCurtainLeft);
		cabin.getCurtains().add(newCurtainRight);
		newCurtainLeft.setCurtainOpen(openOrNot);
		newCurtainRight.setCurtainOpen(openOrNot);
		newCurtainLeft.setXPosition(0);
		newCurtainLeft.setYPosition(globalSeatPositionY + 10);
		newCurtainLeft.setXDimension((cabin.getCabinWidth() - cabin
				.getAisleWidth()) / 2);
		newCurtainLeft.setYDimension(10);
		newCurtainLeft.setName(name + " (left)");

		newCurtainRight.setXPosition(cabin.getCabinWidth()
				- newCurtainLeft.getXDimension());
		newCurtainRight.setYPosition(newCurtainLeft.getYPosition());
		newCurtainRight.setXDimension(newCurtainLeft.getXDimension());
		newCurtainRight.setYDimension(newCurtainLeft.getYDimension());
		newCurtainRight.setName(name + " (right)");

		globalSeatPositionY = globalSeatPositionY
				+ newCurtainLeft.getYDimension() + 30;

	}

	/**
	 * This function creates a Lavatory.
	 * 
	 * @param isSymmetrical
	 *            describes if the lavatory is meant to be placed on the same
	 *            y-coordinate, symmetrical to the galley created before.
	 * @param symmetricalToNext
	 *            describes if the galley generated next will be a symmetrical
	 *            to this one.
	 * @param xDimension
	 * @param yDimension
	 */
	private void createLavatory(Boolean isSymmetricalToLavatoryBefore,
			double xDimension, double yDimension) {
		Lavatory newLavatory = CabinFactory.eINSTANCE.createLavatory();
		cabin.getLavatories().add(newLavatory);
		if (isSymmetricalToLavatoryBefore) {
			globalSeatPositionY -= yDimension;
			newLavatory.setXPosition(cabin.getCabinWidth() - xDimension);
			newLavatory.setYPosition(globalSeatPositionY);
		} else {
			newLavatory.setXPosition(0);
			newLavatory.setYPosition(globalSeatPositionY);
		}
		globalSeatPositionY += yDimension;
		newLavatory.setXDimension(xDimension);
		newLavatory.setYDimension(yDimension);
	}

	/**
	 * This method creates a stairway.
	 * 
	 * @param direction
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	private void createStairway(StairwayDirection direction, double xPosition,
			double yPostion, double xDimension, double yDimension) {
		Stairway newStairway = CabinFactory.eINSTANCE.createStairway();
		cabin.getStairways().add(newStairway);
		newStairway.setXPosition(xPosition);
		newStairway.setYPosition(yPostion);
		newStairway.setDirection(direction);
		newStairway.setXDimension(xDimension);
		newStairway.setYDimension(yDimension);
	}

	/**
	 * 
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	private void createGalley(Boolean isSymmetricalToGalleyBefore,
			double xDimension, double yDimension) {
		Galley newGalley = CabinFactory.eINSTANCE.createGalley();
		cabin.getGalleys().add(newGalley);
		if (isSymmetricalToGalleyBefore) {
			globalSeatPositionY -= yDimension;
			newGalley.setXPosition(cabin.getCabinWidth() - xDimension);
			newGalley.setYPosition(globalSeatPositionY);
		} else {
			newGalley.setXPosition(0);
			newGalley.setYPosition(globalSeatPositionY);
		}
		globalSeatPositionY += yDimension;
		newGalley.setXDimension(xDimension);
		newGalley.setYDimension(yDimension);
	}

	@Override
	/**
	 * CAUTION! Objects must be generated in the order they appear in the cabin (from front to rear).
	 * Emergency Exits must be generated at first!
	 */
	protected void doRun() {

		/********************************** Get the CabinView *************************************/
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page.findView("net.bhl.cdt.model.cabin.cabinview");
		/******************************************************************************************/

		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"Initializing cabin generation ..."));

		/***** Clearing all Objects *****/
		cabin.getClasses().clear();
		cabin.getDoors().clear();
		cabin.getLavatories().clear();
		cabin.getGalleys().clear();
		cabin.getCurtains().clear();
		cabin.getStairways().clear();
		cabin.getStowages().clear();
		cabin.getPassengers().clear();
		/******************************/

		spaceBetweenSeats = 10;
		globalSeatPositionX = 0;
		globalSeatPositionY = 0;
		seatCount = 1;
		rowCount = 1;

		/**** Always generate emergency exits at first! ******/
		createDoor(EmergencyExit.class, true, 3, 935);
		createDoor(EmergencyExit.class, true, 4, 1228);
		/***************************************************/

		createLavatory(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createLavatory(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		/****** Never create more than one main door! ********/
		createDoor(MainDoor.class, true, 1, -1);
		/*****************************************************/

		createGalley(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createGalley(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		/****************** Create Classes *******************/
		createClass(FirstClass.class);
		createClass(BusinessClass.class);
		createClass(PremiumEconomyClass.class);
		createClass(EconomyClass.class);
		/***************************************************/

		createGalley(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createGalley(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		// createDoor(StandardDoor.class, true, 2, -1);

		createLavatory(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createLavatory(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		// cabin.setGraphicSettings(CabinFactory.eINSTANCE.createCabinViewSettings());

		if (globalSeatPositionY > cabin.getCabinLength()) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Out of bounds! Cabin too short."));
		}

		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"Cabin generation completed"));
		if (!cabin.equals(null)&&!cabinViewPart.equals(null)) {
			cabinViewPart.submitCabin(cabin);
		} else if(cabinViewPart.equals(null)) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"The cabin view is not visible, please add it before trying again!"));
		}
	}
}
