/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.agent.AgentFunctions;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Input;
import net.bhl.cdt.model.cabin.util.Input.WindowType;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class SortPassengersCommand extends CDTCommand {

	private Cabin cabin;
	private ILog logger;
	private CabinViewPart cabinViewPart;
	private boolean showDialog = true;
	private int value = 0;

	public SortPassengersCommand(Cabin cabin) {

		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
	}

	public void setPropertiesManually(boolean showDialog, int value) {
		this.showDialog = showDialog;
		this.value = value;
	}

	@Override
	protected void doRun() {

		if (showDialog) {
			Input input = new Input(
					WindowType.OPTIONS,
					"Please choose a sorting algorithm. [0]: Random, [1]: R->F, [2]: F->R, [3]: Window to aisle & R->F, [4]: Window to aisle & F->R",
					IMessageProvider.INFORMATION);

			value = input.getIntegerValue();
		}
		EList<Passenger> paxList = cabin.getPassengers();

		System.out.println("Sorting passengers ...");

		switch (value) {

		case 0:
			for (int j = 0; j < paxList.size(); j++) {
				for (int i = 0; i < paxList.size(); i++) {
					Passenger pax = paxList.get(i);

					paxList.move(FuncLib.randomValue(0, paxList.size()), pax);
				}
			}
			break;
		case 2:
			for (int j = 0; j < paxList.size(); j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger pax1 = paxList.get(i);
					Passenger pax2 = paxList.get(i + 1);
					if (pax1.getSeatRef().getYPosition() > pax2.getSeatRef()
							.getYPosition()) {
						paxList.move(i, pax2);
					}
				}
			}
			break;
		case 1:
			for (int j = 0; j < paxList.size(); j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger pax1 = paxList.get(i);
					Passenger pax2 = paxList.get(i + 1);
					if (pax1.getSeatRef().getYPosition() < pax2.getSeatRef()
							.getYPosition()) {
						paxList.move(i, pax2);
					}
				}
			}
			break;

		case 3:
			for (int j = 0; j < 3 * paxList.size(); j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger thisPax = paxList.get(i);
					Passenger otherPax = paxList.get(i + 1);
					if (AgentFunctions.otherSeatCloserToAisle(
							thisPax.getSeatRef(), otherPax.getSeatRef())) {
						if (thisPax.getSeatRef().getYPosition() < otherPax
								.getSeatRef().getYPosition()) {
							paxList.move(i, otherPax);
						}
					}
				}
			}
			break;

		default:
			break;
		}

		System.out.println("Sorting completed.");

		double passengersPerMinute = 30;
		int i = 0;
		for (Passenger pax : cabin.getPassengers()) {
			pax.setStartBoardingAfterDelay(i * 60 / passengersPerMinute);
			i++;
		}

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");

		try {
			cabinViewPart.setCabin(cabin);
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"Cabin view checked and updated"));
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"No cabin view is visible!"));
		}
	}
}