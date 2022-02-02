///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//package com.paxelerate.ui.parts;
//
//import java.text.DecimalFormat;
//import java.util.List;
//import java.util.function.ToDoubleFunction;
//import java.util.stream.Collectors;
//import java.util.stream.DoubleStream;
//
//import org.eclipse.jface.layout.GridLayoutFactory;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.PaintEvent;
//import org.eclipse.swt.events.PaintListener;
//import org.eclipse.swt.graphics.Color;
//import org.eclipse.swt.graphics.Font;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.widgets.Canvas;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Label;
//
//import com.paxelerate.model.Deck;
//import com.paxelerate.model.agent.Passenger;
//import com.paxelerate.model.enums.Gender;
//import com.paxelerate.model.enums.LuggageType;
//import com.paxelerate.model.enums.PassengerMood;
//
//
///**
// * This class represents the cabin view. All graphics generation is done here.
// *
// *
// */
//
//public class PassengerPart extends BHLPart {
//
//	private interface Labels {
//		String GENDER_TITLE = "Gender";
//		String MALE = "male";
//		String FEMALE = "female";
//
//		String MOOD_TITLE = "Mood";
//		String PASSIVE = "passive";
//		String AGGRESSIVE = "aggressive";
//
//		String LUGGAGE_DISTRIBUTION_TITLE = "Luggage Distribution";
//		String WEIGHT_DISTRIBUTION_TITLE = "Weight Distribution";
//		String HEIGHT_DISTRIBUTION_TITLE = "Height Distribution";
//		String WIDTH_DISTRIBUTION_TITLE = "Width Distribution";
//		String DEPTH_DISTRIBUTION_TITLE = "Depth Distribution";
//		String AGE_DISTRIBUTION_TITLE = "Age Distribution";
//	}
//
//	private double passiveShare, femalePerc, jacketLug, smallLug, medLug, bigLug, noLug;
//
//	private int[] femaleAgeDistribution = new int[100], maleAgeDistribution = new int[100],
//			totalAgeDistribution = new int[100];
//
//	private double[] widths = new double[6], heights = new double[6], depths = new double[6], weights = new double[6];
//
//	private static final int BAR_HEIGHT = 15, DEVIATION_BAR_HEIGHT = 2;
//	private static final double BASELINE = 0.25;
//
//	private Composite content;
//
//	/**
//	 * Creates the deviation block.
//	 *
//	 * @param headline the headline
//	 * @param e        the e
//	 * @param store    the store
//	 */
//	private void drawDeviationBlock(PaintEvent e, double averageLeft, double minLeft, double maxLeft,
//			double averageRight, double minRight, double maxRight) {
//
//		BHLGC.setQuality(e.gc, false);
//		e.gc.setFont(new Font(Display.getCurrent(), "Arial", 7, SWT.NORMAL));
//
//		e.gc.setBackground(BHLColors.BLUE_VERY_LIGHT);
//
//		e.gc.fillRectangle(0, 0, BHLMath.toInt(e.width * BASELINE), BAR_HEIGHT);
//		e.gc.setForeground(BHLColors.adaptToBackground(BHLColors.BLUE_VERY_LIGHT));
//
//		String valueLabel = new DecimalFormat("#.###").format(averageLeft);
//
//		e.gc.drawText(valueLabel, BHLMath.toInt(e.width * BASELINE / 2.0 - e.gc.textExtent(valueLabel).x / 2.0),
//				BHLMath.toInt(BAR_HEIGHT / 2.0 - e.gc.textExtent(valueLabel).y / 2.0));
//		e.gc.setForeground(BHLColors.BLACK);
//
//		createDeviationLine(e, BASELINE - (1 - minLeft / averageLeft) * BASELINE,
//				BASELINE + maxLeft / averageLeft * BASELINE - BASELINE, maxLeft, minLeft);
//
//		e.gc.setBackground(BHLColors.PINK_LIGHT);
//
//		e.gc.fillRectangle(BHLMath.toInt(e.width * (1 - BASELINE)), 0, BHLMath.toInt(e.width * BASELINE), BAR_HEIGHT);
//
//		e.gc.setForeground(BHLColors.adaptToBackground(BHLColors.PINK_LIGHT));
//
//		String valueLabel2 = new DecimalFormat("#.###").format(averageRight);
//
//		e.gc.drawText(valueLabel2,
//				BHLMath.toInt(
//						e.width * (1 - BASELINE) + e.width * BASELINE / 2.0 - e.gc.textExtent(valueLabel2).x / 2.0),
//				BHLMath.toInt(BAR_HEIGHT / 2.0 - e.gc.textExtent(valueLabel2).y / 2.0));
//		e.gc.setForeground(BHLColors.BLACK);
//
//		createDeviationLine(e, 1 - BASELINE - (1 - minRight / averageRight) * BASELINE,
//				1 - BASELINE + maxRight / averageRight * BASELINE - BASELINE, minRight, maxRight);
//	}
//
//	/**
//	 * Creates the deviation line.
//	 *
//	 * @param e           the e
//	 * @param leftFactor  the left factor
//	 * @param rightFactor the right factor
//	 * @param rightLabel  the right label
//	 * @param leftLabel   the left label
//	 */
//	private void createDeviationLine(PaintEvent e, double leftFactor, double rightFactor, double rightLabel,
//			double leftLabel) {
//
//		e.gc.setForeground(BHLColors.GREY(50));
//		e.gc.setLineWidth(2);
//
//		e.gc.drawLine((int) (e.width * leftFactor), BAR_HEIGHT / 2, (int) (e.width * rightFactor), BAR_HEIGHT / 2);
//		e.gc.drawLine((int) (e.width * leftFactor), BAR_HEIGHT / 2 - DEVIATION_BAR_HEIGHT, (int) (e.width * leftFactor),
//				BAR_HEIGHT / 2 + DEVIATION_BAR_HEIGHT);
//		e.gc.drawLine((int) (e.width * rightFactor), BAR_HEIGHT / 2 - DEVIATION_BAR_HEIGHT,
//				(int) (e.width * rightFactor), BAR_HEIGHT / 2 + DEVIATION_BAR_HEIGHT);
//
////		String valueLabel = new DecimalFormat("#.###").format(leftFactor);
////		e.gc.drawText(valueLabel, BHLMath.toInt((e.width * leftFactor) - e.gc.textExtent(valueLabel).x), BAR_HEIGHT,
////				true);
////
////		String valueLabel2 = new DecimalFormat("#.###").format(rightFactor);
////		e.gc.drawText(valueLabel2, BHLMath.toInt((e.width * rightFactor)), BAR_HEIGHT, true);
//
//		e.gc.setForeground(BHLColors.BLACK);
//	}
//
//	@Override
//	public void didReceiveModel() {
//		performCaluclations();
//		updateUI();
//	}
//
//	/**
//	 * Perform all required calculations
//	 */
//	private void performCaluclations() {
//
//		model.flatMap(m -> EObjectHelper.getFirstChild(m, Deck.class)).ifPresent(deck -> {
//
//			int pax = EObjectHelper.getChildren(deck, Passenger.class).size();
//
//			// Moods
//			passiveShare = EObjectHelper
//					.getFilteredChildren(deck, Passenger.class, p -> p.getPassengerMood() == PassengerMood.PASSIVE)
//					.size() / (double) pax;
//			// Genders
//			femalePerc = EObjectHelper.getFilteredChildren(deck, Passenger.class, p -> p.getGender() == Gender.FEMALE)
//					.size() / (double) pax;
//
//			// Luggage
//			List<Passenger> paxWL = EObjectHelper.getFilteredChildren(deck, Passenger.class,
//					p -> !p.getLuggage().isEmpty());
//
//			jacketLug = paxWL.stream().filter(p -> p.getLuggage().get(0).getType() == LuggageType.JACKET)
//					.collect(Collectors.toList()).size() / (double) pax;
//
//			smallLug = paxWL.stream().filter(p -> p.getLuggage().get(0).getType() == LuggageType.SMALL_BAG)
//					.collect(Collectors.toList()).size() / (double) pax;
//
//			medLug = paxWL.stream().filter(p -> p.getLuggage().get(0).getType() == LuggageType.MEDIUM_BAG)
//					.collect(Collectors.toList()).size() / (double) pax;
//
//			bigLug = paxWL.stream().filter(p -> p.getLuggage().get(0).getType() == LuggageType.LARGE_BAG)
//					.collect(Collectors.toList()).size() / (double) pax;
//
//			noLug = 1 - paxWL.size() / (double) pax;
//
//			femaleAgeDistribution = new int[100];
//			maleAgeDistribution = new int[100];
//			totalAgeDistribution = new int[100];
//
//			getPaxStream(Gender.FEMALE, Passenger::getAge).forEach(a -> femaleAgeDistribution[BHLMath.toInt(a)] += 1);
//			getPaxStream(Gender.MALE, Passenger::getAge).forEach(a -> maleAgeDistribution[BHLMath.toInt(a)] += 1);
//			getPaxStream(null, Passenger::getAge).forEach(a -> totalAgeDistribution[BHLMath.toInt(a)] += 1);
//
//			applyValues(weights, Passenger::getWeight);
//			applyValues(heights, Passenger::getHeight);
//			applyValues(widths, Passenger::getWidth);
//			applyValues(depths, Passenger::getDepth);
//		});
//	}
//
//	/**
//	 * @param array
//	 * @param toDoubleFunction
//	 */
//	private void applyValues(double[] array, ToDoubleFunction<? super Passenger> toDoubleFunction) {
//		array[0] = getPaxStream(Gender.MALE, toDoubleFunction).average().orElse(0);
//		array[1] = getPaxStream(Gender.MALE, toDoubleFunction).min().orElse(0);
//		array[2] = getPaxStream(Gender.MALE, toDoubleFunction).max().orElse(0);
//		array[3] = getPaxStream(Gender.FEMALE, toDoubleFunction).average().orElse(0);
//		array[4] = getPaxStream(Gender.FEMALE, toDoubleFunction).min().orElse(0);
//		array[5] = getPaxStream(Gender.FEMALE, toDoubleFunction).max().orElse(0);
//	}
//
//	/**
//	 *
//	 */
//	private void updateUI() {
//
//		if (model.isPresent()) {
//			if (EObjectHelper.getChildren(model.get(), Passenger.class).size() == 0) {
//				return;
//			}
//		} else {
//			return;
//		}
//
//		if (content != null) {
//			content.dispose();
//		}
//
//		content = new Composite(parent, SWT.NONE);
//		content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
//
//		final GridData data = new GridData();
//		data.widthHint = 400;
//		data.heightHint = 30;
//		data.verticalIndent = -5;
//
//		part.setLabel(
//				"Passenger Properties (n = " + EObjectHelper.getChildren(model.get(), Passenger.class).size() + ")");
//
//		addCanvas(content, Labels.GENDER_TITLE, data,
//				e -> BHLGC.drawChart(e, new Double[] { femalePerc, 1 - femalePerc },
//						new String[] { Labels.FEMALE, Labels.MALE },
//						new Color[] { BHLColors.PINK_LIGHT, BHLColors.BLUE_VERY_LIGHT }));
//
//		addCanvas(content, Labels.MOOD_TITLE, data,
//				e -> BHLGC.drawChart(e, new Double[] { passiveShare, 1 - passiveShare },
//						new String[] { Labels.PASSIVE, Labels.AGGRESSIVE },
//						new Color[] { BHLColors.GREEN_LIGHT, BHLColors.RED_DARK }));
//
//		addCanvas(content, Labels.LUGGAGE_DISTRIBUTION_TITLE, data,
//				e -> BHLGC.drawChart(e, new Double[] { noLug, jacketLug, smallLug, medLug, bigLug },
//						new String[] { "none", "jacket", "small", "medium", "large" },
//						new Color[] { BHLColors.BROWN_GREY, BHLColors.SALMON, BHLColors.ORANGE_LIGHT,
//								BHLColors.ORANGE_DARK, BHLColors.BROWN_DARK }));
//
//		addCanvas(content, Labels.WEIGHT_DISTRIBUTION_TITLE, data,
//				e -> drawDeviationBlock(e, weights[0], weights[1], weights[2], weights[3], weights[4], weights[5]));
//		addCanvas(content, Labels.HEIGHT_DISTRIBUTION_TITLE, data,
//				e -> drawDeviationBlock(e, heights[0], heights[1], heights[2], heights[3], heights[4], heights[5]));
//		addCanvas(content, Labels.WIDTH_DISTRIBUTION_TITLE, data,
//				e -> drawDeviationBlock(e, widths[0], widths[1], widths[2], widths[3], widths[4], widths[5]));
//		addCanvas(content, Labels.DEPTH_DISTRIBUTION_TITLE, data,
//				e -> drawDeviationBlock(e, depths[0], depths[1], depths[2], depths[3], depths[4], depths[5]));
//
//		addCanvas(content, Labels.AGE_DISTRIBUTION_TITLE, data, e -> {
//			BHLGC.drawGraph(e, BHLColors.RED_LIGHT, totalAgeDistribution);
//			BHLGC.drawGraph(e, BHLColors.BLUE_VERY_LIGHT, maleAgeDistribution);
//			BHLGC.drawGraph(e, BHLColors.PINK_LIGHT, femaleAgeDistribution);
//		});
//
//		parent.layout();
//	}
//
//	/**
//	 * @param parent
//	 * @param headline
//	 * @param layout
//	 * @param listener
//	 */
//	private void addCanvas(Composite comp, String headline, Object layout, PaintListener listener) {
//
//		Composite titleContainer = new Composite(content, SWT.NONE);
//		titleContainer.setLayout(GridLayoutFactory.fillDefaults().create());
//		new Label(titleContainer, SWT.NONE).setText(headline);
//
//		Canvas canvas = new Canvas(comp, SWT.NONE);
//		canvas.setLayoutData(layout);
//		canvas.addPaintListener(listener);
//	}
//
//	/**
//	 * @param gender
//	 * @param toDoubleFunction
//	 * @return
//	 */
//	private DoubleStream getPaxStream(Gender gender, ToDoubleFunction<? super Passenger> toDoubleFunction) {
//
//		if (gender == null) {
//			return EObjectHelper.getChildren(model.get(), Passenger.class).stream().mapToDouble(toDoubleFunction);
//		}
//
//		return EObjectHelper.getFilteredChildren(model.get(), Passenger.class, p -> p.getGender() == gender).stream()
//				.mapToDouble(toDoubleFunction);
//
//	}
//
//	/**
//	 *
//	 * This method initializes all necessary parameters and images.
//	 *
//	 * @param cdkd is the cdkd element
//	 */
//	@Override
//	protected void init() {
//		model = EMFStorageHandler.load();
//		performCaluclations();
//		updateUI();
//	}
//
//	@Override
//	public String getURI() {
//		return "bundleclass://com.paxelerate.app/com.paxelerate.app.parts.PassengerPart";
//	}
//}