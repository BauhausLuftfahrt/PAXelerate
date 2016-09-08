/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.Collections;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.model.astar.node.Node;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.math.Vector3D;

/**
 * This class creates a cost map by flooding the whole map from a specific
 * point. Every element of the map has its own cost value, during flooding they
 * are summed up. So every value of the finished cost map represents the total
 * cost to get there from the initial value. In its current configuration, the
 * cost map is fed with an area map, width, height and the initial starting
 * point.
 *
 * @author marc.engelmann
 * @version 1.3
 * @since 0.5
 * @see net.bhl.cdt.model.astar/AreaMap.java
 * @see net.bhl.cdt.model.astar/Node.java
 */

public class Costmap {

	/** The map. */
	private int[][] map;

	/** The goal point. */
	private Vector size, startPoint = new Vector2D(0, 0),
			goalPoint = new Vector2D(0, 0);

	/** The point parking. */
	private ArrayList<Vector> visitedPoints = new ArrayList<Vector>(),
			pointParkingHelper = new ArrayList<Vector>(),
			onHoldList = new ArrayList<Vector>(),
			pointParking = new ArrayList<Vector>();

	/** The lowest cost. */
	private int lowestCost;

	/**
	 * Instantiates a new costmap.
	 *
	 * @param size
	 *            the size
	 * @param start
	 *            the start
	 * @param areamap
	 *            the areamap
	 * @param agent
	 *            the agent
	 * @param OnlyFloodToSeat
	 *            the only flood to seat
	 */
	public Costmap(Vector size, Vector start, Areamap areamap, Agent agent,
			boolean OnlyFloodToSeat) { 
		
		this.size = size;
		this.startPoint = start;

		if (OnlyFloodToSeat) {
			this.goalPoint = agent.getGoal();
		} else {
				this.goalPoint = new Vector2D(0, size.getY() / 2);
		}

		map = new int[size.getX()][size.getY()];

		for (Node node : areamap.getNodes()) {

			if (node.isObstacle()) {

				setCost(node.getPosition(), -1);
			} else {
				setCost(node.getPosition(), node.getObstacleValue());
			}
		}

		map[startPoint.getX()][startPoint.getY()] = 0;
		visitedPoints.add(startPoint);
		floodMap();
		//printMapToConsole();
	}
	
	/*new costmap for front & rear boarding door,fromFront = 0, FromRear = 1;*/
	public Costmap(Vector size, Vector start, Areamap areamap, Agent agent,
			boolean OnlyFloodToSeat,int indicatorDoor) { 
		this.size = size;
		this.startPoint = start;
		
		if (OnlyFloodToSeat) {
			this.goalPoint = agent.getGoal();
		} else {
			
			/*the position of seat is located more rear than the boarding door*/ 
			if(indicatorDoor == 0){

				this.goalPoint = new Vector2D(size.getX() - 1, size.getY() / 2);		
			
			/*the position of seat is located more front than the boarding door & indicatorDoor = 1*/ 
			} else{

				this.goalPoint = new Vector2D(1, size.getY() / 2);
				
			}
		}

		map = new int[size.getX()][size.getY()];
		
		
		for (Node node : areamap.getNodes()) {

			if (node.isObstacle()) {

				setCost(node.getPosition(), -1);
			} else {
				setCost(node.getPosition(), node.getObstacleValue());
			}
		}
		
		/*test for Pop-up seats,hide the seat*/ 
//		for (Node node : areamap.getNodes()) {
//
//			if (node.isObstacle()) {
//				
//				if(node.getObstacleType().getValue() == 0){
//					setCost(node.getPosition(),AreamapHandler.DEFAULT_VALUE);
//					}
//				else{
//					setCost(node.getPosition(), -1);	
//				}
//	
//			} else {
//				setCost(node.getPosition(), node.getObstacleValue());
//			}
//		}		

		map[startPoint.getX()][startPoint.getY()] = 0;
		visitedPoints.add(startPoint);
		floodMap();
		
		
	}

	/**
	 * Sets the cost.
	 *
	 * @param position
	 *            the position
	 * @param value
	 *            the value
	 */
	public void setCost(Vector position, int value) throws ArithmeticException {
		map[position.getX()][position.getY()] = value;
		if (value < -1) {
			throw new ArithmeticException("set cost < -1 : " + value);
		}
	}

	/**
	 * This method prints the cost map with values.
	 */
	public void printMapToConsole() {
		for (int i = 0; i < size.getX(); i++) {
			for (int j = 0; j < size.getY(); j++) {
				if (map[i][j] == -1) {
					System.out.print("X\t");
				}
				// else if (i == goalPoint.getX() && j == goalPoint.getY()) {
				// System.out.print("G\t");
				// } else if (i == startPoint.getX() && j == startPoint.getY())
				// {
				// System.out.print("S\t");
				// }
				else {
					System.out.print(getCostForCoordinates(i, j) + "\t");
				}
			}
			System.out.println();
		}
	}

	/**
	 * This method prints the cost map with a path to the console.
	 *
	 * @param path
	 *            the path
	 * @param areamap
	 *            the areamap
	 * @param agent
	 *            the agent
	 */
	public void printMapPathToConsole(Path path, Areamap areamap, Agent agent) {
		System.out.println("This is the cost map:");
		for (int i = 0; i < size.getX(); i++) {
			for (int j = 0; j < size.getY(); j++) {
				boolean foundNode = false;
				// TODO: check if there is a node at a specific point.
				if (path != null) {
					for (Node node : path.getWaypoints()) {
						if (node.getPosition().equals(new Vector2D(i, j))) {
							foundNode = true;
						}
					}
				}
				if (i == agent.getPosition().getX()
						&& j == agent.getPosition().getY()) {
					System.out.print("I");
				} else if (areamap.get(i, j).getProperty() == Property.AGENT) {
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
					System.out.print("-");
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
			copyPoints();
			for (Vector newPoint : getPointParking()) {
				createSurroundingCosts(newPoint);
			}
		}
		copyPoints();
		for (Vector newPoint : getPointParking()) {
			createSurroundingCosts(newPoint);
		}		
	}

	/**
	 * This method checks if the goal was reached.
	 * 
	 * @return returns if the goal was reached.
	 */
	private boolean goalReached() {
		for (Vector point : getPointParking()) {
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
	private void copyPoints() {
		lowestCost = Integer.MAX_VALUE;
		getPointParking().clear();

		for (Vector transferPoint : onHoldList) {
			getPointParkingHelper().add(transferPoint);
		}
		onHoldList.clear();
		/* At first, check all stored points for the lowest cost. */
		for (Vector costPoint : getPointParkingHelper()) {
			checkLowestCost(costPoint);
		}
		for (Vector copyPoint : getPointParkingHelper()) {
			if (getCost(copyPoint) <= lowestCost) {
				getPointParking().add(copyPoint);
			} else {
				onHoldList.add(copyPoint);
			}
		}
		getPointParkingHelper().clear();
		sortTheList(getPointParking());
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
		for (Vector point : sortTheList(
				getSurroundingPoints(middlePoint.getX(), middlePoint.getY()))) {
			if (!(point.getX() < 0 || point.getY() < 0
					|| point.getX() >= size.getX()
					|| point.getY() >= size.getY())) {
				if (!isObstacle(point)) {
					if (!(checkForPoint(visitedPoints, point))) {
						setCost(point, (getCost(middlePoint) + getCost(point)));
						visitedPoints.add(point);
						getPointParkingHelper().add(point);
					}
				}
			}
		}
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

		if (map[point.getX()][point.getY()] < -1) {
			throw new ArithmeticException(
					"set cost < -1 : " + map[point.getX()][point.getY()]);
		}
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

	private int getCostForCoordinates(int xCord, int yCord)
			throws ArrayIndexOutOfBoundsException {
		if (xCord >= 0 && yCord >= 0 && xCord < size.getX()
				&& yCord < size.getY()) {
			return map[xCord][yCord];
		} else {
			throw new ArrayIndexOutOfBoundsException(
					"xCord = " + xCord + ", yCord = " + yCord);
		}
	}

	/**
	 * Sort the list.
	 *
	 * @param sortedList
	 *            the sorted list
	 * @return the array list
	 */
	private ArrayList<Vector> sortTheList(ArrayList<Vector> sortedList) {
		Collections.sort(sortedList);
		return sortedList;
	}

	/**
	 * Gets the maximum cost.
	 *
	 * @return the maximum cost
	 */
	public int getMaximumCost() {
		int maximum = 0;
		for (int i = 0; i < size.getX(); i++) {
			for (int j = 0; j < size.getY(); j++) {
				if (map[i][j] > maximum) {
					maximum = map[i][j];
				}
			}
		}
		return maximum;
	}

	/**
	 * Check lowest cost.
	 *
	 * @param point
	 *            the point
	 */
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
	 * @param x
	 *            x coordinate of the middle point
	 * @param y
	 *            y coordinate of the middle point
	 * @return returns the point vector
	 */
	public ArrayList<Vector> getSurroundingPoints(int x, int y) {
		ArrayList<Vector> neighbors = new ArrayList<Vector>();

		if (y >= 1) {
			neighbors.add(
					new Vector3D(x, y - 1, getCostForCoordinates(x, y - 1)));
		}
		if ((y >= 1) && (x < size.getX() - 1)) {
			neighbors.add(new Vector3D(x + 1, y - 1,
					getCostForCoordinates(x + 1, y - 1)));
		}
		if (x < size.getX() - 1) {
			neighbors.add(
					new Vector3D(x + 1, y, getCostForCoordinates(x + 1, y)));
		}
		if ((y < size.getY() - 1) && (x < size.getX() - 1)) {
			neighbors.add(new Vector3D(x + 1, y + 1,
					getCostForCoordinates(x + 1, y + 1)));
		}
		if (y < size.getY() - 1) {
			neighbors.add(
					new Vector3D(x, y + 1, getCostForCoordinates(x, y + 1)));
		}
		if ((x >= 1) && (y < size.getY() - 1)) {
			neighbors.add(new Vector3D(x - 1, y + 1,
					getCostForCoordinates(x - 1, y + 1)));
		}
		if (x >= 1) {
			neighbors.add(
					new Vector3D(x - 1, y, getCostForCoordinates(x - 1, y)));
		}
		if ((y >= 1) && (x >= 1)) {
			neighbors.add(new Vector3D(x - 1, y - 1,
					getCostForCoordinates(x - 1, y - 1)));
		}

		return neighbors;
	}

	/**
	 * Gets the point parking helper.
	 *
	 * @return the point parking helper
	 */
	private ArrayList<Vector> getPointParkingHelper() {
		return pointParkingHelper;
	}

	/**
	 * Gets the point parking.
	 *
	 * @return the point parking
	 */
	private ArrayList<Vector> getPointParking() {
		return pointParking;
	}
}