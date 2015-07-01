/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.util.Logger;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AreaMap {

	private Vector dimensions = new Vector2D(0, 0);
	private ArrayList<ArrayList<Node>> map;
	private ArrayList<Node> nodeList = new ArrayList<Node>();

	public ArrayList<Node> getNodeList() {
		return nodeList;
	}

	private ObstacleMap obstacleMap;
	private Logger log = new Logger();

	/**
	 * This is the area map constructor.
	 * 
	 * @param dimensions
	 *            the dimensions of the map
	 * @param obstacleMap
	 *            the obstacle map
	 */
	public AreaMap(Vector dimensions, ObstacleMap obstacleMap) {
		this.dimensions = dimensions;
		this.obstacleMap = obstacleMap;

		createMap();
		log.addToLog("Map Created");
		registerEdges();
		log.addToLog("Map Node edges registered");
	}

	public AreaMap(AreaMap copy) {
		this.map = copy.map;
		this.dimensions = copy.dimensions;
		this.obstacleMap = copy.obstacleMap;
		this.nodeList = copy.nodeList;
	}

	public ObstacleMap getObstacleMap() {
		return obstacleMap;
	}

	/**
	 * This method prints the map to the console.
	 */
	public void printMap() {
		System.out.println("This is the area map:");
		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				if (map.get(i).get(j).getProperty() == Property.AGENT) {
					System.out.print("O");
				} else if ((map.get(i).get(j).getProperty() == Property.OBSTACLE)) {
					System.out.print("X");
				} else if ((map.get(i).get(j).getProperty() == Property.START)) {
					System.out.print("X");
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
	 * This method creates the area map.
	 */
	private void createMap() {
		Node node;
		map = new ArrayList<ArrayList<Node>>();
		for (int x = 0; x < dimensions.getX(); x++) {
			map.add(new ArrayList<Node>());
			for (int y = 0; y < dimensions.getY(); y++) {
				node = new Node(new Vector2D(x, y));

				if (obstacleMap.getValueAtPoint(x, y) == ObstacleMap
						.getObstacleValue()) {
					node.setProperty(Property.OBSTACLE, null);
				} else {
					node.setCost(obstacleMap.getValueAtPoint(x, y));
				}
				map.get(x).add(node);

				nodeList.add(node);

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
	 * 
	 * @return the area map
	 */
	public ArrayList<ArrayList<Node>> getNodes() {
		return map;
	}

	/**
	 * This method returns a node at a specific point.
	 * 
	 * @param x
	 *            the x value
	 * @param y
	 *            the y value
	 * @return the node
	 */
	public Node getNodeByCoordinate(int x, int y) {
		try {
			return map.get(x).get(y);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		} catch (NullPointerException e) {
			return null;
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	/**
	 * This method returns a specific node at a vector point.
	 * 
	 * @param vector
	 *            the vector describing the position of the node
	 * @return the node
	 */
	public Node getNode(Vector vector) {
		return map.get(vector.getX()).get(vector.getY());
	}

	/**
	 * Caution! This method only returns the first node with the property. Only
	 * use this method which properties that are assigned once!
	 *
	 * @param property
	 *            is the property
	 * @return the node with the correct property
	 */
	public Node getNodeByProperty(Property property, Agent agent) {

		for (Node node : nodeList) {

			if (node.getProperty().equals(property)
					&& node.getPassenger().getId() == agent.getPassenger()
							.getId()) {
				return node;
			}
		}
		if (SimulationHandler.DEVELOPER_MODE) {
			System.out.println("no matching node found for property '"
					+ property.toString() + "'.");
		}
		// System.out.println("getNodeByProperty() returns null!");
		return null;
	}

	public synchronized void setStartLocation(Vector position, Agent agent) {

		if (position == null) {
			getNode(agent.getStart()).getStartList().add(
					new NodeProperty(agent.getPassenger().getId(),
							Property.START));
		} else {
			Node oldStartLocation = this.getNode(agent.getStart());
			oldStartLocation.removeItemById(agent.getPassenger().getId());
			getNode(position).getStartList().add(
					new NodeProperty(agent.getPassenger().getId(),
							Property.START));
		}
		// if (oldStartLocation != null &&
	}

	/**
	 * This method calculates the distance between two nodes.
	 * 
	 * @param node1
	 *            the first node
	 * @param node2
	 *            the second node
	 * @return the distance between the nodes
	 */
	public double getDistanceBetween(Node node1, Node node2) {
		try {
			int exponent = 2;
			double first = Math.pow((node2.getPosition().getX() - node1
					.getPosition().getX()), exponent);
			double second = Math.pow((node2.getPosition().getY() - node1
					.getPosition().getY()), exponent);
			return Math.sqrt(first + second);
		} catch (NullPointerException e) {
			// System.out
			// .println("###### !NullPointerException ERROR! ###### !AreaMap - getDistanceBetween()! ######");
			return Double.MAX_VALUE;
		}
	}

	/**
	 * This method returns the dimensions of the map.
	 * 
	 * @return the dimensions stored in a vector
	 */
	public Vector getDimensions() {
		return dimensions;
	}

	/**
	 * This method clears the area map.
	 */
	public void clear() {
		createMap();
		registerEdges();
	}
}