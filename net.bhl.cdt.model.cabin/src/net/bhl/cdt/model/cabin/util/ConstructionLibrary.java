/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
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
	private String seatsInRowString = "";
	private int numbAisles;
	private Vector seatDimensions = new Vector(0, 0);
	private double seatPitch;
	private double seatHelper;
	private TravelClass subbClazz;
	private ILog logger;

	/**
	 * This method is the constructor of this class.
	 *
	 * @param cabin
	 *            the cabin element
	 */
	public ConstructionLibrary(Cabin cabin) {
		this.cabin = cabin;
		globalSeatPositionX = 0;
		globalSeatPositionY = 0;
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
	 * This method clears all objects from the cabin object.
	 */
	public void clearCabin() {
		cabin.getDoors().clear();
		cabin.getLavatories().clear();
		cabin.getGalleys().clear();
		cabin.getCurtains().clear();
		cabin.getStairways().clear();
		cabin.getStowages().clear();
		cabin.getPassengers().clear();
		cabin.getClasses().clear();
	}

	/**
	 * Load the class settings depending on type.
	 * 
	 * @param travelSubClass
	 *            the subclass
	 * @param <T>
	 *            is a helper Class
	 */
	public <T extends TravelClass> void switchSettings(Class<T> travelSubClass) {
		if (travelSubClass.getSimpleName().equals("PremiumEconomyClass")) {
			// if (!ModelHelper.getChildrenByClass(cabin,
			// PremiumEconomyClass.class).isEmpty()) {
			// } else {
			seats = 24;
			seatsInRowString = "3-3";
			seatDimensions.setTwoDimensional(50, 60);
			seatPitch = 20;
			// }
		} else if (travelSubClass.getSimpleName().equals("BusinessClass")) {
			seats = 8;
			seatsInRowString = "2-2";
			seatDimensions.setTwoDimensional(72, 80);
			seatPitch = 30;
		} else if (travelSubClass.getSimpleName().equals("FirstClass")) {
			seats = 2;
			seatsInRowString = "1-1";
			seatDimensions.setTwoDimensional(100, 120);
			seatPitch = 40;
		} else {
			seats = 72;
			seatsInRowString = "3-3";
			seatDimensions.setTwoDimensional(50, 60);
			seatPitch = 20;
		}
		seatsInRow = 6;
	}

	/**
	 * This method splits the String into parts and reads out the information in
	 * it. This string has the form X-X and it is separated by the "-" operator.
	 * 
	 * @param seatString
	 *            is the string
	 */
	public void splitSeatString(String seatString) {
		numbAisles = StringUtils.countMatches(seatString, "-");
		seatsInRow = 0;
		if (numbAisles != 0) {
			String[] rowParts = seatString.split("-");
			for (String str : rowParts) {
				seatsInRow += Integer.parseInt(str);
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
		// Create new instance of Seat
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
		newSeat.setTravelClass(subbClazz);
		double aisleSpace = 0;
		seatCount++;
		if (j == (seatsInRow / 2)) {
			aisleSpace = cabin.getAisleWidth() + seatHelper;
		}
		globalSeatPositionX = globalSeatPositionX + seatDimensions.getX()
				+ aisleSpace + seatHelper;
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
					subbClazz = subClass;
					subbClazz.setPassengers(1);
				} else if (travelSubClass.getSimpleName()
						.equals("EconomyClass")) {
					EconomyClass subClass = CabinFactory.eINSTANCE
							.createEconomyClass();
					subbClazz = subClass;
					subbClazz.setPassengers(20);
				} else if (travelSubClass.getSimpleName().equals("FirstClass")) {
					FirstClass subClass = CabinFactory.eINSTANCE
							.createFirstClass();
					subbClazz = subClass;
					subbClazz.setPassengers(1);
				} else if (travelSubClass.getSimpleName().equals(
						"BusinessClass")) {
					BusinessClass subClass = CabinFactory.eINSTANCE
							.createBusinessClass();
					subbClazz = subClass;
					subbClazz.setPassengers(1);
				}
				cabin.getClasses().add(subbClazz);
				splitSeatString(seatsInRowString);
				subbClazz.setAvailableSeats(seats);
				subbClazz.setSeatPitch(seatPitch);
				subbClazz.setSeatsPerRow(seatsInRow);
				subbClazz.setSeatWidth(seatDimensions.getX());
				subbClazz.setSeatLength(seatDimensions.getY());
				subbClazz.setName("");

				/**************************************************************************/
				seatHelper = 0;
				for (int i = 1; i <= seats / seatsInRow; i++) {
					globalSeatPositionX = 0;
					if ((seatsInRow * seatDimensions.getX() + cabin
							.getAisleWidth()) <= cabin.getCabinWidth()) {
						switch (numbAisles) {
						case 1:
							globalSeatPositionX = ((cabin.getCabinWidth() - cabin
									.getAisleWidth()) / 2 - (seatsInRow / 2)
									* seatDimensions.getX())
									/ (1 + seatsInRow / 2);
							seatHelper = globalSeatPositionX;
							break;
						default:
							logger.log(new Status(IStatus.ERROR,
									"net.bhl.cdt.model.cabin",
									"Number of aisles not supported!"));
							break;
						}
					} else {
						logger.log(new Status(IStatus.ERROR,
								"net.bhl.cdt.model.cabin",
								"Check your x dimensions! Cabin too narrow."));
						seatHelper = 0;
						globalSeatPositionX = 0;
					}
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

					createRows();

					rowCount++;
					globalSeatPositionY = globalSeatPositionY
							+ seatDimensions.getY();
				}
				if (!travelSubClass.getSimpleName().equals("EconomyClass")) {
					createCurtain(
							true,
							"after "
									+ FunctionLibrary
											.splitCamelCase(travelSubClass
													.getSimpleName()));
				}
			} else {
				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
						"Please choose an even number for SeatsPerRow"));
			}
		}
	}

	/**
	 * This function creates a row and the seats in it.
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
