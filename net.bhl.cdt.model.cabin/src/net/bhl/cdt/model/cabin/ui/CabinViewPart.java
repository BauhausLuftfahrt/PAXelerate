/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.ui;

import java.util.ArrayList;

import net.bhl.cdt.model.astar.ObstacleMap;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.SWTResourceManager;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * This class represents the cabin view. All graphics generation is done here.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class CabinViewPart extends ViewPart {
	private Cabin cabin;
	private double factor;
	private Composite parent;
	private static boolean initialBoot = true;

	/********************* graphical settings. *************************/
	private static final int OFFSET_OF_DOOR = 0;
	private static final double PASSENGER_CIRCLE_SIZE = 0.5;

	private static final int CABIN_WIDTH_IN_PIXELS = 123;
	private static int xZero = 139;
	private static int yZero = 75;
	private static final int DOOR_DEPTH = 2;
	private static int imageX = 400;
	private static int imageY = 1000;

	/*******************************************************************/

	/************* Create Colors and Fonts here. ***********************/
	private static int fontsize;
	private static String fontName;
	private static Color red;
	private static Color salmon;
	private static Color green;
	private static Color darkGray;
	private static Color white;
	private static Color black;
	private static Font fontOne;
	private static Font fontTwo;
	private static Font fontThree;
	private static Color aircraftBackground;
	/********************************************************************/

	private static ILog logger;

	private Image economySeat;
	private Image businessSeat;
	private Image firstSeat;
	private Image coffeeIcon;
	private Image lavatoryIcon;
	private Canvas canvas;
	private Adapter cabinAdapter;
	private ImageLoader loader;
	private static Image img;
	public static final String FILEPATH = System.getProperty("user.home")
			+ "/Documents/";
	private double canvasHeight;

	/**
	 * This method creates the background image.
	 * 
	 * @return the background image
	 */
	private Image createImage() {
		Image image = new Image(parent.getDisplay(), imageX, imageY);
		Image newAircraft = tryAircraftSwitch();
		GC graphicsControl = new GC(image);
		graphicsControl.setFont(fontTwo);
		graphicsControl.setAntialias(SWT.ON);
		graphicsControl.setInterpolation(SWT.HIGH);
		graphicsControl.drawImage(newAircraft, 0, 0);
		graphicsControl.setBackground(aircraftBackground);
		graphicsControl.fillRectangle(xZero, yZero,
				(int) (cabin.getCabinWidth() / factor),
				(int) (cabin.getCabinLength() / factor));
		graphicsControl.drawLine(xZero, yZero
				+ (int) (cabin.getCabinLength() / factor),
				xZero + (int) (cabin.getCabinWidth() / factor), yZero
						+ (int) (cabin.getCabinLength() / factor));
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {

			if (seat.getTravelClass() instanceof FirstClass) {
				graphicsControl.drawImage(firstSeat,
						(int) (xZero + seat.getXPosition() / factor),
						(int) (yZero + seat.getYPosition() / factor));
			} else if (seat.getTravelClass() instanceof BusinessClass) {
				graphicsControl.drawImage(businessSeat,
						(int) (xZero + seat.getXPosition() / factor),
						(int) (yZero + seat.getYPosition() / factor));

			} else {
				graphicsControl.drawImage(economySeat,
						(int) (xZero + seat.getXPosition() / factor),
						(int) (yZero + seat.getYPosition() / factor));
			}
		}

		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			graphicsControl.setBackground(darkGray);
			if (door.isOnBothSides()) {
				graphicsControl.fillRectangle((int) (xZero + OFFSET_OF_DOOR
						- DOOR_DEPTH + (cabin.getCabinWidth()) / factor),
						(int) (yZero + door.getYPosition() / factor),
						(int) (DOOR_DEPTH), (int) (door.getWidth() / factor));
			}
			graphicsControl.fillRectangle((int) (xZero - OFFSET_OF_DOOR),
					(int) (yZero + door.getYPosition() / factor),
					(int) (DOOR_DEPTH), (int) (door.getWidth() / factor));
		}

		for (Lavatory lavatory : ModelHelper.getChildrenByClass(cabin,
				Lavatory.class)) {
			graphicsControl.setBackground(salmon);
			graphicsControl.fillRectangle(
					(int) (xZero + lavatory.getXPosition() / factor),
					(int) (yZero + lavatory.getYPosition() / factor),
					(int) (lavatory.getXDimension() / factor),
					(int) (lavatory.getYDimension() / factor));
			graphicsControl.drawImage(
					lavatoryIcon,
					(int) (xZero + (lavatory.getXPosition()
							+ lavatory.getXDimension() / 2 - lavatory
							.getYDimension() * PASSENGER_CIRCLE_SIZE / 2)
							/ factor),
					(int) (yZero + (lavatory.getYPosition()
							+ lavatory.getYDimension() / 2 - lavatory
							.getYDimension() * PASSENGER_CIRCLE_SIZE / 2)
							/ factor));

		}

		for (Galley galley : ModelHelper
				.getChildrenByClass(cabin, Galley.class)) {
			graphicsControl.setBackground(green);
			graphicsControl.fillRectangle((int) (xZero + galley.getXPosition()
					/ factor), (int) (yZero + galley.getYPosition() / factor),
					(int) (galley.getXDimension() / factor),
					(int) (galley.getYDimension() / factor));
			graphicsControl.drawImage(
					coffeeIcon,
					(int) (xZero + (galley.getXPosition()
							+ galley.getXDimension() / 2 - galley
							.getYDimension() / 4) / factor),
					(int) (yZero + (galley.getYPosition()
							+ galley.getYDimension() / 2 - galley
							.getYDimension() / 4) / factor));
		}

		for (Curtain curtain : ModelHelper.getChildrenByClass(cabin,
				Curtain.class)) {
			graphicsControl.setBackground(black);
			if (curtain.isCurtainOpen()) {
				graphicsControl.fillRectangle(
						(int) (xZero + curtain.getXPosition() / factor),
						(int) (yZero + curtain.getYPosition() / factor),
						(int) (curtain.getXDimension() / factor),
						(int) (curtain.getYDimension() / factor));
				graphicsControl.fillRectangle(
						(int) (xZero + (cabin.getCabinWidth()
								- curtain.getXPosition() - curtain
									.getXDimension()) / factor),
						(int) (yZero + curtain.getYPosition() / factor),
						(int) (curtain.getXDimension() / factor),
						(int) (curtain.getYDimension() / factor));
			} else {
				graphicsControl.fillRectangle(
						(int) (xZero + curtain.getXPosition() / factor),
						(int) (yZero + curtain.getYPosition() / factor),
						(int) (cabin.getCabinWidth() / factor),
						(int) (curtain.getYDimension() / factor));
			}
		}
		if (!cabin.getPassengers().isEmpty()) { // &&drawCabin.getGraphicSettings().isShowOccupiedSeats())
			// {
			for (Passenger passenger : ModelHelper.getChildrenByClass(cabin,
					Passenger.class)) {
				Seat passengerSeat = passenger.getSeatRef();
				Vector color = calculateColor(passenger);
				graphicsControl.setBackground(new Color(parent.getDisplay(),
						color.getX(), color.getY(), color.getZ()));
				// e.gc.setBackground(black);
				if (passengerSeat.getYDimension() < passengerSeat
						.getXDimension()) {
					graphicsControl
							.fillOval(
									(int) (xZero + (passengerSeat
											.getXPosition()
											+ passengerSeat.getXDimension() / 2 - passengerSeat
											.getYDimension()
											* PASSENGER_CIRCLE_SIZE / 2)
											/ factor),
									(int) (yZero + (passengerSeat
											.getYPosition() + (1 - PASSENGER_CIRCLE_SIZE)
											* passengerSeat.getYDimension() / 2)
											/ factor),
									(int) (PASSENGER_CIRCLE_SIZE
											* passengerSeat.getYDimension() / factor),
									(int) (PASSENGER_CIRCLE_SIZE
											* passengerSeat.getYDimension() / factor));
				} else {
					graphicsControl
							.fillOval(
									(int) (xZero + (passengerSeat
											.getXPosition() + (1 - PASSENGER_CIRCLE_SIZE)
											* passengerSeat.getXDimension() / 2)
											/ factor),
									(int) (yZero + (passengerSeat
											.getYPosition()
											+ passengerSeat.getYDimension() / 2 - passengerSeat
											.getXDimension()
											* PASSENGER_CIRCLE_SIZE / 2)
											/ factor),
									(int) (PASSENGER_CIRCLE_SIZE
											* passengerSeat.getXDimension() / factor),
									(int) (PASSENGER_CIRCLE_SIZE
											* passengerSeat.getXDimension() / factor));
				}
			}
		}
		graphicsControl.dispose();
		loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		try {
			loader.save(FILEPATH + "aircraft_rendered.png", SWT.IMAGE_PNG);
		} catch (Exception e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"The background image could not be saved! Directory problem."));
		}
		return image;
	}

	/**
	 * This method returns, if the image is generated for the first time or not.
	 * 
	 * @return true or false
	 */
	public boolean isInitialBoot() {
		return initialBoot;
	}

	/**
	 * 
	 * This method initializes all necessary parameters and images.
	 *
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
		/************************* Create Colors and Fonts here *******************************/
		fontsize = 6;
		fontName = "Helvetica Neue";
		red = new Color(parent.getDisplay(), 220, 20, 60);
		salmon = new Color(parent.getDisplay(), 250, 128, 114);
		green = new Color(parent.getDisplay(), 50, 205, 50);
		darkGray = new Color(parent.getDisplay(), 105, 105, 105);
		white = new Color(parent.getDisplay(), 255, 255, 255);
		black = new Color(parent.getDisplay(), 0, 0, 0);
		aircraftBackground = new Color(parent.getDisplay(), 237, 243, 245);
		fontOne = new Font(parent.getDisplay(), fontName, 8, SWT.NORMAL);
		fontTwo = new Font(parent.getDisplay(), fontName, fontsize, SWT.NORMAL);
		fontThree = new Font(parent.getDisplay(), fontName, 9, SWT.NORMAL);
		/*************************************************************************************/

		factor = (double) cabin.getCabinWidth()
				/ (double) CABIN_WIDTH_IN_PIXELS;

		economySeat = SWTResourceManager.getImage(InfoViewPart.class,
				"economy_seat.png");
		businessSeat = SWTResourceManager.getImage(InfoViewPart.class,
				"business_seat.png");
		firstSeat = SWTResourceManager.getImage(InfoViewPart.class,
				"first_seat.png");
		coffeeIcon = SWTResourceManager.getImage(InfoViewPart.class,
				"coffee.png");
		lavatoryIcon = SWTResourceManager.getImage(InfoViewPart.class,
				"Lavatory.png");

		canvas = new Canvas(parent, SWT.RESIZE);
		canvas.setBounds(0, 0, 1000, 1000);

		doTheDraw();

		// int cabinViewFPS = Activator.getDefault().getPreferenceStore()
		// .getString("CabinViewFPS");
		//

	}

	private Image switchAircraftImage() {
		switch (cabin.getAircraftType()) {
		case REGIONAL:
			return SWTResourceManager.getImage(InfoViewPart.class,
					"regional.png");

		case INTERCONTINENTAL:
			return SWTResourceManager.getImage(InfoViewPart.class,
					"intercontinental.png");

		case CONTINENTAL:
			return SWTResourceManager.getImage(InfoViewPart.class,
					"continental.png");
		default:
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"There is a problem with the aircraft type definition."));
			return null;
		}
	}

	/**
	 * This method resizes an image.
	 * 
	 * @param image
	 *            the image
	 * @param width
	 *            the desired width
	 * @param height
	 *            the desired height
	 * @return the scaled image
	 */
	private Image resize(Image image, int width, int height) {
		Image scaledImage = new Image(parent.getDisplay(), width, height);
		GC gc = new GC(scaledImage);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(image, 0, 0, image.getBounds().width,
				image.getBounds().height, 0, 0, width, height);
		gc.dispose();
		image.dispose();
		return scaledImage;
	}

	private Image resizeAC(int width, int height) {
		Image scaledImage = new Image(parent.getDisplay(), width, height);
		GC gc = new GC(scaledImage);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(switchAircraftImage(), 0, 0, switchAircraftImage()
				.getBounds().width, switchAircraftImage().getBounds().height,
				0, 0, width, height);
		gc.dispose();
		return scaledImage;
	}

	private Image tryAircraftSwitch() {
		try {
			return resizeAC((int) (imageX * canvasHeight / imageY),
					(int) (imageY * canvasHeight / imageY));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling aircraft image. No image found."));
			return null;
		}
	}

	/**
	 * This method catches a cabin.
	 * 
	 * @param cabin
	 *            is the caught cabin
	 */
	public void setCabin(Cabin cabin) {
		initialBoot = false;
		this.cabin = cabin;
		xZero = 139;
		yZero = 75;
		canvasHeight = 0;
		canvasHeight = canvas.getBounds().height;
		factor = (double) cabin.getCabinWidth()
				/ (double) CABIN_WIDTH_IN_PIXELS
				/ (double) (canvasHeight / imageY);
		xZero = (int) (xZero * (canvasHeight / imageY));
		yZero = (int) (yZero * (canvasHeight / imageY));

		/**
		 * NOTE: if there is more than one subclass of the same type, only the
		 * dimensions of the first element are used for scaling
		 **/

		try {
			firstSeat = resize(firstSeat, (int) (ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getSeatWidth() / factor), (int) (ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getSeatLength() / factor));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat image. No first class found."));
		}
		try {
			businessSeat = resize(businessSeat, (int) (ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class).get(0)
					.getSeatWidth() / factor), (int) (ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class).get(0)
					.getSeatLength() / factor));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat images. No business class found."));
		}
		try {
			economySeat = resize(economySeat, (int) (ModelHelper
					.getChildrenByClass(cabin, EconomyClass.class).get(0)
					.getSeatWidth() / factor), (int) (ModelHelper
					.getChildrenByClass(cabin, EconomyClass.class).get(0)
					.getSeatLength() / factor));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat images. No economy class found."));
		}
		try {
			coffeeIcon = resize(coffeeIcon, (int) (ModelHelper
					.getChildrenByClass(cabin, Galley.class).get(0)
					.getYDimension()
					/ factor / 2),
					(int) (ModelHelper.getChildrenByClass(cabin, Galley.class)
							.get(0).getYDimension()
							/ factor * PASSENGER_CIRCLE_SIZE));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat images. No galley found."));
		}
		try {
			lavatoryIcon = resize(lavatoryIcon, (int) (ModelHelper
					.getChildrenByClass(cabin, Lavatory.class).get(0)
					.getYDimension()
					/ factor / 2),
					(int) (ModelHelper
							.getChildrenByClass(cabin, Lavatory.class).get(0)
							.getYDimension()
							/ factor * PASSENGER_CIRCLE_SIZE));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat images. No lavatory found."));
		}
		cabinAdapter = new AdapterImpl() {
			public void notifyChanged(Notification notification) {
				if (!notification.isTouch()) {
					doTheDraw();
				}
			}
		};
		img = createImage();
		syncViewer();
		doTheDraw();
	}

	/**
	 * This method synchronizes the cabin view with the cabin object by
	 * listening to its change events.
	 */
	public void syncViewer() {
		if ((cabinAdapter != null)
				&& (!cabin.eAdapters().contains(cabinAdapter))) {
			cabin.eAdapters().add(cabinAdapter);
		}

	}

	/**
	 * This method unsyncs the Cabin view with the cabin object by removing the
	 * event listener form the cabin object.
	 */
	public void unsyncViewer() {
		if ((cabinAdapter != null)
				&& (cabin.eAdapters().contains(cabinAdapter))) {

			cabin.eAdapters().remove(cabinAdapter);
		}
	}

	/**
	 * This method catches an obstacle map and generates an image from it.
	 * 
	 * @param obstacleMap
	 *            is the obstacle map
	 * @return returns the obstacle map as an image
	 */
	public Image submitObstacleMap(final int[][] obstacleMap) {
		Image image = new Image(parent.getDisplay(), imageX, imageY);
		final int overLapOfRect = 2;
		GC graphicsControl = new GC(image);
		graphicsControl.setAntialias(SWT.ON);
		graphicsControl.setInterpolation(SWT.HIGH);
		graphicsControl.drawImage(img, 0, 0);
		graphicsControl.setAlpha(100);
		for (int i = 0; i < (int) (cabin.getCabinWidth() / cabin.getScale()); i++) {
			for (int j = 0; j < (int) (cabin.getCabinLength() / cabin
					.getScale()); j++) {

				if (obstacleMap[i][j] <= ObstacleMap.getHoleValue()) {
					/*
					 * set the hole color in the aisles to green
					 */
					graphicsControl.setBackground(new Color(
							parent.getDisplay(), 0, 255, 0));
				} else if (obstacleMap[i][j] <= ObstacleMap.getBasicValue()) {
					/*
					 * set the color of the basic value to a lighter green
					 */
					graphicsControl.setBackground(new Color(
							parent.getDisplay(), 122, 255, 0));
				} else if (obstacleMap[i][j] < ObstacleMap.getPotentialValue()) {
					/*
					 * set the color of the potential gradient to yellow
					 */
					graphicsControl.setBackground(new Color(
							parent.getDisplay(), 255, 255, 0));
				} else if (obstacleMap[i][j] == ObstacleMap.getPotentialValue()) {
					/*
					 * set the color of the potential maximum to orange
					 */
					graphicsControl.setBackground(new Color(
							parent.getDisplay(), 255, 122, 0));
				} else {
					/*
					 * set the color of obstacles to red
					 */
					graphicsControl.setBackground(red);
				}
				graphicsControl.fillOval(xZero
						+ (int) (i * cabin.getScale() / factor), yZero
						+ (int) (j * cabin.getScale() / factor),
						(int) (overLapOfRect * cabin.getScale() / factor),
						(int) (overLapOfRect * cabin.getScale() / factor));
			}
		}
		graphicsControl.setAlpha(255);
		graphicsControl.dispose();
		loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		try {
			loader.save(FILEPATH + "obstaclemap.png", SWT.IMAGE_PNG);
		} catch (Exception e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"The obstacle map could not be saved! Directory problem."));
		}
		disposeAll();
		return image;
	}

	/**
	 * This method gets the paths.
	 * 
	 * @param pathList
	 *            the list of paths
	 */
	public void submitPath(final ArrayList<int[][]> pathList) {
		parent.redraw();
		parent.update();
		canvas.redraw();

		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				e.gc.setAntialias(SWT.ON);
				e.gc.setInterpolation(SWT.HIGH);
				e.gc.setLineWidth(2);
				for (int l = 0; l < pathList.size(); l++) {
					final int[][] singlePath = pathList.get(l);
					int[] pathPoints = new int[2 * singlePath.length];
					int k = 0;
					int i = 0;
					while (k < 2 * singlePath.length) {
						pathPoints[k] = xZero
								+ (int) (singlePath[i][0] * cabin.getScale() / factor);
						pathPoints[k + 1] = yZero
								+ (int) (singlePath[i][1] * cabin.getScale() / factor);
						k = k + 2;
						i++;
					}
					e.gc.drawPolyline(pathPoints);
					pathPoints = null;
				}
				e.gc.setLineWidth(1);
			}
		});
		disposeAll();
	}

	/**
	 * This method generates the passenger circles.
	 * 
	 * @param paxCabin
	 *            the cabin object
	 */
	public void submitPassengerCoordinates(final Cabin paxCabin) {
		parent.redraw();
		parent.update();
		canvas.redraw();
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				for (Passenger pass : ModelHelper.getChildrenByClass(paxCabin,
						Passenger.class)) {
					Vector color = calculateColor(pass);
					e.gc.setBackground(new Color(e.display, color.getX(), color
							.getY(), color.getZ()));
					if (!pass.isIsSeated()) {
						if (!((pass.getPositionX() == 0) && (pass
								.getPositionY() == 0))) {
							Vector vector = getDirectionVector(pass);
							e.gc.fillOval(
									xZero
											+ (int) ((pass.getPositionX() - pass
													.getWidth() / 2) / factor),
									yZero
											+ (int) ((pass.getPositionY() - pass
													.getDepth() / 2) / factor),
									(int) (pass.getWidth() / factor),
									(int) (pass.getDepth() / factor));

							int lineLength = 3;
							e.gc.drawLine(
									xZero
											+ (int) (pass.getPositionX() / factor),
									yZero
											+ (int) (pass.getPositionY() / factor),
									xZero
											+ (int) (pass.getPositionX() / factor)
											+ lineLength * (vector.getX() / 5),
									yZero
											+ (int) (pass.getPositionY() / factor)
											+ lineLength * (vector.getY() / 5));
						}
					} else {
						Seat mySeat = pass.getSeatRef();
						e.gc.fillOval(
								xZero
										+ (int) ((mySeat.getXPosition()
												+ mySeat.getXDimension() / 2 - pass
												.getWidth() / 2) / factor),
								yZero
										+ (int) ((mySeat.getYPosition()
												+ mySeat.getYDimension() / 2 - pass
												.getDepth() / 2) / factor),
								(int) (pass.getWidth() / factor),
								(int) (pass.getDepth() / factor));
					}
				}
			}
		});
		disposeAll();
	}

	/**
	 * This method draws the obstacle map image to the canvas.
	 * 
	 * @param obstacleImage
	 *            the obstacle map image
	 */
	public void printObstacleMap(final Image obstacleImage) {
		parent.redraw();
		parent.update();
		canvas.redraw();
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				e.gc.drawImage(obstacleImage, 0, 0);
			}
		});
		disposeAll();
	}

	/**
	 * This method runs the complete draw of the view.
	 */
	private void doTheDraw() {

		// factor = cabin.getCabinWidth() / CABIN_WIDTH_IN_PIXELS;
		parent.redraw();
		parent.update();
		canvas.redraw();
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {

				e.gc.setAlpha(255);
				e.gc.setFont(fontOne);
				e.gc.setBackground(white);

				e.gc.setFont(fontTwo);
				e.gc.setBackground(black);

				if (!initialBoot) {
					e.gc.drawImage(img, 0, 0);

				} else {
					// Image image = SWTResourceManager.getImage(
					// InfoViewPart.class, "regional.png");
					e.gc.drawImage(
							resizeAC(canvas.getBounds().width,
									canvas.getBounds().height), 0, 0);
					e.gc.setFont(fontThree);
					e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_RED));
					e.gc.fillRectangle(38, 370, 300, 35);
					e.gc.drawText(
							"Please refresh cabin view or generate a new cabin!",
							50, 380);
				}
			}
		});
		disposeAll();
	}

	/**
	 * NOTE: FACTORS ARE SCALED BY 100, YOU NEED TO DIVIDE IT BY 100 IN ORDER TO
	 * GET THE REAL FACTORS.
	 * 
	 * @param passenger
	 * @return
	 */
	private Vector getDirectionVector(Passenger passenger) {
		int rotation = (int) passenger.getOrientationInDegree();
		int factor = 5;
		if (rotation == 0) {
			return new Vector(0, -10);
		} else if (rotation <= 45) {
			return new Vector(factor, -factor);
		} else if (rotation <= 90) {
			return new Vector(10, 0);
		} else if (rotation <= 135) {
			return new Vector(factor, factor);
		} else if (rotation <= 180) {
			return new Vector(0, 10);
		} else if (rotation <= 225) {
			return new Vector(-factor, factor);
		} else if (rotation <= 270) {
			return new Vector(-10, 0);
		} else if (rotation <= 315) {
			return new Vector(-factor, -factor);
		} else {
			return new Vector(0, 0);
		}
	}

	/**
	 * This method calculates the color of the passenger and seat. It is
	 * calculated by a formula and the passenger id.
	 * 
	 * @param pax
	 *            the passenger
	 * @return the color code represented by a three dimensional vector
	 */
	private Vector calculateColor(Passenger pax) {
		int randInt = pax.getId() % 6;
		int colorDefine = (pax.getId() % 13) * 20 + 15;
		switch (randInt) {
		case 0:
			return new Vector(255, 0, colorDefine);
		case 1:
			return new Vector(255, colorDefine, 0);
		case 2:
			return new Vector(0, 255, colorDefine);
		case 3:
			return new Vector(colorDefine, 255, 0);
		case 4:
			return new Vector(0, colorDefine, 255);
		case 5:
			return new Vector(colorDefine, 0, 255);
		default:
			return new Vector(255, 255, 255);
		}
	}

	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
	}

	private void disposeAll() {
		super.dispose();

	}

}