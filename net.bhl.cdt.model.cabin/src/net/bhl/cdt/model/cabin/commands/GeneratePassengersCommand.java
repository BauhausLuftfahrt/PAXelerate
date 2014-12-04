
package net.bhl.cdt.model.cabin.commands;
import java.util.ArrayList;
import java.util.Random;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * 
 * This command creates the passengers.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @date 03.12.2014
 *
 */


/********************How to add a new right click command to openCDT***********************/
/**                                                                                      **/
/** (1) Create a new "newCommand.java" in "net.bhl.cdt.model.cabin.commands"             **/
/**     - Best practice: copy an existing command.                                       **/
/**     - Be sure to not modify the constructor, "this.cabin = cabin" should stay intact **/
/**                                                                                      **/
/** (2) Create a new "newCommandHandler.java" in "net.bhl.cdt.model.cabin.handlers"      **/                                                            
/**     - Best practice: copy an existing handler file.                        		     **/
/**     - Tip: Do not modify this file, only check for correct naming         			 **/
/**                         															 **/
/** (3) Open "plugin.xml" and go to "org.eclipse.ui.commands"                			 **/
/**     - Create a new command by right-clicking.                                        **/
/**     - Fill in the id, name and default handler. (Caution: case sensitive!)           **/
/**                                                        								 **/
/** (4) Go to "org.eclipse.ui.menus" in "plugin.xml"                                     **/
/**     - Expand the "popup:org.eclipse.(...)" entry.                                    **/
/**     - Add a new command by right-clicking.                                           **/
/**     - Fill in the correct commandID and your desired label name.                     **/
/**     - Add a new parameter by right-clicking.                                         **/
/**     - Set the parameter to "false (visible when)".      							 **/
/**     - Add a parameter within called "iterate".            						     **/
/**     - Add a parameter within called "instanceOf" and choose "cabin". 			     **/
/**                                            											 **/
/******************************************************************************************/


public class GeneratePassengersCommand extends CDTCommand{

	private Cabin cabin;
	private ArrayList<Integer> randomSeatId;
	private ArrayList<Integer> randomPassengerId;
	private int passengerIdCount;
	private int passengerPerClassCount;
	private ConsoleViewPart consoleViewPart;
	private CabinViewPart cabinViewPart;
	private String classNameString;
	private int totalPax;
	private int totalSeats;
	private int paxInClass;
	private int seatsInClass;
	private int seatAreaBegin;
	
	/**
	 * This method submits the cabin to be used in the file.
	 * @param cabin is the input parameter
	 */
	public  GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	/**
	 *This method generates the parameters for a specific class.
	 * @param classT is the specific class
	 */
	private void switchClass(ClassType classT) {
		switch (classT) {
		case BUSINESS:
			paxInClass = cabin.getBusinessClassPassengers();
			seatAreaBegin = cabin.getSeatsInFirstClass() + 1; 
			seatsInClass = cabin.getSeatsInBusinessClass();
			classNameString = "business";
			break;
		case FIRST:
			paxInClass = cabin.getFirstClassPassengers();
			seatAreaBegin = 1; 
			seatsInClass = cabin.getSeatsInFirstClass();
			classNameString = "first";
			break;
		case PREMIUM_ECO:
			paxInClass = cabin.getPremiumEconomyClassPassengers();
			seatAreaBegin = cabin.getSeatsInFirstClass()+ cabin.getSeatsInBusinessClass() + 1;
			seatsInClass = cabin.getSeatsInPremiumEconomyClass();
			classNameString = "premium eco";
			break;
		default:
			paxInClass = cabin.getEconomyClassPassengers();
			seatAreaBegin = totalSeats - cabin.getSeatsInEconomyClass() + 1;
			seatsInClass = cabin.getSeatsInEconomyClass();
			classNameString = "economy";
			break;
		}
	}
	
	/**
	 * This method applies a door to a passenger. In this implementation,
	 * the main door is always chosen as the assigned door.
	 * @param pass is the passenger to whom the door is assigned to.
	 */
	private void applyDoor(Passenger pass) {
		if (cabin.getDoors().size() != 0) {
			for (Door door : ModelHelper.getChildrenByClass(cabin,
					Door.class)) {
				// The main door is assigned to the passenger
				if (door.getDoorType() == DoorType.MAIN_DOOR) {
					pass.setDoor(door);
				}
			}
		}
	}
	
	/**
	 * This method generates a random value.
	 * @param lowerBound defines the lower end of the random number.
	 * @param upperBound defines the upper end. <b><i>Note that the upper bound itself is never reached!</i></b>
	 * @return returns the random double generated from the parameters above.
	 */
	private double randomValue(int lowerBound, int upperBound) {
		Random rand = new Random();
		return (rand.nextInt(upperBound-lowerBound) + lowerBound);
	}
	
	/**
	 * This method generates a unique random number for a specific list.
	 * @param list is the list in which all unique values are stored
	 */
	private int uniqueRandom(ArrayList<Integer> list) {
		boolean checkUniqueness = false;
		Random rand = new Random();
		int randomValue = 0;	
		while (!checkUniqueness) {
			randomValue = rand.nextInt(seatsInClass) + seatAreaBegin;
			if (!list.contains(randomValue)) {
				list.add(randomValue);
				checkUniqueness = true;
			}
		} return randomValue;
	}
	
	private Seat getSeat(Passenger passenger) {
		for (Seat seat : ModelHelper.getChildrenByClass(cabin,
				Seat.class)) {
			if ((!seat.equals(null))&& (seat.getSeatNumber() == passenger.getSeat())) {
				return seat;	
			}
		}
		consoleViewPart.printText("No seat found!");
		Seat emptySeat = null;
		return emptySeat;
	}
	
	/**
	 * This method generates the passengers. 
	 * @param classType specifies in which class the passengers are generated
	 */
	private void generatePassengers(ClassType classType) {
		passengerPerClassCount = 0;
		Sex sex = Sex.FEMALE;
		boolean hasLuggage = true;
		double passengersPerMinute = 18;
		switchClass(classType);
		if (paxInClass != 0) {
			if (paxInClass <= seatsInClass) {
				for (int i = 1; i <= paxInClass; i++) {
					Passenger newPassenger = CabinFactory.eINSTANCE.createPassenger();
					cabin.getPassengers().add(newPassenger);
					newPassenger.setId(uniqueRandom(randomSeatId));
					newPassenger.setSeat(uniqueRandom(randomPassengerId));
				    newPassenger.setName(newPassenger.getId() + " ("+ getSeat(newPassenger).getSeatId() + ")");
				    newPassenger.setSeatRef(getSeat(newPassenger));
					newPassenger.setClass(classType);
					applyDoor(newPassenger);
					newPassenger.setHasLuggage(hasLuggage);					
					newPassenger.setStartBoardingAfterDelay(passengerIdCount* 60 / passengersPerMinute);
					
					/********************random values***********************/
					if (randomValue(0,2)==1) {sex = Sex.MALE;}
					newPassenger.setSex(sex);
					newPassenger.setAge((int) randomValue(18, 70));
					newPassenger.setHeight(randomValue(150, 200));
					newPassenger.setWeight(randomValue(60, 110));
					newPassenger.setDepth(randomValue(20, 50));
					newPassenger.setWidth(randomValue(30, 60));
					newPassenger.setWalkingSpeed(randomValue(5, 15) / 10);
					newPassenger.setLuggageStowTime(randomValue(5, 10));
					/********************************************************/
					passengerIdCount++;
					passengerPerClassCount++;
				}
				randomSeatId.clear();
				consoleViewPart.printText("successfully created "+ (passengerPerClassCount) + " passengers in "+ classNameString + " class");
			} else {
				consoleViewPart.printText("Too many passengers in "+ classNameString + " class");
			}		
		}
	}
	
	@Override
	protected void doRun() {
		/************************* get the views ***********************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		consoleViewPart = (ConsoleViewPart) page
				.findView("net.bhl.cdt.model.cabin.consoleview");
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		/**************************************************************/
		cabin.getPassengers().clear();
		totalPax = cabin.getEconomyClassPassengers()
				+ cabin.getBusinessClassPassengers()
				+ cabin.getPremiumEconomyClassPassengers()
				+ cabin.getFirstClassPassengers();
		totalSeats = cabin.getSeatsInEconomyClass()
				+ cabin.getSeatsInPremiumEconomyClass()
				+ cabin.getSeatsInBusinessClass()
				+ cabin.getSeatsInFirstClass();
		randomSeatId = new ArrayList<Integer>();
		randomPassengerId = new ArrayList<Integer>();
		passengerIdCount = 1;
		if (totalPax <= totalSeats) {
			generatePassengers(ClassType.FIRST);
			generatePassengers(ClassType.BUSINESS);
			generatePassengers(ClassType.PREMIUM_ECO);
			generatePassengers(ClassType.ECONOMY);
		} else {
			consoleViewPart
					.printText("Too many passengers in the cabin! Remove "
							+ (totalPax - totalSeats) + ".");
		}
		cabinViewPart.submitCabin(cabin);
	}
}
