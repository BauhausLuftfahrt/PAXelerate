package com.paxelerate.storage;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Sex;

public class StorageHandler {

	GaussianStorage weightStore = new GaussianStorage(StoreType.WEIGHT),
			heightStore = new GaussianStorage(StoreType.HEIGHT),
			depthStore = new GaussianStorage(StoreType.DEPTH),
			widthStore = new GaussianStorage(StoreType.WIDTH);

	AgeStorage ageStore = new AgeStorage();

	LuggageStorage luggageStore = new LuggageStorage();

	int numberOfPassengersTotal = 0, numberOfPassengersMale = 0,
			numberOfPassengersFemale = 0;

	public StorageHandler() {

	}

	public void addPassenger(Passenger pax) {

		weightStore.addValue(pax.getSex(), pax.getWeight());
		heightStore.addValue(pax.getSex(), pax.getHeight());
		depthStore.addValue(pax.getSex(), pax.getDepth());
		widthStore.addValue(pax.getSex(), pax.getWidth());
		luggageStore.addValue(pax.getLuggage());
		ageStore.addValue(pax.getSex(), pax.getAge());

		numberOfPassengersTotal++;
		if (pax.getSex() == Sex.MALE) {
			numberOfPassengersMale++;
		} else {
			numberOfPassengersFemale++;
		}
	}

	public GaussianStorage getStore(StoreType type) {
		switch (type) {
		case WEIGHT: {
			return weightStore;
		}
		case HEIGHT: {
			return heightStore;
		}
		case DEPTH: {
			return depthStore;
		}
		case WIDTH: {
			return widthStore;
		}
		default:
			return null;
		}
	}

	public LuggageStorage getLuggageStore() {
		return luggageStore;
	}

	public double getPercentageOfPassengers(Sex sex) {
		if (sex == Sex.MALE) {
			return (double) numberOfPassengersMale
					/ (double) numberOfPassengersTotal;
		} else {
			return (double) numberOfPassengersFemale
					/ (double) numberOfPassengersTotal;
		}
	}

	public AgeStorage getAgeStore() {
		return ageStore;
	}

	public enum StoreType {
		WEIGHT, HEIGHT, WIDTH, DEPTH, AGE
	}

	public void clear() {
		weightStore = new GaussianStorage(StoreType.WEIGHT);
		heightStore = new GaussianStorage(StoreType.HEIGHT);
		depthStore = new GaussianStorage(StoreType.DEPTH);
		widthStore = new GaussianStorage(StoreType.WIDTH);
		ageStore = new AgeStorage();
		luggageStore = new LuggageStorage();
		numberOfPassengersTotal = 0;
		numberOfPassengersMale = 0;
		numberOfPassengersFemale = 0;
	}
}
