/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.model.ui.CabinViewPart;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.paxelerate.util.Func;
import com.paxelerate.util.input.Input;
import com.paxelerate.util.input.Input.WindowType;
import com.paxelerate.util.math.RandomHelper;

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
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.paxelerate.model"));
	}

	public void setPropertiesManually(boolean showDialog, int value) {
		this.showDialog = showDialog;
		this.value = value;
	}

	public Cabin returnCabin() {
		return cabin;
	}

	@Override
	protected void doRun() {

		if (showDialog) {
			Input input = new Input(
					WindowType.OPTIONS,
					"Please choose a sorting algorithm. [0]: Random, [1]: RTF, [2]: FTR, [3]: WTA, [4]: WTA & RTF, [5]: WTA & FTR",
					IMessageProvider.INFORMATION);

			value = input.getIntegerValue();
		}
		EList<Passenger> paxList = cabin.getPassengers();

		System.out.println("Sorting passengers ...");

		switch (value) {

		case 0:
			for (int j = 0; j < paxList.size() / 10; j++) {
				for (int i = 0; i < paxList.size(); i++) {
					Passenger pax = paxList.get(i);

					paxList.move(RandomHelper.randomValue(0, paxList.size()),
							pax);
				}
			}
			break;
		case 2:
			for (int j = 0; j < paxList.size(); j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger pax1 = paxList.get(i);
					Passenger pax2 = paxList.get(i + 1);
					if (pax1.getSeatRef().getXPosition() > pax2.getSeatRef()
							.getXPosition()) {
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
					if (pax1.getSeatRef().getXPosition() < pax2.getSeatRef()
							.getXPosition()) {
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
						paxList.move(i, otherPax);
					}
				}
			}
			break;

		case 4:
			for (int j = 0; j < 3 * paxList.size(); j++) {
				for (int i = 0; i < paxList.size() - 1; i++) {
					Passenger thisPax = paxList.get(i);
					Passenger otherPax = paxList.get(i + 1);
					if (AgentFunctions.otherSeatCloserToAisle(
							thisPax.getSeatRef(), otherPax.getSeatRef())) {
						if (thisPax.getSeatRef().getXPosition() < otherPax
								.getSeatRef().getXPosition()) {
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

		for (Passenger pax : cabin.getPassengers()) {
			pax.setStartBoardingAfterDelay(calculateDelay(pax));
		}

		for (Door door : cabin.getDoors()) {
			door.getWaitingPassengers().clear();
		}

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.paxelerate.model.cabinview");

		try {
			cabinViewPart.setCabin(cabin);
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
					"Cabin view checked and updated"));
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
					"No cabin view is visible!"));
		}
	}

	private double calculateDelay(Passenger pax) {
		double delay = 0;
		double clocking = cabin.getSimulationSettings()
				.getPassengersBoardingPerMinute();

		pax.getDoor().getWaitingPassengers().add(pax);

		delay = (pax.getDoor().getWaitingPassengers().size() - 1) * 60.0
				/ (double) clocking;

		return delay;
	}
}