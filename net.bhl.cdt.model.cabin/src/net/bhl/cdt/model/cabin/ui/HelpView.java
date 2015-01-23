package net.bhl.cdt.model.cabin.ui;

import javax.swing.*;

import net.bhl.cdt.model.astar.AreaMap;
import net.bhl.cdt.model.astar.CostMap;
import net.bhl.cdt.model.astar.ObstacleMap;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.util.FunctionLibrary;
import net.bhl.cdt.model.cabin.util.Vector;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Formatter;

public class HelpView extends JPanel {
	private static final int BOX_WIDTH = 720;
	private static final int BOX_HEIGHT = 1000;
	private CostMap costmap;
	private Vector dimensions;
	private Vector newPointHelp;
	private int fontHeight = 10;
	private int squareDimension = 20;
	ArrayList<Vector> pointspace = new ArrayList<Vector>();

	public HelpView(AreaMap areamap, Vector dimensions) {
		this.dimensions = dimensions;
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
		costmap = new CostMap(dimensions, new Vector(0, 14), areamap, true);
		Thread gameThread = new Thread() {

			public void run() {
				while (button.isEnabled()) {
					try {
						costmap.copyPoints();
						for (Vector newPoint : costmap.pointParking) {
							pointspace.add(newPoint);
							costmap.createSurroundingCosts(newPoint);
							newPointHelp = newPoint;
							repaint();
							Thread.sleep(10);
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
//				if (x < 36 && y < 100) {
//					if (CostMap.getCostForCoordinates(x, y) != ObstacleMap
//							.getValueAtPoint(x, y)) {
//						g.setColor(Color.ORANGE);
//					}
//				}
				for (Vector point : pointspace) {
					if (point.getX() == x && point.getY() == y) {
						g.setColor(Color.BLUE);
					}
				}
				for (Vector point : costmap.pointParkingHelper) {
					if (point.getX() == x && point.getY() == y) {
						g.setColor(Color.GREEN);
					}
				}

				if (newPointHelp.getX() == x && newPointHelp.getY() == y) {
					g.setColor(Color.RED);
				}
				
				if (CostMap.getCostForCoordinates(x, y) == -1) {
					g.setColor(Color.DARK_GRAY);
					g.fillRect(x * squareDimension - squareCorrectX, y
							* squareDimension - squareCorrectY,
							squareDimension, squareDimension);
				} else {

					g.fillRect(x * squareDimension - squareCorrectX, y
							* squareDimension - squareCorrectY,
							squareDimension, squareDimension);
					g.setColor(Color.BLACK);
					g.drawString(CostMap.getCostForCoordinates(x, y) + "", x
							* squareDimension, y * squareDimension);

				}
			}
		}
	}
}
