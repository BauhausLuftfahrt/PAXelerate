/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
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
 * 
 */

public class CostMap {

	private int[][] map;
	private Vector dimensions = new Vector();
	private Vector startPoint = new Vector();
	private Vector goalPoint = new Vector();
	private ArrayList<Vector> visitedPoints = new ArrayList<Vector>();
	private ArrayList<Vector> pointParking = new ArrayList<Vector>();
	private ArrayList<Vector> pointParkingHelper = new ArrayList<Vector>();
	private AreaMap areamap;

	/**
	 * The cost map is constructed in this function.
	 * 
	 * @param dimension is the dimension vector
	 * @param start is the start vector 
	 * @param goal is the goal vector
	 * @param areaMap
	 *            contains information on the cost of every individual element
	 */
	public CostMap(Vector dimension, Vector start, Vector goal, AreaMap areaMap) {
		dimensions.setVectorFromPoint(dimension.getValue());
		startPoint.setVectorFromPoint(start.getValue());
		goalPoint.setVectorFromPoint(goal.getValue());
		areamap = areaMap;
		map = new int[dimensions.getX()][dimensions.getY()];
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				Node node = areamap.getNodeByCoordinate(i, j);
				if (!node.isObstacle()) {
					map[i][j] = node.getCost();
				} else {
					map[i][j] = -1;
				}
			}
		}
		map[startPoint.getX()][startPoint.getY()] = 0;
		visitedPoints.add(startPoint);
		floodMap();
	}

	/**
	 * This function floods the whole map until the goal is reached.
	 */
	private void floodMap() {
		createSurroundingCosts(startPoint);
		while (!goalReached()) {
			copyPoints();
			for (Vector newPoint : pointParking) {
				createSurroundingCosts(newPoint);
			}
		}
		copyPoints();
		for (Vector newPoint : pointParking) {
			createSurroundingCosts(newPoint);
		}
	}

	/**
	 * This method checks if the goal was reached.
	 * 
	 * @return returns if the goal was reached.
	 */
	private boolean goalReached() {
		for (Vector point : pointParking) {
			if (point.getX() == goalPoint.getX() && point.getY() == goalPoint.getY()) {
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
	private boolean isObstacle(Vector point) {
		return map[point.getX()][point.getY()] == -1;
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
	private boolean checkForPoint(ArrayList<Vector> list, Vector point) {
		for (Vector checkPoint : list) {
			if (checkPoint.getX() == point.getX() && checkPoint.getY() == point.getY()) {
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
		for (Vector copyPoint : pointParkingHelper) {
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
	private void createSurroundingCosts(Vector middlePoint) {
		for (Vector point : getSurroundingPoints(middlePoint.getX(), middlePoint.getY())) {
			if (!(point.getX() < 0 || point.getY() < 0 || point.getX() >= dimensions.getX() || point.getY() >= dimensions
					.getY())) {
				if (!isObstacle(point)) {
					if (!(checkForPoint(visitedPoints, point))) {
						map[point.getX()][point.getY()] += getCost(middlePoint);
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
	private void printList(ArrayList<Vector> list) {
		for (Vector printPoint : list) {
			System.out.println("x:" + printPoint.getX() + ", y:" + printPoint.getY());
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
	private int getCost(Vector point) {
		return map[point.getX()][point.getY()];
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
	private ArrayList<Vector> getSurroundingPoints(int pointX, int pointY) {
		ArrayList <Vector> surroundingPoints  = new ArrayList<Vector>();	
		Vector vector0 = new Vector(pointX,pointY - 1);
		surroundingPoints.add(vector0);
		Vector vector1 = new Vector(pointX+1,pointY - 1);
		surroundingPoints.add(vector1);
		Vector vector2 = new Vector(pointX+1,pointY);
		surroundingPoints.add(vector2);
		Vector vector3 = new Vector(pointX+1,pointY + 1);
		surroundingPoints.add(vector3);
		Vector vector4 = new Vector(pointX,pointY + 1);
		surroundingPoints.add(vector4);
		Vector vector5 = new Vector(pointX-1,pointY + 1);
		surroundingPoints.add(vector5);
		Vector vector6 = new Vector(pointX-1,pointY);
		surroundingPoints.add(vector6);
		Vector vector7 = new Vector(pointX-1,pointY - 1);
		surroundingPoints.add(vector7);
		return surroundingPoints;
	}
}
