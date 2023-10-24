/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.astar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.core.simulation.astar.Node.Property;

import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * This class is the A* algorithm.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 * @since 11.05.2020
 *
 */
public interface AStar {

	/**
	 * This method performs the pathfinding. <b>Note that the start node is the
	 * actual goal and the goal is the start! </b>
	 *
	 * @param areamap
	 * @param costmap
	 * @param start
	 * @param goal
	 * @return
	 * @throws NullPointerException
	 */
	static Path search(Node startNode, Costmap costmap, IntVector goal) {

		// Contains all nodes already visited
		List<Node> visited = new ArrayList<>();

		// Contains all nodes to be visited next
		List<Node> next = new ArrayList<>();

		next.add(startNode);

		// while we haven't reached the goal yet
		while (!next.isEmpty()) {

			// get the first Node from non-searched Node list
			Node current = next.get(0);

			// check if our current Node location is the goal Node. If it is, we are done.
			if (current.getPosition().equals(goal)) {

				// the start node does never have a previous node!
				startNode.setPreviousNode(null);

				// Create the path
				return AStar.createPath(current, costmap, startNode);
			}

			// move current Node to the closed (already searched) list
			next.remove(current);
			visited.add(current);

			// Loop through current node's neighbors and check if one should be next step
			for (Node node : current.getNeighbors()) {

				// Check if node was already visited, is not in the open list or is an obstacle
				if (!visited.contains(node) && node.getProperty(Layer.ASTAR) == Property.FREE && !next.contains(node)) {

					next.add(node);

					// Sort all next nodes by cost
					Collections.sort(next, Comparator.comparing(n -> costmap.getCost(n.getPosition())));
					node.setPreviousNode(current);
				}
			}
		}

		return null;
	}

	/**
	 * This method reconstructs the path.
	 *
	 * @param node the specific node
	 * @return the path
	 */
	static Path createPath(Node node, Costmap costmap, Node startNode) {

		// create a new path and link the current cost map
		Path path = new Path(costmap);

		// as long as there is a previous node to the current one, continue
		while (node.getPreviousNode() != null) {

			// add the node to the new path
			path.add(0, node);

			// load the next node
			node = node.getPreviousNode();
		}

		// in the end, add the starting point as well
		path.add(0, startNode);

		// Invert path
		path.invert();

		// return the whole path
		return path;
	}
}