/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.SortingScheme;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.extensions.RowExtensions;
import com.paxelerate.model.extensions.SeatExtensions;
import com.paxelerate.model.monuments.Row;

import net.bhl.opensource.toolbox.emf.EObjectHelper;

/**
 * This class is used for sorting the Passenger.class objects depending on
 * predefined criteria.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 *
 */
public interface PassengerSorter {

	// --------------------------------------------------------------
	// The comparators

	// Window to aisle comparator with distance to closest aisle.
	Comparator<Passenger> windowToAisleComparator = Comparator.comparing(p -> p.getSeat().getSeatLocation().getValue());

	// Window to aisle comparator with distance to closest aisle.
	Comparator<Passenger> seatLetterComparator = Comparator.comparing(p -> (int) p.getSeat().getLetter());

	// Front to rear comparator with row number.
	Comparator<Passenger> frontToRearComparator = Comparator
			.comparing(p -> RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())));

	// Luggage size comparator with size of luggage.
	Comparator<Passenger> luggageSizeComparator = (p1, p2) -> {

		// Check if luggage is available
		if (p1.getLuggage().isEmpty() && p2.getLuggage().isEmpty()) {
			return 0;
		} else if (p1.getLuggage().isEmpty() && !p2.getLuggage().isEmpty()) {
			return -1;
		} else if (p2.getLuggage().isEmpty() && !p1.getLuggage().isEmpty()) {
			return 1;
		} else {
			return p1.getLuggage().get(0).getType().compareTo(p2.getLuggage().get(0).getType());
		}
	};

	// Luggage amount comparator with number of luggage items.
	Comparator<Passenger> luggageAmountComparator = Comparator.comparing(p1 -> p1.getLuggage().size());

	/**
	 * @param paxList
	 * @param groupPercentage
	 */
	static void adaptPassengerGroups(EList<Passenger> paxList, double groupPercentage) {
		double groupSize = 2;
		int paxReSeated = (int) (paxList.size() * groupPercentage / groupSize);
		int reSeated = 0;

		for (int k = 0; k < 30; k++) {
			/*
			 * Define a random start position in the PAX list to move passengers around
			 */
			for (int j = new Random().nextInt(paxList.size() - 1); j < paxList.size() - 1; j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger thisPax = paxList.get(j);
					Passenger otherPax = paxList.get(i + 1);
					/* pax next to each other are searched for */
					if (EObjectHelper.getParent(Row.class, thisPax.getSeat()) == EObjectHelper.getParent(Row.class,
							otherPax.getSeat())
							&& (thisPax.getSeat().getLetter() == 'A' && otherPax.getSeat().getLetter() == 'B'
									|| thisPax.getSeat().getLetter() == 'B' && otherPax.getSeat().getLetter() == 'C'
									|| thisPax.getSeat().getLetter() == 'D' && otherPax.getSeat().getLetter() == 'E')
							|| thisPax.getSeat().getLetter() == 'E' && otherPax.getSeat().getLetter() == 'F') {
						paxList.move(j + 1, otherPax);
						System.out.println("PassengerSorter: Selected is PAX: " + thisPax.getSeat() + " / PAX reseated:"
								+ otherPax.getSeat());
						reSeated++;
					}
					if (paxReSeated == reSeated) {
						return;
					}
				}
			}
		}
	}

	/**
	 * @param paxList
	 * @param conformanceRate
	 */
	static void applyConformanceRate(EList<Passenger> paxList, double conformanceRate) {

		int numberOfPaxSwapped = (int) (conformanceRate * paxList.size());
		for (int i = 0; i < numberOfPaxSwapped; i++) {
			moveRandom(paxList);
		}
	}

	/**
	 * @param paxList
	 */
	static void moveRandom(EList<Passenger> paxList) {
		int r1 = new Random().nextInt(paxList.size());
		int r2 = new Random().nextInt(paxList.size());
		if (r1 == r2) {
			// choose new randomNumbers
			moveRandom(paxList);
		}
		paxList.move(r2, paxList.get(r1));
	}

	/**
	 * @param list
	 */
	static void shuffle(EList<Passenger> list) {

		// Transform to list
		List<Passenger> paxlist = list.stream().collect(Collectors.toList());

		// Shuffle list
		Collections.shuffle(paxlist);

		// Replace EList
		list.clear();
		list.addAll(paxlist);
	}

	/**
	 *
	 * @param deck
	 * @param scheme
	 */
	static void sort(Deck deck, SortingScheme scheme) {

		// Prevent sorting if there are too few passengers
		if (deck.getPassengers().size() < 2) {
			return;
		}

		switch (scheme) {

		case RANDOM:
			shuffle(deck.getPassengers());
			break;

		case RTF:
			ECollections.sort(deck.getPassengers(), frontToRearComparator.reversed());
			break;

		case FTR:
			ECollections.sort(deck.getPassengers(), frontToRearComparator);
			break;

		case WTA:
			ECollections.sort(deck.getPassengers(), windowToAisleComparator);
			break;

		case WTA_RTF:
			ECollections.sort(deck.getPassengers(),
					frontToRearComparator.reversed().thenComparing(windowToAisleComparator));
			break;

		case WTA_FTR:
			ECollections.sort(deck.getPassengers(), frontToRearComparator.thenComparing(windowToAisleComparator));
			break;

		case BLOCK:
			sortBlock(deck.getPassengers());
			break;

		case BOARDING_CLASS:
			sortClasses(deck.getPassengers());
			break;

		case STEFFEN:
			sortSteffen(deck.getPassengers());
			break;

		case MILNE_KELLY:
			// sortMilneKelly(cabin.getPassengers());
			throw new IllegalArgumentException("MILNE_KELLY Sorting is currently not supported!");

		case BIG_BAGS_AFT:
			ECollections.sort(deck.getPassengers(), luggageSizeComparator);
			break;

		case BIG_BAGS_FRONT:
			ECollections.sort(deck.getPassengers(), luggageSizeComparator.reversed());
			break;

		case MAX_BAGS_AFT:
			ECollections.sort(deck.getPassengers(), luggageAmountComparator);
			break;

		case MAX_BAGS_FRONT:
			ECollections.sort(deck.getPassengers(), luggageAmountComparator.reversed());
			break;
		}

		// Percentage of wrong passengers
		if (EObjectHelper.getParent(Model.class, deck).getSettings().getBoardingConformanceRate() != 1) {
			applyConformanceRate(deck.getPassengers(),
					EObjectHelper.getParent(Model.class, deck).getSettings().getBoardingConformanceRate());
		}

		// Percentage of groups
		if (EObjectHelper.getParent(Model.class, deck).getSettings().getPassengerProperties()
				.getGroupPercentage() != 0) {
			adaptPassengerGroups(deck.getPassengers(), EObjectHelper.getParent(Model.class, deck).getSettings()
					.getPassengerProperties().getGroupPercentage());
		}
	}

	/**
	 * Sort blocks.
	 *
	 * @param passengers
	 */
	static void sortBlock(EList<Passenger> passengers) {

		Deck deck = EObjectHelper.getParent(Deck.class, passengers.get(0));

		int numberOfBlocks = EObjectHelper.getParent(Model.class, deck).getSettings().getNumberOfBoardingBlocks();

		if (numberOfBlocks < 2) {
			return;
		}

		// Rows per block
		double rowsPerBlock = (double) deck.getRows().size() / numberOfBlocks;

		/* first create a list of all blocks */
		EList<Passenger> blockList = new BasicEList<>();

		/* then loop through all needed blocks */
		for (int i = 0; i < numberOfBlocks; i++) {

			int j = i;

			/* create the passenger list for each block */
			List<Passenger> block = passengers.stream().filter(p -> RowExtensions
					.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) <= rowsPerBlock * (j + 1)
					&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) > j * rowsPerBlock)
					.collect(Collectors.toList());

			// Shuffle the block
			Collections.shuffle(block);

			// then add the block to the list
			blockList.addAll(block);
		}

		passengers.clear();
		passengers.addAll(blockList);
	}

	/**
	 * Sort classes.
	 *
	 * @param passengers
	 */
	static void sortClasses(EList<Passenger> passengers) {

		/* first create a list of all blocks */
		EList<Passenger> blockList = new BasicEList<>();

		TravelClass[] sequence = { TravelClass.FIRST, TravelClass.BUSINESS, TravelClass.PREMIUM_ECONOMY,
				TravelClass.ECONOMY };

		/* then loop through all needed blocks */
		for (TravelClass tc : sequence) {

			/* create the passenger list for each block */
			List<Passenger> block = passengers.stream().filter(p -> SeatExtensions.getTravelClass(p.getSeat()) == tc)
					.collect(Collectors.toList());

			// Shuffle the block
			Collections.shuffle(block);

			// then add the block to the list
			blockList.addAll(block);
		}

		passengers.clear();
		passengers.addAll(blockList);
	}

	/**
	 * New implementation!
	 *
	 * @param passengers
	 */
	static void sortSteffen(EList<Passenger> passengers) {

		List<List<Passenger>> list = new ArrayList<>();

		// create the passenger list for each seat type
		List<Passenger> windowEven = passengers.stream()
				.filter(p -> p.getSeat().getSeatLocation() == SeatLocation.WINDOW
						&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) % 2 == 0)
				.collect(Collectors.toList());

		// create the passenger list for each seat type
		List<Passenger> windowOdd = passengers.stream()
				.filter(p -> p.getSeat().getSeatLocation() == SeatLocation.WINDOW
						&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) % 2 != 0)
				.collect(Collectors.toList());

		// create the passenger list for each seat type
		List<Passenger> middleEven = passengers.stream()
				.filter(p -> p.getSeat().getSeatLocation() == SeatLocation.MIDDLE
						&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) % 2 == 0)
				.collect(Collectors.toList());

		// create the passenger list for each seat type
		List<Passenger> middleOdd = passengers.stream()
				.filter(p -> p.getSeat().getSeatLocation() == SeatLocation.MIDDLE
						&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) % 2 != 0)
				.collect(Collectors.toList());

		// create the passenger list for each seat type
		List<Passenger> aisleEven = passengers.stream()
				.filter(p -> p.getSeat().getSeatLocation() == SeatLocation.AISLE
						&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) % 2 == 0)
				.collect(Collectors.toList());

		// create the passenger list for each seat type
		List<Passenger> aisleOdd = passengers.stream()
				.filter(p -> p.getSeat().getSeatLocation() == SeatLocation.AISLE
						&& RowExtensions.getRowNumber(EObjectHelper.getParent(Row.class, p.getSeat())) % 2 != 0)
				.collect(Collectors.toList());

		// Get cabin
		Deck deck = EObjectHelper.getParent(Deck.class, passengers.get(0));

		// Depending on last row index,
		if (RowExtensions.getRowNumber(deck.getRows().get(deck.getRows().size() - 1)) % 2 == 0) {

			list.add(windowEven);
			list.add(windowOdd);
			list.add(middleEven);
			list.add(middleOdd);
			list.add(aisleEven);
			list.add(aisleOdd);

		} else {
			list.add(windowOdd);
			list.add(windowEven);
			list.add(middleOdd);
			list.add(middleEven);
			list.add(aisleOdd);
			list.add(aisleEven);
		}

		// Clear current passenger list
		passengers.clear();

		// Sort all lists by Letter and RTF
		for (List<Passenger> column : list) {

			column.sort(seatLetterComparator.thenComparing(frontToRearComparator.reversed()));
			passengers.addAll(column);
		}
	}
}