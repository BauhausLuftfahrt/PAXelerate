/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.ui;

import javax.swing.*;

import net.bhl.cdt.paxelerate.astar.AreaMap;
import net.bhl.cdt.paxelerate.astar.CostMap;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class HelpView extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int BOX_WIDTH = 720, BOX_HEIGHT = 1000;
	private CostMap costmap;
	private Vector newPointHelp;
	private int fontHeight = 10, squareDimension = 20;
	private ArrayList<Vector> pointspace = new ArrayList<Vector>();

	/**
	 * 
	 * @param areamap
	 * @param dimensions
	 * @param refresh
	 */
	public HelpView(AreaMap areamap, Vector dimensions, final int refresh) {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));

		final Button button = new Button();
		button.setLabel("abort simulation");
		button.setEnabled(true);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button.setEnabled(false);
			}
		});
		this.add(button);
		costmap = new CostMap(dimensions, new Vector2D(0, 14), areamap, true,
				null, false);
		Thread gameThread = new Thread() {

			public void run() {
				while (button.isEnabled()) {
					try {
						costmap.copyPoints();
						for (Vector newPoint : costmap.getPointParking()) {
							pointspace.add(newPoint);
							costmap.createSurroundingCosts(newPoint);
							newPointHelp = newPoint;
							repaint();
							Thread.sleep(refresh);
						}
						pointspace.clear();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start(); // Callback run()

	}

	@Override
	public void paintComponent(Graphics g) {

		int squareCorrectX = 5;
		int squareCorrectY = 15;

		super.paintComponent(g); // Paint background
		g.setFont(new Font("Courier New", Font.PLAIN, fontHeight));
		for (int x = 0; x < (int) (BOX_WIDTH / squareDimension); x++) {
			for (int y = 0; y < (int) (BOX_HEIGHT / squareDimension); y++) {
				g.setColor(Color.LIGHT_GRAY);
				// if (x < 36 && y < 100) {
				// if (CostMap.getCostForCoordinates(x, y) != ObstacleMap
				// .getValueAtPoint(x, y)) {
				// g.setColor(Color.ORANGE);
				// }
				// }
				for (Vector point : pointspace) {
					if (point.getX() == x && point.getY() == y) {
						g.setColor(Color.BLUE);
					}
				}
				for (Vector point : costmap.getPointParkingHelper()) {
					if (point.getX() == x && point.getY() == y) {
						g.setColor(Color.GREEN);
					}
				}

				if (newPointHelp.getX() == x && newPointHelp.getY() == y) {
					g.setColor(Color.RED);
				}

				if (costmap.getCostForCoordinates(x, y) == -1) {
					g.setColor(Color.DARK_GRAY);
					g.fillRect(x * squareDimension - squareCorrectX, y
							* squareDimension - squareCorrectY,
							squareDimension, squareDimension);
				} else {

					g.fillRect(x * squareDimension - squareCorrectX, y
							* squareDimension - squareCorrectY,
							squareDimension, squareDimension);
					g.setColor(Color.BLACK);
					g.drawString(costmap.getCostForCoordinates(x, y) + "", x
							* squareDimension, y * squareDimension);

				}
			}
		}
	}
}
