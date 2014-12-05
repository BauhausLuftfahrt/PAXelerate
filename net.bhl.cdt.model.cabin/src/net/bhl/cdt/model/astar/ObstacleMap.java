package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.PhysicalObject;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * 
 * @author marc.engelmann
 *
 */

public class ObstacleMap {
	private Cabin cabin;
	private int width;
	private int length;
	private static final int MAX_VALUE = 100000;
	private static final int BASIC_VALUE = 10;
	private int[][] obstacleMap;

	/**
	 * 
	 * @param cabin
	 */
	public ObstacleMap(Cabin cabin) {
		this.cabin = cabin;
		width = (int) (cabin.getCabinWidth() / cabin.getScale());
		length = (int) (cabin.getCabinLength() / cabin.getScale());
		obstacleMap = createObstacleMap();
	}

	/**
	 * This method returns the basic obstacle value.
	 * 
	 * @return returns the obstacle value
	 */
	public static int getBasicObstacleValue() {
		return BASIC_VALUE;
	}

	/**
	 * 
	 * @return
	 */
	public int[][] getMap() {
		return obstacleMap;
	}

	/**
	 * This method generates the obstacle Map.
	 * 
	 * @return obstacle map
	 */
	private int[][] createObstacleMap() {
		obstacleMap = new int[width][length];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				obstacleMap[i][j] = BASIC_VALUE;
			}
		}

		generateObstacles(Seat.class);
		generateObstacles(Lavatory.class);
		generateObstacles(Galley.class);
		generateObstacles(Curtain.class);

		/*********** Create potential hole in aisle ***********/
		int entryMin = 0;
		int entryMax = 0;
		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			if (door.getDoorType() == DoorType.MAIN_DOOR) {
				entryMin = (int) (door.getYPosition() / cabin.getScale()) + 2;
				entryMax = (int) ((door.getYPosition() + door.getWidth()) / cabin
						.getScale()) - 2;
			}
		}
		int aisleMin = (int) ((cabin.getCabinWidth() - cabin.getAisleWidth())
				/ cabin.getScale() / 2) + 1;
		int aisleMax = (int) (cabin.getCabinWidth() / cabin.getScale() - aisleMin) - 2;

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
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
		/*****************************************************/

		/******** Create potential around obstacles ************/
		int k = 1;
		int maxPot = BASIC_VALUE * 5;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				if (obstacleMap[i][j] == MAX_VALUE) {
					for (int p = 1; p < k; p++) {
						/** WEST - EAST - NORTH - SOUTH */
						if ((i - p) > 0) {
							if (obstacleMap[i - p][j] != 100000) {
								obstacleMap[i - p][j] = maxPot - p;
							}
						}
						if ((i + p) < width) {
							if (obstacleMap[i + p][j] != 100000) {
								obstacleMap[i + p][j] = maxPot - p;
							}
						}
						if ((j - p) > 0) {
							if (obstacleMap[i][j - p] != 100000) {
								obstacleMap[i][j - p] = maxPot - p;
							}
						}
						if ((j + p) < length) {
							if (obstacleMap[i][j + p] != 100000) {
								obstacleMap[i][j + p] = maxPot - p;
							}
						}

						/** NORTHWEST - NORTHEAST - SOUTHEAST - SOUTHWEST */
						if (((i - p) > 0) && ((j - p) > 0)) {
							if (obstacleMap[i - p][j - p] != 100000) {
								obstacleMap[i - p][j - p] = maxPot - p;
							}
						}
						if (((i + p) < width) && ((j - p) > 0)) {
							if (obstacleMap[i + p][j - p] != 100000) {
								obstacleMap[i + p][j - p] = maxPot - p;
							}
						}
						if (((j + p) < length) && ((i + p) < width)) {
							if (obstacleMap[i + p][j + p] != 100000) {
								obstacleMap[i + p][j + p] = maxPot - p;
							}
						}
						if (((j + p) < length) && ((i - p) > 0)) {
							if (obstacleMap[i - p][j + p] != 100000) {
								obstacleMap[i - p][j + p] = maxPot - p;
							}
						}
					}
				}
			}
		}
		/*****************************************************/

		return obstacleMap;
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
					if (k < width && l < length) {
						obstacleMap[k][l] = MAX_VALUE;
					}
				}
			}
		}
	}

	private int getValueAtPoint(int x, int y) {
		int value = obstacleMap[x][y];
		return value;
	}

	/**
	 * This method prints the obstacle map to the console.
	 */
	public void printObstacleMap() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(getValueAtPoint(i, j));
			}
			System.out.println();
		}
		System.out.println(BASIC_VALUE);
	}
}
