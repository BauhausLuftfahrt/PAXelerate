/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.ui;

import java.text.DecimalFormat;
import java.util.ArrayList;

import net.bhl.cdt.model.astar.ObstacleMap;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.Vector;
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
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
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

public class CabinViewPart extends ViewPart {
	private Cabin cabin;
	private double factor;
	private Composite parent;
	private boolean initialBoot = true;
	private boolean ObstacleMapSubmitted = true;

	/********************* graphical settings. *************************/
	private static final int OFFSET_OF_DOOR = 0;
	private static final double PASSENGER_CIRCLE_SIZE = 0.75;

	private int cabinY;
	private static final int CABIN_WIDTH_IN_PIXELS = 96;
	private static final int X_ZERO = 138;
	private static final int Y_ZERO = 90;
	private static final int DOOR_DEPTH = 2;
	/*******************************************************************/

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
	private Image economySeat;
	private Image businessSeat;
	private Image firstSeat;
	private Canvas canvas;
	private Adapter cabinAdapter;
	private ImageLoader loader;
	private static Image img;

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

	private Image createImage() {
		Image image = new Image(parent.getDisplay(), 373, 885);
		GC graphicsControl = new GC(image);
		graphicsControl.setFont(fontTwo);
		graphicsControl.setAntialias(SWT.ON);
		graphicsControl.setInterpolation(SWT.HIGH);
		graphicsControl.drawImage(aircraft, 0, 0);
		graphicsControl.drawText("this image is rendered!", 0, 0);
		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {

			if (seat.getTravelClass() instanceof FirstClass) {
				graphicsControl.drawImage(firstSeat,
						(int) (X_ZERO + seat.getXPosition() / factor),
						(int) (Y_ZERO + seat.getYPosition() / factor));
			} else if (seat.getTravelClass() instanceof BusinessClass) {
				graphicsControl.drawImage(businessSeat,
						(int) (X_ZERO + seat.getXPosition() / factor),
						(int) (Y_ZERO + seat.getYPosition() / factor));

			} else {
				graphicsControl.drawImage(economySeat,
						(int) (X_ZERO + seat.getXPosition() / factor),
						(int) (Y_ZERO + seat.getYPosition() / factor));
			}
		}

		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			graphicsControl.setBackground(darkGray);
			if (door.isOnBothSides()) {
				graphicsControl.fillRectangle((int) (X_ZERO + OFFSET_OF_DOOR
						- DOOR_DEPTH + (cabin.getCabinWidth()) / factor),
						(int) (Y_ZERO + door.getYPosition() / factor),
						(int) (DOOR_DEPTH), (int) (door.getWidth() / factor));
			}
			graphicsControl.fillRectangle((int) (X_ZERO - OFFSET_OF_DOOR),
					(int) (Y_ZERO + door.getYPosition() / factor),
					(int) (DOOR_DEPTH), (int) (door.getWidth() / factor));
		}

		for (Lavatory lavatory : ModelHelper.getChildrenByClass(cabin,
				Lavatory.class)) {
			graphicsControl.setBackground(salmon);
			graphicsControl.fillRectangle(
					(int) (X_ZERO + lavatory.getXPosition() / factor),
					(int) (Y_ZERO + lavatory.getYPosition() / factor),
					(int) (lavatory.getXDimension() / factor),
					(int) (lavatory.getYDimension() / factor));
			graphicsControl
					.drawText(
							"WC",
							(int) (X_ZERO - fontsize + (lavatory.getXPosition() + lavatory
									.getXDimension() / 2) / factor),
							(int) (Y_ZERO - fontsize + (lavatory.getYPosition() + lavatory
									.getYDimension() / 2) / factor));

		}

		for (Galley galley : ModelHelper
				.getChildrenByClass(cabin, Galley.class)) {
			graphicsControl.setBackground(green);
			graphicsControl.fillRectangle((int) (X_ZERO + galley.getXPosition()
					/ factor), (int) (Y_ZERO + galley.getYPosition() / factor),
					(int) (galley.getXDimension() / factor),
					(int) (galley.getYDimension() / factor));
			graphicsControl
					.drawText(
							"Galley",
							(int) (X_ZERO - fontsize - 8 + (galley
									.getXPosition() + galley.getXDimension() / 2)
									/ factor),
							(int) (Y_ZERO - fontsize + (galley.getYPosition() + galley
									.getYDimension() / 2) / factor));
		}

		for (Curtain curtain : ModelHelper.getChildrenByClass(cabin,
				Curtain.class)) {
			graphicsControl.setBackground(black);
			if (curtain.isCurtainOpen()) {
				graphicsControl.fillRectangle(
						(int) (X_ZERO + curtain.getXPosition() / factor),
						(int) (Y_ZERO + curtain.getYPosition() / factor),
						(int) (curtain.getXDimension() / factor),
						(int) (curtain.getYDimension() / factor));
				graphicsControl.fillRectangle(
						(int) (X_ZERO + (cabin.getCabinWidth()
								- curtain.getXPosition() - curtain
									.getXDimension()) / factor),
						(int) (Y_ZERO + curtain.getYPosition() / factor),
						(int) (curtain.getXDimension() / factor),
						(int) (curtain.getYDimension() / factor));
			} else {
				graphicsControl.fillRectangle(
						(int) (X_ZERO + curtain.getXPosition() / factor),
						(int) (Y_ZERO + curtain.getYPosition() / factor),
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
									(int) (X_ZERO + (passengerSeat
											.getXPosition()
											+ passengerSeat.getXDimension() / 2 - passengerSeat
											.getYDimension()
											* PASSENGER_CIRCLE_SIZE / 2)
											/ factor),
									(int) (Y_ZERO + (passengerSeat
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
									(int) (X_ZERO + (passengerSeat
											.getXPosition() + (1 - PASSENGER_CIRCLE_SIZE)
											* passengerSeat.getXDimension() / 2)
											/ factor),
									(int) (Y_ZERO + (passengerSeat
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
		loader.save(
				"T:\\Marc Engelmann\\aircraft_images\\aircraft_rendered.png",
				SWT.IMAGE_PNG);
		System.out.println("Image generated!");
		return image;
	}

	/**
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();
		oneMeter = 47;
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

		factor = 364 / CABIN_WIDTH_IN_PIXELS;

		aircraft = new Image(parent.getDisplay(),
				"T:\\Marc Engelmann\\aircraft_images\\bhl_with_ground.png");
		economySeat = new Image(parent.getDisplay(),
				"T:\\Marc Engelmann\\aircraft_images\\economy_seat.png");
		businessSeat = new Image(parent.getDisplay(),
				"T:\\Marc Engelmann\\aircraft_images\\business_seat.png");
		firstSeat = new Image(parent.getDisplay(),
				"T:\\Marc Engelmann\\aircraft_images\\first_seat.png");
		

		
		canvas = new Canvas(parent, SWT.RESIZE);
		doTheDraw();

		// int cabinViewFPS = Activator.getDefault().getPreferenceStore()
		// .getString("CabinViewFPS");
		//

	}

	private Image resize(Image image, int width, int height) {
		Image scaled = new Image(parent.getDisplay(), width, height);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(image, 0, 0, image.getBounds().width,
				image.getBounds().height, 0, 0, width, height);
		gc.dispose();
		image.dispose();
		return scaled;
	}

	/**
	 * This method catches a cabin.
	 * 
	 * @param cabin
	 *            is the catched cabin
	 */
	public void setCabin(Cabin cabin) {
		initialBoot = false;
		this.cabin = cabin;
		
		factor = cabin.getCabinWidth()  / CABIN_WIDTH_IN_PIXELS;
		firstSeat = resize(firstSeat, (int) (cabin.getClasses().get(0)
				.getSeatWidth() / factor), (int) (cabin.getClasses().get(0)
				.getSeatLength() / factor));
		businessSeat = resize(businessSeat, (int) (cabin.getClasses()
				.get(1).getSeatWidth() / factor), (int) (cabin.getClasses()
				.get(1).getSeatLength() / factor));
		economySeat = resize(economySeat, (int) (cabin.getClasses().get(3)
				.getSeatWidth() / factor), (int) (cabin.getClasses().get(3)
				.getSeatLength() / factor));
		
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
	 */
	public Image submitObstacleMap(final int[][] obstacleMap) {
		Image image = new Image(parent.getDisplay(), 373, 885);
		final int overLapOfRect = 2;
		GC graphicsControl = new GC(image);
		graphicsControl.setAntialias(SWT.ON);
		graphicsControl.setInterpolation(SWT.HIGH);
		graphicsControl.setAlpha(100);
		for (int i = 0; i < (int) (cabin.getCabinWidth() / cabin.getScale()); i++) {
			for (int j = 0; j < (int) (cabin.getCabinLength() / cabin
					.getScale()); j++) {
				if (obstacleMap[i][j] <= ObstacleMap.getBasicValue()) {
					int colorFactor = obstacleMap[i][j]
							* (int) (255 / (ObstacleMap.getBasicValue()));
					if (colorFactor > 255) {
						colorFactor = 255;
					}
					graphicsControl.setBackground(new Color(
							parent.getDisplay(), colorFactor, 255, 0));
				} else if (obstacleMap[i][j] <= ObstacleMap.getBasicValue() * 5) {
					int colorFactor = 255 - obstacleMap[i][j]
							* (int) (255 / ObstacleMap.getBasicValue() / 5);
					if (colorFactor < 0) {
						colorFactor = 0;
					}
					graphicsControl.setBackground(new Color(
							parent.getDisplay(), 255, colorFactor, 0));
				} else {
					graphicsControl.setBackground(red);
				}
				graphicsControl.fillOval(X_ZERO
						+ (int) (i * cabin.getScale() / factor), Y_ZERO
						+ (int) (j * cabin.getScale() / factor),
						(int) (overLapOfRect * cabin.getScale() / factor),
						(int) (overLapOfRect * cabin.getScale() / factor));
			}
		}
		graphicsControl.setAlpha(255);
		graphicsControl.dispose();
		loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		loader.save("T:\\Marc Engelmann\\aircraft_images\\obstaclemap.png",
				SWT.IMAGE_PNG);
		disposeAll();
		return image;
	}

	/**
	 * 
	 * @param pathList
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
					// System.out.println(l+" -> Length: "+singlePath.length);
					int[] pathPoints = new int[2 * singlePath.length];
					int k = 0;
					int i = 0;
					while (k < 2 * singlePath.length) {
						// System.out.println("k = "+k);
						pathPoints[k] = X_ZERO
								+ (int) (singlePath[i][0] * cabin.getScale() / factor);
						// System.out.println("pathPoint(k) = "+pathPoints[k]);
						pathPoints[k + 1] = Y_ZERO
								+ (int) (singlePath[i][1] * cabin.getScale() / factor);
						// System.out.println("pathPoint(k+1) = "+pathPoints[k+1]);
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
				// e.gc.setAntialias(SWT.ON);
				// e.gc.setInterpolation(SWT.HIGH);
				for (Passenger pass : ModelHelper.getChildrenByClass(paxCabin,
						Passenger.class)) {
					Vector color = calculateColor(pass);
					e.gc.setBackground(new Color(e.display, color.getX(), color
							.getY(), color.getZ()));
					// e.gc.setBackground(black);
					if (!pass.isIsSeated()) {
						if (!((pass.getPositionX() == 0) && (pass
								.getPositionY() == 0))) {
							Vector vector = getDirectionVector(pass);
							e.gc.fillOval(
									X_ZERO
											+ (int) ((pass.getPositionX() - pass
													.getWidth() / 2) / factor),
									Y_ZERO
											+ (int) ((pass.getPositionY() - pass
													.getDepth() / 2) / factor),
									(int) (pass.getWidth() / factor),
									(int) (pass.getDepth() / factor));

							int lineLength = 3;
							e.gc.drawLine(
									X_ZERO
											+ (int) (pass.getPositionX() / factor),
									Y_ZERO
											+ (int) (pass.getPositionY() / factor),
									X_ZERO
											+ (int) (pass.getPositionX() / factor)
											+ lineLength * (vector.getX() / 5),
									Y_ZERO
											+ (int) (pass.getPositionY() / factor)
											+ lineLength * (vector.getY() / 5));
						}
					} else {
						Seat mySeat = pass.getSeatRef();
						e.gc.fillOval(
								X_ZERO
										+ (int) ((mySeat.getXPosition()
												+ mySeat.getXDimension() / 2 - pass
												.getWidth() / 2) / factor),
								Y_ZERO
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
	 * 
	 */
	private void doTheDraw() {
		
		
		factor = cabin.getCabinWidth() / CABIN_WIDTH_IN_PIXELS;
		parent.redraw();
		parent.update();
		canvas.redraw();
		if (cabin.getClasses().isEmpty()) {
			cabinY = 636;
		} else {
			cabinY = (int) (cabin.getCabinLength() / factor);
		}
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
					e.gc.drawImage(aircraft, 0, 0);
					e.gc.setFont(fontThree);
					e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_RED));
					e.gc.fillRectangle(38, 370, 300, 35);
					e.gc.drawText(
							"Please refresh cabin view or generate a new cabin!",
							50, 380);
				}
			}
		});

		// drawDescriptions();
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
	 * 
	 * @param pax
	 * @return
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