/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.command.helper.CloneObject;
import net.bhl.cdt.paxelerate.model.command.helper.MoveObject;
import net.bhl.cdt.paxelerate.ui.helper.Input;
import net.bhl.cdt.paxelerate.ui.helper.Input.WindowType;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */

public class MoveObjectCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The scale vector. */
	private Vector movementVector, scaleVector;

	/** The rowlist. */
	private ArrayList<Row> rowlist = new ArrayList<Row>();

	/** The seatlist. */
	private ArrayList<Seat> seatlist = new ArrayList<Seat>();

	/** The galleylist. */
	private ArrayList<Galley> galleylist = new ArrayList<Galley>();

	/** The lavatorylist. */
	private ArrayList<Lavatory> lavatorylist = new ArrayList<Lavatory>();

	/** The curtainlist. */
	private ArrayList<Curtain> curtainlist = new ArrayList<Curtain>();

	/**
	 * This command gets all physical object elements that are selected by the
	 * user, submits it via lists and performs the manipulation of the
	 * corresponding object inside the cabin element.
	 * 
	 * @param cabin
	 *            is the cabin
	 * @param rowlist
	 *            is the list of row objects
	 * @param seatlist
	 *            is the list of seat objects
	 * @param galleylist
	 *            is the list of galley objects
	 * @param lavatorylist
	 *            is the list of lavatory objects
	 * @param curtainlist
	 *            is the list of curtain objects
	 */
	public MoveObjectCommand(final Cabin cabin, final ArrayList<Row> rowlist, final ArrayList<Seat> seatlist,
			final ArrayList<Galley> galleylist, final ArrayList<Lavatory> lavatorylist,
			final ArrayList<Curtain> curtainlist) {
		this.rowlist = rowlist;
		this.seatlist = seatlist;
		this.galleylist = galleylist;
		this.lavatorylist = lavatorylist;
		this.curtainlist = curtainlist;
		this.cabin = cabin;
	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected final void doRun() {

		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */

		Input input = new Input(WindowType.MOVE_OBJECT,
				"All values must be entered in [cm]. Please use positive and negative digits only.",
				IMessageProvider.INFORMATION);

		movementVector = input.getVectorValue();

		new MoveObject(cabin, rowlist, seatlist, galleylist, lavatorylist, curtainlist, movementVector)
				.performMoveObject();

		new RefreshCabinViewCommand(cabin).execute();
	}
}