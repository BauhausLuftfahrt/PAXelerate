package com.paxelerate.storage;

import net.bhl.cdt.model.cabin.Passenger;

public class StorageHandler {

	GaussianStorage weightStore = new GaussianStorage(),
			heightStore = new GaussianStorage(),
			depthStore = new GaussianStorage(),
			widthStore = new GaussianStorage();

	LuggageStorage luggageStore = new LuggageStorage();

	int numberOfPassengers = 0;

	public StorageHandler() {

	}

	public void addPassenger(Passenger pax) {

		weightStore.addValue(pax.getSex(), pax.getWeight());
		heightStore.addValue(pax.getSex(), pax.getHeight());
		depthStore.addValue(pax.getSex(), pax.getDepth());
		widthStore.addValue(pax.getSex(), pax.getWidth());
		luggageStore.addValue(pax.getLuggage());

		numberOfPassengers++;
	}

	public GaussianStorage getWeightStore() {
		return weightStore;
	}

	public GaussianStorage getHeightStore() {
		return heightStore;
	}

	public GaussianStorage getWidthStore() {
		return widthStore;
	}

	public GaussianStorage getDepthStore() {
		return depthStore;
	}

	public LuggageStorage getLuggageStore() {
		return luggageStore;
	}
}
