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
 * 
 * @author marc.engelmann
 *
 */
public class AStar {
	private AreaMap areamap;
	private CostMap costmap;
	private Logger logger;

	/**
	 * closedList The list of Nodes not searched yet, sorted by their distance
	 * to the goal as guessed by our heuristic.
	 */
	private ArrayList<Node> closedList;
	private SortedNodeList openList;
	private Path shortestPath;
	private Vector dimensions = new Vector();

	/**
	 * 
	 * @param map
	 */
	AStar(AreaMap map) {
		areamap = map;
		closedList = new ArrayList<Node>();
		openList = new SortedNodeList();
	}

	/**
	 * 
	 * @param startX
	 * @param startY
	 * @param goalX
	 * @param goalY
	 * @return
	 */
	public Path calcShortestPath(Vector start, Vector goal) {

		// mark start and goal node
		areamap.setStartLocation(start);
		areamap.setGoalLocation(goal);

		dimensions.setVectorFromCoordinates(areamap.getMapWidth(),
				areamap.getMapHeight());

		// Check if the goal node is blocked (if it is, it is impossible to find
		// a path there)
		if (areamap.getNode(goal).isObstacle()) {
			return null;
		}

		areamap.getStartNode().setDistanceFromStart(0);
		areamap.getStartNode().setCostFromStart(0);
		areamap.getStartNode().setCompareFactor(0);
		closedList.clear();
		openList.clear();
		openList.add(areamap.getStartNode());

		costmap = new CostMap(dimensions, start, goal, areamap);
		//costmap.printMapWithoutValues();
		int i = 0;
		// while we haven't reached the goal yet
		while (openList.size() != 0) {
			System.out.println("iteration: "+i);
			System.out.println("openlist size: " + openList.size());
			System.out.println("closedlist size: " + closedList.size());
			

			// get the first Node from non-searched Node list, sorted by lowest
			// distance from our goal as guessed by our heuristic
			Node current = openList.getFirst();

			// check if our current Node location is the goal Node. If it is, we
			// are done.
			if (current.getX() == areamap.getGoalLocationX()
					&& current.getY() == areamap.getGoalLocationY()) {
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
					float neighborDistanceFromStart = areamap
							.getDistanceBetween(areamap.getStartNode(), current)
							+ areamap.getDistanceBetween(current, neighbor);
					// (current.getDistanceFromStart() +
					// map.getDistanceBetween(current, neighbor));
					float currentDistanceFromStart = areamap
							.getDistanceBetween(areamap.getStartNode(), current);
					int neighborCostFromStart = costmap.getCostForCoordinates(
							neighbor.getX(), neighbor.getY());
					int currentCostFromStart = costmap.getCostForCoordinates(
							current.getX(), current.getY());

					// add neighbor to the open list if it is not there
					if (!openList.contains(neighbor)) {
						openList.add(neighbor);
						neighborIsBetter = true;

						// if neighbor is closer to start it could also be
						// better
						// if neighborSumofCostsInCostChart < currentCosts -->
						// neighborIsBetter = true, else neighborIsBetter =
						// false
					}

					else if ((neighborCostFromStart < currentCostFromStart)
							&& (neighborDistanceFromStart < currentDistanceFromStart)) {
						neighborIsBetter = true;
					} else if (neighborCostFromStart < currentCostFromStart) {
						neighborIsBetter = true;
					} else if (neighborDistanceFromStart < currentDistanceFromStart) {
						neighborIsBetter = true;
					} else {
						neighborIsBetter = false;
					}

					// set neighbors parameters if it is better
					if (neighborIsBetter) {
						neighbor.setPreviousNode(current);
						neighbor.setCostFromStart(neighborCostFromStart);
						neighbor.setDistanceFromStart(neighborDistanceFromStart);
						neighbor.setCompareFactor((neighborCostFromStart));// +0.001*neighborDistanceFromStart));
						// neighbor.setHeuristicDistanceFromGoal(heuristic.getEstimatedDistanceToGoal(neighbor.getX(),
						// neighbor.getY(), map.getGoalLocationX(),
						// map.getGoalLocationY()));
					}
				}

			}
			i++;
		}
		return null;
	}

	private Path reconstructPath(Node node) {
		System.out.println("Reconstructing path ...");
		Path path = new Path();
		while (!(node.getPreviousNode() == null)) {
			path.prependWayPoint(node);
			node = node.getPreviousNode();
		}
		this.setShortestPath(path);
		return path;
	}

	/**
	 * 
	 * @return
	 */
	public Path getShortestPath() {
		return shortestPath;
	}

	/**
	 * 
	 * @param shortestPath
	 */
	public void setShortestPath(Path shortestPath) {
		this.shortestPath = shortestPath;
	}

	/**
	 * 
	 * @author marc.engelmann
	 *
	 */
	private class SortedNodeList {

		private ArrayList<Node> list = new ArrayList<Node>();

		public Node getFirst() {
			return list.get(0);
		}

		public void clear() {
			list.clear();
		}

		public void add(Node node) {
			list.add(node);
			Collections.sort(list);
		}

		public void remove(Node n) {
			list.remove(n);
		}

		public int size() {
			return list.size();
		}

		public boolean contains(Node n) {
			return list.contains(n);
		}
	}

}
