/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.command.helper.RefreshCabinView;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.PropertyViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.1
 * @since 0.5
 *
 */

public class RefreshCabinViewCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The error strings. */
	private ArrayList<String> errorStrings = new ArrayList<String>();

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public RefreshCabinViewCommand(final Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected final void doRun() {
		
		
		int countedPax = 0;
		for (TravelClass tc : cabin.getClasses()) {
			countedPax += tc.getPassengers();
		}

		if (countedPax != cabin.getPassengers().size()) {
			new GeneratePassengersCommand(cabin).doRun();
		}

		SimulationProperties settings = cabin.getSimulationSettings();

		if (settings == null) {
			System.out.println("no settings found!");
			settings = CabinFactory.eINSTANCE.createSimulationProperties();
			cabin.setSimulationSettings(settings);

		}

		LuggageProperties luggageSettings = cabin.getSimulationSettings().getLuggageProperties();

		if (luggageSettings == null) {
			luggageSettings = CabinFactory.eINSTANCE.createLuggageProperties();
			cabin.getSimulationSettings().setLuggageProperties(luggageSettings);
		}

		PassengerProperties paxSettings = cabin.getSimulationSettings().getPassengerProperties();

		if (paxSettings == null) {
			paxSettings = CabinFactory.eINSTANCE.createPassengerProperties();
			cabin.getSimulationSettings().setPassengerProperties(paxSettings);
		}

		int count = 1;
		for (TravelClass tc : cabin.getClasses()) {
			if (tc.getName().isEmpty()) {
				tc.setName(StringHelper.splitCamelCase(tc.getTravelOption().getName()) + " #" + count);
			}
			count++;
		}

		errorStrings = new RefreshCabinView(cabin).performCabinViewRefresh();
		for (String str : errorStrings) {
			Log.add(this, str);
		}
		
		PropertyViewPart propertyViewPart = ViewPartHelper.getPropertyView();
		if (propertyViewPart != null) {
			try {
				propertyViewPart.updateUI(cabin);
			} catch (NullPointerException e) {
				Log.add(this, "NullPointerException: No property view is visible!");
				e.printStackTrace();
			}
		}

		CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();
		if (cabinViewPart != null) {
			try {
				cabinViewPart.setCabin(cabin);
				Log.add(this, "Cabin view checked and updated_1");
			} catch (NullPointerException e) {
				Log.add(this, "NullPointerException: No cabin view is visible!");
				e.printStackTrace();
			}
		}

		/* This stores the cabin as an .XMI file into the local storage. */
		// TODO: DEACTIVATED
		// EMFModelStore.store(cabin);

		// HeatmapPart heatmap = ViewPartHelper.getHeatView();
		// heatmap.setCabin(cabin);
	}
}