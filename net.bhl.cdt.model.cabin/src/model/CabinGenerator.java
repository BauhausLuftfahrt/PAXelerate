package model;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.util.ModelHelper;

public class CabinGenerator {

	private Cabin cabin;
	private int width;
	private int length;
	
	public CabinGenerator(Cabin cabin) {
		this.cabin = cabin;
		width = (int)(cabin.getCabinWidth()/cabin.getScale());
		length = (int)(cabin.getCabinLength()/cabin.getScale());
	}

	public void printCabin(int[][] ObstacleMap) {
		for (int i = 0; i <  width; i++) {
			for (int j = 0; j < length; j++) {
				if (ObstacleMap[i][j] == 100000) {
				} else {
				}
			}
		}
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
			obstacleMap[seatX][seatY] = 100000;
			for (int i = 0; i < seatWidth; i++) {
				for (int j = 0; j < seatLength; j++) {
					int foo = seatX + j;
					int bar = seatY + i;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = 100000;	
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
			obstacleMap[lavX][lavY] = 100000;
			for (int i = 0; i < lavWidth; i++) {
				for (int j = 0; j < lavLength; j++) {
					int foo = lavX + j;
					int bar = lavY + i;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = 100000;	
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
			obstacleMap[galleyX][galleyY] = 100000;
			for (int i = 0; i < galleyWidth; i++) {
				for (int j = 0; j < galleyLength; j++) {
					int foo = galleyX + j;
					int bar = galleyY + i;
					if(foo < width && bar <length) {
						obstacleMap[foo][bar] = 100000;	
					}
				}
			}
		}
		/*****************************************************/
		
		return obstacleMap;
	}
}
