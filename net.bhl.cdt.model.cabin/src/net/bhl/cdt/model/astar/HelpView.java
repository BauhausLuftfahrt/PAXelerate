package net.bhl.cdt.model.astar;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.Formatter;

public class HelpView extends JPanel {

	private static final int BOX_WIDTH = 640;

	private static final int BOX_HEIGHT = 480;

	private static final int UPDATE_RATE = 30; // Number of refresh per second

	private static final int fontScale = 20;

	public HelpView() {

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

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g); // Paint background

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		for (int x = 0; x < 50; x++) {
		g.drawString("HALLO!!", x*10, 0);

		}

	}

}
