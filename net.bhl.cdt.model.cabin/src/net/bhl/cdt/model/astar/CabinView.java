package net.bhl.cdt.model.astar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CabinView extends JPanel {
	private static final int BOX_WIDTH = 640;
	private static final int BOX_HEIGHT = 480;


	private static final int UPDATE_RATE = 30; // Number of refresh per second
	private static final int fontScale = 10;
	private static final int skipScale = 1; //only renders every xth pixel
	private static final int frameWidth = RunAStar.getMap().getMapWidth()
			* fontScale;
	private static final int frameHeight = RunAStar.getMap().getMapHeight()
			* fontScale;

	public CabinView() {
		this.setPreferredSize(new Dimension(frameHeight, frameWidth));

		
		Thread gameThread = new Thread() {
			public void run() {
				while (true) {
					repaint();
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
		Node node;
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		for (int x = 0; x < (int) (RunAStar.getMap().getMapWidth() / skipScale); x++) {
			if (x == 0) {
				for (int i = 0; i <= (int) (RunAStar.getMap().getMapWidth() / skipScale); i++) {
					g.drawString(" ", x, 0);

				}
			}

			for (int y = 0; y < (int) (RunAStar.getMap().getMapHeight() / skipScale); y++) {
				node = RunAStar.getMap().getNode(x, y);
				if (node.isObstacle) {
					g.drawString("X", y * fontScale, x * fontScale);
				}

				else if (RunAStar.getMap().getNode(x, y).isOccupiedByAgent) {
					g.drawString("¤", y * fontScale, x * fontScale);
				} else {
					g.drawString(" ", y * fontScale, x * fontScale);

				}
				if (y == (int) (RunAStar.getMap().getMapHeight() / skipScale))
					g.drawString("_", x, RunAStar.getMap().getMapHeight());

			}
		}

	}
}