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
import net.bhl.cdt.paxelerate.model.util.POHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann
 *
 */

public class ObstacleMap {
	private Cabin cabin;
	private Vector dimensions;
	private static final int MAX_VALUE = 100000, BASIC_VALUE = 3,
			OBSTACLE_RANGE_IN_CM = 20, POTENTIAL_AROUND_OBSTACLE_MAXIMUM = 100,
			HOLE_VALUE = 1; // DO NEVER SET THIS TO ZERO!
	private static int[][] obstacleMap;

	/**
	 * This method constructs the obstacle map.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public ObstacleMap(Vector dimensions, Cabin cabin) {
		this.cabin = cabin;
		this.dimensions = dimensions;
		obstacleMap = createObstacleMap();
	}

	/**
	 * This method returns the basic obstacle value.
	 * 
	 * @return returns the obstacle value
	 */
	public static int getBasicValue() {
		return BASIC_VALUE;
	}

	/**
	 * 
	 * @return
	 */
	public static int getPotentialValue() {
		return POTENTIAL_AROUND_OBSTACLE_MAXIMUM;
	}

	/**
	 * 
	 * @return
	 */
	public static int getHoleValue() {
		return HOLE_VALUE;
	}

	/**
	 * This method returns the obstacle value.
	 * 
	 * @return the obstacle value
	 */
	public static int getObstacleValue() {
		return MAX_VALUE;
	}

	/**
	 * This function returns the obstacle map.
	 * 
	 * @return the obstacle map
	 */
	public int[][] getMap() {
		return obstacleMap;
	}

	/**
	 * This method generates the obstacle Map.
	 * 
	 * @param <T>
	 * 
	 * @return obstacleMap is the obstacle map two dimensional array
	 */
	private int[][] createObstacleMap() {
		obstacleMap = new int[dimensions.getX()][dimensions.getY()];
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				obstacleMap[i][j] = BASIC_VALUE;
			}
		}

		for (ObjectOption option : ObjectOption.VALUES) {
			generateObstacles(option);
		}

		generateAisleHole();
		generatePotentialGradient();
		return obstacleMap;
	}

	/**
	 * This method creates the potential gradient around obstacle.
	 */
	private void generatePotentialGradient() {
		int range = OBSTACLE_RANGE_IN_CM / cabin.getScale();
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (obstacleMap[i][j] == MAX_VALUE) {
					for (int p = 1; p < range; p++) {
						/** WEST - EAST - NORTH - SOUTH */
						if (((i - p) > 0)
								&& (obstacleMap[i - p][j] != MAX_VALUE)) {
							obstacleMap[i
									- p][j] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p;
						}
						if (((i + p) < dimensions.getX())
								&& (obstacleMap[i + p][j] != MAX_VALUE)) {
							obstacleMap[i
									+ p][j] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p;
						}

						if (((j - p) > 0)
								&& (obstacleMap[i][j - p] != MAX_VALUE)) {
							obstacleMap[i][j
									- p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p;
						}
						if (((j + p) < dimensions.getY())
								&& (obstacleMap[i][j + p] != MAX_VALUE)) {
							obstacleMap[i][j
									+ p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
											- p;
						}
						/*
						 * In order to create some kind of rounded shape around
						 * the obstacle, the corners are left out on the last
						 * loop of the gradient generation.
						 */
						if (p < (range - 1)) {
							/** NORTHWEST - NORTHEAST - SOUTHEAST - SOUTHWEST */
							if ((((i - p) > 0) && ((j - p) > 0))
									&& (obstacleMap[i - p][j
											- p] != MAX_VALUE)) {
								obstacleMap[i - p][j
										- p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
												- p;
							}
							if ((((i + p) < dimensions.getX()) && ((j - p) > 0))
									&& (obstacleMap[i + p][j
											- p] != MAX_VALUE)) {
								obstacleMap[i + p][j
										- p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
												- p;
							}
							if ((((j + p) < dimensions.getY())
									&& ((i + p) < dimensions.getX()))
									&& (obstacleMap[i + p][j
											+ p] != MAX_VALUE)) {
								obstacleMap[i + p][j
										+ p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
												- p;
							}
							if ((((j + p) < dimensions.getY()) && ((i - p) > 0))
									&& (obstacleMap[i - p][j
											+ p] != MAX_VALUE)) {
								obstacleMap[i - p][j
										+ p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
												- p;
							}
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
	private void generateAisleHole() {
		int entryMin = 0;
		int entryMax = 0;

		/*
		 * Create the door path
		 */

		for (Door door : cabin.getDoors()) {
			entryMin = (door.getXPosition() / cabin.getScale()) + 2;
			entryMax = (door.getXPosition() + door.getWidth())
					/ cabin.getScale() - 2;

			for (int i = 0; i < dimensions.getY(); i++) {
				for (int j = 0; j < dimensions.getX(); j++) {
					if (obstacleMap[j][i] != MAX_VALUE) {
						if (j > entryMin && j < entryMax) {
							obstacleMap[j][i] = HOLE_VALUE;
						}

						if (!cabin.getSimulationSettings().isBringYourOwnSeat()
								&& !cabin.getSimulationSettings()
										.isUseFoldableSeats()) {
							if (i < 19 && i > 16) {
								obstacleMap[j][i] = HOLE_VALUE;
							}
						} else if (cabin.getSimulationSettings()
								.isUseFoldableSeats()
								&& !cabin.getSimulationSettings()
										.isBringYourOwnSeat()) {
							if (i < 21 && i > 16) {
								obstacleMap[j][i] = HOLE_VALUE;
							}
							if (j > 20) {
								if (i == 19) {
									obstacleMap[j][i] = 900;
								}
							}
						} else {
							if (j > 20) {
								if (i == 5 || i == 10 || i == 15 || i == 31
										|| i == 26 || i == 21) {
									obstacleMap[j][i] = 900;
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * This function iterates through all instances of a specific class and
	 * generates the obstacles.
	 * 
	 * @param physicalObjectSubclass
	 *            is the Class of the object that should be used
	 */
	private void generateObstacles(ObjectOption option) {
		for (PhysicalObject obj : POHelper.getObjectByOption(option, cabin)) {
			if (obj instanceof Seat) {
				if (cabin.getSimulationSettings().isUseFoldableSeats()
						&& ((Seat) obj).isCurrentlyFolded()) {
					break;
				}
			}

			int yDimension = obj.getYDimension() / cabin.getScale();
			int xDimension = obj.getXDimension() / cabin.getScale();
			int xPosition = obj.getXPosition() / cabin.getScale();
			int yPosition = obj.getYPosition() / cabin.getScale();

			for (int i = 0; i < xDimension; i++) {
				for (int j = 0; j < yDimension; j++) {
					int k = xPosition + i;
					int l = yPosition + j;
					if (k < dimensions.getX() && l < dimensions.getY()) {
						obstacleMap[k][l] = MAX_VALUE;
					}
				}
			}
		}
	}

	/**
	 * This method returns the value of the obstacle map at a specific point.
	 * 
	 * @param x
	 *            the x value of the point
	 * @param y
	 *            the y value of the point
	 * @return the value at the specific point
	 */
	public int getValueAtPoint(int x, int y) {
		return obstacleMap[x][y];
	}

	public void print() {
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				System.out.print(obstacleMap[i][j] + "\t");
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