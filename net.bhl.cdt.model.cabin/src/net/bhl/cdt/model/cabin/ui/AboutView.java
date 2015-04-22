package net.bhl.cdt.model.cabin.ui;

import javax.swing.*;

import net.bhl.cdt.model.astar.AreaMap;

import java.awt.*;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AboutView extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int BOX_WIDTH = 1500;
	private static final int BOX_HEIGHT = 300;
	private static final int FONT_SIZE = 8;
	private AreaMap areamap;

	/**
	 * 
	 * @param areamap
	 * @param dimensions
	 * @param refresh
	 */
	public AboutView() {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));

		Thread gameThread = new Thread() {

			public void run() {
				while (true) {
					repaint();
				}
			}
		};
		gameThread.start(); // Callback run()

	}

	public void setAreamap(AreaMap areamap) {
		this.areamap = areamap;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Paint background
		g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));
		for (int x = 0; x < areamap.getDimensions().getY(); x++) {
			for (int y = 0; y < areamap.getDimensions().getX(); y++) {
				g.setColor(Color.LIGHT_GRAY);
				g.drawString(areamap.getNodeByCoordinate(y, x)
						.getTypeForPrinting(), x * FONT_SIZE, y * FONT_SIZE);
			}
		}
	}
}