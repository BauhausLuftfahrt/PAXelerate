/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.ui.CabinViewPart;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann
 *
 */

public class ObstacleMap {
	private Cabin cabin;
	private Vector dimensions = new Vector2D(0, 0);
	private static final int MAX_VALUE = 100000, BASIC_VALUE = 3,
			OBSTACLE_RANGE_IN_CM = 20, POTENTIAL_AROUND_OBSTACLE_MAXIMUM = 100,
			HOLE_VALUE = 1; // DO NEVER SET THIS TO ZERO!
	private static int[][] obstacleMap;
//	private ILog logger;

	ArrayList<Class<? extends PhysicalObject>> classes = new ArrayList<Class<? extends PhysicalObject>>() {

		private static final long serialVersionUID = 1L;

		{
			add(Seat.class);
			add(Galley.class);
			add(Curtain.class);
			add(Lavatory.class);
		}
	};

	/**
	 * This method constructs the obstacle map.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public ObstacleMap(Cabin cabin) {
		this.cabin = cabin;
		((Vector2D) dimensions).set(AStarTools.size(cabin.getCabinWidth()),
				AStarTools.size(cabin.getCabinLength()));
		obstacleMap = createObstacleMap();
//		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.paxelerate.model"));
		printObstacleMap();
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

		for (Class<? extends PhysicalObject> className : classes) {
			generateObstacles(className);
		}

		generateAisleHole();
		generatePotentialGradient();
		return obstacleMap;
	}

	/**
	 * This method creates the potential gradient around obstacle.
	 */
	private void generatePotentialGradient() {
		int range = AStarTools.size(OBSTACLE_RANGE_IN_CM);
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (obstacleMap[i][j] == MAX_VALUE) {
					for (int p = 1; p < range; p++) {
						/** WEST - EAST - NORTH - SOUTH */
						if (((i - p) > 0)
								&& (obstacleMap[i - p][j] != MAX_VALUE)) {
							obstacleMap[i - p][j] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
									- p;
						}
						if (((i + p) < dimensions.getX())
								&& (obstacleMap[i + p][j] != MAX_VALUE)) {
							obstacleMap[i + p][j] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
									- p;
						}

						if (((j - p) > 0)
								&& (obstacleMap[i][j - p] != MAX_VALUE)) {
							obstacleMap[i][j - p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
									- p;
						}
						if (((j + p) < dimensions.getY())
								&& (obstacleMap[i][j + p] != MAX_VALUE)) {
							obstacleMap[i][j + p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
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
									&& (obstacleMap[i - p][j - p] != MAX_VALUE)) {
								obstacleMap[i - p][j - p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p;
							}
							if ((((i + p) < dimensions.getX()) && ((j - p) > 0))
									&& (obstacleMap[i + p][j - p] != MAX_VALUE)) {
								obstacleMap[i + p][j - p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p;
							}
							if ((((j + p) < dimensions.getY()) && ((i + p) < dimensions
									.getX()))
									&& (obstacleMap[i + p][j + p] != MAX_VALUE)) {
								obstacleMap[i + p][j + p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
										- p;
							}
							if ((((j + p) < dimensions.getY()) && ((i - p) > 0))
									&& (obstacleMap[i - p][j + p] != MAX_VALUE)) {
								obstacleMap[i - p][j + p] = POTENTIAL_AROUND_OBSTACLE_MAXIMUM
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
			entryMin = AStarTools.size(door.getXPosition()) + 2;
			entryMax = AStarTools.size(door.getXPosition() + door.getWidth()) - 2;

			for (int i = 0; i < dimensions.getX(); i++) {
				for (int j = 0; j < dimensions.getY(); j++) {
					if (obstacleMap[i][j] != MAX_VALUE) {
						if (j > entryMin && j < entryMax) {
							obstacleMap[i][j] = HOLE_VALUE;
						}

						if (!cabin.getSimulationSettings().isBringYourOwnSeat()
								&& !cabin.getSimulationSettings()
										.isUseFoldableSeats()) {
							if (i < 19 && i > 16) {
								obstacleMap[i][j] = HOLE_VALUE;
							}
						} else if (cabin.getSimulationSettings()
								.isUseFoldableSeats()
								&& !cabin.getSimulationSettings()
										.isBringYourOwnSeat()) {
							if (i < 21 && i > 16) {
								obstacleMap[i][j] = HOLE_VALUE;
							}
							if (j > 20) {
								if (i == 19) {
									obstacleMap[i][j] = 900;
								}
							}
						} else {
							if (j > 20) {
								if (i == 5 || i == 10 || i == 15 || i == 31
										|| i == 26 || i == 21) {
									obstacleMap[i][j] = 900;
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
	private <T extends PhysicalObject> void generateObstacles(
			Class<T> physicalObjectSubclass) {
		for (PhysicalObject physicalObject : ModelHelper.getChildrenByClass(
				cabin, physicalObjectSubclass)) {

			boolean value;
			try {
				value = ((Seat) physicalObject).isCurrentlyFolded();
			} catch (ClassCastException e) {
				value = false;
			}

			if (!(cabin.getSimulationSettings().isUseFoldableSeats() && value)) {

				int width = AStarTools.size(physicalObject.getYDimension());
				int length = AStarTools.size(physicalObject.getXDimension());
				int xPosition = AStarTools.size(physicalObject.getYPosition());
				int yPosition = AStarTools.size(physicalObject.getXPosition());

				for (int i = 0; i < width; i++) {
					for (int j = 0; j < length; j++) {
						int k = xPosition + i;
						int l = yPosition + j;
						if (k < dimensions.getX() && l < dimensions.getY()) {
							obstacleMap[k][l] = MAX_VALUE;
						}
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

	/**
	 * This method saves the obstacle map in a text file to the documents
	 * folder.
	 */
	public void printObstacleMap() {
		PrintWriter printToFile = null;
		try {
			CabinViewPart.makeDirectory();
			printToFile = new PrintWriter(CabinViewPart.getFilePath()
					+ "obstaclemap.txt");
			for (int i = 0; i < dimensions.getY(); i++) {
				for (int j = 0; j < dimensions.getX(); j++) {
					printToFile.print(getValueAtPoint(j, i) + "\t");
				}
				printToFile.println();
			}
//			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
//					"Saved obstacle map to file."));
		} catch (FileNotFoundException e) {
//			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
//					"Could not save obstacle map to file."));
		} finally {
			printToFile.close();
		}
	}
}