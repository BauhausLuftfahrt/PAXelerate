/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.model.cabin.util.Vector;

public class AreaMap {

	private Vector dimensions = new Vector();
	private Vector startLocation = new Vector(0, 0);
	private Vector goalLocation = new Vector(0, 0);
	private ArrayList<ArrayList<Node>> map;
	private ObstacleMap obstacleMap;
	private Logger log = new Logger();

	AreaMap(Vector dimensions, ObstacleMap obstacleMap) {
		this.dimensions = dimensions;
		this.obstacleMap = obstacleMap;

		createMap();
		log.addToLog("Map Created");
		registerEdges();
		log.addToLog("Map Node edges registered");
	}

	public void printMap() {
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (map.get(i).get(j).isOccupiedByAgent) {
					System.out.print("X");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}

	private void createMap() {
		Node node;
		map = new ArrayList<ArrayList<Node>>();
		for (int x = 0; x < dimensions.getX(); x++) {
			map.add(new ArrayList<Node>());
			for (int y = 0; y < dimensions.getY(); y++) {
				node = new Node(x, y);

				if (obstacleMap.getValueAtPoint(x, y) == ObstacleMap.getObstacleValue()) {
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

	public ArrayList<ArrayList<Node>> getNodes() {
		return map;
	}

	public void setObstacle(int x, int y, boolean isObstacle) {
		map.get(x).get(y).setObstacle(isObstacle);
	}

	public Node getNodeByCoordinate(int x, int y) {
		return map.get(x).get(y);
	}

	public Node getNode(Vector vector) {
		return map.get(vector.getX()).get(vector.getY());
	}

	public void setStartLocation(Vector start) {
		map.get(startLocation.getX()).get(startLocation.getY()).setStart(false);
		map.get(start.getX()).get(start.getY()).setStart(true);
		startLocation = start;
	}

	public void setGoalLocation(Vector goal) {
		map.get(goalLocation.getX()).get(goalLocation.getY()).setGoal(false);
		map.get(goal.getX()).get(goal.getY()).setGoal(true);
		goalLocation = goal;
	}

	public Node getStartNode() {
		return map.get(startLocation.getX()).get(startLocation.getY());
	}

	public Node getGoalLocation() {
		return map.get(goalLocation.getX()).get(goalLocation.getY());
	}

	/**
	 * EDITED BY MARC.ENGELMANN ON 01-12-2014 seemed to be very restrictive, as
	 * only usable for neighboring nodes - added support for distance
	 * calculations independent of location. Original functionality is not
	 * affected.
	 */
	public float getDistanceBetween(Node node1, Node node2) {
		float calc = (float) Math.sqrt((node2.getX() - node1.getX()) ^ 2
				+ (node2.getY() - node1.getY()) ^ 2);
		return calc;
	}

	public Vector getDimensions() {
		return dimensions;
	}

	public void clear() {
		startLocation.set(0, 0);
		goalLocation.set(0, 0);
		createMap();
		registerEdges();
	}
}
