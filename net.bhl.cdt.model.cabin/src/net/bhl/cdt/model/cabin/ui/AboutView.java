package net.bhl.cdt.model.cabin.ui;

import javax.swing.*;

import net.bhl.cdt.model.astar.AreaMap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private final Button leftButton;
	private final Button rightButton;
	private int pointZero = 0;

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

		leftButton = new Button();
		rightButton = new Button();

		leftButton.setLabel("<");
		leftButton.setEnabled(true);
		leftButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pointZero > 0) {
					pointZero--;
				}
			}
		});
		this.add(leftButton);

		rightButton.setLabel(">");
		rightButton.setEnabled(true);
		rightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pointZero < 40) {
					pointZero++;
				}
			}
		});
		this.add(rightButton);

	}

	public void setAreamap(AreaMap areamap) {
		this.areamap = areamap;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Paint background
		g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));
		for (int x = pointZero; x < areamap.getDimensions().getY(); x++) {
			for (int y = 0; y < areamap.getDimensions().getX(); y++) {
				g.setColor(Color.LIGHT_GRAY);
				g.drawString(areamap.getNodeByCoordinate(y, x)
						.getTypeForPrinting(), (x - pointZero) * FONT_SIZE, y
						* FONT_SIZE);
			}
		}
	}
}