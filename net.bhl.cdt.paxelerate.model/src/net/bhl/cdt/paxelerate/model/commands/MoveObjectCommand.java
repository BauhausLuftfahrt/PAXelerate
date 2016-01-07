/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.commands;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.ui.CabinViewPart;
import net.bhl.cdt.paxelerate.util.Log;
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
	private CabinViewPart cabinViewPart;
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
	public MoveObjectCommand(Cabin cabin, ArrayList<Row> rowlist,
			ArrayList<Seat> seatlist, ArrayList<Galley> galleylist,
			ArrayList<Lavatory> lavatorylist, ArrayList<Curtain> curtainlist) {
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
				"All values must be entered in [cm]. Please use digits only.",
				IMessageProvider.INFORMATION);

		movementVector = input.getVectorValue();
		scaleVector = input.getSecondVectorValue();
		if (scaleVector.getX() != 0 && scaleVector.getY() != 0) {
			scalingDesired = true;
		}
		if (!rowlist.isEmpty()) {
			for (Row row : rowlist) {
				for (Row compareRow : ModelHelper.getChildrenByClass(cabin,
						Row.class)) {
					if (row.getRowNumber() == compareRow.getRowNumber()) {
						for (Seat seat : compareRow.getSeats()) {
							seat.setXPosition(seat.getXPosition()
									+ movementVector.getX());
							seat.setYPosition(seat.getYPosition()
									+ movementVector.getY());
							if (scalingDesired) {
								seat.setXDimension(scaleVector.getX());
								seat.setYDimension(scaleVector.getY());
							}

						}
					}
				}
			}
		}
		if (!seatlist.isEmpty()) {
			for (Seat seat : seatlist) {
				for (Seat compareSeat : ModelHelper.getChildrenByClass(cabin,
						Seat.class)) {
					if (seat.getId() == compareSeat.getId()) {
						compareSeat.setXPosition(compareSeat.getXPosition()
								+ movementVector.getX());
						compareSeat.setYPosition(compareSeat.getYPosition()
								+ movementVector.getY());
						if (scalingDesired) {
							compareSeat.setXDimension(scaleVector.getX());
							compareSeat.setYDimension(scaleVector.getY());
						}
					}
				}
			}
		}
		if (!galleylist.isEmpty()) {
			for (Galley galley : galleylist) {
				for (Galley compareGalley : cabin.getGalleys()) {
					if (galley.getId() == compareGalley.getId()) {
						galley.setXPosition(
								galley.getXPosition() + movementVector.getX());
						galley.setYPosition(
								galley.getYPosition() + movementVector.getY());
						if (scalingDesired) {
							galley.setXDimension(scaleVector.getX());
							galley.setYDimension(scaleVector.getY());
						}
					}
				}
			}
		}
		if (!lavatorylist.isEmpty()) {
			for (Lavatory lavatory : lavatorylist) {
				for (Lavatory compareLavatory : cabin.getLavatories()) {
					if (lavatory.getId() == compareLavatory.getId()) {
						compareLavatory
								.setXPosition(compareLavatory.getXPosition()
										+ movementVector.getX());
						compareLavatory
								.setYPosition(compareLavatory.getYPosition()
										+ movementVector.getY());
						if (scalingDesired) {
							compareLavatory.setXDimension(scaleVector.getX());
							compareLavatory.setYDimension(scaleVector.getY());
						}
					}
				}
			}
		}
		if (!curtainlist.isEmpty()) {
			for (Curtain curtain : curtainlist) {
				for (Curtain compareCurtain : cabin.getCurtains()) {
					if (curtain.getId() == compareCurtain.getId()) {
						compareCurtain
								.setXPosition(compareCurtain.getXPosition()
										+ movementVector.getX());
						compareCurtain
								.setYPosition(compareCurtain.getYPosition()
										+ movementVector.getY());
						if (scalingDesired) {
							compareCurtain.setXDimension(scaleVector.getX());
							compareCurtain.setYDimension(scaleVector.getY());
						}
					}
				}
			}
		}

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.paxelerate.model.cabinview");

		try {
			cabinViewPart.setCabin(cabin);
			Log.add(this, "Cabin view checked and updated");
		} catch (NullPointerException e) {
			Log.add(this, "No cabin view is visible!");
		}
	}
}