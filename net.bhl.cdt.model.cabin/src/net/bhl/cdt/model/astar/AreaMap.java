/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.model.cabin.util.Vector;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AreaMap {

	private Vector dimensions = new Vector(0, 0);
	private ArrayList<ArrayList<Node>> map;
	private Vector start = new Vector(0, 0);
	private Vector goal = new Vector(0, 0);
	private int[][] obstacleMap;

	/**
	 * 
	 * @param mapDimensions
	 * @param obstacleMap
	 */
	AreaMap(Vector mapDimensions, int[][] obstacleMap) {
		dimensions = mapDimensions;
		this.obstacleMap = obstacleMap;
		createMap();
		registerEdges();
	}

	/**
	 * This method prints the area map to the console.
	 */
	public void printMap() {
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (map.get(i).get(j).isOccupiedByAgent()) {
					System.out.print("X");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	/**
	 * This method creates the area map.
	 */
	private void createMap() {
		Node node;
		map = new ArrayList<ArrayList<Node>>();
		for (int x = 0; x < dimensions.getX(); x++) {
			map.add(new ArrayList<Node>());
			for (int y = 0; y < dimensions.getY(); y++) {
				node = new Node(x, y);
				if (obstacleMap[x][y] == 100000) {
					node.setObstacle(true);
				} else {
					node.setCost(obstacleMap[x][y]);
				}
				map.get(x).add(node);
			}
		}
	}

	/**
	 * Registers the nodes edges (connections to its neighbors).
	 */
	private void registerEdges() {
		for (int x = 0; x < dimensions.getX() - 1; x++) {
			for (int y = 0; y < dimensions.getY() - 1; y++) {
				Node node = map.get(x).get(y);
				if (!(y == 0)) {
					node.setNorth(map.get(x).get(y - 1));
				} else if (!(y == 0) && !(x == dimensions.getX())) {
					node.setNorthEast(map.get(x + 1).get(y - 1));
				} else if (!(x == dimensions.getX())) {
					node.setEast(map.get(x + 1).get(y));
				} else if (!(x == dimensions.getX())
						&& !(y == dimensions.getY())) {
					node.setSouthEast(map.get(x + 1).get(y + 1));
				} else if (!(y == dimensions.getY())) {
					node.setSouth(map.get(x).get(y + 1));
				} else if (!(x == 0) && !(y == dimensions.getY())) {
					node.setSouthWest(map.get(x - 1).get(y + 1));
				} else if (!(x == 0)) {
					node.setWest(map.get(x - 1).get(y));
				} else if (!(x == 0) && !(y == 0)) {
					node.setNorthWest(map.get(x - 1).get(y - 1));
				}
			}
		}
	}

	public ArrayList<ArrayList<Node>> getNodes() {
		return map;
	}

	public void setObstacle(int x, int y, boolean isObstacle) {
		map.get(x).get(y).setObstacle(isObstacle);
	}

	public Node getNode(Vector vector) {
		return map.get(vector.getX()).get(vector.getY());
	}
	
	public Node getNodeByCoordinate(int x, int y) {
		return map.get(x).get(y);
	}

	public Node getNodeByPoint(int[] point) {
		return map.get(point[0]).get(point[1]);
	}
	
	public Node getNodeByVector(Vector vector) {
		return map.get(vector.getX()).get(vector.getY());
	}

	public void setStartLocation(Vector startV) {
		map.get(start.getX()).get(start.getY()).setStart(false);
		map.get(startV.getX()).get(startV.getY()).setStart(true);
		start = startV;
	}

	public void setGoalLocation(Vector goalV) {
		map.get(goal.getX()).get(goal.getY()).setGoal(false);
		map.get(goalV.getX()).get(goalV.getY()).setGoal(true);
		goal = goalV;
	}

	public int getStartLocationX() {
		return start.getX();
	}

	public int getStartLocationY() {
		return start.getY();
	}

	public Node getStartNode() {
		return map.get(start.getX()).get(start.getY());
	}

	public int getGoalLocationX() {
		return goal.getX();
	}

	public int getGoalLocationY() {
		return goal.getY();
	}

	public Node getGoalLocation() {
		return map.get(goal.getX()).get(goal.getY());
	}

	public Vector getDimensions() {
		return dimensions;
	}

	/**
	 * This method calculates the distance between 2 nodes.
	 * 
	 * @param node1
	 *            is the first node
	 * @param node2
	 *            is the second node
	 * @return returns the distance between the 2 nodes
	 */
	public float getDistanceBetween(Node node1, Node node2) {
		return ((float) Math.sqrt((node2.getX() - node1.getX()) ^ 2
				+ (node2.getY() - node1.getY()) ^ 2));

	}

	public int getMapWidth() {
		return dimensions.getX();
	}

	public int getMapHeight() {
		return dimensions.getY();
	}

	public void clear() {
		start.setVectorFromCoordinates(0, 0);
		goal.setVectorFromCoordinates(0, 0);
		createMap();
		registerEdges();
	}
}
