/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.ListIterator;

import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class represents a node object which has several properties important
 * for the path finding algorithm.
 * 
 * @author marc.engelmann
 *
 */
public class Node implements Comparable<Node> {

	private Node north, northEast, east, southEast, south, southWest, west,
			northWest, previousNode;
	private double distanceFromStart;
	private int costFromStart, numberOfOccupations = 0, numberOfInterrupts = 0,
			obstacleValue = 0;
	private Property property;
	private boolean hidden = false;
	private Passenger linkedPassenger;
	private ArrayList<NodeProperty> startList = new ArrayList<NodeProperty>();
	private Vector position = new Vector2D(0, 0);
	private ObjectOption obstacleType;

	public ObjectOption getObstacleType() {
		return obstacleType;
	}

	public void setObstacleType(ObjectOption obstacleType) {
		this.obstacleType = obstacleType;
	}

	public int getObstacleValue() {
		return obstacleValue;
	}

	public void setObstacleValue(int obstacleValue) {
		this.obstacleValue = obstacleValue;
	}

	public int getNumberOfInterrupts() {
		return numberOfInterrupts;
	}

	public void raiseNumberOfInterrupts() {
		this.numberOfInterrupts++;
	}

	public int getNumberOfOccupations() {
		return numberOfOccupations;
	}

	public void raiseNumberOfOccupations() {
		this.numberOfOccupations++;
	}

	public ArrayList<NodeProperty> getStartList() {
		return startList;
	}

	public boolean isHidden() {
		return this.hidden;
	}

	public void setHidden() {
		this.hidden = true;
	}

	public void setStartList(ArrayList<NodeProperty> startList) {
		this.startList = startList;
	}

	/**
	 * 
	 * @author marc.engelmann
	 *
	 */
	public enum Property {
		OBSTACLE, AGENT, DEFAULT, START, GOAL
	}

	/**
	 * 
	 * @author marc.engelmann
	 *
	 */
	public enum Direction {
		NORTH, NORTH_EAST, EAST, SOUTH_EAST, SOUTH, SOUTH_WEST, WEST, NORTH_WEST;
	}

	/**
	 * this method constructs the Node.
	 * 
	 * @param vector
	 *            is the position vector
	 */
	public Node(Vector vector) {
		this.position = vector;
		this.distanceFromStart = Integer.MAX_VALUE;
		this.costFromStart = Integer.MAX_VALUE;
		property = Property.DEFAULT;
		linkedPassenger = CabinFactory.eINSTANCE.createPassenger();
		linkedPassenger.setId(Integer.MAX_VALUE);
	}

	public synchronized Property getProperty() {
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
	 * 
	 * @return
	 */
	public String getTypeForPrinting() {
		switch (property) {
		case OBSTACLE:
			return "X";
		case AGENT:
			if (linkedPassenger.getId() == Integer.MAX_VALUE) {
				return "B";
			} else {
				return "O";
			}
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
	 * 
	 * @param node
	 */
	public void addNeighbor(Node node, Direction direction) {

		switch (direction) {
		case NORTH:
			this.north = node;
			break;

		case NORTH_EAST:
			this.northEast = node;
			break;

		case EAST:
			this.east = node;
			break;

		case SOUTH_EAST:
			this.southEast = node;
			break;

		case SOUTH:
			this.south = node;
			break;

		case SOUTH_WEST:
			this.southWest = node;
			break;

		case WEST:
			this.west = node;
			break;

		case NORTH_WEST:
			this.northWest = node;
			break;
		}
	}

	/**
	 * This method returns the list of neighbors.
	 * 
	 * @return the list
	 */
	public ArrayList<Node> getNeighborList() {

		ArrayList<Node> neighbors = new ArrayList<>();

		neighbors.add(north);
		neighbors.add(northEast);
		neighbors.add(east);
		neighbors.add(southEast);
		neighbors.add(south);
		neighbors.add(southWest);
		neighbors.add(west);
		neighbors.add(northWest);

		ListIterator<Node> iterator = neighbors.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next() == null) {
				iterator.remove();
			}
		}

		return neighbors;
	}

	/**
	 * This method returns the distance from start.
	 * 
	 * @return the distance from start
	 */
	public double getDistanceFromStart() {
		return distanceFromStart;
	}

	/**
	 * This method sets the distance to the start.
	 * 
	 * @param f
	 *            the distance
	 */
	public void setDistanceFromStart(double distance) {
		this.distanceFromStart = distance;
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
	 * 
	 * @return
	 */
	public boolean isObstacle() {
		return property == Property.OBSTACLE;
	}

	/**
	 * This method compares two nodes.
	 * 
	 * @param otherNode
	 *            the other node
	 * @return returns the better node value
	 */
	@Override
	public synchronized int compareTo(Node otherNode) {
		int better = -1;
		int equal = 0;
		int worse = 1;

		/* if this node is cheaper, it is better */
		if (costFromStart < otherNode.costFromStart) {
			return better;

			/* if the other node is cheaper, this one is worse */
		} else if (costFromStart > otherNode.costFromStart) {
			return worse;

			/* if they are equally expensive, check the distance */
		} else {

			/* if this node is closer to the start, it is better */
			if (distanceFromStart < otherNode.distanceFromStart) {
				return better;
				/* if the distance is greater, it is worse */
			} else if (distanceFromStart > otherNode.distanceFromStart) {
				return worse;

				/*
				 * else the nodes are equal (concerning the criteria used here)
				 */
			} else {
				return equal;
			}
		}
	}
}