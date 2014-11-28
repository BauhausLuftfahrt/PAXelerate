package model;

import java.util.ArrayList;


/**
 * 
 * @author marc.engelmann
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
		startPoint[0] = startX;
		startPoint[1] = startY;
		areamap = areaMap;
		map = new int[width][height];
		for(int i=0;i<this.width;i++) {
			for(int j=0;j<this.height;j++) {
				Node node = areamap.getNode(i, j);
				if(!node.isObstacle) {
					map[i][j] = (int)node.getCost();
				}
				else {
					map[i][j] = -1;
				}
				int[] helpPoint = new int[2];
				helpPoint[0] = i;
				helpPoint[1] = j;
				openPoints.add(helpPoint);
			}
		}
		map[startX][startY] = 0;
		
		visitedPoints.add(startPoint);
		openPoints.remove(startPoint);
		floodMap();
	}
	
	public void floodMap() {
		createSurroundingCosts(startPoint);
		int ppp = 0;
		// while !openList.isEmpty()
		while(ppp <20) {
			copyPoints();
			for(int[] newPoint:pointParking) {
				createSurroundingCosts(newPoint);
			}
			ppp ++;
		}
		//printList(openPoints);
		//WARUM GEHT DAS NICHT !?!?!?!?!?!?!?!!?!
	}
	
	public boolean isObstacle(int[] point) {
		if(map[point[0]][point[1]] == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void copyPoints() {
			pointParking.clear();
			for(int[] copyPoint:pointParkingHelper) {
				pointParking.add(copyPoint);
			}
			pointParkingHelper.clear();			
	}
	public void createSurroundingCosts (int[] middlePoint) {
		for(int[]point:getSurroundingPoints(middlePoint[0],middlePoint[1])) {
			if(!(point[0]<0||point[1]<0||point[0]>=width||point[1]>=height)) {
				if(!isObstacle(point)) {
					//STIMMT NICHT HIER !!!  SOLLTE ÜBERPRÜFT WERDEN, WIRD ES ABER NICHT!!
					if((!visitedPoints.contains(point))&&(map[point[0]][point[1]]==getCost(point))) {
						map[point[0]][point[1]] += (getCost(middlePoint)+1);
						visitedPoints.add(point);
						openPoints.remove(point);
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
	
	public void printList(ArrayList <int[]> list) {
		for(int[] printPoint:list) {
			System.out.println("x:"+printPoint[0]+", y:"+printPoint[1]);
		}
		System.out.println();
	}
	
	public int getCost(int[] point) {
		Node costNode = areamap.getNode(point[0], point[1]);
		return (int)costNode.getCost();
	}
	
	public int[][] getSurroundingPoints(int pointX, int pointY) {
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
