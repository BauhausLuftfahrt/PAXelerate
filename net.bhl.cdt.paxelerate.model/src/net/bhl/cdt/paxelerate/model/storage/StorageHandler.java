/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.model.storage;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Sex;

/**
 * The Class StorageHandler.
 */
public class StorageHandler {

	/** The width store. */
	GaussianStorage weightStore = new GaussianStorage(StoreType.WEIGHT),
			heightStore = new GaussianStorage(StoreType.HEIGHT),
			depthStore = new GaussianStorage(StoreType.DEPTH),
			widthStore = new GaussianStorage(StoreType.WIDTH);

	/** The age store. */
	AgeStorage ageStore = new AgeStorage();

	/** The luggage store. */
	LuggageStorage luggageStore = new LuggageStorage();

	/** The number of passengers. */
	int[] numberOfPassengers = { 0, 0, 0 }; // total, male, female

	/**
	 * Instantiates a new storage handler.
	 */
	public StorageHandler() {

	}

	/**
	 * Adds the passenger.
	 *
	 * @param pax the pax
	 */
	@SuppressWarnings("deprecation")
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

	/**
	 * Gets the store.
	 *
	 * @param type the type
	 * @return the store
	 */
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

	/**
	 * Gets the luggage store.
	 *
	 * @return the luggage store
	 */
	public LuggageStorage getLuggageStore() {
		return luggageStore;
	}

	/**
	 * Gets the percentage of passengers.
	 *
	 * @param sex the sex
	 * @return the percentage of passengers
	 */
	public double getPercentageOfPassengers(Sex sex) {
		if (sex == Sex.MALE) {
			return (double) numberOfPassengers[1]
					/ (double) numberOfPassengers[0];
		} else {
			return (double) numberOfPassengers[2]
					/ (double) numberOfPassengers[0];
		}
	}

	/**
	 * Gets the age store.
	 *
	 * @return the age store
	 */
	public AgeStorage getAgeStore() {
		return ageStore;
	}

	/**
	 * The Enum StoreType.
	 */
	public enum StoreType {

		/** The weight. */
		WEIGHT, 
		/** The height. */
		HEIGHT, 
		/** The width. */
		WIDTH, 
		/** The depth. */
		DEPTH, 
		/** The age. */
		AGE
	}

	/**
	 * Clear.
	 */
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
