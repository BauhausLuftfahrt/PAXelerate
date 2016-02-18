/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.BusinessClass;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.EconomyClass;
import net.bhl.cdt.paxelerate.model.FirstClass;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PremiumEconomyClass;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.ui.commands.SimulateBoardingCommand;
import net.bhl.cdt.paxelerate.ui.font.FontHelper;

/**
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class InfoViewPart extends ViewPart {
	private Cabin cabin;
	private Composite parent;

	private Canvas canvas;

	/**
	 * This method initializes the class elements.
	 * 
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		canvas = new Canvas(parent, SWT.RESIZE);
		drawIt();
	}

	/**
	 * This method updates the cabin.
	 * 
	 * @param cabin
	 *            is the submitted cabin
	 */
	public void update(Cabin cabin) {
		this.cabin = cabin;
		drawIt();
	}

	/**
	 * This method draws the information on the canvas.
	 */
	private void drawIt() {
		parent.redraw();
		parent.update();
		canvas.redraw();
		final int margin = 10;
		final int boxTwoX = 200;
		final int[] pax = new int[4];
		try {
			pax[0] = ModelHelper.getChildrenByClass(cabin, FirstClass.class)
					.get(0).getAvailableSeats();
		} catch (IndexOutOfBoundsException ioobe) {
			pax[0] = 0;
		}
		try {
			pax[1] = ModelHelper.getChildrenByClass(cabin, BusinessClass.class)
					.get(0).getAvailableSeats();
		} catch (IndexOutOfBoundsException ioobe) {
			pax[1] = 0;
		}
		try {
			pax[2] = ModelHelper
					.getChildrenByClass(cabin, PremiumEconomyClass.class)
					.get(0).getAvailableSeats();
		} catch (IndexOutOfBoundsException ioobe) {
			pax[2] = 0;
		}
		try {
			pax[3] = ModelHelper.getChildrenByClass(cabin, EconomyClass.class)
					.get(0).getAvailableSeats();
		} catch (IndexOutOfBoundsException ioobe) {
			pax[3] = 0;
		}
		final List<Seat> seatList = ModelHelper.getChildrenByClass(cabin,
				Seat.class);
		final List<Row> rowList = ModelHelper.getChildrenByClass(cabin,
				Row.class);
		final List<Passenger> paxList = ModelHelper.getChildrenByClass(cabin,
				Passenger.class);

		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				e.gc.setAntialias(SWT.ON);
				e.gc.setInterpolation(SWT.HIGH);
				e.gc.setFont(FontHelper.HEADING3);
				
				e.gc.fillRectangle(0, 0, canvas.getBounds().width, canvas.getBounds().height);
				e.gc.drawText("total seats: " + "\ntotal rows: "
						+ "\n\npassengers: " + "\nalready seated: ", margin,
						margin);
				e.gc.drawText(seatList.size() + "\n" + rowList.size() + "\n\n"
						+ paxList.size() + "\n"
						+ SimulateBoardingCommand.getSeatedPassengers().size(),
						115, margin);

				e.gc.drawText("seats in first class"
						+ "\nseats in business class"
						+ "\nseats in premium economy class"
						+ "\nseats in economy class", boxTwoX, margin);
				if (!cabin.getClasses().isEmpty()) {
					try {
						e.gc.drawText(pax[0] + "\n" + pax[1] + "\n" + pax[2]
								+ "\n" + pax[3], boxTwoX - 20, margin);
					} catch (IndexOutOfBoundsException indexExeption) {
						e.gc.drawText("#\n#\n#\n#\n\nERROR!", boxTwoX - 20,
								margin);
					}
				} else {
					e.gc.drawText("0\n0\n0\n0", boxTwoX - 20, margin);
				}
			}

		});
		disposeAll();
	}

	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
	}

	/**
	 * This method disposes everything.
	 */
	private void disposeAll() {
		super.dispose();

	}

}