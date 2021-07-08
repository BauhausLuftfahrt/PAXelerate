/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.core.simulation.agent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.core.simulation.astar.ObstacleGenerator;
import com.paxelerate.model.agent.Passenger;

import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.Distance;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;

/**
 * This class generates different shapes and influence areas for every agent
 * depending on body measures, carried luggage and state of the agent
 *
 * @author Marc.Engelmann, Tim.Kleinheinz
 * @since 11.05.2020
 *
 */

public class AgentShapeHandler {

	// TODO!

//	public class PassengerValue {
//		private int influenceValue;
//		private IntVector position;
//
//		/**
//		 *
//		 */
//		public PassengerValue(int x, int y) {
//			position = new IntVector(0, 0);
//		}
//	}
//
//	public class PassengerShape {
//		private PassengerValue[][] structure;
//
//		/**
//		 *
//		 */
//		public PassengerShape(int x, int y) {
//			structure = new PassengerValue[x][y];
//
//			for (int a = 0; a < x; a++) {
//				for (int b = 0; b < y; b++) {
//					structure[a][b] = new PassengerValue(a, b);
//				}
//			}
//		}
//	}

	public enum Influence {
		WALKING, STANDING, SITTING, COVID;
	}

	private Map<Layer, int[][]> shapes = new HashMap<>();
	private Map<Influence, int[][]> influences = new HashMap<>();

	private int[][] modifiedShape, currentShape;

	/**
	 * @param agent
	 * @param handler
	 */
	public AgentShapeHandler(Agent agent) {

		// x = depth, y = width
		DoubleVector extraLuggageDimensions = new DoubleVector(0, 0);

		// store input values locally
		Passenger passenger = agent.getPassenger();
		double scale = agent.getHandler().getSettings().getSimulationGridResolution();

		/*
		 * Depending on the type of luggage, the shape of the passenger is extended.
		 * Jacket -> no effect, SMALL -> +0.2 in width, MEDIUM -> +0.4 in depth, LARGE
		 * -> +0.2 in width and +0.4 in depth
		 */
		if (!passenger.getLuggage().isEmpty()) {

			switch (passenger.getLuggage().get(0).getType()) {

			case JACKET:
				extraLuggageDimensions = new DoubleVector(0, 0);
				break;

			case SMALL_BAG:
				extraLuggageDimensions = new DoubleVector(0, 0.2);
				break;

			case MEDIUM_BAG:
				extraLuggageDimensions = new DoubleVector(0.4, 0);
				break;

			case LARGE_BAG:
				extraLuggageDimensions = new DoubleVector(0.4, 0.2);
				break;
			}
		}

		// ----------------------------------------------------------------------
		// generation of the passenger shapes

		/* generate the shape of the agent with luggage */
		shapes.put(Layer.ASTAR,
				new int[BHLMath.toInt((passenger.getWidth() + extraLuggageDimensions.getY()) / scale)][BHLMath
						.toInt((passenger.getDepth() + extraLuggageDimensions.getX()) / scale)]);

		/*
		 * generate the bottom shape of the agent and take luggage into account (no
		 * extra width, because small luggage is carried in middle shape)
		 */

		shapes.put(Layer.BOTTOM,
				new int[BHLMath
						.toInt(passenger.getWidthBottom() / scale)][BHLMath.toInt(passenger.getDepthBottom() / scale)
								+ BHLMath.toInt(extraLuggageDimensions.getX() / scale)]);

		/*
		 * generate the middle shape of the agent and take luggage into account (no
		 * extra depth, because medium luggage is carried in middle shape)
		 */
		shapes.put(Layer.MIDDLE,
				new int[BHLMath.toInt(passenger.getWidthMiddle() / scale)
						+ BHLMath.toInt(extraLuggageDimensions.getY() / scale)][BHLMath
								.toInt(passenger.getDepthMiddle() / scale)]);

		/*
		 * generate the top shape of the agent and take luggage into account (no extra
		 * depth/width, because no luggage is carried in top shape)
		 */
		shapes.put(Layer.TOP, new int[BHLMath.toInt(passenger.getWidthTop() / scale)][BHLMath
				.toInt(passenger.getDepthTop() / scale)]);

		// Apply values
		for (Entry<Layer, int[][]> layerShape : shapes.entrySet()) {
			for (int[] row : layerShape.getValue()) {
				Arrays.fill(row, ObstacleGenerator.GRADIENT_UPPER_BOUND);
			}
		}

		// ----------------------------------------------------------------------
		// Influence Areas

		/*
		 * Generate the influence area of the agent while walking. The numbers represent
		 * the distance to the passenger in nodes (Please note that the information
		 * regarding the position of the area ("left", "in front", ...) are just for
		 * differentiation! Left could also be on the right side as well as the back
		 * could be in front. As the shapes and areas are symmetrical, the true position
		 * is not important.)
		 */

		influences.put(Influence.WALKING,
				new int[shapes.get(Layer.ASTAR).length + 2
						* BHLMath.toInt(Agent.INFLUENCE_AREA_WALKING_SIDE / scale)][shapes.get(Layer.ASTAR)[0].length
								+ 2 * BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale)]);

		// passenger itself --> area of passenger shape with luggage
		for (int i = (influences.get(Influence.WALKING).length - shapes.get(Layer.ASTAR).length)
				/ 2; i < influences.get(Influence.WALKING).length
						- (influences.get(Influence.WALKING).length - shapes.get(Layer.ASTAR).length) / 2; i++) {
			for (int j = BHLMath
					.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j < influences.get(Influence.WALKING)[0].length
							- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j++) {
				influences.get(Influence.WALKING)[i][j] = ObstacleGenerator.GRADIENT_UPPER_BOUND;
			}
		}

		// personal space left
		for (int i = 0; i < (influences.get(Influence.WALKING).length - shapes.get(Layer.ASTAR).length) / 2; i++) {
			for (int j = BHLMath
					.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j < influences.get(Influence.WALKING)[0].length
							- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j++) {
				influences.get(Influence.WALKING)[i][j] = (influences.get(Influence.WALKING).length
						- shapes.get(Layer.ASTAR).length) / 2 - i;
			}
		}

		// personal space right
		for (int i = influences.get(Influence.WALKING).length
				- (influences.get(Influence.WALKING).length - shapes.get(Layer.ASTAR).length) / 2; i < influences
						.get(Influence.WALKING).length; i++) {
			for (int j = BHLMath
					.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j < influences.get(Influence.WALKING)[0].length
							- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j++) {
				influences.get(Influence.WALKING)[i][j] = i + 1 - (influences.get(Influence.WALKING).length
						- (influences.get(Influence.WALKING).length - shapes.get(Layer.ASTAR).length) / 2);
			}
		}

		// influence area in the back of the passenger
		for (int i = 0; i < influences.get(Influence.WALKING).length; i++) {
			for (int j = 0; j < BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j++) {
				influences.get(Influence.WALKING)[i][j] = BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale) - j;
			}
		}

		// influence area in front of the passenger
		for (int i = 0; i < influences.get(Influence.WALKING).length; i++) {
			for (int j = influences.get(Influence.WALKING)[0].length - BHLMath
					.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j < influences.get(Influence.WALKING)[0].length; j++) {
				influences.get(Influence.WALKING)[i][j] = 1 + j - (influences.get(Influence.WALKING)[0].length
						- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale));
			}
		}

		// ----------------------------------------------------------------------
		/*
		 * Generate the influence area of the agent while standing. The numbers
		 * represent the distance to the passenger in nodes (Please note that the
		 * information regarding the position of the area are just for differentiation!
		 * Left could also be on the right side as well as the back could be in front.
		 * As the shapes and areas are symmetrical, the true position is not important.)
		 */

		influences.put(Influence.STANDING,
				new int[shapes.get(Layer.ASTAR).length
						+ 2 * BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale)][shapes.get(Layer.ASTAR)[0].length
								+ 2 * BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale)]);

		// passenger itself --> are of shapes.get(Layer.ASTAR)
		for (int i = (influences.get(Influence.STANDING).length - shapes.get(Layer.ASTAR).length)
				/ 2; i < influences.get(Influence.STANDING).length
						- (influences.get(Influence.STANDING).length - shapes.get(Layer.ASTAR).length) / 2; i++) {
			for (int j = BHLMath
					.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j < influences.get(Influence.STANDING)[0].length
							- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j++) {
				influences.get(Influence.STANDING)[i][j] = ObstacleGenerator.GRADIENT_UPPER_BOUND;
			}
		}

		// left area
		for (int i = 0; i < BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); i++) {
			for (int j = i; j < influences.get(Influence.STANDING)[0].length - i; j++) {
				influences.get(Influence.STANDING)[i][j] = BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale) - i;
			}
		}

		// right area
		for (int i = influences.get(Influence.STANDING).length - 1; i > influences.get(Influence.STANDING).length
				- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale) - 1; i--) {
			for (int j = influences.get(Influence.STANDING).length - 1
					- i; j < influences.get(Influence.STANDING)[0].length
							- (influences.get(Influence.STANDING).length - 1 - i); j++) {
				influences.get(Influence.STANDING)[i][j] = BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale)
						- (influences.get(Influence.STANDING).length - 1 - i);
			}
		}

		// area behind --> information: outer for-loop with "j", inner for-loop with "i"
		for (int j = 0; j < BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale); j++) {
			for (int i = j + 1; i < influences.get(Influence.STANDING).length - j - 1; i++) {
				influences.get(Influence.STANDING)[i][j] = BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale) - j;
			}
		}

		// area in front --> information: outer for-loop with "j", inner for-loop with
		// "i"
		for (int j = influences.get(Influence.STANDING)[0].length - 1; j > influences.get(Influence.STANDING)[0].length
				- BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale) - 1; j--) {
			for (int i = influences.get(Influence.STANDING)[0].length - 1
					- j; i < influences.get(Influence.STANDING).length
							- (influences.get(Influence.STANDING)[0].length - 1 - j); i++) {
				influences.get(Influence.STANDING)[i][j] = BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale)
						- (influences.get(Influence.STANDING)[0].length - 1 - j);
			}
		}

		// ----------------------------------------------------------------------
		/*
		 * Generate the circular influence area of the agent for contact tracing.
		 */

		influences.put(Influence.COVID, new int[// shapes.get(Layer.ASTAR).length +
		2 * BHLMath.toInt(Agent.COVID_EXPOSURE_TRESHOLD / scale)][ // shapes.get(Layer.ASTAR)[0].length+
		2 * BHLMath.toInt(Agent.COVID_EXPOSURE_TRESHOLD / scale)]);

		for (int i = 0; i < influences.get(Influence.COVID).length; i++) {
			for (int j = 0; j < influences.get(Influence.COVID)[0].length; j++) {

				int distance = BHLMath.toInt(Distance.distanceBetween(i, j,
						influences.get(Influence.COVID).length / 2.0, influences.get(Influence.COVID)[0].length / 2.0));

				influences.get(Influence.COVID)[i][j] = distance > BHLMath.toInt(Agent.COVID_EXPOSURE_TRESHOLD / scale)
						? 0
						: distance;
			}
		}

		// ----------------------------------------------------------------------
		/*
		 * Generate the influence area of the agent sitting. The numbers represent the
		 * distance to the passenger in nodes* Please note that in this influence area
		 * no extra passenger shape is created, because the seat is already marked as
		 * blocked. The passenger itself is not considered in the influence area, which
		 * only consists of "1".
		 */

		influences.put(Influence.SITTING,
				new int[BHLMath.toInt((passenger.getWidth() + Agent.INFLUENCE_AREA_SITTING) / scale)][BHLMath
						.toInt((passenger.getDepth() + Agent.ADDING_DEPTH_SITTING) / scale)]);

		for (int[] row : influences.get(Influence.SITTING)) {
			Arrays.fill(row, 1);
		}
	}

	/**
	 * @return the influence area
	 */
	public int[][] getInfluenceArea(Influence type) {
		return influences.get(type);
	}

	/**
	 * @param layer
	 * @return
	 */
	public int[][] getShape(Layer layer) {
		return shapes.get(layer);
	}

	/**
	 * @return the modifiedShape
	 */
	public int[][] getModifiedShape() {
		return modifiedShape;
	}

	/**
	 * @param modifiedShape the modifiedShape to set
	 */
	public void setModifiedShape(int[][] modifiedShape) {
		this.modifiedShape = modifiedShape;
	}

	/**
	 * @return the currentShape
	 */
	public int[][] getCurrentShape() {
		return currentShape;
	}

	/**
	 * @param currentShape the currentShape to set
	 */
	public void setCurrentShape(int[][] currentShape) {
		this.currentShape = currentShape;
	}

	/**
	 * @param shape
	 * @return
	 */
	public double getArea(Layer layer) {
		return getShape(layer).length * getShape(layer)[0].length;
	}

	/**
	 * @param shape
	 */
	public void printShape(int[][] shape) {
		for (int[] row : shape) {
			for (int i : row) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}