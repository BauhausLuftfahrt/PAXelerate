/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.model.astar;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AreamapHandler {

	private Areamap areamap;

	public static final int MAX_VALUE = 100000, BASIC_VALUE = 3,
			OBSTACLE_RANGE_IN_CM = 20, POTENTIAL_AROUND_OBSTACLE_MAXIMUM = 100,
			HOLE_VALUE = 1; // DO NEVER SET THIS TO ZERO!

	/**
	 * This is the area map constructor.
	 * 
	 * @param dimensions
	 *            the dimensions of the map
	 * @param obstacleMap
	 *            the obstacle map
	 */
	public AreamapHandler(Vector dimensions, Cabin cabin) {

		/* initialize an area map */
		areamap = new Areamap(dimensions);

		/* apply obstacle values to the area map */
		areamap = new ObstacleGenerator(areamap, cabin).returnMap();

		new ObstacleGenerator(areamap, cabin).output();

		/* define the neighboring nodes of each node */
		defineNeighboringNodes();
	}

	/**
	 * Define the neighbors of each node within the area map.
	 */
	private void defineNeighboringNodes() {

		/* get the dimensions of the map */
		Vector dimensions = areamap.getDimensions();

		/* Loop through the area map */
		for (Node node : areamap.getNodes()) {

			/* define the position of the nodes */
			int x = node.getPosition().getX();
			int y = node.getPosition().getY();

			/* define the neighboring nodes */

			/* the north node */
			if (!(y == 0)) {
				node.setNorth(areamap.get(x, y - 1));
			}

			/* the north east node */
			if (!(y == 0) && !(x == dimensions.getX())) {
				node.setNorthEast(areamap.get(x + 1, y - 1));
			}

			/* the east node */
			if (!(x == dimensions.getX())) {
				node.setEast(areamap.get(x + 1, y));
			}

			/* the south east node */
			if (!(x == dimensions.getX()) && !(y == dimensions.getY())) {
				node.setSouthEast(areamap.get(x + 1, y + 1));
			}

			/* the south node */
			if (!(y == dimensions.getY())) {
				node.setSouth(areamap.get(x, y + 1));
			}

			/* the south west node */
			if (!(x == 0) && !(y == dimensions.getY())) {
				node.setSouthWest(areamap.get(x - 1, y + 1));
			}

			/* the west node */
			if (!(x == 0)) {
				node.setWest(areamap.get(x - 1, y));
			}

			/* the north west node */
			if (!(x == 0) && !(y == 0)) {
				node.setNorthWest(areamap.get(x - 1, y - 1));
			}
		}
	}

	/**
	 * This method returns the area map.
	 * 
	 * @return the area map
	 */
	public Areamap getAreamap() {
		return areamap;
	}

	/**
	 * This map sets the start location of an agent.
	 * 
	 * @param position
	 * @param agent
	 */
	public synchronized void setStartLocation(Vector position, Agent agent) {

		// TODO: improve this! Why is there a list of properties involved?
		if (position == null) {
			areamap.get(agent.getStart()).getStartList().add(new NodeProperty(
					agent.getPassenger().getId(), Property.START));
		} else {
			Node oldStartLocation = areamap.get(agent.getStart());
			oldStartLocation.removeItemById(agent.getPassenger().getId());
			areamap.get(position).getStartList().add(new NodeProperty(
					agent.getPassenger().getId(), Property.START));
		}
	}

	/**
	 * This method gathers all obstacle values into one array.
	 * 
	 * @return the populated integer array
	 */
	public int[][] getObstaclemap() {

		/* create new 2D integer array */
		int[][] integerArray = new int[areamap.getDimensions().getX()][areamap
				.getDimensions().getY()];

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/* store every obstacle value in the array */
			integerArray[node.getPosition().getX()][node.getPosition()
					.getY()] = node.getObstacleValue();
		}

		/* return the populated integer array */
		return integerArray;

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

		/* define the first element of the square root function */
		double first = Math.pow(
				(node2.getPosition().getX() - node1.getPosition().getX()), 2);

		/* define the second element of the square root function */
		double second = Math.pow(
				(node2.getPosition().getY() - node1.getPosition().getY()), 2);

		/* calculate the square root */
		return Math.sqrt(first + second);
	}

	/**
	 * This method clears the area map.
	 */
	public void clear() {

		/* recreate the area map */
		areamap = new Areamap(areamap.getDimensions());

		/* redefine all neighboring nodes */
		defineNeighboringNodes();
	}
}