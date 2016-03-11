/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.model.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang.StringUtils;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.BusinessClass;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.EconomyClass;
import net.bhl.cdt.paxelerate.model.EmergencyExit;
import net.bhl.cdt.paxelerate.model.FirstClass;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.MainDoor;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.PremiumEconomyClass;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.Stairway;
import net.bhl.cdt.paxelerate.model.StairwayDirection;
import net.bhl.cdt.paxelerate.model.StandardDoor;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.util.input.InputChecker;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class contains all constructors for the different elements of the cabin.
 * You can construct every single part of cabin on its own.
 * 
 * @see GenerateCabinCommand.java for implementation example.
 * 
 * @author marc.engelmann
 *
 */
public class ConstructionLibrary {
	private Cabin cabin;

	private int seatCount, rowCount, globalSeatPositionY, globalSeatPositionX,
			seats, seatsInRow, seatPitch, seatHelper, passengers, numbAisles,
			galleyCount = 1, lavatoryCount = 1, curtainCount = 1;

	private final static int DISTANCE_INCREMENT_DOOR = 20;

	private Vector seatDimensions = new Vector2D(0, 0);

	private TravelClass passengerClass;
	private ArrayList<Integer> rowPartsInt;

	boolean doItOnce = true;
	private String seatStructure = "1-1";

	/**
	 * This method is the constructor of this class.
	 *
	 * @param cabin
	 *            the cabin element
	 */
	public ConstructionLibrary(Cabin cabin) {
		this.cabin = cabin;
		rowPartsInt = new ArrayList<Integer>();
		globalSeatPositionY = 0;
		globalSeatPositionX = 0;
		seatStructure = "3-3";
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
	 * 
	 * @param presetValueA
	 * @param presetValueB
	 * @param presetValueC
	 * @param elseValue
	 * @return
	 */
	private Object tryPreset(Object presetValueA, Object presetValueB,
			Object presetValueC, Object elseValue) {
		if (cabin.isUsePresetSettings()) {
			switch (cabin.getAircraftType()) {
			case REGIONAL:
				return presetValueA;
			case NARROWBODY:
				return presetValueB;
			case WIDEBODY:
				return presetValueC;
			default:
				return elseValue;
			}
		} else {
			return elseValue;
		}
	}

	/**
	 * This method clears all objects from the cabin object <b>excluding the
	 * passenger classes</b>. These are removed in a later step.
	 */
	public void clearCabin() {
		cabin.getClasses().clear();
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
	public <T extends TravelClass> void switchSettings(
			Class<T> travelSubClass) {
		switch (travelSubClass.getSimpleName()) {
		case "PremiumEconomyClass":
			try {
				PremiumEconomyClass subclass = ModelHelper
						.getChildrenByClass(cabin, PremiumEconomyClass.class)
						.get(0);
				seats = (int) tryPreset(0, 18, 40,
						subclass.getAvailableSeats());
				seatStructure = (String) tryPreset("2-2", "3-3", "3-4-3",
						subclass.getRowStructure());
				seatDimensions = new Vector2D(subclass.getXDimensionOfSeats(),
						subclass.getYDimensionOfSeats());
				seatPitch = subclass.getSeatPitch();
				passengers = (int) tryPreset(0, 0, 0, subclass.getPassengers());
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = (int) tryPreset(0, 24, 40, 24);
				seatStructure = (String) tryPreset("2-2", "3-3", "3-4-3",
						"3-3");
				seatDimensions = new Vector2D(60, 50);
				seatPitch = 85;
				passengers = 1;
			}
			passengerClass = CabinFactory.eINSTANCE.createPremiumEconomyClass();
			break;
		case "BusinessClass":
			try {
				BusinessClass subclass = ModelHelper
						.getChildrenByClass(cabin, BusinessClass.class).get(0);
				seats = (int) tryPreset(4, 12, 35,
						subclass.getAvailableSeats());
				seatStructure = (String) tryPreset("1-1", "2-2", "2-3-2",
						subclass.getRowStructure());
				seatDimensions = new Vector2D(subclass.getXDimensionOfSeats(),
						subclass.getYDimensionOfSeats());
				seatPitch = subclass.getSeatPitch();
				passengers = (int) tryPreset(0, 0, 0, subclass.getPassengers());
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 8;
				seatStructure = "2-2";
				seatDimensions = new Vector2D(80, 72);
				seatPitch = 90;
				passengers = 1;
			}
			passengerClass = CabinFactory.eINSTANCE.createBusinessClass();
			break;
		case "FirstClass":
			try {
				FirstClass subclass = ModelHelper
						.getChildrenByClass(cabin, FirstClass.class).get(0);
				seats = (int) tryPreset(2, 2, 8, subclass.getAvailableSeats());
				seatStructure = (String) tryPreset("1-1", "1-1", "1-2-1",
						subclass.getRowStructure());
				seatDimensions = new Vector2D(subclass.getXDimensionOfSeats(),
						subclass.getYDimensionOfSeats());
				seatPitch = subclass.getSeatPitch();
				passengers = (int) tryPreset(0, 0, 0, subclass.getPassengers());
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 2;
				seatStructure = "1-1";
				seatDimensions = new Vector2D(120, 100);
				seatPitch = 100;
				passengers = 1;
			}
			passengerClass = CabinFactory.eINSTANCE.createFirstClass();
			break;
		case "EconomyClass":
			try {
				EconomyClass subclass = ModelHelper
						.getChildrenByClass(cabin, EconomyClass.class).get(0);
				seats = (int) tryPreset(20, 72, 280,
						subclass.getAvailableSeats());
				seatStructure = (String) tryPreset("2-2", "3-3", "3-4-3",
						subclass.getRowStructure());
				seatDimensions = new Vector2D(subclass.getXDimensionOfSeats(),
						subclass.getYDimensionOfSeats());
				seatPitch = subclass.getSeatPitch();
				passengers = (int) tryPreset(2, 2, 2, subclass.getPassengers());
				cabin.getClasses().remove(subclass);
			} catch (IndexOutOfBoundsException e) {
				seats = 72;
				seatStructure = "3-3";
				seatDimensions = new Vector2D(60, 50);
				seatPitch = 80;
				passengers = 1;
			}
			passengerClass = CabinFactory.eINSTANCE.createEconomyClass();
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

		/*
		 * This method checks the user input for errors and automatically
		 * corrects it!
		 */
		seatString = InputChecker.checkStructureString(seatString);

		rowPartsInt = new ArrayList<Integer>();
		numbAisles = StringUtils.countMatches(seatString, "-");
		seatsInRow = 0;
		String[] rowParts = seatString.split("-");
		for (String str : rowParts) {
			seatsInRow += Integer.parseInt(str);
			rowPartsInt.add(Integer.parseInt(str));
		}
	}

	/**
	 * This method creates the physical objects except for seats!
	 * 
	 * @param physicalObjectClass
	 * @param yDimension
	 */
	public <P extends PhysicalObject> void createPhysicalObject(
			Class<P> physicalObjectClass, int yDimension) {
		int currentPosition = 0;
		splitSeatString(seatStructure);
		if (doItOnce) {
			try {
				seatStructure = cabin.getClasses().get(0).getRowStructure();
				splitSeatString(seatStructure);
			} catch (IndexOutOfBoundsException e) {
				rowPartsInt.clear();
				rowPartsInt.addAll(Arrays.asList(3, 3));
			}
			doItOnce = false;
		}

		for (int k = 0; k < rowPartsInt.size(); k++) {
			PhysicalObject physialObject = null;
			switch (physicalObjectClass.getSimpleName()) {
			case "Lavatory":
				physialObject = CabinFactory.eINSTANCE.createLavatory();
				cabin.getLavatories().add((Lavatory) physialObject);
				physialObject.setName(" " + lavatoryCount);
				physialObject.setId(lavatoryCount);
				lavatoryCount++;
				break;
			case "Galley":
				physialObject = CabinFactory.eINSTANCE.createGalley();
				cabin.getGalleys().add((Galley) physialObject);
				physialObject.setName(" " + galleyCount);
				physialObject.setId(galleyCount);
				galleyCount++;
				break;
			}
			physialObject.setXDimension(yDimension);
			physialObject.setXPosition(globalSeatPositionX);
			try {
				physialObject.setYDimension(rowPartsInt.get(k)
						* (passengerClass.getYDimensionOfSeats() + seatHelper)
						+ seatHelper);
			} catch (NullPointerException e) {
				physialObject.setYDimension((cabin.getYDimension()
						- numbAisles * cabin.getAisleWidth())
						/ (numbAisles + 1));
			}
			physialObject.setYPosition(currentPosition);
			currentPosition = currentPosition + physialObject.getYDimension()
					+ cabin.getAisleWidth();

		}
		globalSeatPositionX += yDimension;
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
		newSeat.setId(seatCount);
		newSeat.setName(rowCount + StringHelper.toString(j));
		newSeat.setXDimension(seatDimensions.getX());
		newSeat.setYDimension(seatDimensions.getY());
		newSeat.setLetter("" + StringHelper.toString(j));
		newSeat.setXPosition(globalSeatPositionX);
		newSeat.setYPosition(globalSeatPositionY);
		newSeat.setTravelClass(passengerClass);
		newSeat.setRow(row);
	}

	/**
	 * This method checks if there is a door at the current x position. If so,
	 * the x position is increased.
	 */
	public void checkForDoor() {
		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			if ((((door.getXPosition() + door.getWidth()) > (globalSeatPositionX
					- seatPitch))
					&& (door.getXPosition() < globalSeatPositionX))
					|| ((door.getXPosition() > globalSeatPositionX)
							&& (door.getXPosition() < globalSeatPositionX
									+ seatDimensions.getY())
							|| ((door.getXPosition()
									+ door.getWidth() > globalSeatPositionX)
									&& (door.getXPosition() < globalSeatPositionX)))) {
				globalSeatPositionX += DISTANCE_INCREMENT_DOOR;
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
		cabin.getClasses().add(passengerClass);
		splitSeatString(seatStructure);
		passengerClass.setPassengers(passengers);
		passengerClass.setAvailableSeats(seats);
		passengerClass.setRowStructure(
				InputChecker.checkStructureString(seatStructure));
		passengerClass.setSeatPitch(seatPitch);
		passengerClass.setYDimensionOfSeats(seatDimensions.getY());
		passengerClass.setXDimensionOfSeats(seatDimensions.getX());
		passengerClass.setName("");
		if (seats > 0) {
			seatHelper = 0;
			if ((seats % seatsInRow) != 0) {
				Log.add(this,
						"Check your number of seats in "
								+ StringHelper.splitCamelCase(
										travelSubClass.getSimpleName())
						+ ". Could not fill all rows.");
			}
			for (int i = 1; i <= seats / seatsInRow; i++) {
				globalSeatPositionY = 0;

				/** Calculate the gap between the seats **/
				if ((seatsInRow * seatDimensions.getY()
						+ numbAisles * cabin.getAisleWidth()) <= cabin
								.getYDimension()) {
					globalSeatPositionY = ((cabin.getYDimension()
							- numbAisles * cabin.getAisleWidth()
							- seatsInRow * seatDimensions.getY())
							/ (seatsInRow + numbAisles + 1));
					seatHelper = globalSeatPositionY;
				} else {
					Log.add(this, "The seats in row " + i
							+ " do not fit into the cabin!");
					seatHelper = 0;
					globalSeatPositionY = 0;
				}
				/****************************************/

				if ((globalSeatPositionY < 0)) {
					seatHelper = 0;
					globalSeatPositionY = 0;
					Log.add(this, "The seats in row " + i
							+ " do not fit into the cabin!");
				}

				if (cabin.getRowNonexistent() == rowCount) {
					rowCount++;
				}
				createRow();
				rowCount++;
				globalSeatPositionX += seatPitch;

			}
			if (!(passengerClass instanceof EconomyClass)) {
				createCurtain(true, "after " + StringHelper
						.splitCamelCase(travelSubClass.getSimpleName()));
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
				globalSeatPositionY = globalSeatPositionY
						+ seatDimensions.getY() + seatHelper;
				seatCount++;
			}
			globalSeatPositionY = cabin.getAisleWidth() + globalSeatPositionY
					+ seatHelper;
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
			boolean symmetrical, int id, int yPosition) {
		Boolean mainDoorAlreadyExists = false;
		if (!mainDoorAlreadyExists) {
			for (Door testDoor : cabin.getDoors()) {
				if (typeDoor.getSimpleName().equals("MainDoor")
						&& (testDoor instanceof MainDoor)) {
					Log.add(this, "You created more than one main door!");
					mainDoorAlreadyExists = true;
				}
			}
		}
		Door newDoor = null;
		if (typeDoor.getSimpleName().equals("MainDoor")) {
			MainDoor mainDoor = CabinFactory.eINSTANCE.createMainDoor();
			newDoor = mainDoor;
			newDoor.setWidth(80);
			newDoor.setXPosition(globalSeatPositionX);
			globalSeatPositionX += 80;
		} else if (typeDoor.getSimpleName().equals("StandardDoor")) {
			StandardDoor standardDoor = CabinFactory.eINSTANCE
					.createStandardDoor();
			newDoor = standardDoor;
			newDoor.setWidth(80);
			newDoor.setXPosition(globalSeatPositionX);
			globalSeatPositionX += 80;
		} else {
			EmergencyExit emergencyExit = CabinFactory.eINSTANCE
					.createEmergencyExit();
			newDoor = emergencyExit;
			newDoor.setWidth(50);
			newDoor.setXPosition(yPosition);
			newDoor.setIsActive(false);
			if (yPosition < 0) {
				Log.add(this, "Emergency Exit has a illegal yPosition.");
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
	 * 
	 */
	public void createCurtain(boolean openOrNot, String name) {
		int currentCurtainPosition = 0;
		for (int k = 0; k < rowPartsInt.size(); k++) {
			Curtain newCurtain = CabinFactory.eINSTANCE.createCurtain();
			cabin.getCurtains().add(newCurtain);
			newCurtain.setCurtainOpen(openOrNot);
			newCurtain.setName(name + " (Part " + (k + 1) + ")");
			newCurtain.setXDimension(10);
			newCurtain.setId(curtainCount);
			newCurtain.setXPosition(globalSeatPositionX + 10);
			newCurtain.setYDimension(rowPartsInt.get(k)
					* (passengerClass.getYDimensionOfSeats() + seatHelper)
					+ seatHelper);
			newCurtain.setYPosition(currentCurtainPosition);
			currentCurtainPosition = currentCurtainPosition
					+ newCurtain.getYDimension() + cabin.getAisleWidth();
			curtainCount++;
		}
		globalSeatPositionX += 40;
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

	public void createStairway(StairwayDirection direction, int xPosition,
			int yPostion, int xDimension, int yDimension) {
		Stairway newStairway = CabinFactory.eINSTANCE.createStairway();
		cabin.getStairways().add(newStairway);
		newStairway.setYPosition(xPosition);
		newStairway.setXPosition(yPostion);
		newStairway.setDirection(direction);
		newStairway.setYDimension(xDimension);
		newStairway.setXDimension(yDimension);
	}

}
