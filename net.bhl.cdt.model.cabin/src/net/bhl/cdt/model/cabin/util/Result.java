package net.bhl.cdt.model.cabin.util;

public class Result {

	private int passengers;

	private double simulationTime;
	private int runNumber;

	public Result(int pax, double sim, int run) {
		passengers = pax;
		simulationTime = sim;
		runNumber = run;
	}

	public int getPassengers() {
		return passengers;
	}

	public double getSimulationTime() {
		return simulationTime;
	}

	public int getRunNumber() {
		return runNumber;
	}
}
