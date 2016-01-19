/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.ui;

import java.io.File;
import java.util.ArrayList;

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

import com.paxelerate.model.BusinessClass;
import com.paxelerate.model.Cabin;
import com.paxelerate.model.CabinFactory;
import com.paxelerate.model.Curtain;
import com.paxelerate.model.Door;
import com.paxelerate.model.EconomyClass;
import com.paxelerate.model.FirstClass;
import com.paxelerate.model.Galley;
import com.paxelerate.model.Lavatory;
import com.paxelerate.model.Passenger;
import com.paxelerate.model.PhysicalObject;
import com.paxelerate.model.Row;
import com.paxelerate.model.Seat;
import com.paxelerate.model.TravelClass;
import com.paxelerate.model.agent.Agent;
import com.paxelerate.model.astar.ObstacleMap;
import com.paxelerate.model.astar.Path;
import com.paxelerate.util.graphics.*;
import com.paxelerate.util.math.Vector;
import com.paxelerate.util.math.Vector2D;
import com.paxelerate.util.math.Vector3D;

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
	private static final int OFFSET_OF_DOOR = 0, CABIN_WIDTH_IN_PIXELS = 123,
			DOOR_DEPTH = 2;
	private static final double PASSENGER_CIRCLE_SIZE = 0.5;
	private static final boolean MATCH_PASSENGER_COLORS_TO_MOOD = true;

	private static int xZero = 139, yZero = 75, imageX = 400, imageY = 1000;

	/*******************************************************************/

	/************* Create Colors and Fonts here. ***********************/
	private static int fontsize;
	private static String fontName;
	private static Color red, salmon, green, darkGray, white, black,
			aircraftBackground;
	private static Font fontOne, fontTwo, fontThree;
	/********************************************************************/

	private static ILog logger;

	private Image economySeat, businessSeat, firstSeat, coffeeIcon,
			lavatoryIcon;
	private Canvas canvas;
	private Adapter cabinAdapter;
	private ImageLoader loader;
	private static Image img;
	private static final String FOLDER_NAME = "paxelerate", FILE_PATH = System
			.getProperty("user.home") + "/Documents/" + FOLDER_NAME + "/";
	private static File storageFolder = new File(FILE_PATH);
	private double canvasHeight;

	// IPreferenceStore preferenceStore = Activator.getDefault()
	// .getPreferenceStore();
	// String string = preferenceStore.getString("MySTRING1");

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
//		logger = Platform.getLog(Platform.getBundle("com.paxelerate"));
	
		/********** Create Colors and Fonts here ************/
		fontsize = 6;
		fontName = "Helvetica Neue";
		red = SWTResourceManager.getColor(220, 20, 60);
		salmon = SWTResourceManager.getColor(250, 128, 114);
		green = SWTResourceManager.getColor(50, 205, 50);
		darkGray = SWTResourceManager.getColor(105, 105, 105);
		white = SWTResourceManager.getColor(255, 255, 255);
		black = SWTResourceManager.getColor(0, 0, 0);
		aircraftBackground = SWTResourceManager.getColor(237, 243, 245);
		fontOne = SWTResourceManager.getFont(fontName, 8, SWT.NORMAL);
		fontTwo = SWTResourceManager.getFont(fontName, fontsize, SWT.NORMAL);
		fontThree = SWTResourceManager.getFont(fontName, 9, SWT.NORMAL);
		/***************************************************/
	
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
	
	}

	/**
	 * This method returns the defined file path.
	 * 
	 * @return the file path
	 */
	public static String getFilePath() {
		return FILE_PATH;
	}

	/**
	 * This method creates a new directors if it does not exist yet.
	 */
	public static void makeDirectory() {
		if (!storageFolder.exists()) {
			try {
				storageFolder.mkdir();
			} catch (SecurityException se) {
			}
		}
	}

	private Image switchIcon(PhysicalObject obj) {
		if (obj instanceof Lavatory) {
			return lavatoryIcon;
		} else if (obj instanceof Galley) {
			return coffeeIcon;
		} else {
			return null;
		}
	}

	public Cabin getCabin() {
		return cabin;
	}

	private void drawObject(GC gc, Color color, PhysicalObject object) {
		gc.setBackground(color);
		gc.fillRectangle(get(object, XYZ.X), get(object, XYZ.Y),
				adapt(object.getYDimension()), adapt(object.getXDimension()));
		gc.drawImage(switchIcon(object),
				xZero
						+ adapt((object.getYPosition() + object.getYDimension()
								/ 2 - object.getXDimension()
								* PASSENGER_CIRCLE_SIZE / 2)), yZero
						+ adapt((object.getXPosition() + object.getXDimension()
								/ 2 - object.getXDimension()
								* PASSENGER_CIRCLE_SIZE / 2)));
	}

	private enum XYZ {
		X, Y, Z
	}

	private int get(PhysicalObject obj, XYZ dir) {
		switch (dir) {
		case X:
			return xZero + adapt(obj.getYPosition());

		case Y:
			return yZero + adapt(obj.getXPosition());

		default:
			return 0;
		}
	}

	/**
	 * This method creates the background image.
	 * 
	 * @return the background image
	 */
	private Image createImage() {
		Image image = new Image(parent.getDisplay(), imageX, imageY);
		Image newAircraft = tryAircraftSwitch();
		GC gc = new GC(image);
		gc.setFont(fontTwo);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(newAircraft, 0, 0);
		gc.setBackground(aircraftBackground);
		gc.fillRectangle(xZero, yZero, adapt(cabin.getCabinWidth()),
				adapt(cabin.getCabinLength()));
		gc.drawLine(xZero, yZero + (int) (cabin.getCabinLength() / factor),
				xZero + (int) (cabin.getCabinWidth() / factor), yZero
						+ (int) (cabin.getCabinLength() / factor));
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
			if (seat.getTravelClass() instanceof FirstClass) {
				gc.drawImage(firstSeat, get(seat, XYZ.X), get(seat, XYZ.Y));
			} else if (seat.getTravelClass() instanceof BusinessClass) {
				gc.drawImage(businessSeat, get(seat, XYZ.X), get(seat, XYZ.Y));

			} else {
				gc.drawImage(economySeat, get(seat, XYZ.X), get(seat, XYZ.Y));
			}
		}

		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {
			int positionY = (int) ((row.getSeats().get(0).getXPosition()) / factor);
			int positionX = (int) ((cabin.getCabinWidth() / 2) / factor);
			gc.drawText(
					row.getRowNumber() + "",
					xZero
							+ positionX
							- (int) ((gc.textExtent(row.getRowNumber() + "").x) / 2),
					yZero + positionY + 4);
		}

		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {

			gc.setBackground(darkGray);
			if (door.isOnBothSides()) {
				gc.fillRectangle(
						(int) (xZero + OFFSET_OF_DOOR - DOOR_DEPTH + (cabin
								.getCabinWidth()) / factor),
						(int) (yZero + door.getXPosition() / factor),
						(int) (DOOR_DEPTH), (int) (door.getWidth() / factor));
			}
			gc.fillRectangle((int) (xZero - OFFSET_OF_DOOR),
					(int) (yZero + door.getXPosition() / factor),
					(int) (DOOR_DEPTH), (int) (door.getWidth() / factor));
		}

		for (Lavatory lavatory : ModelHelper.getChildrenByClass(cabin,
				Lavatory.class)) {
			drawObject(gc, salmon, lavatory);
		}

		for (Galley galley : ModelHelper
				.getChildrenByClass(cabin, Galley.class)) {
			drawObject(gc, green, galley);
		}

		for (Curtain curtain : ModelHelper.getChildrenByClass(cabin,
				Curtain.class)) {
			gc.setBackground(black);
			gc.fillRectangle((int) (xZero + curtain.getYPosition() / factor),
					(int) (yZero + curtain.getXPosition() / factor),
					(int) (curtain.getYDimension() / factor),
					(int) (curtain.getXDimension() / factor));
		}
		if (!cabin.getPassengers().isEmpty()) {
			for (Passenger passenger : cabin.getPassengers()) {
				Seat passengerSeat = passenger.getSeatRef();

				if (MATCH_PASSENGER_COLORS_TO_MOOD) {
					switch (passenger.getPassengerMood()) {
					case AGRESSIVE:
						gc.setBackground(red);
						break;
					case PASSIVE:
						gc.setBackground(green);
						break;
					}
				} else {
					Vector colorVector = ColorHelper.calculateColor(passenger
							.getId());
					gc.setBackground(SWTResourceManager.getColor(
							colorVector.getX(), colorVector.getY(),
							colorVector.getZ()));
				}

				if (passengerSeat.getXDimension() < passengerSeat
						.getYDimension()) {
					gc.fillOval(
							(int) (xZero + (passengerSeat.getYPosition()
									+ passengerSeat.getYDimension() / 2 - passengerSeat
									.getXDimension()
									* PASSENGER_CIRCLE_SIZE
									/ 2) / factor),
							(int) (yZero + (passengerSeat.getXPosition() + (1 - PASSENGER_CIRCLE_SIZE)
									* passengerSeat.getXDimension() / 2)
									/ factor),
							adapt(PASSENGER_CIRCLE_SIZE
									* passengerSeat.getXDimension()),
							(int) (PASSENGER_CIRCLE_SIZE
									* passengerSeat.getXDimension() / factor));
				} else {
					gc.fillOval(
							(int) (xZero + (passengerSeat.getYPosition() + (1 - PASSENGER_CIRCLE_SIZE)
									* passengerSeat.getYDimension() / 2)
									/ factor),
							(int) (yZero + (passengerSeat.getXPosition()
									+ passengerSeat.getXDimension() / 2 - passengerSeat
									.getYDimension()
									* PASSENGER_CIRCLE_SIZE
									/ 2) / factor),
							(int) (PASSENGER_CIRCLE_SIZE
									* passengerSeat.getYDimension() / factor),
							(int) (PASSENGER_CIRCLE_SIZE
									* passengerSeat.getYDimension() / factor));
				}
			}
		}
		gc.dispose();
		loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		try {
			loader.save(FILE_PATH + "aircraft_rendered.png", SWT.IMAGE_PNG);
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

	ArrayList<Class<? extends TravelClass>> classes = new ArrayList<Class<? extends TravelClass>>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add(FirstClass.class);
			add(BusinessClass.class);
			add(EconomyClass.class);
		}
	};

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

		// TODO: implement this!

		// for (Class<? extends TravelClass> className : classes) {
		// if (!ModelHelper.getChildrenByClass(cabin, className).isEmpty()) {
		// firstSeat = resize(firstSeat, (int) (ModelHelper
		// .getChildrenByClass(cabin, className).get(0)
		// .getSeatWidth() / factor), (int) (ModelHelper
		// .getChildrenByClass(cabin, className).get(0)
		// .getSeatLength() / factor));
		// }
		// }

		if (!ModelHelper.getChildrenByClass(cabin, FirstClass.class).isEmpty()) {
			firstSeat = resize(firstSeat, (int) (ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getSeatWidth() / factor), (int) (ModelHelper
					.getChildrenByClass(cabin, FirstClass.class).get(0)
					.getSeatLength() / factor));
		}
		if (!ModelHelper.getChildrenByClass(cabin, BusinessClass.class)
				.isEmpty()) {
			businessSeat = resize(businessSeat, (int) (ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class).get(0)
					.getSeatWidth() / factor), (int) (ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class).get(0)
					.getSeatLength() / factor));
		}
		if (!ModelHelper.getChildrenByClass(cabin, EconomyClass.class)
				.isEmpty()) {
			economySeat = resize(economySeat, (int) (ModelHelper
					.getChildrenByClass(cabin, EconomyClass.class).get(0)
					.getSeatWidth() / factor), (int) (ModelHelper
					.getChildrenByClass(cabin, EconomyClass.class).get(0)
					.getSeatLength() / factor));
		}
		try {
			coffeeIcon = resize(coffeeIcon, (int) (ModelHelper
					.getChildrenByClass(cabin, Galley.class).get(0)
					.getXDimension()
					/ factor / 2),
					(int) (ModelHelper.getChildrenByClass(cabin, Galley.class)
							.get(0).getXDimension()
							/ factor * PASSENGER_CIRCLE_SIZE));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat images. No galley found."));
		}
		try {
			lavatoryIcon = resize(lavatoryIcon, (int) (ModelHelper
					.getChildrenByClass(cabin, Lavatory.class).get(0)
					.getXDimension()
					/ factor / 2),
					(int) (ModelHelper
							.getChildrenByClass(cabin, Lavatory.class).get(0)
							.getXDimension()
							/ factor * PASSENGER_CIRCLE_SIZE));
		} catch (IndexOutOfBoundsException e) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Error scaling seat images. No lavatory found."));
		}
		cabinAdapter = new AdapterImpl() {
			public void notifyChanged(Notification notification) {
				if (!notification.isTouch()) {
					// TODO: I DEACTIVATED THIS!
					// doTheDraw();
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
		GC gc = new GC(image);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(img, 0, 0);
		gc.setAlpha(100);
		for (int i = 0; i < (int) (cabin.getCabinWidth() / cabin.getScale()); i++) {
			for (int j = 0; j < (int) (cabin.getCabinLength() / cabin
					.getScale()); j++) {

				if (obstacleMap[i][j] <= ObstacleMap.getHoleValue()) {
					/*
					 * set the hole color in the aisles to green
					 */
					gc.setBackground(new Color(parent.getDisplay(), 0, 255, 0));
				} else if (obstacleMap[i][j] <= ObstacleMap.getBasicValue()) {
					/*
					 * set the color of the basic value to a lighter green
					 */
					gc.setBackground(new Color(parent.getDisplay(), 122, 255, 0));
				} else if (obstacleMap[i][j] < ObstacleMap.getPotentialValue()) {
					/*
					 * set the color of the potential gradient to yellow
					 */
					gc.setBackground(new Color(parent.getDisplay(), 255, 255, 0));
				} else if (obstacleMap[i][j] == ObstacleMap.getPotentialValue()) {
					/*
					 * set the color of the potential maximum to orange
					 */
					gc.setBackground(new Color(parent.getDisplay(), 255, 122, 0));
				} else {
					/*
					 * set the color of obstacles to red
					 */
					gc.setBackground(red);
				}
				gc.fillOval(xZero + (int) (i * cabin.getScale() / factor),
						yZero + (int) (j * cabin.getScale() / factor),
						(int) (overLapOfRect * cabin.getScale() / factor),
						(int) (overLapOfRect * cabin.getScale() / factor));
			}
		}
		gc.setAlpha(255);
		gc.dispose();
		loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		try {
			loader.save(FILE_PATH + "obstaclemap.png", SWT.IMAGE_PNG);
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
	public void submitAgents(final ArrayList<Agent> agentList) {
		parent.redraw();
		parent.update();
		canvas.redraw();

		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				e.gc.setAntialias(SWT.ON);
				e.gc.setInterpolation(SWT.HIGH);
				e.gc.setLineWidth(2);
				for (int l = 0; l < agentList.size(); l++) {
					for (Path singlePath : agentList.get(l).getPathList()) {
						int[] pathPoints = new int[2 * singlePath.getLength()];
						int k = 0;
						int i = 0;
						while (k < 2 * singlePath.getLength()) {
							pathPoints[k] = xZero
									+ (int) (singlePath.get(i).getPosition()
											.getX()
											* cabin.getScale() / factor);
							pathPoints[k + 1] = yZero
									+ (int) (singlePath.get(i).getPosition()
											.getY()
											* cabin.getScale() / factor);
							k = k + 2;
							i++;
						}
						e.gc.drawPolyline(pathPoints);
						pathPoints = null;
					}
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
					if (MATCH_PASSENGER_COLORS_TO_MOOD) {
						switch (pass.getPassengerMood()) {
						case AGRESSIVE:
							e.gc.setBackground(red);
							break;
						case PASSIVE:
							e.gc.setBackground(green);
							break;
						}
					} else {
						Vector colorVector = ColorHelper.calculateColor(pass
								.getId());
						e.gc.setBackground(SWTResourceManager.getColor(
								colorVector.getX(), colorVector.getY(),
								colorVector.getZ()));
					}
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
		try {
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
						e.gc.drawImage(
								resizeAC(canvas.getBounds().width,
										canvas.getBounds().height), 0, 0);
						e.gc.setFont(fontThree);
						e.gc.setBackground(e.display
								.getSystemColor(SWT.COLOR_RED));
						e.gc.fillRectangle(38, 370, 300, 35);
						e.gc.drawText(
								"Please refresh cabin view or generate a new cabin!",
								50, 380);
					}
				}
			});
			disposeAll();
		} catch (IllegalArgumentException e) {
			System.out.println("illegal argument exception!");

		}
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
			return new Vector2D(0, -10);
		} else if (rotation <= 45) {
			return new Vector2D(factor, -factor);
		} else if (rotation <= 90) {
			return new Vector2D(10, 0);
		} else if (rotation <= 135) {
			return new Vector2D(factor, factor);
		} else if (rotation <= 180) {
			return new Vector2D(0, 10);
		} else if (rotation <= 225) {
			return new Vector2D(-factor, factor);
		} else if (rotation <= 270) {
			return new Vector2D(-10, 0);
		} else if (rotation <= 315) {
			return new Vector2D(-factor, -factor);
		} else {
			return new Vector2D(0, 0);
		}
	}

	private int adapt(double value) {
		return (int) (value / factor);
	}

	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
	}

	private void disposeAll() {
		super.dispose();

	}

	/**
	 * This method disposes all SWT objects created with SWTResourceManager.
	 */
	public void clearCache() {
		System.out.println("clearing cache now");
		// SWTResourceManager.dispose();
	}
}