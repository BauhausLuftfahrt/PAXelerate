/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package com.paxelerate.model.agent;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import com.paxelerate.model.Cabin;
import com.paxelerate.model.CabinFactory;
import com.paxelerate.model.LuggageSize;
import com.paxelerate.model.Passenger;
import com.paxelerate.model.PassengerMood;
import com.paxelerate.model.Seat;
import com.paxelerate.model.agent.AgressiveMood;
import com.paxelerate.model.agent.PassiveMood;
import com.paxelerate.model.astar.AStarTools;
import com.paxelerate.model.astar.Core;
import com.paxelerate.model.astar.CostMap;
import com.paxelerate.model.astar.Node;
import com.paxelerate.model.astar.Path;
import com.paxelerate.model.astar.SimulationHandler;
import com.paxelerate.model.astar.Node.Property;
import com.paxelerate.model.observer.Subject;
import com.paxelerate.model.util.Rotator;
import com.paxelerate.util.Func;
import com.paxelerate.util.math.StopWatch;
import com.paxelerate.util.math.Vector;
import com.paxelerate.util.math.Vector2D;

/**
 * This class is the agent object. It walks a specific calculated path and
 * reacts to obstacles occurring on the go.
 * 
 * @author marc.engelmann
 *
 */
public class Agent extends Subject implements Runnable {
	private Thread thread;
	private Path path;

	private final static int PIXELS_FOR_LUGGAGE = 8, PIXELS_FOR_WAY = 7;

	private Vector start, goal, desiredPosition, currentPosition;
	private CostMap mutableCostMap;

	private int numbOfInterupts = 0, waycounter = 0;

	private boolean alreadyStowed = false, waitingCompleted = false,
			initialized = false, exitTheMainLoop = false, movedOnce = false;;

	private StopWatch stopwatch = new StopWatch();
	private ArrayList<Path> pathlist = new ArrayList<Path>();

	private AgentMood agentMood;
	private Agent blockingAgent;

	/* constant values */
	private final CostMap finalCostmap;
	private final Passenger passenger;

	private final int scale;
	private final AgentMode mode;

	private State currentState;

	private Passenger thePassengerILetInTheRow;

	public Passenger getThePassengerILetInTheRow() {
		return thePassengerILetInTheRow;
	}

	public static enum AgentMode {
		GO_TO_SEAT, MAKE_WAY
	}

	public static enum State {
		FOLLOWING_PATH, WAITING_FOR_ROW_CLEARING, CLEARING_ROW, STOWING_LUGGAGE, PREPARING, QUEUEING_UP, WAITING_FOR_OTHER_PASSENGER_TO_SEAT, RETURNING_TO_SEAT;
	}

	private int[][] defaultPassengerArea;
	private int[][] adaptedPassengerArea;

	/**
	 * This method constructs an agent.
	 * 
	 * @param passenger
	 *            the passenger which is represented by the agent
	 * @param start
	 *            the starting vector
	 * @param goal
	 *            the goal vector
	 * @param scale
	 *            the scale of the simulation
	 */
	public Agent(Passenger passenger, Vector start, Vector goal,
			CostMap costmap, AgentMode mode, Passenger thePassengerILetInTheRow) {

		/* assign the initializer values to the objects values */
		this.mode = mode;
		this.passenger = passenger;
		this.start = start;
		this.goal = goal;
		this.scale = SimulationHandler.getCabin().getScale();
		this.finalCostmap = costmap;
		this.thePassengerILetInTheRow = thePassengerILetInTheRow;

		/* generate a mood for the passenger depending on his presets */
		if (passenger.getPassengerMood() == PassengerMood.AGRESSIVE) {
			this.agentMood = new AgressiveMood(this);
		} else if (passenger.getPassengerMood() == PassengerMood.PASSIVE) {
			this.agentMood = new PassiveMood(this);
		}

		// this.agentMood = new AgressiveMood(this);

		defaultPassengerArea = new int[(int) (passenger.getWidth() / scale)][(int) (passenger
				.getDepth() / scale)];
		for (int i = 0; i < (int) (passenger.getWidth() / scale); i++) {
			for (int j = 0; j < (int) (passenger.getDepth() / scale); j++) {
				defaultPassengerArea[i][j] = 1;
			}
		}

	}

	public ArrayList<Passenger> otherPassengersInRowBlockingMe = new ArrayList<Passenger>();

	public Passenger getOtherPassengersInRowBlockingMe() {
		if (!otherPassengersInRowBlockingMe.isEmpty()) {
			return otherPassengersInRowBlockingMe.get(0);
		} else {
			return null;
		}
	}

	private int dim = 2;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setCurrentState(State status) {
		this.currentState = status;
	}

	public State getCurrentState() {
		return currentState;
	}

	public AgentMode getAgentMode() {
		return mode;
	}

	public Agent getBlockingAgent() {
		return blockingAgent;
	}

	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	public void setBlockingAgent(Agent blockingAgent) {
		this.blockingAgent = blockingAgent;
	}

	public Vector getStart() {
		return start;
	}

	public Vector getCurrentPosition() {
		return currentPosition;
	}

	public Vector getDesiredPosition() {
		return desiredPosition;
	}

	public Vector getGoal() {
		return goal;
	}

	public boolean didMoveOnce() {
		return movedOnce;
	}

	/**
	 * This method returns if the passenger is ready to stow his luggage
	 * 
	 * @return if the passenger is ready to stow luggage
	 */
	public boolean passengerStowsLuggage() {

		/* get the passengers seat */
		Seat seat = this.passenger.getSeatRef();

		/*
		 * return true if the passenger does have luggage and if he is near his
		 * seat
		 */
		return (hasLuggage() && isInYRangeEqual(seat.getYNowXPosition(),
				PIXELS_FOR_LUGGAGE, false));
	}

	private boolean isInYRangeEqual(int position, int range, boolean print) {
		// if (print) {
		// System.out.println("pos: " + position / scale + ", range: " + range
		// + ", my:" + desiredPosition.getY());
		// }
		if ((int) Math.abs(desiredPosition.getY() - position / scale) == range) {
			return true;
		}
		return false;
	}

	private boolean isInYRangeSmaller(int position, int range, boolean print) {
		// if (print) {
		// System.out.println("pos: " + position / scale + ", range: " + range
		// + ", my:" + desiredPosition.getY());
		// }
		if ((int) Math.abs(desiredPosition.getY() - position / scale) < range) {
			return true;
		}
		return false;
	}

	private boolean hasLuggage() {
		return (passenger.getLuggage() != LuggageSize.NONE);
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

		/* switch the property depending on whether a node is blocked or release */
		Property property = Property.DEFAULT;

		if (occupy) {
			property = Property.AGENT;
		}

		/*
		 * check the possibility that the node is already blocked by an agent.
		 * Normally this should never happen.
		 */
		if (SimulationHandler.getMap().getNode(vector).getProperty() == Property.AGENT
				&& occupy) {

			/* Print out if there is an overlap */
			// System.out.println("Node already blocked. Error!");
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
				adaptedPassengerArea = Rotator.rotate(rotation,
						defaultPassengerArea);

				/* if you want to do auto rotation, this method is called. */
			} else {
				if (rotationAllowed()) {
					adaptedPassengerArea = Rotator.rotate(
							AgentFunctions.getRotation(this),
							defaultPassengerArea);
				} else {
					adaptedPassengerArea = null;
				}

			}
		}

		/*
		 * if no rotation is needed or possible, skip the rotation process and
		 * assign the basic layout to the object.
		 */
		if (adaptedPassengerArea == null) {
			adaptedPassengerArea = defaultPassengerArea;
		}

		/*
		 * get the square dimension. This is the maximum of the two following
		 * values.
		 */

		double dimension = Math.max(adaptedPassengerArea.length,
				adaptedPassengerArea[1].length);

		/*
		 * this is the dimension you need to go in every direction from the
		 * starting point. It is half the way back in every dimension.
		 */
		dim = (int) (dimension / 2);

		/* loop through the whole passenger area in the whole area map */
		for (int x = -dim; x <= dim; x++) {
			for (int y = -dim; y <= dim; y++) {

				/* the location currently under investigation */
				Vector location = new Vector2D(vector.getX() + x, vector.getY()
						+ y);

				/* if the point is within the bounds of the passenger area */
				if (x + dim < adaptedPassengerArea.length
						&& y + dim < adaptedPassengerArea[0].length) {

					/*
					 * if the passenger area has a passenger located on this
					 * specific node
					 */
					if (adaptedPassengerArea[x + dim][y + dim] == 1) {

						/* block or deblock the specific node */
						AgentMover.blockNode(location, occupy, property,
								this.passenger);
					}
				}
			}
		}
	}

	/**
	 * This method is used to rotate the agent!
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
		if (currentPosition.getX() < 1) {
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
	}

	/**
	 * This method finds a new path. The <b>finalCostmap</b> is needed so that
	 * there is no overlapping of different agent positions over time. The cost
	 * map is always modified based on the non-editable final cost map
	 * calculated at the beginning.
	 */
	public void findNewPath() {

		/* starts the StopWatch - used for performance testing */
		stopwatch.start();

		/* reset the mutable CostMap to the original cost map */
		mutableCostMap = finalCostmap;

		SimulationHandler.getMap().setStartLocation(currentPosition, this);

		/* this is only run if its not the initial path finding process */
		if (currentPosition != null) {

			blockArea(currentPosition, false, false, null);

			/* print out the area map when in developer mode */
			if (SimulationHandler.DEVELOPER_MODE) {
				SimulationHandler.getMap().printMap();
			}

			/* this sets the new start of the A* to the current position */
			start = currentPosition;

			/* this declares the area around agents as high cost terrain */
			mutableCostMap = AgentFunctions.updateCostmap(this);
		}

		/* run the path finding algorithm */
		Core astar = new Core(SimulationHandler.getMap(), mutableCostMap, this);

		/* retrieve the path information */
		path = astar.getBestPath();

		/* setting the new desired and current positions */
		desiredPosition = path.get(0).getPosition();

		if (!initialized) {
			currentPosition = new Vector2D(0, 0);

		}
		/* ends the stop watch performance logging */
		stopwatch.stop();
	}

	/**
	 * This method returns the current position of the agent
	 * 
	 * @return the current position
	 */
	public Vector getPosition() {
		return currentPosition;
	}

	/**
	 * 
	 * @return
	 */
	private boolean goalReached() {
		return Func.vectorsAreEqual(desiredPosition, goal);
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

			// ersetzt wurde: for (int y = dim; y <= dim; y++) {
			int y = dim;

			if (passenger.getSeatRef().getYNowXPosition() < passenger.getDoor()
					.getYNowXPosition()) {
				y = -(y + 1);
			}

			Node checkNode = SimulationHandler.getMap().getNodeByCoordinate(
					vector.getX() + x, vector.getY() + y);
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
				if (checkNode.getProperty() == Property.OBSTACLE) {
					// System.out
					// .println("###### !OVERLAPPING OF AGENT AND OBSTACLE! ###### !AGENT - nodeBlockedBySomeoneElseOrObstacle()! ######");
					// if (isInYRangeSmaller(
					// passenger.getSeatRef().getYNowXPosition(), 5, false)) {
					return null;
					// } else {
					// return Property.OBSTACLE;
					// }
				}
			}
			// }
		}
		return null;

	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Path> getPathList() {
		return pathlist;
	}

	/* check if there is still on passenger seated */
	private boolean otherPassengerStoodUp() {
		for (Passenger pax : otherPassengersInRowBlockingMe) {
			if (pax.isIsSeated()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * This method is the main path following loop for the agent.
	 */
	private void followPath() {

		// System.out.println(passenger.getId());
		// System.out.println(start);
		// System.out.println(goal);
		// if (goal.getY() < start.getY()) {
		// System.out.println("ERROR!!!");
		// }

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

					/* the current position is the last taken step in the path */
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
					SimulationHandler.getMap().getNode(currentPosition)
							.raiseNumberOfInterrupts();

					/* get the correct behavior for an obstacle avoidance */
					Situation collision = new Situation(agentMood, property);

					/* Perform the correct behavior */
					collision.handle();

					/* the main loop is quit, if there is a new path calculated */
					if (exitTheMainLoop) {

						if (SimulationHandler.DEVELOPER_MODE) {
							System.out.println("searching for new path ...");
						}

						/* cut the old path and add the new one to the list */
						redefinePathLayout();

						/* exit this loop */
						break mainloop;
					}

					/*
					 * if there is no obstacle in the way, check if the luggage
					 * should be stowed now next
					 */
				} else if (passengerStowsLuggage() && !alreadyStowed) {

					setCurrentState(State.STOWING_LUGGAGE);
					rotateAgent(90);

					/* sleep the thread as long as the luggage is stowed */
					Thread.sleep(AStarTools.time(passenger.getLuggageStowTime()));

					/* notify everyone that the luggage is now stowed */
					alreadyStowed = true;

					/*
					 * if there is no obstacle or luggage stowing required, run
					 * the default step
					 */

				} else if (waitingForClearingOfRow() && !waitingCompleted) {

					setCurrentState(State.WAITING_FOR_ROW_CLEARING);

					// TODO: only one passenger is detected, even if there are 2
					// already in the row!

					while (waymakingAllowed() == false) {
						Thread.sleep(10);
					}

					if (anyoneNearMe()) {
						System.out
								.println("waymaking skipped. Delay simulated!");
						Thread.sleep(AStarTools.time(7));
						waitingCompleted = true;
						continue;
					}

					if (!waitingCompleted) {

						for (Passenger pax : otherPassengersInRowBlockingMe) {

							SimulationHandler.launchWaymakingAgent(pax,
									this.passenger);

						}

						while (!otherPassengerStoodUp()) {
							Thread.sleep(10);
						}

						// TODO: calculate the waiting time!
						Thread.sleep(AStarTools.time(3));

						waitingCompleted = true;
					}

				} else {

					setCurrentState(State.FOLLOWING_PATH);

					/*
					 * Go one step ahead. Do this by unblocking the current
					 * position and blocking the next position.
					 */
					occupyOneStepAhead();

					/* then perform the step */
					i++;

					/* try to submit the properties back to the passenger */
					try {

						/* submit the agents position */
						passenger.setPositionX(desiredPosition.getX() * scale);
						passenger.setPositionY(desiredPosition.getY() * scale);

						/* submit the agents orientation */
						passenger.setOrientationInDegree(AgentFunctions
								.getRotation(this));

						/* catch possible errors */
					} catch (ConcurrentModificationException e) {
						System.out
								.println("###### !ConcurrentModificationException ERROR! ###### !AGENT - setPosition()! ######");
					} catch (ArrayIndexOutOfBoundsException a) {
						System.out
								.println("###### !ArrayIndexOutOfBoundsException ERROR! ###### !AGENT - setPosition()! ######");

					}

					/* sleep as long as one step takes */
					Thread.sleep((int) (1000 / SimulationHandler.getCabin()
							.getSimulationSettings().getSimulationSpeedFactor() / (passenger
							.getWalkingSpeed() * 100 / scale)));
				}
			}

			/* catch possible interruptions */
		} catch (InterruptedException e) {
			System.out
					.println("###### !ArrayIndexOutOfBoundsException ERROR! ###### !AGENT - followPath()! ######");
			/* end this thread */
			this.getThread().interrupt();
			System.out.println("thread is now interrupted");
		}
	}

	private boolean anyoneNearMe() {
		for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
			if (!pax.isIsSeated()) {
				if (pax.getId() != passenger.getId()) {
					if (isInYRangeSmaller((int) (SimulationHandler
							.getAgentByPassenger(pax).getCurrentPosition()
							.getY() * scale), 10, true)) {
						return true;
					}
				}
			}
		}
		return false;
	}

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

	private boolean waitingForClearingOfRow() {

		if (isInYRangeEqual(passenger.getSeatRef().getYNowXPosition(),
				PIXELS_FOR_WAY, false)) {
			if (AgentFunctions.someoneAlreadyInThisPartOfTheRow(this)) {
				return true;
			}
		}

		return false;
	}

	private synchronized void occupyOneStepAhead() {
		blockArea(currentPosition, false, false, null);
		blockArea(desiredPosition, true, false, null);
		SimulationHandler.getMap().getNode(desiredPosition)
				.raiseNumberOfOccupations();
	}

	/**
	 * 
	 * @return
	 */
	public boolean isExitPathLoop() {
		return exitTheMainLoop;
	}

	private void defineSeated(boolean isSeated) {

		/* when the goal is reached, the passenger is defined seated */
		passenger.setIsSeated(isSeated);

		/* then the assigned seat is declared occupied */
		passenger.getSeatRef().setOccupied(isSeated);

		/* RunAStar is notified that a passenger is seated now */
		SimulationHandler.setPassengerSeated(passenger, isSeated);
	}

	private boolean inDefaultBoardingMode() {
		if (mode == AgentMode.MAKE_WAY) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 
	 * @param exitPathLoop
	 */
	public void setExitPathLoop(boolean exitPathLoop) {
		this.exitTheMainLoop = exitPathLoop;
	}

	public void interruptAgent(int duration) {
		try {
			Thread.sleep(duration);
			System.out.println("Sleeping!");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Sleeping not possible!");
		}
	}

	public boolean performFinalElements() {

		if (!passenger.getSeatRef().isOccupied()) {

			/* clear the current position of the agent */
			blockArea(currentPosition, false, false, null);
			blockArea(desiredPosition, false, false, null);

			if (passenger.getSeatRef().isCurrentlyFolded()) {
				unfoldSeat();
			}

			defineSeated(true);

			/* the stop watch is then interrupted */
			stopwatch.stop();

			/* the boarding time is then submitted back to the passenger */
			passenger
					.setBoardingTime((int) (stopwatch.getElapsedTimeSecs() * SimulationHandler
							.getCabin().getSimulationSettings()
							.getSimulationSpeedFactor()));

			/* the number of interrupts is submitted to the passenger */
			passenger.setNumberOfWaits(numbOfInterupts);

			SimulationHandler.getMap().getNode(getGoal())
					.setProperty(Property.DEFAULT, getPassenger());

			return true;
		} else {
			return false;
		}

	}

	private void unfoldSeat() {

		int defoldingTime = 5;

		Seat seat = passenger.getSeatRef();
		seat.setCurrentlyFolded(false);

		int width = (int) (seat.getXDimension() / scale);
		int length = (int) (seat.getYNowXDimension() / scale);
		int xPosition = (int) (seat.getXPosition() / scale);
		int YNowXPosition = (int) (seat.getYNowXPosition() / scale);

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				int k = xPosition + i;
				int l = YNowXPosition + j;
				if (k < SimulationHandler.getMap().getDimensions().getX()
						&& l < SimulationHandler.getMap().getDimensions()
								.getY()) {
					SimulationHandler.getMap().getNodeByCoordinate(k, l)
							.setProperty(Property.OBSTACLE, null);
				}
			}
		}

		try {
			Thread.sleep(AStarTools.time(defoldingTime));
		} catch (InterruptedException e) {
			//
		}
	}

	/**
	 * This method runs the agents walking simulation.
	 */
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
				Thread.sleep(AStarTools.time(passenger
						.getStartBoardingAfterDelay()));

				/*
				 * then try to spawn the passenger but check if there is enough
				 * space in front of the cabin door
				 */

				while (SimulationHandler.CabinAccessGranted(passenger) == false) {
					Thread.sleep(10);
				}
			}

			/* start counting the elapsed time for boarding */
			stopwatch.start();

			/*
			 * tell the handler that the passengers now enters the cabin
			 */

			SimulationHandler.setPassengerActive(this.passenger);

			setCurrentState(State.FOLLOWING_PATH);
			/*
			 * run path following as long as the goal is not reached yet
			 */
			while (!goalReached()) {

				/* this is run again if the agent detects obstacles in his path */
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

				int offset = 0;
				double position = thePassengerILetInTheRow.getPositionY();
				Cabin cabinBlocker = SimulationHandler.getCabin();
				Passenger dummyPax = CabinFactory.eINSTANCE.createPassenger();
				dummyPax.setId(Integer.MAX_VALUE);

				for (int i = 0; i < cabinBlocker.getCabinWidth()
						/ cabinBlocker.getScale(); i++) {
					Node node = SimulationHandler.getMap()
							.getNodeByCoordinate(
									i,
									(int) (position / cabinBlocker.getScale())
											- offset);
					if (node.getProperty() != Property.OBSTACLE) {
						node.setProperty(Property.AGENT, passenger);
						// node.setHidden();
					}
				}

				/* sleep until the other passenger has seated! */
				setCurrentState(State.WAITING_FOR_OTHER_PASSENGER_TO_SEAT);
				while (!thePassengerILetInTheRow.isIsSeated()) {
					Thread.sleep(10);

				}

				setCurrentState(State.PREPARING);

				/* new helper vector stores the start */
				Vector helper = new Vector2D(start);

				/* swap goal and start position */
				start = new Vector2D(goal);
				goal = new Vector2D(helper);

				path.invert();
				path.appendWayPoint(SimulationHandler.getMap().getNode(goal));

				setCurrentState(State.RETURNING_TO_SEAT);

				/* go back to the start */
				while (!goalReached()) {

					/*
					 * this is run again if the agent detects obstacles in his
					 * path
					 */
					followPath();

				}

				for (int i = 0; i < cabinBlocker.getCabinWidth()
						/ cabinBlocker.getScale(); i++) {

					Node node = SimulationHandler.getMap()
							.getNodeByCoordinate(
									i,
									(int) (position / cabinBlocker.getScale())
											- offset);
					if (node.getProperty() != Property.OBSTACLE) {
						node.setProperty(Property.DEFAULT, passenger);
					}
				}

			}

			if (!inDefaultBoardingMode()) {
				SimulationHandler.removeFromWaymakingList(passenger);
			}

			performFinalElements();

		} catch (InterruptedException e) {

			/* This loop is run if there was an unknown error during runtime */
			System.out.println("thread got an error");
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

	public void remove() {
		if (performFinalElements() == true) {
			System.out.println("Passenger " + passenger.getId()
					+ " is now force-seated!");
		} else {
			System.out.println("Passenger is already seated!");
		}
	}

}
