/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.util.GetInput;
import net.bhl.cdt.model.cabin.util.GetInput.WindowType;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class MoveRowCommand extends CDTCommand {

	private Cabin cabin;
	private Row row;
	private ILog logger;
	private CabinViewPart cabinViewPart;
	private int rowOffset;
	ArrayList<Row> rowList = null;

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public MoveRowCommand(Row row, Cabin cabin, ArrayList<Row> rowList) {
		this.rowList = rowList;
		this.row = row;
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected void doRun() {

		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */

		GetInput input = new GetInput(
				WindowType.GET_INTEGER,
				"You decided to move row #"
						+ row.getRowNumber()
						+ " . Therefore, please enter the translation value. All seats in the row are then moved accordingly.",
				"Please enter digits only. The unit of the value is cm", IMessageProvider.INFORMATION);
		rowOffset = input.getIntegerValue();

		for (Row compareRow : ModelHelper.getChildrenByClass(cabin, Row.class)) {
			//for(Row compare2Row)
			if (row.getRowNumber() == compareRow.getRowNumber()) {
				for (Seat seat : compareRow.getSeats()) {
					seat.setYPosition(seat.getYPosition() + rowOffset);
				}
			}
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