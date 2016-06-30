/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.DoorOption;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.model.util.POHelper;
import net.bhl.cdt.paxelerate.util.math.MathHelper;
import net.bhl.cdt.paxelerate.util.math.Vector3D;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.1
 * @since 0.5
 *
 */

public class ObstacleGenerator {

	/** The scale. */
	private double scale;

	/** The developer mode. */
	private boolean developerMode;

	/** The areamap. */
	private Areamap areamap;

	/** The cabin. */
	private Cabin cabin;

	/** a list of all obstacle nodes. */
	private ArrayList<Node> obstacles = new ArrayList<>();

	/** The gradient. */
	private GradientOption gradient;

	/**
	 * The different options for the gradient.
	 */
	public enum GradientOption {

		/** The linear. */
		LINEAR,
		/** The cubic. */
		CUBIC,
		/** The exponential. */
		EXPONENTIAL;
	}

	/**
	 * This method generates a new obstacle generator.
	 *
	 * @param areamap
	 *            the area map on which the obstacles should be applied to
	 * @param cabin
	 *            the cabin from which to get the values
	 * @param gradientOption
	 *            the gradient option
	 */
	public ObstacleGenerator(Areamap areamap, Cabin cabin,
			GradientOption gradientOption) {

		/* store the needed values locally */
		this.areamap = areamap;
		this.gradient = gradientOption;
		this.scale = cabin.getSimulationSettings().getScale();
		this.developerMode = cabin.getSimulationSettings().isDeveloperMode();
		this.cabin = cabin;

		/* loop through all nodes and apply the default value */
		for (Node node : areamap.getNodes()) {
			node.setObstacleValue(AreamapHandler.DEFAULT_VALUE);
		}

		/* apply obstacle values to all obstacle positions */
		for (ObjectOption option : ObjectOption.VALUES) {
			generateObstacles(option);
		}

		checkForGaps();

		/* generate the potential gradient around all obstacles */
		generatePotentialGradient();

		/* generate a depression in the potential for the paths */
		generateDoorDepressions();

		/* generate a depression in the potential for the aisles */
		generateAisleDepressions();

	}

	/**
	 * This method creates the potential gradient around obstacle.
	 */
	private void generatePotentialGradient() {

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/*
			 * only consider the ones which are no obstacle and have not been
			 * calculated before
			 */
			if (!node.isObstacle() && node
					.getObstacleValue() == AreamapHandler.DEFAULT_VALUE) {

				/* calculate the distance to the closest obstacle node */
				double distanceToClosestObstacle = AreamapHandler
						.minimumDistanceToObstacle(node, obstacles);

				/*
				 * check if the distance is smaller than the maximum allowed
				 * gradient width
				 */
				if (distanceToClosestObstacle <= AreamapHandler.GRADIENT_WIDTH) {

					/* calculate the gradient value and apply it to the node */
					node.setObstacleValue(getDistanceByOption(
							distanceToClosestObstacle, gradient));
					node.setDistanceToClosestObstacle(
							distanceToClosestObstacle);
				}
			}
		}
	}

	/**
	 * This function calculates the gradient value at a specific position within
	 * an integer array.
	 *
	 * @param distance
	 *            is the position within the gradient
	 * @param option
	 *            defines the option used for the gradient
	 * @return returns the value
	 */
	private int getDistanceByOption(double distance, GradientOption option) {

		/* calculate the value depending on the chosen function */
		switch (option) {

		case LINEAR:

			/* use linear interpolation here */
			return (int) MathHelper.linearInterpolation(
					AreamapHandler.GRADIENT_UPPER_BOUND,
					AreamapHandler.GRADIENT_LOWER_BOUND,
					(AreamapHandler.GRADIENT_WIDTH - 1), (distance - 1));

		default:

			/* return the default value */
			return AreamapHandler.DEFAULT_VALUE;
		}
	}

	/**
	 * This method generates the obstacle hole in the door path. This means that
	 * in the door area, the obstacle value is set to HOLE_VALUE. This makes the
	 * passengers use the door path as their preferred path.
	 */
	private void generateDoorDepressions() {

		/* Create the door paths for every door */
		for (Door door : cabin.getDoors()) {

			/* do not make a hole for emergency exits */
			if (door.getDoorOption() != DoorOption.EMERGENCY_EXIT) {

				/* get the borders of the door within the area map */
				int entryMin = (int) (door.getXPosition() / scale)
						+ AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;
				int entryMax = (door.getXPosition() + door.getWidth())
						/ (int) scale
						- AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;

				/* loop through all nodes */
				for (Node node : areamap.getNodes()) {

					/* get the x position of the node */
					int x = node.getPosition().getX();

					/*
					 * check if the node is within the door area and no obstacle
					 */
					if (x >= entryMin && x <= entryMax && !node.isObstacle()) {

						/* create a potential hole within the area map */
						node.setObstacleValue(AreamapHandler.HOLE_VALUE);
					}
				}
			}
		}
	}

	/**
	 * Generate a hole in the potential of the area map where the aisle is
	 * located.
	 */
	private void generateAisleDepressions() {

		/* the minimum aisle width for automatic detection */
		int minimumAisleWidth = 4;

		/* loop through every class */
		for (TravelClass travelclass : cabin.getClasses()) {

			/* get the first row of each class */
			Row firstRowOfClass = travelclass.getRows().get(0);

			/* store a list of all aisles per class */
			ArrayList<Vector3D> aisles = new ArrayList<>();

			/* store the previous y position */
			int lastYPosition = 0;

			/*
			 * loop through all seats of the first row in order to find the gaps
			 */
			for (Seat seat : firstRowOfClass.getSeats()) {

				/* calculate the gap between current and previous seat */
				int gap = seat.getYPosition() / (int) scale - lastYPosition;

				/* if the gap is bigger than the predefined minimum, continue */
				if (gap >= minimumAisleWidth) {

					/* save the found aisle to the aisles list */
					aisles.add(new Vector3D(seat.getXPosition() / (int) scale,
							seat.getYPosition() / (int) scale - gap, gap));

					/* x & y = position of top left corner & z = width */
				}

				/* store the new last y position of the previous seat */
				lastYPosition = (seat.getYPosition() + seat.getYDimension())
						/ (int) scale;
			}

			/* load a seat from the last row of the current class */
			Seat lastSeat = travelclass.getRows()
					.get(travelclass.getRows().size() - 1).getSeats().get(0);

			/* get the position of the end of the last seat in the class */
			int endOfLastRowSeat = (lastSeat.getXPosition()
					+ lastSeat.getXDimension()) / (int) scale;

			/* loop through all aisle found above */
			for (Vector3D aisle : aisles) {

				/* loop through the whole area of the aisle */
				for (int x = aisle.getX()
						- AreamapHandler.AISLE_OVERLAP_FRONT_AND_REAR; x <= endOfLastRowSeat
								+ AreamapHandler.AISLE_OVERLAP_FRONT_AND_REAR; x++) {
					for (int y = aisle.getY()
							+ AreamapHandler.NARROWING_OF_AISLE_PATH_IN_PIXELS; y < aisle
									.getY()
									- AreamapHandler.NARROWING_OF_AISLE_PATH_IN_PIXELS
									+ aisle.getZ(); y++) {

						/* check if there might be an obstacle somewhere */
						if (!areamap.get(x, y).isObstacle()) {

							/* apply the hole value */
							areamap.get(x, y).setObstacleValue(
									AreamapHandler.HOLE_VALUE);
						}
					}
				}
				/* for debugging, output the found aisles */
				if (developerMode) {
					System.out.println(travelclass.getName()
							+ ": aisle detected at " + aisle.getX() + "|"
							+ aisle.getY() + " , width: " + aisle.getZ());
				}

			}
		}
	}

	/**
	 * This function iterates through all instances of a specific class and
	 * generates the obstacles.
	 * 
	 * @param option
	 *            is the Class of the object that should be used
	 */
	private void generateObstacles(ObjectOption option) {

		/* first loop through every physical object within the cabin */
		for (PhysicalObject obj : POHelper.getObjectsByOption(option, cabin)) {

			/* define the dimension and position of the object */
			int xDimension = obj.getXDimension() / (int) scale;
			int xPosition = obj.getXPosition() / (int) scale;

			int yDimension = obj.getYDimension() / (int) scale;
			int yPosition = obj.getYPosition() / (int) scale;

			/* check if the object is a seat */
			if (obj instanceof Seat) {

				/* cast the object */
				Seat seat = (Seat) obj;

				/*
				 * check for sideways foldable seats and if it is currently
				 * folded
				 */
				if (cabin.getSimulationSettings()
						.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT
						&& seat.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT) {

					/* if so, do not create an obstacle for that seat */
					continue;

					/*
					 * check for folding seat pans and if it is currently folded
					 */
				} else if (cabin.getSimulationSettings()
						.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS
						&& seat.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS) {

					/* only the backrest is visible (percentage value) */
					int backrestThickness = 20;
					xDimension = xDimension * backrestThickness / 100;
					xPosition = xPosition + yDimension - xDimension;

				}
			}

			/* loop from 0 to the dimension of the object */
			for (int relativePositionX = 0; relativePositionX < xDimension; relativePositionX++) {
				for (int relativePositionY = 0; relativePositionY < yDimension; relativePositionY++) {

					/* begin at the top left corner */
					int absolutePositionX = xPosition + relativePositionX;
					int absolutePositionY = yPosition + relativePositionY;

					/* get the node at the current position */
					Node node = areamap.get(absolutePositionX,
							absolutePositionY);

					/* check if the node is already an obstacle! */
					// TODO: catch NullPointerException
					if (node.isObstacle()) {

						Log.add(this,

								"WARNING! Overlap between 2 objects at x: "
										+ node.getPosition().getX() + ", y: "
										+ node.getPosition().getY());

					} else {

						/* define the attributes to the current position */
						node.setObstacleValue(Integer.MAX_VALUE);
						node.setProperty(Property.OBSTACLE, null);
						node.setObstacleType(option);

						/* add the obstacle to the list of obstacles */
						obstacles.add(node);
					}
				}
			}
		}
	}

	/**
	 * Check for gaps.
	 */
	private void checkForGaps() {

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/* check if node is an obstacle */
			if (node.isObstacle()) {

				/*
				 * check if the node has one more node between itself and the
				 * border in the y dimension
				 */
				if (node.getPosition().getY() == 1 || node.getPosition()
						.getY() == areamap.getDimensions().getY() - 2) {

					if (developerMode) {
						System.out.println(
								"detected: " + node.getPosition().getX() + " / "
										+ node.getPosition().getY());
					}

					/* check if the other node is not yet an obstacle */
					if (!areamap.get(node.getPosition().getX(), 0)
							.isObstacle()) {

						Node newNode = areamap.get(node.getPosition().getX(),
								0);

						/* define the attributes to the current position */
						newNode.setObstacleValue(Integer.MAX_VALUE);
						newNode.setProperty(Property.OBSTACLE, null);
						newNode.setObstacleType(node.getObstacleType());
					}
					if (!areamap
							.get(node.getPosition().getX(),
									areamap.getDimensions().getY() - 1)
							.isObstacle()) {

						Node newNode = areamap.get(node.getPosition().getX(),
								areamap.getDimensions().getY() - 1);

						/* define the attributes to the current position */
						newNode.setObstacleValue(Integer.MAX_VALUE);
						newNode.setProperty(Property.OBSTACLE, null);
						newNode.setObstacleType(node.getObstacleType());
					}
				}
			}
		}
	}

	/**
	 * Return map.
	 *
	 * @return the areamap
	 */
	public Areamap returnMap() {
		return areamap;
	}
}