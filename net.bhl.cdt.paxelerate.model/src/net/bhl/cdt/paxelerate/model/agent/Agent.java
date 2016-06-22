/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.model.agent;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import org.eclipse.swt.SWTException;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.LuggageSize;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerMood;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.Core;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.model.astar.Node;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.model.astar.Path;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.observer.Subject;
import net.bhl.cdt.paxelerate.model.util.Rotator;
import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.GaussianRandom;
import net.bhl.cdt.paxelerate.util.math.MathHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;

/**
 * This class is the agent object. It walks a specific calculated path and
 * reacts to obstacles occurring on the go.
 * 
 * @author marc.engelmann, michael.schmidt
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

	/** The mutable cost map. */
	private Costmap mutableCostMap;

	/** The dim. */
	private int numbOfInterupts = 0, waycounter = 0, dim = 2;

	/** The way making skipped. */
	private int wayMakingSkipped = 0;
	private int wayMakingFoldableSeatSkipped = 0;

	private long totalWaitingTime = 0;

	/** The moved once. */
	private boolean alreadyStowed = false, waitingCompleted = false,
			initialized = false, exitTheMainLoop = false, movedOnce = false,
			foldingSeats = false, stowingAtAisleSeat = false,
			waitingAtAisleSeat = false, aisleSeat = false;

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

	/**  */
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
	 * The Enum AgentMode.
	 *
	 * @author marc.engelmann
	 */
	public static enum AgentMode {

		/** The go to seat. */
		GO_TO_SEAT,
		/** The make way. */
		MAKE_WAY
	}

	/**
	 * The Enum State.
	 *
	 * @author marc.engelmann
	 */
	public static enum State {

		/** The following path. */
		FOLLOWING_PATH,
		/** The waiting for row clearing. */
		WAITING_FOR_ROW_CLEARING,
		/** The clearing row. */
		CLEARING_ROW,
		/** The stowing luggage. */
		STOWING_LUGGAGE,
		/** The unfold seat. */
		UNFOLDING_SEAT,
		/** The preparing. */
		PREPARING,
		/** The queueing up. */
		QUEUEING_UP,
		/** The waiting for other passenger to seat. */
		WAITING_FOR_OTHER_PASSENGER_TO_SEAT,
		/** The returning to seat. */
		RETURNING_TO_SEAT;
	}

	/**
	 * Gets the last move timestamp.
	 *
	 * @return the last move timestamp
	 */
	public long getLastMoveTimestamp() {
		return lastMoveTime;
	}

	public double getWaitingTimeAfterCollision() {
		return waitingTimeAfterCollision;
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

	public void resetAgent() {
		thread = null;
		path = null;
		start = null;
		goal = null;
		desiredPosition = null;
		currentPosition = null;
		mutableCostMap = null;
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
	 * Checks if is initialized.
	 *
	 * @return true, if is initialized
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * Sets the initialized.
	 *
	 * @param initialized
	 *            the new initialized
	 */
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
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

	private void increaseTotalWaitingTime(long time) {
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
	 * @param range
	 *            the range
	 * @param print
	 *            the print
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
	 * @param range
	 *            the range
	 * @param print
	 *            the print
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

	private synchronized void blockArea(Vector vector, boolean occupy,
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

		/* loop through the whole passenger area in the whole area map */
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
	private void rotateAgent(int degrees) {
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
		pathhelper = pathhelper.cutToPoint(pathhelper, currentPosition);

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

	/**
	 * This method finds a new path. The <b>finalCostmap</b> is needed so that
	 * there is no overlapping of different agent positions over time. The cost
	 * map is always modified based on the non-editable final cost map
	 * calculated at the beginning.
	 *
	 * @throws NullPointerException
	 *             the null pointer exception
	 */
	public void findNewPath() throws NullPointerException {

		// Path oldPath = null;
		// double pathFindingDecisionFactor = 1.1;

		/* starts the StopWatch - used for performance testing */
		stopwatch.start();

		/* reset the mutable CostMap to the original cost map */
		mutableCostMap = finalCostmap;

		SimulationHandler.getAreamapHandler().setStartLocation(currentPosition,
				this);

		/* this is only run if its not the initial path finding process */
		if (currentPosition != null) {

			// // TODO: is this only a "pointer"?
			// /* store the old path */
			// oldPath = path;

			/* this sets the new start of the A* to the current position */
			start = currentPosition;

			/* this declares the area around agents as high cost terrain */
			mutableCostMap = AgentFunctions.updateCostmap(this);
		}

		/* run the path finding algorithm */
		Core astar = new Core(SimulationHandler.getAreamapHandler(),
				mutableCostMap, this);

		/* retrieve the path information */
		path = astar.getBestPath();

		// System.out.println("old: " + oldPath.getCost() + ", new: "
		// + path.getCost() + " diff in %: "
		// + oldPath.getCost() / path.getCost() * 100.0);

		// /* this is only run if its not the initial path finding process */
		// if (currentPosition != null) {
		//
		// /* check if the new path is way more expensive than the old one */
		//
		// // TODO: Calulate only the part of the path lying ahead!
		// if (oldPath.getCost() * pathFindingDecisionFactor <= path
		// .getCost()) {
		//
		// /* if so, return to the old path */
		// path = oldPath;
		//
		// /* exit the function */
		// return;
		// }
		// }

		/*
		 * setting the new desired and current positions. This causes a
		 * NullPointerException if no path is found!
		 */

		desiredPosition = path.get(0).getPosition();

		/* this is only run if its not the initial path finding process */
		if (currentPosition != null)

		{
			blockArea(currentPosition, false, false, null);
		}

		if (!initialized) {
			currentPosition = new Vector2D(0, 0);
		}

		/* apply cost the the passenger element */
		passenger.setCostOfPath(path.getCost());

		/* ends the stop watch performance logging */
		stopwatch.stop();
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

		for (int x = -dim; x <= dim; x++) {

			int y = dim;

			if (passenger.getSeat().getXPosition() < passenger.getDoor()
					.getXPosition()) {
				y = -(y + 1);
			}

			Node checkNode = SimulationHandler.getMap().get(vector.getX() + x,
					vector.getY() + y);
			if (checkNode != null) {
				if (checkNode.getProperty() == Property.AGENT) {

					/* check if its was not this agent who blocked it */
					if (checkNode.getPassenger().getId() != this.passenger
							.getId()) {

						for (Agent agent : SimulationHandler.getAgentList()) {

							if (agent.getPassenger().getId() == checkNode
									.getPassenger().getId()) {
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
	private boolean waymakingAllowed() {
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
	private synchronized void occupyOneStepAhead() {
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
		}

		waitingCompleted = true;

	}

	private void stowLuggage() {

		setCurrentState(State.STOWING_LUGGAGE);
		rotateAgent(90);

		/* sleep the thread as long as the luggage is stowed */
		long sleepTime = AStarHelper.time(passenger.getLuggageStowTime());
		try {
			Thread.sleep(sleepTime);
			increaseTotalWaitingTime(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/* notify everyone that the luggage is now stowed */
		alreadyStowed = true;

	}

	private void unfoldingSeatProcedure() {

		setCurrentState(State.UNFOLDING_SEAT);

		/* Unfold seat if necessary */
		/* Sideways foldable seat */
		if (passenger.getSeat()
				.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT) {
			unfoldSeat(GaussianRandom.gaussianRandom(
					simSettings.getSidewaysFoldabeSeatPopupTimeMean(),
					GaussOptions.PERCENT_95,
					simSettings.getSidewaysFoldabeSeatPopupTimeDeviation()));

			/* Lifting seat pan */
		} else if (passenger.getSeat()
				.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS) {
			unfoldSeat(GaussianRandom.gaussianRandom(
					simSettings.getLiftingSeatPanPopupTimeMean(),
					GaussOptions.PERCENT_95,
					simSettings.getLiftingSeatPanPopupTimeDeviation()));
		}
	}

	/**
	 * Unfold sideways foldable seat or lifting seat pan seat.
	 *
	 * @param d
	 *            the seat popup time
	 */
	private void unfoldSeat(double d) {

		Seat seat = passenger.getSeat();
		seat.setLayoutConcept(LayoutConcept.DEFAULT);

		int width = seat.getYDimension() / scale;
		int length = seat.getXDimension() / scale;
		int yPosition = seat.getYPosition() / scale;
		int xPosition = seat.getXPosition() / scale;

		if (developerMode) {
			System.out.println("Passenger " + passenger.getId()
					+ " unfolds Seat " + seat.getName());
		}

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				int k = yPosition + i;
				int l = xPosition + j;
				if (k < SimulationHandler.getMap().getDimensions().getY()
						&& l < SimulationHandler.getMap().getDimensions()
								.getX()) {
					SimulationHandler.getMap().get(l, k)
							.setProperty(Property.OBSTACLE, null);
				}
			}
		}

		/* Pauses the agent for the seat pop up time */
		try {
			increaseTotalWaitingTime(AStarHelper.time(d));
			Thread.sleep(AStarHelper.time(d));
		} catch (InterruptedException e) {
			//
		}
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
	/*
	 * public int getNumberWayMakingSkipped() { return wayMakingSkipped; }
	 */

	public int getNumberWayMakingSkipped() {
		return wayMakingSkipped;
	}

	/**
	 * This method is the main path following loop for the agent.
	 */
	private void followPath() {

		/* define the try catch loop as main loop */
		mainloop: try {

			/*
			 * i represents the number of steps taken as well as the current
			 * step count. The actual position is one step behind i, so i is the
			 * desired step.
			 */
			int i = 0;

			/* run the path up to its end */
			while (i < path.getLength()) {

				/*
				 * at the first step, there is no current location but only a
				 * desired first location. So ignore this at the first loop.
				 */
				if (i != 0) {

					/*
					 * the current position is the last taken step in the path
					 */
					currentPosition = path.get(i - 1).getPosition();

				}

				if (i == 2) {
					movedOnce = true;
				}

				/* the new planned location is current step in the path */
				desiredPosition = path.get(i).getPosition();

				/* check if the desired next step is blocked by someone else */
				Property property = nodeBlocked(desiredPosition);
				if (property != null) {

					setCurrentState(State.QUEUEING_UP);

					/* raise the interrupts counter up by one */
					numbOfInterupts++;
					SimulationHandler.getMap().get(currentPosition)
							.raiseNumberOfInterrupts();

					/* get the correct behavior for an obstacle avoidance */
					Situation collision = new Situation(agentMood, property);

					/* Perform the correct behavior */
					collision.handle();

					increaseTotalWaitingTime((long) waitingTimeAfterCollision);
					/*
					 * the main loop is quit, if there is a new path calculated
					 */
					if (exitTheMainLoop) {

						/* cut the old path and add the new one to the list */
						redefinePathLayout();

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

						stowLuggage();
					}

				} else if (!alreadyStowed && !stowingAtAisleSeat
						&& passengerStowsLuggage()) {

					stowLuggage();

					/*
					 * if there is no obstacle or luggage stowing required, run
					 * the default step
					 */

				} else if (!alreadyStowed && stowingAtAisleSeat
						&& passengerStowsLuggageAtAisleSeat()) {

					stowLuggage();

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

					setCurrentState(State.WAITING_FOR_ROW_CLEARING);

					// TODO: only one passenger is detected, even if there are 2
					// already in the row!

					while (waymakingAllowed() == false) {
						increaseTotalWaitingTime(
								simSettings.getThreadSleepTimeDefault());
						Thread.sleep(simSettings.getThreadSleepTimeDefault());
					}

					/* way making procedure is skipped */
					// if (anyoneNearMe()) {
					if (!waitingCompleted) {
						if (developerMode) {
							System.out.println(
									"waymaking skipped. Delay simulated!");
						}

						long sleepTime = AStarHelper
								.time(GaussianRandom.gaussianRandom(
										simSettings.getPassengerProperties()
												.getSeatInterferenceProcessTimeMean(),
										GaussOptions.PERCENT_95,
										simSettings.getPassengerProperties()
												.getSeatInterferenceProcessTimeDeviation()));
						increaseTotalWaitingTime(sleepTime);
						Thread.sleep(sleepTime);
						wayMakingSkipped++;
						waitingCompleted = true;
						// continue;
					}

					// way making works as planned
					/*
					 * if (!waitingCompleted) {
					 * 
					 * for (Passenger pax : otherPassengersInRowBlockingMe) {
					 * 
					 * SimulationHandler.launchWaymakingAgent(pax,
					 * this.passenger);
					 * 
					 * }
					 * 
					 * while (!otherPassengerStoodUp()) { Thread.sleep(
					 * simSettings.getThreadSleepTimeDefault()); }
					 * 
					 * // TODO: calculate the waiting time!
					 * Thread.sleep(AStarHelper.time(simSettings
					 * .getSeatInterferenceStandingUpPassengerWaitingTime()));
					 * 
					 * waitingCompleted = true; }
					 */

				} else {

					setCurrentState(State.FOLLOWING_PATH);

					/*
					 * Go one step ahead. Do this by unblocking the current
					 * position and blocking the next position.
					 */
					occupyOneStepAhead();

					if (currentPosition.getX() != 0
							&& currentPosition.getY() != 0
							&& desiredPosition.getX() != 0
							&& desiredPosition.getY() != 0) {

						/* update the walked distance */
						passenger.setDistanceWalked(passenger
								.getDistanceWalked()
								+ (int) (MathHelper.distanceBetween(
										desiredPosition, currentPosition)
										* scale));
					}

					/* notify next step */
					lastMoveTime = System.currentTimeMillis();

					/* then perform the step */
					i++;

					/* try to submit the properties back to the passenger */
					try {

						/* submit the agents position */
						passenger.setPositionX(desiredPosition.getX() * scale);
						passenger.setPositionY(desiredPosition.getY() * scale);

						/* submit the agents orientation */
						passenger.setOrientationInDegree(
								AgentFunctions.getRotation(this));

						/* catch possible errors */
					} catch (ConcurrentModificationException e) {
						e.printStackTrace();
					} catch (ArrayIndexOutOfBoundsException a) {
						a.printStackTrace();
					} catch (SWTException swt) {
						swt.printStackTrace();
					}

					/* sleep as long as one step takes */
					Thread.sleep((int) (1000 / SimulationHandler.getCabin()
							.getSimulationSettings().getSimulationSpeedFactor()
							/ passenger.getWalkingSpeed() / (100 / scale)));

				}
			}

			/* catch possible interruptions */
		} catch (InterruptedException e) {
			e.printStackTrace();
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
				unfoldingSeatProcedure();
			}

			//
			performFinalElements();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
	}

}
