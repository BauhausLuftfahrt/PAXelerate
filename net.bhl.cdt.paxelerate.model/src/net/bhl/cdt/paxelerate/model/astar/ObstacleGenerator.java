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
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.model.util.POHelper;
import net.bhl.cdt.paxelerate.util.math.MathHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann
 *
 */

public class ObstacleGenerator {

	/** The scale. */
	private int scale;

	/** The dimensions. */
	private Vector dimensions;

	/** The areamap. */
	private Areamap areamap;

	/** The cabin. */
	private Cabin cabin;

	/** a list of all obstacle nodes */
	private ArrayList<Node> obstacles = new ArrayList<>();

	private GradientOption gradient;

	/**
	 * The different options for the gradient
	 * 
	 * @author marc.engelmann
	 *
	 */
	public enum GradientOption {
		LINEAR, CUBIC, EXPONENTIAL;
	}

	/**
	 * This method generates a new obstacle generator.
	 * 
	 * @param areamap
	 *            the area map on which the obstacles should be applied to
	 * @param cabin
	 *            the cabin from which to get the values
	 */
	public ObstacleGenerator(Areamap areamap, Cabin cabin,
			GradientOption gradientOption) {

		/* store the needed values locally */
		this.areamap = areamap;
		this.gradient = gradientOption;
		this.scale = cabin.getSimulationSettings().getScale();
		this.dimensions = areamap.getDimensions();
		this.cabin = cabin;

		/* loop through all nodes and apply the default value */
		for (Node node : areamap.getNodes()) {
			node.setObstacleValue(AreamapHandler.DEFAULT_VALUE);
		}

		/* apply obstacle values to all obstacle positions */
		for (ObjectOption option : ObjectOption.VALUES) {
			generateObstacles(option);
		}

		/* generate the potential gradient around all obstacles */
		generatePotentialGradient();

		/* generate a depression in the potential for the paths */
		generateDoorDepressions();

		/* generate a depression in the potential for the aisles */
		generateAisleDepressions();

		output();
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
				double distanceToClosestNode = minimumDistanceToObstacle(node);

				/*
				 * check if the distance is smaller than the maximum allowed
				 * gradient width
				 */
				if (distanceToClosestNode <= AreamapHandler.GRADIENT_WIDTH) {

					/* calculate the gradient value and apply it to the node */
					node.setObstacleValue(getDistanceByOption(
							distanceToClosestNode, gradient));
				}
			}
		}
	}

	/**
	 * This function calculates the gradient value at a specific position within
	 * an integer array
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
	 * This function calculates the minimum distance to an obstacle
	 * 
	 * @param node
	 *            the node which's distance is calculated
	 * @return the minimum distance
	 */
	private double minimumDistanceToObstacle(Node node) {

		/* set the minimum as high as possible */
		double minimum = Integer.MAX_VALUE;

		/* loop through all obstacles */
		for (Node obstacle : obstacles) {

			/* calculate the distance using z = root(x² + y²) */
			double distance = MathHelper.distanceBetween(node.getPosition(),
					obstacle.getPosition());

			/* check if there is a distance smaller than the current one */
			if (distance < minimum) {

				/* if so, define it as the new smallest distance */
				minimum = distance;
			}
		}

		/* return the distance */
		return minimum;
	}

	/**
	 * This method generates the obstacle hole in the aisle. This means that in
	 * the aisle, the obstacle value is set to HOLE_VALUE. This makes the
	 * passengers use the aisle as their preferred path.
	 */
	private void generateDoorDepressions() {

		/* Create the door paths for every door */
		for (Door door : cabin.getDoors()) {

			/* do not make a hole for emergency exits */
			if (door.getDoorOption() != DoorOption.EMERGENCY_EXIT) {

				/* get the borders of the door within the area map */
				int entryMin = (door.getXPosition() / scale)
						+ AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;
				int entryMax = (door.getXPosition() + door.getWidth()) / scale
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

		/* load the simulation settings */
		SimulationProperties set = cabin.getSimulationSettings();

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/* get the y location of the node */
			int y = node.getPosition().getY();

			/* check if the node is no obstacle */
			if (!node.isObstacle()) {

				// TODO: THIS IS ONLY FOR ONE MIDDLE AISLE!

				if (!set.isBringYourOwnSeat() && !set.isUseFoldableSeats()) {
					if (y < 19 && y > 16) {
						node.setObstacleValue(AreamapHandler.HOLE_VALUE);
					}
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

		for (PhysicalObject obj : POHelper.getObjectsByOption(option, cabin)) {

			if (obj instanceof Seat) {
				if (cabin.getSimulationSettings().isUseFoldableSeats()
						&& ((Seat) obj).isCurrentlyFolded()) {
					break;
				}
			}

			int xDimension = obj.getXDimension() / scale;
			int xPosition = obj.getXPosition() / scale;

			int yDimension = obj.getYDimension() / scale;
			int yPosition = obj.getYPosition() / scale;

			for (int i = 0; i < xDimension; i++) {
				for (int j = 0; j < yDimension; j++) {

					int k = xPosition + i;
					int l = yPosition + j;
					if (k < dimensions.getX() && l < dimensions.getY()) {

						Node node = areamap.get(k, l);

						node.setObstacleValue(Integer.MAX_VALUE);
						node.setProperty(Property.OBSTACLE, null);
						node.setObstacleType(option);
						obstacles.add(node);
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

	/**
	 * Output.
	 */
	public void output() {
		for (int x = 0; x < dimensions.getX(); x++) {
			for (int y = 0; y < dimensions.getY(); y++) {
				int value = areamap.get(x, y).getObstacleValue();
				if (value == Integer.MAX_VALUE) {
					System.out.print("XXX");
				} else {
					System.out.print(value);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	/**
	 * This method saves the obstacle map in a text file to the documents
	 * folder.
	 */
	// TODO disabled to unlink model from ui
	// public void printObstacleMap() {
	// PrintWriter printToFile = null;
	// try {
	// CabinViewPart.makeDirectory();
	// printToFile = new PrintWriter(CabinViewPart.getFilePath()
	// + "obstaclemap.txt");
	// for (int i = 0; i < dimensions.getY(); i++) {
	// for (int j = 0; j < dimensions.getX(); j++) {
	// printToFile.print(getValueAtPoint(j, i) + "\t");
	// }
	// printToFile.println();
	// }
	// } catch (FileNotFoundException e) {<y
	// Log.add(this, "Could not save obstacle map to file.");
	// } finally {
	// printToFile.close();
	// }
	// }
}