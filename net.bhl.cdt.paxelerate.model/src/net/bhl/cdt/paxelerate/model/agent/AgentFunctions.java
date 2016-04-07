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
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.model.astar.Node;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AgentFunctions {

	/**
	 * 
	 * @param agent
	 * @return
	 */
	public static boolean someoneAlreadyInThisPartOfTheRow(Agent agent) {
		Row row = agent.getPassenger().getSeat().getRow();
		for (Seat checkSeat : row.getSeats()) {
			if (checkSeat.isOccupied()) {
				if (sameSideOfAisle(checkSeat,
						agent.getPassenger().getSeat())) {
					if (otherSeatCloserToAisle(checkSeat,
							agent.getPassenger().getSeat())) {
						agent.otherPassengersInRowBlockingMe
								.add(checkSeat.getPassenger());
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 * TODO: ONLY APPLICABLE FOR 3-3 CONFIGURATIONS OR BELOW!
	 */
	/**
	 * 
	 * @param checkSeat
	 * @param mySeat
	 * @return
	 */
	private static boolean sameSideOfAisle(Seat checkSeat, Seat mySeat) {

		if ("ABC".contains(checkSeat.getLetter())) {
			if ("ABC".contains(mySeat.getLetter())) {
				return true;
			}
		}
		if ("DEF".contains(checkSeat.getLetter())) {
			if ("DEF".contains(mySeat.getLetter())) {
				return true;
			}
		}
		return false;
	}

	// TODO: this only works for a ONE AISLE configuration!
	/**
	 * 
	 * @param otherSeat
	 * @param thisSeat
	 * @return
	 */
	public static boolean otherSeatCloserToAisle(Seat otherSeat,
			Seat thisSeat) {

		int middleOfCabinX = (int) (ModelHelper.getParent(Cabin.class, thisSeat)
				.getYDimension() / 2.0);

		int otherSeatToAisleDistanceX = Math.abs(otherSeat.getYPosition()
				+ otherSeat.getYDimension() / 2 - middleOfCabinX);

		int mySeatToAisleDistanceX = Math.abs(thisSeat.getYPosition()
				+ thisSeat.getYDimension() / 2 - middleOfCabinX);

		if (otherSeatToAisleDistanceX < mySeatToAisleDistanceX) {
			return true;
		}
		return false;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 * 
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

	public static final int PIXELS_FOR_SCANNING_AT_DOOR = 3;

	/**
	 * 
	 * @param passenger
	 * @return
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

		/* this is the expansion in the x Direction */
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

					/* find all nodes occupied by agents */
					if (SimulationHandler.getMap().get(xCoordinate, yCoordinate)
							.getProperty() == Property.AGENT) {

						/*
						 * additionally to the surrounding points of the agents,
						 * there is also cost generated in the area in front of
						 * an agent. This is used to make the agent overtake
						 * easier
						 */
						for (int stepsAhead = 0; stepsAhead < 6; stepsAhead++) {

							/* the current agents position is excluded here! */
							if (!SimulationHandler.getMap()
									.get(xCoordinate, yCoordinate).getPosition()
									.equals(agent.getCurrentPosition())) {

								/* the surrounding points are calculated */
								for (Vector point : costmap
										.getSurroundingPoints(xCoordinate,
												yCoordinate + stepsAhead)) {

									/* the surrounding costs are assigned */
									if (SimulationHandler.getMap().get(point)
											.getProperty() != Property.OBSTACLE) {
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
