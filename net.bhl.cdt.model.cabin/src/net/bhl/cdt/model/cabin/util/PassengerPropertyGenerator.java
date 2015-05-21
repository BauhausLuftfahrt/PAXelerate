package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.util.FuncLib.GaussOptions;

public class PassengerPropertyGenerator {

	private Passenger passenger;

	public PassengerPropertyGenerator(Passenger pax) {
		this.passenger = pax;
		/** At first, decide for the sex. **/
		passenger.setSex(switchRandomSex(50));

		/** Define the mood of the passenger **/
		passenger.setPassengerMood(PassengerMood.PASSIVE);

		/** Define the age according to age distribution **/
		passenger.setAge((int) adaptAge());

		/** Define the height according to normal distribution **/
		passenger.setHeight((int) adapt(177.5, 11.1, 164.5, 11.5));

		/** Define the weight according to normal distribution **/
		passenger.setWeight((int) adapt(90, 20, 60, 15));

		/** Define the depth according to normal distribution **/
		passenger.setDepth((int) adapt(30, 5, 27, 3));

		/** Define the width according to normal distribution **/
		passenger.setWidth((int) adapt(47, 2.8, 41.4, 2.8));

		/** Define the walking speed according to age **/
		passenger.setWalkingSpeed((int) adaptSpeed());

		/** Define the luggage stow time randomly **/
		passenger.setLuggageStowTime(FuncLib.gaussianRandom(15,
				GaussOptions.PERCENT_95, 7));
	}

	public Passenger getPassenger() {
		return passenger;
	}

	private double adaptSpeed() {
		if (passenger.getAge() < 50) {
			return 1;
		}
		return 0.7;
	}

	private double adaptAge() {
		if (passenger.getSex() == Sex.FEMALE) {
			return 29;
		}
		return 50;
	}

	private double adapt(double one, double two, double three, double four) {
		return getGauss95(applySwitch(one, two), applySwitch(three, four));
	}

	private Sex switchRandomSex(int percentageOfWomen) {
		if (FuncLib.randomValue(0, 100) < percentageOfWomen) {
			return Sex.FEMALE;
		}
		return Sex.MALE;

	}

	private double getGauss95(double mean, double deviation) {
		return FuncLib.gaussianRandom(mean, GaussOptions.PERCENT_95, deviation);
	}

	private double applySwitch(double maleValue, double femaleValue) {
		if (passenger.getSex() == Sex.MALE) {
			return maleValue;
		}
		return femaleValue;
	}
}
