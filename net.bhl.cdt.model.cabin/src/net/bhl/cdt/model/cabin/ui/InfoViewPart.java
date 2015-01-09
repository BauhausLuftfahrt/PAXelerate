/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.ui;

import java.util.List;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.commands.SimulateBoardingCommand;
import net.bhl.cdt.model.util.ModelHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class InfoViewPart extends ViewPart {
	private Cabin cabin;
	private Composite parent;

	/************* Create Colors and Fonts here. ***********************/
	private static int fontsize;
	private static String fontName;
	/********************************************************************/

	private Canvas canvas;

	/**
	 * This method initializes the class elements.
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		fontsize = 8;
		fontName = "Helvetica Neue";
		canvas = new Canvas(parent, SWT.RESIZE);
		drawIt();
	}
	/**
	 * This method updates the cabin.
	 * @param cabin is the submitted cabin
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
				e.gc.setFont(new Font(parent.getDisplay(), fontName, fontsize, SWT.NONE));
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
					e.gc.drawText(cabin.getClasses().get(0).getAvailableSeats()
							+ "\n"
							+ cabin.getClasses().get(1).getAvailableSeats()
							+ "\n"
							+ cabin.getClasses().get(2).getAvailableSeats()
							+ "\n"
							+ cabin.getClasses().get(3).getAvailableSeats(),
							boxTwoX - 20, margin);
				} else {
					e.gc.drawText("0\n0\n0\n0",
							boxTwoX - 20, margin);
				}
			}

		});
		disposeAll();
	}

	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
	}
	/**
	 * This method disposes everyting.
	 */
	private void disposeAll() {
		super.dispose();

	}

}