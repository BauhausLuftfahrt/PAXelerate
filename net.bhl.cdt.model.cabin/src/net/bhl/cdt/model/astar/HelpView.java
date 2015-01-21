package net.bhl.cdt.model.astar;

import javax.swing.*;

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

	private static final int BOX_WIDTH = 600;

	private static final int BOX_HEIGHT = 600;

	private static final int UPDATE_RATE = 30; // Number of refresh per second

	private static final int fontScale = 20;

	private CostMap costmap;
	private CostMap comparemap;
	private Vector dimensions;
	private Vector newPointHelp;
	
	ArrayList <Vector> pointspace = new ArrayList<Vector>();

	public HelpView(AreaMap areamap, Vector dimensions) {
		this.dimensions = dimensions;
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));

		costmap = new CostMap(dimensions, new Vector(0, 14), areamap, true);
		comparemap = costmap; 
		Thread gameThread = new Thread() {

			public void run() {

				while (true) {
					try {
						costmap.copyPoints();
						
						for (Vector newPoint : costmap.pointParking) {
							pointspace.add(newPoint);
							costmap.createSurroundingCosts(newPoint);
							newPointHelp = newPoint;
							repaint();
							Thread.sleep(500);
						}				
						pointspace.clear();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block

						e.printStackTrace();
					}
				}

			}

		};
		gameThread.start(); // Callback run()

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g); // Paint background
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		for (int x = 0; x < 25; x++) {
			for (int y = 0; y < 20; y++) {
				g.setColor(Color.BLACK);
				for(Vector point: pointspace) {
					if(point.getX() == x && point.getY() == y ) {
						g.setColor(Color.BLUE);
					}
				}
				for(Vector point: costmap.pointParkingHelper) {
					if(point.getX() == x && point.getY() == y ) {
						g.setColor(Color.GREEN);
					}
				}
				
				if(newPointHelp.getX() == x && newPointHelp.getY() == y) {
					g.setColor(Color.RED);
				}
				
				g.drawString(costmap.getCostForCoordinates(x, y) + "", x * 25,
						y * 25);
			}
		}

	}

}
