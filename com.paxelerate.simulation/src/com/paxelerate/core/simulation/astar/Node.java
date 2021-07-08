/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.model.agent.Passenger;

import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * This class represents a node object which has several properties important
 * for the path finding algorithm and speed calculation.
 *
 *
 * @author Marc.Engelmann
 * @since 11.05.2020
 *
 */
public class Node {

	public enum Property {
		OBJECT, FREE, FUSELAGE
	}

	public enum Layer {
		ASTAR, BOTTOM, MIDDLE, TOP, CEILING
	}

	private List<Node> neighbors = new ArrayList<>();
	private Node previousNode = null;
	private final IntVector position;

	private Map<Layer, Integer> gradients = new HashMap<>();
	private Map<Layer, Property> properties = new HashMap<>();

	public ConcurrentHashMap<Agent, Integer> influencingPassengers = new ConcurrentHashMap<>();
	private final ConcurrentHashMap<Agent, Integer> contactTracingMap = new ConcurrentHashMap<>();

	private double standardCeilingHeight = 2.235; // A320 cabin interior height
	private double ceilingHeight = standardCeilingHeight;

	private Passenger currentPassenger = null;

	/**
	 * this method constructs the Node.
	 *
	 * @param vector is the position vector
	 */
	public Node(int x, int y) {
		position = new IntVector(x, y);

		// Initialize maps
		for (Layer layer : Layer.values()) {
			gradients.put(layer, 0);
			properties.put(layer, Property.FREE);
		}
	}

	/**
	 * This method returns the list of neighbors.
	 *
	 * @return the list
	 */
	public List<Node> getNeighbors() {
		return neighbors;
	}

	/**
	 *
	 * @return
	 */
	public Passenger getPassenger() {
		return currentPassenger;
	}

	/**
	 * This method returns the position of the node.
	 *
	 * @return the position
	 */
	public IntVector getPosition() {
		return position;
	}

	/**
	 * This method returns the previous node.
	 *
	 * @return the node
	 */
	public Node getPreviousNode() {
		return previousNode;
	}

	/**
	 * @param layer
	 * @return
	 */
	public Property getProperty(Layer layer) {
		return properties.get(layer);
	}

	/**
	 * @param layer
	 * @return
	 */
	public int getObstacleGradientValue(Layer layer) {
		return gradients.get(layer);
	}

	/**
	 * Sets property for Astar or in specific layer
	 *
	 * @param prop
	 * @param layer
	 */
	public void setProperty(Property prop, Layer layer) {
		properties.put(layer, prop);
	}

	/**
	 * Sets the ObstacleGradientValue for Astar or in a specific layer.
	 *
	 * @param value
	 * @param layer
	 */
	public void setObstacleGradientValue(int value, Layer layer) {
		gradients.put(layer, value);
	}

	/**
	 * Sets the property with the passenger.
	 *
	 * @param property
	 * @param agentID
	 */
	public void setPassenger(Passenger passenger) {
		currentPassenger = passenger;
	}

	/**
	 * This method sets the previous node.
	 *
	 * @param previousNode the previous node
	 */
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	/**
	 * @return
	 */
	public double getCeilingHeight() {
		return ceilingHeight;
	}

	/**
	 * @param newHeight
	 */
	public void setCeilingHeight(double newHeight) {
		ceilingHeight = newHeight;
	}

	/**
	 * @return
	 */
	public double getStandardCeilingHeight() {
		return standardCeilingHeight;
	}

	/**
	 * @param standardCeilingHeight
	 */
	public void setStandardCeilingHeight(double standardCeilingHeight) {
		this.standardCeilingHeight = standardCeilingHeight;
	}

	@Override
	public String toString() {
		String content = "Node " + getPosition().toString() + "\n{\n";
		content += "\t Property = " + properties.get(Layer.ASTAR) + "\n";
		content += "\t Gradient Value = " + gradients.get(Layer.ASTAR) + "\n}\n";
		return content;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Node) {
			return ((Node) arg0).getPosition() == getPosition();
		}
		return super.equals(arg0);
	}

	public ConcurrentHashMap<Agent, Integer> getContactTracingMap() {
		return contactTracingMap;
	}
}