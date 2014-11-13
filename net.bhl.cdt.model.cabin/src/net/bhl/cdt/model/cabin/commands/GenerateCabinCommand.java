package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;
import java.util.Random;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;



/**
 * 
 * This script is used to build up the cabin according to predefined settings.
 * 
 * @author marc.engelmann
 * @version 0.1
 * @date 11-11-2014
 *
 */


public class GenerateCabinCommand extends CDTCommand{

	private Cabin cabin;
	private int seatCount;
	private int rowCount;
	private String seatIdLetter;
	ArrayList<Integer> randomNumberCheck;
	
	public GenerateCabinCommand(Cabin cabin) {
		this.cabin=cabin;
	}
	
	/** 
	 * This function creates the name of the seat according to its position. 
	 * @param letter is the number which is converted into a letter from A to F
	 */
	public void switchLetter(int letter) {
		switch (letter) {
			case 2:
				seatIdLetter = "B";
			break;
			case 3:
				seatIdLetter = "C";
			break;
			case 4:
				seatIdLetter = "D";
			break;
			case 5:
				seatIdLetter = "E";
			break;
			case 6:
				seatIdLetter = "F";
			break;
			default:
				seatIdLetter = "A";
			break;
		}
	}
	
	/**
	 * This function creates a ClassType object and populates it with rows and seats. 
	 * @param typeID describes which ClassType Option will be created
	 */
	public void createClass(ClassType typeID, int sequence) {
		String seatIdString ="";
		int seats = 0;
		int seatsInRow = 0;
		
		// these parameters should be read out of the initial settings depending on ClassType, implementation here for test purpose only 
		double seatLength = 20.0; 
		double seatPitch = 100.0;
		boolean moreLegroom = false;
		boolean offsetInTheRow = false;
		
		// how is this used? -> divide all dimensions by scale?
		//double scale = cabin.getScale();
		
		
		
		//load the settings depending on the ClassType
		switch (typeID) {
				case PREMIUM_ECO:
					seats = cabin.getSeatsInPremiumEconomyClass();
					seatsInRow = cabin.getSeatsPerRowInPremiumEconomyClass();
					break;
				case BUSINESS:
					seats = cabin.getSeatsInBusinessClass();
					seatsInRow = cabin.getSeatsPerRowInBusinessClass();	
				break;	
				case FIRST:
					seats = cabin.getSeatsInFirstClass();
					seatsInRow = cabin.getSeatsPerRowInFirstClass();	
				break;	
				default:
					seats = cabin.getSeatsInEconomyClass();
					seatsInRow = cabin.getSeatsPerRowInEconomyClass();	
				break;	
		}	
		
		if ((seats > 0) && (seatsInRow > 0)) {
			
			//Create new instance of PassengerClass
			PassengerClass newClass = CabinFactory.eINSTANCE.createPassengerClass();
			cabin.getClasses().add(newClass);
			newClass.setType(typeID);
			newClass.setSequence(sequence);
			
			for (int i = 1; i <= seats/seatsInRow; i++) {
				
				if (cabin.getRowNonexistent()==rowCount) {
					rowCount ++;	
				}
				
			   //Create new instance of Row
				Row newRow = CabinFactory.eINSTANCE.createRow();
				newClass.getRows().add(newRow);
				newRow.setRowNumber(rowCount);
				newRow.setSeatPitch(seatPitch);
				newRow.setAdditionalLegroom(moreLegroom);
				newRow.setOffsetInRow(offsetInTheRow);
			
				for (int j = 1; j <= seatsInRow; j++) {
					
					//Create new instance of Seat
					Seat newSeat = CabinFactory.eINSTANCE.createSeat();
					newRow.getSeats().add(newSeat);
					newSeat.setSeatNumber(seatCount);
					switchLetter(j);
					seatIdString = rowCount+seatIdLetter;
					newSeat.setSeatId(seatIdString);
					newSeat.setLength(seatLength);
					newSeat.setXPosition(10);
					newSeat.setYPosition(10);
					newSeat.setWidth((cabin.getCabinWidth()-cabin.getAisleWidth())/seatsInRow);
					seatCount ++;	
				}
			rowCount ++;
			}
			
		}
	}
	
	/**
	 * This function creates a door
	 * @param doorType
	 * @param symmetrical
	 * @param id
	 * @param width
	 * @param yPosition
	 */
	public void createDoor(DoorType doorType, boolean symmetrical, int id, double width, double yPosition) {
		Door newDoor = CabinFactory.eINSTANCE.createDoor();
		cabin.getDoors().add(newDoor);
		newDoor.setId(id);
		newDoor.setOnBothSides(symmetrical);
		newDoor.setDoorType(doorType);
		newDoor.setWidth(width);
		newDoor.setYPosition(yPosition);	}
	
	/**
	 * 
	 * @param openOrNot
	 * @param insertAferRow
	 */
	public void createCurtain(boolean openOrNot, int insertAferRow) {
		Curtain newCurtain = CabinFactory.eINSTANCE.createCurtain();
		cabin.getCurtains().add(newCurtain);
		newCurtain.setCurtainOpen(openOrNot);
		newCurtain.setPostitionAfterRow(insertAferRow);	
	}
	
	/**
	 * 
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	public void createLavatory(double xPosition, double yPostion, double xDimension, double yDimension) {
		Lavatory newLavatory = CabinFactory.eINSTANCE.createLavatory();
		cabin.getLavatories().add(newLavatory);
		newLavatory.setXPosition(xPosition);
		newLavatory.setYPosition(yPostion);
		newLavatory.setXDimension(xDimension);
		newLavatory.setYDimension(yDimension);
	}
	
	/**
	 * 
	 * @param direction
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	public void createStairway(StairwayDirection direction,double xPosition, double yPostion, double xDimension, double yDimension) {
		Stairway newStairway = CabinFactory.eINSTANCE.createStairway();
		cabin.getStairways().add(newStairway);
		newStairway.setXPosition(xPosition);
		newStairway.setYPosition(yPostion);
		newStairway.setDirection(direction);
		newStairway.setXDimension(xDimension);
		newStairway.setYDimension(yDimension);
	}
	
	/**
	 * 
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	public void createGalley(double xPosition, double yPostion, double xDimension, double yDimension) {
		Galley newGalley = CabinFactory.eINSTANCE.createGalley();
		cabin.getGalleys().add(newGalley);
		newGalley.setXPosition(xPosition);
		newGalley.setYPosition(yPostion);
		newGalley.setXDimension(xDimension);
		newGalley.setYDimension(yDimension);
	}
	
	/**
	 * This method generates the passengers one by one 
	 * 
	 * MAYBE IMPLEMENT SOMETHING TO GROUP ALL PASSENGERS IN A FOLDER OR SOMETHING
	 * 
	 */
	public void generatePassengers() {
		
		int totalPax = cabin.getEconomyClassPassengers()+cabin.getBusinessClassPassengers()+cabin.getPremiumEconomyClassPassengers()+cabin.getFirstClassPassengers();
		int totalSeats = cabin.getSeatsInEconomyClass() + cabin.getSeatsInPremiumEconomyClass() + cabin.getSeatsInBusinessClass() + cabin.getSeatsInFirstClass();
		Sex sex = Sex.FEMALE;
		
		for (int i = 1; i <= totalPax; i++) {
			
			Passenger newPassenger = CabinFactory.eINSTANCE.createPassenger();
			cabin.getPassengers().add(newPassenger);			
			Random rand = new Random();
			int checkForRandomUniqueness = 0;
			int randomSeat = 0;
			String helpToDefineTheSeatName = "";
			
			while (checkForRandomUniqueness == 0) {
				randomSeat = rand.nextInt(totalSeats) + 1;
				if(!randomNumberCheck.contains(randomSeat)) {
				randomNumberCheck.add(randomSeat);
				checkForRandomUniqueness = 1;
				}
			}
			newPassenger.setId(i); 
			newPassenger.setSeat(randomSeat);
			

			// je nach Sitzplatz die Klasse zuweisen!
			//Prüfen, in welcher Klasse der Sitzplatz ist!
			//geht wahrscheinlich viel kürzer!
			
			/**
			 * These loops iterate through every seat within every row within every class.
			 * These loops search for the matching seat number of the random seat generated above.
			 * if the seat was found, the loop knows in which class the seat is and adds the ClassType to the according passenger.
			 */
			for (int j = 0; j < cabin.getClasses().size(); j++) {
				PassengerClass passengerClass = cabin.getClasses().get(j);
				for (int k = 0; k < passengerClass.getRows().size(); k++) {
					Row row = passengerClass.getRows().get(k);
					for (int l = 0; l < row.getSeats().size(); l++) {
							Seat verifySeat = row.getSeats().get(l);
								if(verifySeat.getSeatNumber()==newPassenger.getSeat()) {
										newPassenger.setClass(passengerClass.getType());
										helpToDefineTheSeatName = verifySeat.getSeatId();				
								}
					}
				}
			}
			newPassenger.setName(i+" is at Seat "+helpToDefineTheSeatName);
			newPassenger.setAge(rand.nextInt(42) + 18);
			if ((cabin.getDoors().size()!=0)&&(cabin.getDoors().get(0).getDoorType()==DoorType.MAIN_DOOR)) {
				// The door created first is assigned to the passenger
				newPassenger.setDoor(cabin.getDoors().get(0));
			}
		
			if (rand.nextInt(2)==1) {
				sex = Sex.FEMALE;
			}
			else {
				sex = Sex.MALE;
			}
			newPassenger.setSex(sex);
			newPassenger.setHeight(rand.nextInt(50) + 150);
			newPassenger.setWeight(rand.nextInt(50) + 60);
			
		}
	}
	
	
	@Override
	protected void doRun() {
		
		seatCount = 1;
		rowCount = 1;
		
	    randomNumberCheck = new ArrayList<Integer>();
	    
		createDoor(DoorType.MAIN_DOOR, true, 1, 10.0, 0.0);
		createClass(ClassType.FIRST,1);
		createClass(ClassType.BUSINESS,2);
		createClass(ClassType.PREMIUM_ECO,3);
		createClass(ClassType.ECONOMY,4);
//		createDoor(DoorType.MAIN_DOOR, true, 1, 10.0, 0.0);
//		createDoor(DoorType.STANDARD_DOOR, true, 1, 10.0, 0.0);
//		createDoor(DoorType.EMERGENCY_EXIT, true, 1, 10.0, 0.0);
//		createDoor(DoorType.EMERGENCY_EXIT, true, 1, 10.0, 0.0);
//		createStairway(StairwayDirection.UP, 10, 10, 10, 10);
//		createGalley(1, 1, 1, 1);
//		createCurtain(true,5);
//		createLavatory(1, 1, 1, 1);
		
		generatePassengers();
		
	}

}
