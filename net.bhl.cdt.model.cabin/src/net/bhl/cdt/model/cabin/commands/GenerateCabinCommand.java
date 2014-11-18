package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;
import net.bhl.cdt.model.util.ModelHelper;




/**
 * 
 * This script is used to build up the cabin according to predefined settings.
 * 
 * @author marc.engelmann
 * @version 1.3
 * @date 18.11.2014
 *
 */


public class GenerateCabinCommand extends CDTCommand{

	private Cabin cabin;
	CabinViewPart cabinViewPart;
	ConsoleViewPart consoleViewPart;
	private int seatCount;
	private int rowCount;
	private String seatIdLetter;
	double globalSeatPositionX;
	double globalSeatPositionY; 
	ArrayList<Integer> randomNumberCheck;
	double spaceBetweenSeats;
	
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
		boolean moreLegroom = false;
		boolean offsetInTheRow = false;
		double seatDimensionX = 0;
		double seatDimensionY = 0;
		
		
		// how is this used? -> divide all dimensions by scale?
		//double scale = cabin.getScale();
		
		
		
		//load the settings depending on the ClassType
		switch (typeID) {
				case PREMIUM_ECO:
					seats = cabin.getSeatsInPremiumEconomyClass();
					seatsInRow = cabin.getSeatsPerRowInPremiumEconomyClass();
					
					seatDimensionY = 130;
					break;
				case BUSINESS:
					seats = cabin.getSeatsInBusinessClass();
					seatsInRow = cabin.getSeatsPerRowInBusinessClass();	

					seatDimensionY = 180;
				break;	
				case FIRST:
					seats = cabin.getSeatsInFirstClass();
					seatsInRow = cabin.getSeatsPerRowInFirstClass();

					seatDimensionY = 250;
				break;	
				default:
					seats = cabin.getSeatsInEconomyClass();
					seatsInRow = cabin.getSeatsPerRowInEconomyClass();	

					seatDimensionY = 130; 
				break;	
		}
		
		seatDimensionX = (cabin.getCabinWidth()-cabin.getAisleWidth()-((seatsInRow-2)*spaceBetweenSeats))/seatsInRow;
		
		if ((seats > 0) && (seatsInRow > 0)) {
			
			//Create new instance of PassengerClass
			PassengerClass newClass = CabinFactory.eINSTANCE.createPassengerClass();
			cabin.getClasses().add(newClass);
			newClass.setType(typeID);
			newClass.setSequence(sequence);
			newClass.setSeatDimensionX(seatDimensionX);
			newClass.setSeatDimensionY(seatDimensionY);
			
			for (int i = 1; i <= seats/seatsInRow; i++) {
				globalSeatPositionX = 0;
				globalSeatPositionY += newClass.getSeatPitch();
				
 				if (cabin.getRowNonexistent()==rowCount) {
					rowCount ++;	
				}
				
			   //Create new instance of Row
				Row newRow = CabinFactory.eINSTANCE.createRow();
				newClass.getRows().add(newRow);
				newRow.setRowNumber(rowCount);
				newRow.setAdditionalLegroom(moreLegroom);
				newRow.setOffsetInRow(offsetInTheRow);
				
				// This loop checks if there is an emergency exit on the planned location of a seat. If so, the  seat row is pushed back two times the seat pitch in that specific class.
				for(Door door:ModelHelper.getChildrenByClass(cabin, Door.class)) {
					if((((door.getYPosition()+door.getWidth())>(globalSeatPositionY-newClass.getSeatPitch()))&&(door.getYPosition()<globalSeatPositionY))||((door.getYPosition()>globalSeatPositionY)&&(door.getYPosition()<globalSeatPositionY+newClass.getSeatDimensionY())||((door.getYPosition()+door.getWidth()>globalSeatPositionY)&&(door.getYPosition()<globalSeatPositionY)))) {
						globalSeatPositionY += 2*newClass.getSeatPitch();
					}
				}
				
				for (int j = 1; j <= seatsInRow; j++) {
					
					//Create new instance of Seat
					Seat newSeat = CabinFactory.eINSTANCE.createSeat();
					newRow.getSeats().add(newSeat);
					newSeat.setSeatNumber(seatCount);
					switchLetter(j);
					seatIdString = rowCount+seatIdLetter;
					newSeat.setSeatId(seatIdString);
					newSeat.setLength(newClass.getSeatDimensionY());
					newSeat.setWidth(newClass.getSeatDimensionX());
					newSeat.setLetter(seatIdLetter);
					//Sitzposition berechnen!
					newSeat.setXPosition(globalSeatPositionX);
					newSeat.setYPosition(globalSeatPositionY);
					
					double helpSpaceBetweenSeats = 0;
					if((j!=(seatsInRow/2))&&(j!=seatsInRow)) {
						helpSpaceBetweenSeats = spaceBetweenSeats;
					}
					double aisleSpace = 0;
					seatCount ++;	
					if (j==(seatsInRow/2)) {
					aisleSpace = cabin.getAisleWidth();
					}
					globalSeatPositionX  =  globalSeatPositionX + newClass.getSeatDimensionX()+aisleSpace+helpSpaceBetweenSeats;
				}
			rowCount ++;
			globalSeatPositionY = globalSeatPositionY + newClass.getSeatDimensionY();
			}
			
		}
	}
	
	/**
	 * This function creates a door
	 * @param doorType
	 * @param symmetrical
	 * @param id
	 * @param width
	 * @param yPosition set it to -1 to ignore value, only important for emergency exit.
	 */
	public void createDoor(DoorType doorType, boolean symmetrical, int id, double width, double yPosition) {
		Door newDoor = CabinFactory.eINSTANCE.createDoor();
		cabin.getDoors().add(newDoor);
		newDoor.setId(id);
		newDoor.setOnBothSides(symmetrical);
		newDoor.setDoorType(doorType);
		newDoor.setWidth(width);
		if(doorType != DoorType.EMERGENCY_EXIT) {
			newDoor.setYPosition(globalSeatPositionY);
			globalSeatPositionY += width;
		} else {
			if(yPosition < 0) {
				consoleViewPart.printText("Emergency Exit has a illegal yPosition.");
			}
			newDoor.setYPosition(yPosition);	
		}
	}
	
	/**
	 * 
	 * @param openOrNot
	 * @param insertAferRow
	 */
	public void createCurtain(boolean openOrNot, String name) {
		Curtain newCurtain = CabinFactory.eINSTANCE.createCurtain();
		cabin.getCurtains().add(newCurtain);
		newCurtain.setCurtainOpen(openOrNot);
		newCurtain.setXPosition(0);
		newCurtain.setYPosition(globalSeatPositionY + 50);
		newCurtain.setXDimension((cabin.getCabinWidth()-cabin.getAisleWidth())/2);
		newCurtain.setYDimension(50);
		newCurtain.setName(name);
		globalSeatPositionY = globalSeatPositionY + newCurtain.getYDimension() + 50;		
	}
	
	/**
	 * This function creates a Lavatory.
	 * @param isSymmetrical describes if the lavatory is meant to be placed on the same y-coordinate, symmetrical to the galley created before.
	 * @param symmetricalToNext describes if the galley generated next will be a symmetrical to this one.
	 * @param xDimension
	 * @param yDimension
	 */
	public void createLavatory(Boolean isSymmetrical, Boolean symmetricalToNext, double xDimension, double yDimension) {
		Lavatory newLavatory = CabinFactory.eINSTANCE.createLavatory();
		cabin.getLavatories().add(newLavatory);
		if(isSymmetrical) {
			newLavatory.setXPosition(cabin.getCabinWidth()-xDimension);
			newLavatory.setYPosition(globalSeatPositionY);
		} else {
			newLavatory.setXPosition(0);
			newLavatory.setYPosition(globalSeatPositionY);
		}
		if(!symmetricalToNext) {
			globalSeatPositionY += yDimension;			
		} 
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
	public void createGalley(Boolean isSymmetrical, Boolean symmetricalToNext, double xDimension, double yDimension) {
		Galley newGalley = CabinFactory.eINSTANCE.createGalley();
		cabin.getGalleys().add(newGalley);
		if(isSymmetrical) {
			newGalley.setXPosition(cabin.getCabinWidth()-xDimension);
			newGalley.setYPosition(globalSeatPositionY);
		} else {
			newGalley.setXPosition(0);
			newGalley.setYPosition(globalSeatPositionY);
		}
		if(!symmetricalToNext) {
			globalSeatPositionY += yDimension;			
		} 
		newGalley.setXDimension(xDimension);
		newGalley.setYDimension(yDimension);
	}
	
	@Override
	/**
	 * CAUTION! Objects must be generated in the order they appear in the cabin (from front to rear).
	 * Emergency Exits must be generated at first!
	 */
	protected void doRun() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page.findView("net.bhl.cdt.model.cabin.cabinview");
		consoleViewPart = (ConsoleViewPart) page.findView("net.bhl.cdt.model.cabin.consoleview");
		
		consoleViewPart.printText("initialize cabin generation ...");
		
		//ViewPart viewPart = null;
		cabin.getClasses().clear();
		cabin.getDoors().clear();
		cabin.getLavatories().clear();
		cabin.getGalleys().clear();
		cabin.getCurtains().clear();
		cabin.getStairways().clear();
		cabin.getStowages().clear();
		spaceBetweenSeats = 10;
		globalSeatPositionX = 0;
		globalSeatPositionY = 0;
		seatCount = 1;
		rowCount = 1;
	    
		/****Always generate emergency exits at first!******/
		createDoor(DoorType.EMERGENCY_EXIT,true,3,100,2600);
		createDoor(DoorType.EMERGENCY_EXIT,true,4,100,3000);
		/***************************************************/
		
		createLavatory(false,true, ((cabin.getCabinWidth()-cabin.getAisleWidth())/2), 200);
		createLavatory(true,false, ((cabin.getCabinWidth()-cabin.getAisleWidth())/2), 200);	
		createDoor(DoorType.MAIN_DOOR, true, 1, 200.0,-1);
		createGalley(false,true,((cabin.getCabinWidth()-cabin.getAisleWidth())/2),200);
		createGalley(true,false,((cabin.getCabinWidth()-cabin.getAisleWidth())/2),200);
		createClass(ClassType.FIRST,1);
		createCurtain(true,"First/Business");
		createClass(ClassType.BUSINESS,2);
		createCurtain(true,"Business/PremiumEco");
		createClass(ClassType.PREMIUM_ECO,3);
		createCurtain(true,"PremiumEco/Eco");
		createClass(ClassType.ECONOMY,4);
		createGalley(false,true,((cabin.getCabinWidth()-cabin.getAisleWidth())/2),200);
		createGalley(true,false,((cabin.getCabinWidth()-cabin.getAisleWidth())/2),200);
		createDoor(DoorType.STANDARD_DOOR, true, 2, 200.0,-1);
		createLavatory(false,true, ((cabin.getCabinWidth()-cabin.getAisleWidth())/2), 200);
		createLavatory(true,false, ((cabin.getCabinWidth()-cabin.getAisleWidth())/2), 200);
		
		consoleViewPart.printText("cabin generation completed");
		cabinViewPart.submitCabin(cabin);
	}

}
