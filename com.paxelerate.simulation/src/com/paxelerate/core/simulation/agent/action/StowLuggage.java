/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent.action;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.core.simulation.covid.ContactTracingFunctions;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.PassengerExtensions;

/**
 * The Class StowLuggage.
 *
 * @author Michael.Schmidt, Marc.Engelmann
 */
public interface StowLuggage {

	/**
	 *
	 * @param agent
	 * @param centerLuggageStorage
	 */
	static void run(Agent agent, boolean centerLuggageStorage) {

		// Skip luggage stowing and just add a time penalty

		double sleepTime = PassengerExtensions.getLuggageStowingTime(agent.getPassenger());

		// change state
		agent.getPassenger().setState(State.STOW_LUGGAGE);

		// change influence area
		agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
		agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);

		// agent.rotateTo(180);

		try {
			Thread.sleep(agent.getSimulationTimeFor(sleepTime));

			ContactTracingFunctions.evaluateCovidDistances(agent, sleepTime);

			agent.getPassenger().setTotalTimeWaited(
					agent.getPassenger().getTotalTimeWaited() + agent.getSimulationTimeFor(sleepTime));

		} catch (InterruptedException e) {
			System.out.println("Agent action: InterruptedException");
		}

		agent.setAlreadyStowed(true);

	}

//	/**
//	 * Attempt to stow luggage. Simulates time for checking available space
//	 */
//	static void attemptToStowLuggage(Agent agent) {
//		int sleepTime = 10;
//		sleepTime += PassengerExtensions.getLuggageStowingTime(agent.getPassenger());
//		StowLuggage.sleepAgentThread(sleepTime, agent);
////		SimulationHandler.addPassengersLookingForLuggageSpot(agent.getPassenger());
//		System.out.println("Stow Luggage: Looking for luggage spot deactivated!");
//	}

//	/**
//	 * search for empty bin space in cabin
//	 *
//	 * @return
//	 **/
//	static LuggageStorage getAnyEmptyLuggageElement(Agent agent) {
//
//		for (LuggageStorage bin : DeckExtensions.getBy(agent.getPassenger()).getLuggageStorages()) {
//
//			int passengersLargeBags = StowLuggage.getNumberOfLargeBags(agent.getPassenger().getLuggage());
//
//			if (bin.getFreeVolume() > StowLuggage.getRequiredLuggageVolume(agent) && bin.getMaximumLargeBags()
//					- StowLuggage.getNumberOfLargeBags(bin.getLuggage()) >= passengersLargeBags) {
//				return bin;
//			}
//		}
//		System.out.println("NOT IMPLEMENTED!! All bins are full, bags are added to residual list");
//		return null;
//	}

//	/**
//	 * Gets the bulkiness factor.
//	 *
//	 * @param type the type
//	 * @return the bulkiness factor
//	 */
//	static double getBulkinessFactor(LuggageType type, LuggageProperties options) {
//		switch (type) {
//		case JACKET:
//			return options.getJacketBulkiness();
//		case SMALL_BAG:
//			return options.getSmallBagBulkiness();
//		case MEDIUM_BAG:
//			return options.getMediumBagBulkiness();
//		case LARGE_BAG:
//			return options.getLargeBagBulkiness();
//		default:
//			return 1;
//		}
//	}

//	/**
//	 *
//	 * @return
//	 */
//	static LuggageStorage getEmptyCLSElement(Agent agent) {
//		LuggageStorage centralStoragesAtDoor = AgentFunctions
//				.getCenterLuggageStorageAtDoor(agent.getPassenger().getDoor());
//
//		double requiredLuggageVolume = StowLuggage.getRequiredLuggageVolume(agent);
//
//		int largeBagsInBin = StowLuggage.getNumberOfLargeBags(centralStoragesAtDoor.getLuggage());
//		int passengersLargeBags = StowLuggage.getNumberOfLargeBags(agent.getPassenger().getLuggage());
//
//		if (centralStoragesAtDoor.getFreeVolume() > requiredLuggageVolume
//				&& centralStoragesAtDoor.getMaximumLargeBags() - largeBagsInBin >= passengersLargeBags) {
//			return centralStoragesAtDoor;
//		}
//
//		System.out.println("Center luggage storage at door " + agent.getPassenger().getDoor().getId()
//				+ " are already full - Luggage is stowed in overhead bins at the seat");
//		return null;
//	}

//	/**
//	 * check for free bin, associated with row -> notify if full
//	 *
//	 * @return the empty overheadbin
//	 */
//	static LuggageStorage getEmptyLinkedLuggageElement(Agent agent) {
//		EList<LuggageStorage> associatedStorages = EObjectHelper.getParent(Row.class, agent.getPassenger().getSeat())
//				.getLuggageStorage();
//		double requiredLuggageVolume = StowLuggage.getRequiredLuggageVolume(agent);
//		double yAgentPosition = agent.getPassenger().getCurrentPosition().getY()
//				* agent.getHandler().getSettings().getSimulationGridResolution();
//
//		if (!associatedStorages.isEmpty()) {
//			for (LuggageStorage bin : associatedStorages) {
//
//				// Bin should be within 1.2m reach in y direction, required for twin aisle
//				// configurations
//				if (Math.abs(yAgentPosition - bin.getPosition().getY()) < 120) {
//
//					int passengersLargeBags = StowLuggage.getNumberOfLargeBags(agent.getPassenger().getLuggage());
//
//					if (bin.getFreeVolume() > requiredLuggageVolume && bin.getMaximumLargeBags()
//							- StowLuggage.getNumberOfLargeBags(bin.getLuggage()) >= passengersLargeBags) {
//						return bin;
//					}
//				}
//			}
//			System.out.println("Linked overhead bins in row "
//					+ RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, agent.getPassenger().getSeat()))
//					+ " are already full - Luggage is stowed somewhere else");
//			return null;
//			// return getAnyEmptyLuggageElement(agent);
//		}
//		System.out.println("No luggage storage found in row: "
//				+ RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, agent.getPassenger().getSeat())));
//		return null;
//	}

//	/**
//	 * Gets the number of large bags.
//	 *
//	 * @param items the luggage items
//	 * @return the number of large bags
//	 */
//	static int getNumberOfLargeBags(EList<Luggage> items) {
//		return (int) items.stream().filter(l -> l.getType() == LuggageType.LARGE_BAG).count();
//	}

//	/**
//	 * Gets the required luggage volume.
//	 *
//	 * @return the required luggage volume
//	 */
//	static double getRequiredLuggageVolume(Agent agent) {
//		return agent
//				.getPassenger().getLuggage().stream().mapToDouble(l -> l.getVolume() * StowLuggage
//						.getBulkinessFactor(l.getType(), agent.getHandler().getSettings().getLuggageProperties()))
//				.sum();
//	}
//
//	/**
//	 *
//	 * @param agent
//	 * @param centerLuggageStorage
//	 */
//	static void run(Agent agent, boolean centerLuggageStorage) {
//
//		// Skip luggage stowing and just add a time penalty
//		if (agent.getHandler().getSettings().getLuggageModelOption() == LuggageModelOption.SIMPLE) {
//		StowLuggage.sleepAgentThread(PassengerExtensions.getLuggageStowingTime(agent.getPassenger()), agent);
//
//		agent.setAlreadyStowed(true);
//
//		} else {
//			if (centerLuggageStorage) {
//				LuggageStorage bin = StowLuggage.getEmptyCLSElement(agent);
//				if (bin != null) {
//					StowLuggage.sleepAgentThread(StowLuggage.simulateStowingProcess(bin, agent), agent);
//					StowLuggage.stowBagsInBin(bin, agent);
//					agent.setAlreadyStowed(true);
//				}
//			} else {
//				LuggageStorage bin = StowLuggage.getEmptyLinkedLuggageElement(agent);
//				if (bin != null) { // && !linkedBinsFull) {
//					StowLuggage.sleepAgentThread(StowLuggage.simulateStowingProcess(bin, agent), agent);
//					StowLuggage.stowBagsInBin(bin, agent);
//				} else {
//					StowLuggage.attemptToStowLuggage(agent);
//				}
//				/* notify everyone that the luggage is now stowed */
//				agent.setAlreadyStowed(true);
//			}
//		}
//}

//	/**
//	 * Simulate stowing process.
//	 *
//	 * @param bin
//	 */
//	static double simulateStowingProcess(LuggageStorage bin, Agent agent) {
//
//		double stowingTime = PassengerExtensions.getLuggageStowingTime(agent.getPassenger());
//
//		// stowing time is adapted according to the bin filling degree: > 60% - 1.2; >=
//		// 80% - 1.5
//		int binFillingDegree = (int) (100 - bin.getFreeVolume() * 100 / bin.getNetVolume());
//		if (binFillingDegree > 60 && binFillingDegree < 80) {
//			stowingTime = stowingTime * 1.2;
//		} else if (binFillingDegree >= 80) {
//			stowingTime = stowingTime * 1.5;
//		}
//		return stowingTime;
//	}
//
//	/**
//	 * Sleep agent thread.
//	 *
//	 * @param time the time
//	 */
//	static void sleepAgentThread(double sleepTime, Agent agent) {
//
//		// change state
//		agent.getPassenger().setState(State.STOW_LUGGAGE);
//
//		// change influence area
//		agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
//		agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);
//
//		// agent.rotateTo(180);
//
//		try {
//			Thread.sleep(agent.time(sleepTime));
//			agent.getPassenger().setTotalTimeWaited(agent.getPassenger().getTotalTimeWaited() + agent.time(sleepTime));
//		} catch (InterruptedException e) {
//			System.out.println("Agent action: InterruptedException");
//		}
//	}
//
//	/**
//	 * Links the bags to the OverheadBin and calculates the remaining volume; if not
//	 * enough space is available
//	 *
//	 * @param bin the OverheadBin
//	 */
//	static void stowBagsInBin(LuggageStorage bin, Agent agent) {
//
//		for (Luggage bag : agent.getPassenger().getLuggage()) {
//			bin.getLuggage().add(bag);
//		}
//
//		bin.setFreeVolume(bin.getFreeVolume() - StowLuggage.getRequiredLuggageVolume(agent));
//	}
//}
}
