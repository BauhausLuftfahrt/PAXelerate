/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.astar.AreamapHandler;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.ui.graphics.ColorHelper;
import net.bhl.cdt.paxelerate.ui.graphics.SWTHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class represents the heat map view.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */

public class HeatmapPart extends ViewPart {

	/** The cabin. */
	private Cabin cabin;

	/** The parent. */
	private Composite parent;

	/** The canvas. */
	private Canvas canvas;

	/** The img. */
	private static Image img;

	/** The width. */
	private double width;

	/** The maphandler. */
	private AreamapHandler maphandler;

	/** The costmap. */
	private Costmap costmap;

	/** The dimensions. */
	private Vector dimensions;

	/** The mouse down. */
	private boolean mouseDown = false;

	/**
	 * The Enum DrawingMode.
	 */
	private enum DrawingMode {

		/** The floor. */
		FLOOR,
		/** The hole. */
		HOLE,
		/** The obstacle. */
		OBSTACLE,
		/** The gradient. */
		GRADIENT;
	}

	/** The mode. */
	private DrawingMode mode = DrawingMode.FLOOR;

	/**
	 * 
	 * This method initializes all necessary parameters and images.
	 *
	 * @param parent
	 *            is the parent element
	 */
	@Override
	public final void createPartControl(final Composite parent) {
		this.parent = parent;

		canvas = new Canvas(parent, SWT.DOUBLE_BUFFERED);

		canvas.addKeyListener(new org.eclipse.swt.events.KeyAdapter() {

			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == 49) { // 1
					mode = DrawingMode.HOLE;
				}
				if (e.keyCode == 50) { // 2
					mode = DrawingMode.FLOOR;
				}
				if (e.keyCode == 51) { // 3
					mode = DrawingMode.GRADIENT;
				}
				if (e.keyCode == 52) { // 4
					mode = DrawingMode.OBSTACLE;
				}

				if (e.keyCode == 56) { // 8
					drawObstaclemap();
					System.out.println("obstacle map");
				}

				if (e.keyCode == 57) { // 9
					drawCostmap();
					System.out.println("cost map");
				}

				System.out.println("DrawingMode: " + mode.toString());
			};
		});

		canvas.addMouseMoveListener(new MouseMoveListener() {

			@Override
			public void mouseMove(final MouseEvent e) {
				if (mouseDown) {
					System.out.println(e.x + " / " + e.y);
				}

			}
		});

		canvas.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(final MouseEvent e) {

				mouseDown = false;

			}

			@Override
			public void mouseDown(final MouseEvent e) {

				mouseDown = true;

				int value = 0;

				switch (mode) {
				case FLOOR:
					value = AreamapHandler.DEFAULT_VALUE;
					break;
				case HOLE:
					value = AreamapHandler.HOLE_VALUE;
					break;
				case GRADIENT:
					value = AreamapHandler.GRADIENT_UPPER_BOUND;
					break;
				case OBSTACLE:
					value = Integer.MAX_VALUE;
					break;
				default:
					break;

				}

				Vector2D position = new Vector2D(e.y / width, e.x / width);

				for (int x = position.getX() - 1; x <= position.getX() + 1; x++) {
					for (int y = position.getY() - 1; y <= position.getY() + 1; y++) {
						maphandler.getAreamap().get(x, y).setObstacleValue(value);
					}
				}

				drawObstaclemap();

			}

			@Override
			public void mouseDoubleClick(final MouseEvent e) {

			}
		});

	}

	/**
	 * Gets the cabin.
	 *
	 * @return the cabin
	 */
	public final Cabin getCabin() {
		return cabin;
	}

	/**
	 * This method catches a cabin.
	 * 
	 * @param cabin
	 *            is the caught cabin
	 */
	public final void setCabin(final Cabin cabin) {

		this.cabin = cabin;

		dimensions = new Vector2D(cabin.getXDimension() / cabin.getSimulationSettings().getScale(),
				cabin.getYDimension() / cabin.getSimulationSettings().getScale());

		maphandler = new AreamapHandler(dimensions, cabin);

		costmap = new Costmap(dimensions, new Vector2D(16, 0), maphandler.getAreamap(), null, false);

		drawCostmap();
	}

	/**
	 * Draw obstaclemap.
	 */
	public final void drawObstaclemap() {

		Image image = new Image(parent.getDisplay(), canvas.getBounds().width, canvas.getBounds().height);

		final double overlap = 2.5;

		GC gc = new GC(image);

		gc = SWTHelper.getQualitySettings(gc);

		gc.setAlpha(100);

		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {

				int value = maphandler.getAreamap().get(i, j).getObstacleValue();

				if (value <= AreamapHandler.HOLE_VALUE) {
					gc.setBackground(ColorHelper.GREEN);

				} else if (value <= AreamapHandler.DEFAULT_VALUE) {
					gc.setBackground(ColorHelper.GREEN_LIGHT);

				} else if (value <= AreamapHandler.GRADIENT_UPPER_BOUND) {
					gc.setBackground(ColorHelper.YELLOW);

				} else {
					gc.setBackground(ColorHelper.RED);

				}

				width = canvas.getBounds().height / (double) dimensions.getX();

				gc.fillOval((int) (j * width), (int) (i * width), (int) (overlap * width), (int) (overlap * width));
			}
		}
		gc.setAlpha(255);
		gc.dispose();

		disposeAll();

		img = image;

		redraw();
	}

	/**
	 * Draw costmap.
	 */
	public final void drawCostmap() {

		Image image = null;
		try {

			image = new Image(parent.getDisplay(), canvas.getBounds().width, canvas.getBounds().height);

		} catch (IllegalArgumentException e) {
			image = new Image(parent.getDisplay(), 10, 10);
			e.printStackTrace();
		}

		final double overlap = 2.5;

		GC gc = new GC(image);

		gc = SWTHelper.getQualitySettings(gc);

		gc.setAlpha(255);

		int max = costmap.getMaximumCost(); // 424

		double stepsize = 1022.0 / max; // 1.2

		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {

				int value = costmap.getCost(new Vector2D(i, j));

				int colorValue = (int) (value * stepsize);

				// System.out.println(value + " / " + max + " -> " +
				// colorValue);

				if (value == -1) {
					gc.setBackground(ColorHelper.BLACK);

				} else if (colorValue <= 255) {
					/* green to yellow */
					gc.setBackground(new Color(Display.getCurrent(), colorValue, 255, 0));

				} else if (colorValue <= 511) {
					/* yellow to red */
					gc.setBackground(new Color(Display.getCurrent(), 255, 511 - colorValue, 0));

				} else if (colorValue <= 767) {
					/* red to pink */
					gc.setBackground(new Color(Display.getCurrent(), 255, 0, -511 + colorValue));
				} else {

					/* pink to purple */
					gc.setBackground(new Color(Display.getCurrent(), 1022 - colorValue, 0, 255));
				}

				width = canvas.getBounds().height / (double) dimensions.getX();

				gc.fillRectangle((int) (j * width), (int) (i * width), (int) (overlap * width),
						(int) (overlap * width));
			}
		}
		gc.setAlpha(255);
		gc.dispose();

		disposeAll();

		img = image;

		redraw();
	}

	/**
	 * This method runs the complete draw of the view.
	 */
	private void redraw() {
		try {
			canvas.redraw();
			canvas.addPaintListener(new PaintListener() {
				@Override
				public void paintControl(final PaintEvent e) {

					e.gc.setAlpha(255);

					e.gc = SWTHelper.getQualitySettings(e.gc);
					if (img != null) {
						e.gc.drawImage(img, 0, 0);
					}
				}
			});

			System.out.println("redraw!");
			disposeAll();

		} catch (IllegalArgumentException e) {
			System.out.println("illegal argument exception!");
			e.printStackTrace();

		}
	}

	/** * Passing the focus request to the viewer's control. */
	@Override
	public void setFocus() {
		//
	}

	/**
	 * Dispose all.
	 */
	private void disposeAll() {
		super.dispose();
	}
}
