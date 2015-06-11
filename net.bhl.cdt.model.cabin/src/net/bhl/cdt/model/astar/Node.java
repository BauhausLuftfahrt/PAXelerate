/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;

/**
 * This class represents a node object which has several properties important
 * for the path finding algorithm.
 * 
 * @author marc.engelmann
 *
 */
public class Node implements Comparable<Node> {
	private Node north;
	private Node northEast;
	private Node east;
	private Node southEast;
	private Node south;
	private Node southWest;
	private Node west;
	private Node northWest;
	private ArrayList<Node> neighborList;
	private int distanceFromStart;
	private int costFromStart;
	private Node previousNode;
	private Vector position = new Vector2D(0, 0);
	private int cost;
	private Property property;

	private Passenger linkedPassenger;

	private ArrayList<NodeProperty> startList = new ArrayList<NodeProperty>();

	public ArrayList<NodeProperty> getStartList() {
		return startList;
	}

	public void setStartList(ArrayList<NodeProperty> startList) {
		this.startList = startList;
	}

	/* This declares the type of the node */
	public enum Property {
		OBSTACLE, AGENT, DEFAULT, START, GOAL
	}

	/**
	 * this method constructs the Node.
	 * 
	 * @param vector
	 *            is the position vector
	 */
	public Node(Vector vector) {
		neighborList = new ArrayList<Node>();
		position = vector;
		this.distanceFromStart = Integer.MAX_VALUE;
		this.costFromStart = Integer.MAX_VALUE;
		property = Property.DEFAULT;
		linkedPassenger = CabinFactory.eINSTANCE.createPassenger();
		linkedPassenger.setId(Integer.MAX_VALUE);
	}

	/**
	 * This method returns the cost of the node.
	 * 
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	public Property getProperty() {
		return property;
	}

	public Passenger getPassenger() {
		return linkedPassenger;
	}

	public synchronized void setProperty(Property property, Passenger agentID) {
		this.property = property;
		this.linkedPassenger = agentID;
	}

	public synchronized void removeItemById(int id) {
		NodeProperty theCulprit = null;
		for (NodeProperty property : startList) {
			if (property.getAgentID() == id) {
				theCulprit = property;
			}
		}

		startList.remove(theCulprit);
	}

	/**
	 * This method sets the cost of the node.
	 * 
	 * @param cost
	 *            the cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getTypeForPrinting() {
		switch (property) {
		case OBSTACLE:
			return "X";
		case AGENT:
			return "O";
		case DEFAULT:
			return null;
		case GOAL:
			return "G";
		case START:
			return "S";
		default:
			return "?";
		}
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param north
	 *            is the node
	 */
	public void setNorth(Node north) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.north)) {
			neighborList.remove(this.north);
		}
		neighborList.add(north);

		// set the new Node
		this.north = north;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param northEast
	 *            is the node
	 */
	public void setNorthEast(Node northEast) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.northEast)) {
			neighborList.remove(this.northEast);
		}
		neighborList.add(northEast);

		// set the new Node
		this.northEast = northEast;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param east
	 *            is the node
	 */
	public void setEast(Node east) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.east)) {
			neighborList.remove(this.east);
		}
		neighborList.add(east);

		// set the new Node
		this.east = east;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param southEast
	 *            is the node
	 */
	public void setSouthEast(Node southEast) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.southEast)) {
			neighborList.remove(this.southEast);
		}
		neighborList.add(southEast);

		// set the new Node
		this.southEast = southEast;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param south
	 *            is the node
	 */
	public void setSouth(Node south) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.south)) {
			neighborList.remove(this.south);
		}
		neighborList.add(south);

		// set the new Node
		this.south = south;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param southWest
	 *            is the node
	 */
	public void setSouthWest(Node southWest) {
		if (neighborList.contains(this.southWest)) {
			neighborList.remove(this.southWest);
		}
		neighborList.add(southWest);
		this.southWest = southWest;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param west
	 *            is the node
	 */
	public void setWest(Node west) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.west)) {
			neighborList.remove(this.west);
		}
		neighborList.add(west);

		// set the new Node
		this.west = west;
	}

	/**
	 * This method sets the corresponding node.
	 * 
	 * @param northWest
	 *            is the node.
	 */
	public void setNorthWest(Node northWest) {
		// replace the old Node with the new one in the neighborList
		if (neighborList.contains(this.northWest)) {
			neighborList.remove(this.northWest);
		}
		neighborList.add(northWest);

		// set the new Node
		this.northWest = northWest;
	}

	/**
	 * This method returns the list of neighbors.
	 * 
	 * @return the list
	 */
	public ArrayList<Node> getNeighborList() {

		return neighborList;
	}

	/**
	 * This method returns the distance from start.
	 * 
	 * @return the distance from start
	 */
	public float getDistanceFromStart() {
		return distanceFromStart;
	}

	/**
	 * This method sets the distance to the start.
	 * 
	 * @param f
	 *            the distance
	 */
	public void setDistanceFromStart(int f) {
		this.distanceFromStart = f;
	}

	/**
	 * This method returns the previous node.
	 * 
	 * @return the node
	 */
	public synchronized Node getPreviousNode() {
		return previousNode;
	}

	/**
	 * This method sets the previous node.
	 * 
	 * @param previousNode
	 *            the previous node
	 */
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	/**
	 * This method returns the position of the node.
	 * 
	 * @return the position
	 */
	public Vector getPosition() {
		return position;
	}

	/**
	 * This method returns the cost from the start.
	 * 
	 * @param costFromStart
	 *            is the cost from the start
	 */
	public void setCostFromStart(int costFromStart) {
		this.costFromStart = costFromStart;
	}

	/**
	 * This method checks for equality with another node.
	 * 
	 * @param node
	 *            the other node
	 * @return returns yes or no
	 */
	public boolean equalsOtherNode(Node node) {
		return (node.getPosition().getX() == position.getX())
				&& (node.getPosition().getY() == position.getY());
	}

	/**
	 * This method compares two nodes.
	 * 
	 * @param otherNode
	 *            the other node
	 * @return returns the better node value
	 */
	public synchronized int compareTo(Node otherNode) {
		int better = -1;
		int equal = 0;
		int worse = 1;
		if (costFromStart < otherNode.costFromStart) {
			return better;
		} else if (costFromStart > otherNode.costFromStart) {
			return worse;
		} else {
			return equal;
		}
	}
}