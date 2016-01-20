package net.bhl.cdt.paxelerate.model.ui;

/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import net.bhl.cdt.paxelerate.util.Func;
import net.bhl.cdt.paxelerate.util.graphics.ColorHelper;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.astar.AreaMap;
import net.bhl.cdt.paxelerate.model.astar.Node;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;

/**
 * This class represents the cabin view. All graphics generation is done here.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */

public class SimulationViewPart extends ViewPart {

	private Composite parent;
	private Canvas canvas;

	private AreaMap areamap;

	private int FONT_SIZE = 10;

	/**
	 * 
	 * This method initializes all necessary parameters and images.
	 *
	 * @param parent
	 *            is the parent element
	 */
	public void createPartControl(final Composite parent) {
		this.parent = parent;
		areamap = null;
		canvas = new Canvas(parent, SWT.RESIZE);
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

					e.gc.setFont(new Font(parent.getDisplay(), "Arial", 8,
							SWT.NONE));

					for (int x = 0; x < areamap.getDimensions().getY(); x++) {
						for (int y = 0; y < areamap.getDimensions().getX(); y++) {

							Node node = areamap.getNodeByCoordinate(y, x);
							e.gc.setForeground(getColor("#000000"));
							if (node.getTypeForPrinting() != null) {
								try {
									if (node.getTypeForPrinting().equals("O")
											|| node.getTypeForPrinting()
													.equals(" ")) {
										e.gc.setForeground(switchColor(SimulationHandler
												.getAgentByPassenger(
														node.getPassenger())
												.getCurrentState()));

										if (!node.isHidden()) {
											e.gc.drawString("O", (x)
													* FONT_SIZE, y * FONT_SIZE);
										}
									} else {
										e.gc.setForeground(getColor("#000000"));
										if (node.getTypeForPrinting() != null) {
											e.gc.drawString(
													node.getTypeForPrinting(),
													(x) * FONT_SIZE, y
															* FONT_SIZE);
										}
									}
								} catch (NullPointerException a) {
									// Should not happen!
								}
							}
						}
					}
				}

			});
		} catch (IllegalArgumentException e) {
			System.out.println("illegal argument exception!");

		}
	}

	public Color switchColor(Agent.State state) {
		switch (state) {
		case FOLLOWING_PATH:
			return getColor("#000000");
		case QUEUEING_UP:
			return getColor("#000000");
		case CLEARING_ROW:
			return getColor("#000000");
		case WAITING_FOR_ROW_CLEARING:
			return getColor("#000000");
		case RETURNING_TO_SEAT:
			return getColor("#000000");
		case STOWING_LUGGAGE:
			return getColor("#000000");
		default:
			return getColor("#000000");
		}
	}

	public void updateUI(AreaMap areamap) {
		this.areamap = areamap;
		doTheDraw();
	}

	private Color getColor(String hex) {
		return new Color(parent.getDisplay(), ColorHelper.hex2Rgb(hex));
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}
