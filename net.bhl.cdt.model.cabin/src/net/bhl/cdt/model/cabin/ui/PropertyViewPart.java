/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.model.cabin.ui;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.util.Func;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.cabin.util.Vector2D;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.ViewPart;

/**
 * This class represents the cabin view. All graphics generation is done here.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class PropertyViewPart extends ViewPart {

	private String[] names = { "Male", "Female" };
	private static final String MALE_STR = "#3399FF", FEMALE_STR = "#FF99FF";
	private Composite parent;
	private Canvas canvas;
	private Cabin cabin;
	private final static int BAR_HEIGHT = 15, DEVIATION_BAR_HEIGHT = 2,
			ITEM_SPACE = 30, HEADER_SPACE = 20;
	private double noLug = 0.1, smallLug = 0.2, medLug = 0.4, bigLug = 0.3,
			male = 0.5, female = 0.5;

	private double weightValues[] = { 0.1, 0.2, 0.1, 0.2 };
	private double heightValues[] = { 0.1, 0.2, 0.1, 0.2 };
	private double widthValues[] = { 0.1, 0.2, 0.1, 0.2 };
	private double depthValues[] = { 0.1, 0.2, 0.1, 0.2 };

	private int pos = 0;

	private Vector dimensions = new Vector2D(0, 0);

	/**
	 * 
	 * This method initializes all necessary parameters and images.
	 *
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(final Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		canvas = new Canvas(parent, SWT.RESIZE);

		parent.addListener(SWT.Resize, new Listener() {
			public void handleEvent(Event e) {
				dimensions.setX(parent.getSize().x);
				dimensions.setY(parent.getSize().y);
			}
		});
		doTheDraw();
	}

	/**
	 * This method runs the complete draw of the view.
	 */
	private void doTheDraw() {
		try {
			parent.redraw();
			parent.update();
			canvas.redraw();

			canvas.addPaintListener(new PaintListener() {
				public void paintControl(final PaintEvent e) {

					pos = 0;

					e.gc.setAntialias(SWT.ON);
					e.gc.setInterpolation(SWT.HIGH);

					e.gc.setFont(new Font(parent.getDisplay(), "Arial", 8,
							SWT.NONE));

					e.gc.setForeground(getColor("#C1C1C1"));
					e.gc.setLineWidth(1);
					e.gc.drawLine((int) (dimensions.getX() / 4), 0,
							(int) (dimensions.getX() / 4),
							(int) (dimensions.getY()));
					e.gc.drawLine((int) (dimensions.getX() / 2), 0,
							(int) (dimensions.getX() / 2),
							(int) (dimensions.getY()));
					e.gc.drawLine((int) (dimensions.getX() / 4 * 3), 0,
							(int) (dimensions.getX() / 4 * 3),
							(int) (dimensions.getY()));

					e.gc.setForeground(getColor("#000000"));

					/* male - female ratio */
					pos += 5;
					addHeadline(e, "Sex Ratio");

					e.gc.setBackground(getColor(MALE_STR));

					e.gc.fillRectangle(0, pos,
							(int) (dimensions.getX() * male), BAR_HEIGHT);
					e.gc.drawText(names[0], 5, pos, true);

					e.gc.setBackground(getColor(FEMALE_STR));
					e.gc.fillRectangle((int) (dimensions.getX() * male), pos,
							(int) (dimensions.getX() * female), BAR_HEIGHT);
					e.gc.drawText(
							names[1],
							(int) (dimensions.getX())
									- e.gc.textExtent(names[1]).x - 5, pos,
							true);

					/* luggage distribution */
					pos += ITEM_SPACE;
					addHeadline(e, "Luggage Distribution");

					e.gc.setBackground(getColor("#CC0000"));
					e.gc.fillRectangle(0, pos,
							(int) (dimensions.getX() * noLug), BAR_HEIGHT);

					e.gc.setBackground(getColor("#CCCC00"));
					e.gc.fillRectangle((int) (dimensions.getX() * noLug), pos,
							(int) (dimensions.getX() * smallLug), BAR_HEIGHT);

					e.gc.setBackground(getColor("#00CC00"));
					e.gc.fillRectangle(
							(int) (dimensions.getX() * noLug + dimensions
									.getX() * smallLug), pos,
							(int) (dimensions.getX() * medLug), BAR_HEIGHT);

					e.gc.setBackground(getColor("#0000CC"));
					e.gc.fillRectangle((int) (dimensions.getX() * noLug
							+ dimensions.getX() * medLug + dimensions.getX()
							* smallLug), pos,
							(int) (dimensions.getX() * bigLug), BAR_HEIGHT);

					pos += ITEM_SPACE;
					createDeviationBlock("Weight Distribution", e,
							weightValues[0], weightValues[1], weightValues[2],
							weightValues[3]);

					pos += ITEM_SPACE;
					createDeviationBlock("Height Distribution", e,
							heightValues[0], heightValues[1], heightValues[2],
							heightValues[3]);

					pos += ITEM_SPACE;
					createDeviationBlock("Width Distribution", e,
							widthValues[0], widthValues[1], widthValues[2],
							widthValues[3]);

					pos += ITEM_SPACE;
					createDeviationBlock("Depth Distribution", e,
							depthValues[0], depthValues[1], depthValues[2],
							depthValues[3]);
				}
			});
		} catch (IllegalArgumentException e) {
			System.out.println("illegal argument exception!");

		}
	}

	private void addHeadline(PaintEvent e, String headline) {
		e.gc.drawText(headline, 5, pos, true);
		pos += HEADER_SPACE;
	}

	private void createDeviationBlock(String headline, PaintEvent e,
			double dev1l, double dev1r, double dev2l, double dev2r) {
		addHeadline(e, headline);
		e.gc.setBackground(getColor(MALE_STR));
		e.gc.fillRectangle(0, pos, (int) (dimensions.getX() * 0.25), BAR_HEIGHT);
		e.gc.drawText(names[0], 5, pos, true);

		createDeviationLine(e, 0.25 - dev1l, 0.25 + dev1r);

		e.gc.setBackground(getColor(FEMALE_STR));
		e.gc.fillRectangle((int) (dimensions.getX() * 0.75), pos,
				(int) (dimensions.getX()), BAR_HEIGHT);
		e.gc.drawText(names[1],
				(int) (dimensions.getX()) - e.gc.textExtent(names[1]).x - 5,
				pos, true);

		createDeviationLine(e, 0.75 - dev2l, 0.75 + dev2r);
	}

	private void createDeviationLine(PaintEvent e, double leftFactor,
			double rightFactor) {

		e.gc.setForeground(getColor("#333333"));
		e.gc.setLineWidth(2);

		e.gc.drawLine((int) (dimensions.getX() * leftFactor), pos
				+ (int) (BAR_HEIGHT / 2),
				(int) (dimensions.getX() * rightFactor), pos
						+ (int) (BAR_HEIGHT / 2));
		e.gc.drawLine((int) (dimensions.getX() * leftFactor), pos
				+ (int) (BAR_HEIGHT / 2) - DEVIATION_BAR_HEIGHT,
				(int) (dimensions.getX() * leftFactor), pos
						+ (int) (BAR_HEIGHT / 2) + DEVIATION_BAR_HEIGHT);
		e.gc.drawLine((int) (dimensions.getX() * rightFactor), pos
				+ (int) (BAR_HEIGHT / 2) - DEVIATION_BAR_HEIGHT,
				(int) (dimensions.getX() * rightFactor), pos
						+ (int) (BAR_HEIGHT / 2) + DEVIATION_BAR_HEIGHT);

		e.gc.setForeground(getColor("#000000"));
	}

	public void updateUI(Cabin cabin) {
		this.cabin = cabin;
		loopPassengers();
		doTheDraw();
	}

	private void loopPassengers() {
		int amount = cabin.getPassengers().size();
		int sex = 0;

		/* = weightSum ,avWeight ,maxWeight,minWeight */
		double[][] weightStorage = { { 0, 0 }, { 0, 0 }, { 0, 0 },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE } };
		double[][] heightStorage = { { 0, 0 }, { 0, 0 }, { 0, 0 },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE } };
		double[][] widthStorage = { { 0, 0 }, { 0, 0 }, { 0, 0 },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE } };
		double[][] depthStorage = { { 0, 0 }, { 0, 0 }, { 0, 0 },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE } };

		for (Passenger pax : cabin.getPassengers()) {
			switch (pax.getLuggage()) {
			case NONE:
				noLug++;
				break;
			case SMALL:
				smallLug++;
				break;
			case MEDIUM:
				medLug++;
				break;
			case BIG:
				bigLug++;
				break;
			}

			if (pax.getSex() == Sex.MALE) {
				male++;
				sex = 0;

			} else {
				female++;
				sex = 1;
			}

			weightStorage[0][sex] += pax.getWeight();
			weightStorage[2][sex] = Math.max(weightStorage[2][sex],
					pax.getWeight());
			weightStorage[3][sex] = Math.min(weightStorage[3][sex],
					pax.getWeight());

			heightStorage[0][sex] += pax.getHeight();
			heightStorage[2][sex] = Math.max(heightStorage[2][sex],
					pax.getHeight());
			heightStorage[3][sex] = Math.min(heightStorage[3][sex],
					pax.getHeight());

			widthStorage[0][sex] += pax.getWidth();
			widthStorage[2][sex] = Math.max(widthStorage[2][sex],
					pax.getWidth());
			widthStorage[3][sex] = Math.min(widthStorage[3][sex],
					pax.getWidth());

			depthStorage[0][sex] += pax.getDepth();
			depthStorage[2][sex] = Math.max(depthStorage[2][sex],
					pax.getDepth());
			depthStorage[3][sex] = Math.min(depthStorage[3][sex],
					pax.getDepth());

		}
		/* ********** */

		weightStorage[1][0] = weightStorage[0][0] / male;
		weightStorage[1][1] = weightStorage[0][1] / female;

		weightValues[0] = (1 - weightStorage[3][0] / weightStorage[1][0]) * 0.25;
		weightValues[1] = (weightStorage[2][0] / weightStorage[1][0] * 0.25) - 0.25;

		weightValues[2] = (1 - weightStorage[3][1] / weightStorage[1][1]) * 0.25;
		weightValues[3] = (weightStorage[2][1] / weightStorage[1][1] * 0.25) - 0.25;

		/* ********** */

		heightStorage[1][0] = heightStorage[0][0] / male;
		heightStorage[1][1] = heightStorage[0][1] / female;

		heightValues[0] = (1 - heightStorage[3][0] / heightStorage[1][0]) * 0.25;
		heightValues[1] = (heightStorage[2][0] / heightStorage[1][0] * 0.25) - 0.25;

		heightValues[2] = (1 - heightStorage[3][1] / heightStorage[1][1]) * 0.25;
		heightValues[3] = (heightStorage[2][1] / heightStorage[1][1] * 0.25) - 0.25;

		/* ********** */

		widthStorage[1][0] = widthStorage[0][0] / male;
		widthStorage[1][1] = widthStorage[0][1] / female;

		widthValues[0] = (1 - widthStorage[3][0] / widthStorage[1][0]) * 0.25;
		widthValues[1] = (widthStorage[2][0] / widthStorage[1][0] * 0.25) - 0.25;

		widthValues[2] = (1 - widthStorage[3][1] / widthStorage[1][1]) * 0.25;
		widthValues[3] = (widthStorage[2][1] / widthStorage[1][1] * 0.25) - 0.25;

		/* ********** */

		depthStorage[1][0] = depthStorage[0][0] / male;
		depthStorage[1][1] = depthStorage[0][1] / female;

		depthValues[0] = (1 - depthStorage[3][0] / depthStorage[1][0]) * 0.25;
		depthValues[1] = (depthStorage[2][0] / depthStorage[1][0] * 0.25) - 0.25;

		depthValues[2] = (1 - depthStorage[3][1] / depthStorage[1][1]) * 0.25;
		depthValues[3] = (depthStorage[2][1] / depthStorage[1][1] * 0.25) - 0.25;

		/* ********** */

		noLug = noLug / amount;
		smallLug = smallLug / amount;
		medLug = medLug / amount;
		bigLug = bigLug / amount;

		male = male / amount;
		female = female / amount;

	}

	private Color getColor(String hex) {
		return new Color(parent.getDisplay(), Func.hex2Rgb(hex));
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}