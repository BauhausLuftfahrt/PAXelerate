package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;
import java.util.Random;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.util.ModelHelper;

public class GeneratePassengersCommand extends CDTCommand{

	private Cabin cabin;
	ArrayList<Integer> randomNumberCheck;
	
	public GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	/**
	 * This method generates the passengers one by one 
	 * 
	 * maybe all passengers should be grouped in a folder
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
			
			while (checkForRandomUniqueness == 0) {
				randomSeat = rand.nextInt(totalSeats) + 1;
				if(!randomNumberCheck.contains(randomSeat)) {
				randomNumberCheck.add(randomSeat);
				checkForRandomUniqueness = 1;
				}
			}
			newPassenger.setId(i); 
			newPassenger.setSeat(randomSeat);

			/**
			 * These loops iterate through every seat within every row within every class.
			 * These loops search for the matching seat number of the random seat generated above.
			 * if the seat was found, the loop knows in which class the seat is and adds the ClassType to the according passenger.
			 */
			for (PassengerClass passengerClass:cabin.getClasses()) {
				if(!passengerClass.equals(null)) {
					for (Seat seat:ModelHelper.getChildrenByClass(passengerClass, Seat.class)){
						if(!seat.equals(null)) {
							if(seat.getSeatNumber()==newPassenger.getSeat()) {
								newPassenger.setClass(passengerClass.getType());
								newPassenger.setName(i+" is at Seat "+seat.getSeatId());			
							}
						}
					}
				}
			}
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
		randomNumberCheck = new ArrayList<Integer>();
		generatePassengers();
		
	}

}
