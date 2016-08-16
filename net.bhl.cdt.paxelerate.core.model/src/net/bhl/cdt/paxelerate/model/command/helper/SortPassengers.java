/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.command.helper;

import org.eclipse.emf.common.util.EList;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.util.math.RandomHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class is used for sorting the Passenger.class objects depending on
 * predefined criteria.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 * @since 0.5
 *
 */

public class SortPassengers {

	private EList<Passenger> paxList;
	private int numberOfLoops;
	private int numberOfRows;
	private int sortingScheme;

	public SortPassengers(EList<Passenger> paxList, int sortingScheme,
			int numberOfLoops, int numberOfRows) {
		this.paxList = paxList;
		this.numberOfLoops = numberOfLoops;
		this.numberOfRows = numberOfRows;
		this.sortingScheme = sortingScheme;
	}

	public EList<Passenger> performSortPassengers() {
		/*
		 * The number of loops needs to be this high because the algorithm only
		 * compares two neighboring elements. In order to sort an element from
		 * the last to the first position, there are as much iterations needed
		 * as there are elements in the list.
		 */

		synchronized (paxList) {
			switch (sortingScheme) {

			// Random
			case 0:

				for (int i = 0; i < numberOfLoops; i++) {
					Passenger pax = paxList.get(i);
					paxList.move(RandomHelper.randomValue(0, paxList.size()),
							pax);
				}
				break;

			// Rear to front (RTF)
			case 1:
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size() - 1; i++) {
						Passenger pax1 = paxList.get(i);
						Passenger pax2 = paxList.get(i + 1);
						if (pax1.getSeat().getXPosition() < pax2.getSeat()
								.getXPosition()) {
							paxList.move(i, pax2);
						}
					}
				}
				break;

			// Front to rear (FTR)
			case 2:
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size() - 1; i++) {
						Passenger pax1 = paxList.get(i);
						Passenger pax2 = paxList.get(i + 1);
						if (pax1.getSeat().getXPosition() > pax2.getSeat()
								.getXPosition()) {
							paxList.move(i, pax2);
						}
					}
				}
				break;

			// Window to aisle (WTA)
			case 3:
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size() - 1; i++) {
						Passenger thisPax = paxList.get(i);
						Passenger otherPax = paxList.get(i + 1);
						if (AgentFunctions.otherSeatCloserToAisle(
								thisPax.getSeat(), otherPax.getSeat())) {
							paxList.move(i, otherPax);
						}
					}
				}
				break;

			// Window to aisle and rear to front (WTA + RTF)
			case 4:
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size() - 1; i++) {
						Passenger thisPax = paxList.get(i);
						Passenger otherPax = paxList.get(i + 1);
						if (AgentFunctions.otherSeatCloserToAisle(
								thisPax.getSeat(), otherPax.getSeat())) {
							if (thisPax.getSeat().getXPosition() < otherPax
									.getSeat().getXPosition()) {
								paxList.move(i, otherPax);
							}
						}
					}
				}
				break;

			// Window to aisle and front to rear (WTA + FTR)
			case 5:
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size() - 1; i++) {
						Passenger thisPax = paxList.get(i);
						Passenger otherPax = paxList.get(i + 1);
						if (AgentFunctions.otherSeatCloserToAisle(
								thisPax.getSeat(), otherPax.getSeat())) {
							if (thisPax.getSeat().getXPosition() > otherPax
									.getSeat().getXPosition()) {
								paxList.move(i, otherPax);
							}
						}
					}
				}
				break;

			// Group/block boarding: create blocks with 10 rows each and
			// distribute
			// the passengers randomly
			case 6:
				int blocks = (numberOfRows / 10);
				int paxPerBlock = numberOfLoops / blocks;
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size(); i++) {
						Passenger pax = paxList.get(i);

						paxList.move(
								RandomHelper.randomValue(0, paxList.size()),
								pax);
					}
				}
				break;

			// Steffen method: window every second row left and right
			case 7:
				for (int j = 0; j < numberOfLoops; j++) {
					for (int i = 0; i < paxList.size() - 1; i++) {
						Passenger thisPax = paxList.get(i);
						Passenger otherPax = paxList.get(i + 1);
						if (AgentFunctions.otherSeatCloserToAisle(
								thisPax.getSeat(), otherPax.getSeat())) {
							if (thisPax.getSeat().getXPosition() > otherPax
									.getSeat().getXPosition()) {
								// TODO:
							}
						}
					}
				}
				break;

			// Milne/Kelly method: based on number of carried bags
			case 8:
				// TODO
				break;

			default:
				Log.add(this, "Wrong Input!");
				break;
			}
		}

		return paxList;
	}

}