package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import javax.swing.JFrame;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.observer.AgentPosition;
import net.bhl.cdt.model.util.ModelHelper;

public class RunAStar {

	private static int mapWidth = 20;
	private static int mapHeight = 20;
	private static Cabin cabin;
	private static Boolean simulationDone = false;
	private static int[][] obstacleMap = {};
	private static JFrame frame;
	private static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	private static Logger console = new Logger();
	private static AreaMap map;
	private static ArrayList<Agent> agents = new ArrayList<Agent>();
	private static ArrayList<int[][]> pathList = new ArrayList<int[][]>();
	private static StopWatch s = new StopWatch();

	/**
	 * 
	 * @param obstacleMapn
	 * @param mapWidthn
	 * @param mapHeightn
	 * @param cabinn
	 */
	public RunAStar(int[][] obstacleMapn, int mapWidthn, int mapHeightn,
			Cabin cabinn) {

		obstacleMap = obstacleMapn;
		mapWidth = mapWidthn;
		mapHeight = mapHeightn;

		console.addToLog("Cabin initializing...");

		map = new AreaMap(mapWidth, mapHeight, obstacleMap);
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

		s.start();

		AStar pathFinder = new AStar(map);

		console.addToLog("Calculating shortest path..."); // for
															// "+agent.getAgentName()+"
															// ...");
		pathFinder.calcShortestPath(agent.getStartX(), agent.getStartY(),
				agent.getGoalX(), agent.getGoalY());

		s.stop();
		// console.addToLog("Time to calculate path in milliseconds: "+
		// s.getElapsedTime());

		// console.addToLog("Printing map of shortest path...");
		// pathFinder.printPath();
		Path shortestPath = pathFinder.getShortestPath();
		if (shortestPath == null) {
			console.addToLog("No path found.");
		}
		// else console.addToLog("Path found.");

		agent.setPath(getPathCoordinates(pathFinder.getShortestPath()));

		// get the path coordinates of the shortest path
		return getPathCoordinates(pathFinder.getShortestPath());

	}

	/**
	 * 
	 * @param shortestPath
	 * @return
	 */
	public static int[][] getPathCoordinates(Path shortestPath) {

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

		/** First generate all paths ... */
		for (Agent agent : agents) {
			getPath(map, agent);
			AgentPosition pos = new AgentPosition();
			agent.subscribe(pos);
		}
		/** ... then start the simulations simultaneously */
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

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Set up main window (using Swing's Jframe)

				// frame = new JFrame("Boarding Simulation");
				// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// frame.setContentPane(new CabinView());
				// frame.pack();
				// frame.setVisible(true);
			}
		});

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
			addAgentToAgentList(agent);
		}
		runAgents();

	}
}
