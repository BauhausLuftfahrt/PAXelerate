package model;
import javax.swing.event.EventListenerList;

import java.util.*;

import javax.swing.event.EventListenerList;
import observer.Subject;
import observer.Observer;
import observer.AgentPosition;

public class Agent extends Subject implements Runnable {
	private Thread t;
	private String agentName;
	private int[][] path;

	private int startX;
	private int startY;
	private int goalX;
	private int goalY;
	
	
	private int previousX;
	private int previousY;
	
	private int currentX;
	private int currentY;
	
	private int[][] currentAgentPosition = new int[1][2];

	 private EventListenerList listeners = new EventListenerList();

	Agent(String name, int startX, int startY, int goalX, int goalY) {
		this.agentName = name;
		this.startX = startX;
		this.startY = startY;
		this.goalX = goalX;
		this.goalY = goalY;
		
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
	
	
	

	

	public void run() {
		try {
			this.currentAgentPosition = new int[path.length][2];
			for (int i = 0; i < path.length; i++) {
				//System.out.println(agentName + ": Position   ---   " + path[i][0] + " " + path[i][1]);
				
				
				//first step of the agent
				if(i != 0) {
					this.previousX = path[i-1][0];
					this.previousY = path[i-1][1];
				}
				this.currentX = path[i][0];
				this.currentY = path[i][1];
				
				
				if(TestAStar.map.getNode(currentX, currentY).isOccupiedByAgent() == true){
				 Thread.sleep(1000);
				}
				else {

					TestAStar.map.getNode(previousX, previousY).setOccupiedByAgent(false);
					TestAStar.map.getNode(currentX, currentY).setOccupiedByAgent(true);	
						
					this.currentAgentPosition[i][0] = this.currentX;
					this.currentAgentPosition[i][1] = this.currentY;
					
					
					
					TestAStar.map.getNode(currentX, currentY).setOccupiedByAgent(true);
					TestAStar.map.getNode(previousX, previousY).setOccupiedByAgent(false);
			
					
					
					notifyObservers(i);
					
					
					
				//	System.out.println(this.agentName + "Position: " + this.currentX + " " + this.currentY);
				
					Thread.sleep(500);	
				}
			}
			System.out.println(this.agentName + " has reached his destination.");
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
			e.printStackTrace();
		}
	}

	// start method calls run
	public void start() {
		System.out.println("Starting " + agentName);
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