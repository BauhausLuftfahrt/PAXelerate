package model;

import java.util.ArrayList;

/**
 * 
 * @author marc.engelmann
 * 
 * This class creates a map and calculates the costs for a walk to a specific position. 
 *
 */

public class CostMap {
	
	private int[][] map;
	private int width;
	private int height;
	private int startX;
	private int startY;
	private int[] startPoint = new int[2];
	private ArrayList <int[]> visitedPoints =  new ArrayList<int[]>();
	private ArrayList <int[]> openPoints =  new ArrayList<int[]>();
	
	private ArrayList <int[]> pointParking = new ArrayList<int[]>();
	private ArrayList <int[]> pointParkingHelper = new ArrayList<int[]>();
		
	private AreaMap areamap;
	
	public CostMap(int width, int height,int startX, int startY, AreaMap areaMap) {		
		this.width=width;
		this.height=height;
		this.startX = startX;
		this.startY = startY;
		startPoint[0] = this.startX;
		startPoint[1] = this.startY;	
		areamap = areaMap;
		map = new int[this.width][this.height];
		
		for(int i=0;i<this.width;i++) {
			for(int j=0;j<this.height;j++) {
				Node node = areamap.getNode(i, j);
				if(!node.isObstacle) {
					map[i][j] = node.getCost();
					int[] helpPoint = new int[2];
					helpPoint[0] = i;
					helpPoint[1] = j;
					openPoints.add(helpPoint);
				}
				else {
					map[i][j] = -1;
				}			
			}
		}

		map[this.startX][this.startY] = 0;
		
		visitedPoints.add(startPoint);
		removePointFromOpenPointsList(startPoint);
		floodMap();
	}
	
	private void floodMap() {
		createSurroundingCosts(startPoint);
		while(openPoints.size()>1) {
			copyPoints();
			for(int[] newPoint:pointParking) {
				createSurroundingCosts(newPoint);
			}
		}
	}
	
	private boolean isObstacle(int[] point) {
		if(map[point[0]][point[1]] == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void removePointFromOpenPointsList(int[] point) {
		for(int count = 0; count<openPoints.size();count++) {
			int[] helppoint = openPoints.get(count);
			if(point[0] == helppoint[0]&&point[1] == helppoint[1]) {
					openPoints.remove(count);
			}
		}
	}
	
	private boolean checkForPoint(ArrayList <int[]> list, int[] point) {
		for(int[] checkPoint:list) {
			if(checkPoint[0] == point[0] && checkPoint[1] == point[1]) {
				return true;
			}
		}
		return false;
	}
	
	private void copyPoints() {
			pointParking.clear();
			for(int[] copyPoint:pointParkingHelper) {
				pointParking.add(copyPoint);
			}
			pointParkingHelper.clear();			
	}
	private void createSurroundingCosts (int[] middlePoint) {
		for(int[]point:getSurroundingPoints(middlePoint[0],middlePoint[1])) {
			if(!(point[0]<0||point[1]<0||point[0]>=width||point[1]>=height)) {
				if(!isObstacle(point)) {
					if(!(checkForPoint(visitedPoints,point))) {
						map[point[0]][point[1]] += getCost(middlePoint);
						visitedPoints.add(point);
						removePointFromOpenPointsList(point);
						pointParkingHelper.add(point);
					}
				}
			}
		}	
	}
	
	public void printMap() {
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
				if(map[i][j]==-1) {
					System.out.print("X");
				} else{
					System.out.print(map[i][j]);
				}
			}
			System.out.println();
		}
		
	}
	
	private void printList(ArrayList <int[]> list) {
		for(int[] printPoint:list) {
			System.out.println("x:"+printPoint[0]+", y:"+printPoint[1]);
		}
		System.out.println();
	}
	
	private int getCost(int[] point) {
		return map[point[0]][point[1]];
	}
	
	public int getCostForCoordinates(int xCord, int yCord) {
		return map[xCord][yCord];
	}
	
	private int[][] getSurroundingPoints(int pointX, int pointY) {
		//begin with north, then continue clockwise
		int [][] points = new int [8][2];
		points[0][0] = pointX;
		points[0][1] = pointY-1;
		points[1][0] = pointX+1;
		points[1][1] = pointY-1;
		points[2][0] = pointX+1;
		points[2][1] = pointY;
		points[3][0] = pointX+1;
		points[3][1] = pointY+1;
		points[4][0] = pointX;
		points[4][1] = pointY+1;
		points[5][0] = pointX-1;
		points[5][1] = pointY+1;
		points[6][0] = pointX-1;
		points[6][1] = pointY;
		points[7][0] = pointX-1;
		points[7][1] = pointY-1;
		return points;
	}

}
