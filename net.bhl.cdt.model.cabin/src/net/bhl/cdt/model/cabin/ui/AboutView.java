package net.bhl.cdt.model.cabin.ui;

import javax.swing.*;

import net.bhl.cdt.model.astar.AreaMap;
import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.StopWatch;
import net.bhl.cdt.model.cabin.util.Vector2D;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author marc.engelmann
 *
 */
public class AboutView extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int BOX_WIDTH = 1000;
	private static final int BOX_HEIGHT = 275;
	private int FONT_SIZE = 8;
	private AreaMap areamap;
	private final Button leftButton;
	private final Button rightButton;
	private int pointZero = 0;
	private static final int STEP_SIZE = 2;
	private static StopWatch watch;

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
		watch = new StopWatch();
		watch.start();

		leftButton = new Button();
		rightButton = new Button();

		leftButton.setFocusable(false);
		rightButton.setFocusable(false);

		leftButton.setLabel("<");
		leftButton.setEnabled(true);
		leftButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pointZero >= STEP_SIZE) {
					pointZero -= STEP_SIZE;
				}
			}
		});
		this.add(leftButton);

		rightButton.setLabel(">");
		rightButton.setEnabled(true);
		rightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pointZero < areamap.getDimensions().getY()
						- (BOX_WIDTH / FONT_SIZE) - STEP_SIZE) {
					pointZero += STEP_SIZE;
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
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		g.drawString("Real Time: " + watch.getElapsedTimeTens(), 10, 20);
		g.drawString("Sim. Time: " + watch.getElapsedTimeTens()
				* SimulationHandler.getCabin().getSpeedFactor(), 10, 40);
		g.drawString(
				"Passengers: "
						+ SimulationHandler.getNumberOfSeatedPassengers()
						+ " / "
						+ SimulationHandler.getCabin().getPassengers().size(),
				10, 60);
	}
}