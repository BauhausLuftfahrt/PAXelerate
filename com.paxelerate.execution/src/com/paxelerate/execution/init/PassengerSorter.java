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

//	/**
//	*
//	*/
//	private static void sortMilneKelly(EList<Passenger> passengers) {
//		milneAndKelly(passengers);
//		int[][] cabinMap = new int[seatAbrest][numberOfRows];
//		LuggageDistribution.luggageDistributionToConsole(cabinMap);
//		sortSteffen(passengers);
//	}
//
//	/**
//	 *
//	 * @param paxList
//	 */
//	private static void milneAndKelly(EList<Passenger> paxList) {
//
//		Cabin cabin = CabinExtensions.getBy(paxList.get(0));
//
//		int numberOfRows =
//
//		// check maximum seat abreast
//		int seatAbrest = 0;
//		for (int i = 0; i < numberOfRows; i++) {
//			if (CabinFunctions.checkSeatAbrest(paxList.get(i).getSeat()) > seatAbrest) {
//				seatAbrest = CabinFunctions.checkSeatAbrest(paxList.get(i).getSeat());
//			}
//		}
//
//		// Array with number of Hand Luggage in first column and assignment
//		int numberOfColumns = seatAbrest;
//		int[] handLuggage = new int[paxList.size()];
//
//		// number of bags per row
//		int[] numberOfBagsInRow = new int[numberOfRows];
//
//		/*
//		 * TODO STEP 1 - construct array with max bags and list of PAX - number of PAX
//		 * with a lot of bags divided by rows - rest - spread evenly - check number of
//		 * zero spots in rows, if they are available, fill them with second largest -
//		 * continue until end
//		 */
//
//		// determines max bags
//		int maxLuggage = 0;
//		for (int i = 0; i < paxList.size(); i++) {
//			handLuggage[i] = paxList.get(i).getLuggage().size();
//			if (paxList.get(i).getLuggage().size() > maxLuggage) {
//				maxLuggage = paxList.get(i).getLuggage().size();
//			}
//		}
//
//		// initializes cabin
//		int[][] cabin = new int[numberOfColumns][numberOfRows];
//		// if seat is not jet assigned with a number of bags its value is 0
//		for (int row = 0; row < numberOfRows; row++) {
//			for (int column = 0; column < numberOfColumns; column++) {
//				// mark cabin positions with no seats in 9 abreast cabin
//				if (seatAbrest == 9 && nineAbreast300pax && row == numberOfRows - 1 && (column < 3 ^ column > 5)) {
//					cabin[column][row] = 100;
//				} else
//					cabin[column][row] = 0;
//			}
//		}
//
//		int column = 0;
//		int numberOfUnassignedRows = numberOfRows;
//		if (nineAbreast300pax) {
//			numberOfUnassignedRows = numberOfRows - 1;
//		}
//		int[] unasignedRows = new int[numberOfUnassignedRows];
//		for (int row = 0; row < numberOfRows; row++) {
//			if (cabin[column][row] == 0) {
//				unasignedRows[row] = row;
//			}
//		}
//		// start with highest number of bags
//		for (int bagPieces = maxLuggage; bagPieces > 0; bagPieces--) {
//			// determines number of PAX with that number of bags
//			int numberOfUnassignedPaxCarryKBags = 0;
//			for (int pax = 0; pax < paxList.size(); pax++) {
//				if (handLuggage[pax] == bagPieces)
//					numberOfUnassignedPaxCarryKBags++;
//			}
//
//			while (numberOfUnassignedPaxCarryKBags > 0) {
//				// check column empty
//				if (unasignedRows.length == numberOfRows) {
//					if (numberOfUnassignedPaxCarryKBags >= unasignedRows.length) {
//						// update unassigned rows
//						unasignedRows = new int[numberOfUnassignedRows];
//						int i = 0;
//						for (int row = 0; row < numberOfRows; row++) {
//							if (cabin[column][row] == 0) {
//								unasignedRows[i] = row;
//								i++;
//							}
//						}
//						// fill entire column
//						for (int row = unasignedRows.length - 1; row >= 0; row--) {
//							cabin[column][row] = bagPieces;
//							numberOfUnassignedPaxCarryKBags--;
//							numberOfBagsInRow[row] = numberOfBagsInRow[row] + bagPieces;
//						}
//						column++;
//						numberOfUnassignedRows = numberOfRows;
//					} else {
//						// update unassigned rows
//						unasignedRows = new int[numberOfUnassignedRows];
//						int i = 0;
//						for (int row = 0; row < numberOfRows; row++) {
//							if (cabin[column][row] == 0) {
//								unasignedRows[i] = row;
//								i++;
//							}
//						}
//						// spread bags evenly
//						double distance = (double) unasignedRows.length
//								/ (double) (numberOfUnassignedPaxCarryKBags + 1);
//						boolean alternating = false;
//						int toAsign = (int) distance;
//						while (numberOfUnassignedPaxCarryKBags > 0) {
//							if (alternating) {
//								cabin[column][toAsign] = bagPieces;
//								numberOfBagsInRow[toAsign] = numberOfBagsInRow[toAsign] + bagPieces;
//								numberOfUnassignedRows--;
//								numberOfUnassignedPaxCarryKBags--;
//							} else {
//								cabin[column][toAsign] = bagPieces;
//								numberOfBagsInRow[toAsign] = numberOfBagsInRow[toAsign] + bagPieces;
//								numberOfUnassignedRows--;
//								numberOfUnassignedPaxCarryKBags--;
//							}
//							if (alternating) {
//								if (toAsign + distance + 1 < numberOfRows - 1) {
//									toAsign = toAsign + (int) distance + 1;
//									alternating = false;
//								} else {
//									toAsign++;
//								}
//							} else {
//								if (toAsign + distance < numberOfRows - 1) {
//									toAsign = toAsign + (int) distance;
//									if (distance >= 0.5 + (int) distance && distance != (int) distance) {
//										alternating = true;
//									}
//								} else {
//									toAsign++;
//								}
//							}
//						}
//						// update unassigned rows
//						unasignedRows = new int[numberOfUnassignedRows];
//						int j = 0;
//						for (int row = 0; row < numberOfRows; row++) {
//							if (cabin[column][row] == 0) {
//								unasignedRows[j] = row;
//								j++;
//							}
//						}
//					}
//				}
//				// column not empty
//				else {
//					if (numberOfUnassignedPaxCarryKBags >= unasignedRows.length) {
//						// fill up column
//						for (int i = 0; i < unasignedRows.length; i++) {
//							int row = unasignedRows[i];
//							cabin[column][row] = bagPieces;
//							numberOfUnassignedPaxCarryKBags--;
//							numberOfBagsInRow[row] = numberOfBagsInRow[row] + bagPieces;
//						}
//						column++;
//						if (nineAbreast300pax && (column < 3 ^ column > 5)) {
//							numberOfUnassignedRows = numberOfRows - 1;
//						} else {
//							numberOfUnassignedRows = numberOfRows;
//						}
//
//					} else {
//						// spread bags evenly
//						double distance = (double) unasignedRows.length
//								/ (double) (numberOfUnassignedPaxCarryKBags + 1);
//						int toAsign = (int) distance;
//						boolean alternating = true;
//						while (numberOfUnassignedPaxCarryKBags > 0) {
//							if (cabin[column][toAsign] == 0) {
//								// place luggage here
//								cabin[column][toAsign] = bagPieces;
//								numberOfUnassignedPaxCarryKBags--;
//								numberOfBagsInRow[toAsign] = numberOfBagsInRow[toAsign] + bagPieces;
//								numberOfUnassignedRows--;
//								if (alternating) {
//									if (toAsign + distance + 1 < numberOfRows - 1) {
//										toAsign = toAsign + (int) distance + 1;
//										alternating = false;
//									} else {
//										toAsign++;
//									}
//								} else {
//									if (toAsign + distance < numberOfRows - 1) {
//										toAsign = toAsign + (int) distance;
//										if (distance != (int) distance && distance >= 0.5 + (int) distance) {
//											alternating = true;
//										}
//									} else {
//										toAsign++;
//									}
//								}
//							} else {
//								// go one +1 row to the back
//								toAsign++;
//							}
//						}
//					}
//					// update unassigned rows
//					unasignedRows = new int[numberOfUnassignedRows];
//					int i = 0;
//					for (int row = 0; row < numberOfRows; row++) {
//						if (cabin[column][row] == 0) {
//							unasignedRows[i] = row;
//							i++;
//						}
//					}
//				}
//			}
//		}
//
//		/*
//		 * TODO STEP 2 - sort PAX in row decreasing by HL - row 1: assign first left,
//		 * second right,... - row 2: assign first right, second left,...
//		 */
//
//		// sort array in row decreasing by HL
//		for (int row = 0; row < numberOfRows; row++) {
//			if (nineAbreast300pax && row == numberOfRows - 1) {
//				// leave last row unsorted
//			} else {
//				for (int col = 0; col < numberOfColumns - 1; col++) {
//					for (int otherCol = col; otherCol < numberOfColumns; otherCol++) {
//						if (cabin[col][row] != 100) {
//							if (cabin[col][row] < cabin[otherCol][row]) {
//								int store = cabin[otherCol][row];
//								cabin[otherCol][row] = cabin[col][row];
//								cabin[col][row] = store;
//							}
//						}
//					}
//				}
//			}
//		}
//
//		// loop through all rows
//		for (int row = 0; row < numberOfRows; row++) {
//			boolean alternating = true;
//			// alternate left right
//			if (row % 2 == 0) {
//				alternating = true;
//			} else {
//				alternating = false;
//			}
//			// loop through all columns
//			if (nineAbreast300pax && row == numberOfRows - 1) {
//				// leave last row unsorted
//			} else {
//				int count = 1;
//				for (int col = 0; col < (double) numberOfColumns / 2; col++) {
//					if (cabin[col][row] != 100) {
//						if (alternating) {
//							// int store=cabin[col][row];
//							for (int col2 = col; col2 < numberOfColumns - count; col2++) {
//								int store1 = cabin[col2][row];
//								cabin[col2][row] = cabin[col2 + 1][row];
//								cabin[col2 + 1][row] = store1;
//								alternating = true;
//							}
//							// cabin[numberOfColumns-col-1][row]=store;
//							count++;
//						} else {
//							alternating = true;
//						}
//					}
//				}
//			}
//			// determine numberOfBagsLeft and Right
//			int numberOfBagsLeft = 0;
//			int numberOfBagsRight = 0;
//			for (int col = 0; col < numberOfColumns; col++) {
//				if (col < numberOfColumns / 2) {
//					numberOfBagsLeft = numberOfBagsLeft + cabin[col][row];
//				}
//				if (numberOfColumns % 2 == 0 && col >= numberOfColumns / 2) {
//					numberOfBagsRight = numberOfBagsRight + cabin[col][row];
//				}
//				if (col > numberOfColumns / 2 && numberOfColumns % 2 != 0) {
//					numberOfBagsRight = numberOfBagsRight + cabin[col][row];
//				}
//			}
//			// check even balance Left/Right
//			if (numberOfBagsLeft > numberOfBagsRight ^ numberOfBagsRight > numberOfBagsLeft) {
//				boolean alternate = false;
//				if (numberOfBagsLeft > numberOfBagsRight + 1) {
//					// switch two elements nearest to the middle != 0
//					boolean firstTime = true;
//					int store = 0;
//					int storeColNumber = 0;
//					for (int col = 0; col < numberOfColumns; col++) {
//						if (cabin[col][row] == 0 && firstTime) {
//							store = cabin[col - 1][row];
//							storeColNumber = col - 1;
//							firstTime = false;
//						}
//						if (!firstTime && cabin[col][row] != 0) {
//							cabin[storeColNumber][row] = cabin[col - 1][row];
//							cabin[col - 1][row] = store;
//							numberOfBagsRight++;
//						}
//					}
//				}
//				if (numberOfBagsRight > numberOfBagsLeft + 1) {
//					// switch two elements nearest to the middle != 0
//					boolean firstTime = true;
//					int store = 0;
//					int storeColNumber = 0;
//					for (int col = 0; col < numberOfColumns; col++) {
//						if (cabin[col][row] == 0 && firstTime) {
//							store = cabin[col - 1][row];
//							storeColNumber = col - 1;
//							firstTime = false;
//						}
//						if (!firstTime && cabin[col][row] != 0) {
//							cabin[storeColNumber][row] = cabin[col - 1][row];
//							cabin[col - 1][row] = store;
//							numberOfBagsLeft++;
//						}
//					}
//				} else if (alternate) {
//					// switch two elements nearest to the middle != 0
//					boolean firstTime = true;
//					int store = 0;
//					int storeColNumber = 0;
//					for (int col = 0; col < numberOfColumns; col++) {
//						if (cabin[col][row] == 0 && firstTime) {
//							store = cabin[col - 1][row];
//							storeColNumber = col - 1;
//							firstTime = false;
//						}
//						if (!firstTime && cabin[col][row] != 0) {
//							cabin[storeColNumber][row] = cabin[col - 1][row];
//							cabin[col - 1][row] = store;
//						}
//					}
//					alternate = false;
//				} else
//					alternate = true;
//				// check middle seat in middle section empty
//				if (numberOfColumns % 2 != 0) {
//					if (cabin[numberOfColumns / 2][row] != 0
//							&& (cabin[numberOfColumns / 2 + 1][row] == 0 || cabin[numberOfColumns / 2 - 1][row] == 0)) {
//						if (cabin[numberOfColumns / 2 - 1][row] == 0) {
//							// swap with middle seat
//							if (cabin[numberOfColumns / 2 + 1][row] == 0) {
//								if (numberOfBagsLeft > numberOfBagsRight) {
//									cabin[numberOfColumns / 2 + 1][row] = cabin[numberOfColumns / 2][row];
//									cabin[numberOfColumns / 2][row] = 0;
//								} else {
//									cabin[numberOfColumns / 2 - 1][row] = cabin[numberOfColumns / 2][row];
//									cabin[numberOfColumns / 2][row] = 0;
//								}
//							} else {
//								cabin[numberOfColumns / 2 - 1][row] = cabin[numberOfColumns / 2][row];
//								cabin[numberOfColumns / 2][row] = 0;
//							}
//						} else {
//							cabin[numberOfColumns / 2 + 1][row] = cabin[numberOfColumns / 2][row];
//							cabin[numberOfColumns / 2][row] = 0;
//						}
//					}
//				}
//			}
//		}
//		// print luggage distribution
//		System.out.println();
//		for (int x = 0; x < numberOfRows; x++) {
//			for (int y = 0; y < numberOfColumns; y++) {
//				System.out.print(cabin[y][x] + " ");
//			}
//			System.out.println();
//		}
//
//		// define seat list
//		EList<Seat> seatList = new BasicEList<Seat>();
//		for (int pax = 0; pax < paxList.size(); pax++) {
//			seatList.add(paxList.get(pax).getSeat());
//		}
//
//		// assign passengers to seats
//		Seat seat = null;
//		EList<Passenger> paxListHelp = new BasicEList<Passenger>();
//		paxListHelp.addAll(paxList);
//		EList<Passenger> paxListNew = new BasicEList<Passenger>();
//		// loop through all rows
//		for (int row = 0; row < numberOfRows; row++) {
//			// loop through all columns
//			for (int col = 0; col < numberOfColumns; col++) {
//				// loop through pasenger list
//				if (cabin[col][row] != 100) {
//					// no passenger assigned to this spot
//					boolean notAsigned = true;
//					for (int paxID = 0; paxID < paxListHelp.size(); paxID++) {
//						Passenger pax = paxListHelp.get(paxID);
//						// search for a passenger who has the amount of luggage
//						// placed at this seat
//						if (cabin[col][row] == pax.getLuggage().size() && notAsigned) {
//							// get seat object at current cabin position
//							for (int seatID = 0; seatID < seatList.size(); seatID++) {
//								if (seatList.get(seatID).getPassenger().getSeat().getId() == row + col && notAsigned) {
//									seat = seatList.get(seatID);
//									seat.setPassenger(pax);
//									paxListHelp.remove(pax);
//									paxListNew.add(pax);
//									seatList.remove(seat);
//									notAsigned = false;
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		// sort paxList
//		for (int o = 0; o < paxListNew.size(); o++) {
//			Passenger pax1 = paxListNew.get(o);
//			for (int p = 0; p < paxList.size(); p++) {
//				Passenger pax2 = paxList.get(p);
//				if (pax1.getSeat().getId() == pax2.getSeat().getId()) {
//					paxList.move(o, pax2);
//				}
//			}
//		}
//	}
}