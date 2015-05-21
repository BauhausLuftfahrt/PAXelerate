package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.util.FuncLib.GaussOptions;

public class PassengerPropertyGenerator {

	private Passenger passenger;

	private double[][] speedmodel = { { 5, 0.6 }, { 10, 1.18 }, { 15, 1.5 },
			{ 20, 1.6 }, { 25, 1.6 }, { 30, 1.55 }, { 35, 1.5 }, { 40, 1.5 },
			{ 45, 1.45 }, { 50, 1.42 }, { 55, 1.37 }, { 60, 1.3 }, { 65, 1.2 },
			{ 70, 1.05 }, { 75, 0.9 }, { 80, 0.7 } };

	private double[][] agemodel = { { 0.0349, 0.0333 }, { 0.0374, 0.0356 },
			{ 0.0374, 0.0356 }, { 0.0369, 0.0349 }, { 0.0344, 0.0330 },
			{ 0.0348, 0.0341 }, { 0.0367, 0.0362 }, { 0.0402, 0.0405 },
			{ 0.0395, 0.0402 }, { 0.0351, 0.0363 }, { 0.0306, 0.0319 },
			{ 0.0231, 0.0247 }, { 0.0183, 0.0201 }, { 0.0156, 0.0182 },
			{ 0.0139, 0.0176 }, { 0.0108, 0.0155 }, { 0.0065, 0.0111 },
			{ 0.0044, 0, 0107 } };

	public PassengerPropertyGenerator(Passenger pax) {
		this.passenger = pax;
		/** At first. decide for the sex. **/
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
		passenger.setWalkingSpeed(adaptSpeed());

		/** Define the luggage stow time randomly **/
		passenger.setLuggageStowTime(FuncLib.gaussianRandom(15,
				GaussOptions.PERCENT_95, 7));
	}

	public Passenger getPassenger() {
		return passenger;
	}

	private double adaptSpeed() {
		int value = FuncLib.roundToFive(passenger.getAge());
		int index = value % 5;
		if (index <= 0) {
			index = 1;
		}
		return speedmodel[index - 1][1];
	}

	// TODO: ADAPT THIS PROPERLY ACCORDING TO FUCTION!
	private double adaptAge() {
		if (passenger.getSex() == Sex.FEMALE) {
			return agemodel[0][1];
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
