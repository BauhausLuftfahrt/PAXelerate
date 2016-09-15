/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.DoorOption;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.model.astar.node.Node;
import net.bhl.cdt.paxelerate.model.util.POHelper;
import net.bhl.cdt.paxelerate.util.math.MathHelper;
import net.bhl.cdt.paxelerate.util.math.Vector3D;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class represents an obstacle map. Every point in the two dimensional
 * array has a specific value which represents the strength of the obstacle.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 0.8
 * @since 0.5
 *
 */

public class ObstacleGenerator {

	/** The scale. */
	private double scale;

	/** The developer mode. */
	private boolean developerMode;

	/** The areamap. */
	private Areamap areamap;

	/** The cabin. */
	private Cabin cabin;

	/** a list of all obstacle nodes. */
	private ArrayList<Node> obstacles = new ArrayList<>();
	
	/** a list of all node aircraft cabin exterior*/
	private ArrayList<Node> aircraftBody = new ArrayList<>();
	
	/** The gradient. */
	private GradientOption gradient;

	/**
	 * The different options for the gradient.
	 */
	public enum GradientOption {

		/** The linear. */
		LINEAR,
		/** The cubic. */
		CUBIC,
		/** The exponential. */
		EXPONENTIAL;
	}
	private int xPosition,yPosition,xDimension,yDimension;
	

	/**
	 * This method generates a new obstacle generator.
	 *
	 * @param areamap
	 *            the area map on which the obstacles should be applied to
	 * @param cabin
	 *            the cabin from which to get the values
	 * @param gradientOption
	 *            the gradient option
	 */
	public ObstacleGenerator(Areamap areamap, Cabin cabin,
			GradientOption gradientOption) {

		/* store the needed values locally */
		this.areamap = areamap;
		this.gradient = gradientOption;
		this.scale = cabin.getSimulationSettings().getScale();
		this.developerMode = cabin.getSimulationSettings().isDeveloperMode();
		this.cabin = cabin;

		/* loop through all nodes and apply the default value */
		for (Node node : areamap.getNodes()) {
			node.setObstacleValue(AreamapHandler.DEFAULT_VALUE);
		}

		/* apply obstacle values to all obstacle positions */
		for (ObjectOption option : ObjectOption.VALUES) {
			generateObstacles(option);
		}

		checkForGaps();
		
		/* change the oder of this method */
		generateDoorDepressions();

		/* generate the potential gradient around all obstacles */
		generatePotentialGradient();

		/* generate a depression in the potential for the paths */
		generateDoorDepressions();

		/* generate a depression in the potential for the aisles */
		generateAisleDepressions();
		
		
		/*function for twin-aisle*/
		generateHoleForGalley();
		generateTwinAisleDepressions();
		
		/*function for Pop-Up seats*/
		//generateGradientForBody();
		//generateTranceparentAisle();

	}

	/**
	 * This method creates the potential gradient around obstacle.
	 */
	private void generatePotentialGradient() {

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/*
			 * only consider the ones which are no obstacle and have not been
			 * calculated before
			 */
			if (!node.isObstacle() && node
					.getObstacleValue() == AreamapHandler.DEFAULT_VALUE) {

				/* calculate the distance to the closest obstacle node */
				double distanceToClosestObstacle = AreamapHandler
						.minimumDistanceToObstacle(node, obstacles);
				
				/*
				 * check if the distance is smaller than the maximum allowed
				 * gradient width
				 */
				if (distanceToClosestObstacle <= AreamapHandler.GRADIENT_WIDTH) {

					/* calculate the gradient value and apply it to the node */
					node.setObstacleValue(getDistanceByOption(
							distanceToClosestObstacle, gradient));
					node.setDistanceToClosestObstacle(
							distanceToClosestObstacle);	
				}
			}
		}
	}

	/*The method is for twin-aisle and creates the gradient around the Galley 
	 * It supposed as the Galley is in front of the boarding-door.
	 * It effects that the passensgers walk around the Galley smoothly.
	 * If the Galley is located in other position or the Lavatory is located in front of boarding-door
	 * ,then this method must be extended with the Lavatory and the Position of the Galley and the Lavatory */
	private void generateHoleForGalley() {
		
				/*check whether the obstacle is Galley*/
				for ( Galley obj : cabin.getGalleys() ){
		
					int xPosition = obj.getXPosition() / (int) scale;
					int yPosition = obj.getYPosition() / (int) scale;
					int xDimension = obj.getXDimension() / (int) scale;
					int yDimension = obj.getYDimension() / (int) scale;

					/* loop through all nodes */
					for (Node node : areamap.getNodes()){
						/*
						 * only consider the ones which are no obstacle and have not been
						 * calculated before
						 */
						if (!node.isObstacle()){
							
							/*the distance value on the x-axis between the above side of the Galley and
							 *  the node of areamap*/
							int distanceX = xPosition - node.getPosition().getX();
							/*the distance value on the x-axis between the below side of the Galley and
							 *  the node of areamap*/
							int distanceXX = (xPosition + xDimension) - node.getPosition().getX();
							
							if( distanceX >=2 && distanceX <=3 ){
								/*the width of HOLE_VALUE on the y-axis the above of the Galley*/
								if(node.getPosition().getY() >= yPosition -1 && node.getPosition().getY() <= yPosition + yDimension +1 ){
									node.setObstacleValue(AreamapHandler.HOLE_VALUE);
								}
							}
							/*the width of HOLE_VALUE on the y-axis the below of the Galley*/
							if( Math.abs(distanceXX) >= 1 && Math.abs(distanceXX) <= 2 ){
								if(node.getPosition().getY() >= yPosition -1 && node.getPosition().getY() <= yPosition + yDimension +1 ){
									node.setObstacleValue(AreamapHandler.HOLE_VALUE);
								}
							}
						
						}
						if (!node.isObstacle() && node.getObstacleValue() != AreamapHandler.DEFAULT_VALUE) {
							
							for (Node obstacle : obstacles) {

								double distance = MathHelper.distanceBetween(node.getPosition(),
										obstacle.getPosition());
								
								/*if the obstacle is Galley,the value of node,which is 
								 * near the Galley with distance 1,is set as 12.It has effected that 
								 * passenger walk around the Galley with distance 1*/ 
								if(obstacle.getObstacleType().getValue() == 1)
								{ 
									if( distance >= 1 && distance < 2 ){
										node.setObstacleValue(12);
									}
								}			

							}
						}		
						
					}

				}
			}
	
	/*the methode for pop up seat*/
	private void generateGradientForBody() {

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			
			if ( (node.getPosition().getY() == 0) || (node.getPosition().getY() == cabin.getYDimension()) ){
				
				aircraftBody.add(node);
			
				for (Node aircraftWall : aircraftBody) {

					double distance = MathHelper.distanceBetween(node.getPosition(),
							aircraftWall.getPosition());
					
						if( distance >= 0 && distance < 3 ){
							node.setObstacleValue(5); //TODO:the value should be constant
						}
					}			

				}
			}
	}
	/*the method for pop up seat*/
	private void generateTranceparentAisle() {

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			if (!node.isObstacle() && node
					.getObstacleValue() == AreamapHandler.DEFAULT_VALUE) {
				
				for (Node obstacle : obstacles) {
					
					if(obstacle.getObstacleType().getValue() == 1){
						
						double distance = Math.abs(node.getPosition().getY() - obstacle.getPosition().getY());
						if( distance == 1){
							node.setObstacleValue(5); //TODO:the value should be constant
						}
						
					}
				}			

			}
		}
	}

	
	/**
	 * This function calculates the gradient value at a specific position within
	 * an integer array.
	 *
	 * @param distance
	 *            is the position within the gradient
	 * @param option
	 *            defines the option used for the gradient
	 * @return returns the value
	 */
	private int getDistanceByOption(double distance, GradientOption option) {

		/* calculate the value depending on the chosen function */
		switch (option) {

		case LINEAR:

			/* use linear interpolation here */
			return (int) MathHelper.linearInterpolation(
					AreamapHandler.GRADIENT_UPPER_BOUND,
					AreamapHandler.GRADIENT_LOWER_BOUND,
					(AreamapHandler.GRADIENT_WIDTH - 1), (distance - 1));

		default:

			/* return the default value */
			return AreamapHandler.DEFAULT_VALUE;
		}
	}

	/**
	 * This method generates the obstacle hole in the door path. This means that
	 * in the door area, the obstacle value is set to HOLE_VALUE. This makes the
	 * passengers use the door path as their preferred path.
	 */
	private void generateDoorDepressions() {

		/* Create the door paths for every door */
		for (Door door : cabin.getDoors()) {

			boolean obstacle = false;
			/* do not make a hole for emergency exits */
			if (door.getDoorOption() != DoorOption.EMERGENCY_EXIT) {

				/* get the borders of the door within the area map */
				int entryMin = (int) (door.getXPosition() / scale)
						+ AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;
				
				int entryMax = (door.getXPosition() + door.getWidth())
						/ (int) scale
						- AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS;
				
				for (ObjectOption option : ObjectOption.VALUES) {
				
					for (PhysicalObject obj : POHelper.getObjectsByOption(option, cabin)) {
	
						/* define the dimension and position of the object */
						if(entryMin > (obj.getXPosition() / (int) scale) && 
								(obj.getXPosition() / (int) scale) + (obj.getXDimension() / (int) scale) > entryMax){
							 xDimension = obj.getXDimension() / (int) scale; 
							 yDimension = obj.getYDimension() / (int) scale;
							 xPosition = obj.getXPosition() / (int) scale;
							 yPosition = obj.getYPosition() / (int) scale;
							 obstacle = true;
							}
						 
						}
				}

				/* loop through all nodes */
				for (Node node : areamap.getNodes()) {

					/* get the x position of the node */
					int x = node.getPosition().getX();
					int y = node.getPosition().getY();
					
					if (x >= door.getXPosition() / scale && x <= (door.getXPosition() / scale ) + (door.getWidth() / scale)){
						
						if(obstacle){
							/*the creating hole value stops at the obstacle*/
							if(!node.isObstacle() && y < yPosition){
									if (x >= entryMin-1 && x <= entryMax){
									/* create a potential hole within the area map */
										node.setObstacleValue(AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS);
									}
									else{}
							}
							else if(!node.isObstacle() && y > (yPosition +  yDimension)){
								node.setObstacleValue(AreamapHandler.NARROWING_OF_DOOR_PATH_AFTER_OBSTACLE);
							}
							else{					
							}
						}
						else{
							node.setObstacleValue(AreamapHandler.NARROWING_OF_DOOR_PATH_IN_PIXELS);
						}
					
					}
				}
			}
		}
	}
	/**
	 * increase the value,where the areamap of twin-aisle,
	 * in middle of the aisle between the row of seat
	 * in order to avoid that passenger go through the aisle of four or three seats
	 */
	private void generateTwinAisleDepressions() {
		
		/*this is the middle value of cabin width and used to the position 
		 * of tranceparent wall for center of seats*/
		int centerOfRow = cabin.getYDimension() / (int) scale / 2;
		
		/* loop through every class */
		for (TravelClass travelclass : cabin.getClasses()) {
			
			/*pitch value of seats*/
			int seatPitch =  travelclass.getSeatPitch() / (int) scale ;
			
			/*it makes the tranceparent wall,which change the value of areamap,
			 *  on the aisle and let the passenger use the twin-aisle 
			 *  rather than going to through the space between seats*/
			int	lastPosition = 0;
					
			/* loop through every row */
				for (Row row : travelclass.getRows()) {
					/* it starts from first-row
					 *  */
					int startPosition = ( row.getSeats().get(0).getXPosition() / (int) scale ) 
							+ ( row.getSeats().get(0).getXDimension() / (int) scale);
					/* it compares with two row,
					 * if difference is smaller and same than pitch value,then makes the tranceparent wall*/
					if( (startPosition - lastPosition - ( row.getSeats().get(0).getXDimension() / (int) scale) ) <= seatPitch)
					{	
						/*the range of increased the value is 
						 * according to the length of pitch. 
						 * The pitch value should be increased by every 10,because
						 * the number of pitch point on the areamap & costmap is 
						 * represented differently per rows of seats(the value is rounded by int-value) */ 
						for(int i=0; i< seatPitch ;i++){
							
							if (areamap.get(lastPosition, centerOfRow) != null) {
								
								/*the value of constant TRANSPARENT_WALL_VALUE should be 
								 * as high as the value of costmap,where
								the goal is located around.*/
								if (!areamap.get(lastPosition, centerOfRow).isObstacle()) {
									areamap.get(lastPosition, centerOfRow).setObstacleValue(
											AreamapHandler.TRANSPARENT_WALL_VALUE);
								lastPosition++;
								}
						
							}
						}
					
					lastPosition = startPosition + (row.getSeats().get(0).getXDimension() /(int) scale);
					}
				lastPosition = startPosition;
				
			}
		}
	}
	
			
	/**
	 * Generate a hole in the potential of the area map where the aisle is
	 * located.
	 */
	private void generateAisleDepressions() {

		/* the minimum aisle width for automatic detection */
		int minimumAisleWidth = 3;//previous value 4

		/* loop through every class */
		for (TravelClass travelclass : cabin.getClasses()) {

			/* get the first row of each class */
			Row firstRowOfClass = travelclass.getRows().get(0);

			/* store a list of all aisles per class */
			ArrayList<Vector3D> aisles = new ArrayList<>();

			/* store the previous y position */
			int lastYPosition = 0;

			/*
			 * loop through all seats of the first row in order to find the gaps
			 */
			for (Seat seat : firstRowOfClass.getSeats()) {

				/* calculate the gap between current and previous seat */
				int gap = seat.getYPosition() / (int) scale - lastYPosition;

				/* if the gap is bigger than the predefined minimum, continue */
				if (gap >= minimumAisleWidth) {

					/* save the found aisle to the aisles list */
					aisles.add(new Vector3D(seat.getXPosition() / (int) scale,
							seat.getYPosition() / (int) scale - gap, gap));

					/* x & y = position of top left corner & z = width */
				}

				/* store the new last y position of the previous seat */
				lastYPosition = (seat.getYPosition() + seat.getYDimension())
						/ (int) scale;
			}

			/* load a seat from the last row of the current class */
			Seat lastSeat = travelclass.getRows()
					.get(travelclass.getRows().size() - 1).getSeats().get(0);

			/* get the position of the end of the last seat in the class */
			int endOfLastRowSeat = (lastSeat.getXPosition()
					+ lastSeat.getXDimension()) / (int) scale;

			/* loop through all aisle found above */
			for (Vector3D aisle : aisles) {

				/* loop through the whole area of the aisle */
				for (int x = aisle.getX()
						- AreamapHandler.AISLE_OVERLAP_FRONT_AND_REAR; x <= endOfLastRowSeat
								+ AreamapHandler.AISLE_OVERLAP_FRONT_AND_REAR; x++) {
					for (int y = aisle.getY()
							+ AreamapHandler.NARROWING_OF_AISLE_PATH_IN_PIXELS; y < aisle
									.getY()
									- AreamapHandler.NARROWING_OF_AISLE_PATH_IN_PIXELS
									+ aisle.getZ(); y++) {

						/* check if there might be an obstacle somewhere */
						if (areamap.get(x, y) != null) {
							if (!areamap.get(x, y).isObstacle()) {

								/* apply the hole value */
								areamap.get(x, y).setObstacleValue(
										AreamapHandler.HOLE_VALUE);
							}
						} else {
							Log.add(this,
									"Check cabin dimensions! Margin for fwd and aft exit is required.");
						}

					}
				}
				/* for debugging, output the found aisles */
				if (developerMode) {
					System.out.println(travelclass.getName()
							+ ": aisle detected at " + aisle.getX() + "|"
							+ aisle.getY() + " , width: " + aisle.getZ());
				}

			}
		}
	}

	/**
	 * This function iterates through all instances of a specific class and
	 * generates the obstacles.
	 * 
	 * @param option
	 *            is the Class of the object that should be used
	 */
	private void generateObstacles(ObjectOption option) {

		/* first loop through every physical object within the cabin */
		for (PhysicalObject obj : POHelper.getObjectsByOption(option, cabin)) {

		/* define the dimension and position of the object */
			int xDimension = obj.getXDimension() / (int) scale;
			int xPosition = obj.getXPosition() / (int) scale;

			int yDimension = obj.getYDimension() / (int) scale;
			int yPosition = obj.getYPosition() / (int) scale;

			/* check if the object is a seat */
			if (obj instanceof Seat) {

				/* cast the object */
				Seat seat = (Seat) obj;

				/*
				 * check for sideways foldable seats and if it is currently
				 * folded
				 */
				if (cabin.getSimulationSettings()
						.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT
						&& seat.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT) {

					/* if so, do not create an obstacle for that seat */
					continue;

					/*
					 * check for folding seat pans and if it is currently folded
					 */
				} else if (cabin.getSimulationSettings()
						.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS
						&& seat.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS) {

					/* only the backrest is visible (percentage value) */
					int backrestThickness = 20;
					xDimension = xDimension * backrestThickness / 100;
					xPosition = xPosition + yDimension - xDimension;

				}
			}

			/* loop from 0 to the dimension of the object */
			for (int relativePositionX = 0; relativePositionX < xDimension; relativePositionX++) {
				for (int relativePositionY = 0; relativePositionY < yDimension; relativePositionY++) {

					/* begin at the top left corner */
					int absolutePositionX = xPosition + relativePositionX;
					int absolutePositionY = yPosition + relativePositionY;

					/* get the node at the current position */
					Node node = areamap.get(absolutePositionX,
							absolutePositionY);

					/* check if the node is already an obstacle! */
					// TODO: catch NullPointerException
					if (node.isObstacle()) {

						Log.add(this,

								"WARNING! Overlap between 2 objects at x: "
										+ node.getPosition().getX() + ", y: "
										+ node.getPosition().getY());

					} else {

						/* define the attributes to the current position */
						node.setObstacleValue(Integer.MAX_VALUE);
						node.setProperty(Property.OBSTACLE, null);
						node.setObstacleType(option);

						/* add the obstacle to the list of obstacles */
						obstacles.add(node);
					}
				}
			}
		}
	}

	/**
	 * Check for gaps.
	 */
	private void checkForGaps() {

		/* loop through all nodes */
		for (Node node : areamap.getNodes()) {

			/* check if node is an obstacle */
			if (node.isObstacle()) {

				/*
				 * check if the node has one more node between itself and the
				 * border in the y dimension
				 */
				if (node.getPosition().getY() == 1 || node.getPosition()
						.getY() == areamap.getDimensions().getY() - 2) {

					/* check if the other node is not yet an obstacle */
					if (!areamap.get(node.getPosition().getX(), 0)
							.isObstacle()) {

						Node newNode = areamap.get(node.getPosition().getX(),
								0);

						/* define the attributes to the current position */
						newNode.setObstacleValue(Integer.MAX_VALUE);
						newNode.setProperty(Property.OBSTACLE, null);
						newNode.setObstacleType(node.getObstacleType());
					}
					if (!areamap
							.get(node.getPosition().getX(),
									areamap.getDimensions().getY() - 1)
							.isObstacle()) {

						Node newNode = areamap.get(node.getPosition().getX(),
								areamap.getDimensions().getY() - 1);

						/* define the attributes to the current position */
						newNode.setObstacleValue(Integer.MAX_VALUE);
						newNode.setProperty(Property.OBSTACLE, null);
						newNode.setObstacleType(node.getObstacleType());
					}
				}
			}
		}
	}

	/**
	 * Return map.
	 *
	 * @return the areamap
	 */
	public Areamap returnMap() {
		return areamap;
	}
}