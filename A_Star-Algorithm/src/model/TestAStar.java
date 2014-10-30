package model;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import observer.AgentPosition;


public class TestAStar {

	private static int mapWidth = 20;
	private static int mapHeight = 20;

	private static int[][] obstacleMap = {
			{ 0, 0, 0, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 0 },
			{ 0, 0, 0, 100000, 100000, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0 },
			{ 0, 0, 0, 0, 0, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0 },
			{ 0, 0, 0, 0, 100000, 100000, 0, 0, 100000, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0 },
			{ 0, 100000, 100000, 100000, 100000, 0, 0, 100000, 100000, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 100000, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0 },
			{ 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 100000, 100000, 100000, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 100000, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 100000, 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	private static int startX = 0;
	private static int startY = 1;
	private static int goalX = 19;
	private static int goalY = 15;

	
	public static JFrame frame;
	/*
	 * private static int mapWidth; private static int mapHeight; private static
	 * int[][] obstacleMap;
	 * 
	 * private static int startX; private static int startY; private static int
	 * goalX; private static int goalY;
	 */

	static Logger log = new Logger();
	static AreaMap map = new AreaMap(mapWidth, mapHeight, obstacleMap);
	static ArrayList<Agent> agents = new ArrayList();
	static StopWatch s = new StopWatch();

	// constructor is called from matlab: initializes the obstacleMap and
	// start/goal position for each PAX list member
	public TestAStar(int[][] obstacleMap, int mapWidth, int mapHeight,
			String agentID, int agentStartX, int agentStartY, int agentGoalX,
			int agentGoalY) {

		this.obstacleMap = obstacleMap;
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		System.out.println("We are in Java...");

		log.addToLog("Cabin initializing...");
		this.map = new AreaMap(mapWidth, mapHeight, obstacleMap);

		Agent t = new Agent(agentID, agentStartX, agentStartY, agentGoalX,
				agentGoalY);
		addAgentToAgentList(t);

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
		int[][] pathCoordinates = new int[shortestPath
				.getLength()][2];

		for (int i = 0; i < shortestPath.getLength(); i++) {
			pathCoordinates[i][0] = shortestPath.getWayPoint(i)
					.getX();
			pathCoordinates[i][1] = shortestPath.getWayPoint(i)
					.getY();
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
		
		
		Agent T1 = new Agent("Agent - 1", startX, startY, goalX, goalY);
		Agent T2 = new Agent("Agent - 2", 0, 1, 3, 18);

		addAgentToAgentList(T1);
		addAgentToAgentList(T2);
		
		
		runAgent();

	}
}
