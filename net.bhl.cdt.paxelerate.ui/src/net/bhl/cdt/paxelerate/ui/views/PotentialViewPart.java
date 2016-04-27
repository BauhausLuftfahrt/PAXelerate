/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.ViewPart;

import net.bhl.cdt.paxelerate.model.astar.AreamapHandler;
import net.bhl.cdt.paxelerate.ui.color.ColorHelper;
import net.bhl.cdt.paxelerate.ui.font.FontHelper;
import net.bhl.cdt.paxelerate.ui.graphics.SWTHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class represents the potential view. All graphics generation is done
 * here.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class PotentialViewPart extends ViewPart {

	/** The parent. */
	private Composite parent;

	/** The canvas. */
	private Canvas canvas;

	/** The dimensions. */
	private Vector dim = new Vector2D(0, 0);

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
		canvas = new Canvas(parent, SWT.DOUBLE_BUFFERED);

		parent.addListener(SWT.Resize, new Listener() {
			@Override
			public void handleEvent(Event e) {
				dim.setX(parent.getSize().x);
				dim.setY(parent.getSize().y);
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

					int divider = 10;

					int borderTop = 20;

					int height = dim.getY() - 3 * borderTop;

					int scale = height / AreamapHandler.GRADIENT_UPPER_BOUND;

					e.gc = SWTHelper.getQualitySettings(e.gc);

					e.gc.setFont(FontHelper.HEADING3);

					e.gc.setForeground(ColorHelper.GREY_LIGHT);
					e.gc.drawLine(dim.getX() / divider * 3, borderTop, (int) (dim.getX() / divider * 9.2), borderTop);
					String topvalue = "" + AreamapHandler.GRADIENT_UPPER_BOUND;
					e.gc.setForeground(ColorHelper.GREY_DARK);
					e.gc.drawText(topvalue, (int) (dim.getX() / divider * 9.3),
							borderTop - e.gc.textExtent(topvalue).y / 2);

					e.gc.setForeground(ColorHelper.GREY_LIGHT);
					e.gc.drawLine(dim.getX() / divider * 5,
							borderTop + height - scale * AreamapHandler.GRADIENT_LOWER_BOUND,
							(int) (dim.getX() / divider * 9.2),
							borderTop + height - scale * AreamapHandler.GRADIENT_LOWER_BOUND);
					String lowvalue = "" + AreamapHandler.GRADIENT_LOWER_BOUND;
					e.gc.setForeground(ColorHelper.GREY_DARK);
					e.gc.drawText(lowvalue, (int) (dim.getX() / divider * 9.3), borderTop + height
							- scale * AreamapHandler.GRADIENT_LOWER_BOUND - e.gc.textExtent(lowvalue).y / 2);

					e.gc.setForeground(ColorHelper.GREY_LIGHT);
					e.gc.drawLine(dim.getX() / divider * 7, borderTop + height - scale * AreamapHandler.DEFAULT_VALUE,
							(int) (dim.getX() / divider * 9.2),
							borderTop + height - scale * AreamapHandler.DEFAULT_VALUE);
					String defaultvalue = "" + AreamapHandler.DEFAULT_VALUE;
					e.gc.setForeground(ColorHelper.GREY_DARK);
					e.gc.drawText(defaultvalue, (int) (dim.getX() / divider * 9.3), borderTop + height
							- scale * AreamapHandler.DEFAULT_VALUE - e.gc.textExtent(defaultvalue).y / 2);

					e.gc.setForeground(ColorHelper.GREY_LIGHT);

					e.gc.drawLine(dim.getX() / divider * 9, borderTop + height - scale * AreamapHandler.HOLE_VALUE,
							(int) (dim.getX() / divider * 9.2), borderTop + height - scale * AreamapHandler.HOLE_VALUE);
					String holevalue = "" + AreamapHandler.HOLE_VALUE;
					e.gc.setForeground(ColorHelper.GREY_DARK);
					e.gc.drawText(holevalue, (int) (dim.getX() / divider * 9.3),
							borderTop + height - scale * AreamapHandler.HOLE_VALUE - e.gc.textExtent(holevalue).y / 2);

					e.gc.setForeground(ColorHelper.BLACK);

					String[] strings = { "Obstacle", "Gradient", "Default", "Aisle" };

					e.gc.drawText(strings[0],
							dim.getX() / divider + (dim.getX() / divider * 2 - e.gc.textExtent(strings[0]).x) / 2,
							(int) (borderTop * 1.5) + height);
					e.gc.drawText(strings[1],
							dim.getX() / divider * 3 + (dim.getX() / divider * 2 - e.gc.textExtent(strings[1]).x) / 2,
							(int) (borderTop * 1.5) + height);
					e.gc.drawText(strings[2],
							dim.getX() / divider * 5 + (dim.getX() / divider * 2 - e.gc.textExtent(strings[2]).x) / 2,
							(int) (borderTop * 1.5) + height);
					e.gc.drawText(strings[3],
							dim.getX() / divider * 7 + (dim.getX() / divider * 2 - e.gc.textExtent(strings[3]).x) / 2,
							(int) (borderTop * 1.5) + height);

					Pattern pattern = new Pattern(parent.getDisplay(), dim.getX() / divider * 3, borderTop + height,
							dim.getX() / divider * 5, borderTop + height, ColorHelper.ORANGE, ColorHelper.YELLOW);

					e.gc.setBackground(ColorHelper.RED);
					e.gc.fillRectangle(dim.getX() / divider, 0, dim.getX() / divider * 2, height + borderTop);

					int[] polygon = { dim.getX() / divider * 3, borderTop, dim.getX() / divider * 3, borderTop + height,
							dim.getX() / divider * 5, borderTop + height, dim.getX() / divider * 5,
							borderTop + height - scale * AreamapHandler.GRADIENT_LOWER_BOUND };

					e.gc.setBackgroundPattern(pattern);
					e.gc.fillPolygon(polygon);

					e.gc.setForeground(ColorHelper.GREY_DARK);
					String width = "<  " + AreamapHandler.GRADIENT_WIDTH * 10 + " cm  >";
					e.gc.drawText(width, dim.getX() / divider * 4 - e.gc.textExtent(width).x / 2,
							borderTop + height - e.gc.textExtent(width).y - 5);

					e.gc.setBackground(ColorHelper.GREEN_LIGHT);
					e.gc.fillRectangle(dim.getX() / divider * 5,
							borderTop + height - scale * AreamapHandler.DEFAULT_VALUE, dim.getX() / divider * 2,
							scale * AreamapHandler.DEFAULT_VALUE);

					e.gc.setBackground(ColorHelper.GREEN);

					e.gc.fillRectangle(dim.getX() / divider * 7, borderTop + height - scale * AreamapHandler.HOLE_VALUE,
							dim.getX() / divider * 2, scale * AreamapHandler.HOLE_VALUE);

					e.gc.setBackground(ColorHelper.WHITE);
					e.gc.setForeground(ColorHelper.BLACK);

				}
			});
		} catch (

		IllegalArgumentException e) {
			System.out.println("illegal argument exception!");

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// Auto-generated method stub

	}
}