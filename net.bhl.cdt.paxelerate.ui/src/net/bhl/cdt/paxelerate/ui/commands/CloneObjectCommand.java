/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.command.helper.CloneObject;
import net.bhl.cdt.paxelerate.ui.helper.Input;
import net.bhl.cdt.paxelerate.ui.helper.Input.WindowType;

/**
 * The Class CloneObjectCommand.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */

public class CloneObjectCommand extends CDTCommand {

	/** The row. */
	private Row row;

	/**
	 * Instantiates a new clone object command.
	 *
	 * @param obj
	 *            the obj
	 */
	public CloneObjectCommand(final Object obj) {

		if (obj instanceof Row) {
			row = (Row) obj;
		}

	}

	/**
	 * This method executed the right click command.
	 */
	@Override
	protected final void doRun() {

		Input input = new Input(WindowType.CLONE_OBJECT, "Enter the number of rows you want to add (integer values).",
				IMessageProvider.INFORMATION);

		int numberOfRows = input.getIntegerValue();

		TravelClass travelclass = ModelHelper.getParent(TravelClass.class, row);
		Cabin cabin = ModelHelper.getParent(Cabin.class, row);
		
		new CloneObject(travelclass, numberOfRows).performCloneObject();

		new RefreshCabinViewCommand(cabin).execute();

	}

}
