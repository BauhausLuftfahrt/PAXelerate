/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.util.GetInput;
import net.bhl.cdt.model.cabin.util.GetInput.WindowType;
import net.bhl.cdt.model.cabin.util.Vector;
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
	private Vector movementVector;
	private Vector scaleVector;
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
	public MoveRowCommand(Cabin cabin, ArrayList<Row> rowlist,
			ArrayList<Seat> seatlist, ArrayList<Galley> galleylist,
			ArrayList<Lavatory> lavatorylist, ArrayList<Curtain> curtainlist) {
		this.rowlist = rowlist;
		this.seatlist = seatlist;
		this.galleylist = galleylist;
		this.lavatorylist = lavatorylist;
		this.curtainlist = curtainlist;
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

		GetInput input = new GetInput(WindowType.GET_TWO_VECTORS,
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
				for (Galley compareGalley : ModelHelper.getChildrenByClass(
						cabin, Galley.class)) {
					if (galley.getId() == compareGalley.getId()) {
						galley.setXPosition(galley.getXPosition()
								+ movementVector.getX());
						galley.setYPosition(galley.getYPosition()
								+ movementVector.getY());
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
				for (Lavatory compareLavatory : ModelHelper.getChildrenByClass(
						cabin, Lavatory.class)) {
					if (lavatory.getId() == compareLavatory.getId()) {
						compareLavatory.setXPosition(compareLavatory
								.getXPosition() + movementVector.getX());
						compareLavatory.setYPosition(compareLavatory
								.getYPosition() + movementVector.getY());
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
				for (Curtain compareCurtain : ModelHelper.getChildrenByClass(
						cabin, Curtain.class)) {
					if (curtain.getId() == compareCurtain.getId()) {
						compareCurtain.setXPosition(compareCurtain
								.getXPosition() + movementVector.getX());
						compareCurtain.setYPosition(compareCurtain
								.getYPosition() + movementVector.getY());
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