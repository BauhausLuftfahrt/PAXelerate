/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.sim.astar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.paxelerate.core.sim.astar.Node.Layer;
import com.paxelerate.core.sim.astar.Node.Property;
import com.paxelerate.model.agent.Passenger;

import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * This class creates a cost map by flooding the whole map from a specific
 * point. Every element of the map has its own cost value, during flooding they
 * are summed up. So every value of the finished cost map represents the total
 * cost to get there from the initial value. In its current configuration, the
 * cost map is fed with an area map, width, height and the initial starting
 * point.
 *
 * @author Marc.Engelmann
 * @since 11.05.2020
 *
 */
public class Costmap {

	private IntVector size;
	private List<IntVector> calculated = new ArrayList<>();
	private List<IntVector> considerNext = new ArrayList<>();

	Integer[][] cost;

	/**
	 * Create the cost map
	 *
	 * @param start
	 * @param goals
	 * @param map
	 * @param passenger
	 * @param agentRange
	 */
	public Costmap(final IntVector start, List<IntVector> goals, Areamap areamap, Passenger passenger, int agentRange) {

		size = areamap.getDimensions();

		// ---------------------------------------------------------------------
		// Check for errors

		if (goals.isEmpty()) {
			throw new NullPointerException("CostMap: Goal Node List is empty!");
		}

		for (IntVector goal : goals) {

			areamap.get(goal).ifPresentOrElse(node -> {
				while (node.getProperty(Layer.ASTAR) != Property.FREE) {
					goal.setX(goal.getX() - 1);
				}
			}, () -> {
				throw new NullPointerException("CostMap: Goal Node " + goal.toString() + " does not exist!");
			});

		}

		if (!areamap.get(start).isPresent()) {
			throw new NullPointerException("CostMap: Start Node " + start.toString() + " does not exist!");
		}

		if (areamap.get(start).get().getProperty(Layer.ASTAR) != Property.FREE) {
			throw new IllegalArgumentException("CostMap: Start Node " + start.toString() + " is obstacle!");
		}

		cost = new Integer[areamap.getDimensions().getX()][areamap.getDimensions().getY()];

//		areamap.getNodes().forEach(n -> n.getProperty() != Property.FLOOR ? setCost(n.getPosition(), 0)
//				: setCost(n.getPosition(), n.getObstacleGradientValue()));

//		areamap.getNodes().forEach(n -> setCost(n.getPosition(), n.getObstacleGradientValue()));

		for (Node node : areamap.getNodes()) {
			if (node.getProperty(Layer.ASTAR) != Property.FREE) {
				setCost(node.getPosition(), null);
			} else {
				setCost(node.getPosition(), node.getObstacleGradientValue(Layer.ASTAR));
			}
		}

		// ---------------------------------------------------------------------
		// Block unused part of cost map here

		// TODO: FIX this!
//		int margin = 3;
//		double min = goals.stream().mapToDouble(p -> p.getX()).min().orElse(0);
//		double max = goals.stream().mapToDouble(p -> p.getX()).max().orElse(Integer.MAX_VALUE);
//
//		for (Node n : areamap.getNodes()) {
//
//			double x = n.getPosition().getX();
//
//			if (start.getX() < min && (x < start.getX() - margin || x > max + margin)) {
//
//				// Start is in front, goals are all behind it
//				setCost(n.getPosition(), null);
//
//			} else if (start.getX() > min && start.getX() < max && (x < min - margin || x > max + margin)) {
//
//				// start is between goal points
//				setCost(n.getPosition(), null);
//
//			} else if (start.getX() > max && (x < min - margin || x > start.getX() + margin)) {
//
//				// start is behind goals
//				setCost(n.getPosition(), null);
//			}
//		}

		// ---------------------------------------------------------------------
		// Run flooding

		setCost(start, 0);

		calculated.add(start);

//		if (passenger != null) {
//			throw new IllegalArgumentException("NOT IMPLEMENTED!");
////			addAgentMonumentsWithinRange(passenger, agentRange, areamap);
//		}

		// ---------------------------------------------------------------------
		// Flood the map and calculate the cost

		createSurroundingCosts(start);

		while (!goals.isEmpty()) {

			for (IntVector point : selectNext()) {

				createSurroundingCosts(point);

				// Try removing. If list does not contain value, nothing happens
				goals.remove(point);
			}
		}

		for (IntVector point : selectNext()) {
			createSurroundingCosts(point);
		}
	}

	/**
	 * This method takes a cost map and adds a huge cost to the location and the
	 * area around agents. The agent triggering this method is ignored.
	 *
	 * @param agent  the agent
	 * @param radius the radius range
	 */
//	public void addAgentMonumentsWithinRange(Passenger pax, int radius, Areamap map) {
//
//		/* this is the expansion in the x Direction */
//		IntVector xVector = new IntVector(startPoint.getX() - radius, startPoint.getX() + radius);
//
//		/* this is the expansion in the y Direction */
//		IntVector yVector = new IntVector(startPoint.getY() - radius, startPoint.getY() + radius);
//
//		/*
//		 * The first value of the vectors above represents the beginning of the area
//		 * being checked, the second value the end.
//		 */
//
//		/* then there is cost assigned to an area around the other agents */
//		for (int x = xVector.getX(); x < xVector.getY(); x++) {
//			for (int y = yVector.getX(); y < yVector.getY(); y++) {
//
//				Node node = map.get(x, y);
//
//				/* fetch all null nodes (e.g. out of bounds) */
//				if (node == null) {
//					continue;
//				}
//
//				boolean doubleBorder = true;
//
//				/* find all nodes occupied by agents */
//				if (node.getProperty() == Property.FLOOR) {
//					if (node.getPassenger() != null && node.getPassenger().getId() != pax.getId()) {
//
//						setCost(new IntVector(x, y), ObstacleGenerator.AGENT_OBSTACLE_VALUE);
//
//						for (IntVector surroundingVector : getSurroundingPoints(x, y)) {
//
//							Node surroundingNode = map.get(surroundingVector);
//
//							if (surroundingNode.getProperty() == Property.FLOOR
//									&& surroundingNode.getPassenger() == null) {
//
//								setCost(surroundingNode.getPosition(),
//										(int) (ObstacleGenerator.AGENT_OBSTACLE_VALUE * 0.6666));
//
//								/* only perform if desired */
//								if (doubleBorder) {
//									for (IntVector secondOrderSurroundingVector : getSurroundingPoints(
//											surroundingNode.getPosition().getX(),
//											surroundingNode.getPosition().getY())) {
//
//										Node secondOrderSurroundingNode = map.get(secondOrderSurroundingVector);
//
//										if (secondOrderSurroundingNode.getProperty() == Property.FLOOR
//												&& secondOrderSurroundingNode.getPassenger() == null) {
//
//											setCost(secondOrderSurroundingNode.getPosition(),
//													(int) (ObstacleGenerator.AGENT_OBSTACLE_VALUE * 0.3333));
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//
//			}
//		}
//		setCost(startPoint, 0);
//	}

	/**
	 * This function moves the points gathered in pointParkingHelper to
	 * pointParking.
	 *
	 * @return
	 */
	private List<IntVector> selectNext() {

		// Calculate the minimum cost of all nodes which are considered next
		int minCost = considerNext.stream().mapToInt(this::getCost).min().orElse(Integer.MAX_VALUE);

		// Select all nodes with minimal cost
		List<IntVector> current = considerNext.stream().filter(p -> getCost(p) == minCost).collect(Collectors.toList());

		// Remove the selected ones from the considered list
		considerNext.removeAll(current);

		return current;
	}

	/**
	 * This functions calculates the cost for all 8 surrounding elements of one
	 * middle element by adding the cost of the middle element to the cost of the
	 * specific surrounding element.
	 *
	 * @param center is the point around which all costs are calculated
	 */
	private void createSurroundingCosts(IntVector center) {

		for (IntVector point : getValidSurroundingPoints(center)) {

			// Sum up the cost
			setCost(point, getCost(center) + getCost(point));

			// Add point as already calculated
			calculated.add(point);

			// Consider the point as next step
			considerNext.add(point);
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	public Integer getCost(IntVector costPoint) {
		return cost[costPoint.getX()][costPoint.getY()];
	}

	/**
	 * Gets the maximum cost.
	 *
	 * @return the maximum cost
	 */
	public int getMaximumCost() {
		return Arrays.stream(cost).flatMap(Arrays::stream).filter(c -> c != null).mapToInt(i -> i).max().orElse(0);
	}

	/**
	 * This method delivers all 8 surrounding points of a specific point in the cost
	 * map. Starting in the north, all points are collected clockwise.
	 *
	 * @param x x coordinate of the middle point
	 * @param y y coordinate of the middle point
	 * @return returns the point vector
	 */
	private List<IntVector> getValidSurroundingPoints(IntVector center) {

		List<IntVector> neighbors = new ArrayList<>();

		// define the neighboring positions
		for (int dx = center.getX() - 1; dx <= center.getX() + 1; dx++) {
			for (int dy = center.getY() - 1; dy <= center.getY() + 1; dy++) {

				// Check bounds!
				if (dx >= 0 && dy >= 0 && dx < size.getX() && dy < size.getY()) {
					neighbors.add(new IntVector(dx, dy));
				}
			}
		}

		// filter nodes by validity and sort by cost
		return neighbors.stream().filter(n -> getCost(n) != null && !calculated.contains(n))
				.sorted(Comparator.comparing(this::getCost)).collect(Collectors.toList());
	}

	/**
	 *
	 * @param point
	 * @param costValue
	 */
	private void setCost(IntVector point, Integer costValue) {
		cost[point.getX()][point.getY()] = costValue;
	}
}