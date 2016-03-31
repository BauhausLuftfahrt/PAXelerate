/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.astar.ObstacleMap;
import net.bhl.cdt.paxelerate.model.astar.Path;
import net.bhl.cdt.paxelerate.model.util.TCHelper;
import net.bhl.cdt.paxelerate.ui.color.ColorHelper;
import net.bhl.cdt.paxelerate.ui.font.FontHelper;
import net.bhl.cdt.paxelerate.ui.graphics.SWTHelper;
import net.bhl.cdt.paxelerate.ui.image.ImageHelper;
import net.bhl.cdt.paxelerate.ui.image.ImageImporter;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class represents the cabin view. All graphics generation is done here.
 * 
 * @author marc.engelmann, raoul.rothfeld
 */

public class CabinViewPart extends ViewPart {
	private Cabin cabin;
	private double factor, canvasHeight;
	private Composite parent;

	private static boolean initialBoot = true;

	/********************* graphical settings. *************************/
	private static final int OFFSET_OF_DOOR = 0, CABIN_WIDTH_IN_PIXELS = 123, DOOR_DEPTH = 2, ICON_SIZE_IN_PIXELS = 15;
	private static final double PAX_SIZE = 0.5;
	private static final boolean MATCH_PASSENGER_COLORS_TO_MOOD = true;

	private static int xZero = 139, yZero = 75, imageX = 400, imageY = 1000;
	/*******************************************************************/

	private Image economySeat, businessSeat, firstSeat, galleyIcon, lavatoryIcon;
	private Canvas canvas;
	private Adapter cabinAdapter;
	private ImageLoader loader;
	private static Image img;
	private static final String FOLDER_NAME = "paxelerate",
			FILE_PATH = System.getProperty("user.home") + "/.cdt/" + FOLDER_NAME + "/",
			IMAGE_PATH = "/images/aircraft/interior/";
	private static File storageFolder = new File(FILE_PATH);

	private int scaledX, scaledY;

	/**
	 * 
	 * This method initializes all necessary parameters and images.
	 *
	 * @param parent
	 *            is the parent element
	 */
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		cabin = CabinFactory.eINSTANCE.createCabin();

		factor = cabin.getYDimension() / (double) CABIN_WIDTH_IN_PIXELS;

		economySeat = ImageImporter.getImage(getClass(), IMAGE_PATH + "economy_seat.png");
		businessSeat = ImageImporter.getImage(getClass(), IMAGE_PATH + "business_seat.png");
		firstSeat = ImageImporter.getImage(getClass(), IMAGE_PATH + "first_seat.png");
		galleyIcon = ImageImporter.getImage(getClass(), IMAGE_PATH + "coffee.png");
		lavatoryIcon = ImageImporter.getImage(getClass(), IMAGE_PATH + "lavatory.png");

		canvas = new Canvas(parent, SWT.DOUBLE_BUFFERED);
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

	/**
	 * 
	 * @param obj
	 * @return
	 */
	private Image switchIcon(PhysicalObject obj) {

		if (obj instanceof Lavatory) {
			return lavatoryIcon;
		} else if (obj instanceof Galley) {
			return galleyIcon;
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Cabin getCabin() {
		return cabin;
	}

	/**
	 * 
	 * @param gc
	 * @param obj
	 */
	private void drawObject(GC gc, PhysicalObject obj) {
		gc.fillRectangle(get(obj, Axis.X), get(obj, Axis.Y), adapt(obj.getYDimension()), adapt(obj.getXDimension()));
		gc.drawImage(switchIcon(obj),
				adapt(Axis.X,
						obj.getYPosition() + obj.getYDimension() / 2 - switchIcon(obj).getBounds().width / 2 * factor),
				adapt(Axis.Y, obj.getXPosition() + obj.getXDimension() / 2
						- switchIcon(obj).getBounds().height / 2 * factor));
	}

	/**
	 * 
	 * @author marc.engelmann
	 *
	 */
	private enum Axis {
		X, Y, Z
	}

	/**
	 * 
	 * @param obj
	 * @param dir
	 * @return
	 */
	private int get(PhysicalObject obj, Axis dir) {
		switch (dir) {
		case X:
			return adapt(Axis.X, obj.getYPosition());

		case Y:
			return adapt(Axis.Y, obj.getXPosition());

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
		Image image = new Image(parent.getDisplay(), scaledX, scaledY);
		Image newAircraft = tryAircraftSwitch();
		GC gc = new GC(image);
		gc.setFont(FontHelper.PARAGRAPH);

		gc = SWTHelper.getQualitySettings(gc);

		gc.drawImage(newAircraft, 0, 0);
		gc.setBackground(ColorHelper.AIRCRAFT_FLOOR);
		gc.fillRectangle(xZero, yZero, adapt(cabin.getYDimension()), adapt(cabin.getXDimension()));
		gc.drawLine(xZero, adapt(Axis.Y, cabin.getXDimension()), adapt(Axis.X, cabin.getYDimension()),
				adapt(Axis.Y, cabin.getXDimension()));

		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
			if (seat.getTravelClass().getClassType() == TravelOption.FIRST_CLASS) {
				gc.drawImage(firstSeat, get(seat, Axis.X), get(seat, Axis.Y));
			} else if (seat.getTravelClass().getClassType() == TravelOption.BUSINESS_CLASS) {
				gc.drawImage(businessSeat, get(seat, Axis.X), get(seat, Axis.Y));
			} else {
				gc.drawImage(economySeat, get(seat, Axis.X), get(seat, Axis.Y));
			}
		}

		for (Row row : ModelHelper.getChildrenByClass(cabin, Row.class)) {
			int positionY = adapt((row.getSeats().get(0).getXPosition()));
			int positionX = adapt((cabin.getYDimension() / 2));
			gc.drawText(row.getRowNumber() + "", xZero + positionX - (gc.textExtent(row.getRowNumber() + "").x) / 2,
					yZero + positionY + 4);
		}

		for (Door door : cabin.getDoors()) {

			gc.setBackground(ColorHelper.GREY_DARK);

			if (door.isOnBothSides()) {
				gc.fillRectangle(adapt(Axis.X, OFFSET_OF_DOOR - DOOR_DEPTH + cabin.getYDimension()),
						adapt(Axis.Y, door.getXPosition()), DOOR_DEPTH, adapt(door.getWidth()));
			}
			gc.fillRectangle(xZero - OFFSET_OF_DOOR, adapt(Axis.Y, door.getXPosition()), DOOR_DEPTH,
					adapt(door.getWidth()));
		}

		for (Lavatory lavatory : cabin.getLavatories()) {
			gc.setBackground(ColorHelper.AIRCRAFT_LAVATORY);
			drawObject(gc, lavatory);
		}

		for (Galley galley : cabin.getGalleys()) {
			gc.setBackground(ColorHelper.GREEN);
			drawObject(gc, galley);
		}

		for (Curtain curtain : cabin.getCurtains()) {
			gc.setBackground(ColorHelper.BLACK);
			gc.fillRectangle(adapt(Axis.X, curtain.getYPosition()), adapt(Axis.Y, curtain.getXPosition()),
					adapt(curtain.getYDimension()), adapt(curtain.getXDimension()));
		}
		if (!cabin.getPassengers().isEmpty()) {
			for (Passenger passenger : cabin.getPassengers()) {
				Seat seat = passenger.getSeatRef();

				switch (passenger.getPassengerMood()) {
				case AGRESSIVE:
					gc.setBackground(ColorHelper.RED);
					break;
				case PASSIVE:
					gc.setBackground(ColorHelper.GREEN);
					break;
				}

				int yPos = seat.getYPosition();
				int xPos = seat.getXPosition();
				int yDim = seat.getYDimension();
				int xDim = seat.getXDimension();

				if (xDim < yDim) {
					gc.fillOval(adapt(Axis.X, yPos + yDim / 2 - xDim * PAX_SIZE / 2),
							adapt(Axis.Y, xPos + (1 - PAX_SIZE) * xDim / 2), adapt(PAX_SIZE * xDim),
							adapt(PAX_SIZE * xDim));
				} else {
					gc.fillOval(adapt(Axis.X, yPos + (1 - PAX_SIZE) * yDim / 2),
							adapt(Axis.Y, xPos + xDim / 2 - yDim * PAX_SIZE / 2), adapt(PAX_SIZE * yDim),
							adapt(PAX_SIZE * yDim));
				}
			}
		}
		gc.dispose();
		// Temporarily do not save image
		// loader = new ImageLoader();
		// loader.data = new ImageData[] { image.getImageData() };
		// try {
		// loader.save(FILE_PATH + "aircraft_rendered.png", SWT.IMAGE_PNG);
		// } catch (Exception e) {
		// Log.add(this,
		// "The background image could not be saved! Directory problem.");
		// }
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
	 * @return
	 */
	private Image switchAircraftImage() {
		switch (cabin.getAircraftType()) {
		case REGIONAL:
			return ImageImporter.getImage(getClass(), "/images/aircraft/regional.png");

		case WIDEBODY:
			return ImageImporter.getImage(getClass(), "/images/aircraft/intercontinental.png");

		case NARROWBODY:
			return ImageImporter.getImage(getClass(), "/images/aircraft/continental.png");
		default:
			Log.add(this, "There is a problem with the aircraft type definition.");
			return null;
		}
	}

	/**
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	private Image resizeAC(int width, int height) {
		Image scaledImage = new Image(parent.getDisplay(), width, height);
		GC gc = new GC(scaledImage);

		gc = SWTHelper.getQualitySettings(gc);

		gc.drawImage(switchAircraftImage(), 0, 0, switchAircraftImage().getBounds().width,
				switchAircraftImage().getBounds().height, 0, 0, width, height);
		gc.dispose();
		return scaledImage;
	}

	/**
	 * 
	 * @return
	 */
	private Image tryAircraftSwitch() {
		return resizeAC((int) (imageX * canvasHeight / imageY), (int) (imageY * canvasHeight / imageY));
	}

	/**
	 * This method catches a cabin.
	 * 
	 * @param cabin
	 *            is the caught cabin
	 */
	public void setCabin(Cabin cabin) {
		try {
			initialBoot = false;
			this.cabin = cabin;
			xZero = 139;
			yZero = 75;
			canvasHeight = canvas.getBounds().height;
			factor = (double) cabin.getYDimension() / (double) CABIN_WIDTH_IN_PIXELS / (canvasHeight / imageY);
			xZero = (int) (xZero * (canvasHeight / imageY));
			yZero = (int) (yZero * (canvasHeight / imageY));

			/**
			 * NOTE: if there is more than one subclass of the same type, only
			 * the dimensions of the first element are used for scaling
			 **/

			for (TravelOption option : TravelOption.VALUES) {
				List<TravelClass> list = TCHelper.getClassesByOption(option, cabin);

				if (!list.isEmpty()) {
					int dim = adapt(list.get(0).getYDimensionOfSeats());

					switch (option) {
					case FIRST_CLASS:
						firstSeat = ImageHelper.resize(firstSeat, dim, dim, parent);
					case BUSINESS_CLASS:
						businessSeat = ImageHelper.resize(businessSeat, dim, dim, parent);
					case ECONOMY_CLASS:
						economySeat = ImageHelper.resize(economySeat, dim, dim, parent);
					default:
					}
				}
			}

			for (ObjectOption option : ObjectOption.VALUES) {

				switch (option) {
				case GALLEY:
					galleyIcon = ImageHelper.resize(galleyIcon, ICON_SIZE_IN_PIXELS, ICON_SIZE_IN_PIXELS, parent);
					break;
				case LAVATORY:
					lavatoryIcon = ImageHelper.resize(lavatoryIcon, ICON_SIZE_IN_PIXELS, ICON_SIZE_IN_PIXELS, parent);
					break;
				default:
					break;
				}
			}

			// TODO: @Raoul: This is actually quite important as it enables
			// automatic redraws when changing the EMF model in the explorer.
			// Should be reactivated soon!

			// cabinAdapter = new AdapterImpl() {
			// @Override
			// public void notifyChanged(Notification notification) {
			// if (!notification.isTouch()) {
			// doTheDraw();
			// }
			// }
			// };

			img = createImage();
			syncViewer();
			doTheDraw();
		} catch (Exception e) {
			Log.add(this, "ERROR in setCabin()");
			e.printStackTrace();
		}
	}

	/**
	 * This method synchronizes the cabin view with the cabin object by
	 * listening to its change events.
	 */
	public void syncViewer() {
		if ((cabinAdapter != null) && (!cabin.eAdapters().contains(cabinAdapter))) {
			cabin.eAdapters().add(cabinAdapter);
		}

	}

	/**
	 * This method unsyncs the Cabin view with the cabin object by removing the
	 * event listener form the cabin object.
	 */
	public void unsyncViewer() {
		if ((cabinAdapter != null) && (cabin.eAdapters().contains(cabinAdapter))) {

			cabin.eAdapters().remove(cabinAdapter);
		}
	}

	/**
	 * This method catches an obstacle map and generates an image from it.
	 * 
	 * @param map
	 *            is the obstacle map
	 * @return returns the obstacle map as an image
	 */
	public Image submitObstacleMap(final int[][] map) {
		Image image = new Image(parent.getDisplay(), imageX, imageY);
		final int overLapOfRect = 2;
		GC gc = new GC(image);

		gc = SWTHelper.getQualitySettings(gc);

		gc.drawImage(img, 0, 0);
		gc.setAlpha(100);
		for (int i = 0; i < cabin.getXDimension() / cabin.getScale(); i++) {
			for (int j = 0; j < cabin.getYDimension() / cabin.getScale(); j++) {

				if (map[i][j] <= ObstacleMap.getHoleValue()) {
					gc.setBackground(ColorHelper.GREEN);

				} else if (map[i][j] <= ObstacleMap.getBasicValue()) {
					gc.setBackground(ColorHelper.GREEN_LIGHT);

				} else if (map[i][j] < ObstacleMap.getPotentialValue()) {
					gc.setBackground(ColorHelper.YELLOW);

				} else if (map[i][j] == ObstacleMap.getPotentialValue()) {
					gc.setBackground(ColorHelper.ORANGE);

				} else {
					gc.setBackground(ColorHelper.RED);

				}
				gc.fillOval(xZero + (int) (j * scale()), yZero + (int) (i * scale()), (int) (overLapOfRect * scale()),
						(int) (overLapOfRect * scale()));
			}
		}
		gc.setAlpha(255);
		gc.dispose();
		loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		try {
			loader.save(FILE_PATH + "obstaclemap.png", SWT.IMAGE_PNG);
		} catch (Exception e) {
			Log.add(this, "The obstacle map could not be saved! Directory problem.");
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
		canvas.redraw();

		canvas.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(final PaintEvent e) {

				e.gc = SWTHelper.getQualitySettings(e.gc);

				e.gc.setLineWidth(2);
				for (int l = 0; l < agentList.size(); l++) {
					for (Path path : agentList.get(l).getPathList()) {
						if (path != null) {
							int[] points = new int[2 * path.getLength()];
							int k = 0;
							int i = 0;
							while (k < 2 * path.getLength()) {
								points[k] = xZero + (int) (path.get(i).getPosition().getY() * scale());
								points[k + 1] = yZero + (int) (path.get(i).getPosition().getX() * scale());
								k = k + 2;
								i++;
							}
							e.gc.drawPolyline(points);
							points = null;
						}
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
		canvas.redraw();
		canvas.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(final PaintEvent e) {

				e.gc = SWTHelper.getQualitySettings(e.gc);

				for (Passenger passenger : paxCabin.getPassengers()) {
					if (MATCH_PASSENGER_COLORS_TO_MOOD) {
						switch (passenger.getPassengerMood()) {
						case AGRESSIVE:
							e.gc.setBackground(ColorHelper.RED);
							break;
						case PASSIVE:
							e.gc.setBackground(ColorHelper.GREEN);
							break;
						}
					} else {
						e.gc.setBackground(ColorHelper.getRandomColor());
					}
					if (!passenger.isIsSeated()) {
						if (!((passenger.getPositionX() == 0) && (passenger.getPositionY() == 0))) {
							Vector vector = getDirectionVector(passenger);
							e.gc.fillOval(adapt(Axis.X, (passenger.getPositionX() - passenger.getWidth() / 2)),
									adapt(Axis.Y, (passenger.getPositionY() - passenger.getDepth() / 2)),
									adapt(passenger.getWidth()), adapt(passenger.getDepth()));

							int lineLength = 3;
							e.gc.drawLine(adapt(Axis.X, passenger.getPositionX()),
									adapt(Axis.Y, passenger.getPositionY()),
									adapt(Axis.X, passenger.getPositionX()) + lineLength * (vector.getX() / 5),
									adapt(Axis.Y, passenger.getPositionY()) + lineLength * (vector.getY() / 5));
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
		canvas.redraw();
		canvas.addPaintListener(new PaintListener() {
			@Override
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
			canvas.redraw();
			canvas.addPaintListener(new PaintListener() {
				@Override
				public void paintControl(final PaintEvent e) {

					e.gc.setAlpha(255);

					e.gc = SWTHelper.getQualitySettings(e.gc);

					e.gc.setFont(FontHelper.PARAGRAPH);
					e.gc.setBackground(ColorHelper.BLACK);

					/*
					 * always maintain the correct aspect ratio of the image
					 */
					float scale = canvas.getBounds().width / (float) imageX;
					scaledX = (int) (imageX * scale);
					scaledY = (int) (imageY * scale);

					/*
					 * if the scaling causes the image to overflow the canvas,
					 * it is scaled differently
					 */
					if (canvas.getBounds().height < scaledY) {
						scale = canvas.getBounds().height / (float) imageY;
						scaledX = (int) (imageX * scale);
						scaledY = (int) (imageY * scale);
					}

					if (!initialBoot) {

						e.gc.drawImage(ImageHelper.resize(img, scaledX, scaledY, parent), 0, 0);

					} else {

						e.gc.drawImage(resizeAC(scaledX, scaledY), 0, 0);
						e.gc.setFont(FontHelper.HEADING2);
						e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_RED));
						e.gc.fillRectangle((int) (scaledX * 0.1), (int) (scaledY * 0.45), (int) (scaledX * 0.8),
								(int) (scaledY * 0.1));

						/* Warning string and its dimensions */
						String warningString = "Refresh required!";
						int stringWidth = e.gc.stringExtent(warningString).x;
						int stringHeight = e.gc.stringExtent(warningString).y;

						e.gc.drawText(warningString, (int) (scaledX * 0.1 + (scaledX * 0.8 - stringWidth) / 2),
								(int) (scaledY * 0.45 + (scaledY * 0.1 - stringHeight) / 2));
					}
				}
			});
			System.out.println("redraw!");
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

	/**
	 * 
	 * @return
	 */
	private double scale() {
		return cabin.getScale() / factor;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	private int adapt(double value) {
		return (int) (value / factor);
	}

	/**
	 * 
	 * @param axis
	 * @param value
	 * @return
	 */
	private int adapt(Axis axis, double value) {
		switch (axis) {
		case X:
			return xZero + (int) (value / factor);
		case Y:
			return yZero + (int) (value / factor);
		default:
			return 0;
		}

	}

	/** * Passing the focus request to the viewer's control. */
	@Override
	public void setFocus() {
		//
	}

	/**
	 * 
	 */
	private void disposeAll() {
		super.dispose();
	}

	/**
	 * This method disposes all SWT objects created with SWTResourceManager.
	 */
	public void clearCache() {
		ImageImporter.disposeImages();
	}
}
