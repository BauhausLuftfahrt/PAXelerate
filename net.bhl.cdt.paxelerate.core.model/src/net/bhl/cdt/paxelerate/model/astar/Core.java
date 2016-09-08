/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.model.astar.node.Node;
import net.bhl.cdt.paxelerate.model.astar.node.SortedNodeList;
import net.bhl.cdt.paxelerate.util.math.MathHelper;

/**
 * This class is the A* algorithm.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */
public class Core {

	/** The areamap. */
	private Areamap areamap;

	/** The costmap. */
	private Costmap costmap;

	/** The best path. */
	private Path bestPath;

	/** The closed list. */
	private ArrayList<Node> closedList;

	/** The open list. */
	private SortedNodeList openList;

	/** The agent. */
	private Agent agent;

	/**
	 * This method constructs the Core.
	 *
	 * @param maphandler
	 *            the maphandler
	 * @param costmap
	 *            the costmap
	 * @param agent
	 *            the agent
	 */
	public Core(AreamapHandler maphandler, Costmap costmap, Agent agent) {
		
		this.areamap = maphandler.getAreamap();
		this.agent = agent;
		this.costmap = costmap;
		closedList = new ArrayList<Node>();
		openList = new SortedNodeList();

		calculateShortestPath();
	}

	/**
	 * This method calculates the shortest path.
	 *
	 * @return returns the shortest path
	 */
	private void calculateShortestPath() {
		
		
		/* mark start and goal node */
		areamap.get(agent.getGoal()).setProperty(Property.GOAL,
				agent.getPassenger());
		areamap.get(agent.getStart()).setProperty(Property.START,
				agent.getPassenger());

		/* reset the properties of the start node */
		areamap.get(agent.getStart()).setDistanceFromStart(0);
		areamap.get(agent.getStart()).setCostFromStart(0);
		
		/* reset the lists */
		closedList.clear();
		openList.clear();
		openList.add(areamap.get(agent.getStart()));
		
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
			if (current.getPosition().equals(agent.getGoal())) {
						
				/* the start node does never have a previous node! */
				if (areamap.get(agent.getStart()) != null) {
					areamap.get(agent.getStart()).setPreviousNode(null);
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
				boolean neighborIsBetter = false;
				
				/*
				 * if we have already searched this Node, don't bother and
				 * continue to the next one
				 */
				if (closedList.contains(neighbor)) {
					continue;
				}

				/*
				 * if the distance to the closest obstacle is smaller than half
				 * of the diameter of the agent, it will not be able to pass
				 * through
				 */

				// TODO: This is a problem concerning the design: the seats are
				// much closer to each other than the passengers width!

				// DEACTIVATED INTENTIONALLY
				// if (false && neighbor.getDistanceToClosestObstacle() != 0) {
				// if (neighbor.getDistanceToClosestObstacle() <= agent
				// .getPassenger().getWidth()
				// / (double) SimulationHandler.getCabin()
				// .getSimulationSettings().getScale()) {
				//
				// System.out.println(neighbor
				// .getDistanceToClosestObstacle()
				// + " <= "
				// + agent.getPassenger().getDepth()
				// / (double) SimulationHandler.getCabin()
				// .getSimulationSettings()
				// .getScale()
				// + " -> agent does not fit through!");
				// continue;
				// }
				// }

				/* also just continue if the neighbor is an obstacle */
				if (!neighbor.isObstacle()) {
										
					/* calculate the neighbors distance from start */
					double neighborDistanceFromStart = MathHelper
							.distanceBetween(
									areamap.get(agent.getStart()).getPosition(),
									neighbor.getPosition());

					/* calculate the neighbors distance from start */
					double currentDistanceFromStart = MathHelper
							.distanceBetween(
									(areamap.get(agent.getStart())
											.getPosition()),
									current.getPosition());

					/* calculate the neighbors cost */
					int neighborCostFromStart = costmap
							.getCost(neighbor.getPosition());

					/* calculate the current cost from start for comparison */
					int currentCostFromStart = costmap
							.getCost(current.getPosition());
					
					/* add neighbor to the open list if it is not there */
					if (!openList.contains(neighbor)) {
						openList.add(neighbor);
						neighborIsBetter = true;

						/* it is better if the other node is cheaper */
					} else if (neighborCostFromStart < currentCostFromStart) {
						neighborIsBetter = true;

						/*
						 * it is better if the other node is closer if they have
						 * the same cost
						 */
					} else if (neighborCostFromStart == currentCostFromStart) {

						if (neighborDistanceFromStart < currentDistanceFromStart) {
							neighborIsBetter = true;
						}

						/* if no criteria is matched, the node is worse */
					} else {
						neighborIsBetter = false;
					}

					/* set neighbors parameters if it is better */
					if (neighborIsBetter) {
						neighbor.setPreviousNode(current);
						neighbor.setCostFromStart(neighborCostFromStart);
						neighbor.setDistanceFromStart(
								neighborDistanceFromStart);
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
		while (node.getPreviousNode() != null) {
			path.prependWayPoint(node);
			node = node.getPreviousNode();
		}
		return path;
	}
}