package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.util.ModelHelper;
import observer.AgentPosition;

public class TestAStar {

	private static int mapWidth = 20;
	private static int mapHeight = 20;
	public static Cabin cabin;
	
	public static Boolean simulationDone = false;
	static CabinViewPart cabinViewPart;

	
	 private static int[][] obstacleMap = {};
	 

	//private static int[][] obstacleMap;

	public static JFrame frame;

	static ArrayList<Passenger> finishedList = new ArrayList();
	
	static Logger log = new Logger();
	static AreaMap map;
	static ArrayList<Agent> agents = new ArrayList();
	static StopWatch s = new StopWatch();

	// constructor is called from matlab: initializes the obstacleMap and
	// start/goal position for each PAX list member
	public TestAStar(int[][] obstacleMap, int mapWidth, int mapHeight, Cabin cabin) {
		
		this.obstacleMap = obstacleMap;
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;

		log.addToLog("Cabin initializing...");
		this.map = new AreaMap(mapWidth, mapHeight, obstacleMap);
		this.cabin = cabin;
		run();
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
		//pathFinder.printPath();
		Path shortestPath = pathFinder.getShortestPath();
		if (shortestPath.equals(null)) {
			log.addToLog("No path found.");
		}
		else log.addToLog("Path found.");

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
	
	public static void setSimulationDone(Boolean bool) {
		simulationDone = bool;	
	}
	
	public static Boolean getSimulationDone() {
		return simulationDone;
	}
	public static void setPassengerSeated(Passenger passenger) {
		finishedList.add(passenger);
		//log.addToLog("Passenger "+passenger.getName() + " is now seated.");
		if(finishedList.size()==cabin.getPassengers().size()) {
			//log.addToLog("All passengers are now seated.");	
			setSimulationDone(true);
		}
		
	}
	
//	public static int[] getCoordinates() {
//		int[] loc = new int[2];
//		int yLoc = 0;
//		int xLoc = 0;
//		for (int x = 0; x < TestAStar.map.getMapWidth(); x++) {
//			for (int y = 0; y < TestAStar.map.getMapHeight(); y++) {
//				if (TestAStar.map.getNode(x, y).isOccupiedByAgent) {	
//					xLoc = x;
//					yLoc = y;
//				}
//			}
//		}
//		loc[0] = xLoc;
//		loc[1] = yLoc;
//		return (loc);
//	}
	public Cabin getPassengerLocations() {
		
		return cabin;
		
	}

	public static void run() {		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            // Set up main window (using Swing's Jframe)

	           // frame = new JFrame("Boarding Simulation");
	          //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	           // frame.setContentPane(new CabinView());
	          //  frame.pack();
	           // frame.setVisible(true);
	         }
	      });

		for(Passenger passenger:ModelHelper.getChildrenByClass(cabin, Passenger.class)) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Agent agent = new Agent("Passenger "+passenger.getName(), passenger, 5, (int)((door.getYPosition()+door.getWidth()/2)/cabin.getScale()), (int)(seat.getXPosition()/cabin.getScale()),(int)((seat.getYPosition()/cabin.getScale())-1),(int)cabin.getScale());
			addAgentToAgentList(agent);
		}
		runAgent();
		
	}
}
