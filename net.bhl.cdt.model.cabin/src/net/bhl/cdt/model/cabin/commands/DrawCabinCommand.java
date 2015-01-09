/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * This class refreshed the cabin view without modifying anything.
 * @author marc.engelmann
 *
 */

public class DrawCabinCommand extends CDTCommand {

	private Cabin cabin;
	private ILog logger;
	private CabinViewPart cabinViewPart;

	/**
	 * This method is the constructor.
	 * @param cabin the cabin
	 */
	public DrawCabinCommand(Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));

	}

	
	/**
	 *This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected void doRun() {

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		
		try {
		cabinViewPart.setCabin(cabin);
		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"Cabin view updated"));
		} 
		catch(NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"No cabin view is visible!"));
		}
	}
}