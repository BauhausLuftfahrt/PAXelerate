package model;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Formatter;

public class CabinView extends JPanel {
	private static final int BOX_WIDTH = 640;
	private static final int BOX_HEIGHT = 480;


	private static final int UPDATE_RATE = 30; // Number of refresh per second
	private static final int fontScale = 20;
	private static final int frameWidth = TestAStar.map.getMapWidth()
			* fontScale;
	private static final int frameHeight = TestAStar.map.getMapHeight()
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
		for (int x = 0; x < TestAStar.map.getMapWidth(); x++) {
			if (x == 0) {
				for (int i = 0; i <= TestAStar.map.getMapWidth(); i++) {
					g.drawString("-", x, 0);

				}
			}

			for (int y = 0; y < TestAStar.map.getMapHeight(); y++) {
				node = TestAStar.map.getNode(x, y);
				if (node.isObstacle) {
					g.drawString("X", y * fontScale, x * fontScale);
				}

				else if (TestAStar.map.getNode(x, y).isOccupiedByAgent) {
					g.drawString("¤", y * fontScale, x * fontScale);
				} else {
					g.drawString(" ", y * fontScale, x * fontScale);

				}
				if (y == TestAStar.map.getMapHeight())
					g.drawString("_", x, TestAStar.map.getMapHeight());

			}
		}

	}
}