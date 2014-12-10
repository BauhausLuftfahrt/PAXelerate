package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.observer.Subject;
import net.bhl.cdt.model.util.ModelHelper;

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

	private double firstSeatY;

	private boolean alreadyStowed = false;

	static StopWatch s = new StopWatch();

	private int previousX;
	private int previousY;

	private int currentX;
	private int currentY;

	static Logger log = new Logger();

	private int[][] currentAgentPosition = new int[1][2];

	Agent(String name, Passenger passenger, int startX, int startY, int goalX,
			int goalY, int scale) {
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
	 * 
	 * @param xWay
	 * @param yWay
	 * @return
	 */
	public int getRotation(int xWay, int yWay) {
		int deg = 0;
		if (xWay > 0) {
			if (yWay == 0) {
				deg = 90;
			}
			if (yWay < 0) {
				deg = 45;
			}
			if (yWay > 0) {
				deg = 135;
			}
		} else if (xWay < 0) {

			if (yWay > 0) {
				deg = 225;
			}
			if (yWay < 0) {
				deg = 315;
			}
		} else if (xWay == 0) {
			if (yWay == 0) {
				deg = 0;
			}
			if (yWay > 0) {
				deg = 180;
			}
			if (yWay < 0) {
				deg = 0;
			}
		}
		return deg;
	}

	private boolean passengerStowsLuggage() {
		Seat seat = passenger.getSeatRef();
		if ((passenger.isHasLuggage())
				&& (currentY == (int) (seat.getYPosition() / scale - 5))) {
			return true;
		} else {
			return false;
		}
	}

	private void occupyArea(int xLoc, int yLoc, boolean occupy) {

		if (yLoc > firstSeatY) {
			int width = 0;
			for (int x = -width; x <= width; x++) {
				// for (int y = -square; y<0; y++) {
				// if(!(x==0&&y==0)) {
				if ((xLoc + x) > 0) {// &&(yLoc+y)>0) {
					RunAStar.getMap().getNodeByCoordinate(xLoc + x, yLoc)
							.setOccupiedByAgent(occupy);
				}
				// }
				// }
			}
		} else {
			RunAStar.getMap().getNodeByCoordinate(xLoc, yLoc).setOccupiedByAgent(occupy);
		}
	}

	public void waitUntilPathIsClear() {

		// TODO: implement functionality to wait until e.g. passenger who is
		// blocking
		// path has cleared the path
	}

	public void findWayAroundObstacle() {

		// TODO: implement functionality to find a way around e.g. the passenger
		// who is blocking the path
	}


	private boolean nodeBlocked(int xLoc, int yLoc) {
		if (RunAStar.getMap().getNodeByCoordinate(xLoc, yLoc).isOccupiedByAgent()) {
			return true;
		} else {
			return false;
		}
	}

	public void run() {
		try {
			Thread.sleep((int) (passenger.getStartBoardingAfterDelay() * 1000));
			s.start();
			Seat seat = ModelHelper.getChildrenByClass(RunAStar.getCabin(),
					Seat.class).get(0);
			firstSeatY = seat.getYPosition() / RunAStar.getCabin().getScale();
			this.currentAgentPosition = new int[path.length][2];
			RunAStar.submitPath(path);
			int numbOfInterupts = 0;
			int i = 0;

			// each agent has an integer array of path coordinates of the
			// shortest path calculated by the aStar algorithm, and updates his
			// position
			// according to these coordinates
			while (i < path.length) {
				// TestAStar.map.printMap();
				// first step of the agent --> has no previous position
				if (i != 0) {
					// if agent already has taken his first step --> has a
					// previous position
					this.previousX = path[i - 1][0];
					this.previousY = path[i - 1][1];
				}
				// update the current position of the agent
				this.currentX = path[i][0];
				this.currentY = path[i][1];

				if (nodeBlocked(currentX, currentY)) {

					// this.waitUntilPathIsClear()
					// or
					// this.findWayAroundObstacle()

					Thread.sleep(200);
					numbOfInterupts++;
				} else if (passengerStowsLuggage() && !alreadyStowed) {
					RunAStar.getMap().getNodeByCoordinate(previousX, previousY)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNodeByCoordinate(currentX, currentY)
							.setOccupiedByAgent(true);
					occupyArea(currentX, currentY, true);
					Thread.sleep((int) (passenger.getLuggageStowTime() * 1000 / 2));
					occupyArea(currentX, currentY, false);
					alreadyStowed = true;
					i++;
				} else {

					// if the agent's path is not blocked, move forward
					RunAStar.getMap().getNodeByCoordinate(previousX, previousY)
							.setOccupiedByAgent(false);
					RunAStar.getMap().getNodeByCoordinate(currentX, currentY)
							.setOccupiedByAgent(true);
					occupyArea(previousX, previousY, false);
					occupyArea(currentX, currentY, true);

					// store the respective x and y coordinate of the agent into
					// the currentAgentPosition array
					this.currentAgentPosition[i][0] = this.currentX;
					this.currentAgentPosition[i][1] = this.currentY;

					// send notification to agent's observers that the agent has
					// changed his position
					notifyObservers(i);

					passenger.setPositionX(this.currentAgentPosition[i][0]
							* scale);
					passenger.setPositionY(this.currentAgentPosition[i][1]
							* scale);
					passenger.setOrientationInDegree(getRotation(
							(currentX - previousX), (currentY - previousY)));
					Thread.sleep((int) (1000 / (passenger.getWalkingSpeed() * 100 / scale)));
					i++;
				}
			}
			RunAStar.getMap().getNodeByCoordinate(currentX, currentY)
					.setOccupiedByAgent(false);
			passenger.setIsSeated(true);
			RunAStar.setPassengerSeated(passenger);
			s.stop();
			passenger.setBoardingTime(s.getElapsedTime() / 1000);
			passenger.setNumberOfWaits(numbOfInterupts);
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