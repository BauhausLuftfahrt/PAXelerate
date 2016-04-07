/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.model.util.POHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann
 *
 */

public class ObstacleGenerator {

	private int scale;
	private Vector dimensions;
	private Areamap areamap;
	private Cabin cabin;

	/**
	 * This method generates a new obstacle generator.
	 * 
	 * @param areamap
	 *            the area map on which the obstacles should be applied to
	 * @param cabin
	 *            the cabin from which to get the values
	 */
	public ObstacleGenerator(Areamap areamap, Cabin cabin) {

		this.areamap = areamap;

		this.scale = cabin.getSimulationSettings().getScale();
		this.dimensions = areamap.getDimensions();
		this.cabin = cabin;

		for (Node node : areamap.getNodes()) {
			node.setObstacleValue(AreamapHandler.BASIC_VALUE);
		}

		for (ObjectOption option : ObjectOption.VALUES) {
			generateObstacles(option);
		}

		generateDoorPaths();

		generateAisleHole();

		generatePotentialGradient();
	}

	/**
	 * This method creates the potential gradient around obstacle.
	 */
	private void generatePotentialGradient() {

		int range = AreamapHandler.OBSTACLE_RANGE_IN_CM / scale;

		for (Node node : areamap.getNodes()) {

			if (node.getObstacleValue() == AreamapHandler.MAX_VALUE) {

				for (int p = 1; p < range; p++) {

					/** WEST - EAST - NORTH - SOUTH */

					int i = node.getPosition().getX();
					int j = node.getPosition().getY();

					if (((i - p) > 0) && (areamap.get(i - p, j)
							.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
						areamap.get(i - p, j).setObstacleValue(
								AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p);
					}

					if (((i + p) < dimensions.getX()) && (areamap.get(i + p, j)
							.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
						areamap.get(i + p, j).setObstacleValue(
								AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p);
					}

					if (((j - p) > 0) && (areamap.get(i, j - p)
							.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
						areamap.get(i, j - p).setObstacleValue(
								AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p);
					}

					if (((j + p) < dimensions.getY()) && (areamap.get(i, j + p)
							.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
						areamap.get(i, j + p).setObstacleValue(
								AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p);
					}
					/*
					 * In order to create some kind of rounded shape around the
					 * obstacle, the corners are left out on the last loop of
					 * the gradient generation.
					 */
					if (p < (range - 1)) {
						/** NORTHWEST - NORTHEAST - SOUTHEAST - SOUTHWEST */
						if ((((i - p) > 0) && ((j - p) > 0)) && (areamap
								.get(i - p, j - p)
								.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
							areamap.get(i - p, j - p).setObstacleValue(
									AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p);
						}
						if ((((i + p) < dimensions.getX()) && ((j - p) > 0))
								&& (areamap.get(i + p, j - p)
										.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
							areamap.get(i + p, j - p).setObstacleValue(
									AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p);
						}
						if ((((j + p) < dimensions.getY())
								&& ((i + p) < dimensions.getX()))
								&& (areamap.get(i + p, j + p)
										.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
							areamap.get(i + p, j + p).setObstacleValue(
									AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p);
						}
						if ((((j + p) < dimensions.getY()) && ((i - p) > 0))
								&& (areamap.get(i - p, j + p)
										.getObstacleValue() != AreamapHandler.MAX_VALUE)) {
							areamap.get(i - p, j + p).setObstacleValue(
									AreamapHandler.POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p);
						}
					}
				}
			}
		}
	}

	/**
	 * This method generates the obstacle hole in the aisle. This means that in
	 * the aisle, the obstacle value is set to HOLE_VALUE. This makes the
	 * passengers use the aisle as their preferred path.
	 */
	private void generateDoorPaths() {

		/* Create the door paths for every door */
		for (Door door : cabin.getDoors()) {

			/* get the borders of the door within the area map */
			int entryMin = (door.getXPosition() / scale)
					+ AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;
			int entryMax = (door.getXPosition() + door.getWidth()) / scale
					- AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;

			/* loop through all nodes */
			for (Node node : areamap.getNodes()) {

				/* get the x position of the node */
				int x = node.getPosition().getX();

				/* check if the node is within the door area and no obstacle */
				if (x >= entryMin && x <= entryMax && !node.isObstacle()) {

					/* create a potential hole wihtin the area map */
					node.setObstacleValue(AreamapHandler.HOLE_VALUE);
				}
			}
		}
	}

	/**
	 * Generate a hole in the potential of the area map where the aisle is
	 * located.
	 */
	private void generateAisleHole() {

		/* load the simulation settings */
		SimulationProperties set = cabin.getSimulationSettings();

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/* get the y location of the node */
			int y = node.getPosition().getY();

			if (!node.isObstacle()) {

				// TODO: THIS IS ONLY FOR ONE MIDDLE AISLE!

				if (!set.isBringYourOwnSeat() && !set.isUseFoldableSeats()) {
					if (y < 19 && y > 16) {
						node.setObstacleValue(AreamapHandler.HOLE_VALUE);
					}
				} else if (set.isUseFoldableSeats()
						&& !set.isBringYourOwnSeat()) {
					// if (y < 21 && y > 16) {
					// node.setObstacleValue(AreamapHandler.HOLE_VALUE);
					// }
					// if (j > 20) {
					// if (i == 19) {
					// node.setObstacleValue(900);
					// }
				}
			} else {
				// if (j > 20) {
				// if (i == 5 || i == 10 || i == 15 || i == 31 || i == 26
				// || i == 21) {
				// node.setObstacleValue(900);
				// }
				// }
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

			int yDimension = obj.getYDimension() / scale;
			int xDimension = obj.getXDimension() / scale;
			int xPosition = obj.getXPosition() / scale;
			int yPosition = obj.getYPosition() / scale;

			for (int i = 0; i < xDimension; i++) {
				for (int j = 0; j < yDimension; j++) {

					int k = xPosition + i;
					int l = yPosition + j;
					if (k < dimensions.getX() && l < dimensions.getY()) {

						Node node = areamap.get(k, l);

						node.setObstacleValue(AreamapHandler.MAX_VALUE);
						node.setProperty(Property.OBSTACLE, null);
					}
				}
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public Areamap returnMap() {
		return areamap;
	}

	/**
	 * 
	 */
	public void output() {
		for (int x = 0; x < dimensions.getX(); x++) {
			for (int y = 0; y < dimensions.getY(); y++) {
				System.out.print(areamap.get(x, y).getObstacleValue());
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