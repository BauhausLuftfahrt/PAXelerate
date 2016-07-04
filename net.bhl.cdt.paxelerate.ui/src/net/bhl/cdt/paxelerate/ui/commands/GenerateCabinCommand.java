/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.command.helper.GenerateCabin;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * This script is used to build up the cabin according to predefined settings.
 * 
 * @author marc.engelmann
 * @version 1.3
 * @since 0.5
 *
 */

public class GenerateCabinCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/**
	 * Creates a cabin.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public GenerateCabinCommand(final Cabin cabin) {
		this.cabin = cabin;
		if (cabin.getSimulationSettings().isUsePresetSettings()) {
			switch (cabin.getAircraftType()) {
			case REGIONAL:
				cabin.setYDimension(300);
				cabin.setXDimension(2000);
				break;
			case NARROWBODY:
				cabin.setYDimension(364);
				cabin.setXDimension(2460);
				break;
			case WIDEBODY:
				cabin.setYDimension(650);
				cabin.setXDimension(4440);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * This method generates the cabin structure with the help of the
	 * construction library. This is the main function of the generate cabin
	 * command.
	 */
	@Override
	protected final void doRun() {

		Log.add(this, "Initializing cabin generation ...");

		CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();
		cabinViewPart.unsyncViewer();

		Input input = new Input(WindowType.GET_BOOLEAN, "Warning! The existing cabin will be deleted. Continue?",
				IMessageProvider.WARNING);

		if (input.getBooleanValue()) {

			new GenerateCabin(cabin).performGenerateCabin();;
			Log.add(this, "Cabin generation completed");
			new RefreshCabinViewCommand(cabin).doRun();
			cabinViewPart.syncViewer();

		} else {
			Log.add(this, "Cabin generation aborted");
		}
	}

}
