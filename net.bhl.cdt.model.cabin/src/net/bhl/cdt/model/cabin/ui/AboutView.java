package net.bhl.cdt.model.cabin.ui;

import javax.swing.*;

import java.awt.*;

public class AboutView extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int BOX_WIDTH = 400;
	private static final int BOX_HEIGHT = 300;
	private int fontHeight = 10;

	/**
	 * 
	 * @param areamap
	 * @param dimensions
	 * @param refresh
	 */
	public AboutView() {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
		repaint();

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g); // Paint background
		g.setFont(new Font("Helvetica Neue", Font.PLAIN, fontHeight));
		g.setColor(Color.BLACK);
		g.drawString("© Bauhaus Luftfahrt e.V.", 10, 20);
		g.drawString("2009 - 2015", 10, 40);
		g.drawString("visit our website: www.bla.com", 10, 60);

	}
}
