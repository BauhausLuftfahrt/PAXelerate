/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.astar;

import java.util.ArrayList;

import com.paxelerate.model.agent.Agent;
import com.paxelerate.model.astar.Node.Property;
import com.paxelerate.util.Func;

/**
 * This class is the A* algorithm.
 * 
 * @author marc.engelmann
 *
 */
public class Core {
	private AreaMap map;
	private CostMap costmap;
	private Path bestPath;
	private ArrayList<Node> closedList;
	private SortedNodeList openList;
	private Agent agent;

	/**
	 * This method constructs the Core.
	 * 
	 * @param map
	 *            is the AreaMap that is fed into the algorithm
	 */
	public Core(AreaMap map, CostMap costmap, Agent agent) {
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
		map.getNode(agent.getGoal()).setProperty(Property.GOAL,
				agent.getPassenger());
		map.getNode(agent.getStart()).setProperty(Property.START,
				agent.getPassenger());

		/* reset the properties of the start node */
		map.getNode(agent.getStart()).setDistanceFromStart(0);
		map.getNode(agent.getStart()).setCostFromStart(0);

		/* reset the lists */
		closedList.clear();
		openList.clear();
		openList.add(map.getNode(agent.getStart()));

		/* while we haven't reached the goal yet */
		while (openList.size() != 0) {
			// System.out.println(map.getNode(agent.getStart()).getProperty()
			// .toString());

			/*
			 * get the first Node from non-searched Node list, sorted by lowest
			 * distance from our goal as guessed by our heuristic
			 */
			Node current = openList.getFirst();

			/*
			 * check if our current Node location is the goal Node. If it is, we
			 * are done.
			 */
			if (Func.vectorsAreEqual(current.getPosition(), agent.getGoal())) {

				/* the start node does never have a previous node! */
				if (map.getNode(agent.getStart()) != null) {
					map.getNode(agent.getStart()).setPreviousNode(null);
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
					if (map.getNode(agent.getStart()) == null) {
						// System.out.println("start ist null");
					}

					int neighborDistanceFromStart = (int) map
							.getDistanceBetween(map.getNode(agent.getStart()),
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
	private synchronized Path reconstructPath(Node node) {

		Path path = new Path();
		try {

			while (node.getPreviousNode() != null && node != null) {

				if (node != null) {
					path.prependWayPoint(node);
				}
				if (node.getPreviousNode() != null) {
					node = node.getPreviousNode();
				}

			}
		} catch (NullPointerException e) {
			System.out
					.println("###### !NullPointerException ERROR! ###### !Core - reconstructPath()! ######");
			e.printStackTrace();
		}
		return path;
	}
}