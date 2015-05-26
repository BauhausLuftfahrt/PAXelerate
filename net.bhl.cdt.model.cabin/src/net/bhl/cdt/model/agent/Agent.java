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
import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Rotator;
import net.bhl.cdt.model.cabin.util.StopWatch;
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
	private final agentMode mode;

	private Passenger thePassengerILetInTheRow;

	public static enum agentMode {
		GO_TO_SEAT, MAKE_WAY
	}

	private int[][] defaultPassengerArea;
	private int[][] adaptedPassengerArea;

	public ArrayList<Passenger> otherPassengersInRowBlockingMe = new ArrayList<Passenger>();

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
			CostMap costmap, agentMode mode, Passenger thePassengerILetInTheRow) {

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
			this.agentMood = new AggressiveMood(this);
		} else if (passenger.getPassengerMood() == PassengerMood.PASSIVE) {
			this.agentMood = new PassiveMood(this);
		}

		defaultPassengerArea = new int[(int) (passenger.getWidth() / scale)][(int) (passenger
				.getDepth() / scale)];
		for (int i = 0; i < (int) (passenger.getWidth() / scale); i++) {
			for (int j = 0; j < (int) (passenger.getDepth() / scale); j++) {
				defaultPassengerArea[i][j] = 1;
			}
		}

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
		if (SimulationHandler.getMap().getNode(vector).getProperty() == Property.AGENT
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
			occupyNodeArea(currentPosition, false, false, null);
			occupyNodeArea(currentPosition, true, true, degrees);
		}
	}

	private boolean rotationAllowed() {
		return false;
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
		CostMap costmap = new CostMap(SimulationHandler.getMap()
				.getDimensions(), start, SimulationHandler.getMap(), false,
				this, true);

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
					if (SimulationHandler.getMap()
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
									SimulationHandler
											.getMap()
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

		SimulationHandler.getMap().setStartLocation(currentPosition, this);

		/* this is only run if its not the initial path finding process */
		if (currentPosition != null) {

			occupyNodeArea(currentPosition, false, false, null);

			/* print out the area map when in developer mode */
			if (SimulationHandler.DEVELOPER_MODE) {
				SimulationHandler.getMap().printMap();
			}

			/* this sets the new start of the A* to the current position */
			start = currentPosition;

			// mutableAreaMap.getNode(start).setProperty(Property.START, null);

			/* this declares the area around agents as high cost terrain */
			updateCostmap();
		}

		/* run the path finding algorithm */
		AStar astar = new AStar(SimulationHandler.getMap(), mutableCostMap,
				this);

		/* retrieve the path information */
		path = astar.getBestPath();

		/* setting the new desired and current positions */
		desiredPosition = path.get(0).getPosition();

		if (!initialized) {
			currentPosition = new Vector2D(0, 0);

		}
		/* ends the stop watch performance logging */
		stopwatch.stop();
		System.out.println(stopwatch.getElapsedTime() + " ms for pathfinding");
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

		for (int x = -dim; x <= dim; x++) {
			for (int y = dim; y <= dim; y++) {

				Node checkNode = SimulationHandler.getMap()
						.getNodeByCoordinate(vector.getX() + x,
								vector.getY() + y);
				if (checkNode != null) {
					if (checkNode.getProperty() == Property.AGENT) {

						/* check if its was not this agent who blocked it */
						if (checkNode.getLinkedAgentID() != this.passenger
								.getId()) {

							for (Agent agent : SimulationHandler.getAgentList()) {

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

					rotateAgent(90);

					/* sleep the thread as long as the luggage is stowed */
					Thread.sleep(FuncLib.transformTime(passenger
							.getLuggageStowTime()));

					/* notify everyone that the luggage is now stowed */
					alreadyStowed = true;

					/*
					 * if there is no obstacle or luggage stowing required, run
					 * the default step
					 */
				} else if (waitingForClearingOfRow() && !waitingCompleted) {

					// TODO: get the right passenger here!
					for (Passenger pax : otherPassengersInRowBlockingMe) {

						SimulationHandler.launchWaymakingAgent(pax,
								this.passenger);

					}

					while (!otherPassengerStoodUp()) {
						Thread.sleep((int) (10));
					}

					// TODO: calculate the waiting time!
					Thread.sleep((int) (3000));

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
							.getSpeedFactor() / (passenger.getWalkingSpeed() * 100 / scale)));
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
			if (AgentFunctions.someoneAlreadyInThisPartOfTheRow(mySeat, this)) {
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

	private void defineSeated(boolean isSeated) {

		/* when the goal is reached, the passenger is defined seated */
		passenger.setIsSeated(isSeated);

		/* then the assigned seat is declared occupied */
		passenger.getSeatRef().setOccupied(isSeated);

		/* RunAStar is notified that a passenger is seated now */
		SimulationHandler.setPassengerSeated(passenger, isSeated);
	}

	private boolean inDefaultBoardingMode() {
		if (mode == agentMode.MAKE_WAY) {
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

	public void performFinalElements() {

		defineSeated(true);

		/* the stop watch is then interrupted */
		stopwatch.stop();

		/* the boarding time is then submitted back to the passenger */
		passenger
				.setBoardingTime((int) (stopwatch.getElapsedTimeSecs() * SimulationHandler
						.getCabin().getSpeedFactor()));

		/* the number of interrupts is submitted to the passenger */
		passenger.setNumberOfWaits(numbOfInterupts);

		/* clear the current position of the agent */
		occupyNodeArea(currentPosition, false, false, null);
		occupyNodeArea(desiredPosition, false, false, null);

	}

	/**
	 * This method runs the agents walking simulation.
	 */
	public void run() {
		try {

			if (!inDefaultBoardingMode()) {

				/*
				 * if the agent should clear the row for a passenger, unblock
				 * the seat
				 */
				defineSeated(false);
			}

			/* set the current position to the starting point */
			currentPosition = start;

			/* add the path to the list of paths */
			pathlist.add(path);

			if (inDefaultBoardingMode()) {
				/* sleep the thread as long as the boarding delay requires it */
				Thread.sleep(FuncLib.transformTime(passenger
						.getStartBoardingAfterDelay()));

				/*
				 * then try to spawn the passenger but check if there is enough
				 * space in front of the cabin door
				 */
				while (AgentFunctions.doorwayBlocked(passenger)) {
					Thread.sleep(10);
				}

				while (!SimulationHandler.CabinAccessGranted(this)) {
					Thread.sleep(10);
				}

			}

			/* start counting the elapsed time for boarding */
			stopwatch.start();

			/* run path following as long as the goal is not reached yet */
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

				// TODO: SLEEP PASSENGER WHO IS NEXT IN THE LIST UNTIL I AM
				// SEATED AGAIN!

				// Passenger pas = RunAStar
				// .getCabin()
				// .getPassengers()
				// .get(RunAStar.getCabin().getPassengers()
				// .indexOf(thePassengerILetInTheRow) + 1);

				// RunAStar.sleepAgent(1000, pas);
				// // TODO: DOES NOT WORK!!! Why can this thread not be
				// // interrupted?

				/* sleep until the other passenger has seated! */
				while (!thePassengerILetInTheRow.isIsSeated()) {
					Thread.sleep(10);

				}

				// TODO: DEBLOCK AISLE

				/* new helper vector stores the start */
				Vector helper = new Vector2D(start);

				/* swap goal and start position */
				start = new Vector2D(goal);
				goal = new Vector2D(helper);

				path.invert();
				path.appendWayPoint(SimulationHandler.getMap().getNode(goal));

				/* go back to the start */
				while (!goalReached()) {

					/*
					 * this is run again if the agent detects obstacles in his
					 * path
					 */
					followPath();

				}
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

}
