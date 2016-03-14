/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import java.text.DecimalFormat;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.ViewPart;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.LuggageSize;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.paxelerate.model.storage.AgeStorage;
import net.bhl.cdt.paxelerate.model.storage.GaussianStorage;
import net.bhl.cdt.paxelerate.model.storage.StorageHandler;
import net.bhl.cdt.paxelerate.model.storage.StorageHandler.StoreType;
import net.bhl.cdt.paxelerate.ui.color.ColorHelper;
import net.bhl.cdt.paxelerate.ui.font.FontHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class represents the cabin view. All graphics generation is done here.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class PropertyViewPart extends ViewPart {

	private String[] names = { "M,", "F" };
	private Composite parent;
	private Canvas canvas;
	private Cabin cabin;

	private StorageHandler propertyStore = new StorageHandler();

	private final static int BAR_HEIGHT = 15, DEVIATION_BAR_HEIGHT = 2, ITEM_SPACE = 30, HEADER_SPACE = 20;

	private static final double AVG_VALUE = 0.25;

	private int pos = 0;

	private Vector dimensions = new Vector2D(0, 0);

	/**
	 * 
	 * This method initializes all necessary parameters and images.
	 *
	 * @param parent
	 *            is the parent element
	 */
	@Override
	public void createPartControl(final Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		canvas = new Canvas(parent, SWT.DOUBLE_BUFFERED);

		parent.addListener(SWT.Resize, new Listener() {
			@Override
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
				@Override
				public void paintControl(final PaintEvent e) {

					pos = 0;

					e.gc.setAntialias(SWT.ON);
					e.gc.setTextAntialias(SWT.ON);
					e.gc.setInterpolation(SWT.HIGH);

					e.gc.setFont(FontHelper.HEADING3);

					e.gc.setForeground(ColorHelper.GREY_LIGHT);
					e.gc.setLineWidth(1);
					e.gc.drawLine(dimensions.getX() / 4, 0, dimensions.getX() / 4, (dimensions.getY()));
					e.gc.drawLine(dimensions.getX() / 2, 0, dimensions.getX() / 2, (dimensions.getY()));
					e.gc.drawLine(dimensions.getX() / 4 * 3, 0, dimensions.getX() / 4 * 3, (dimensions.getY()));

					e.gc.setForeground(ColorHelper.BLACK);

					/* ********************************************* */
					pos += 5;
					addHeadline(e, "Sex Ratio");

					e.gc.setBackground(ColorHelper.PASSENGER_MALE);

					e.gc.fillRectangle(0, pos,
							(int) (dimensions.getX() * propertyStore.getPercentageOfPassengers(Sex.MALE)), BAR_HEIGHT);
					e.gc.drawText(names[0], 5, pos, true);

					e.gc.setBackground(ColorHelper.PASSEMGER_FEMALE);
					e.gc.fillRectangle((int) (dimensions.getX() * propertyStore.getPercentageOfPassengers(Sex.MALE)),
							pos, (int) (dimensions.getX() * propertyStore.getPercentageOfPassengers(Sex.FEMALE)),
							BAR_HEIGHT);
					e.gc.drawText(names[1], (dimensions.getX()) - e.gc.textExtent(names[1]).x - 5, pos, true);

					addLabel(e, propertyStore.getPercentageOfPassengers(Sex.MALE) * 100,
							propertyStore.getPercentageOfPassengers(Sex.MALE), LabelClass.PERCENTAGE, 0);

					/* ********************************************* */
					pos += ITEM_SPACE;
					addHeadline(e, "Luggage Distribution");

					double noLug = propertyStore.getLuggageStore().getLuggagePercentage(LuggageSize.NONE);

					double smallLug = propertyStore.getLuggageStore().getLuggagePercentage(LuggageSize.SMALL);

					double medLug = propertyStore.getLuggageStore().getLuggagePercentage(LuggageSize.MEDIUM);

					double bigLug = propertyStore.getLuggageStore().getLuggagePercentage(LuggageSize.BIG);

					e.gc.setBackground(ColorHelper.LUGGAGE_NONE);
					e.gc.fillRectangle(0, pos, (int) (dimensions.getX() * noLug), BAR_HEIGHT);

					e.gc.setBackground(ColorHelper.LUGGAGE_SMALL);
					e.gc.fillRectangle((int) (dimensions.getX() * noLug), pos, (int) (dimensions.getX() * smallLug),
							BAR_HEIGHT);

					e.gc.setBackground(ColorHelper.LUGGAGE_MEDIUM);
					e.gc.fillRectangle((int) (dimensions.getX() * noLug + dimensions.getX() * smallLug), pos,
							(int) (dimensions.getX() * medLug), BAR_HEIGHT);

					e.gc.setBackground(ColorHelper.LUGGAGE_LARGE);
					e.gc.fillRectangle(
							(int) (dimensions.getX() * noLug + dimensions.getX() * medLug
									+ dimensions.getX() * smallLug),
							pos, (int) (dimensions.getX() * bigLug), BAR_HEIGHT);

					addLabel(e, noLug * 100, noLug, LabelClass.PERCENTAGE, 0);
					addLabel(e, (noLug + smallLug) * 100, smallLug + noLug, LabelClass.PERCENTAGE, 0);
					addLabel(e, (noLug + smallLug + medLug) * 100, smallLug + noLug + medLug, LabelClass.PERCENTAGE, 0);

					/* ********************************************* */

					pos += ITEM_SPACE;
					createDeviationBlock("Weight Distribution", e, propertyStore.getStore(StoreType.WEIGHT));

					pos += ITEM_SPACE;
					createDeviationBlock("Height Distribution", e, propertyStore.getStore(StoreType.HEIGHT));

					pos += ITEM_SPACE;
					createDeviationBlock("Width Distribution", e, propertyStore.getStore(StoreType.WIDTH));

					pos += ITEM_SPACE;
					createDeviationBlock("Depth Distribution", e, propertyStore.getStore(StoreType.DEPTH));

					/* ********************************************* */

					pos += ITEM_SPACE;
					createFunctionBlock("Age Distribution", e, propertyStore.getAgeStore());
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

	public void createFunctionBlock(String headline, PaintEvent e, AgeStorage store) {

		addHeadline(e, headline);

		int margin = 2;

		int min = store.getMinimumAge(null) - margin;
		int max = store.getMaximumAge(null) + margin;

		double steps = max - min;

		pos += 30;

		drawFunction(e, store, null, (int) steps, min, max);
		drawFunction(e, store, Sex.MALE, (int) steps, min, max);
		drawFunction(e, store, Sex.FEMALE, (int) steps, min, max);

		addLabel(e, store.getMaximumAge(null), 1 - margin / steps, LabelClass.VALUE, -10);

		addLabel(e, store.getMinimumAge(null), margin / steps, LabelClass.VALUE, -10);

		addLabel(e, store.getAverageAge(null), (store.getAverageAge(null) - min) / steps, LabelClass.VALUE, -10);
	}

	private void drawFunction(PaintEvent e, AgeStorage store, Sex sex, int steps, int min, int max) {

		int maximum = store.getMaximumAmount(sex), i = 0, x1 = 0, y1 = pos, x2 = 0, y2 = 0;
		if (maximum == 0) {
			maximum = 1;
		}

		int maxHeight = maximum * 4; // TODO remove magic numbers

		if (sex == Sex.MALE) {
			e.gc.setForeground(ColorHelper.PASSENGER_MALE);
		} else if (sex == Sex.FEMALE) {
			e.gc.setForeground(ColorHelper.PASSEMGER_FEMALE);
		} else {
			e.gc.setForeground(ColorHelper.ERROR);
		}

		for (int k = min; k < max; k++) {
			int value = store.getData(sex)[k];
			x2 = i * dimensions.getX() / steps;
			y2 = pos - (int) (((double) value / (double) maximum) * maxHeight);
			e.gc.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			i++;
		}

		e.gc.setForeground(ColorHelper.BLACK);
	}

	private void createDeviationBlock(String headline, PaintEvent e, GaussianStorage store) {

		addHeadline(e, headline);

		e.gc.setBackground(ColorHelper.PASSENGER_MALE);
		e.gc.fillRectangle(0, pos, (int) (dimensions.getX() * AVG_VALUE), BAR_HEIGHT);
		e.gc.drawText(names[0], 5, pos, true);

		double minimumFactorMale = (1 - store.getMinimum(Sex.MALE) / store.getAverage(Sex.MALE)) * AVG_VALUE;

		double maximumFactorMale = (store.getMaximum(Sex.MALE) / store.getAverage(Sex.MALE) * AVG_VALUE) - AVG_VALUE;

		double minimumFactorFemale = (1 - store.getMinimum(Sex.FEMALE) / store.getAverage(Sex.FEMALE)) * AVG_VALUE;
		double maximumFactorFemale = (store.getMaximum(Sex.FEMALE) / store.getAverage(Sex.FEMALE) * AVG_VALUE)
				- AVG_VALUE;

		createDeviationLine(e, AVG_VALUE - minimumFactorMale, AVG_VALUE + maximumFactorMale, store.getMaximum(Sex.MALE),
				store.getMinimum(Sex.MALE));

		e.gc.setBackground(ColorHelper.PASSEMGER_FEMALE);
		e.gc.fillRectangle((int) (dimensions.getX() * (1 - AVG_VALUE)), pos, (dimensions.getX()), BAR_HEIGHT);
		e.gc.drawText(names[1], (dimensions.getX()) - e.gc.textExtent(names[1]).x - 5, pos, true);

		createDeviationLine(e, 1 - AVG_VALUE - minimumFactorFemale, 1 - AVG_VALUE + maximumFactorFemale,
				store.getMinimum(Sex.FEMALE), store.getMaximum(Sex.FEMALE));
	}

	private void addLabel(PaintEvent e, double labelValue, double relativePosition, LabelClass labelClass, int offset) {

		e.gc.setFont(FontHelper.PARAGRAPH);

		String labelString;

		if (labelClass == LabelClass.PERCENTAGE) {
			DecimalFormat df = new DecimalFormat("#.#");
			labelString = df.format(labelValue);
			labelString += "%";
		} else {
			DecimalFormat df = new DecimalFormat("#.#");
			labelString = df.format(labelValue);
		}

		e.gc.drawText(labelString, (int) (dimensions.getX() * relativePosition) - e.gc.stringExtent(labelString).x / 2,
				pos + 15 + offset, true);

		e.gc.setFont(FontHelper.HEADING3);
	}

	private void createDeviationLine(PaintEvent e, double leftFactor, double rightFactor, double rightLabel,
			double leftLabel) {

		e.gc.setForeground(ColorHelper.GREY_DARK);
		e.gc.setLineWidth(2);

		e.gc.drawLine((int) (dimensions.getX() * leftFactor), pos + BAR_HEIGHT / 2,
				(int) (dimensions.getX() * rightFactor), pos + BAR_HEIGHT / 2);
		e.gc.drawLine((int) (dimensions.getX() * leftFactor), pos + BAR_HEIGHT / 2 - DEVIATION_BAR_HEIGHT,
				(int) (dimensions.getX() * leftFactor), pos + BAR_HEIGHT / 2 + DEVIATION_BAR_HEIGHT);
		e.gc.drawLine((int) (dimensions.getX() * rightFactor), pos + BAR_HEIGHT / 2 - DEVIATION_BAR_HEIGHT,
				(int) (dimensions.getX() * rightFactor), pos + BAR_HEIGHT / 2 + DEVIATION_BAR_HEIGHT);

		addLabel(e, leftLabel, leftFactor, LabelClass.VALUE, 0);

		addLabel(e, rightLabel, rightFactor, LabelClass.VALUE, 0);

		e.gc.setForeground(ColorHelper.BLACK);
	}

	public void updateUI(Cabin cabin) {
		this.cabin = cabin;
		loopPassengers();
		doTheDraw();
	}

	private void loopPassengers() {

		propertyStore.clear();

		for (Passenger pax : cabin.getPassengers()) {
			propertyStore.addPassenger(pax);
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private enum LabelClass {
		PERCENTAGE, VALUE
	}
}