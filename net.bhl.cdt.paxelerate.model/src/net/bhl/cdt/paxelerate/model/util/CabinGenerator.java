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
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.DoorOption;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.util.input.InputChecker;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class contains all constructors for the different elements of the cabin.
 * You can construct every single part of cabin on its own.
 *
 * @author marc.engelmann
 * @see GenerateCabinCommand.java for implementation example.
 */
public class CabinGenerator {
	
	/** The cabin. */
	private Cabin cabin;

	/** The number of aisles. */
	private int globalSeatPositionY, globalSeatPositionX, seats, abreast,
			seatPitch, seatHelper, passengers, numberOfAisles;

	/** The seat dimensions. */
	private Vector seatDimensions = new Vector2D(0, 0);

	/** The tc. */
	private TravelClass tc;
	
	/** The row parts int. */
	private ArrayList<Integer> rowPartsInt;

	/** The do it once. */
	boolean doItOnce = true;
	
	/** The seat structure. */
	private String seatStructure = "1-1";

	/**
	 * This method is the constructor of this class.
	 *
	 * @param cabin
	 *            the cabin element
	 */
	public CabinGenerator(Cabin cabin) {
		this.cabin = cabin;
		rowPartsInt = new ArrayList<Integer>();
		globalSeatPositionY = 0;
		globalSeatPositionX = 50;
		seatStructure = "3-3";
	}

	/**
	 * Returns the cabin.
	 * 
	 * @return the cabin that was created within this class.
	 */
	public Cabin getCabin() {
		return cabin;
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
	 * Load the class settings depending on type.
	 * 
	 * NOTE: This only works if there is just one existing class per class type.
	 * 
	 * @param travelOption
	 *            the subclass
	 */
	public void switchSettings(TravelOption travelOption) {

		tc = CabinFactory.eINSTANCE.createTravelClass();
		tc.setTravelOption(travelOption);

		switch (travelOption) {
		case PREMIUM_ECONOMY_CLASS:

			seats = 24;
			seatStructure = "3-3";
			seatDimensions = new Vector2D(60, 50);
			seatPitch = 85;
			passengers = 1;
			break;

		case BUSINESS_CLASS:

			seats = 8;
			seatStructure = "2-2";
			seatDimensions = new Vector2D(80, 72);
			seatPitch = 90;
			passengers = 1;
			break;

		case FIRST_CLASS:

			seats = 2;
			seatStructure = "1-1";
			seatDimensions = new Vector2D(120, 100);
			seatPitch = 100;
			passengers = 1;
			break;

		case ECONOMY_CLASS:

			seats = 72;
			seatStructure = "3-3";
			seatDimensions = new Vector2D(60, 50);
			seatPitch = 80;
			passengers = 1;
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
		numberOfAisles = StringUtils.countMatches(seatString, "-");
		abreast = 0;
		String[] rowParts = seatString.split("-");
		for (String str : rowParts) {
			abreast += Integer.parseInt(str);
			rowPartsInt.add(Integer.parseInt(str));
		}
	}

	/**
	 * This method creates the physical objects except for seats!.
	 *
	 * @param option the option
	 * @param xDimension the x dimension
	 */
	public void createPhysicalObject(ObjectOption option, int xDimension) {
		int currentPosition = 0;
		splitSeatString(seatStructure);
		if (doItOnce) {
			if (!cabin.getClasses().isEmpty()) {
				seatStructure = cabin.getClasses().get(0).getRowStructure();
				splitSeatString(seatStructure);
			} else {
				rowPartsInt.clear();
				rowPartsInt.addAll(Arrays.asList(3, 3));
			}
			doItOnce = false;
		}

		for (int k = 0; k < rowPartsInt.size(); k++) {

			PhysicalObject obj;

			switch (option) {
			case LAVATORY:
				obj = CabinFactory.eINSTANCE.createLavatory();
				cabin.getLavatories().add((Lavatory) obj);
				obj.setName(" " + cabin.getLavatories().size() + 1);
				obj.setId(cabin.getLavatories().size() + 1);
				break;

			case GALLEY:
				obj = CabinFactory.eINSTANCE.createGalley();
				cabin.getGalleys().add((Galley) obj);
				obj.setName(" " + cabin.getGalleys().size() + 1);
				obj.setId(cabin.getGalleys().size() + 1);
				break;

			default:
				obj = null;
				break;
			}
			try {
				obj.setXDimension(xDimension);
			} catch (NullPointerException e) {
				Log.add(this, "Define the seat dimensions");
				e.printStackTrace();
			}
			
			
			try {
				obj.setXPosition(globalSeatPositionX);
				obj.setYDimension(rowPartsInt.get(k)
						* (tc.getYDimensionOfSeats() + seatHelper)
						+ seatHelper);
			} catch (NullPointerException e) {
				e.printStackTrace();
				obj.setYDimension((cabin.getYDimension()
						- numberOfAisles * cabin.getAisleWidth())
						/ (numberOfAisles + 1));
			}
			obj.setYPosition(currentPosition);
			currentPosition = currentPosition + obj.getYDimension()
					+ cabin.getAisleWidth();

		}
		globalSeatPositionX += xDimension;
	}

	/**
	 * This method creates a new seat.
	 *
	 * @param row            is the row in which the seat should be generated
	 */
	public void createSeat(Row row) {

		Seat newSeat = CabinFactory.eINSTANCE.createSeat();
		row.getSeats().add(newSeat);

		newSeat.setId(
				ModelHelper.getChildrenByClass(cabin, Seat.class).size() + 1);

		newSeat.setName(row.getRowNumber()
				+ StringHelper.toString(row.getSeats().size()));

		newSeat.setXDimension(seatDimensions.getX());
		newSeat.setYDimension(seatDimensions.getY());

		newSeat.setLetter("" + StringHelper.toString(row.getSeats().size()));

		newSeat.setXPosition(globalSeatPositionX);
		newSeat.setYPosition(globalSeatPositionY);
		newSeat.setTravelClass(tc);
		newSeat.setRow(row);
	}

	/**
	 * This method creates a class and the subclasses (seats, rows, etc.).
	 *
	 * @param travelOption            is the subclass
	 */
	public void createClass(TravelOption travelOption) {

		tc = null;
		switchSettings(travelOption);
		cabin.getClasses().add(tc);
		splitSeatString(seatStructure);

		tc.setPassengers(passengers);
		tc.setAvailableSeats(seats);
		tc.setRowStructure(InputChecker.checkStructureString(seatStructure));

		tc.setSeatPitch(seatPitch);
		tc.setYDimensionOfSeats(seatDimensions.getY());
		tc.setXDimensionOfSeats(seatDimensions.getX());
		tc.setName("");

		if (seats > 0) {
			seatHelper = 0;
			if ((seats % abreast) != 0) {
				Log.add(this,
						"Check your number of seats in "
								+ StringHelper
										.splitCamelCase(travelOption.getName())
								+ ". Could not fill all rows.");
			}

			if (tc.getTravelOption() == TravelOption.FIRST_CLASS) {
				globalSeatPositionX += 20;
			}

			for (int i = 1; i <= seats / abreast; i++) {
				globalSeatPositionY = 0;

				/** Calculate the gap between the seats **/
				if ((abreast * seatDimensions.getY()
						+ numberOfAisles * cabin.getAisleWidth()) <= cabin
								.getYDimension()) {

					globalSeatPositionY = ((cabin.getYDimension()
							- numberOfAisles * cabin.getAisleWidth()
							- abreast * seatDimensions.getY())
							/ (abreast + numberOfAisles + 1));

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

				createRow();

				globalSeatPositionX += seatPitch;

			}
			if (!(tc.getTravelOption() == TravelOption.ECONOMY_CLASS)) {
				createCurtain(true, "after "
						+ StringHelper.splitCamelCase(travelOption.getName()));
			}
		}
	}

	/**
	 * This function creates a row and the seats in it.
	 */
	public void createRow() {

		Row newRow = CabinFactory.eINSTANCE.createRow();
		tc.getRows().add(newRow);

		newRow.setRowNumber(
				ModelHelper.getChildrenByClass(cabin, Row.class).size());

		for (int rowBlock : rowPartsInt) {

			for (int j = 1; j <= rowBlock; j++) {

				createSeat(newRow);

				globalSeatPositionY = globalSeatPositionY
						+ seatDimensions.getY() + seatHelper;

			}
			globalSeatPositionY = cabin.getAisleWidth() + globalSeatPositionY
					+ seatHelper;
		}
	}

	/**
	 * This function creates a door.
	 *
	 * @param option the option
	 * @param symmetrical            describes if the door will be generated on both sides
	 * @param id            is the id of the door
	 * @param yPosition            set it to -1 to ignore value, only important for emergency
	 *            exit.
	 */
	public void createDoor(DoorOption option, boolean symmetrical, int id,
			int yPosition) {

		Door door = CabinFactory.eINSTANCE.createDoor();

		door.setDoorOption(option);
		door.setId(id);
		door.setOnBothSides(symmetrical);

		switch (option) {

		case EMERGENCY_EXIT:
			door.setWidth(50);
			door.setXPosition(yPosition);
			door.setIsActive(false);
			break;

		default:
			door.setWidth(80);
			door.setXPosition(globalSeatPositionX);
			door.setIsActive(false);
			globalSeatPositionX += 80;
			break;
		}

		cabin.getDoors().add(door);
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
			Curtain curtain = CabinFactory.eINSTANCE.createCurtain();
			cabin.getCurtains().add(curtain);
			curtain.setCurtainOpen(openOrNot);
			curtain.setName(name + " (Part " + (k + 1) + ")");
			curtain.setXDimension(10);
			curtain.setId(cabin.getCurtains().size() + 1);
			curtain.setXPosition(globalSeatPositionX + 10);
			curtain.setYDimension(rowPartsInt.get(k)
					* (tc.getYDimensionOfSeats() + seatHelper) + seatHelper);
			curtain.setYPosition(currentCurtainPosition);
			currentCurtainPosition = currentCurtainPosition
					+ curtain.getYDimension() + cabin.getAisleWidth();
		}
		globalSeatPositionX += 40;
	}
}
