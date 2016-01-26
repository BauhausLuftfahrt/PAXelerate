package com.paxelerate.model.storage;

import com.paxelerate.model.Passenger;
import com.paxelerate.model.Sex;

public class StorageHandler {

	GaussianStorage weightStore = new GaussianStorage(StoreType.WEIGHT),
			heightStore = new GaussianStorage(StoreType.HEIGHT),
			depthStore = new GaussianStorage(StoreType.DEPTH),
			widthStore = new GaussianStorage(StoreType.WIDTH);

	AgeStorage ageStore = new AgeStorage();

	LuggageStorage luggageStore = new LuggageStorage();

	int[] numberOfPassengers = { 0, 0, 0 }; // total, male, female

	public StorageHandler() {

	}

	public void addPassenger(Passenger pax) {

		weightStore.addValue(pax.getSex(), pax.getWeight());
		heightStore.addValue(pax.getSex(), pax.getHeight());
		depthStore.addValue(pax.getSex(), pax.getDepth());
		widthStore.addValue(pax.getSex(), pax.getWidth());
		luggageStore.addValue(pax.getLuggage());
		ageStore.addValue(pax.getSex(), pax.getAge());

		numberOfPassengers[0] += 1;
		if (pax.getSex() == Sex.MALE) {
			numberOfPassengers[1] += 1;
		} else {
			numberOfPassengers[2] += 1;
		}

		if (numberOfPassengers[0] > 179) {
			Exporter.generateDistributionFile("export", weightStore, heightStore,
					depthStore, widthStore, ageStore, luggageStore,
					numberOfPassengers);
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
			return (double) numberOfPassengers[1]
					/ (double) numberOfPassengers[0];
		} else {
			return (double) numberOfPassengers[2]
					/ (double) numberOfPassengers[0];
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
		numberOfPassengers = new int[3];
	}
}
