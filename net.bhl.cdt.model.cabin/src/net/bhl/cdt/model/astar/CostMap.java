
package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.model.cabin.util.Vector;

/**
 * This class creates a cost map by flooding the whole map from a specific
 * point. Every element of the map has its own cost value, during flooding they
 * are summed up. So every value of the finished cost map represents the total
 * cost to get there from the initial value. In its current configuration, the
 * cost map is fed with an area map, width, height and the initial starting
 * point.
 * 
 * @see net.bhl.cdt.model.astar/AreaMap.java
 * @see net.bhl.cdt.model.astar/Node.java
 * 
 * @author marc.engelmann
 * @version 1.3
 * @date 08.12.2014
 * 
 */

public class CostMap {

	private int[][] map;
	private Vector dimensions = new Vector();
	private Vector startPoint = new Vector();
	private Vector goalPoint = new Vector();
	private ArrayList<int[]> visitedPoints = new ArrayList<int[]>();
	private ArrayList<int[]> pointParking = new ArrayList<int[]>();
	private ArrayList<int[]> pointParkingHelper = new ArrayList<int[]>();
	private AreaMap areamap;

	/**
	 * The cost map is constructed in this function.
	 * 
	 * @param width
	 *            is the width of the map
	 * @param height
	 *            is the height of the map
	 * @param startX
	 *            is the initial staring point x value
	 * @param startY
	 *            is the initial staring point y value
	 * @param goalX
	 *            is the goal point x value
	 * @param goalY
	 *            is the goal point y value
	 * @param areaMap
	 *            contains information on the cost of every individual element
	 */
	public CostMap(Vector dimension, Vector start, Vector goal, AreaMap areaMap) {
		dimensions.setPointFromPoint(dimension.getPoint());
		startPoint.setPointFromPoint(start.getPoint());
		goalPoint.setPointFromPoint(goal.getPoint());
		areamap = areaMap;
		map = new int[dimensions.getX()][dimensions.getY()];
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				Node node = areamap.getNodeByCoordinate(i, j);
				if (!node.isObstacle()) {
					map[i][j] = node.getCost();
					int[] helpPoint = new int[2];
					helpPoint[0] = i;
					helpPoint[1] = j;
				} else {
					map[i][j] = -1;
				}
			}
		}
		map[startPoint.getX()][startPoint.getY()] = 0;
		visitedPoints.add(startPoint.getPoint());
		floodMap();
	}

	/**
	 * This function floods the whole map until the goal is reached.
	 */
	private void floodMap() {
		createSurroundingCosts(startPoint.getPoint());
		while (!goalReached()) {
			copyPoints();
			for (int[] newPoint : pointParking) {
				createSurroundingCosts(newPoint);
			}
		}
		copyPoints();
		for (int[] newPoint : pointParking) {
			createSurroundingCosts(newPoint);
		}
	}

	/**
	 * This method checks if the goal was reached.
	 * 
	 * @return returns if the goal was reached.
	 */
	private boolean goalReached() {
		for (int[] point : pointParking) {
			if (point[0] == goalPoint.getX() && point[1] == goalPoint.getY()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This function returns whether the requested element is an obstacle or
	 * not.
	 * 
	 * @param point
	 *            the requested point
	 * @return returns the boolean
	 */
	private boolean isObstacle(int[] point) {
		return map[point[0]][point[1]] == -1;
	}

	/**
	 * This function checks whether there is a specific point in a specific list
	 * by scanning through all entries.
	 * 
	 * @param list
	 *            the checked list
	 * @param point
	 *            the desired point
	 * @return is the point in the list?
	 */
	private boolean checkForPoint(ArrayList<int[]> list, int[] point) {
		for (int[] checkPoint : list) {
			if (checkPoint[0] == point[0] && checkPoint[1] == point[1]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This function moves the points gathered in pointParkingHelper to
	 * pointParking.
	 */
	private void copyPoints() {
		pointParking.clear();
		for (int[] copyPoint : pointParkingHelper) {
			pointParking.add(copyPoint);
		}
		pointParkingHelper.clear();
	}

	/**
	 * This functions calculates the cost for all 8 surrounding elements of one
	 * middle element by adding the cost of the middle element to the cost of
	 * the specific surrounding element.
	 * 
	 * @param middlePoint
	 *            is the point around which all costs are calculated
	 */
	private void createSurroundingCosts(int[] middlePoint) {
		for (int[] point : getSurroundingPoints(middlePoint[0], middlePoint[1])) {
			if (!(point[0] < 0 || point[1] < 0 || point[0] >= dimensions.getX() || point[1] >= dimensions
					.getY())) {
				if (!isObstacle(point)) {
					if (!(checkForPoint(visitedPoints, point))) {
						map[point[0]][point[1]] += getCost(middlePoint);
						visitedPoints.add(point);
						pointParkingHelper.add(point);
					}
				}
			}
		}
	}

	/**
	 * This method outputs the whole cost map in the console.
	 */
	public void printMap() {
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (map[i][j] == -1) {
					System.out.print("X");
				} else {
					System.out.print(map[i][j]);
				}
			}
			System.out.println();
		}

	}

	/**
	 * This function outputs a specific list in the console.
	 * 
	 * @param list
	 *            is the ArrayList element (MUST be of type int[]) you want to
	 *            print out.
	 */
	@SuppressWarnings("unused")
	private void printList(ArrayList<int[]> list) {
		for (int[] printPoint : list) {
			System.out.println("x:" + printPoint[0] + ", y:" + printPoint[1]);
		}
		System.out.println();
	}

	/**
	 * This method returns the <b><i>already calculated</i></b> cost of a
	 * specific point in the cost map.
	 * 
	 * @param point
	 *            is the point (of dimension int[2]) of interest
	 * @return
	 */
	private int getCost(int[] point) {
		return map[point[0]][point[1]];
	}

	/**
	 * This method returns the <b><i>already calculated</i></b> cost of a
	 * specific point in the cost map.
	 * 
	 * @param xCord
	 *            is the x coordinate of the desired point
	 * @param yCord
	 *            is the y coordinate of the desired point
	 * @return returns the cost for a specific coordinate
	 */
	public int getCostForCoordinates(int xCord, int yCord) {
		return map[xCord][yCord];
	}

	/**
	 * This method delivers all 8 surrounding points of a specific point in the
	 * cost map. Starting in the north, all points are collected clockwise.
	 * 
	 * @param pointX
	 *            x coordinate of the middle point
	 * @param pointY
	 *            y coordinate of the middle point
	 * @return returns the point vector
	 */
	private int[][] getSurroundingPoints(int pointX, int pointY) {
		int[][] points = new int[8][2];
		points[0][0] = pointX;
		points[0][1] = pointY - 1;
		points[1][0] = pointX + 1;
		points[1][1] = pointY - 1;
		points[2][0] = pointX + 1;
		points[2][1] = pointY;
		points[3][0] = pointX + 1;
		points[3][1] = pointY + 1;
		points[4][0] = pointX;
		points[4][1] = pointY + 1;
		points[5][0] = pointX - 1;
		points[5][1] = pointY + 1;
		points[6][0] = pointX - 1;
		points[6][1] = pointY;
		points[7][0] = pointX - 1;
		points[7][1] = pointY - 1;
		return points;
	}
}
