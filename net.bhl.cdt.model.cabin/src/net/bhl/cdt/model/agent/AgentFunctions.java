package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.Node;
import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.util.ModelHelper;

public class AgentFunctions {

	public static boolean someoneAlreadyInThisPartOfTheRow(Seat mySeat,
			Agent agent) {
		Row row = mySeat.getRow();
		for (Seat checkSeat : row.getSeats()) {
			if (checkSeat.isOccupied()) {
				if (sameSideOfAisle(checkSeat, mySeat)) {
					if (otherSeatCloserToAisle(checkSeat, mySeat)) {
						agent.otherPassengersInRowBlockingMe.add(checkSeat
								.getPassenger());
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
	private static boolean sameSideOfAisle(Seat checkSeat, Seat mySeat) {

		if ("ABC".contains(mySeat.getLetter())) {
			if ("ABC".contains(mySeat.getLetter())) {
				return true;
			}
		}
		if ("DEF".contains(mySeat.getLetter())) {
			if ("DEF".contains(mySeat.getLetter())) {
				return true;
			}
		}
		return false;
	}

	// TODO: this only works for a ONE AISLE configuration!
	public static boolean otherSeatCloserToAisle(Seat otherSeat, Seat thisSeat) {

		int middleOfCabinX = (int) (ModelHelper
				.getParent(Cabin.class, thisSeat).getCabinWidth() / 2.0);

		int otherSeatToAisleDistanceX = Math.abs(otherSeat.getXPosition()
				+ otherSeat.getXDimension() / 2 - middleOfCabinX);

		int mySeatToAisleDistanceX = Math.abs(thisSeat.getXPosition()
				+ thisSeat.getXDimension() / 2 - middleOfCabinX);

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
		double theta = Math.atan2(agent.getDesiredPosition().getY()
				- agent.getCurrentPosition().getY(), agent.getDesiredPosition()
				.getX() - agent.getCurrentPosition().getX());

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

	public synchronized static boolean doorwayBlocked(Passenger passenger) {
		boolean detectedBlocker = false;
		int scanDoorWayWidth = 10; // in pixels!
		Door door = passenger.getDoor();
		for (int i = 0; i <= scanDoorWayWidth; i++) {
			for (int j = 0; j < (int) (door.getWidth() / SimulationHandler
					.getCabin().getScale()); j++) {
				Node node = SimulationHandler.getMap().getNodeByCoordinate(
						i,
						(int) (door.getYPosition() / SimulationHandler
								.getCabin().getScale()) + j);
				if (node.getProperty() == Property.AGENT) {
					if (node.getPassenger().getId() != passenger.getId()) {
						detectedBlocker = true;
					}
				}
			}
		}
		if (detectedBlocker) {
			return true;
		} else {
			System.out.println("Doorway is now clear.");
			return false;
		}
	}
}
