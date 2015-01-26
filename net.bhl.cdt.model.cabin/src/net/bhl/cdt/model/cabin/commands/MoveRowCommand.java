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
import net.bhl.cdt.model.cabin.util.FunctionLibrary;
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
	public MoveRowCommand(Cabin cabin, ArrayList<Row> rowList) {
		this.rowList = rowList;
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

		String rowString = "";
		if (rowList.size() > 1) {
			rowString = "s ";
		}
		int i = 1;
		for (Row row : rowList) {
			if (i == rowList.size()) {
				if (rowList.size() == 1) {
					rowString += " ";
				}
				rowString += row.getRowNumber();
			} else if (i == rowList.size() - 1) {
				rowString = rowString + row.getRowNumber() + " and ";
			} else {
				rowString = rowString + row.getRowNumber() + ", ";
			}
			i++;
		}

		GetInput input = new GetInput(
				WindowType.GET_INTEGER,
				"You decided to move row"
						+ rowString
						+ ". Therefore, please enter the translation value. All seats are then moved accordingly.",
				"Please enter digits only. The unit of the value is in centimeters.",
				IMessageProvider.INFORMATION);
		rowOffset = input.getIntegerValue();

		for (Row row : rowList) {
			for (Row compareRow : ModelHelper.getChildrenByClass(cabin,
					Row.class)) {
				if (row.getRowNumber() == compareRow.getRowNumber()) {
					for (Seat seat : compareRow.getSeats()) {
						seat.setYPosition(seat.getYPosition() + rowOffset);
					}
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