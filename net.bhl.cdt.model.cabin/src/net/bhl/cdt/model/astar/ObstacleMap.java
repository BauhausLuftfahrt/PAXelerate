/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.MainDoor;
import net.bhl.cdt.model.cabin.PhysicalObject;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann
 *
 */

public class ObstacleMap {
	private Cabin cabin;
	private Vector dimensions = new Vector(0, 0);
	private static final int MAX_VALUE = 100000;
	private static final int BASIC_VALUE = 10;
	private int[][] obstacleMap;

	/**
	 * This method constructs the obstacle map.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public ObstacleMap(Cabin cabin) {
		this.cabin = cabin;
		dimensions.setTwoDimensional(
				(int) (cabin.getCabinWidth() / cabin.getScale()),
				(int) (cabin.getCabinLength() / cabin.getScale()));
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
	 * @return obstacleMap is the obstacle map two dimensional array
	 */
	private int[][] createObstacleMap() {
		obstacleMap = new int[dimensions.getX()][dimensions.getY()];
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				obstacleMap[i][j] = BASIC_VALUE;
			}
		}

		generateObstacles(Seat.class);
		generateObstacles(Lavatory.class);
		generateObstacles(Galley.class);
		generateObstacles(Curtain.class);

		generateAisleHole();
		generatePotentialGradient();

		/******** Create potential around obstacles ************/

		/*****************************************************/

		return obstacleMap;
	}

	/**
	 * This method creates the potential gradient around obstacle.
	 */
	private void generatePotentialGradient() {
		int k = 1;
		int maxPot = BASIC_VALUE * 5;
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (obstacleMap[i][j] == MAX_VALUE) {
					for (int p = 1; p < k; p++) {
						/** WEST - EAST - NORTH - SOUTH */
						if (((i - p) > 0)
								&& (obstacleMap[i - p][j] != MAX_VALUE)) {
							obstacleMap[i - p][j] = maxPot - p;
						}
						if (((i + p) < dimensions.getX())
								&& (obstacleMap[i + p][j] != MAX_VALUE)) {
							obstacleMap[i + p][j] = maxPot - p;
						}

						if (((j - p) > 0)
								&& (obstacleMap[i][j - p] != MAX_VALUE)) {
							obstacleMap[i][j - p] = maxPot - p;

						}
						if (((j + p) < dimensions.getY())
								&& (obstacleMap[i][j + p] != MAX_VALUE)) {
							obstacleMap[i][j + p] = maxPot - p;

						}

						/** NORTHWEST - NORTHEAST - SOUTHEAST - SOUTHWEST */
						if ((((i - p) > 0) && ((j - p) > 0))
								&& (obstacleMap[i - p][j - p] != MAX_VALUE)) {
							obstacleMap[i - p][j - p] = maxPot - p;

						}
						if ((((i + p) < dimensions.getX()) && ((j - p) > 0))
								&& (obstacleMap[i + p][j - p] != MAX_VALUE)) {
							obstacleMap[i + p][j - p] = maxPot - p;

						}
						if ((((j + p) < dimensions.getY()) && ((i + p) < dimensions
								.getX()))
								&& (obstacleMap[i + p][j + p] != MAX_VALUE)) {
							obstacleMap[i + p][j + p] = maxPot - p;

						}
						if ((((j + p) < dimensions.getY()) && ((i - p) > 0))
								&& (obstacleMap[i - p][j + p] != MAX_VALUE)) {
							obstacleMap[i - p][j + p] = maxPot - p;

						}
					}
				}
			}
		}
	}

	/**
	 * This method generates the obstacle hole in the aisle. This means that in
	 * the aisle, the obstacle value is set to zero. This makes the passengers
	 * consider the aisle as the preferred path.
	 */
	private void generateAisleHole() {
		int entryMin = 0;
		int entryMax = 0;
		for (Door door : ModelHelper.getChildrenByClass(cabin, MainDoor.class)) {
			entryMin = (int) (door.getYPosition() / cabin.getScale()) + 2;
			entryMax = (int) ((door.getYPosition() + door.getWidth()) / cabin
					.getScale()) - 2;
		}
		int aisleMin = (int) ((cabin.getCabinWidth() - cabin.getAisleWidth())
				/ cabin.getScale() / 2) + 1;
		int aisleMax = (int) (cabin.getCabinWidth() / cabin.getScale() - aisleMin) - 2;

		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (obstacleMap[i][j] != MAX_VALUE) {
					if (j > entryMin && j < entryMax) {
						obstacleMap[i][j] = 0;
					}
					if (i < aisleMax && i > aisleMin) {
						obstacleMap[i][j] = 0;
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
			int physicalObjectWidth = (int) (physicalObject.getXDimension() / cabin
					.getScale());
			int physicalObjectLength = (int) (physicalObject.getYDimension() / cabin
					.getScale());
			int physicalObjectXPosition = (int) (physicalObject.getXPosition() / cabin
					.getScale());
			int physicalObjectYDimension = (int) (physicalObject.getYPosition() / cabin
					.getScale());
			obstacleMap[physicalObjectXPosition][physicalObjectYDimension] = MAX_VALUE;
			for (int i = 0; i < physicalObjectWidth; i++) {
				for (int j = 0; j < physicalObjectLength; j++) {
					int k = physicalObjectXPosition + i;
					int l = physicalObjectYDimension + j;
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

	/**
	 * This method prints the obstacle map to the console.
	 */
	public void printObstacleMap() {
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				System.out.print(getValueAtPoint(i, j));
			}
			System.out.println();
		}
		System.out.println(BASIC_VALUE);
	}
}