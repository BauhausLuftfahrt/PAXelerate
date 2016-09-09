/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar.node;

import java.util.ArrayList;
import java.util.ListIterator;

import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.enums.Direction;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class represents a node object which has several properties important
 * for the path finding algorithm.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */
public class Node implements Comparable<Node> {

	/** The previous node. */
	private Node north, northEast, east, southEast, south, southWest, west,
			northWest, previousNode;

	/** The distance from start. */
	private double distanceFromStart, distanceToClosestObstacle;

	/** The obstacle value. */
	private int costFromStart, numberOfOccupations = 0, numberOfInterrupts = 0,
			obstacleValue = 0;

	/** The property. */
	private Property property;

	/** The hidden. */
	private boolean hidden = false;

	/** The linked passenger. */
	private Passenger linkedPassenger;

	/** The start list. */
	private ArrayList<NodeProperty> startList = new ArrayList<NodeProperty>();

	/** The position. */
	private Vector position = new Vector2D(0, 0);

	/** The obstacle type. */
	private ObjectOption obstacleType;

	/**
	 * Gets the obstacle type.
	 *
	 * @return the obstacle type
	 */
	public ObjectOption getObstacleType() {
		return obstacleType;
	}

	/**
	 * Sets the obstacle type.
	 *
	 * @param obstacleType
	 *            the new obstacle type
	 */
	public void setObstacleType(ObjectOption obstacleType) {
		this.obstacleType = obstacleType;
	}

	/**
	 * Gets the distance to closest obstacle.
	 *
	 * @return the distance to closest obstacle
	 */
	public double getDistanceToClosestObstacle() {
		return distanceToClosestObstacle;
	}

	/**
	 * Sets the distance to closest obstacle.
	 *
	 * @param distanceToClosestObstacle
	 *            the new distance to closest obstacle
	 */
	public void setDistanceToClosestObstacle(double distanceToClosestObstacle) {
		this.distanceToClosestObstacle = distanceToClosestObstacle;
	}

	/**
	 * Gets the obstacle value.
	 *
	 * @return the obstacle value
	 */
	public int getObstacleValue() {
		return obstacleValue;
	}

	/**
	 * Sets the obstacle value.
	 *
	 * @param obstacleValue
	 *            the new obstacle value
	 */
	public void setObstacleValue(int obstacleValue) {
		this.obstacleValue = obstacleValue;
	}

	/**
	 * Gets the number of interrupts.
	 *
	 * @return the number of interrupts
	 */
	public int getNumberOfInterrupts() {
		return numberOfInterrupts;
	}

	/**
	 * Raise number of interrupts.
	 */
	public void raiseNumberOfInterrupts() {
		this.numberOfInterrupts++;
	}

	/**
	 * Gets the number of occupations.
	 *
	 * @return the number of occupations
	 */
	public int getNumberOfOccupations() {
		return numberOfOccupations;
	}

	/**
	 * Raise number of occupations.
	 */
	public void raiseNumberOfOccupations() {
		this.numberOfOccupations++;
	}

	/**
	 * Gets the start list.
	 *
	 * @return the start list
	 */
	public ArrayList<NodeProperty> getStartList() {
		return startList;
	}

	/**
	 * Checks if is hidden.
	 *
	 * @return true, if is hidden
	 */
	public boolean isHidden() {
		return this.hidden;
	}

	/**
	 * Sets the hidden.
	 */
	public void setHidden() {
		this.hidden = true;
	}

	/**
	 * Sets the start list.
	 *
	 * @param startList
	 *            the new start list
	 */
	public void setStartList(ArrayList<NodeProperty> startList) {
		this.startList = startList;
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
		this.obstacleType = null;
	}

	/**
	 * Gets the property.
	 *
	 * @return the property
	 */
	public synchronized Property getProperty() {
		return property;
	}

	/**
	 * Gets the passenger.
	 *
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return linkedPassenger;
	}

	/**
	 * Sets the property.
	 *
	 * @param property
	 *            the property
	 * @param agentID
	 *            the agent id
	 */
	public synchronized void setProperty(Property property, Passenger agentID) {
		this.property = property;
		this.linkedPassenger = agentID;
	}

	/**
	 * Removes the item by id.
	 *
	 * @param id
	 *            the id
	 */
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
	 * Gets the type for printing.
	 *
	 * @return the type for printing
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
	 * Adds the neighbor.
	 *
	 * @param node
	 *            the node
	 * @param direction
	 *            the direction
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
	 * @param distance
	 *            the new distance from start
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
	 * Checks if is obstacle.
	 *
	 * @return true, if is obstacle
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

	/**
	 * Gets the cost from start.
	 *
	 * @return the cost from start
	 */
	public int getCostFromStart() {
		return costFromStart;
	}

	/**
	 * Sets the cost from start.
	 *
	 * @param cost
	 *            the new cost from start
	 */
	public void setCostFromStart(int cost) throws ArithmeticException {
		costFromStart = cost;
		if (cost < -1) {
			throw new ArithmeticException("Node (" + this.getPosition().getX()
					+ "/" + this.getPosition().getY()
					+ ") cost is smaller than zero and not minus one! -> "
					+ cost);
		}
	}
}