package net.bhl.cdt.model.astar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;

/**
 * 
 * @author marc.engelmann
 *
 */
public class CostMapView extends JPanel {
	private static final int BOX_WIDTH = 100;
	private static final int BOX_HEIGHT = 120;

	private static final int UPDATE_RATE = 30; // Number of refresh per second
	private static final int FONTSCALE = 10;
	private static final int SKIPSCALE = 1; // only renders every xth pixel
	private static final int frameWidth = BOX_WIDTH * FONTSCALE;
	private static final int frameHeight = BOX_HEIGHT * FONTSCALE;
	private CostMap costmap;
	private AreaMap areamap;
	private int[][] obstaclemap;
	private Cabin cabin;

	public CostMapView() {
		this.setPreferredSize(new Dimension(frameHeight, frameWidth));
		cabin = CabinFactory.eINSTANCE.createCabin();
		cabin.setCabinWidth(BOX_WIDTH);
		cabin.setCabinLength(BOX_HEIGHT);
		cabin.setScale(1);
		FirstClass pClass = CabinFactory.eINSTANCE.createFirstClass();
		cabin.getFirstClasses().add(pClass);
		Row row = CabinFactory.eINSTANCE.createRow();
		pClass.getRows().add(row);
		Seat seat = CabinFactory.eINSTANCE.createSeat();
		row.getSeats().add(seat);
		seat.setXPosition(10);
		seat.setYPosition(10);
		seat.setXDimension(80);
		seat.setYDimension(2);
		ObstacleMap map = new ObstacleMap(cabin);
		areamap = new AreaMap(BOX_WIDTH, BOX_HEIGHT, map.getMap());
		costmap = new CostMap(BOX_WIDTH, BOX_HEIGHT, 3, 3, 60, 70, areamap);
		Thread gameThread = new Thread() {
			public void run() {
				while (true) {
					try {
						costmap.floodMapStep();
						repaint();
						Thread.sleep(30);

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

		super.paintComponent(g); // Paint background
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, frameHeight, frameWidth);
		g.setColor(Color.GRAY);
		g.setFont(new Font("Helvetica", Font.PLAIN, 8));
		for (int x = 0; x < BOX_WIDTH; x++) {
			for (int y = 0; y < BOX_HEIGHT; y++) {
				int value = costmap.getCostForCoordinates(x, y);
				if (value == -1) {

					g.fillRect(y * FONTSCALE, x * FONTSCALE, FONTSCALE,
							FONTSCALE);
				} else if (value == 1) {
				} else {
					g.setColor(Color.LIGHT_GRAY);
					// g.fillRect(y * fontScale, x *
					// fontScale,fontScale,fontScale);
					g.drawString("" + value, y * FONTSCALE, x * FONTSCALE);
				}
			}
		}
	}
}