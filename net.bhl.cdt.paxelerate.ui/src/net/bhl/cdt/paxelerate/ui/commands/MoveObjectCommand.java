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
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class MoveObjectCommand extends CDTCommand {

	private Cabin cabin;
	private Vector movementVector, scaleVector;
	private ArrayList<Row> rowlist = new ArrayList<Row>();
	private ArrayList<Seat> seatlist = new ArrayList<Seat>();
	private ArrayList<Galley> galleylist = new ArrayList<Galley>();
	private ArrayList<Lavatory> lavatorylist = new ArrayList<Lavatory>();
	private ArrayList<Curtain> curtainlist = new ArrayList<Curtain>();
	private boolean scalingDesired = false;

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
	public MoveObjectCommand(Cabin cabin, ArrayList<Row> rowlist, ArrayList<Seat> seatlist,
			ArrayList<Galley> galleylist, ArrayList<Lavatory> lavatorylist, ArrayList<Curtain> curtainlist) {
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
	protected void doRun() {

		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */

		Input input = new Input(WindowType.GET_TWO_VECTORS,
				"All values must be entered in [cm]. Please use digits only.", IMessageProvider.INFORMATION);

		movementVector = input.getVectorValue();
		scaleVector = input.getSecondVectorValue();
		if (scaleVector.getX() != 0 && scaleVector.getY() != 0) {
			scalingDesired = true;
		}

		int xMovement = movementVector.getX();
		int yMovement = movementVector.getY();

		if (!rowlist.isEmpty()) {
			for (Row row : rowlist) {
				for (Row compareRow : ModelHelper.getChildrenByClass(cabin, Row.class)) {
					if (row.getRowNumber() == compareRow.getRowNumber()) {
						for (Seat seat : compareRow.getSeats()) {
							seat.setYPosition(seat.getYPosition() + yMovement);
							seat.setXPosition(seat.getXPosition() + xMovement);
							if (scalingDesired) {
								seat.setYDimension(scaleVector.getY());
								seat.setXDimension(scaleVector.getX());
							}

						}
					}
				}
			}
		}
		if (!seatlist.isEmpty()) {
			for (Seat seat : seatlist) {
				for (Seat compareSeat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
					if (seat.getId() == compareSeat.getId()) {
						compareSeat.setYPosition(compareSeat.getYPosition() + yMovement);
						compareSeat.setXPosition(compareSeat.getXPosition() + xMovement);
						if (scalingDesired) {
							compareSeat.setYDimension(scaleVector.getX());
							compareSeat.setXDimension(scaleVector.getY());
						}
					}
				}
			}
		}
		if (!galleylist.isEmpty()) {
			for (Galley galley : galleylist) {
				for (Galley compareGalley : cabin.getGalleys()) {
					if (galley.getId() == compareGalley.getId()) {
						galley.setYPosition(galley.getYPosition() + yMovement);
						galley.setXPosition(galley.getXPosition() + xMovement);
						if (scalingDesired) {
							galley.setYDimension(scaleVector.getY());
							galley.setXDimension(scaleVector.getX());
						}
					}
				}
			}
		}
		if (!lavatorylist.isEmpty()) {
			for (Lavatory lavatory : lavatorylist) {
				for (Lavatory compareLavatory : cabin.getLavatories()) {
					if (lavatory.getId() == compareLavatory.getId()) {
						compareLavatory.setYPosition(compareLavatory.getYPosition() + yMovement);
						compareLavatory.setXPosition(compareLavatory.getXPosition() + xMovement);
						if (scalingDesired) {
							compareLavatory.setYDimension(scaleVector.getY());
							compareLavatory.setXDimension(scaleVector.getX());
						}
					}
				}
			}
		}
		if (!curtainlist.isEmpty()) {
			for (Curtain curtain : curtainlist) {
				for (Curtain compareCurtain : cabin.getCurtains()) {
					if (curtain.getId() == compareCurtain.getId()) {
						compareCurtain.setYPosition(compareCurtain.getYPosition() + yMovement);
						compareCurtain.setXPosition(compareCurtain.getXPosition() + xMovement);
						if (scalingDesired) {
							compareCurtain.setYDimension(scaleVector.getY());
							compareCurtain.setXDimension(scaleVector.getX());
						}
					}
				}
			}
		}

		new DrawCabinCommand(cabin).execute();
	}
}