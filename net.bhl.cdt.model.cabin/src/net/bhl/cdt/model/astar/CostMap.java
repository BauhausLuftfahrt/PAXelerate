/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;
import net.bhl.cdt.model.cabin.util.Vector3D;

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
	private Vector dimensions = new Vector2D(0, 0);
	private Vector startPoint = new Vector2D(0, 0);
	private Vector goalPoint = new Vector2D(0, 0);
	private ArrayList<Vector> visitedPoints = new ArrayList<Vector>();
	public ArrayList<Vector> pointParking = new ArrayList<Vector>();
	public ArrayList<Vector> pointParkingHelper = new ArrayList<Vector>();
	private ArrayList<Vector> onHoldList = new ArrayList<Vector>();
	private AreaMap areamap;
	private ILog logger;
	private int lowestCost;

	/**
	 * 
	 * @param dimension
	 * @param areaMap
	 */
	public CostMap(Vector dimension, Vector start, AreaMap areaMap,
			Boolean inSteps, Agent agent, boolean OnlyFloodToSeat) {
		this.dimensions = dimension;
		this.startPoint = start;
		if (OnlyFloodToSeat) {
			this.goalPoint = agent.getGoal();
		} else {
			((Vector2D) this.goalPoint).set((int) dimensions.getX() / 2,
					dimensions.getY() - 1);
		}
		this.areamap = areaMap;
		this.logger = Platform.getLog(Platform
				.getBundle("net.bhl.cdt.model.cabin"));
		map = new int[dimensions.getX()][dimensions.getY()];
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				Node node = areamap.getNodeByCoordinate(i, j);
				if (node.getProperty() == Property.OBSTACLE) {
					setCost(i, j, -1);
				} else {
					setCost(i, j, node.getCost());
				}
			}
		}

		map[startPoint.getX()][startPoint.getY()] = 0;
		visitedPoints.add(startPoint);
		if (!inSteps) {
			floodMap();
		} else {
			createSurroundingCosts(startPoint);
		}
	}

	public int[][] getMap() {
		return map;
	}

	private void setCost(int x, int y, int value) {
		map[x][y] = value;
	}

	public void setPublicCost(int x, int y, int value) {
		if (areamap.getNodeByCoordinate(x, y).getProperty() != Property.OBSTACLE) {
			map[x][y] = value;
		}
	}

	/**
	 * This method prints the cost map with values.
	 */
	public void printMapToConsole() {
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (map[i][j] == -1) {
					System.out.print("X\t");
				} else if (i == goalPoint.getX() && j == goalPoint.getY()) {
					System.out.print("G\t");
				} else if (i == startPoint.getX() && j == startPoint.getY()) {
					System.out.print("S\t");
				} else {
					System.out.print(getCostForCoordinates(i, j) + "\t");
				}
			}
			System.out.println();
		}
	}

	/**
	 * This method prints the cost map with a path to the console.
	 */
	public void printMapPathToConsole(Path path, AreaMap areamap, Agent agent) {
		System.out.println("This is the cost map:");
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				boolean foundNode = false;
				// TODO: check if there is a node at a specific point.
				if (path != null) {
					for (Node node : path.getWaypoints()) {
						if (FuncLib.vectorsAreEqual(node.getPosition(),
								new Vector2D(i, j))) {
							foundNode = true;
						}
					}
				}
				if (i == agent.getPosition().getX()
						&& j == agent.getPosition().getY()) {
					System.out.print("I");
				} else if (areamap.getNodeByCoordinate(i, j).getProperty() == Property.AGENT) {
					System.out.print("A");
				} else if (foundNode) {
					System.out.print(">");
				} else if (map[i][j] == -1) {
					System.out.print("X");
				} else if (map[i][j] >= 5000) {
					System.out.print("O");
				} else if (i == goalPoint.getX() && j == goalPoint.getY()) {
					System.out.print("G");
				} else if (i == startPoint.getX() && j == startPoint.getY()) {
					System.out.print("S");
				} else {
					System.out.print("-");// getCostForCoordinates(i, j) +
											// "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	/**
	 * This function floods the whole map until the goal is reached.
	 */
	private void floodMap() {
		createSurroundingCosts(startPoint);
		while (!goalReached()) {
			System.out.println("We are in floodMap()");
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
			if (point.getX() == goalPoint.getX()
					&& point.getY() == goalPoint.getY()) {
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
			if (checkPoint.getX() == point.getX()
					&& checkPoint.getY() == point.getY()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This function moves the points gathered in pointParkingHelper to
	 * pointParking.
	 */
	public void copyPoints() {
		lowestCost = Integer.MAX_VALUE;
		pointParking.clear();

		for (Vector transferPoint : onHoldList) {
			pointParkingHelper.add(transferPoint);
		}
		onHoldList.clear();
		/* At first, check all stored points for the lowest cost. */
		for (Vector costPoint : pointParkingHelper) {
			checkLowestCost(costPoint);
		}
		for (Vector copyPoint : pointParkingHelper) {
			if (getCost(copyPoint) <= lowestCost) {
				pointParking.add(copyPoint);
			} else {
				onHoldList.add(copyPoint);
			}
		}
		pointParkingHelper.clear();
		sortTheList(pointParking);
	}

	/**
	 * This functions calculates the cost for all 8 surrounding elements of one
	 * middle element by adding the cost of the middle element to the cost of
	 * the specific surrounding element.
	 * 
	 * @param middlePoint
	 *            is the point around which all costs are calculated
	 */
	public void createSurroundingCosts(Vector middlePoint) {
		for (Vector point : sortTheList(getSurroundingPoints(
				middlePoint.getX(), middlePoint.getY()))) {
			if (!(point.getX() < 0 || point.getY() < 0
					|| point.getX() >= dimensions.getX() || point.getY() >= dimensions
					.getY())) {
				if (!isObstacle(point)) {
					if (!(checkForPoint(visitedPoints, point))) {
						setCost(point.getX(), point.getY(),
								getCost(middlePoint) + getCost(point));
						visitedPoints.add(point);
						pointParkingHelper.add(point);
					}
				}
			}
		}
	}

	/**
	 * This method saves the whole cost map in a text file to the documents
	 * folder.
	 */
	public void saveMapToFile() {
		PrintWriter printToFile = null;
		try {
			CabinViewPart.makeDirectory();
			printToFile = new PrintWriter(CabinViewPart.getFilePath()
					+ "costmap.txt");
			for (int i = 0; i < dimensions.getY(); i++) {
				for (int j = 0; j < dimensions.getX(); j++) {
					if (map[j][i] == -1) {
						printToFile.print("X\t");
					} else {
						printToFile.print(map[j][i] + "\t");
					}
				}
				printToFile.println();
			}
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"Saved cost map to file."));
		} catch (FileNotFoundException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Could not save cost map to file."));
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"The file path is not available."));
		} finally {
			printToFile.close();
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
			System.out.println("x:" + printPoint.getX() + ", y:"
					+ printPoint.getY());
		}
		System.out.println();
	}

	/**
	 * This method returns the <b><i>already calculated</i></b> cost of a
	 * specific point in the cost map.
	 * 
	 * @param point
	 *            is the point (of dimension int[2]) of interest
	 * @return the cost at the specific point
	 */
	public int getCost(Vector point) {
		try {
			return map[point.getX()][point.getY()];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("###### !ArrayIndexOutOfBoundsException ERROR! ###### !COSTMAP - getCost()! ######");
			return Integer.MAX_VALUE;
		}

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
		try {
			if (xCord >= 0 && yCord >= 0 && xCord < dimensions.getX()
					&& yCord < dimensions.getY()) {
				return map[xCord][yCord];
			}
			return Integer.MAX_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("###### !ArrayIndexOutOfBoundsException ERROR! ###### !COSTMAP - getCostForCoordinate()! ######");
			return Integer.MAX_VALUE;
		}
	}

	private ArrayList<Vector> sortTheList(ArrayList<Vector> sortedList) {
		Collections.sort(sortedList);
		return sortedList;
	}

	private void checkLowestCost(Vector point) {
		if (getCost(point) != 0) {
			if (getCost(point) < lowestCost) {
				lowestCost = getCost(point);
			}
		}
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
	public ArrayList<Vector> getSurroundingPoints(int pointX, int pointY) {
		ArrayList<Vector> surroundingPoints = new ArrayList<Vector>();
		surroundingPoints.add(new Vector3D(pointX, pointY - 1,
				getCostForCoordinates(pointX, pointY - 1)));
		surroundingPoints.add(new Vector3D(pointX + 1, pointY - 1,
				getCostForCoordinates(pointX + 1, pointY - 1)));
		surroundingPoints.add(new Vector3D(pointX + 1, pointY,
				getCostForCoordinates(pointX + 1, pointY)));
		surroundingPoints.add(new Vector3D(pointX + 1, pointY + 1,
				getCostForCoordinates(pointX + 1, pointY + 1)));
		surroundingPoints.add(new Vector3D(pointX, pointY + 1,
				getCostForCoordinates(pointX, pointY + 1)));
		surroundingPoints.add(new Vector3D(pointX - 1, pointY + 1,
				getCostForCoordinates(pointX - 1, pointY + 1)));
		surroundingPoints.add(new Vector3D(pointX - 1, pointY,
				getCostForCoordinates(pointX - 1, pointY)));
		surroundingPoints.add(new Vector3D(pointX - 1, pointY - 1,
				getCostForCoordinates(pointX - 1, pointY - 1)));
		return surroundingPoints;
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
	public static ArrayList<Vector> getSurroundingPointsViaStaticCommand(
			int pointX, int pointY) {
		ArrayList<Vector> surroundingPoints = new ArrayList<Vector>();
		/* north */
		surroundingPoints.add(new Vector2D(pointX, pointY - 1));

		/* north - east */
		// surroundingPoints.add(new Vector2D(pointX + 1, pointY - 1));

		/* east */
		surroundingPoints.add(new Vector2D(pointX + 1, pointY));

		/* south - east */
		// surroundingPoints.add(new Vector2D(pointX + 1, pointY + 1));

		/* south */
		surroundingPoints.add(new Vector2D(pointX, pointY + 1));

		/* south - west */
		// surroundingPoints.add(new Vector2D(pointX - 1, pointY + 1));

		/* west */
		surroundingPoints.add(new Vector2D(pointX - 1, pointY));

		/* north - west */
		// surroundingPoints.add(new Vector2D(pointX - 1, pointY - 1));

		return surroundingPoints;
	}
}