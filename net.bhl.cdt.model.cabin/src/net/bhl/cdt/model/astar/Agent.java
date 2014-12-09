package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.observer.Subject;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Agent extends Subject implements Runnable {
	private Thread thread;
	private String agentName;
	private int[][] path;

	private Vector startPoint = new Vector();
	private Vector goalPoint = new Vector();
	private Vector previousPoint = new Vector();
	private Vector currentPoint = new Vector();

	private Passenger passenger;
	private int scale;
	private double firstSeatY;
	private boolean alreadyStowed;
	private static StopWatch stopwatch = new StopWatch();
	private int[][] currentAgentPosition = new int[1][2];

	/**
	 * This method generates an agent object.
	 * 
	 * @param name
	 *            is the name of the agent
	 * @param passenger
	 *            is the corresponding passenger object
	 * @param startX
	 *            is the start point x dimension
	 * @param startY
	 *            is the start point y dimension
	 * @param goalX
	 *            is the goal point x dimension
	 * @param goalY
	 *            is the goal point y dimension
	 * @param scale
	 *            is the scale of the simulation
	 */
	Agent(String name, Passenger passenger, Vector start, Vector goal, int scale) {
		this.passenger = passenger;
		this.agentName = name;
		startPoint = start;
		goalPoint = goal;
		this.scale = scale;
		this.currentAgentPosition[0] = start.getValue();
		

	}

	/**
	 * This method returns the agent name.
	 * 
	 * @return the agent name
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * This method sets the agent name.
	 * 
	 * @param agentName
	 *            is the name
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * This method returns the path of the agent.
	 * 
	 * @return returns the path
	 */
	public int[][] getPath() {
		return path;
	}

	/**
	 * This method returns the coordinate of the starting point.
	 * 
	 * @return the point
	 */
	public Vector getStart() {
		return startPoint;
	}

	/**
	 * This method sets the coordinate of the starting point.
	 * 
	 * @param point
	 *            the the point
	 */
	public void setStart(Vector point) {
		startPoint = point;
	}


	/**
	 * This method returns the coordinate of the goal point.
	 * 
	 * @return the x value
	 */
	public Vector getGoal() {
		return goalPoint;
	}

	/**
	 * This method sets the coordinate of the goal point.
	 * 
	 * @param point
	 *            the point
	 */
	public void setGoal(Vector point) {
		goalPoint = point;
	}


	/**
	 * This method sets the path for the agent.
	 * 
	 * @param path
	 *            the path
	 */
	public void setPath(int[][] path) {
		this.path = path;
	}
	
	/**
	 * This method returns the coordinates of the agents current location.
	 * 
	 * @return the current location
	 */
	public int[][] getCurrentAgentPosition() {
		return currentAgentPosition;
	}

	/**
	 * This method sets the coordinates of the agents current location.
	 * 
	 * @param currentAgentPosition
	 *            the current location
	 */
	public void setCurrentAgentPosition(int[][] currentAgentPosition) {
		this.currentAgentPosition = currentAgentPosition;
	}
	
	/**
	 * Rotation from 0 to 359 degrees. Only 45° steps. North is 0°.
	 * 
	 * @param point1
	 *            is the first point
	 * @param point2
	 *            is the second point
	 * @return returns the orientation in degree
	 */

	public int getRotation() {
		int xWay = currentPoint.getX() - previousPoint.getX();
		int yWay = currentPoint.getY() - previousPoint.getY();
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
	
	private boolean passengerStowsLuggage() {
		Seat seat = passenger.getSeatRef();
		return (passenger.isHasLuggage())
				&& (currentPoint.getY() == (int) (seat.getYPosition()
						/ scale - 5));
	}
	
	private void occupyArea(Vector point, boolean occupy) {
		
		if (point.getY() > firstSeatY) {
			int width = 0;
			for (int x = -width; x<=width; x++) {
				//	for (int y = -square; y<0; y++) {
				//		if(!(x==0&&y==0)) {
				if ((point.getX() + x) > 0) {// &&(yLoc+y)>0) {
					RunAStar.getMap()
							.getNodeByCoordinate(point.getX() + x, point.getY())
							.setOccupiedByAgent(
							occupy);
							}
				//		}
				//	}
			}
		} else {
			RunAStar.getMap().getNodeByPoint(point.getValue())
					.setOccupiedByAgent(occupy);
		}
	}
	
	/**
	 * 
	 * @param xLoc
	 * @param yLoc
	 * @return
	 */
	private boolean nodeBlocked(Vector position) {
		return RunAStar.getMap().getNode(position)
				.isOccupiedByAgent();
	}
	
	/**
	 * This method runs the agent simulation.
	 */
	public void run() {
		try {
			Thread.sleep((int)(passenger.getStartBoardingAfterDelay()*1000));
			stopwatch.start();
			Seat seat = ModelHelper.getChildrenByClass(RunAStar.getCabin(), Seat.class).get(0);
			firstSeatY = seat.getYPosition() / RunAStar.getCabin().getScale();
			this.currentAgentPosition = new int[path.length][2];
			RunAStar.submitPath(path);
			int numbOfInterupts = 0;
			alreadyStowed = false;
			int i = 0;
			while(i < path.length) {

				if(i != 0) {
					currentPoint.setVectorFromPoint(path[i - 1]);
				}
				currentPoint.setVectorFromPoint(path[i]);

				if (nodeBlocked(currentPoint)) {
					Thread.sleep(200);
					numbOfInterupts ++;
				}
				else if(passengerStowsLuggage()&&!alreadyStowed) {
					RunAStar.getMap().getNodeByPoint(previousPoint.getValue())
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNodeByPoint(currentPoint.getValue())
							.setOccupiedByAgent(true);
					occupyArea(currentPoint, true);
					Thread.sleep((int)(passenger.getLuggageStowTime()*1000/2));
					occupyArea(currentPoint, false);
					alreadyStowed = true;
					i++;				
				}
				else {
					RunAStar.getMap().getNodeByPoint(previousPoint.getValue())
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNodeByPoint(currentPoint.getValue())
							.setOccupiedByAgent(true);
					occupyArea(previousPoint, false);
					occupyArea(currentPoint, true);
					this.currentAgentPosition[i] = currentPoint.getValue();
					notifyObservers(i);
					passenger.setPositionX(this.currentAgentPosition[i][0]*scale);
					passenger.setPositionY(this.currentAgentPosition[i][1]*scale);
					passenger.setOrientationInDegree(getRotation());
					Thread.sleep((int)(1000/(passenger.getWalkingSpeed()*100/scale)));	
					i++;
				}
			}
			RunAStar.getMap().getNodeByPoint(currentPoint.getValue())
					.setOccupiedByAgent(false);
			passenger.setIsSeated(true);
			RunAStar.setPassengerSeated(passenger);	
			stopwatch.stop();
			passenger.setBoardingTime(stopwatch.getElapsedTime()/1000);
			passenger.setNumberOfWaits(numbOfInterupts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method starts the thread.
	 */
	public void start() {
		if (getT() == null) {
			setT(new Thread(this, agentName));
			getT().start();
		}
	}

	/**
	 * This method returns the current thread.
	 * 
	 * @return the thread
	 */
	public Thread getT() {
		return thread;
	}

	/**
	 * This method sets the current thread.
	 * 
	 * @param thread
	 *            the thread
	 */
	public void setT(Thread thread) {
		this.thread = thread;
	}

}