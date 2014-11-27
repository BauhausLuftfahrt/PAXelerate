package model;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.util.ModelHelper;

public class CabinGenerator {

	private Cabin cabin;
	public int width;
	public int length;
	
	public int maximumObstacleValue = 100000;
	
	public CabinGenerator(Cabin cabin) {
		this.cabin = cabin;
		width = (int)(cabin.getCabinWidth()/cabin.getScale());
		length = (int)(cabin.getCabinLength()/cabin.getScale());
	}

	public int[][] createObstacleMap() {

		int[][] obstacleMap = new int[width][length];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j <length; j++) {
				obstacleMap[i][j] = 0;
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
		
		/********Create potential around obstacles************/
		int k = 3;
		int maxPot = 10;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j <length; j++) {
				if(obstacleMap[i][j]==maximumObstacleValue) {
					for(int p = 1; p<k;p++) {
						if((i-p)>0) {if(obstacleMap[i-p][j]!=100000) {obstacleMap[i-p][j] = maxPot - p;}}
						if((i+p)<width) {if(obstacleMap[i+p][j]!=100000) {obstacleMap[i+p][j] = maxPot - p;}}
						if((j-p)>0) {if(obstacleMap[i][j-p]!=100000) {obstacleMap[i][j-p] = maxPot - p;}}
						if((j+p)<length) {if(obstacleMap[i][j+p]!=100000) {obstacleMap[i][j+p] = maxPot - p;}}
					}
				}
			}
		}
		/*****************************************************/
		
		return obstacleMap;
	}
}
