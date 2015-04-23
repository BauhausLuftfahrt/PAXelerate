/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.agent;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import net.bhl.cdt.model.astar.AStar;
import net.bhl.cdt.model.agent.AggressiveMood;
import net.bhl.cdt.model.astar.CostMap;
import net.bhl.cdt.model.agent.PassiveMood;
import net.bhl.cdt.model.astar.Node;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.astar.Path;
import net.bhl.cdt.model.astar.RunAStar;
import net.bhl.cdt.model.astar.StopWatch;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Rotator;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;
import net.bhl.cdt.model.observer.Subject;

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
	private boolean initialized = false;

	private final static int PIXELS_FOR_LUGGAGE = 10;
	private final static int PIXELS_FOR_WAY = 7;

	private Vector start;
	private Vector goal;
	private Vector desiredPosition;
	private Vector currentPosition;
	private CostMap mutableCostMap;

	private int numbOfInterupts = 0;
	private boolean alreadyStowed = false;
	private boolean waitingCompleted = false;
	private StopWatch stopwatch = new StopWatch();
	private ArrayList<Path> pathlist = new ArrayList<Path>();

	private AgentMood agentMood;
	private boolean exitTheMainLoop = false;
	private Agent blockingAgent;

	/* constant values */
	private final CostMap finalCostmap;
	private final Passenger passenger;
	private final int scale;
	private final int speedfactor;
	private agentMode mode;

	public static enum agentMode {
		GO_TO_SEAT, MAKE_WAY
	}

	private boolean skipDelay = false;

	private int[][] defaultPassengerArea;
	private int[][] adaptedPassengerArea;

	private ArrayList<Passenger> otherPassengersInRowBlockingMe = new ArrayList<Passenger>();

	// TODO: Das ist eine Stellschraube, genauso wie die Funktion
	// "nodeAlreadyBlockedBySomeoneElse!". Darin wird der Fehler liegen!
	private int dim = 2;

	public Passenger getPassenger() {
		return passenger;
	}

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
			CostMap costmap, agentMode mode) {

		/* assign the initializer values to the objects values */
		this.speedfactor = RunAStar.getCabin().getSpeedFactor();
		this.mode = mode;
		this.passenger = passenger;
		this.start = start;
		this.goal = goal;
		this.scale = RunAStar.getCabin().getScale();
		this.finalCostmap = costmap;

		/* generate a mood for the passenger depending on his presets */
		if (passenger.getPassengerMood() == PassengerMood.AGRESSIVE) {
			this.agentMood = new AggressiveMood(this);
		} else if (passenger.getPassengerMood() == PassengerMood.PASSIVE) {
			this.agentMood = new PassiveMood(this);
		}

		defaultPassengerArea = new int[(int) (this.getPassenger().getWidth() / (this.scale))][(int) (this
				.getPassenger().getDepth() / (this.scale))];
		for (int i = 0; i < (int) (this.getPassenger().getWidth() / (this.scale)); i++) {
			for (int j = 0; j < (int) (this.getPassenger().getDepth() / (this.scale)); j++) {
				defaultPassengerArea[i][j] = 1;
			}
		}

	}

	public void setSkipDelay(boolean skipIt) {
		this.skipDelay = skipIt;
	}

	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	public Agent getBlockingAgent() {
		return blockingAgent;
	}

	public void setBlockingAgent(Agent blockingAgent) {
		this.blockingAgent = blockingAgent;
	}

	/**
	 * This method returns the starting point vector.
	 * 
	 * @return the start vector
	 */
	public Vector getStart() {
		return start;
	}

	/**
	 * This method returns the goal point.
	 * 
	 * @return the goal point vector
	 */
	public Vector getGoal() {
		return goal;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 * 
	 * @return the rotation in degrees.
	 */
	private int getRotation() {

		/* get the angle in radian from -Pi to Pi, so zero is EAST */
		double theta = Math.atan2(
				desiredPosition.getY() - currentPosition.getY(),
				desiredPosition.getX() - currentPosition.getX());

		/* rotate the angle by 90 degrees so that zero is NORTH */
		theta += Math.PI / 2.0;

		/* transform from radian to degree */
		int angle = (int) Math.toDegrees(theta);

		/* if degree is smaller than 0, convert it */
		if (angle < 0) {
			angle += 360;
		}
		return angle;
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
		return (this.passenger.isHasLuggage())
				&& (desiredPosition.getY() == (int) (seat.getYPosition()
						/ scale - PIXELS_FOR_LUGGAGE));
	}

	/**
	 * This method blocks the agents position if the rotation is rectangular.
	 * 
	 * @param vector
	 *            is the vector of the agents position
	 * @param occupy
	 *            occupy or deoccupy the node
	 * @param property
	 *            set the property of the node
	 */
	private void blockNode(Vector vector, boolean occupy, Property property) {

		/* check if the desired node is out of bounds */
		if (RunAStar.getMap().getNodeByCoordinate(vector.getX(), vector.getY()) != null) {

			/* check if the agent itself blocked the node */
			if (RunAStar.getMap()
					.getNodeByCoordinate(vector.getX(), vector.getY())
					.getLinkedAgentID() == this.passenger.getId()
					|| RunAStar.getMap()
							.getNodeByCoordinate(vector.getX(), vector.getY())
							.getProperty() != Property.AGENT) {

				/* check if the node is no obstacle */
				if (RunAStar.getMap()
						.getNodeByCoordinate(vector.getX(), vector.getY())
						.getProperty() != Property.OBSTACLE) {

					/*
					 * set the node to the desired property and link the agent
					 * id
					 */
					RunAStar.getMap()
							.getNodeByCoordinate(vector.getX(), vector.getY())
							.setProperty(property, this.passenger.getId());
				}
			}
		}
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

	private synchronized void occupyNodeArea(Vector vector, boolean occupy,
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
		if (RunAStar.getMap().getNode(vector).getProperty() == Property.AGENT
				&& occupy) {

			/* Print out if there is an overlap */
			System.out.println("Node already blocked. Error!");
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
				adaptedPassengerArea = Rotator.rotate(getRotation(),
						defaultPassengerArea);
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
		 * starting point
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
						blockNode(location, occupy, property);
					}
				}
			}
		}
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
	 * This method takes a cost map and adds a huge cost to the location and the
	 * area around agents. The agent triggering this method is ignored.
	 */
	private void updateCostmap() {

		/* The cost map is flooded from the agents current location to his seat */
		CostMap costmap = new CostMap(RunAStar.getMap().getDimensions(), start,
				RunAStar.getMap(), false, this, true);

		/* the cost map is then assigned to the mutable global cost map */
		mutableCostMap = costmap;

		/*
		 * define the square dimension around the passenger that should be
		 * scanned. This is the default dimension in each direction from the
		 * center!
		 */
		int squareDimension = 10;

		/* this is the expansion in the x Direction */
		Vector xVector = new Vector2D(currentPosition.getX() - squareDimension,
				currentPosition.getX() + squareDimension);

		/* this is the expansion in the x Direction */
		Vector yVector = new Vector2D(currentPosition.getY() - squareDimension,
				currentPosition.getY() + squareDimension);

		/*
		 * The first value of the vectors above represents the beginning of the
		 * area being checked, the second value the end.
		 */

		/* then there is cost assigned to an area around the other agents */
		for (int xCoordinate = xVector.getX(); xCoordinate < xVector.getY(); xCoordinate++) {
			for (int yCoordinate = yVector.getX(); yCoordinate < yVector.getY(); yCoordinate++) {

				/* prevent out of bounds exceptions */
				if (xCoordinate > 0 && yCoordinate > 0) {

					/* find all nodes occupied by agents */
					if (RunAStar.getMap()
							.getNodeByCoordinate(xCoordinate, yCoordinate)
							.getProperty() == Property.AGENT) {

						/*
						 * additionally to the surrounding points of the agents,
						 * there is also cost generated in the area in front of
						 * an agent. This is used to make the agent overtake
						 * easier
						 */
						for (int stepsAhead = 0; stepsAhead < 6; stepsAhead++) {

							/* the current agents position is excluded here! */
							if (!FuncLib.vectorsAreEqual(
									RunAStar.getMap()
											.getNodeByCoordinate(xCoordinate,
													yCoordinate).getPosition(),
									currentPosition)) {

								/* the surrounding points are calculated */
								for (Vector point : mutableCostMap
										.getSurroundingPoints(xCoordinate,
												yCoordinate + stepsAhead)) {

									/* the surrounding costs are assigned */
									mutableCostMap.setPublicCost(point.getX(),
											point.getY(), 5000);
								}
							}
						}
					}
				}
			}
		}
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

		RunAStar.getMap().setStartLocation(currentPosition, this);

		/* this is only run if its not the initial path finding process */
		if (currentPosition != null) {

			occupyNodeArea(currentPosition, false, false, null);

			/* print out the area map when in developer mode */
			if (RunAStar.DEVELOPER_MODE) {
				RunAStar.getMap().printMap();
			}

			/* this sets the new start of the A* to the current position */
			start = currentPosition;

			// mutableAreaMap.getNode(start).setProperty(Property.START, null);

			/* this declares the area around agents as high cost terrain */
			updateCostmap();
		}

		/* run the path finding algorithm */
		AStar astar = new AStar(RunAStar.getMap(), mutableCostMap, this);

		/* retrieve the path information */
		path = astar.getBestPath();

		/*
		 * print the newly generated cost map including the path when in
		 * developer mode
		 */
		// if (currentPosition != null && RunAStar.DEVELOPER_MODE) {
		// mutableCostMap.printMapPathToConsole(path, mutableAreaMap, this);
		// }

		/* setting the new desired and current positions */
		desiredPosition = path.get(0).getPosition();

		if (!initialized) {
			currentPosition = new Vector2D(0, 0);

		}
		/* ends the stop watch performance logging */
		stopwatch.stop();
		System.out.println(stopwatch.getElapsedTime() + " ms for pathfinding");

		astar.printPath(path);
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
		return FuncLib.vectorsAreEqual(desiredPosition, goal);
	}

	/**
	 * This method check if the node is blocked and if so, if the node was
	 * blocked by someone else or this agent.
	 * 
	 * @param vector
	 *            the specific vector
	 * @return if the node is blocked by someone else
	 */
	private boolean nodeBlockedBySomeoneElseOrObstacle(Vector vector) {

		/* get the node at the location */

		// TODO This only works if the rotation is rectangular. When the area is
		// rotated, it should be used a square with the dimension of the larger
		// of the two properties.

		/* check if it is blocked */
		for (int x = -dim; x <= dim; x++) {
			for (int y = dim; y <= dim; y++) {

				Node checkNode = RunAStar.getMap().getNodeByCoordinate(
						vector.getX() + x, vector.getY() + y);
				if (checkNode != null) {
					if (checkNode.getProperty() == Property.AGENT) {

						/* check if its was not this agent who blocked it */
						if (checkNode.getLinkedAgentID() != this.passenger
								.getId()) {

							for (Agent agent : RunAStar.getAgentList()) {

								if (agent.getPassenger().getId() == checkNode
										.getLinkedAgentID()) {
									this.blockingAgent = agent;
								}
							}
							return true;
						}
					}
					if (checkNode.getProperty() == Property.OBSTACLE) {
						// System.out
						// .println("###### !OVERLAPPING OF AGENT AND OBSTACLE! ###### !AGENT - nodeBlockedBySomeoneElseOrObstacle()! ######");
						// return true;
					}
				}
			}
		}
		return false;

	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Path> getPathList() {
		return pathlist;
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

					/* the current position is the last taken step in the path */
					currentPosition = path.get(i - 1).getPosition();
				}

				/* the new planned location is current step in the path */
				desiredPosition = path.get(i).getPosition();

				/* check if the desired next step is blocked by someone else */
				if (nodeBlockedBySomeoneElseOrObstacle(desiredPosition)) {

					/* raise the interrupts counter up by one */
					numbOfInterupts++;

					/* get the correct behavior for an obstacle avoidance */
					Situation collision = new Situation(agentMood);

					/* Perform the correct behavior */
					collision.handleCollision();

					/* the main loop is quit, if there is a new path calculated */
					if (exitTheMainLoop) {

						if (RunAStar.DEVELOPER_MODE) {
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

					occupyNodeArea(currentPosition, false, false, null);
					occupyNodeArea(currentPosition, true, true, 90);

					/* sleep the thread as long as the luggage is stowed */
					Thread.sleep((int) (passenger.getLuggageStowTime() * 1000 / 2 / speedfactor));

					/* notify everyone that the luggage is now stowed */
					alreadyStowed = true;

					/*
					 * if there is no obstacle or luggage stowing required, run
					 * the default step
					 */
				} else if (waitingForClearingOfRow() && !waitingCompleted) {

					// TODO: get the right passenger here!
					for (Passenger pax : otherPassengersInRowBlockingMe) {

						RunAStar.launchWaymakingAgent(pax);

					}

					Thread.sleep((int) (2000));

					waitingCompleted = true;

					System.out.println("Someone is already in that row! :(");

				} else {

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
						passenger.setOrientationInDegree(getRotation());

						/* catch possible errors */
					} catch (ConcurrentModificationException e) {
						System.out
								.println("###### !ConcurrentModificationException ERROR! ###### !AGENT - setPosition()! ######");
					} catch (ArrayIndexOutOfBoundsException a) {
						System.out
								.println("###### !ArrayIndexOutOfBoundsException ERROR! ###### !AGENT - setPosition()! ######");

					}

					/* sleep as long as one step takes */
					Thread.sleep((int) (1000 / speedfactor / (passenger
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

	private boolean waitingForClearingOfRow() {

		Seat mySeat = passenger.getSeatRef();

		if (desiredPosition.getY() == (int) (mySeat.getYPosition() / scale - PIXELS_FOR_WAY)) {
			if (someoneAlreadyInThisPartOfTheRow(mySeat)) {
				return true;
			}
		}

		return false;
	}

	private synchronized void occupyOneStepAhead() {
		occupyNodeArea(currentPosition, false, false, null);
		occupyNodeArea(desiredPosition, true, false, null);
	}

	/**
	 * 
	 * @return
	 */
	public boolean isExitPathLoop() {
		return exitTheMainLoop;
	}

	private boolean doorwayBlocked() {
		Door door = passenger.getDoor();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (int) (door.getWidth() / scale); j++) {
				Node node = RunAStar.getMap().getNodeByCoordinate(i,
						(int) (door.getYPosition() / scale) + j);
				if (node.getProperty() == Property.AGENT) {
					if (node.getLinkedAgentID() != passenger.getId()) {
						return true;
					}
				}
			}
		}
		System.out.println("Doorway clear!");
		return false;
	}

	/**
	 * 
	 * @param exitPathLoop
	 */
	public void setExitPathLoop(boolean exitPathLoop) {
		this.exitTheMainLoop = exitPathLoop;
	}

	/**
	 * This method runs the agents walking simulation.
	 */
	public void run() {
		try {

			/* set the current position to the starting point */
			currentPosition = start;

			/* add the path to the list of paths */
			pathlist.add(path);

			if (!skipDelay) {
				/* sleep the thread as long as the boarding delay requires it */
				Thread.sleep((int) (passenger.getStartBoardingAfterDelay() * 1000 / speedfactor));

				/*
				 * then try to spawn the passenger but check if there is enough
				 * space in front of the cabin door
				 */
				while (doorwayBlocked()) {
					Thread.sleep(100);
				}

				while (!RunAStar.CabinAccessGranted(this)) {
					Thread.sleep(100);
				}

			}

			/* start counting the elapsed time for boarding */
			stopwatch.start();

			/* run path following as long as the goal is not reached yet */
			while (!goalReached()) {

				/* this is run again if the agent detects obstacles in his path */
				followPath();
			}

			// TODO: IF THE PASSENGER IS IN MAKE_WAY MODE, MAKE HIM RETURN TO
			// HIS SEAT WHEN HE REACHES HIS GOAL AGAIN!

			/* when the goal is reached, the passenger is defined seated */
			passenger.setIsSeated(true);

			/* then the assigned seat is declared occupied */
			passenger.getSeatRef().setOccupied(true);

			/* the stop watch is then interrupted */
			stopwatch.stop();

			/* the boarding time is then submitted back to the passenger */
			passenger
					.setBoardingTime((int) (stopwatch.getElapsedTimeSecs() * speedfactor));

			/* the number of interrupts is submitted to the passenger */
			passenger.setNumberOfWaits(numbOfInterupts);

			/* clear the current position of the agent */
			occupyNodeArea(currentPosition, false, false, null);
			occupyNodeArea(desiredPosition, false, false, null);

			/* RunAStar is notified that a passenger is seated now */
			RunAStar.setPassengerSeated(passenger, this);

		} catch (InterruptedException e) {

			/* This loop is run if there was an unknown error during runtime */
			System.out.println("thread got an error");
		}
	}

	private boolean someoneAlreadyInThisPartOfTheRow(Seat mySeat) {
		Row row = mySeat.getRow();
		for (Seat checkSeat : row.getSeats()) {
			if (checkSeat.isOccupied()) {
				if (sameSideOfAisle(checkSeat, mySeat)) {
					if (OtherSeatCloserToAisle(checkSeat, mySeat)) {
						otherPassengersInRowBlockingMe.add(checkSeat
								.getPassenger());
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 * TODO: ONLY APPLICABLE FOR 3-3 CONFIGURATIONS OR BELOW!
	 */
	private boolean sameSideOfAisle(Seat checkSeat, Seat mySeat) {

		if ("ABC".contains(mySeat.getLetter())) {
			if ("ABC".contains(mySeat.getLetter())) {
				return true;
			}
		}
		if ("DEF".contains(mySeat.getLetter())) {
			if ("DEF".contains(mySeat.getLetter())) {
				return true;
			}
		}
		return false;
	}

	// TODO: this only works for a ONE AISLE configuration!
	private boolean OtherSeatCloserToAisle(Seat checkSeat, Seat mySeat) {

		int middleOfCabinX = (int) (RunAStar.getCabin().getCabinWidth() / 2.0 / scale);

		int checkSeatToAisleDistanceX = Math.abs(checkSeat.getXPosition()
				/ scale - middleOfCabinX);

		int mySeatToAisleDistanceX = Math.abs(mySeat.getXPosition() / scale
				- middleOfCabinX);

		if (checkSeatToAisleDistanceX < mySeatToAisleDistanceX) {
			return true;
		}
		return false;
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

}