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
	private Vector startLocation = new Vector(0, 0);
	private Vector goalLocation = new Vector(0, 0);
	private ArrayList<ArrayList<Node>> map;
	private ObstacleMap obstacleMap;
	private Logger log = new Logger();

	/**
	 * This is the area map constructor.
	 * @param dimensions the dimensions of the map
	 * @param obstacleMap the obstacle map
	 */
	AreaMap(Vector dimensions, ObstacleMap obstacleMap) {
		this.dimensions = dimensions;
		this.obstacleMap = obstacleMap;

		createMap();
		log.addToLog("Map Created");
		registerEdges();
		log.addToLog("Map Node edges registered");
	}

	/**
	 * This method prints the map to the console.
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
				node = new Node(new Vector(x,y));

				if (obstacleMap.getValueAtPoint(x, y) == ObstacleMap
						.getObstacleValue()) {
					node.setObstacle(true);
				} else {
					node.setCost(obstacleMap.getValueAtPoint(x, y));
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
				}
				if (!(y == 0) && !(x == dimensions.getX())) {
					node.setNorthEast(map.get(x + 1).get(y - 1));
				}
				if (!(x == dimensions.getX())) {
					node.setEast(map.get(x + 1).get(y));
				}
				if (!(x == dimensions.getX()) && !(y == dimensions.getY())) {
					node.setSouthEast(map.get(x + 1).get(y + 1));
				}
				if (!(y == dimensions.getY())) {
					node.setSouth(map.get(x).get(y + 1));
				}
				if (!(x == 0) && !(y == dimensions.getY())) {
					node.setSouthWest(map.get(x - 1).get(y + 1));
				}
				if (!(x == 0)) {
					node.setWest(map.get(x - 1).get(y));
				}
				if (!(x == 0) && !(y == 0)) {
					node.setNorthWest(map.get(x - 1).get(y - 1));
				}
			}
		}
	}

	/**
	 * This method returns the area map.
	 * @return the area map
	 */
	public ArrayList<ArrayList<Node>> getNodes() {
		return map;
	}

	/**
	 * This method sets a node an obstacle.
	 * @param x is the x value
	 * @param y is the y value
	 * @param isObstacle set yes or no
	 */
	public void setObstacle(int x, int y, boolean isObstacle) {
		map.get(x).get(y).setObstacle(isObstacle);
	}

	/**
	 * This method returns a node at a specific point.
	 * @param x the x value
	 * @param y the y value
	 * @return the node
	 */
	public Node getNodeByCoordinate(int x, int y) {
		return map.get(x).get(y);
	}

	/**
	 * This method returns a specific node at a vector point.
	 * @param vector the vector describing the position of the node
	 * @return the node
	 */
	public Node getNode(Vector vector) {
		return map.get(vector.getX()).get(vector.getY());
	}

	/**
	 * This method sets the start location.
	 * @param start the start location vector
	 */
	public void setStartLocation(Vector start) {
		map.get(startLocation.getX()).get(startLocation.getY()).setStart(false);
		map.get(start.getX()).get(start.getY()).setStart(true);
		startLocation = start;
	}

	/**
	 * This method sets the goal location.
	 * @param goal the goal location vector.
	 */
	public void setGoalLocation(Vector goal) {
		map.get(goalLocation.getX()).get(goalLocation.getY()).setGoal(false);
		map.get(goal.getX()).get(goal.getY()).setGoal(true);
		goalLocation = goal;
	}

	/**
	 * This method returns the start node.
	 * @return the start node
	 */
	public Node getStartNode() {
		return map.get(startLocation.getX()).get(startLocation.getY());
	}

	/**
	 * This method returns the goal node.
	 * @return the goal node
	 */
	public Node getGoalLocation() {
		return map.get(goalLocation.getX()).get(goalLocation.getY());
	}

	/**
	 * This method calculates the distance between two nodes.
	 * @param node1 the first node
	 * @param node2 the second node
	 * @return the distance between the nodes
	 */
	public float getDistanceBetween(Node node1, Node node2) {
		return (float) Math.sqrt((node2.getPosition().getX() - node1.getPosition().getX()) ^ 2
				+ (node2.getPosition().getY() - node1.getPosition().getY()) ^ 2);
		
	}

	/**
	 * This method returns the dimensions of the map.
	 * @return the dimensions stored in a vector
	 */
	public Vector getDimensions() {
		return dimensions;
	}

	/**
	 * This method clears the area map.
	 */
	public void clear() {
		startLocation.setTwoDimensional(0, 0);
		goalLocation.setTwoDimensional(0, 0);
		createMap();
		registerEdges();
	}
}