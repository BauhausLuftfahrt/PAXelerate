/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.astar;

import java.util.List;

import com.paxelerate.core.simulation.agent.AgentSpeedHandler;
import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.core.simulation.astar.Node.Property;
import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.monuments.Aisle;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Monument;
import com.paxelerate.model.monuments.OverheadBin;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.monuments.SeatGroup;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.Distance;
import net.bhl.opensource.toolbox.math.LinearInterpolation;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 *
 * @author Marc.Engelmann
 * @since 11.05.2020
 *
 */
public class ObstacleGenerator {

	public static final int DEFAULT_VALUE = 10;
	public static final int HOLE_VALUE_AISLE = 3;
	public static final int DOOR_HOLE_VALUE = 3;
	public static final int GRADIENT_LOWER_BOUND = 80;
	public static final int GRADIENT_UPPER_BOUND = 100;
	public static final int FOLDED_SEAT_VALUE = 20;
	public static final int OBSTACLE_RANGE_IN_CM = 20;
	public static final int NARROWING_OF_DOOR_PATH_IN_PIXELS = 5;
	public static final int NARROWING_OF_AISLE_PATH_IN_PIXELS = 3;
	public static final int AISLE_OVERLAP_FRONT = 20;
	public static final int AISLE_OVERLAP_REAR = 10;
	public static final int AGENT_OBSTACLE_VALUE = 1000;
	public static final int TRANSPARENT_WALL_VALUE = 8000;

	public static final double GRADIENT_WIDTH = 0.2; // meters

	private double scale;
	private Areamap areamap;
	private Deck deck;

	/**
	 * This method generates a new obstacle generator.
	 *
	 * @param areamap        the area map on which the obstacles should be applied
	 *                       to
	 * @param cabin          the cabin from which to get the values
	 * @param gradientOption the gradient option
	 */
	public ObstacleGenerator(Areamap areamap, Deck deck) {

		// store the needed values locally */
		this.areamap = areamap;
		this.deck = deck;
		scale = EObjectHelper.getParent(Model.class, deck).getSettings().getSimulationGridResolution();

		for (Layer layer : Layer.values()) {

			// loop through all nodes in every layer and apply the default value
			areamap.getNodes().forEach(node -> {
				node.setObstacleGradientValue(ObstacleGenerator.DEFAULT_VALUE, layer);
				node.setProperty(Property.FREE, layer);
			});

			for (Monument obj : EObjectHelper.getChildren(deck, Monument.class)) {
				createMonument(obj, layer);
			}

			generateHalfFuselageShape(true, layer);
			generateHalfFuselageShape(false, layer);

			generatePotentialGradient(areamap, layer);
			checkForGaps(layer);
		}

		// generate Depressions but only for layer "ASTAR" because it is not needed in
		// other layers
		generateDoorDepressions(Layer.ASTAR);
		generateAisleDepressions(Layer.ASTAR);

	}

	/**
	 * Check for gaps.
	 */
	public void checkForGaps(Layer layer) {

		// loop through all filtered nodes
		for (Node node : areamap.getFilteredNodes(
				n -> (n.getPosition().getY() == 1 || n.getPosition().getY() == areamap.getDimensions().getY() - 2)
						&& n.getProperty(layer) != Property.FREE)) {

			// check if the node has one more node between the border in the y dimension
			if (node.getPosition().getY() == 1) {

				Node newNode = areamap.get(BHLMath.toInt(node.getPosition().getX()), 0).get();

				// check if the other node is not yet an obstacle
				if (newNode.getProperty(layer) == Property.FREE) {

					// define the attributes to the current position
					newNode.setProperty(Property.OBJECT, layer);
				}

			} else if (node.getPosition().getY() == areamap.getDimensions().getY() - 2) {

				Node newNode = areamap.get(BHLMath.toInt(node.getPosition().getX()),
						BHLMath.toInt(areamap.getDimensions().getY() - 1)).get();

				if (newNode.getProperty(layer) == Property.FREE) {

					// define the attributes to the current position
					newNode.setProperty(Property.OBJECT, layer);
				}
			}

			if (node.getPosition().getY() >= 2) {
				if (Seat.class.isInstance(areamap.get(BHLMath.toInt(node.getPosition().getX()),
						BHLMath.toInt(node.getPosition().getY() - 2)))
						&& areamap
								.get(BHLMath.toInt(node.getPosition().getX()),
										BHLMath.toInt(node.getPosition().getY() - 1))
								.get().getProperty(layer) == Property.FREE) {
					areamap.get(BHLMath.toInt(node.getPosition().getX()), BHLMath.toInt(node.getPosition().getY() - 1))
							.get().setProperty(Property.OBJECT, layer);
				}
			}
		}
	}

	/**
	 * Generate a hole in the potential of the area map where the aisle is located.
	 *
	 * @param layer
	 */
	public void generateAisleDepressions(Layer layer) {

		for (Aisle aisle : deck.getAisles()) {

			if (aisle.isIgnoreForSimulation()) {
				continue;
			}

			for (int i = 0; i < aisle.getPath().size() - 1; i++) {

				EPoint current = aisle.getPath().get(i);
				EPoint next = aisle.getPath().get(i + 1);

				double x = current.getX() / scale;
				double y = current.getY() / scale + areamap.getDimensions().getY() / 2.0;

				double nextX = next.getX() / scale;
				double nextY = next.getY() / scale + areamap.getDimensions().getY() / 2.0;

				for (int a = BHLMath.toInt(x); a < nextX; a++) {

					int b = BHLMath.toInt(LinearInterpolation.getYAt(a, nextY, y, nextX, x));

					areamap.get(a, b).ifPresent(
							node -> node.setObstacleGradientValue(ObstacleGenerator.HOLE_VALUE_AISLE, layer));
				}
			}
		}

	}

	/**
	 * This method generates the obstacle hole in the door path. This means that in
	 * the door area, the obstacle value is set to DOOR_HOLE_VALUE. This makes the
	 * passengers use the door path as their preferred path.
	 */
	public void generateDoorDepressions(Layer layer) {

		// Create the door paths for every door */
		for (Door door : DoorExtensions.getActiveDoors(deck)) {

			int middle = (int) Math.round((door.getXPosition() + DoorExtensions.getWidth(door) / 2.0) / scale);

			for (int y = 0; y < (int) Math.round(DeckExtensions.getMaximumSize(deck).getY() / scale); y++) {

				areamap.get(middle, y).ifPresent(node -> {

					if (node.getProperty(layer) == Property.FREE || node.getProperty(layer) == Property.FUSELAGE) {

						node.setObstacleGradientValue(ObstacleGenerator.DOOR_HOLE_VALUE, layer);
						node.setProperty(Property.FREE, layer);
					}
				});
			}
		}
	}

	/**
	 *
	 * @param shape
	 * @param left
	 */
	public void generateHalfFuselageShape(boolean left, Layer layer) {

		for (int i = 0; i < deck.getShapeFloor().size() - 1; i++) {

			EPoint current = deck.getShapeFloor().get(i);
			EPoint next = deck.getShapeFloor().get(i + 1);

			double x = current.getX() / scale;
			double y = current.getY() / scale + areamap.getDimensions().getY() / 2.0;

			double nextX = next.getX() / scale;
			double nextY = next.getY() / scale + areamap.getDimensions().getY() / 2.0;

			if (left) {
				y = (-current.getY() + DeckExtensions.getMaximumSize(deck).getY() / 2.0) / scale - 1;
				nextY = (-next.getY() + DeckExtensions.getMaximumSize(deck).getY() / 2.0) / scale - 1;
			}

			for (int a = (int) Math.round(x); a < nextX; a++) {
				int b = (int) Math.round(LinearInterpolation.getYAt(a, nextY, y, nextX, x));

				if (left) {
					for (int q = b; q >= 0; q--) {
						areamap.get(a, q).ifPresent(node -> node.setProperty(Property.FUSELAGE, layer));
					}

				} else {
					for (int q = b; q <= DeckExtensions.getMaximumSize(deck).getY() / scale; q++) {
						areamap.get(a, q).ifPresent(node -> node.setProperty(Property.FUSELAGE, layer));
					}
				}

			}
		}
	}

	/**
	 * This method creates the potential gradient around obstacle.
	 *
	 * @param map
	 * @param layer
	 */
	public void generatePotentialGradient(Areamap map, Layer layer) {

		List<Node> obstacles = map.getFilteredNodes(n -> n.getProperty(layer) != Property.FREE);

		// loop through all nodes */
		for (Node node : map.getFilteredNodes(n -> n.getProperty(layer) == Property.FREE)) {

			// calculate the distance to the closest obstacle node */
			double minDistance = obstacles.stream()
					.mapToDouble(n -> Distance.distanceBetween(node.getPosition(), n.getPosition())).min().orElse(0);

			// check if the distance is smaller than the maximum allowed gradient width
			if (minDistance <= ObstacleGenerator.GRADIENT_WIDTH / scale) {

				// calculate the gradient value and apply it to the node */
				node.setObstacleGradientValue((int) LinearInterpolation.getYAtX(ObstacleGenerator.GRADIENT_UPPER_BOUND,
						ObstacleGenerator.GRADIENT_LOWER_BOUND, ObstacleGenerator.GRADIENT_WIDTH / scale - 1,
						minDistance - 1), layer);
				node.setProperty(Property.FREE, layer);
			}
		}
	}

	/**
	 * @param obj
	 * @param layer
	 */
	private void createMonument(Monument obj, Layer layer) {

		// If it is the ceiling layer and the object is no overhead bin, continue
		if (layer.equals(Layer.CEILING) && !(obj instanceof OverheadBin)) {
			return;
		}

		int xDim = BHLMath.toInt(obj.getSize().getX() / scale);
		int yDim = BHLMath.toInt(obj.getSize().getY() / scale);
		int xPos = BHLMath.toInt(obj.getPosition().getX() / scale);
		int yPos = BHLMath.toInt(obj.getPosition().getY() / scale + areamap.getDimensions().getY() / 2.0);

		if (obj instanceof SeatGroup) {

			switch (layer) {
			case TOP:
				xPos += BHLMath.toInt(xDim * 0.8);
				xDim = BHLMath.toInt(xDim * 0.2);
				break;
			default:
				break;
			}
		}

		// loop from 0 to the dimension of the object */
		for (int x = xPos; x < xPos + xDim; x++) {
			for (int y = yPos; y < yPos + yDim; y++) {

				// get the node at the current position */
				areamap.get(x, y).ifPresent(node -> {

					if (obj instanceof OverheadBin) {
						node.setProperty(Property.OBJECT, Layer.CEILING);
						node.setCeilingHeight(AgentSpeedHandler.BIN_HEIGHT); // average value from different airbus
																				// cabins

					} else {

						// define the attributes to the current position */
						node.setProperty(Property.OBJECT, layer);
					}
				});
			}
		}
	}
}