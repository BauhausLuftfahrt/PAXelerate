package net.bhl.cdt.model.astar;

import java.util.ArrayList;

import javax.swing.JFrame;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.observer.AgentPosition;
import net.bhl.cdt.model.util.ModelHelper;

public class TestAStar {

    private static int mapWidth = 20;
	private static int mapHeight = 20;
	private static Cabin cabin;
	
	public static Boolean simulationDone = false;
	static CabinViewPart cabinViewPart;

	
	private static int[][] obstacleMap = {};
	 
	public static JFrame frame;

	static ArrayList<Passenger> finishedList = new ArrayList<Passenger>();
	
	static Logger console = new Logger();
	static AreaMap map;
	static ArrayList<Agent> agents = new ArrayList<Agent>();
	public static ArrayList<int[][]> pathList = new ArrayList<int[][]>();
	static StopWatch s = new StopWatch();

	public TestAStar(int[][] obstacleMapn, int mapWidthn, int mapHeightn, Cabin cabinn) {
		
		obstacleMap = obstacleMapn;
		mapWidth = mapWidthn;
		mapHeight = mapHeightn;

		console.addToLog("Cabin initializing...");
		
		map = new AreaMap(mapWidth, mapHeight, obstacleMap);
		cabin = cabinn;
		run();
	}

	public static int[][] getPath(AreaMap map, Agent agent) {

		s.start();

		AStar pathFinder = new AStar(map);

		console.addToLog("Calculating shortest path..."); //for "+agent.getAgentName()+" ...");
		pathFinder.calcShortestPath(agent.getStartX(), agent.getStartY(),
				agent.getGoalX(), agent.getGoalY());

		s.stop();
		//console.addToLog("Time to calculate path in milliseconds: "+ s.getElapsedTime());

		//console.addToLog("Printing map of shortest path...");
		//pathFinder.printPath();
		Path shortestPath = pathFinder.getShortestPath();
		if (shortestPath==null) {
			console.addToLog("No path found.");
		}
		//else console.addToLog("Path found.");

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
	public static int[][] runAgents() {

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
	public static void submitPath(int[][] path) {
		pathList.add(path);
	}
	
	public static ArrayList<int[][]> getPathList() {
		return pathList;
	}
	
	public static void setPassengerSeated(Passenger passenger) {
		finishedList.add(passenger);
		if(finishedList.size()==cabin.getPassengers().size()) {	
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

//	            frame = new JFrame("Boarding Simulation");
//	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	            frame.setContentPane(new CabinView());
//	            frame.pack();
//	            frame.setVisible(true);
	         }
	      });

		for(Passenger passenger:ModelHelper.getChildrenByClass(cabin, Passenger.class)) {
			Seat seat = passenger.getSeatRef();
			Door door = passenger.getDoor();
			Agent agent = new Agent("Passenger "+passenger.getName(), passenger, 0, (int)((door.getYPosition()+door.getWidth()/2)/cabin.getScale()), (int)((seat.getXPosition()+seat.getWidth()/2)/cabin.getScale()),(int)((seat.getYPosition()/cabin.getScale())-1),(int)cabin.getScale());
			addAgentToAgentList(agent);
		}
		runAgents();
		
		
	}
}
