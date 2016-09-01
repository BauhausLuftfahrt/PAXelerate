/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.astar.node.Node;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * The Class AgentFunctions.
 *
 * @author marc.engelmann, michael.schmidt
 * @version 0.8
 * @since 0.5
 */
public class AgentFunctions {

	/** The Constant PIXELS_FOR_SCANNING_AT_DOOR. */
	public static final int PIXELS_FOR_SCANNING_AT_DOOR = 3;

	/**
	 * Someone already in this part of the row.
	 *
	 * @param agent
	 *            the agent
	 * @return true, if successful
	 */
	public static boolean someoneAlreadyInThisPartOfTheRow(Agent agent) {
		boolean rowOccupied = false;
		Row row = agent.getPassenger().getSeat().getRow();
		for (Seat checkSeat : row.getSeats()) {
			/* check for blocked seats in my part of the row */
			if (checkSeat.isOccupied()) {
				if (sameSideOfAisle(checkSeat,
						agent.getPassenger().getSeat())) {
					/* identify passengers which have to stand up for me */
					if (otherSeatCloserToAisle(checkSeat,
							agent.getPassenger().getSeat())) {
						agent.otherPassengersInRowBlockingMe
								.add(checkSeat.getPassenger());
						rowOccupied = true;
					}
				}
			}
		}
		return rowOccupied;
	}

	/**
	 * Same side of aisle.
	 *
	 * @param checkSeat
	 *            the check seat
	 * @param mySeat
	 *            the my seat
	 * @return true, if successful
	 */
	private static boolean sameSideOfAisle(Seat checkSeat, Seat mySeat) {

		int seatAbrest = checkSeatAbrest(mySeat);
		int rowStructure = checkRowStructure(mySeat);

		switch (seatAbrest) {

		default:
			return false;
		case 4:
			switch (rowStructure) {
			case 1:
				if (checkSeatLocation(checkSeat, mySeat, "A")
						|| checkSeatLocation(checkSeat, mySeat, "BCD")) {
					return true;
				}
				break;
			case 2:
				if (checkSeatLocation(checkSeat, mySeat, "AB")
						|| checkSeatLocation(checkSeat, mySeat, "CD")) {
					return true;
				}
				break;
			case 3:
				if (checkSeatLocation(checkSeat, mySeat, "ABC")
						|| checkSeatLocation(checkSeat, mySeat, "D")) {
					return true;
				}
				break;
			/*
			 * AC - DF if (checkSeatLocation(checkSeat, mySeat, "AC") ||
			 * checkSeatLocation(checkSeat, mySeat, "DE")) { return true; }
			 */
			}
			break;
		case 5:
			/*
			 * AC - DEF if (checkSeatLocation(checkSeat, mySeat, "AC") ||
			 * checkSeatLocation(checkSeat, mySeat, "DEF")) { return true; }
			 */
			switch (rowStructure) {
			case 1:
				if (checkSeatLocation(checkSeat, mySeat, "A")
						|| checkSeatLocation(checkSeat, mySeat, "BCDE")) {
					return true;
				}
				break;
			case 2:
				if (checkSeatLocation(checkSeat, mySeat, "AB")
						|| checkSeatLocation(checkSeat, mySeat, "CDE")) {
					return true;
				}
				break;
			case 3:
				if (checkSeatLocation(checkSeat, mySeat, "ABC")
						|| checkSeatLocation(checkSeat, mySeat, "DE")) {
					return true;
				}
				break;
			case 4:
				if (checkSeatLocation(checkSeat, mySeat, "ABCD")
						|| checkSeatLocation(checkSeat, mySeat, "E")) {
					return true;
				}
				break;
			}
			break;
		case 6:
			switch (rowStructure) {
			case 2:
				if (checkSeatLocation(checkSeat, mySeat, "AB")
						|| checkSeatLocation(checkSeat, mySeat, "CDEF")) {
					return true;
				}
				break;
			case 3:
				/* ABC - DEF */
				if (checkSeatLocation(checkSeat, mySeat, "ABC")
						|| checkSeatLocation(checkSeat, mySeat, "DEF")) {
					return true;
				}
				break;
			case 4:
				if (checkSeatLocation(checkSeat, mySeat, "ABCD")
						|| checkSeatLocation(checkSeat, mySeat, "EF")) {
					return true;
				}
				break;
			}
			break;
		case 7:
			switch (rowStructure) {
			case 2:
				/* AB - DEF - JK */
				if (checkSeatLocation(checkSeat, mySeat, "AB")
						|| checkSeatLocation(checkSeat, mySeat, "DEF")
						|| checkSeatLocation(checkSeat, mySeat, "JK")) {
					return true;
				}
				break;
			case 3:
				if (checkSeatLocation(checkSeat, mySeat, "ABC")
						|| checkSeatLocation(checkSeat, mySeat, "DEFG")) {
					return true;
				}
				break;
			case 4:
				if (checkSeatLocation(checkSeat, mySeat, "ABCD")
						|| checkSeatLocation(checkSeat, mySeat, "EFG")) {
					return true;
				}
				break;
			}
			break;
		case 8:
			switch (rowStructure) {
			case 2:
				/* AB - DEFG - JK */
				if (checkSeatLocation(checkSeat, mySeat, "AB")
						|| checkSeatLocation(checkSeat, mySeat, "DEFG")
						|| checkSeatLocation(checkSeat, mySeat, "JK")) {
					return true;
				}
				break;

			case 4:
				if (checkSeatLocation(checkSeat, mySeat, "ABCD")
						|| checkSeatLocation(checkSeat, mySeat, "EFGH")) {
					return true;
				}
				break;
			}
			break;
		case 9:
			/* ABC - DEF - HJK */
			if (checkSeatLocation(checkSeat, mySeat, "ABC")
					|| checkSeatLocation(checkSeat, mySeat, "DEF")
					|| checkSeatLocation(checkSeat, mySeat, "HJK")) {
				return true;
			}
			break;
		case 10:
			/* ABC - DEFG - HJK */
			if (checkSeatLocation(checkSeat, mySeat, "ABC")
					|| checkSeatLocation(checkSeat, mySeat, "DEFG")
					|| checkSeatLocation(checkSeat, mySeat, "HJK")) {
				return true;
			}
			break;
		}

		return false;
	}

	/**
	 * Check seat abrest.
	 *
	 * @param seat
	 *            the seat
	 * @return the int
	 */
	private static int checkSeatAbrest(Seat seat) {
		return ModelHelper.getParent(Row.class, seat).getSeats().size();
	}

	/**
	 * Check row structure.
	 *
	 * @param seat
	 *            the seat
	 * @return the string[]
	 */
	private static int checkRowStructure(Seat seat) {
		String rowString = ModelHelper.getParent(Row.class, seat).getSeats()
				.get(0).getTravelClass().getRowStructure();
		String[] rowParts = rowString.split("-");
		return Integer.parseInt(rowParts[0]);
	}

	/**
	 * Check seat location.
	 *
	 * @param checkSeat
	 *            the check seat
	 * @param mySeat
	 *            the my seat
	 * @param letter
	 *            the letter
	 * @return true, if successful
	 */
	private static boolean checkSeatLocation(Seat checkSeat, Seat mySeat,
			String letter) {

		if (letter.contains(checkSeat.getLetter())
				&& letter.contains(mySeat.getLetter())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Other seat closer to aisle.
	 *
	 * @param otherSeat
	 *            the other seat
	 * @param thisSeat
	 *            the this seat
	 * @return true, if successful
	 */
	public static boolean otherSeatCloserToAisle(Seat otherSeat,
			Seat thisSeat) {

		int middleOfAisleY = determineClosestAisle(thisSeat);

		int otherSeatToAisleDistanceY = Math.abs(otherSeat.getYPosition()
				+ otherSeat.getYDimension() / 2 - middleOfAisleY);

		int mySeatToAisleDistanceY = Math.abs(thisSeat.getYPosition()
				+ thisSeat.getYDimension() / 2 - middleOfAisleY);

		if (otherSeatToAisleDistanceY < mySeatToAisleDistanceY) {
			return true;
		}
		return false;
	}

	/**
	 * Determine closest aisle.
	 *
	 * @param mySeat
	 *            the my seat
	 * @return the int
	 */
	// TODO: arbitrary seat abreast
	public static int determineClosestAisle(Seat mySeat) {

		int seatAbrest = checkSeatAbrest(mySeat);
		int rowStructure = checkRowStructure(mySeat);
		int middleOfAisleY = 0;

		switch (seatAbrest) {

		default:
			break;

		case 4:
			switch (rowStructure) {
			case 2:
				middleOfAisleY = (int) (ModelHelper
						.getParent(Cabin.class, mySeat).getYDimension() / 2.0);
				break;
			case 1:
			case 3:
				middleOfAisleY = mySeat.getYDimension() * rowStructure;
				break;
			}
			break;
		case 5:
			switch (rowStructure) {
			case 1:
			case 2:
			case 3:
			case 4:
				middleOfAisleY = mySeat.getYDimension() * rowStructure;
				break;
			}
			break;

		case 6:
			switch (rowStructure) {
			case 2:
			case 4:
				middleOfAisleY = mySeat.getYDimension() * rowStructure;
				break;
			case 3:
				middleOfAisleY = (int) (ModelHelper
						.getParent(Cabin.class, mySeat).getYDimension() / 2.0);
				break;
			}
			break;
		case 7:
			switch (rowStructure) {
			case 3:
			case 4:
				middleOfAisleY = mySeat.getYDimension() * rowStructure;
				break;
			}
			break;
		/* AB - DEF - JK */
		case 8:
			switch (rowStructure) {
			case 4:
				middleOfAisleY = mySeat.getYDimension() * rowStructure;
				break;
			}
			/* AB - DEFG - JK */
			break;
		case 9:
			/* ABC - DEF - HJK */
			break;
		case 10:
			/* ABC - DEFG - HJK */
			break;
		}

		return middleOfAisleY;

	}

	/**
	 * Check seat folding status in row.
	 *
	 * @param agent
	 *            the agent
	 * @return the int
	 */
	// TODO: arbitrary seat abreast
	public static int checkSeatFoldingStatusInRow(Passenger agent) {

		int seatAbrest = checkSeatAbrest(agent.getSeat());

		switch (seatAbrest) {

		default:
			return 0;

		case 4:
			for (Seat seat : agent.getSeat().getRow().getSeats()) {
				if (!seat.isOccupied() && "B".contains(seat.getLetter())
						&& "AB".contains(agent.getSeat().getLetter())) {
					return 1;
				} else if (!seat.isOccupied() && "C".contains(seat.getLetter())
						&& "CD".contains(agent.getSeat().getLetter())) {
					return 2;
				}
			}

		case 6:
			for (Seat seat : agent.getSeat().getRow().getSeats()) {
				if (!seat.isOccupied() && "C".contains(seat.getLetter())
						&& "ABC".contains(agent.getSeat().getLetter())) {
					return 1;
				} else if (!seat.isOccupied() && "D".contains(seat.getLetter())
						&& "DEF".contains(agent.getSeat().getLetter())) {
					return 2;
				}
			}

		}
		return 0;

	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 *
	 * @param agent
	 *            the agent
	 * @return the rotation in degrees.
	 */
	public static int getRotation(Agent agent) {

		/* get the angle in radian from -Pi to Pi, so zero is EAST */
		double theta = Math.atan2(
				agent.getDesiredPosition().getY()
						- agent.getCurrentPosition().getY(),
				agent.getDesiredPosition().getX()
						- agent.getCurrentPosition().getX());

		/* rotate the angle by 90 degrees so that zero is NORTH */
		theta += Math.PI / 2.0;

		/* transform from radian to degree */
		int angle = (int) Math.toDegrees(theta);

		/* if degree is smaller than 0, convert it */
		if (angle < 0) {
			angle += 360;
		}
		return angle;
	}

	/**
	 * Doorway blocked.
	 *
	 * @param passenger
	 *            the passenger
	 * @return true, if successful
	 */
	public synchronized static boolean doorwayBlocked(Passenger passenger) {

		/* get the door of the passenger */
		Door door = passenger.getDoor();

		/* get the scale of the cabin */
		int scale = SimulationHandler.getCabin().getSimulationSettings()
				.getScale();

		/*
		 * loop through the area defined by the width of the door and a certain
		 * size for the first step into the cabin
		 */
		for (int i = 0; i <= PIXELS_FOR_SCANNING_AT_DOOR; i++) {
			for (int j = 0; j < door.getWidth() / scale; j++) {

				/* get the corresponding node */
				Node node = SimulationHandler.getMap()
						.get(door.getXPosition() / scale + j, i);

				/* check if the node is an agent */
				if (node.getProperty() == Property.AGENT) {

					/* check if it is not the agent itself */
					if (node.getPassenger().getId() != passenger.getId()) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * This method takes a cost map and adds a huge cost to the location and the
	 * area around agents. The agent triggering this method is ignored.
	 *
	 * @param agent
	 *            the agent
	 * @return the costmap
	 */
	public static Costmap updateCostmap(Agent agent) {

		/*
		 * The cost map is flooded from the agents current location to his seat
		 */
		Costmap costmap = new Costmap(
				SimulationHandler.getMap().getDimensions(), agent.getStart(),
				SimulationHandler.getMap(), agent, true);
		
		/*
		 * define the square dimension around the passenger that should be
		 * scanned. This is the default dimension in each direction from the
		 * center!
		 */
		int squareDimension = 10;

		/* this is the expansion in the x Direction */
		Vector xVector = new Vector2D(
				agent.getCurrentPosition().getX() - squareDimension,
				agent.getCurrentPosition().getX() + squareDimension);

		/* this is the expansion in the y Direction */
		Vector yVector = new Vector2D(
				agent.getCurrentPosition().getY() - squareDimension,
				agent.getCurrentPosition().getY() + squareDimension);

		/*
		 * The first value of the vectors above represents the beginning of the
		 * area being checked, the second value the end.
		 */

		/* then there is cost assigned to an area around the other agents */
		for (int xCoordinate = xVector.getX(); xCoordinate < xVector
				.getY(); xCoordinate++) {
			for (int yCoordinate = yVector.getX(); yCoordinate < yVector
					.getY(); yCoordinate++) {

				/* prevent out of bounds exceptions */
				if (xCoordinate > 0 && yCoordinate > 0) {

					Node node = SimulationHandler.getMap().get(xCoordinate,
							yCoordinate);

					/* find all nodes occupied by agents */
					if (node.getProperty() == Property.AGENT
							&& node.getPassenger().getId() != agent
									.getPassenger().getId()) {

						/*
						 * additionally to the surrounding points of the agents,
						 * there is also cost generated in the area in front of
						 * an agent. This is used to make the agent overtake
						 * easier
						 */
						for (int stepsAhead = 0; stepsAhead < 6; stepsAhead++) {

							/* the current agents position is excluded here! */
							if (!node.getPosition()
									.equals(agent.getCurrentPosition())) {

								/* the surrounding points are calculated */
								for (Vector point : costmap
										.getSurroundingPoints(xCoordinate,
												yCoordinate + stepsAhead)) {

									/* the surrounding costs are assigned */
									if (!SimulationHandler.getMap().get(point)
											.isObstacle()) {
										costmap.setCost(point, 5000);
									}

								}
							}
						}
					}
				}
			}
		}
		return costmap;
	}
}
