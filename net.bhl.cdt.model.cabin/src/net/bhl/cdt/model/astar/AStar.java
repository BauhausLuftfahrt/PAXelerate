/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;
import java.util.Collections;

import net.bhl.cdt.model.cabin.util.Vector;

/**
 * This class is the A* algorithm.
 * 
 * @author marc.engelmann
 *
 */
public class AStar {
	private AreaMap map;
	private CostMap costmap;

	/**
	 * closedList The list of Nodes not searched yet, sorted by their distance
	 * to the goal as guessed by our heuristic.
	 */
	private ArrayList<Node> closedList;
	private SortedNodeList openList;
	private Path shortestPath;

	/**
	 * This method constructs the AStar.
	 * 
	 * @param map
	 *            is the AreaMap that is fed into the algorithm
	 */
	AStar(AreaMap map, CostMap costmap) {
		this.map = map;
		this.costmap = costmap;
		closedList = new ArrayList<Node>();
		openList = new SortedNodeList();
	}

	/**
	 * This method calculates the shortest path.
	 * 
	 * @param start
	 *            is the start vector
	 * @param goal
	 *            is the goal vector
	 * @return returns the shortest path
	 */
	public Path calcShortestPath(Vector start, Vector goal) {

		// mark start and goal node
		map.setStartLocation(start);
		map.setGoalLocation(goal);

		// Check if the goal node is blocked (if it is, it is impossible to find
		// a path there)
		if (map.getNode(goal).isObstacle()) {
			return null;
		}

		map.getStartNode().setDistanceFromStart(0);
		map.getStartNode().setCostFromStart(0);
		map.getStartNode().setCompareFactor(0);
		closedList.clear();
		openList.clear();
		openList.add(map.getStartNode());

		// while we haven't reached the goal yet
		while (openList.size() != 0) {

			// get the first Node from non-searched Node list, sorted by lowest
			// distance from our goal as guessed by our heuristic
			Node current = openList.getFirst();

			// check if our current Node location is the goal Node. If it is, we
			// are done.
			if (current.getPosition().getX() == map.getGoalLocation()
					.getPosition().getX()
					&& current.getPosition().getY() == map.getGoalLocation()
							.getPosition().getY()) {
				return reconstructPath(current);
			}

			// move current Node to the closed (already searched) list
			openList.remove(current);
			closedList.add(current);

			// go through all the current Nodes neighbors and calculate if one
			// should be our next step
			for (Node neighbor : current.getNeighborList()) {
				boolean neighborIsBetter;

				// if we have already searched this Node, don't bother and
				// continue to the next one
				if (closedList.contains(neighbor)) {
					continue;
				}

				// also just continue if the neighbor is an obstacle
				if (!neighbor.isObstacle()) {

					// calculate how long the path is if we choose this neighbor
					// as the next step in the path
					int neighborDistanceFromStart = (int) map
							.getDistanceBetween(map.getStartNode(), neighbor);
					int currentDistanceFromStart = (int) map
							.getDistanceBetween(map.getStartNode(), current);
					int neighborCostFromStart = costmap.getCostForCoordinates(
							neighbor.getPosition().getX(), neighbor
									.getPosition().getY());
					int currentCostFromStart = costmap.getCostForCoordinates(
							current.getPosition().getX(), current.getPosition()
									.getY());

					// add neighbor to the open list if it is not there
					if (!openList.contains(neighbor)) {
						openList.add(neighbor);
						neighborIsBetter = true;
//					} else if ((neighborCostFromStart < currentCostFromStart)
//							&& (neighborDistanceFromStart < currentDistanceFromStart)) {
//						neighborIsBetter = true;
					} else if (neighborCostFromStart < currentCostFromStart) {
						neighborIsBetter = true;
//					} else if (neighborDistanceFromStart < currentDistanceFromStart) {
//						neighborIsBetter = true;
					} else {
						neighborIsBetter = false;
					}
					
					//TODO: check if passenger dimensions allow this specific node.

					// set neighbors parameters if it is better
					if (neighborIsBetter) {
						neighbor.setPreviousNode(current);
						neighbor.setCostFromStart(neighborCostFromStart);
						neighbor.setDistanceFromStart(neighborDistanceFromStart);
						neighbor.setCompareFactor(neighborCostFromStart);// +0.001*neighborDistanceFromStart));
					}
				}
			}
		}
		return null;
	}

	/**
	 * This method reconstructs the path.
	 * 
	 * @param node
	 *            the specific node
	 * @return the path
	 */
	private Path reconstructPath(Node node) {
		Path path = new Path();
		while (!(node.getPreviousNode() == null)) {
			path.prependWayPoint(node);
			node = node.getPreviousNode();
		}
		this.setShortestPath(path);
		return path;
	}

	/**
	 * This method returns the shortest path.
	 * 
	 * @return the shortest path
	 */
	public Path getShortestPath() {
		return shortestPath;
	}

	/**
	 * This method sets the shortest path.
	 * 
	 * @param shortestPath
	 *            the shortest path
	 */
	public void setShortestPath(Path shortestPath) {
		this.shortestPath = shortestPath;
	}

	/**
	 * This class is a sorted node list.
	 * 
	 * @author marc.engelmann
	 *
	 */
	private class SortedNodeList {

		private ArrayList<Node> list = new ArrayList<Node>();

		/**
		 * This method returns the first list entry.
		 * 
		 * @return the first element
		 */
		public Node getFirst() {
			return list.get(0);
		}

		/**
		 * This method clears the list.
		 */
		public void clear() {
			list.clear();
		}

		/**
		 * This method adds a node to the list.
		 * 
		 * @param node
		 *            the specific node
		 */
		public void add(Node node) {
			list.add(node);
			Collections.sort(list);
		}

		/**
		 * This method removes a specific node from the list.
		 * 
		 * @param n
		 *            the node
		 */
		public void remove(Node n) {
			list.remove(n);
		}

		/**
		 * This method returns the size of the list.
		 * 
		 * @return the size
		 */
		public int size() {
			return list.size();
		}

		/**
		 * This method checks if a specific node is already in the list.
		 * 
		 * @param n
		 *            the node which is checked
		 */
		public boolean contains(Node n) {
			return list.contains(n);
		}
	}

}