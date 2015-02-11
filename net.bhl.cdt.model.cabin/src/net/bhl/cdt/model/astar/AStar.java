/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

import java.util.ArrayList;
import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.util.FuncLib;

/**
 * This class is the A* algorithm.
 * 
 * @author marc.engelmann
 *
 */
public class AStar {
	private AreaMap map;
	private CostMap costmap;
	private Path bestPath;
	private ArrayList<Node> closedList;
	private SortedNodeList openList;
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
		calculateShortestPath();
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
	private void calculateShortestPath() {

		/* mark start and goal node */
		map.setStartLocation(agent.getStart());
		map.setGoalLocation(agent.getGoal());

		/* reset the properties of the start node */
		map.getNodeByProperty(Property.START).setDistanceFromStart(0);
		map.getNodeByProperty(Property.START).setCostFromStart(0);

		/* reset the lists */
		closedList.clear();
		openList.clear();
		openList.add(map.getNode(agent.getStart()));

		/* while we haven't reached the goal yet */
		while (openList.size() != 0) {

			/*
			 * get the first Node from non-searched Node list, sorted by lowest
			 * distance from our goal as guessed by our heuristic
			 */
			Node current = openList.getFirst();

			/*
			 * check if our current Node location is the goal Node. If it is, we
			 * are done.
			 */
			if (FuncLib.vectorsAreEqual(current.getPosition(), agent.getGoal())) {

				/* the start node does never have a previous node! */
				if (map.getNodeByProperty(Property.START) != null) {
					map.getNodeByProperty(Property.START).setPreviousNode(null);
				}

				/* if there is a path found, reconstruct it */
				if (reconstructPath(current) != null) {
					bestPath = reconstructPath(current);
				}
				return;
			}

			/* move current Node to the closed (already searched) list */
			openList.remove(current);
			closedList.add(current);

			/*
			 * go through all the current Nodes neighbors and calculate if one
			 * should be our next step
			 */
			for (Node neighbor : current.getNeighborList()) {
				boolean neighborIsBetter;

				/*
				 * if we have already searched this Node, don't bother and
				 * continue to the next one
				 */
				if (closedList.contains(neighbor)) {
					continue;
				}

				/* also just continue if the neighbor is an obstacle */
				if (neighbor.getProperty() != Property.OBSTACLE) {

					/* calculate the neighbors distance from start */
					int neighborDistanceFromStart = (int) map
							.getDistanceBetween(
									map.getNodeByProperty(Property.START),
									neighbor);

					/* calculate the neighbors cost from start */
					int neighborCostFromStart = costmap.getCost(neighbor
							.getPosition());

					/* calculate the current cost from start for comparison */
					int currentCostFromStart = costmap.getCost(current
							.getPosition());

					/* add neighbor to the open list if it is not there */
					if (!openList.contains(neighbor)) {
						openList.add(neighbor);
						neighborIsBetter = true;

						/* it is better if the other node is cheaper */
					} else if (neighborCostFromStart < currentCostFromStart) {
						neighborIsBetter = true;
					} else {
						neighborIsBetter = false;
					}

					/*
					 * TODO: check if passenger dimensions allow this specific
					 * node.
					 */

					/* set neighbors parameters if it is better */
					if (neighborIsBetter) {
						neighbor.setPreviousNode(current);
						neighbor.setCostFromStart(neighborCostFromStart);
						neighbor.setDistanceFromStart(neighborDistanceFromStart);
					}
				}
			}
		}
		bestPath = null;
		return;
	}

	/**
	 * This method prints the path to the console.
	 * 
	 * @param path
	 *            the path to be printed
	 */
	public void printPath(Path path) {
		for (Node node : path.getWaypoints()) {
			FuncLib.printVectorToLog(node.getPosition(), "position");
		}
	}

	/**
	 * This method returns the best path.
	 * 
	 * @return the best path
	 */
	public Path getBestPath() {
		return bestPath;
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
		while (node.getPreviousNode() != null) {
			path.prependWayPoint(node);
			node = node.getPreviousNode();
		}
		return path;
	}
}