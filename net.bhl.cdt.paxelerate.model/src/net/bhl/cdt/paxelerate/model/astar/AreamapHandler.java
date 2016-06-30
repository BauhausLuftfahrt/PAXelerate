/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.astar.ObstacleGenerator.GradientOption;
import net.bhl.cdt.paxelerate.model.astar.node.Node;
import net.bhl.cdt.paxelerate.model.astar.node.NodeProperty;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Direction;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;
import net.bhl.cdt.paxelerate.util.math.MathHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * The Class AreamapHandler.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
public class AreamapHandler {

	/** The areamap. */
	private Areamap areamap;

	/** The Constant NARROWING_OF_DOOR_PATH_IN_PIXELS. */
	public static final int DEFAULT_VALUE = 3, OBSTACLE_RANGE_IN_CM = 20,
			HOLE_VALUE = 1, NARROWING_OF_DOOR_PATH_IN_PIXELS = 2,
			GRADIENT_LOWER_BOUND = 6, GRADIENT_UPPER_BOUND = 10,
			GRADIENT_WIDTH = 2, NARROWING_OF_AISLE_PATH_IN_PIXELS = 2,
			AISLE_OVERLAP_FRONT_AND_REAR = 10;

	/**
	 * This is the area map constructor.
	 *
	 * @param dimensions
	 *            the dimensions of the map
	 * @param cabin
	 *            the cabin
	 */
	public AreamapHandler(Vector dimensions, Cabin cabin) {

		/* initialize an area map */
		areamap = new Areamap(dimensions);

		/* define the neighboring nodes of each node */
		defineNeighboringNodes();

		/* apply obstacle values to the area map */
		areamap = new ObstacleGenerator(areamap, cabin, GradientOption.LINEAR)
				.returnMap();
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

			/* clear any previous defined neighbors */
			node.getNeighborList().clear();

			/* define the neighboring nodes */

			/* the north node */
			if (!(y == 0)) {
				node.addNeighbor(areamap.get(x, y - 1), Direction.NORTH);
			}

			/* the north east node */
			if (!(y == 0) && !(x == dimensions.getX())) {
				node.addNeighbor(areamap.get(x + 1, y - 1),
						Direction.NORTH_EAST);
			}

			/* the east node */
			if (!(x == dimensions.getX())) {
				node.addNeighbor(areamap.get(x + 1, y), Direction.EAST);
			}

			/* the south east node */
			if (!(x == dimensions.getX()) && !(y == dimensions.getY())) {
				node.addNeighbor(areamap.get(x + 1, y + 1),
						Direction.SOUTH_EAST);
			}

			/* the south node */
			if (!(y == dimensions.getY())) {
				node.addNeighbor(areamap.get(x, y + 1), Direction.SOUTH);
			}

			/* the south west node */
			if (!(x == 0) && !(y == dimensions.getY())) {
				node.addNeighbor(areamap.get(x - 1, y + 1),
						Direction.SOUTH_WEST);
			}

			/* the west node */
			if (!(x == 0)) {
				node.addNeighbor(areamap.get(x - 1, y), Direction.WEST);
			}

			/* the north west node */
			if (!(x == 0) && !(y == 0)) {
				node.addNeighbor(areamap.get(x - 1, y - 1),
						Direction.NORTH_WEST);
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
	 * This function calculates the minimum distance to an obstacle.
	 *
	 * @param node            the node which's distance is calculated
	 * @param obstacles the obstacles
	 * @return the minimum distance
	 */
	public static double minimumDistanceToObstacle(Node node,
			ArrayList<Node> obstacles) {

		/* set the minimum as high as possible */
		double minimum = Integer.MAX_VALUE;

		/* loop through all obstacles */
		for (Node obstacle : obstacles) {

			/* calculate the distance using z = root(x² + y²) */
			double distance = MathHelper.distanceBetween(node.getPosition(),
					obstacle.getPosition());

			/* check if there is a distance smaller than the current one */
			if (distance < minimum) {

				/* if so, define it as the new smallest distance */
				minimum = distance;
			}
		}

		/* return the distance */
		return minimum;
	}

	/**
	 * This map sets the start location of an agent.
	 *
	 * @param position
	 *            the position
	 * @param agent
	 *            the agent
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
	 * This method clears the area map.
	 */
	public void clear() {

		/* recreate the area map */
		areamap = new Areamap(areamap.getDimensions());

		/* redefine all neighboring nodes */
		defineNeighboringNodes();
	}
}