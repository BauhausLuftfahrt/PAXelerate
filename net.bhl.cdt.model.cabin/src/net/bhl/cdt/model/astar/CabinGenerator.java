package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.util.ModelHelper;

public class CabinGenerator {

	private Cabin cabin;
	private int width;
	private int length;
	private int maximumObstacleValue = 100000;
	private static int basicObstacleValue = 10; 
	
	public CabinGenerator(Cabin cabin) {
		this.cabin = cabin;
		width = (int)(cabin.getCabinWidth()/cabin.getScale());
		length = (int)(cabin.getCabinLength()/cabin.getScale());
	}
	
	public static int getBasicObstacleValue() {
		return basicObstacleValue;
	}
	

	public int[][] createObstacleMap() {
		int[][] obstacleMap = new int[width][length];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j <length; j++) {
				obstacleMap[i][j] = basicObstacleValue;
			}
		}
		
		/*****************Seats *******************************/
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {			
			int seatWidth = (int)(seat.getWidth()/cabin.getScale());
			int seatLength = (int)(seat.getLength()/cabin.getScale());
			int seatX = (int)(seat.getXPosition()/cabin.getScale());
			int seatY = (int)(seat.getYPosition()/cabin.getScale());	
			obstacleMap[seatX][seatY] = maximumObstacleValue;
			for (int i = 0; i < seatWidth; i++) {
				for (int j = 0; j < seatLength; j++) {
					int foo = seatX + i;
					int bar = seatY + j;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = maximumObstacleValue;	
					}
				}
			}
		}
		/******************************************************/
		
		/*****************Lavatories***************************/
		for (Lavatory lavatory : ModelHelper.getChildrenByClass(cabin, Lavatory.class)) {			
			int lavWidth = (int)(lavatory.getXDimension()/cabin.getScale());
			int lavLength = (int)(lavatory.getYDimension()/cabin.getScale());
			int lavX = (int)(lavatory.getXPosition()/cabin.getScale());
			int lavY = (int)(lavatory.getYPosition()/cabin.getScale());	
			obstacleMap[lavX][lavY] = maximumObstacleValue;
			for (int i = 0; i < lavWidth; i++) {
				for (int j = 0; j < lavLength; j++) {
					int foo = lavX + i;
					int bar = lavY + j;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = maximumObstacleValue;	
					}
				}
			}
		}
		/*****************************************************/
		
		/*****************Galleys***************************/
		for (Galley galley : ModelHelper.getChildrenByClass(cabin, Galley.class)) {			
			int galleyWidth = (int)(galley.getXDimension()/cabin.getScale());
			int galleyLength = (int)(galley.getYDimension()/cabin.getScale());
			int galleyX = (int)(galley.getXPosition()/cabin.getScale());
			int galleyY = (int)(galley.getYPosition()/cabin.getScale());	
			obstacleMap[galleyX][galleyY] = maximumObstacleValue;
			for (int i = 0; i < galleyWidth; i++) {
				for (int j = 0; j < galleyLength; j++) {
					int foo = galleyX + i;
					int bar = galleyY + j;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = maximumObstacleValue;	
					}
				}
			}
		}
		/*****************************************************/
		
		/*************************Curtains********************/
		for (Curtain curtain : ModelHelper.getChildrenByClass(cabin, Curtain.class)) {			
			int curtainWidth = (int)(curtain.getXDimension()/cabin.getScale());
			int curtainLength = (int)(curtain.getYDimension()/cabin.getScale());
			int curtainX = (int)(curtain.getXPosition()/cabin.getScale());
			int curtainY = (int)(curtain.getYPosition()/cabin.getScale());	
			obstacleMap[curtainX][curtainY] = maximumObstacleValue;
			for (int i = 0; i < curtainWidth; i++) {
				for (int j = 0; j < curtainLength; j++) {
					int foo = curtainX + i;
					int bar = curtainY + j;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = maximumObstacleValue;	
					}
				}
			}
		}
		/*****************************************************/
		
		/***********Create potential hole in aisle ***********/
		int entryMin = 0;
		int entryMax = 0;
		for(Door door:ModelHelper.getChildrenByClass(cabin, Door.class)) {
			if (door.getDoorType()==DoorType.MAIN_DOOR) {
				entryMin = (int)(door.getYPosition()/cabin.getScale())+2;
				entryMax = (int)((door.getYPosition()+door.getWidth())/cabin.getScale())-2;
			}
		}  
		int aisleMin = (int)((cabin.getCabinWidth()-cabin.getAisleWidth())/cabin.getScale()/2)+1;
	    int aisleMax = (int)(cabin.getCabinWidth()/cabin.getScale()-aisleMin)-2;
	    
		for (int i = 0; i < width; i++) {
			for (int j = 0; j <length; j++) {
				if(obstacleMap[i][j]!=maximumObstacleValue) {
					if(j>entryMin&&j<entryMax) {
						obstacleMap[i][j]= 0;	
					} 
					if(i<aisleMax&&i>aisleMin) {
						obstacleMap[i][j]= 0;	
					}
				}
			}
		}
		/*****************************************************/
		
		/********Create potential around obstacles************/
		int k = 1;
		int maxPot = basicObstacleValue*5;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j <length; j++) {
				if(obstacleMap[i][j]==maximumObstacleValue) {
					for(int p = 1; p<k;p++) {
						/** WEST - EAST - NORTH - SOUTH*/
						if((i-p)>0) {if(obstacleMap[i-p][j]!=100000) {obstacleMap[i-p][j] = maxPot - p;}}
						if((i+p)<width) {if(obstacleMap[i+p][j]!=100000) {obstacleMap[i+p][j] = maxPot - p;}}
						if((j-p)>0) {if(obstacleMap[i][j-p]!=100000) {obstacleMap[i][j-p] = maxPot - p;}}
						if((j+p)<length) {if(obstacleMap[i][j+p]!=100000) {obstacleMap[i][j+p] = maxPot - p;}}
						
						/** NORTHWEST - NORTHEAST - SOUTHEAST - SOUTHWEST*/
						if(((i-p)>0)&&((j-p)>0)) {if(obstacleMap[i-p][j-p]!=100000) {obstacleMap[i-p][j-p] = maxPot - p;}}
						if(((i+p)<width)&&((j-p)>0)) {if(obstacleMap[i+p][j-p]!=100000) {obstacleMap[i+p][j-p] = maxPot - p;}}
						if(((j+p)<length)&&((i+p)<width)) {if(obstacleMap[i+p][j+p]!=100000) {obstacleMap[i+p][j+p] = maxPot - p;}}
						if(((j+p)<length)&&((i-p)>0)) {if(obstacleMap[i-p][j+p]!=100000) {obstacleMap[i-p][j+p] = maxPot - p;}}
					}
				}
			}
		}
		/*****************************************************/
		
		return obstacleMap;
	}
}
