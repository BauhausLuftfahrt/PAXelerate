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
 * @author marc.engelmann
 *
 */

public class GeneratePassengersCommand extends CDTCommand{

	private Cabin cabin;
	ArrayList<Integer> randomNumberCheck;
	ArrayList<Integer> randomPassengerId;
	int passengerIdCount;
	ConsoleViewPart consoleViewPart;
	CabinViewPart cabinViewPart;
	
	public GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	/**
	 * This method generates the passengers of a specific class one by one 
	 * 
	 * maybe all passengers should be grouped in a folder
	 * 
	 */
	public void generatePassengers(ClassType classType) {
		
		int totalPax = cabin.getEconomyClassPassengers()+cabin.getBusinessClassPassengers()+cabin.getPremiumEconomyClassPassengers()+cabin.getFirstClassPassengers();
		int totalSeats = cabin.getSeatsInEconomyClass() + cabin.getSeatsInPremiumEconomyClass() + cabin.getSeatsInBusinessClass() + cabin.getSeatsInFirstClass();
		Sex sex = Sex.FEMALE;
		int paxInClass;
		int seatsInClass;
		int seatAreaBegin;
		int seatAreaEnd;
		
		switch (classType) {
		
		case BUSINESS:
			paxInClass = cabin.getBusinessClassPassengers();
			seatAreaBegin = cabin.getSeatsInFirstClass() +1; // 5
			seatAreaEnd = cabin.getSeatsInBusinessClass() + cabin.getSeatsInFirstClass(); // 8
			seatsInClass = cabin.getSeatsInBusinessClass();	
			break;
		case FIRST:
			paxInClass = cabin.getFirstClassPassengers();
			seatAreaBegin = 1; // 1
			seatAreaEnd = cabin.getSeatsInFirstClass(); //4
			seatsInClass = cabin.getSeatsInFirstClass();
			break;
		case PREMIUM_ECO:
			paxInClass = cabin.getPremiumEconomyClassPassengers();
			seatAreaBegin = cabin.getSeatsInFirstClass() + cabin.getSeatsInBusinessClass() +1;
			seatAreaEnd = totalSeats - cabin.getSeatsInEconomyClass();
			seatsInClass = cabin.getSeatsInPremiumEconomyClass();
			break;
		default:
			paxInClass = cabin.getEconomyClassPassengers();
			seatAreaBegin = totalSeats - cabin.getSeatsInEconomyClass() +1;
			seatAreaEnd = totalSeats;
			seatsInClass = cabin.getSeatsInEconomyClass();
			break;
			
		
		}
		for (int i = 1; i <= paxInClass; i++) {
			
			Passenger newPassenger = CabinFactory.eINSTANCE.createPassenger();
			cabin.getPassengers().add(newPassenger);			
			Random rand = new Random();
			int checkForRandomUniqueness = 0;
			int randomSeat = 0;
		
			while (checkForRandomUniqueness == 0) {
				randomSeat = rand.nextInt(seatsInClass) + seatAreaBegin;
				if(!randomNumberCheck.contains(randomSeat)){
				randomNumberCheck.add(randomSeat);
				checkForRandomUniqueness = 1;
				}
			}
			
			int checkForRandomPassengerId = 0;
			int randomId = 0;

			while (checkForRandomPassengerId == 0) {
				randomId = rand.nextInt(totalPax) + 1;
				if(!randomPassengerId.contains(randomId)){
					randomPassengerId.add(randomId);
				checkForRandomPassengerId = 1;
				}
			}
			
			newPassenger.setId(randomId); 
			newPassenger.setSeat(randomSeat);
			
			/**
			 * These loops iterate through every seat within every row within every class.
			 * These loops search for the matching seat number of the random seat generated above.
			 * if the seat was found, the loop knows in which class the seat is and adds the ClassType to the according passenger.
			 */
			//for (PassengerClass passengerClass:cabin.getClasses()) {
				//if(!passengerClass.equals(null)) {
					for (Seat seat:ModelHelper.getChildrenByClass(cabin, Seat.class)){
						if(!seat.equals(null)) {
							if(seat.getSeatNumber()==newPassenger.getSeat()) {
								newPassenger.setName(randomId+" is at Seat "+seat.getSeatId());		 //passengerIdCount ordnet nach Klasse!
								newPassenger.setSeatRef(seat);
							}
						}
					}
				//}
			//}
			newPassenger.setClass(classType);
			newPassenger.setAge(rand.nextInt(42) + 18);
			if (cabin.getDoors().size()!=0) {
				for(Door door:ModelHelper.getChildrenByClass(cabin, Door.class)) {
					// The main door is assigned to the passenger
					if(door.getDoorType()==DoorType.MAIN_DOOR) {
						newPassenger.setDoor(door);
					}
				}
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
			passengerIdCount ++;
			
			
		}
		randomNumberCheck.clear();
	}
	
	@Override
	protected void doRun() {
		cabin.getPassengers().clear();
		randomNumberCheck = new ArrayList<Integer>();
		randomPassengerId = new ArrayList<Integer>();
		passengerIdCount = 1;
		generatePassengers(ClassType.FIRST);
		generatePassengers(ClassType.BUSINESS);
		generatePassengers(ClassType.PREMIUM_ECO);
		generatePassengers(ClassType.ECONOMY);
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		consoleViewPart = (ConsoleViewPart) page.findView("net.bhl.cdt.model.cabin.consoleview");
		cabinViewPart = (CabinViewPart) page.findView("net.bhl.cdt.model.cabin.cabinview");
		consoleViewPart.printText("successfully created "+(passengerIdCount-1)+" passengers");
		
		cabinViewPart.submitCabin(cabin);
		
	}

}
