/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.math.RandomHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class is used for sorting the Passenger.class objects depending on
 * predefined criteria.
 * 
 * @author marc.engelmann
 *
 */

public class SortPassengersCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The show dialog. */
	private boolean showDialog = true;

	/** The value. */
	private int value = 0;

	/** The Constant INPUT_STRING. */
	private static final String INPUT_STRING = "Please choose a sorting algorithm. [0]: Random, [1]: RTF, [2]: FTR, [3]: WTA, [4]: WTA & RTF, [5]: WTA & FTR";

	/**
	 * Instantiates a new sort passengers command.
	 *
	 * @param cabin
	 *            the cabin
	 */
	public SortPassengersCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * Sets the properties manually.
	 *
	 * @param showDialog
	 *            the show dialog
	 * @param value
	 *            the value
	 */
	public void setPropertiesManually(boolean showDialog, int value) {
		this.showDialog = showDialog;
		this.value = value;
	}

	/**
	 * Return cabin.
	 *
	 * @return the cabin
	 */
	public Cabin returnCabin() {
		return cabin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.bhl.cdt.commands.CDTCommand#doRun()
	 */
	@Override
	protected synchronized void doRun() {

		CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();

		cabinViewPart.unsyncViewer();

		if (showDialog) {

			Input input = new Input(WindowType.OPTIONS, INPUT_STRING, IMessageProvider.INFORMATION);
			value = input.getIntegerValue();
		}

		EList<Passenger> paxList = cabin.getPassengers();

		Log.add(this, "Sorting passengers ...");

		/*
		 * The number of loops needs to be this high because the algorithm only
		 * compares two neighboring elements. In order to sort an element from
		 * the last to the first position, there are as much iterations needed
		 * as there are elements in the list.
		 */

		int numberOfLoops = cabin.getPassengers().size();

		int numberOfRows = ModelHelper.getChildrenByClass(cabin, Row.class).size();

		switch (value) {

		// Random
		case 0:
			for (int i = 0; i < paxList.size(); i++) {
				Passenger pax = paxList.get(i);
				paxList.move(RandomHelper.randomValue(0, paxList.size()), pax);
			}
			break;

		// Rear to front (RTF)
		case 1:
			for (int j = 0; j < numberOfLoops; j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger pax1 = paxList.get(i);
					Passenger pax2 = paxList.get(i + 1);
					if (pax1.getSeat().getXPosition() < pax2.getSeat().getXPosition()) {
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
					if (pax1.getSeat().getXPosition() > pax2.getSeat().getXPosition()) {
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
					if (AgentFunctions.otherSeatCloserToAisle(thisPax.getSeat(), otherPax.getSeat())) {
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
					if (AgentFunctions.otherSeatCloserToAisle(thisPax.getSeat(), otherPax.getSeat())) {
						if (thisPax.getSeat().getXPosition() < otherPax.getSeat().getXPosition()) {
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
					if (AgentFunctions.otherSeatCloserToAisle(thisPax.getSeat(), otherPax.getSeat())) {
						if (thisPax.getSeat().getXPosition() > otherPax.getSeat().getXPosition()) {
							paxList.move(i, otherPax);
						}
					}
				}
			}
			break;

		// Group/block boarding: create blocks with 10 rows each and distribute
		// the passengers randomly
		case 6:
			int blocks = (numberOfRows / 10);
			int paxPerBlock = numberOfLoops / blocks;
			for (int j = 0; j < numberOfLoops; j++) {
				for (int i = 0; i < paxList.size(); i++) {
					Passenger pax = paxList.get(i);

					paxList.move(RandomHelper.randomValue(0, paxList.size()), pax);
				}
			}
			break;

		// Steffen method: window every second row left and right
		case 7:
			for (int j = 0; j < numberOfLoops; j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger thisPax = paxList.get(i);
					Passenger otherPax = paxList.get(i + 1);
					if (AgentFunctions.otherSeatCloserToAisle(thisPax.getSeat(), otherPax.getSeat())) {
						if (thisPax.getSeat().getXPosition() > otherPax.getSeat().getXPosition()) {
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

		System.out.println("Sorting completed.");

		int counter = 1;

		for (Passenger pax : cabin.getPassengers()) {
			pax.setStartBoardingAfterDelay(calculateDelay(pax));
			pax.setId(counter);
			pax.setName(counter + "(" + pax.getSeat().getName() + ")");
			counter++;
		}

		for (Door door : cabin.getDoors()) {
			door.getWaitingPassengers().clear();
		}

		cabinViewPart.syncViewer();

		try {
			cabinViewPart.setCabin(cabin);
			Log.add(this, "Cabin view checked and updated");
		} catch (NullPointerException e) {
			Log.add(this, "No cabin view is visible!");
		}
	}

	/**
	 * Calculate delay.
	 *
	 * @param pax
	 *            the pax
	 * @return the double
	 */
	private synchronized double calculateDelay(Passenger pax) {
		double delay = 0;
		double clocking = cabin.getSimulationSettings().getPassengersBoardingPerMinute();

		pax.getDoor().getWaitingPassengers().add(pax);

		delay = (pax.getDoor().getWaitingPassengers().size() - 1) * 60.0 / clocking;

		return delay;
	}
}