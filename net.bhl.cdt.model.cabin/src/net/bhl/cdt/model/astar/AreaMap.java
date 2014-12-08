package net.bhl.cdt.model.astar;

import java.util.ArrayList;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AreaMap {

	private int mapWidth;
	private int mapHeight;
	private ArrayList<ArrayList<Node>> map;
	private int startLocationX;
	private int startLocationY;
	private int goalLocationX;
	private int goalLocationY;
	private int[][] obstacleMap;

	/**
	 * 
	 * @param mapWidth
	 * @param mapHeight
	 * @param obstacleMap
	 */
	AreaMap(int mapWidth, int mapHeight, int[][] obstacleMap) {
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		this.obstacleMap = obstacleMap;
		createMap();
		registerEdges();
	}

	/**
	 * This method prints the area map to the console.
	 */
	public void printMap() {
		for (int i = 0; i < mapWidth; i++) {
			for (int j = 0; j < mapHeight; j++) {
				if (map.get(i).get(j).isOccupiedByAgent()) {
					System.out.print("X");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	/**
	 * This method creates the area map.
	 */
	private void createMap() {
		Node node;
		map = new ArrayList<ArrayList<Node>>();
		for (int x = 0; x < mapWidth; x++) {
			map.add(new ArrayList<Node>());
			for (int y = 0; y < mapHeight; y++) {
				node = new Node(x, y);
				if (obstacleMap[x][y] == 100000) {
					node.setObstacle(true);
				} else {
					node.setCost(obstacleMap[x][y]);
				}
				map.get(x).add(node);
			}
		}
	}

	/**
	 * Registers the nodes edges (connections to its neighbors).
	 */
	private void registerEdges() {
		for (int x = 0; x < mapWidth - 1; x++) {
			for (int y = 0; y < mapHeight - 1; y++) {
				Node node = map.get(x).get(y);
				if (!(y == 0)) {
					node.setNorth(map.get(x).get(y - 1));
				} else if (!(y == 0) && !(x == mapWidth)) {
					node.setNorthEast(map.get(x + 1).get(y - 1));
				} else if (!(x == mapWidth)) {
					node.setEast(map.get(x + 1).get(y));
				} else if (!(x == mapWidth) && !(y == mapHeight)) {
					node.setSouthEast(map.get(x + 1).get(y + 1));
				} else if (!(y == mapHeight)) {
					node.setSouth(map.get(x).get(y + 1));
				} else if (!(x == 0) && !(y == mapHeight)) {
					node.setSouthWest(map.get(x - 1).get(y + 1));
				} else if (!(x == 0)) {
					node.setWest(map.get(x - 1).get(y));
				} else if (!(x == 0) && !(y == 0)) {
					node.setNorthWest(map.get(x - 1).get(y - 1));
				}
			}
		}
	}

	public ArrayList<ArrayList<Node>> getNodes() {
		return map;
	}

	public void setObstacle(int x, int y, boolean isObstacle) {
		map.get(x).get(y).setObstacle(isObstacle);
	}

	public Node getNode(int x, int y) {
		return map.get(x).get(y);
	}

	public void setStartLocation(int xStart, int yStart) {
		map.get((int) startLocationX).get(startLocationY).setStart(false);
		map.get((int) xStart).get(yStart).setStart(true);
		startLocationX = xStart;
		startLocationY = yStart;
	}

	public void setGoalLocation(int x, int y) {
		map.get(goalLocationX).get(goalLocationY).setGoal(false);
		map.get(x).get(y).setGoal(true);
		goalLocationX = x;
		goalLocationY = y;
	}

	public int getStartLocationX() {
		return startLocationX;
	}

	public int getStartLocationY() {
		return startLocationY;
	}

	public Node getStartNode() {
		return map.get(startLocationX).get(startLocationY);
	}

	public int getGoalLocationX() {
		return goalLocationX;
	}

	public int getGoalLocationY() {
		return goalLocationY;
	}

	public Node getGoalLocation() {
		return map.get(goalLocationX).get(goalLocationY);
	}

	/**
	 * This method calculates the distance between 2 nodes.
	 * 
	 * @param node1
	 *            is the first node
	 * @param node2
	 *            is the second node
	 * @return returns the distance between the 2 nodes
	 */
	public float getDistanceBetween(Node node1, Node node2) {
		return ((float) Math.sqrt((node2.getX() - node1.getX()) ^ 2
				+ (node2.getY() - node1.getY()) ^ 2));

	}

	public int getMapWidth() {
		return mapWidth;
	}

	public int getMapHeight() {
		return mapHeight;
	}

	public void clear() {
		startLocationX = 0;
		startLocationY = 0;
		goalLocationX = 0;
		goalLocationY = 0;
		createMap();
		registerEdges();
	}
}
