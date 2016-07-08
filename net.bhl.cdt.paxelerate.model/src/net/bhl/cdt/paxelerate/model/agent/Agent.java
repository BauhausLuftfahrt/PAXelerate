/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.model.agent;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.LuggageSize;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerMood;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.agent.action.AgentAction;
import net.bhl.cdt.paxelerate.model.agent.action.AgentActionType;
import net.bhl.cdt.paxelerate.model.agent.action.options.Step;
import net.bhl.cdt.paxelerate.model.agent.action.options.StowLuggage;
import net.bhl.cdt.paxelerate.model.agent.action.options.UnfoldSeat;
import net.bhl.cdt.paxelerate.model.agent.action.options.Wait;
import net.bhl.cdt.paxelerate.model.agent.action.options.WaitForClearing;
import net.bhl.cdt.paxelerate.model.agent.enums.AgentMode;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.agent.mood.AgentMood;
import net.bhl.cdt.paxelerate.model.agent.mood.options.AggressiveMood;
import net.bhl.cdt.paxelerate.model.agent.mood.options.PassiveMood;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.model.astar.Path;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.astar.node.Node;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;
import net.bhl.cdt.paxelerate.model.observer.Subject;
import net.bhl.cdt.paxelerate.model.util.Rotator;
import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.GaussianRandom;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;

/**
 * This class is the agent object. It walks a specific calculated path and
 * reacts to obstacles occurring on the go.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.2
 * @since 0.5
 *
 */
public class Agent extends Subject implements Runnable {

	/** The thread. */
	private Thread thread;

	/** The path. */
	private Path path;

	/** The Constant PIXELS_FOR_WAY. */
	private final static int PIXELS_FOR_WAY = 7;

	/** The current position. */
	private Vector start, goal, desiredPosition, currentPosition;

	/** The dim. */
	private int numbOfInterupts = 0, waycounter = 0, dim = 2;

	/** The way making skipped. */
	private int wayMakingSkipped = 0;
	private int wayMakingCompleted = 0;

	/** The way making foldable seat skipped. */
	private int wayMakingFoldableSeatSkipped = 0;

	/** The total waiting time. */
	private long totalWaitingTime = 0;

	/** The moved once. */
	private boolean alreadyStowed = false, waitingCompleted = false,
			exitTheMainLoop = false, movedOnce = false, foldingSeats = false,
			stowingAtAisleSeat = false, waitingAtAisleSeat = false,
			aisleSeat = false;

	/** The stopwatch. */
	private StopWatch stopwatch = new StopWatch();

	/** The pathlist. */
	private ArrayList<Path> pathlist = new ArrayList<Path>();

	/** The agent mood. */
	private AgentMood agentMood;

	/** The blocking agent. */
	private Agent blockingAgent;

	/** The final costmap. */
	/* constant values */

	private final Costmap finalCostmap;

	/** The passenger. */
	private final Passenger passenger;

	/** The scale. */
	private final int scale;

	/** The developer mode. */
	private final boolean developerMode;

	/** The waiting time after collision. */
	private final double waitingTimeAfterCollision;

	/** The mode. */
	private final AgentMode mode;

	/** The current state. */
	private State currentState;

	/** The passenger i let in the row. */
	private Passenger thePassengerILetInTheRow;

	/** The sim settings. */
	private SimulationProperties simSettings;

	/** The last move time. */
	private long lastMoveTime;

	/**
	 * Gets the the passenger i let in the row.
	 *
	 * @return the the passenger i let in the row
	 */
	public Passenger getThePassengerILetInTheRow() {
		return thePassengerILetInTheRow;
	}

	/**
	 * Gets the last move timestamp.
	 *
	 * @return the last move timestamp
	 */
	public long getLastMoveTimestamp() {
		return lastMoveTime;
	}

	/**
	 * Gets the waiting time after collision.
	 *
	 * @return the waiting time after collision
	 */
	public long getWaitingTimeAfterCollision() {
		return (long) waitingTimeAfterCollision;
	}

	/**
	 * Gets the cost map.
	 *
	 * @return the cost map
	 */
	public Costmap getCostMap() {
		return finalCostmap;
	}

	/** The rotated footprint. */
	private int[][] footprint, rotatedFootprint;

	/**
	 * This method constructs an agent.
	 *
	 * @param passenger
	 *            the passenger which is represented by the agent
	 * @param start
	 *            the starting vector
	 * @param goal
	 *            the goal vector
	 * @param costmap
	 *            the costmap
	 * @param mode
	 *            the mode
	 * @param thePassengerILetInTheRow
	 *            the the passenger i let in the row
	 */
	public Agent(Passenger passenger, Vector start, Vector goal,
			Costmap costmap, AgentMode mode,
			Passenger thePassengerILetInTheRow) {

		/* assign the initializer values to the objects values */
		this.mode = mode;
		this.passenger = passenger;
		this.start = start;
		this.goal = goal;

		this.scale = SimulationHandler.getCabin().getSimulationSettings()
				.getScale();

		this.finalCostmap = costmap;
		this.thePassengerILetInTheRow = thePassengerILetInTheRow;
		this.simSettings = SimulationHandler.getCabin().getSimulationSettings();
		this.developerMode = simSettings.isDeveloperMode();
		this.foldingSeats = (simSettings
				.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT
				|| simSettings
						.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS);
		this.aisleSeat = "CD".contains(passenger.getSeat().getLetter());
		this.waitingTimeAfterCollision = simSettings.getPassengerProperties()
				.getPassivePassengerWaitingTimeAfterCollision();

		/* generate a mood for the passenger depending on his presets */
		if (passenger.getPassengerMood() == PassengerMood.AGGRESSIVE) {
			this.agentMood = new AggressiveMood(this);
		} else if (passenger.getPassengerMood() == PassengerMood.PASSIVE) {
			this.agentMood = new PassiveMood(this);
		}

		// this.agentMood = new AgressiveMood(this);

		footprint = new int[passenger.getWidth() / scale][passenger.getDepth()
				/ scale];
		for (int i = 0; i < passenger.getWidth() / scale; i++) {
			for (int j = 0; j < passenger.getDepth() / scale; j++) {
				footprint[i][j] = 1;
			}
		}

	}

	/** The other passengers in row blocking me. */
	public ArrayList<Passenger> otherPassengersInRowBlockingMe = new ArrayList<Passenger>();

	/**
	 * Gets the other passengers in row blocking me.
	 *
	 * @return the other passengers in row blocking me
	 */
	public Passenger getOtherPassengersInRowBlockingMe() {
		if (!otherPassengersInRowBlockingMe.isEmpty()) {
			return otherPassengersInRowBlockingMe.get(0);
		} else {
			return null;
		}
	}

	/**
	 * Reset agent.
	 */
	public void resetAgent() {
		thread = null;
		path = null;
		start = null;
		goal = null;
		desiredPosition = null;
		currentPosition = null;
		thePassengerILetInTheRow = null;
		simSettings = null;

		pathlist.clear();
		// finalCostmap = null;
		// passenger = null;
	}

	/**
	 * Gets the passenger.
	 *
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 * Sets the current state.
	 *
	 * @param status
	 *            the new current state
	 */
	public void setCurrentState(State status) {
		this.currentState = status;
	}

	/**
	 * Gets the current state.
	 *
	 * @return the current state
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * Gets the agent mode.
	 *
	 * @return the agent mode
	 */
	public AgentMode getAgentMode() {
		return mode;
	}

	/**
	 * Gets the blocking agent.
	 *
	 * @return the blocking agent
	 */
	public Agent getBlockingAgent() {
		return blockingAgent;
	}

	/**
	 * Sets the blocking agent.
	 *
	 * @param blockingAgent
	 *            the new blocking agent
	 */
	public void setBlockingAgent(Agent blockingAgent) {
		this.blockingAgent = blockingAgent;
	}

	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public Vector getStart() {
		return start;
	}

	/**
	 * Gets the current position.
	 *
	 * @return the current position
	 */
	public Vector getCurrentPosition() {
		return currentPosition;
	}

	/**
	 * Gets the desired position.
	 *
	 * @return the desired position
	 */
	public Vector getDesiredPosition() {
		return desiredPosition;
	}

	/**
	 * Gets the goal.
	 *
	 * @return the goal
	 */
	public Vector getGoal() {
		return goal;
	}

	/**
	 * Did move once.
	 *
	 * @return true, if successful
	 */
	public boolean didMoveOnce() {
		return movedOnce;
	}

	/**
	 * Increase total waiting time.
	 *
	 * @param time
	 *            the time
	 */
	public void increaseTotalWaitingTime(long time) {
		totalWaitingTime = totalWaitingTime + time;
	}

	/**
	 * Checks for luggage.
	 *
	 * @return true, if successful
	 */
	private boolean hasLuggage() {
		return (passenger.getLuggage() != LuggageSize.NONE);
	}

	/**
	 * This method returns the distance form the seat where PAX is stowing his
	 * luggage in multiple of the current map scaling.
	 *
	 * @return distance in multiple of the current map scaling
	 */
	private int getLuggageStowDistance() {
		return (int) (passenger.getLuggageStowDistance() / scale);
	}

	/**
	 * This method returns if the passenger is ready to stow his luggage.
	 *
	 * @return if the passenger is ready to stow luggage
	 */
	public boolean passengerStowsLuggage() {
		/*
		 * return true if the passenger does have luggage and if he is near his
		 * seat
		 */
		return (hasLuggage() && isInRangeEqual(
				passenger.getSeat().getXPosition(),
				desiredPosition.getX() * scale, getLuggageStowDistance()));
	}

	/**
	 * Passenger stows luggage at aisle seat.
	 *
	 * @return true, if successful
	 */
	public boolean passengerStowsLuggageAtAisleSeat() {
		int yCoordAisleSeat = 0;
		int distanceToAisleSeat = 1;

		for (Seat seat : passenger.getSeat().getRow().getSeats()) {
			if ("ABC".contains(passenger.getSeat().getLetter())) {
				if ("C".contains(seat.getLetter())) {
					yCoordAisleSeat = seat.getYPosition()
							+ seat.getYDimension() / 2;
				}
			} else if ("DEF".contains(passenger.getSeat().getLetter())) {
				if ("D".contains(seat.getLetter())) {
					yCoordAisleSeat = seat.getYPosition()
							+ seat.getYDimension() / 2;
				}
			}
		}

		return (hasLuggage() && isInRangeSmaller((int) passenger.getPositionY(),
				yCoordAisleSeat, distanceToAisleSeat));
	}

	/**
	 * Passenger wait at aisle seat.
	 *
	 * @return true, if successful
	 */
	public boolean passengerWaitAtAisleSeat() {
		int yCoordAisleSeat = 0;
		int distanceToAisleSeat = 1;

		for (Seat seat : passenger.getSeat().getRow().getSeats()) {
			if ("ABC".contains(passenger.getSeat().getLetter())) {
				if ("C".contains(seat.getLetter())) {
					yCoordAisleSeat = seat.getYPosition()
							+ seat.getYDimension() / 2;
				}
			} else if ("DEF".contains(passenger.getSeat().getLetter())) {
				if ("D".contains(seat.getLetter())) {
					yCoordAisleSeat = seat.getYPosition()
							+ seat.getYDimension() / 2;
				}
			}
		}

		return isInRangeSmaller((int) passenger.getPositionY(), yCoordAisleSeat,
				distanceToAisleSeat);
	}

	/**
	 * Checks if is in x/y range equal.
	 *
	 * @param position
	 *            the position
	 * @param desiredPosition
	 *            the desired position
	 * @param range
	 *            the range
	 * @return true, if is in x/y range equal
	 */
	private boolean isInRangeEqual(int position, int desiredPosition,
			int range) {

		if (Math.abs((desiredPosition - position) / scale) == range) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if is in x/y range smaller.
	 *
	 * @param position
	 *            the position
	 * @param desiredPosition
	 *            the desired position
	 * @param range
	 *            the range
	 * @return true, if is in x/y range smaller
	 */
	private boolean isInRangeSmaller(int position, int desiredPosition,
			int range) {

		if (Math.abs((desiredPosition - position) / scale) < range) {
			return true;
		}
		return false;
	}

	/**
	 * Checks for foldable seat.
	 *
	 * @return true, if successful
	 */
	private boolean hasFoldableSeat() {
		return (passenger.getSeat()
				.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT
				|| passenger.getSeat()
						.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS);
	}

	/**
	 * Gets the seat folding distance.
	 *
	 * @return the seat folding distance
	 */
	private int getSeatFoldingDistance() {
		return 10 / scale;
	}

	/**
	 * Passenger unfolds seat.
	 *
	 * @return true, if successful
	 */
	public boolean passengerUnfoldsSeat() {
		/*
		 * return true if the passenger does have luggage and if he is near his
		 * seat
		 */
		return (hasFoldableSeat() && isInRangeEqual(
				passenger.getSeat().getXPosition(),
				desiredPosition.getX() * scale, getSeatFoldingDistance()));
	}

	/**
	 * This method occupies a specific area within the area map.
	 * 
	 * @param vector
	 *            the vector with the location
	 * @param occupy
	 *            boolean which decides if the area will be blocked or unblocked
	 * @param rotateOnly
	 *            set to true if you want to rotate the object a specific angle
	 * @param rotation
	 *            is the specific angle
	 */

	synchronized void blockArea(Vector vector, boolean occupy,
			boolean rotateOnly, Integer rotation) {

		/*
		 * switch the property depending on whether a node is blocked or release
		 */
		Property property = Property.DEFAULT;

		if (occupy) {
			property = Property.AGENT;
		}

		/*
		 * check the possibility that the node is already blocked by an agent.
		 * Normally this should never happen.
		 */
		if (SimulationHandler.getMap().get(vector)
				.getProperty() == Property.AGENT && occupy) {
		}

		/*
		 * Rotate the 2d integer array which has stored the layout of the agent.
		 * Note that this method is only accessed when occupying, not when
		 * releasing. This prevents the code from forgetting to release certain
		 * nodes during rotation procedures.
		 */
		if (occupy) {

			/* if you want to rotate only, you can specify the rotation angle */
			if (rotateOnly) {
				rotatedFootprint = Rotator.rotate(rotation, footprint);

				/* if you want to do auto rotation, this method is called. */
			} else {
				if (rotationAllowed()) {
					rotatedFootprint = Rotator.rotate(
							AgentFunctions.getRotation(this), footprint);
				} else {
					rotatedFootprint = null;
				}

			}
		}

		/*
		 * if no rotation is needed or possible, skip the rotation process and
		 * assign the basic layout to the object.
		 */
		if (rotatedFootprint == null) {
			rotatedFootprint = footprint;
		}

		/*
		 * get the square dimension. This is the maximum of the two following
		 * values.
		 */

		double dimension = Math.max(rotatedFootprint.length,
				rotatedFootprint[1].length);

		/*
		 * this is the dimension you need to go in every direction from the
		 * starting point. It is half the way back in every dimension.
		 */
		dim = (int) (dimension / 2);

		/* loop through the whole passenger area in the area map */
		for (int x = -dim; x <= dim; x++) {
			for (int y = -dim; y <= dim; y++) {

				/* the location currently under investigation */
				Vector location = new Vector2D(vector.getX() + x,
						vector.getY() + y);

				/* if the point is within the bounds of the passenger area */
				if (x + dim < rotatedFootprint.length
						&& y + dim < rotatedFootprint[0].length) {

					/*
					 * if the passenger area has a passenger located on this
					 * specific node
					 */
					if (rotatedFootprint[x + dim][y + dim] == 1) {

						/* block or deblock the specific node */
						AgentMover.blockNode(location, occupy, property,
								this.passenger);
					}
				}
			}
		}
	}

	/**
	 * This method is used to rotate the agent!.
	 *
	 * @param degrees
	 *            is the rotation in degrees
	 */
	public void rotateAgent(int degrees) {
		if (rotationAllowed()) {
			blockArea(currentPosition, false, false, null);
			blockArea(currentPosition, true, true, degrees);
		}
	}

	/**
	 * This method defines whether rotation is allowed or not.
	 * 
	 * @return allowed or not
	 */
	private boolean rotationAllowed() {
		if (currentPosition.getY() < 1) {
			return false;
		}
		return true;
	}

	/**
	 * When there is a new path found, this method cuts the old path up to the
	 * current point so that there is no overlapping with the new path but
	 * instead a matching complete path.
	 */
	public void redefinePathLayout() {

		/* get the path used by the agent before finding a new one. */
		Path pathhelper = pathlist.get(pathlist.size() - 1);

		/* then remove that path */
		pathlist.remove(pathhelper);

		/* cut the path up to the current location */
		pathhelper = pathhelper.cutToPosition(pathhelper, currentPosition);

		/* add the path back to the list */
		pathlist.add(pathhelper);

		/* add the newly calculated path as well */
		pathlist.add(path);

		int costOfPaths = 0;

		for (Path path : pathlist) {
			costOfPaths += path.getCost();
		}

		passenger.setCostOfPath(costOfPaths);
	}

	boolean firstPathCalculation() {
		return pathlist.isEmpty();
	}

	/**
	 * This method returns the current position of the agent.
	 *
	 * @return the current position
	 */
	public Vector getPosition() {
		return currentPosition;
	}

	/**
	 * Goal reached.
	 *
	 * @return true, if successful
	 */
	private boolean goalReached() {
		return (desiredPosition.equals(goal));
	}

	/**
	 * This method check if the node is blocked and if so, if the node was
	 * blocked by someone else or this agent.
	 * 
	 * @param vector
	 *            the specific vector
	 * @return if the node is blocked by someone else
	 */
	private Property nodeBlocked(Vector vector) {

		/*
		 * loop through values from - dimension to + dimension (hard coded : 2)
		 */
		for (int y = -dim; y <= dim; y++) {

			/* only use the positive y direction */
			int x = dim;

			/*
			 * if the door is behind the seat, the scanning will be in the
			 * opposite direction
			 */
			if (passenger.getSeat().getXPosition() < passenger.getDoor()
					.getXPosition()) {
				x = -(x + 1);
			}

			/* get the node at the requested location */
			Node checkNode = SimulationHandler.getMap().get(vector.getX() + x,
					vector.getY() + y);

			if (checkNode != null) {

				/* check if the node is already blocked */
				if (checkNode.getProperty() == Property.AGENT) {

					/* check if its was not this agent who blocked it */
					if (checkNode.getPassenger().getId() != this.passenger
							.getId()) {

						/*
						 * determine the passenger who currently blocks the path
						 */
						for (Agent agent : SimulationHandler.getAgentList()) {

							/*
							 * compare the agent id with the id linked to the
							 * blocked node
							 */
							if (agent.getPassenger().getId() == checkNode
									.getPassenger().getId()) {

								/* find the blocking agent */
								this.blockingAgent = agent;
							}
						}
						return Property.AGENT;
					}
				}
				if (checkNode.isObstacle()) {
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * Gets the path list.
	 *
	 * @return the path list
	 */
	public ArrayList<Path> getPathList() {
		return pathlist;
	}

	/**
	 * check if there is still on passenger seated.
	 *
	 * @return true, if successful
	 */
	private boolean otherPassengerStoodUp() {
		for (Passenger pax : otherPassengersInRowBlockingMe) {
			if (pax.isIsSeated()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Anyone near me.
	 *
	 * @return true, if successful
	 */
	private boolean anyoneNearMe() {
		for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
			if (!pax.isIsSeated()) {
				if (pax.getId() != passenger.getId()) {
					if (isInRangeSmaller(
							SimulationHandler.getAgentByPassenger(pax)
									.getCurrentPosition().getX() * scale,
							desiredPosition.getX(), 10)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Waymaking allowed.
	 *
	 * @return true, if successful
	 */
	public boolean waymakingAllowed() {
		if (SimulationHandler.waymakingInRange(passenger)) {
			waycounter++;
			if (waycounter < 30) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

	/**
	 * Waiting for clearing of row.
	 *
	 * @return true, if successful
	 */
	private boolean waitingForClearingOfRow() {

		if (isInRangeEqual(passenger.getSeat().getXPosition(),
				desiredPosition.getX() * scale, PIXELS_FOR_WAY)) {
			if (AgentFunctions.someoneAlreadyInThisPartOfTheRow(this)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Occupy one step ahead.
	 */
	public synchronized void occupyOneStepAhead() {
		blockArea(currentPosition, false, false, null);
		blockArea(desiredPosition, true, false, null);
		SimulationHandler.getMap().get(desiredPosition)
				.raiseNumberOfOccupations();
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
	 * Define seated.
	 *
	 * @param isSeated
	 *            the is seated
	 */
	private void defineSeated(boolean isSeated) {

		/* when the goal is reached, the passenger is defined seated */
		passenger.setIsSeated(isSeated);

		/* then the assigned seat is declared occupied */
		passenger.getSeat().setOccupied(isSeated);

		/* RunAStar is notified that a passenger is seated now */
		SimulationHandler.setPassengerSeated(passenger, isSeated);
	}

	/**
	 * In default boarding mode.
	 *
	 * @return true, if successful
	 */
	private boolean inDefaultBoardingMode() {
		if (mode == AgentMode.MAKE_WAY) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Sets the exit path loop.
	 *
	 * @param exitPathLoop
	 *            the new exit path loop
	 */
	public void setExitPathLoop(boolean exitPathLoop) {
		this.exitTheMainLoop = exitPathLoop;
	}

	/**
	 * Interrupt agent.
	 *
	 * @param duration
	 *            the duration
	 */
	public void interruptAgent(int duration) {
		try {
			Thread.sleep(duration);
			System.out.println("Sleeping!");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Sleeping not possible!");
			System.out.println("InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * Perform final elements.
	 *
	 * @return true, if successful
	 */
	public boolean performFinalElements() {

		if (!passenger.getSeat().isOccupied()) {

			/* the stop watch is interrupted */
			stopwatch.stop();

			/* clear the current position of the agent */
			blockArea(currentPosition, false, false, null);
			blockArea(desiredPosition, false, false, null);

			defineSeated(true);

			/* the boarding time is then submitted back to the passenger */
			passenger
					.setBoardingTime(stopwatch.getElapsedTime() / 1000.0
							* SimulationHandler.getCabin()
									.getSimulationSettings()
									.getSimulationSpeedFactor());

			/* the number of interrupts is submitted to the passenger */
			passenger.setNumberOfWaits(numbOfInterupts);
			passenger.setTotalTimeWaited(totalWaitingTime);
			SimulationHandler.getMap().get(getGoal())
					.setProperty(Property.DEFAULT, getPassenger());

			// stopThread();

			return true;
		} else {
			return false;
		}

	}

	/**
	 * Waymaking skipped.
	 */
	private void waymakingSkipped() {

		if (developerMode) {
			System.out.println("waymaking skipped. Delay simulated!");
		}

		long sleepTime = 0;
		try {
			if (waitingAtAisleSeat) {
				sleepTime = AStarHelper.time(GaussianRandom.gaussianRandom(
						simSettings.getPassengerProperties()
								.getSeatInterferenceProcessTimeFoldingSeatMean(),
						GaussOptions.PERCENT_95,
						simSettings.getPassengerProperties()
								.getSeatInterferenceProcessTimeFoldingSeatDeviation()));
				Thread.sleep(sleepTime);
				increaseTotalWaitingTime(sleepTime);
				wayMakingFoldableSeatSkipped++;
			} else {
				sleepTime = AStarHelper.time(GaussianRandom.gaussianRandom(
						simSettings.getPassengerProperties()
								.getSeatInterferenceProcessTimeMean(),
						GaussOptions.PERCENT_95,
						simSettings.getPassengerProperties()
								.getSeatInterferenceProcessTimeDeviation()));
				Thread.sleep(sleepTime);
				increaseTotalWaitingTime(sleepTime);
				wayMakingSkipped++;
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}

		waitingCompleted = true;

	}

	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (getThread() == null) {
			setThread(new Thread(this, passenger.getName()));
			getThread().start();
		}
	}

	/**
	 * This method returns the thread.
	 * 
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * This method sets the thread.
	 * 
	 * @param thread
	 *            the thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

	/**
	 * Stop thread.
	 */
	public void stopThread() {
		thread.interrupt();
	}

	/**
	 * Removes the.
	 */
	public void remove() {
		if (performFinalElements() == true) {
			if (developerMode) {
				System.out.println("Passenger " + passenger.getId()
						+ " is now force-seated!");
			}

		} else {
			System.out.println("Passenger is already seated!");
		}
	}

	/**
	 * Gets the number way making skipped.
	 *
	 * @return the number way making skipped
	 */

	public int getNumberWayMakingSkipped() {
		return wayMakingSkipped;
	}

	public int getNumberWayMakingCompleted() {
		return wayMakingCompleted;
	}

	/**
	 * This method is the main path following loop for the agent.
	 */
	private void followPath() {

		/* define the try catch loop as main loop */
		mainloop: try {

			/*
			 * stepIndex represents the number of steps taken as well as the
			 * current step count. The actual position is one step behind
			 * stepIndex, so stepIndex is the desired step.
			 */
			int stepIndex = 0;

			/* run the path up to its end */
			while (stepIndex < path.getLength()) {

				/*
				 * at the first step, there is no current location but only a
				 * desired first location. So ignore this at the first loop.
				 */
				if (stepIndex != 0) {

					/*
					 * the current position is the last taken step in the path
					 */
					currentPosition = path.get(stepIndex - 1).getPosition();

				}

				if (stepIndex == 2) {
					movedOnce = true;
				}

				/* the new planned location is current step in the path */
				desiredPosition = path.get(stepIndex).getPosition();

				/* check if the desired next step is blocked by someone else */
				Property property = nodeBlocked(desiredPosition);

				if (property != null) {

					/* **************************************************** */
					AgentActionType actionType = new Wait(this, scale,
							property);
					new AgentAction(actionType).perform();
					/* **************************************************** */

					if (exitTheMainLoop) {

						/* exit this loop */
						break mainloop;
					}

					/*
					 * if there is no obstacle in the way, check if the luggage
					 * should be stowed now next
					 */
				} else if (foldingSeats && !stowingAtAisleSeat && !alreadyStowed
						&& passengerStowsLuggage()) {

					/*
					 * decision point: normal luggage stowing distance if the
					 * seat is still folded, the agent can stow his luggage
					 * directly at the seat position TODO: case if seat is
					 * unfolded in the meantime
					 */

					if ((AgentFunctions
							.checkSeatFoldingStatusInRow(passenger) == 1
							&& "ABC".contains(passenger.getSeat().getLetter()))
							|| (AgentFunctions
									.checkSeatFoldingStatusInRow(passenger) == 2
									&& "DEF".contains(
											passenger.getSeat().getLetter()))) {
						stowingAtAisleSeat = true;
					} else {

						/* ************************************************* */
						AgentActionType actionType = new StowLuggage(this,
								scale, simSettings);
						new AgentAction(actionType).perform();
						/* ************************************************* */
					}

				} else if (!alreadyStowed && !stowingAtAisleSeat
						&& passengerStowsLuggage()) {

					/* **************************************************** */
					AgentActionType actionType = new StowLuggage(this, scale,
							simSettings);
					new AgentAction(actionType).perform();
					/* **************************************************** */

					/*
					 * if there is no obstacle or luggage stowing required, run
					 * the default step
					 */

				} else if (!alreadyStowed && stowingAtAisleSeat
						&& passengerStowsLuggageAtAisleSeat()) {

					/* **************************************************** */
					AgentActionType actionType = new StowLuggage(this, scale,
							simSettings);
					new AgentAction(actionType).perform();
					/* **************************************************** */

				} else if (foldingSeats && !waitingCompleted
						&& waitingForClearingOfRow()) {

					setCurrentState(State.WAITING_FOR_ROW_CLEARING);

					while (waymakingAllowed() == false) {
						increaseTotalWaitingTime(
								simSettings.getThreadSleepTimeDefault());
						Thread.sleep(simSettings.getThreadSleepTimeDefault());
					}

					if ((AgentFunctions
							.checkSeatFoldingStatusInRow(passenger) == 1
							&& "ABC".contains(passenger.getSeat().getLetter()))
							|| (AgentFunctions
									.checkSeatFoldingStatusInRow(passenger) == 2
									&& "DEF".contains(
											passenger.getSeat().getLetter()))) {
						waitingAtAisleSeat = true;
						waymakingSkipped();

					} else {

						waymakingSkipped();
					}

				} else if (!waitingCompleted && waitingForClearingOfRow()) {

					/* **************************************************** */
					AgentActionType actionType = new WaitForClearing(this,
							scale, simSettings, passenger);
					new AgentAction(actionType).perform();
					/* **************************************************** */

				} else {

					/* **************************************************** */
					AgentActionType actionType = new Step(this, scale);
					new AgentAction(actionType).perform();
					/* **************************************************** */

					/* then perform the step */
					stepIndex++;

					/* sleep as long as one step takes */
					Thread.sleep((int) (1000 / SimulationHandler.getCabin()
							.getSimulationSettings().getSimulationSpeedFactor()
							/ passenger.getWalkingSpeed() / (100 / scale)));

				}
			}

			/* catch possible interruptions */
		} catch (InterruptedException e) {
			e = new InterruptedException(
					" @ thread " + Thread.currentThread().getName());
			e.printStackTrace();
			Thread.currentThread().interrupt();

		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method runs the agents walking simulation.
	 */
	@Override
	public void run() {
		try {
			setCurrentState(State.PREPARING);

			if (!inDefaultBoardingMode()) {

				/*
				 * if the agent should clear the row for a passenger, unblock
				 * the seat
				 */

				SimulationHandler.addToWaymakingList(passenger);
				defineSeated(false);
			}

			/* set the current position to the starting point */
			currentPosition = start;

			/* add the path to the list of paths */
			pathlist.add(path);
			if (inDefaultBoardingMode()) {
				/* sleep the thread as long as the boarding delay requires it */
				Thread.sleep(AStarHelper
						.time(passenger.getStartBoardingAfterDelay()));

				/*
				 * then try to spawn the passenger but check if there is enough
				 * space in front of the cabin door
				 */

				while (SimulationHandler
						.CabinAccessGranted(passenger) == false) {
					Thread.sleep(simSettings.getThreadSleepTimeDefault());
				}
			}

			/*
			 * tell the handler that the passengers now enters the cabin
			 */

			SimulationHandler.setPassengerActive(this.passenger);

			setCurrentState(State.FOLLOWING_PATH);

			passenger.setDistanceWalked(0);

			/* start counting the elapsed time for boarding */
			stopwatch.start();

			/*
			 * run path following as long as the goal is not reached yet
			 */
			while (!goalReached()) {

				/*
				 * this is run again if the agent detects obstacles in his path
				 */
				followPath();
			}

			/*
			 * if it is the normal boarding mode, the passenger will sit down
			 * after reaching his seat and do the sitting down procedure.
			 */
			if (!inDefaultBoardingMode()) {

				/*
				 * if the passenger is clearing the path and reached his goal,
				 * he should return to his seat afterwards!
				 */

				int offset = 3;

				if (passenger.getDoor().getXPosition() > passenger.getSeat()
						.getXPosition()) {
					offset = -offset;
				}

				double position = thePassengerILetInTheRow.getPositionX();
				Cabin cabinBlocker = SimulationHandler.getCabin();
				Passenger dummyPax = CabinFactory.eINSTANCE.createPassenger();
				dummyPax.setId(Integer.MAX_VALUE);

				for (int i = 0; i < cabinBlocker.getYDimension() / cabinBlocker
						.getSimulationSettings().getScale(); i++) {
					Node node = SimulationHandler.getMap()
							.get((int) (position / cabinBlocker
									.getSimulationSettings().getScale())
									- offset, i);
					if (!node.isObstacle()) {
						node.setProperty(Property.AGENT, passenger);
						// node.setHidden();
					}
				}

				/* sleep until the other passenger has seated! */
				setCurrentState(State.WAITING_FOR_OTHER_PASSENGER_TO_SEAT);
				while (!thePassengerILetInTheRow.isIsSeated()) {
					Thread.sleep(simSettings.getThreadSleepTimeDefault());

				}

				setCurrentState(State.PREPARING);

				/* new helper vector stores the start */
				Vector helper = new Vector2D(start.getX(), start.getY());

				/* swap goal and start position */
				start = new Vector2D(goal.getX(), goal.getY());
				goal = new Vector2D(helper.getX(), helper.getY());

				path.invert();
				path.appendWayPoint(SimulationHandler.getMap().get(goal));

				setCurrentState(State.RETURNING_TO_SEAT);

				/* go back to the start */
				while (!goalReached()) {

					/*
					 * this is run again if the agent detects obstacles in his
					 * path
					 */
					followPath();

				}

				for (int i = 0; i < cabinBlocker.getYDimension() / cabinBlocker
						.getSimulationSettings().getScale(); i++) {

					Node node = SimulationHandler.getMap()
							.get((int) (position / cabinBlocker
									.getSimulationSettings().getScale())
									- offset, i);

					if (!node.isObstacle()) {
						node.setProperty(Property.DEFAULT, passenger);
					}
				}

			}

			if (!inDefaultBoardingMode()) {
				SimulationHandler.removeFromWaymakingList(passenger);
			}

			//
			if (foldingSeats && aisleSeat) {
				/* **************************************************** */
				AgentActionType actionType = new UnfoldSeat(this, scale,
						simSettings, passenger);
				new AgentAction(actionType).perform();
				/* **************************************************** */
			}

			//
			performFinalElements();

		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Sets the last move time.
	 *
	 * @param currentTimeMillis
	 *            the new last move time
	 */
	public void setLastMoveTime(long currentTimeMillis) {
		lastMoveTime = currentTimeMillis;

	}

	public AgentMood getMood() {
		return agentMood;
	}

	public void raiseNumberOfInterrupts() {
		numbOfInterupts++;
	}

	public void setAlreadyStowed(boolean stowed) {
		alreadyStowed = stowed;

	}

	public boolean getWaitingCompleted() {
		return waitingCompleted;
	}

	public void raiseNumberOfSkippedWaymakings() {
		wayMakingSkipped++;
	}

	public void raiseNumberOfCompletedWaymakings() {
		wayMakingCompleted++;
	}

	public void setWaitingCompleted(boolean b) {
		waitingCompleted = true;
	}

	public void setCurrentPosition(Vector2D vector2d) {
		currentPosition = new Vector2D(vector2d.getX(), vector2d.getY());

	}

	public void setDesiredPosition(Vector position) {
		desiredPosition = new Vector2D(position.getX(), position.getY());
	}

	public void setStartPosition(Vector vector) {
		start = new Vector2D(vector.getX(), vector.getY());

	}

	public Path getCurrentPath() {
		return path;
	}

	public void setPath(Path bestPath) {
		path = bestPath;
	}

	public boolean getOtherPassengerStoodUp() {
		return otherPassengerStoodUp();
	}

}
