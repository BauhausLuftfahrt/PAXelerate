package model;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import observer.AgentPosition;

public class TestAStar {

	private static int mapWidth = 20;
	private static int mapHeight = 20;

	/*
	 * private static int[][] obstacleMap = { { 0, 0, 0, 100000, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 0 }, { 0, 0, 0, 100000, 100000,
	 * 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0 }, { 0, 0, 0,
	 * 0, 0, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0 }, { 0,
	 * 0, 0, 0, 100000, 100000, 0, 0, 100000, 0, 0, 0, 0, 0, 0, 100000, 100000,
	 * 0, 0, 0 }, { 0, 100000, 100000, 100000, 100000, 0, 0, 100000, 100000, 0,
	 * 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 100000,
	 * 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0 }, { 100000, 100000, 100000,
	 * 100000, 100000, 100000, 100000, 100000, 0, 0, 0, 0, 100000, 100000, 0, 0,
	 * 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0,
	 * 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0,
	 * 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0,
	 * 100000, 100000, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0,
	 * 0, 0, 100000, 100000, 100000, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0,
	 * 100000, 100000, 0, 0, 0, 0, 100000, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0,
	 * 0, 100000, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	 * 0 } };
	 */

	private static int[][] obstacleMap;

	public static JFrame frame;
	/*
	 * private static int mapWidth; private static int mapHeight; private static
	 * int[][] obstacleMap;
	 * 
	 * private static int startX; private static int startY; private static int
	 * goalX; private static int goalY;
	 */

	static Logger log = new Logger();
	static AreaMap map;
	static ArrayList<Agent> agents = new ArrayList();
	static StopWatch s = new StopWatch();

	// constructor is called from matlab: initializes the obstacleMap and
	// start/goal position for each PAX list member
	public TestAStar(int[][] obstacleMap, int mapWidth, int mapHeight) {

		this.obstacleMap = obstacleMap;
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;

		log.addToLog("Cabin initializing...");
		this.map = new AreaMap(mapHeight, mapWidth, obstacleMap);
	}

	public static int[][] getPath(AreaMap map, Agent agent) {

		s.start();

		AStarHeuristic heuristic = new ClosestHeuristic();

		AStar pathFinder = new AStar(map, heuristic);

		log.addToLog("Calculating shortest path...");
		pathFinder.calcShortestPath(agent.getStartX(), agent.getStartY(),
				agent.getGoalX(), agent.getGoalY());

		s.stop();
		log.addToLog("Time to calculate path in milliseconds: "
				+ s.getElapsedTime());

		log.addToLog("Printing map of shortest path...");
		pathFinder.printPath();
		Path shortestPath = pathFinder.getShortestPath();

		agent.setPath(getPathCoordinates(pathFinder.getShortestPath()));

		// get the path coordinates of the shortest path
		return getPathCoordinates(pathFinder.getShortestPath());

	}

	// returns the coordinates of an individual path
	public static int[][] getPathCoordinates(Path shortestPath) {
		int[][] pathCoordinates = new int[shortestPath.getLength()][2];

		for (int i = 0; i < shortestPath.getLength(); i++) {
			pathCoordinates[i][0] = shortestPath.getWayPoint(i).getX();
			pathCoordinates[i][1] = shortestPath.getWayPoint(i).getY();
		}

		return pathCoordinates;

	}

	public static AreaMap getMap() {
		return map;
	}

	public static void addAgentToAgentList(Agent agent) {
		agents.add(agent);
	}

	// observer pattern to update agent's position on map
	public static int[][] runAgent() {

		for (Agent agent : agents) {
			getPath(map, agent);
			AgentPosition pos = new AgentPosition();
			agent.subscribe(pos);
			agent.start();
		}
		return null;
	}

	// main method creates list of agents and starts thread for each agent
	public static void main(String[] args) {

		run();
	}

	public static TestAStar run() {
		CabinGenerator generator = new CabinGenerator(45, 8, 15, 2,2, 2);
		TestAStar simulation = new TestAStar(
				generator.createObstacleMap(generator.generateCabin1()),
				(int) generator.getCabinWidth(),
				(int) generator.getCabinLength());

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Set up main window (using Swing's Jframe)

				frame = new JFrame("Boarding Simulation");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new CabinView());
				frame.pack();
				frame.setVisible(true);
			}
		});

		obstacleMap = generator.createObstacleMap(generator.generateCabin1());

		Agent T1 = new Agent("Agent - 1", 0, 1, 11, 2);
		Agent T2 = new Agent("Agent - 2", 0, 2, 8, 5);

		addAgentToAgentList(T1);
		addAgentToAgentList(T2);

		runAgent();
		return simulation;
	}
}
