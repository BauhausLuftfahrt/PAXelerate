/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.core.simulation.agent;

import java.util.ArrayList;
import java.util.List;

import com.paxelerate.core.simulation.agent.action.Collision;
import com.paxelerate.core.simulation.agent.action.Step;
import com.paxelerate.core.simulation.agent.action.StowLuggage;
import com.paxelerate.core.simulation.agent.action.UnfoldSeat;
import com.paxelerate.core.simulation.agent.action.WaitForClearing;
import com.paxelerate.core.simulation.astar.Costmap;
import com.paxelerate.core.simulation.astar.Node;
import com.paxelerate.core.simulation.astar.Path;
import com.paxelerate.core.simulation.astar.SimulationHandler;
import com.paxelerate.core.simulation.covid.ContactTracingHandler;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.SeatType;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.EPointExtensions;
import com.paxelerate.model.extensions.SeatExtensions;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.Distance;
import net.bhl.opensource.toolbox.math.vector.IntVector;
import net.bhl.opensource.toolbox.time.StopWatch;

/**
 * This class is the agent object. It walks a specific calculated path and
 * reacts to obstacles occurring on the go.
 *
 *
 * @author Michael.Schmidt, Marc.Engelmann
 * @since 11.05.2020
 *
 */

public class Agent implements Runnable {

	// Movement model settings
	public final static double MINIMUM_DIST_TO_OTHER_PAX = 0.26;
	public final static double INFLUENCE_AREA_DEPTH = 2.47; // meters (has to be applied in front and in the back)
	public final static double INFLUENCE_AREA_WALKING_SIDE = 0.2; // meters (0.1 to the left, 0.1 to the right)
	public final static double INFLUENCE_AREA_SITTING = 0.2; // meters
	public final static double ADDING_DEPTH_SITTING = 0.4; // meters (adding shape representing legs while sitting)

	public final static double COVID_EXPOSURE_TRESHOLD = 2.0; // meters

	private final static int PIXELS_FOR_WAY = 7;

	private int overheadBinFull = 0, stepIndex = 0;

	private boolean alreadyStowed = false, waitingCompleted = false, exitTheMainLoop = false,
			stowingAtAisleSeat = false, waitingAtAisleSeat = false, currentlySearchingForPath = false,
			blockOvertakingAttempts = false;

	private StopWatch stopwatch;
	private Costmap finalCostmap;
	private Thread thread;
	private Path path;

	private final Passenger passenger;
	private Passenger blocker;
	private AgentShapeHandler shapeHandler;

	private List<Double> speedOnPath = new ArrayList<>();
	private SimulationHandler handler;

	private final ContactTracingHandler contactTracingHandler;

	/**
	 * Creates an agent handler object
	 *
	 * @param passenger
	 * @param start
	 * @param goal
	 * @param mode
	 * @param thePassengerILetInTheRow
	 */
	public Agent(Passenger passenger, EPoint start, EPoint goal, SimulationHandler handler) {

		this.handler = handler;

		/* Apply all initial elements to the Agent */
		this.passenger = passenger;
		this.passenger.setState(State.NOT_ACTIVE);

		this.passenger.setStartPosition(start);
		this.passenger.setGoalPosition(goal);

		/* Generate the shapes and calculate the resulting areas for each layer */
		shapeHandler = new AgentShapeHandler(this);

		contactTracingHandler = new ContactTracingHandler(passenger);

	}

	/**
	 * Rotate the 2d integer array which has stored the layout of the agent. Note
	 * that this method is only accessed when occupying, not when releasing. This
	 * prevents the code from forgetting to release certain nodes during rotation
	 * procedures.
	 *
	 * @param vector         the vector with the location
	 * @param occupy         boolean which decides if the area will be blocked or
	 *                       unblocked
	 * @param rotateOnly     set to true if you want to rotate the object a specific
	 *                       angle
	 * @param rotation       is the specific angle
	 * @param changePosition boolean which decides if only the influence area is
	 *                       changed or if the passenger moves
	 */

	public void blockArea(EPoint vector, boolean occupy, boolean changePosition) {

		AgentFunctions.adaptShape(stepIndex, occupy, changePosition, this);

		AgentFunctions.blockShape(shapeHandler.getModifiedShape(), vector, occupy, changePosition, this);

//		shapeHandler.setModifiedShape(Rotator.rotate(PassengerExtensions.getRotation(passenger),
//				shapeHandler.getInfluenceArea(Influence.COVID)));

//		AgentFunctions.blockCovidDistance(shapeHandler.getInfluenceArea(Influence.COVID), vector, occupy,
//				changePosition, this);
	}

	/**
	 *
	 * @param blockOvertakingAttempts
	 */
	public void blockOvertakingAttempts(boolean blockOvertakingAttempts) {
		this.blockOvertakingAttempts = blockOvertakingAttempts;
	}

	/**
	 * @param position
	 */
	public void changePositionTo(IntVector position) {
		blockArea(passenger.getCurrentPosition(), false, true);
		passenger.setCurrentPosition(EPointExtensions.transformIntVector(position));
		blockArea(EPointExtensions.transformIntVector(position), true, true);
	}

	/**
	 * clear the current position of the agent
	 */
	private void clearBlockedArea() {
		blockArea(passenger.getCurrentPosition(), false, true);
		blockArea(passenger.getDesiredPosition(), false, true);
	}

	/**
	 *
	 */
	private void defineLeftCabin() {
		handler.setPassengerReachedGoal(passenger, path);
		passenger.setState(State.CABIN_LEFT);
	}

	/**
	 * when the goal is reached, the passenger is defined seated .
	 *
	 * @param isSeated the is seated
	 */
	private void defineSeated() {
		passenger.setIsSeated(true);
		passenger.setState(State.SEATED);
		blockArea(passenger.getGoalPosition(), true, false);
		handler.setPassengerReachedGoal(passenger, path);
	}

	/**
	 * This method is the main path following loop for the agent.
	 */
	private void followBoardingPath() {

		double accelerationFactor = 1;
//		int blockApproachDistance = 10;

		mainloop: try {

			if (path == null || path.size() == 0) {
				throw new IllegalArgumentException("Path is null!");
			}

			/* run the path up to its end */
			while (stepIndex < path.size()) {

				// at the first step, there is no current location but only a desired first
				// location. So ignore this at the first loop.
				if (stepIndex != 0) {

					// the current position is the last taken step in the path
					passenger.setCurrentPosition(
							EPointExtensions.transformIntVector(path.get(stepIndex - 1).getPosition()));

				}

				// the new planned location is current step in the path
				passenger.setDesiredPosition(EPointExtensions.transformIntVector(path.get(stepIndex).getPosition()));

				// check if luggage should be stowed next
				if (!alreadyStowed && !passenger.getLuggage().isEmpty()) {

					switch (handler.getSettings().getSeatType()) {

					case DEFAULT:
						stowDefaultLuggage();
						break;

//					case SIDEWAYS_FOLDABLE:
//						stowFoldableLuggage();
//						break;
//
//					case LIFTING_SEAT_PAN:
//						stowFoldableLuggage();
//						break;

					case BRING_YOUR_OWN:
						break;
					}
				}

				// if the walking speed is zero, run collision as long as it remains zero
				double currentWalkingSpeed = AgentSpeedHandler.getSpeed(this);

				while (currentWalkingSpeed <= 0) {

					Collision.run(this);

					if (exitTheMainLoop) {
						break mainloop;
					}

					accelerationFactor = 0.4;
					currentWalkingSpeed = AgentSpeedHandler.getSpeed(this);
				}

				/*
				 * acceleration after standing (Increases every step by the scale value. As it
				 * is set to 0.4 after standing, it will take 0.6 meters to achieve 1.0 (full
				 * walking speed) which is equal to a standard step length)
				 */
				if (accelerationFactor < 1.0) {
					accelerationFactor += handler.getSettings().getSimulationGridResolution();
				}

				double stepDuration = 1.0 / (currentWalkingSpeed * accelerationFactor)
						* handler.getSettings().getSimulationGridResolution();

				// if there is no obstacle or luggage stowing required, run the default step
				Step.run(this, stepDuration);

				// then perform the step
				stepIndex++;

				// as the agent has taken a new step, allow overtaking attempts again!
				blockOvertakingAttempts(false);

				// save speed value normalized by free walking speed
				speedOnPath.add(currentWalkingSpeed / passenger.getWalkingSpeed());

				// sleep as long as one step takes
				Thread.sleep(getSimulationTimeFor(stepDuration));

			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is the main path following loop for the agent.
	 */
	private void followDisembarkingPath() {

//		if (path == null || path.size() == 0) {
//			throw new IllegalArgumentException("Path is null!");
//		}
//
//		boolean didGrabLuggage = false;
////		double accelerationFactor = 1;
//
//		/* define the try catch loop as main loop */
//		mainloop: try {
//
//			// stepIndex represents the number of steps taken as well as the current step
//			// count. The actual position is one step behind stepIndex, so stepIndex is the
//			// desired step.
//			int stepIndex = 0;
//
//			/* run the path up to its end */
//			while (stepIndex < path.size()) {
//
//				// at the first step, there is no current location but only a desired first
//				// location. So ignore this at the first loop.
//				if (stepIndex != 0) {
//
//					// the current position is the last taken step in the path
//					passenger.setCurrentPosition(
//							EPointExtensions.transformIntVector(path.get(stepIndex - 1).getPosition()));
//
//				}
//
//				/* the new planned location is current step in the path */
//				passenger.setDesiredPosition(EPointExtensions.transformIntVector(path.get(stepIndex).getPosition()));
//
//				if (isOnAisle() && !didGrabLuggage) {
//					didGrabLuggage = true;
//
//					// change state and influence area
//					blockArea(passenger.getCurrentPosition(), false, false);
//					passenger.setState(State.RETRIEVE_LUGGAGE);
//					blockArea(passenger.getCurrentPosition(), true, true);
//
//					Thread.sleep(time(PassengerExtensions.getLuggageStowingTime(passenger)));
//				}
//
//				/* check if the desired next step is blocked by someone else */
//				if (AgentFunctions.isPathBlockedAtIndex(this, stepIndex + 3)) {
//
//					Collision.run(this);
//
//					if (exitTheMainLoop) {
//
//						/* exit this loop */
//						break mainloop;
//					}
//
//				} else {
//
//					Step.run(this);
//
//					/* then perform the step */
//					stepIndex++;
//
//					// save speed value
//					speedOnPath.add(currentWalkingSpeed / passenger.getWalkingSpeed());
//
//					/* sleep as long as one step takes */
//					Thread.sleep((int) (1000 / handler.getSettings().getSimulationSpeedFactor()
//							/ passenger.getWalkingSpeed() / (100 / scale)));
//				}
//
////  ************************************** New walking speed calculation ****************************
////				// calculate the walking speed for the next step
////				currentWalkingSpeed = walkingSpeed();
////
////				// if the walking speed is zero, run collision as long as it remains zero
////				while (currentWalkingSpeed <= 0) {
////
////					Collision.run(this);
////
////					if (exitTheMainLoop) {
////						break mainloop;
////					}
////
////					currentWalkingSpeed = walkingSpeed();
////					accelerationFactor = 0.4;
////				}
////
////				/* acceleration after standing
////				 * (Increases every step by the scale value. As it is set to 0.4 after standing,
////				 * it will take 0.6 meters to achieve 1.0 (full walking speed) which is equal to
////				 * a standard step length)
////				 */
////				if (accelerationFactor < 1.0) {
////					accelerationFactor += scale;
////				}
////
////				// if there is no obstacle or luggage stowing required, run the default step
////				Step.run(this);
////
////				// then perform the step
////				stepIndex++;
////
////				// as the agent has taken a new step, allow overtaking attempts again!
////				blockOvertakingAttempts(false);
////
////				// save speed value normalized by free walking speed
////				speedOnPath.add(currentWalkingSpeed / passenger.getWalkingSpeed());
////
////				// sleep as long as one step takes
////				Thread.sleep(time(1 / (currentWalkingSpeed * accelerationFactor) * scale));
//
//			}
//
//			/* catch possible interruptions */
//		} catch (InterruptedException | ConcurrentModificationException e) {
//			e.printStackTrace();
//		}
	}

	/**
	 *
	 * @return
	 */
	public Passenger getBlocker() {
		return blocker;
	}

	/**
	 * Gets the cost map.
	 *
	 * @return the cost map
	 */
	public Costmap getCostMap() {
		return finalCostmap;
	}

	/**
	 *
	 * @return
	 */
	public int getNumberOverheadBinFull() {
		return overheadBinFull;
	}

	/**
	 *
	 * @return
	 */
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 *
	 * @return
	 */
	public Path getPath() {
		return path;
	}

	/**
	 * This method returns the thread.
	 *
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	public boolean getWaitingCompleted() {
		return waitingCompleted;
	}

	/**
	 * Goal reached.
	 *
	 * @return true
	 */
	private boolean goalReached() {
		return BHLMath.toInt(passenger.getDesiredPosition().getX()) == BHLMath.toInt(passenger.getGoalPosition().getX())
				&& BHLMath.toInt(passenger.getDesiredPosition().getY()) == BHLMath
						.toInt(passenger.getGoalPosition().getY());

	}

	public boolean isCurrentlySearchingForPath() {
		return currentlySearchingForPath;
	}

	/**
	 * Checks if is exit path loop.
	 *
	 * @return true, if is exit path loop
	 */
	public boolean isExitPathLoop() {
		return exitTheMainLoop;
	}

	/**
	 *
	 * @return
	 */
	public boolean isOvertakingBlocked() {
		return blockOvertakingAttempts;
	}

//	/**
//	 * check if agent is close to CLS at assigned door
//	 *
//	 * @return
//	 */
//	public boolean isPassengerInRangeOfCenterLuggageStorage() {
//
////		LuggageStorage center = AgentFunctions.getCenterLuggageStorageAtDoor(passenger.getDoor());
//
//		if (center == null) {
//			return false;
//		}
//
//		double yPositionOfCenterLuggageStorage = center.getPosition().getY() + center.getSize().getY();
//
//		return Distance.distanceBetween(yPositionOfCenterLuggageStorage / scale, 0,
//				passenger.getDesiredPosition().getY(), 0) <= 5;
//	}

	/**
	 * This method returns if the passenger is ready to stow his luggage.
	 *
	 * @return return true if the passenger does have luggage and if he is near his
	 *         seat
	 */
	public boolean isPassengerReadyToStowLuggageInRow() {
		return Distance.distanceBetween(
				SeatExtensions.getPosition(passenger.getSeat()).getX()
						/ handler.getSettings().getSimulationGridResolution(),
				0, passenger.getDesiredPosition().getX(), 0) <= passenger.getLuggage().get(0).getStowDistance()
						/ handler.getSettings().getSimulationGridResolution();
	}

	/**
	 * Passenger unfolds seat
	 *
	 * @return true, if successful
	 */
	public boolean isPassengerReadyToUnfoldsSeat() {
		return (passenger.getSeat().getSeatType() == SeatType.SIDEWAYS_FOLDABLE
				|| passenger.getSeat().getSeatType() == SeatType.LIFTING_SEAT_PAN)
				&& Distance.distanceBetween(
						SeatExtensions.getPosition(passenger.getSeat()).getX()
								/ handler.getSettings().getSimulationGridResolution(),
						0, passenger.getDesiredPosition().getX(),
						0) <= 10 / handler.getSettings().getSimulationGridResolution();
	}

	/**
	 * Perform final elements.
	 *
	 * @return true, if successful
	 */
	public boolean performFinalElements() {

		if (EObjectHelper.getParent(Model.class, passenger).getSettings()
				.getSimulationType() == SimulationType.BOARDING) {

			if (!passenger.isIsSeated()) {
				// clearBlockedArea needs to be executed before defineSeated
				clearBlockedArea();
				defineSeated();
				passenger.getSpeedOnPath().clear();
				passenger.getSpeedOnPath().addAll(speedOnPath);
				stopBoardingStatistics();

				contactTracingHandler.evaluateContactTracing(handler.getSettings().getSimulationSpeedFactor());

				return true;

			}

		} else {
			// clearBlockedArea needs to be executed before defineSeated
			clearBlockedArea();
			defineLeftCabin();
			passenger.getSpeedOnPath().clear();
			passenger.getSpeedOnPath().addAll(speedOnPath);
			stopBoardingStatistics();
			return true;
		}
		return false;
	}

	public void raiseNumberOfOverheadBinFull() {
		overheadBinFull++;
	}

//	/**
//	 * This method is used to rotate the agent!. <b> Caution! The value represents
//	 * the absolute rotation! </b>
//	 *
//	 * @param absoluteRotationInDegree is the rotation in degrees
//	 */
//	protected void rotatTo(int absoluteRotationInDegree) {
//		blockArea(passenger.getCurrentPosition(), false, false, 0);
//		blockArea(passenger.getCurrentPosition(), true, true, absoluteRotationInDegree);
//	}

	/**
	 * This method runs the agents walking simulation.
	 */
	@Override
	public void run() {

		try {
			switch (handler.getSettings().getSimulationType()) {
			case BOARDING:
				runBoarding();
				break;
			case DEBOARDING:
				runDisembarking();
				break;
			case EMERGENCY:
				// NOT IMPLEMENTED!
				break;
			}

		} catch (InterruptedException e) {
			System.out.println("Agent: InterruptedException @ thread " + Thread.currentThread().getName());
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

	/**
	 *
	 * @throws InterruptedException
	 */
	private void runBoarding() throws InterruptedException {

		/* set the current position to the starting point */
		passenger.setCurrentPosition(passenger.getStartPosition());

		// sleep the thread as long as the boarding delay requires it
		if (passenger.getStartBoardingAfterDelay() != 0) {
			Thread.sleep(getSimulationTimeFor(passenger.getStartBoardingAfterDelay()));
		}

		// Check if access is granted
		while (handler.cabinAccessGranted(this) == false) {
			Thread.sleep(handler.getSettings().getThreadSleepTimeDefault() * 10);
		}

		/* tell the handler that the passengers now enters the cabin */
		handler.setPassengerActive(passenger);

		passenger.setState(State.FOLLOW_PATH);
		passenger.setDistanceWalked(0);

		/* start counting the elapsed time for boarding */
		stopwatch = new StopWatch();

		/* run path following as long as the goal is not reached yet */
		while (!goalReached()) {

			/* this is run again if the agent detects obstacles in his path */
			followBoardingPath();
		}

		// if it is the normal boarding mode, the passenger will sit down after reaching
		// his seat and do the sitting down procedure.
		if ((passenger.getSeat().getSeatType() == SeatType.SIDEWAYS_FOLDABLE
				|| passenger.getSeat().getSeatType() == SeatType.LIFTING_SEAT_PAN)
				&& passenger.getSeat().getSeatLocation() == SeatLocation.AISLE) {

			UnfoldSeat.run(this);
		}
		performFinalElements();
	}

	/**
	 *
	 */
	private void runDisembarking() throws InterruptedException {

		/* set the current position to the starting point */
		passenger.setCurrentPosition(passenger.getStartPosition());

		/* passengers stand up at the same time */
		handler.setPassengerActive(passenger);

		passenger.setState(State.FOLLOW_PATH);

		/* start counting the elapsed time for boarding */
		stopwatch = new StopWatch();

		/* run path following as long as the goal is not reached yet */
		while (!goalReached()) {

			/* this is run again if the agent detects obstacles in his path */
			followDisembarkingPath();
		}

		performFinalElements();

	}

	public void setAlreadyStowed(boolean stowed) {
		alreadyStowed = stowed;
	}

	/**
	 *
	 * @param costmap
	 */
	public void setCostMap(Costmap costmap) {
		finalCostmap = costmap;
	}

	/**
	 * Sets the exit path loop.
	 *
	 * @param exitPathLoop the new exit path loop
	 */
	public void setExitPathLoop(boolean exitPathLoop) {
		exitTheMainLoop = exitPathLoop;
	}

	public void setIsCurrentlySearchingForPath(boolean currentlySearching) {
		currentlySearchingForPath = currentlySearching;

	}

	/**
	 *
	 * @param newPath
	 */
	public void setPath(Path newPath) {

		Node currentNode = newPath.get(0);

		if (path != null) {
			path.removeAllNodesAfter(currentNode.getPosition());
			newPath.remove(0);
		}

		newPath.prependPath(path);
		path = newPath;

		if (path != null) {
			stepIndex = path.indexOf(currentNode);
		}
	}

	public void setWaitingCompleted(boolean b) {
		waitingCompleted = true;
	}

	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (thread == null) {
			thread = new Thread(this, passenger.getId() + " (" + passenger.getSeat() + ")");
			thread.start();
		}
	}

	/**
	 *
	 */
	private void stopBoardingStatistics() {

		// the stop watch is interrupted
		stopwatch.stop();

		// the boarding time is then submitted back to the passenger
		passenger.setBoardingTime(
				stopwatch.getElapsedTime() / 1000.0 * handler.getSettings().getSimulationSpeedFactor());

//		clearBlockedArea();
	}

	/**
	 * Stop thread.
	 */
	public void stopThread() {
		thread.interrupt();
	}

	/**
	 * only default seats
	 */
	private void stowDefaultLuggage() {

//		if (isPassengerInRangeOfCenterLuggageStorage() && handler.getSettings().isUseCenterLuggageStorage()) {
//			StowLuggage.run(this, AgentFunctions.getCenterLuggageStorageAtDoor(passenger.getDoor()) != null);
//
//		} else

		if (isPassengerReadyToStowLuggageInRow()) {

//			StowLuggage.run(this, AgentFunctions.getCenterLuggageStorageAtDoor(passenger.getDoor()) == null);
			StowLuggage.run(this, false);
		}

		if (!waitingCompleted && waitingForClearingOfRow()) {
			WaitForClearing.run(this);
		}
	}

//	/**
//	 * Decision point: normal luggage stowing distance if the seat is still folded,
//	 * the agent can stow his luggage directly at the seat position TODO: case if
//	 * seat is unfolded in the meantime.
//	 */
//	private void stowFoldableLuggage() {
//
//		if (!stowingAtAisleSeat) {
//
//			if (isPassengerInRangeOfCenterLuggageStorage()) {
//
//				StowLuggage.run(this, AgentFunctions.getCenterLuggageStorageAtDoor(passenger.getDoor()) != null);
//
//			} else if (isPassengerReadyToStowLuggageInRow()) {
//
//				if (PassengerExtensions.getBySeat(AgentFunctions.getMyAisleSeat(this)).isIsSeated()) {
//
//					/* luggage is stowed at normal position */
//					StowLuggage.run(this, AgentFunctions.getCenterLuggageStorageAtDoor(passenger.getDoor()) == null);
//
//				} else {
//					stowingAtAisleSeat = true;
//				}
//			}
//		}
//
//		// luggage is stowed at the aisle seat and the agent is close
//		if (stowingAtAisleSeat && AgentFunctions.canPassengerPerformActionAtAisleSeat(this)) {
//			StowLuggage.run(this, false);
//		}
//
//		/* check if the seats in my side of the row have been checked */
//		if (!waitingCompleted) {
//
//			if (waitingForClearingOfRow()) {
//				if (PassengerExtensions.getBySeat(AgentFunctions.getMyAisleSeat(this)).isIsSeated()) {
//					WaitForClearing.run(this);
//				} else {
//					waitingAtAisleSeat = true;
//				}
//			}
//
//			if (waitingAtAisleSeat && AgentFunctions.canPassengerPerformActionAtAisleSeat(this)) {
//				WaitForClearing.run(this);
//			}
//		}
//	}

	/**
	 * Waiting for clearing of row.
	 *
	 * @return true, if successful
	 */
	private boolean waitingForClearingOfRow() {

		if ((int) Distance.distanceBetween(
				SeatExtensions.getPosition(passenger.getSeat()).getX()
						/ handler.getSettings().getSimulationGridResolution(),
				0, passenger.getDesiredPosition().getX(), 0) == Agent.PIXELS_FOR_WAY) {

			return AgentFunctions.someoneAlreadyInThisPartOfTheRow(this);
		}
		return false;
	}

	/**
	 * @param realTimeInSeconds
	 * @return
	 */
	public int getSimulationTimeFor(double realTimeInSeconds) {

		// Calculate delay in milliseconds
		double real = realTimeInSeconds * 1000.0 / handler.getSettings().getSimulationSpeedFactor();

		// Check if delay is so small that it cannot be differentiated anymore
		if (real < 1.5) {
			System.err.println("Thread sleep reached minimum! Consider slowing down simulation. [" + real + "ms]");
		}

		// Return value as int or 1.
		return real < 1 ? 1 : BHLMath.toInt(real);
	}

	/**
	 * @param passenger
	 */
	public void setBlocker(Passenger passenger) {
		blocker = passenger;
	}

	/**
	 * @return
	 */
	public SimulationHandler getHandler() {
		return handler;
	}

	/**
	 * @return
	 */
	public int getStepIndex() {
		return stepIndex;
	}

	/**
	 * @return
	 */
	public AgentShapeHandler getShapeHandler() {
		return shapeHandler;
	}

	public ContactTracingHandler getContactTracingHandler() {
		return contactTracingHandler;
	}
}
