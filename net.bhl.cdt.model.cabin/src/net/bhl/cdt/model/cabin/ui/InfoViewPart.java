/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.ui;

import java.text.DecimalFormat;
import java.util.List;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.commands.SimulateBoardingCommand;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
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
	private static Color gold;
	private static Color blue;
	private static Color red;
	private static Color gray;
	private static Color salmon;
	private static Color green;
	private static Color lightGray;
	private static Color darkGray;
	private static Color white;
	private static Color black;
	private static Font fontOne;
	private static Font fontTwo;
	private static Font fontThree;
	private static DecimalFormat df;
	/********************************************************************/

	private int oneMeter;
	private Image aircraft;
	private Canvas canvas;
	private Adapter cabinAdapter;

	/**
	 * 
	 */
	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		public String getColumnText(Object obj, int index) {
			Cabin todo = (Cabin) obj;
			return todo.getName();
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		/************************* Create Colors and Fonts here *******************************/
		fontsize = 6;
		fontName = "Helvetica Neue";
		gold = new Color(parent.getDisplay(), 255, 215, 0);
		blue = new Color(parent.getDisplay(), 30, 144, 255);
		red = new Color(parent.getDisplay(), 220, 20, 60);
		gray = new Color(parent.getDisplay(), 169, 169, 169);
		salmon = new Color(parent.getDisplay(), 250, 128, 114);
		green = new Color(parent.getDisplay(), 50, 205, 50);
		lightGray = new Color(parent.getDisplay(), 220, 220, 220);
		darkGray = new Color(parent.getDisplay(), 105, 105, 105);
		white = new Color(parent.getDisplay(), 255, 255, 255);
		black = new Color(parent.getDisplay(), 0, 0, 0);
		fontOne = new Font(parent.getDisplay(), fontName, 8, SWT.NORMAL);
		fontTwo = new Font(parent.getDisplay(), fontName, fontsize, SWT.NORMAL);
		fontThree = new Font(parent.getDisplay(), fontName, 9, SWT.NORMAL);
		df = new DecimalFormat("####0.00");
		/*************************************************************************************/

		aircraft = new Image(parent.getDisplay(),
				"T:\\Marc Engelmann\\aircraft_images\\bhl_with_ground.png");
		canvas = new Canvas(parent, SWT.RESIZE);

		drawIt();
	}

	public void update(Cabin cabin) {
		this.cabin = cabin;
		drawIt();
	}

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

	private void disposeAll() {
		super.dispose();

	}

}