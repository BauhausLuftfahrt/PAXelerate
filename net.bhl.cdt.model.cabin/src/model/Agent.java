package model;

import net.bhl.cdt.model.cabin.Passenger;
import observer.Subject;


public class Agent extends Subject implements Runnable {
	private Thread t;
	private String agentName;
	private int[][] path;

	private int startX;
	private int startY;
	private int goalX;
	private int goalY;
	
	private Passenger passenger;
	private int scale;
	
	static StopWatch s = new StopWatch();
	
	private int previousX;
	private int previousY;
	
	private int id; 
	
	private int currentX;
	private int currentY;
	
	static Logger log = new Logger();
	
	private int[][] currentAgentPosition = new int[1][2];

	Agent(String name, Passenger passenger, int startX, int startY, int goalX, int goalY,int scale, int id) {
		this.id = id;
		this.passenger = passenger;
		this.agentName = name;
		this.startX = startX;
		this.startY = startY;
		this.goalX = goalX;
		this.goalY = goalY;
		this.scale = scale;
		this.currentAgentPosition[0][0] = startX;
		this.currentAgentPosition[0][1] = startY;
		

	}

	// getters and setters for agent's starting position, goal position and path

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public int[][] getPath() {
		return path;
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getGoalX() {
		return goalX;
	}

	public void setGoalX(int goalX) {
		this.goalX = goalX;
	}

	public int getGoalY() {
		return goalY;
	}

	public void setGoalY(int goalY) {
		this.goalY = goalY;
	}

	public void setPath(int[][] path) {
		this.path = path;
	}
	
	public int[][] getCurrentAgentPosition() {
		return currentAgentPosition;
	}

	public void setCurrentAgentPosition(int[][] currentAgentPosition) {
		this.currentAgentPosition = currentAgentPosition;
	}
	
	/**
	 * Rotation from 0 to 359 degrees. Only 45° steps. North is 0°.
	 * @param xWay
	 * @param yWay
	 * @return
	 */
	public int getRotation(int xWay, int yWay) {
		int deg = 0;
		if (xWay>0) {
			if(yWay == 0) {deg = 90;}
			if(yWay < 0) {deg = 45;}
			if(yWay > 0) {deg = 135;}	
		} else if(xWay<0) {
			
			if(yWay > 0) {deg = 225;}
			if(yWay < 0) {deg = 315;}
		} else if(xWay == 0) {
			if(yWay == 0) {deg = 0;}
			if(yWay > 0) {deg = 180;}
			if(yWay < 0) {deg = 0;}
		}
		return deg;
	}
	
	public void run() {
		try {
			Thread.sleep((int)(passenger.getStartBoardingAfterDelay()*1000));
			s.start();
			this.currentAgentPosition = new int[path.length][2];
			TestAStar.submitPath(path);
			for (int i = 0; i < path.length; i++) {
				//first step of the agent
				if(i != 0) {
					this.previousX = path[i-1][0];
					this.previousY = path[i-1][1];
				}
				this.currentX = path[i][0];
				this.currentY = path[i][1];	
				if(TestAStar.map.getNode(currentX, currentY).isOccupiedByAgent() == true){
				 Thread.sleep(200);
				 // here a new path should be calculated!
				}
				else {
					TestAStar.map.getNode(previousX, previousY).setOccupiedByAgent(false);
					TestAStar.map.getNode(currentX, currentY).setOccupiedByAgent(true);							
					this.currentAgentPosition[i][0] = this.currentX;
					this.currentAgentPosition[i][1] = this.currentY;
					TestAStar.map.getNode(currentX, currentY).setOccupiedByAgent(true);
					TestAStar.map.getNode(previousX, previousY).setOccupiedByAgent(false);
					notifyObservers(i);
					
					passenger.setPositionX(this.currentAgentPosition[i][0]*scale);
					passenger.setPositionY(this.currentAgentPosition[i][1]*scale);
					passenger.setOrientationInDegree(getRotation((currentX - previousX),(currentY - previousY)));
					Thread.sleep((int)(1000/(passenger.getWalkingSpeed()*100/scale)));	
				}
			}
			passenger.setIsSeated(true);
			TestAStar.setPassengerSeated(passenger);	
			s.stop();
			passenger.setBoardingTime(s.getElapsedTime()/1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// start method calls run
	public void start() {
		if (getT() == null) {
			setT(new Thread(this, agentName));
			getT().start();
		}
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

}