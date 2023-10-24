/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.core.simulation.agent;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

import com.paxelerate.core.simulation.astar.Node;
import com.paxelerate.core.simulation.astar.ObstacleGenerator;
import com.paxelerate.core.simulation.astar.Path;
import com.paxelerate.core.simulation.astar.SimulationHandler;
import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.core.simulation.astar.Node.Property;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.EPointExtensions;

import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;
import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * Interface with functions needed to calculate current walking speed.
 *
 * @author Marc.Engelmann, Tim.Kleinheinz
 * @since 11.05.2020
 *
 */

public interface AgentSpeedHandler {

	double PERSONAL_SPACE_WIDTH = 0.71; // meters
	int HIT_OBSTACLE_EFFECT = 200; // gradient values between 100 and 80
	int LOW_CEILING_EFFECT = 80; // same as lowest gradient value
	double BIN_HEIGHT = 1.65;

	// Layers considered in the obstacle effects
	List<Layer> OBSTACLE_LAYERS = Arrays.asList(Layer.BOTTOM, Layer.MIDDLE, Layer.TOP);

	/**
	 * This function calculates the walking speed depending on obstacle and
	 * passenger effects in the next step.
	 *
	 * @param agent
	 * @return
	 */

	static double getSpeed(Agent agent) {

		Passenger passenger = agent.getPassenger();
		SimulationHandler handler = agent.getHandler();
		double scale = agent.getHandler().getSettings().getSimulationGridResolution();

		double obstacleEffects = 0;
		double orientation;
		double orientationInfluencer;
		double relativeOrientation;
//		int lastOrientation;
//		int checkSpaceWidth;
//		int checkSpaceDistance;

		Entry<Agent, Integer> mainInfluence = null;

		// ------------------------------
		// PAX INFLUENCE

		// the return value
		double speedByPassenger = passenger.getWalkingSpeed();

		/*
		 * Check, if there are influencing passenger. If not, the passenger is not
		 * affected by other passenger --> return passenger speed
		 */
		if (!handler.getMap().get(passenger.getCurrentPosition()).get().influencingPassengers.isEmpty()) {

			/*
			 * get the current and the last orientation of the passenger (orientation in the
			 * next step, so from current to desired position matters)
			 */
			if (agent.getStepIndex() > 1) {

				orientation = AgentSpeedHandler.calculateAbsoluteOrientation(
						EPointExtensions.transform(passenger.getCurrentPosition()),
						EPointExtensions.transform(passenger.getDesiredPosition()));

//				lastOrientation = Walkingspeed.calcOrientation(
//						EPointExtensions.transformIntVector(path.get(stepIndex - 2).getPosition()),
//						passenger.getCurrentPosition());

			} else {

				orientation = AgentSpeedHandler.calculateAbsoluteOrientation(
						agent.getPath().get(0).getPosition().toDoubleVector(),
						agent.getPath().get(1).getPosition().toDoubleVector());
//				lastOrientation = orientation;
			}

			for (Entry<Agent, Integer> influence : handler.getMap().get(passenger.getCurrentPosition())
					.get().influencingPassengers.entrySet()) {

				// make sure it's not the passenger itself
				if (influence.getKey().equals(agent)) {
					continue;
				}

				/*
				 * get the orientation of the influencer and the relative orientation between
				 * passenger and influencer (as the passenger does not know in which direction
				 * the influencer is walking in the next step, the current orientation, so from
				 * the last step to current position matters) (at this point it is better to
				 * work with stepIndex than currentPosition(), because it is more reliable)
				 */

				Path influencerPath = influence.getKey().getPath();

				if (influence.getKey().getStepIndex() > 1) {

					// calculate the orientation of the influencer
					orientationInfluencer = AgentSpeedHandler.calculateAbsoluteOrientation(
							influencerPath.get(influence.getKey().getStepIndex() - 2).getPosition().toDoubleVector(),
							influencerPath.get(influence.getKey().getStepIndex() - 1).getPosition().toDoubleVector());

					// calculate the relative orientation between the passenger and the influencer
					relativeOrientation = AgentSpeedHandler.calculateAbsoluteOrientation(
							EPointExtensions.transform(passenger.getCurrentPosition()), influence.getKey().getPath()
									.get(influence.getKey().getStepIndex() - 1).getPosition().toDoubleVector());

				} else {
					// calculate the orientation of the influencer
					orientationInfluencer = AgentSpeedHandler.calculateAbsoluteOrientation(
							influencerPath.get(0).getPosition().toDoubleVector(),
							influencerPath.get(1).getPosition().toDoubleVector());

					// calculate the relative orientation between the passenger and the influencer
					relativeOrientation = AgentSpeedHandler.calculateAbsoluteOrientation(
							EPointExtensions.transform(passenger.getCurrentPosition()),
							influencerPath.get(0).getPosition().toDoubleVector());
				}

				// Check if the influencer is in a position affecting the passenger, depending
				// on positions and orientations.

				if (AgentSpeedHandler.isInfluencePossible(influence.getKey().getPassenger().getState(), orientation,
						orientationInfluencer, relativeOrientation)) {

					// Decide if passenger is walking towards influencer or is just passing him. If
					// he is just passing him, handle the values like an obstacle gradient.

					if (influence.getKey().getPassenger().getState() == State.SEATED
							|| AgentSpeedHandler.isPathBlockedByAgent(agent, influence.getKey(),
									handler.getSettings().getSimulationGridResolution())) {

						if (influence.getValue() <= 0.1 / scale) {
							obstacleEffects += ObstacleGenerator.GRADIENT_UPPER_BOUND;

						} else if (influence.getValue() <= 0.2 / scale) {
							obstacleEffects += ObstacleGenerator.GRADIENT_LOWER_BOUND;
						}

					} else if (mainInfluence == null || influence.getValue() < mainInfluence.getValue()) {

						// on passengers current path, only the closest influencer is affecting the
						// walking speed

						mainInfluence = influence;

						// minimum personal distance to other people
						if (AgentFunctions.isPathBlockedAtIndex(agent, agent.getStepIndex()
								+ Math.max(1, BHLMath.toInt(Agent.MINIMUM_DIST_TO_OTHER_PAX / scale)))) {

							speedByPassenger = 0;
							agent.setBlocker(mainInfluence.getKey().getPassenger());

						} else {

							// calculate the current walking speed depending on density
							speedByPassenger = passenger.getWalkingSpeed()
									* AgentSpeedHandler.getWeidmannSpeed(mainInfluence.getValue(), scale,
											Math.ceil(agent.getShapeHandler().getShape(Layer.ASTAR)[0].length / 2.0));
						}
					}

				}
			}

//			/*
//			 * the following decision logic reduces the possibility that the passenger walks
//			 * into another passenger before walking around a corner, when the other
//			 * passenger has already walked around that corner CURRENTLY DEACTIVATED. NOT
//			 * REALLY NEEDED AT THE MOMENT
//			 */
//			boolean noCollision = true;
//
//			if (lastOrientation == 0 || lastOrientation == 180) {
//				checkSpaceWidth = shapeWithLuggage.length / 2;
//
//				for (int i = -checkSpaceWidth; i <= checkSpaceWidth; i++) {
//
//					/* the location currently under investigation */
//					IntVector checkNode = new IntVector(BHLMath.toInt(passenger.getDesiredPosition().getX()) + i,
//							BHLMath.toInt(passenger.getDesiredPosition().getY()));
//
//					try {
//						if (handler.getMap().get(checkNode).getPassenger() != null
//								&& handler.getMap().get(checkNode).getPassenger().getId() != passenger.getId()) {
//							noCollision = false;
//							blocker = handler.getMap().get(checkNode).getPassenger();
//						}
//					} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
//						// Node does not exist!
//					}
//				}
//
//			} else if (lastOrientation == 90 || lastOrientation == 270) {
//				checkSpaceWidth = shapeWithLuggage.length;
//
//				for (int i = -checkSpaceWidth; i <= checkSpaceWidth; i++) {
//
//					/* the location currently under investigation */
//					IntVector checkNode = new IntVector(BHLMath.toInt(passenger.getDesiredPosition().getX()),
//							BHLMath.toInt(passenger.getDesiredPosition().getY()) + i);
//
//					try {
//						if (handler.getMap().get(checkNode).getPassenger() != null
//								&& handler.getMap().get(checkNode).getPassenger().getId() != passenger.getId()) {
//							noCollision = false;
//							blocker = handler.getMap().get(checkNode).getPassenger();
//						}
//					} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
//						// Node does not exist!
//					}
//				}
//			}
//
//			if (noCollision) {
//				returnSpeed = speedPax;
//			} else {
//				returnSpeed = 0;
//			}
		}

		// only calculate obstacle effects when passenger is walking
		if (speedByPassenger <= 0) {
			return speedByPassenger;
		}

		// -----------------------------------------------
		// OBSTACLE INFLUENCE

		// mean effect per node
		obstacleEffects = OBSTACLE_LAYERS.stream().mapToDouble(l -> AgentSpeedHandler.getObstacleEffects(agent, l))
				.sum() / OBSTACLE_LAYERS.stream().mapToDouble(l -> agent.getShapeHandler().getArea(l)).sum();

		// divided by 1.5 times areaTop because the function calculates two effects for
		// this area (not divided by two times areaTop because one effect is calculated
		// in another way and is not strongly related to the area, but still needs to be
		// considered somehow)

		double lowCeilingEffects = AgentSpeedHandler.lowCeilingEffect(passenger.getHeight(), passenger.getHeightTop(),
				agent.getShapeHandler().getShape(Layer.TOP), passenger, handler)
				/ (1.5 * agent.getShapeHandler().getArea(Layer.TOP));

		// calculate the speed under influence of the nearby obstacles
		double speedByObstacle = (1
				- 0.5 * (obstacleEffects + lowCeilingEffects) / AgentSpeedHandler.HIT_OBSTACLE_EFFECT)
				* passenger.getWalkingSpeed();

		return Math.min(speedByObstacle, speedByPassenger);
	}

	/**
	 * check if the other passenger (influencer) is in a position which really has
	 * an impact on the passengers walking speed
	 *
	 * @param stateInfluencer
	 * @param orientation
	 * @param orientationInfluencer
	 * @param relativeOrientation
	 * @param pos1
	 * @param pos2
	 * @param map
	 * @return
	 */
	static boolean isInfluencePossible(State stateInfluencer, double orientation, double orientationInfluencer,
			double relativeOrientation) {

		if (Math.abs(orientation - orientationInfluencer) > 90.0
				&& Math.abs(orientation - orientationInfluencer) <= 270.0) {
			return false;
		}

		if (stateInfluencer == State.SEATED || Math.abs(orientation - relativeOrientation) <= 90.0) {
			return true;

		}

		return false;

	}

	/**
	 * method calculates the orientation between two points
	 *
	 * @param pos1
	 * @param pos2
	 * @return
	 */
	static double calculateAbsoluteOrientation(DoubleVector pos1, DoubleVector pos2) {

		// get the angle in radian from -Pi to Pi, so zero is EAST
		double rad = Math.atan2(pos2.getY() - pos1.getY(), -(pos2.getX() - pos1.getX()));

		// rotate the angle by 90 degrees so that zero is NORTH
		rad += Math.PI / 2.0;

		return BHLMath.to0to360Degree(rad);
	}

	/**
	 * check if the influencing person blocks the path ahead
	 *
	 * @param agent
	 * @param influencer
	 * @param scale
	 * @return
	 */
	static boolean isPathBlockedByAgent(Agent agent, Agent influencer, double scale) {

		int index = agent.getStepIndex() + BHLMath.toInt(Agent.INFLUENCE_AREA_DEPTH / scale);
		/* if the index is to high, check for the last element instead */
		if (index >= agent.getPath().size()) {
			index = agent.getPath().size() - 1;
		}

		for (int i = agent.getStepIndex(); i < index; i++) {

			/* check if the node at the index is blocked */
			if (agent.getPath().get(index).getPassenger() == influencer.getPassenger()) {
				return true;
			}
		}

		return false;
	}

	/**
	 * get the obstacle values for a specific layer from all nodes the passenger is
	 * standing on in desired step
	 *
	 * @param layerShape
	 * @param passenger
	 * @param handler
	 * @param layer
	 * @return
	 */
	static int getObstacleEffects(Agent agent, Layer layer) {

		int[][] layerShape = agent.getShapeHandler().getShape(layer);

		int effect = 0;
		int scanDim = (int) (Math.max(layerShape.length, layerShape[0].length) / 2.0);

		/* loop through the whole passenger area in the area map */
		for (int x = -scanDim; x <= scanDim; x++) {
			for (int y = -scanDim; y <= scanDim; y++) {

				/* the location currently under investigation */
				IntVector location = new IntVector(BHLMath.toInt(agent.getPassenger().getDesiredPosition().getX()) + x,
						BHLMath.toInt(agent.getPassenger().getDesiredPosition().getY()) + y);

				/* if the point is within the bounds of the passenger area */
				if (x + scanDim < layerShape.length && y + scanDim < layerShape[0].length) {

					// if the passenger area has a passenger located on this specific node
					if (layerShape[x + scanDim][y + scanDim] == ObstacleGenerator.GRADIENT_UPPER_BOUND) {

						if (agent.getHandler().getMap().get(location).isPresent()) {

							Node node = agent.getHandler().getMap().get(location).get();

							// values <= 10 represent the aisle which have no effect
							if (node.getObstacleGradientValue(layer) > 10) {
								// sum up the obstacle gradient values for the layer
								effect += node.getObstacleGradientValue(layer);
							}

							if (node.getProperty(layer) != Property.FREE) {
								effect += AgentSpeedHandler.HIT_OBSTACLE_EFFECT;
							}
						}
					}
				}
			}
		}

		return effect;
	}

	/**
	 * calculate the effect of a low ceiling (includes effects of overhead bins)
	 *
	 * @param height
	 * @param shoulderHeight
	 * @param shapeTop
	 * @param passenger
	 * @param handler
	 * @return
	 */
	static double lowCeilingEffect(double height, double shoulderHeight, int[][] shapeTop, Passenger passenger,
			SimulationHandler handler) {

		int effect = 0;
		int scanDim = (int) (Math.max(shapeTop.length, shapeTop[0].length) / 2.0);

		/* loop through the whole passenger area in the area map */
		for (int x = -scanDim; x <= scanDim; x++) {
			for (int y = -scanDim; y <= scanDim; y++) {

				/* the location currently under investigation */
				IntVector location = new IntVector(BHLMath.toInt(passenger.getDesiredPosition().getX()) + x,
						BHLMath.toInt(passenger.getDesiredPosition().getY()) + y);

				/* if the point is within the bounds of the passenger area */
				if (x + scanDim < shapeTop.length && y + scanDim < shapeTop[0].length) {

					// if the passenger area has a passenger located on this specific node
					if (shapeTop[x + scanDim][y + scanDim] == ObstacleGenerator.GRADIENT_UPPER_BOUND) {

						if (handler.getMap().get(location).isPresent()) {

							Node node = handler.getMap().get(location).get();

							// effect of overhead bins
							if (AgentSpeedHandler.BIN_HEIGHT - shoulderHeight <= ObstacleGenerator.GRADIENT_WIDTH) {
								// values <= 10 represent the aisle which have no effect
								if (node.getObstacleGradientValue(Layer.CEILING) > 10) {
									// sum up the obstacle gradient values for the layer
									effect += node.getObstacleGradientValue(Layer.CEILING);
								}

								if (node.getProperty(Layer.CEILING) != Property.FREE) {
									effect += AgentSpeedHandler.HIT_OBSTACLE_EFFECT;
								}
							}

							// effect of a low ceiling
							if (node.getCeilingHeight() <= height) {
								effect += AgentSpeedHandler.LOW_CEILING_EFFECT;
							}
						}

					}
				}
			}
		}
		return effect;
	}

	/**
	 * calculate a factor to determine the impact of passenger density on walking
	 * speed depending on the influence value at the current node (This is the first
	 * possible function to calculate the impact of passenger density on the walking
	 * speed)
	 *
	 * @param value
	 * @param scale
	 * @param semiDepthOfPassenger
	 * @return
	 */
	static double getWeidmannSpeed(double value, double scale, double semiDepthOfPassenger) {
		return 1 - Math.exp(
				-1.913 * ((value - semiDepthOfPassenger) * scale * AgentSpeedHandler.PERSONAL_SPACE_WIDTH - 1 / 5.4));
	}

//	/*
//	 * calculate a factor to determine the impact of passenger density on walking
//	 * speed depending on the influence value at the current node (This is the
//	 * second possible function to calculate the impact of passenger density on the
//	 * walking speed)
//	 */
//
//	static double paxDensityFunction2(int value, double scale, int[][] shapeWithLuggage) {
//		if (value <= 4 + BHLMath.toInt(shapeWithLuggage[0].length / 2)) {
//			return 0;
//		} else {
//			double density = (double) Math.round(1 / (value * scale * Walkingspeed.PERSONAL_SPACE_WIDTH) * 10) / 10;
//			return 0.032 * Math.pow(density, 2) - 0.37 * density + 1.27;
//		}
//	}
}