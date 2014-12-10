package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import javax.swing.JFrame;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

public class RunAStar {

	private Vector dimensions = new Vector();
	private static Cabin cabin;
	private static Boolean simulationDone = false;
	private ObstacleMap obstacleMap;
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	private static Logger console = new Logger();
	private static AreaMap map;
	private static ArrayList<Agent> agents = new ArrayList<Agent>();
	private static ArrayList<int[][]> pathList = new ArrayList<int[][]>();
	private static StopWatch s = new StopWatch();
	private static StopWatch sw = new StopWatch();

	/**
	 * 
	 * @param obstacleMapn
	 * @param mapWidth
	 * @param mapHeight
	 * @param cabinn
	 */
	public RunAStar(ObstacleMap obstaclemap, int mapWidth, int mapHeight,
			Cabin cabinn) {

		this.obstacleMap = obstaclemap;
		dimensions.set(mapWidth, mapHeight);

		console.addToLog("Cabin initializing...");

		map = new AreaMap(dimensions, obstacleMap);
		cabin = cabinn;
		run();
	}

	public static void setMap(AreaMap map) {
		RunAStar.map = map;
	}

	/**
	 * 
	 * @param map
	 * @param agent
	 * @return
	 */
	public static int[][] getPath(AreaMap map, Agent agent) {
		// start the stop watch for individual agent path calculation
		s.start();

		// create a new instance of the AStar class
		AStar pathFinder = new AStar(map);

		console.addToLog("Calculating shortest path..."); // for
															// "+agent.getAgentName()+"
															// ...");

		// calculate shortest path for the individual agent
		pathFinder.calcShortestPath(new Vector(agent.getStartX(), agent.getStartY()),
				new Vector(agent.getGoalX(), agent.getGoalY()));

		s.stop();
		// console.addToLog("Time to calculate path in milliseconds: "+
		// s.getElapsedTime());

		// console.addToLog("Printing map of shortest path...");
		// pathFinder.printPath();

		// set instance of the Path class to the shortest path calculated by
		// AStar instance
		Path shortestPath = pathFinder.getShortestPath();
		if (shortestPath == null) {
			console.addToLog("No path found.");
		}
		// else console.addToLog("Path found.");

		// set the agent's path variable to the calculated shortest path.

		// getPathCoordinates() creates an integer array from the path's
		// waypoints because the agent's path coordinates are stored in an
		// integer array.
		agent.setPath(getPathCoordinates(pathFinder.getShortestPath()));

		// return the path coordinates of the shortest path
		return getPathCoordinates(pathFinder.getShortestPath());

	}

	/**
	 * 
	 * @param shortestPath
	 * @return
	 */
	public static int[][] getPathCoordinates(Path shortestPath) {

		// convert path consisting of waypoints into an integer array containing
		// the coordinates of each waypoint

		int[][] pathCoordinates = new int[shortestPath.getLength()][2];

		for (int i = 0; i < shortestPath.getLength(); i++) {
			pathCoordinates[i][0] = shortestPath.getWayPoint(i).getX();
			pathCoordinates[i][1] = shortestPath.getWayPoint(i).getY();
		}

		return pathCoordinates;

	}

	/**
	 *
	 */
	public static AreaMap getMap() {
		return map;
	}

	/**
	 * 
	 * @param agent
	 */
	public static void addAgentToAgentList(Agent agent) {
		agents.add(agent);
	}

	/**
	 * 
	 * @return
	 */
	public static int[][] runAgents() {

		sw.start();
		/** First generate all paths ... */

		// iterate through agent list, calculate shortest path and assign
		// shortest path to agent, subscribe an observer to each agent

		for (Agent agent : agents) {

			// calculate the shortest path for each agent.
			getPath(map, agent);

			// AgentPosition is created as an observer for the agent
			// Based on the observer pattern, the agent sends a notification to
			// AgentPosition when he
			// updates his position

			// AgentPosition pos = new AgentPosition();
			// agent.subscribe(pos);
		}
		sw.stop();
		System.out.println("Berechnungsdauer für Pfade: "
				+ sw.getElapsedTime()+" milliseconds");
		/** ... then start the simulations simultaneously */

		// iterate through the agent list and start threads for individual
		// agents
		for (Agent agent : agents) {
			agent.start();
		}
		return null;
	}

	public static void setSimulationDone(Boolean bool) {
		simulationDone = bool;
	}

	public static Cabin getCabin() {
		return cabin;
	}

	public static Boolean getSimulationDone() {
		return simulationDone;
	}

	public static void submitPath(int[][] path) {
		pathList.add(path);
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<int[][]> getPathList() {
		return pathList;
	}

	public static void setPassengerSeated(Passenger passenger) {
		finishedList.add(passenger);
		if (finishedList.size() == cabin.getPassengers().size()) {
			setSimulationDone(true);
		}

	}

	public Cabin getPassengerLocations() {
		return cabin;
	}

	public static void run() {

		// iterate through the openCDT passenger list and create agents based on
		// passenger information
		for (Passenger passenger : ModelHelper.getChildrenByClass(cabin,
				Passenger.class)) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Agent agent = new Agent(
					"Passenger " + passenger.getName(),
					passenger,
					0,
					(int) ((door.getYPosition() + door.getWidth() / 2) / cabin
							.getScale()),
					(int) ((seat.getXPosition() + seat.getXDimension() / 2) / cabin
							.getScale()), (int) ((seat.getYPosition() / cabin
							.getScale()) - 1), (int) cabin.getScale());
			// list of all agents
			addAgentToAgentList(agent);
		}

		// iterate through the list of all agents, calculate each agent's path,
		// then start the thread of each agent.
		runAgents();

	}
}
