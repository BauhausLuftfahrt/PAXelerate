/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

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
import net.bhl.cdt.model.cabin.StandardDoor;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * This class contains all constructors for the different elements of the cabin.
 * You can construct every single part of cabin on its own.
 * @see GenerateCabinCommand.java for implementation reference.
 * 
 * @author marc.engelmann
 *
 */
public class ConstructionLibrary {
	private Cabin cabin;
	private int seatCount;
	private int rowCount;
	private double globalSeatPositionX;
	private double globalSeatPositionY;
	private int seats;
	private int seatsInRow;
	private String seatStructure;
	private int numbAisles;
	private Vector seatDimensions = new Vector(0, 0);
	private double seatPitch;
	private double seatHelper;
	private int passengers;
	private TravelClass passengerClass;
	private ILog logger;
	private ArrayList<Integer> rowPartsInt;

	/**
	 * This method is the constructor of this class.
	 *
	 * @param cabin
	 *            the cabin element
	 */
	public ConstructionLibrary(Cabin cabin) {
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
		this.cabin = cabin;
		globalSeatPositionX = 0;
		globalSeatPositionY = 0;
		seatStructure = "emptyString";
		seatCount = 1;
		rowCount = 1;
	}

	/**
	 * Returns the cabin.
	 * 
	 * @return the cabin that was created whithin this class.
	 */
	public Cabin getCabin() {
		return cabin;
	}

	/**
	 * This method returns the globalSeatPositionY.
	 * 
	 * @return the globalSeatPositionY
	 */
	public double getGlobalSeatPositionY() {
		return globalSeatPositionY;
	}

	/**
	 * This method clears all objects from the cabin object <b>excluding the
	 * passenger classes</b>.
	 */
	public void clearCabin() {
		cabin.getDoors().clear();
		cabin.getLavatories().clear();
		cabin.getGalleys().clear();
		cabin.getCurtains().clear();
		cabin.getStairways().clear();
		cabin.getStowages().clear();
		cabin.getPassengers().clear();
	}

	/**
	 * Load the class settings depending on type. If there already exists an
	 * object of the corresponding class, the values are copied over to the new
	 * class. This makes it possible for changes in the openCDT app during
	 * runtime.
	 * 
	 * NOTE: This only works if there is just one existing class per class type.
	 * 
	 * @param travelSubClass
	 *            the subclass
	 * @param <T>
	 *            is a helper Class
	 */
	public <T extends TravelClass> void switchSettings(Class<T> travelSubClass) {
		switch (travelSubClass.getSimpleName()) {
		case "PremiumEconomyClass":
			try {
				PremiumEconomyClass subclass = ModelHelper.getChildrenByClass(
						cabin, PremiumEconomyClass.class).get(0);
				seats = subclass.getAvailableSeats();
				seatStructure = subclass.getRowStructure();
				seatDimensions.setTwoDimensional((int) subclass.getSeatWidth(),
						(int) subclass.getSeatLength());
				seatPitch = subclass.getSeatPitch();
				passengers = subclass.getPassengers();
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 24;
				seatStructure = "3-3";
				seatDimensions.setTwoDimensional(50, 60);
				seatPitch = 20;
				passengers = 1;
			}
			PremiumEconomyClass peClass = CabinFactory.eINSTANCE
					.createPremiumEconomyClass();
			passengerClass = peClass;
			break;
		case "BusinessClass":
			try {
				BusinessClass subclass = ModelHelper.getChildrenByClass(cabin,
						BusinessClass.class).get(0);
				seats = subclass.getAvailableSeats();
				seatStructure = subclass.getRowStructure();
				seatDimensions.setTwoDimensional((int) subclass.getSeatWidth(),
						(int) subclass.getSeatLength());
				seatPitch = subclass.getSeatPitch();
				passengers = subclass.getPassengers();
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 8;
				seatStructure = "2-2";
				seatDimensions.setTwoDimensional(72, 80);
				seatPitch = 30;
				passengers = 1;

			}
			BusinessClass bClass = CabinFactory.eINSTANCE.createBusinessClass();
			passengerClass = bClass;
			break;
		case "FirstClass":
			try {
				FirstClass subclass = ModelHelper.getChildrenByClass(cabin,
						FirstClass.class).get(0);
				seats = subclass.getAvailableSeats();
				seatStructure = subclass.getRowStructure();
				seatDimensions.setTwoDimensional((int) subclass.getSeatWidth(),
						(int) subclass.getSeatLength());
				seatPitch = subclass.getSeatPitch();
				passengers = subclass.getPassengers();
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 2;
				seatStructure = "1-1";
				seatDimensions.setTwoDimensional(100, 120);
				seatPitch = 40;
				passengers = 1;
			}
			FirstClass fClass = CabinFactory.eINSTANCE.createFirstClass();
			passengerClass = fClass;
			break;
		default:
			try {
				EconomyClass subclass = ModelHelper.getChildrenByClass(cabin,
						EconomyClass.class).get(0);
				seats = subclass.getAvailableSeats();
				seatStructure = subclass.getRowStructure();
				seatDimensions.setTwoDimensional((int) subclass.getSeatWidth(),
						(int) subclass.getSeatLength());
				seatPitch = subclass.getSeatPitch();
				passengers = subclass.getPassengers();
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 72;
				seatStructure = "3-3";
				seatDimensions.setTwoDimensional(50, 60);
				seatPitch = 20;
				passengers = 11;
			}
			EconomyClass eClass = CabinFactory.eINSTANCE.createEconomyClass();
			passengerClass = eClass;
			break;
		}
	}

	/**
	 * This method splits the String into parts and reads out the information in
	 * it. This string has the form X-X and it is separated by the "-" operator.
	 * 
	 * @param seatString
	 *            is the string
	 */
	public void splitSeatString(String seatString) {
		rowPartsInt = new ArrayList<Integer>();
		numbAisles = StringUtils.countMatches(seatString, "-");
		seatsInRow = 0;
		if (numbAisles != 0) {
			String[] rowParts = seatString.split("-");
			for (String str : rowParts) {
				seatsInRow += Integer.parseInt(str);
				rowPartsInt.add(Integer.parseInt(str));
			}
		} else {
			// RETURN ERROR!
		}
	}

	/**
	 * This method creates a new seat.
	 * 
	 * @param row
	 *            is the row in which the seat should be generated
	 * @param j
	 *            is the number of the seat in the row
	 */
	public void createSeat(Row row, int j) {
		Seat newSeat = CabinFactory.eINSTANCE.createSeat();
		row.getSeats().add(newSeat);
		newSeat.setSeatNumber(seatCount);
		newSeat.setSeatId(rowCount + FunctionLibrary.getCharForNumber(j));
		newSeat.setName(rowCount + FunctionLibrary.getCharForNumber(j));
		newSeat.setXDimension(seatDimensions.getX());
		newSeat.setYDimension(seatDimensions.getY());
		newSeat.setLetter(FunctionLibrary.getCharForNumber(j));
		newSeat.setXPosition(globalSeatPositionX);
		newSeat.setYPosition(globalSeatPositionY);
		newSeat.setTravelClass(passengerClass);
	}

	/**
	 * This method checks if there is a door at the current y position. If so,
	 * the y position is increased.
	 */
	public void checkForDoor() {
		double seatPitchMultiplicator = 1.5;
		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			if ((((door.getYPosition() + door.getWidth()) > (globalSeatPositionY - seatPitch)) && (door
					.getYPosition() < globalSeatPositionY))
					|| ((door.getYPosition() > globalSeatPositionY)
							&& (door.getYPosition() < globalSeatPositionY
									+ seatDimensions.getY()) || ((door
							.getYPosition() + door.getWidth() > globalSeatPositionY) && (door
							.getYPosition() < globalSeatPositionY)))) {
				globalSeatPositionY += seatPitchMultiplicator * seatPitch;
			}
		}
	}

	/**
	 * This method creates a class and the subclasses (seats, rows, etc.).
	 * 
	 * @param travelSubClass
	 *            is the subclass
	 * @param <T>
	 *            is a helper class
	 */
	public <T extends TravelClass> void createClass(Class<T> travelSubClass) {
		passengerClass = null;
		switchSettings(travelSubClass);
		if (seats > 0) {

			cabin.getClasses().add(passengerClass);
			splitSeatString(seatStructure);
			passengerClass.setPassengers(passengers);
			passengerClass.setAvailableSeats(seats);
			passengerClass.setRowStructure(seatStructure);
			passengerClass.setSeatPitch(seatPitch);
			passengerClass.setSeatWidth(seatDimensions.getX());
			passengerClass.setSeatLength(seatDimensions.getY());
			passengerClass.setName("");

			seatHelper = 0;
			for (int i = 1; i <= seats / seatsInRow; i++) {
				globalSeatPositionX = 0;

				/** Calculate the gap between the seats **/
				if ((seatsInRow * seatDimensions.getX() + cabin.getAisleWidth()) <= cabin
						.getCabinWidth()) {
					globalSeatPositionX = ((cabin.getCabinWidth() - numbAisles
							* cabin.getAisleWidth() - seatsInRow
							* seatDimensions.getX()) / (seatsInRow + numbAisles + 1));
					seatHelper = globalSeatPositionX;
				} else {
					logger.log(new Status(IStatus.ERROR,
							"net.bhl.cdt.model.cabin",
							"Check your x dimensions! Cabin too narrow."));
					seatHelper = 0;
					globalSeatPositionX = 0;
				}
				/****************************************/

				if ((globalSeatPositionX < 0)) {
					seatHelper = 0;
					globalSeatPositionX = 0;
					logger.log(new Status(IStatus.ERROR,
							"net.bhl.cdt.model.cabin",
							"Check seat and cabin dimensions! Cabin too narrow."));
				}
				globalSeatPositionY += seatPitch;

				if (cabin.getRowNonexistent() == rowCount) {
					rowCount++;
				}
				createRow();
				rowCount++;
				globalSeatPositionY = globalSeatPositionY
						+ seatDimensions.getY();
			}
			if (!travelSubClass.getSimpleName().equals("EconomyClass")) {
				createCurtain(
						true,
						"after "
								+ FunctionLibrary.splitCamelCase(travelSubClass
										.getSimpleName()));
			}
		}
	}

	/**
	 * This function creates a row and the seats in it.
	 */
	public void createRow() {
		Row newRow = CabinFactory.eINSTANCE.createRow();
		passengerClass.getRows().add(newRow);
		newRow.setRowNumber(rowCount);
		checkForDoor();
		int seatLabelCount = 1;
		for (int rowBlock : rowPartsInt) {
			for (int j = 1; j <= rowBlock; j++) {
				createSeat(newRow, seatLabelCount);
				seatLabelCount++;
				globalSeatPositionX = globalSeatPositionX
						+ seatDimensions.getX() + seatHelper;
				seatCount++;
			}
			globalSeatPositionX = cabin.getAisleWidth() + globalSeatPositionX + seatHelper;
		}
	}

	/**
	 * This function creates a door.
	 * 
	 * @param typeDoor
	 *            is the type of the door
	 * @param symmetrical
	 *            describes if the door will be generated on both sides
	 * @param id
	 *            is the id of the door
	 * @param yPosition
	 *            set it to -1 to ignore value, only important for emergency
	 *            exit.
	 * @param <T>
	 *            is a helper class
	 */
	public <T extends Door> void createDoor(Class<T> typeDoor,
			boolean symmetrical, int id, double yPosition) {
		Boolean mainDoorAlreadyExists = false;
		if (!mainDoorAlreadyExists) {
			for (Door testDoor : cabin.getDoors()) {
				if (typeDoor.getSimpleName().equals("MainDoor")
						&& (testDoor instanceof MainDoor)) {
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
		} else if (typeDoor.getSimpleName().equals("StandardDoor")) {
			StandardDoor standardDoor = CabinFactory.eINSTANCE
					.createStandardDoor();
			newDoor = standardDoor;
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
	public void createCurtain(boolean openOrNot, String name) {
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
	 * @param isSymmetricalToLavatoryBefore
	 *            describes if the lavatory is meant to be placed on the same
	 *            y-coordinate, symmetrical to the galley created before.
	 * @param xDimension
	 *            is the x dimension
	 * @param yDimension
	 *            is the y dimension
	 */
	public void createLavatory(Boolean isSymmetricalToLavatoryBefore,
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
	 *            is the direction of the stairway
	 * @param xPosition
	 *            is the x position of the stairway
	 * @param yPostion
	 *            is the y position of the stairway
	 * @param xDimension
	 *            is the x dimension of the stairway
	 * @param yDimension
	 *            is the y dimension of the stairway
	 */

	public void createStairway(StairwayDirection direction, double xPosition,
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
	 * This method creates a galley.
	 * 
	 * @param isSymmetricalToGalleyBefore
	 *            check if the galley created is the symmtrical element of the
	 *            galley created before.
	 * @param xDimension
	 *            is the x dimension of the galley
	 * @param yDimension
	 *            is the y dimension of the galley
	 */
	public void createGalley(Boolean isSymmetricalToGalleyBefore,
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

}
