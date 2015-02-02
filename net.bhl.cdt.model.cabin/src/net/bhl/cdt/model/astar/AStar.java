/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;
import java.util.Collections;

import net.bhl.cdt.model.cabin.util.FunctionLibrary;
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
	private Agent agent;

	/**
	 * This method constructs the AStar.
	 * 
	 * @param map
	 *            is the AreaMap that is fed into the algorithm
	 */
	public AStar(AreaMap map, CostMap costmap, Agent agent) {
		this.map = map;
		this.agent = agent;
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
	public Path calculateShortestPath() {

		// mark start and goal node
		map.setStartLocation(agent.getStart());
		map.setGoalLocation(agent.getGoal());

		/* If the goal node is blocked, no path is existent */ 
		if (map.getGoalNode().isObstacle()) {
			return null;
		}

		map.getStartNode().setDistanceFromStart(0);
		map.getStartNode().setCostFromStart(0);
		map.getStartNode().setCompareFactor(0);
		closedList.clear();
		openList.clear();
		openList.add(map.getNode(agent.getStart()));
		
		System.out.println("xStart is " +  map.getStartNode().getPosition().getX() + ", yStart is " + map.getStartNode().getPosition().getY());

		// while we haven't reached the goal yet
		while (openList.size() != 0) {

			// get the first Node from non-searched Node list, sorted by lowest
			// distance from our goal as guessed by our heuristic
			Node current = openList.getFirst();
			// check if our current Node location is the goal Node. If it is, we
			// are done.
			if (FunctionLibrary.vectorsAreEqual(current.getPosition(), agent.getGoal())) {
				System.out.println("astar - path found! Current Position and goal are identical.");
				FunctionLibrary.printVectorToLog(map.getStartNode().getPosition(),"start");
				FunctionLibrary.printVectorToLog(map.getGoalNode().getPosition(),"goal");
				printPath(reconstructPath(current));
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
							.getDistanceBetween(map.getStartNode(),
									neighbor);
					int neighborCostFromStart = costmap.getCost(neighbor
							.getPosition());
					int currentCostFromStart = costmap.getCost(current
							.getPosition());

					// add neighbor to the open list if it is not there
					if (!openList.contains(neighbor)) {
						openList.add(neighbor);
						neighborIsBetter = true;
					} else if (neighborCostFromStart < currentCostFromStart) {
						neighborIsBetter = true;
					} else {
						neighborIsBetter = false;
					}

					// TODO: check if passenger dimensions allow this specific
					// node.

					// set neighbors parameters if it is better
					if (neighborIsBetter) {
						neighbor.setPreviousNode(current);
						neighbor.setCostFromStart(neighborCostFromStart);
						neighbor.setDistanceFromStart(neighborDistanceFromStart);
						neighbor.setCompareFactor(neighborCostFromStart);
					}
				}
			}
		}
		return null;
	}
	
	public void printPath(Path path) {
		for(Node node:path.getWaypoints()) {
			FunctionLibrary.printVectorToLog(node.getPosition(),"pos");
		}
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