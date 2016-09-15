/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.model.command.helper.CloneObject;
import net.bhl.cdt.paxelerate.model.command.helper.SortPassengers;
import net.bhl.cdt.paxelerate.ui.helper.Input;
import net.bhl.cdt.paxelerate.ui.helper.Input.WindowType;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.math.RandomHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class is used for sorting the Passenger.class objects depending on
 * predefined criteria.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
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
	public SortPassengersCommand(final Cabin cabin) {
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
	public final void setPropertiesManually(final boolean showDialog, final int value) {
		this.showDialog = showDialog;
		this.value = value;
	}

	/**
	 * Return cabin.
	 *
	 * @return the cabin
	 */
	public final Cabin returnCabin() {
		return cabin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.bhl.cdt.commands.CDTCommand#doRun()
	 */
	@Override
	protected final synchronized void doRun() {

		CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();

		if (cabinViewPart != null) {
			try {
				cabinViewPart.unsyncViewer();
			} catch (NullPointerException e) {
				Log.add(this, "NullPointerException: No cabin view is visible!");
				e.printStackTrace();
			}
		}

		if (showDialog) {

			Input input = new Input(WindowType.OPTIONS, INPUT_STRING, IMessageProvider.INFORMATION);
			value = input.getIntegerValue();
		}

		EList<Passenger> paxList = cabin.getPassengers();

		Log.add(this, "Sorting passengers ...");

		int numberOfLoops = cabin.getPassengers().size();
		int numberOfRows = ModelHelper.getChildrenByClass(cabin, Row.class).size();

		// TODO: where is the paxList returned to the cabin object?
		paxList = new SortPassengers(paxList, value, numberOfLoops, numberOfRows).performSortPassengers();

		Log.add(this, "Sorting completed.");

		int counter = 1;
		
		/*the passenger,whose seat is located between the front-door and the rear-door,board through the 
		 * front-door. The other passenger board through rear-door*/
//		int frontDoorPos = cabin.getDoors().get(0).getXPosition();
//		int rearDoorPos = cabin.getDoors().get(1).getXPosition();
		

		for (Passenger pax : cabin.getPassengers()) {
			
			pax.setStartBoardingAfterDelay(calculateDelay(pax));
			pax.setId(counter);
			pax.setName(counter + "(" + pax.getSeat().getName() + ")");
		
			/*the passenger,whose seat is located between the front-door and th rear-door,board through the 
			 * front-door. The other passenger board through rear-door*/
//			int seatPos = pax.getSeat().getXPosition();
//				
//				if(frontDoorPos <= seatPos && seatPos <= rearDoorPos){
//					pax.setDoor(cabin.getDoors().get(0));
//				}else if(rearDoorPos <= seatPos){
//					pax.setDoor(cabin.getDoors().get(1));
//				}else{}
				
			counter++;
		}

		for (Door door : cabin.getDoors()) {
			door.getWaitingPassengers().clear();
		}

		if (cabinViewPart != null) {
			try {
				cabinViewPart.syncViewer();
			} catch (NullPointerException e) {
				Log.add(this, "NullPointerException: No cabin view is visible!");
				e.printStackTrace();
			}
		}

		try {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					if (cabinViewPart != null) {
						cabinViewPart.setCabin(cabin);
						Log.add(this, "Cabin view checked and updated");
					}
				}
			});

		} catch (NullPointerException e) {
			Log.add(this, "NullPointerException: No cabin view is visible!");
			e.printStackTrace();
		}
	}

	/**
	 * Calculate delay.
	 *
	 * @param pax
	 *            the pax
	 * @return the double
	 */
	private synchronized double calculateDelay(final Passenger pax) {
		double delay = 0;
		double clocking = cabin.getSimulationSettings().getPassengersBoardingDoor();

		pax.getDoor().getWaitingPassengers().add(pax);

		delay = (pax.getDoor().getWaitingPassengers().size() - 1) * 60.0 / clocking;

		return delay;
	}
}