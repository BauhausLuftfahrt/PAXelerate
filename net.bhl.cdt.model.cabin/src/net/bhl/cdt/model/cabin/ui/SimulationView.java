package net.bhl.cdt.model.cabin.ui;

import javax.swing.*;

import net.bhl.cdt.model.agent.Agent;
import net.bhl.cdt.model.astar.AreaMap;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.StopWatch;
import net.bhl.cdt.model.cabin.util.Vector2D;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author marc.engelmann
 *
 */
public class SimulationView extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private static final int BOX_WIDTH = 1000;
	private static final int BOX_HEIGHT = 360;
	private int FONT_SIZE = 10;
	private AreaMap areamap;
	private final Button leftButton;
	private final Button rightButton;

	private final Button faster;
	private final Button slower;

	private int speedPosition = 2;

	private int pointZero = 0;
	private static final int STEP_SIZE = 2;
	private static StopWatch watch;

	private int[] possibleSpeeds = { 1, 2, 5, 10, 20, 50, 100 };

	private static double cabinWidth;

	/**
	 * 
	 * @param areamap
	 * @param dimensions
	 * @param refresh
	 */
	public SimulationView() {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));

		cabinWidth = SimulationHandler.getCabin().getCabinWidth()
				/ (double) SimulationHandler.getCabin().getScale();

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

		faster = new Button();
		slower = new Button();

		int j = 0;
		for (int i : possibleSpeeds) {
			if (i == SimulationHandler.getCabin().getSpeedFactor()) {
				speedPosition = j;
				break;
			}
			j++;
		}

		addMouseListener(this);

		leftButton.setFocusable(false);
		rightButton.setFocusable(false);
		faster.setFocusable(false);
		slower.setFocusable(false);

		faster.setLabel("faster");
		faster.setEnabled(true);
		faster.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (speedPosition < possibleSpeeds.length) {
					speedPosition++;
				}
			}
		});

		slower.setLabel("slower");
		slower.setEnabled(true);
		slower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (speedPosition > 0) {
					speedPosition--;
				}
			}
		});

		this.add(slower);
		this.add(faster);

		leftButton.setLabel("<-");
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

		rightButton.setLabel("->");
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

	public Color switchColor(Agent.State state) {
		switch (state) {
		case FOLLOWING_PATH:
			return Color.DARK_GRAY;
		case QUEUEING_UP:
			return Color.BLUE;
		case CLEARING_ROW:
			return Color.GREEN;
		case WAITING_FOR_ROW_CLEARING:
			return Color.RED;
		case STOWING_LUGGAGE:
			return Color.CYAN;
		default:
			return Color.DARK_GRAY;
		}
	}

	@Override
	public void paintComponent(Graphics g) {

		FONT_SIZE = (int) (getSize().height / cabinWidth);

		SimulationHandler.getCabin().setSpeedFactor(
				possibleSpeeds[speedPosition]);

		super.paintComponent(g); // Paint background
		g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));
		for (int x = pointZero; x < areamap.getDimensions().getY(); x++) {
			for (int y = 0; y < areamap.getDimensions().getX(); y++) {
				g.setColor(Color.LIGHT_GRAY);
				if (areamap.getNodeByCoordinate(y, x).getTypeForPrinting() != null) {
					if (areamap.getNodeByCoordinate(y, x).getTypeForPrinting() == "O") {
						g.setColor(switchColor(SimulationHandler
								.getAgentByPassenger(
										areamap.getNodeByCoordinate(y, x)
												.getPassenger())
								.getCurrentState()));
						g.setFont(new Font("Courier New", Font.PLAIN,
								FONT_SIZE - 1));
						g.drawString("O"
						// + areamap.getNodeByCoordinate(y,
						// x).getPassenger().getId()
								, (x - pointZero) * FONT_SIZE, y * FONT_SIZE);
					} else {
						g.setColor(Color.LIGHT_GRAY);
						g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));
						g.drawString(areamap.getNodeByCoordinate(y, x)
								.getTypeForPrinting(), (x - pointZero)
								* FONT_SIZE, y * FONT_SIZE);
					}
				}
			}
		}
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		g.drawString("Real Time: " + watch.getElapsedTimeTens(), 10, 20);
		g.drawString("Sim. Time: " + watch.getElapsedTimeTens()
				* SimulationHandler.getCabin().getSpeedFactor() + " >> "
				+ SimulationHandler.getCabin().getSpeedFactor() + "x", 10, 40);
		g.drawString(
				"Passengers: "
						+ SimulationHandler.getNumberOfSeatedPassengers()
						+ " / "
						+ SimulationHandler.getNumberOfPassengersInCabin()
						+ " / "
						+ SimulationHandler.getCabin().getPassengers().size(),
				10, 60);
		Point mousePos = getMousePosition();

		if (mousePos != null) {
			Passenger pax = null;
			Property prop = null;
			int a = 0;
			int b = 0;
			try {
				a = (int) (mousePos.x / FONT_SIZE);
				b = (int) (mousePos.y / FONT_SIZE);
				prop = areamap.getNodeByCoordinate(b, a).getProperty();
				if (areamap.getNodeByCoordinate(b, a).getProperty() == Property.AGENT) {
					pax = areamap.getNodeByCoordinate(b, a).getPassenger();
				}
			} catch (NullPointerException e) {

			}
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(mousePos.x + 10, mousePos.y + 10, 250, 80);
			g.setColor(Color.BLACK);
			if (areamap.getNodeByCoordinate(b, a) != null && pax != null) {
				if (areamap.getNodeByCoordinate(b, a).getProperty() == Property.AGENT) {
					g.drawString("Passenger: " + pax.getId() + ", x: " + b
							+ ", y: " + a, mousePos.x + 30, mousePos.y + 30);
					g.drawString("Seat " + pax.getSeatRef().getName(),
							mousePos.x + 30, mousePos.y + 50);
					g.drawString("State: "
							+ SimulationHandler.getAgentByPassenger(pax)
									.getCurrentState().toString(),
							mousePos.x + 30, mousePos.y + 70);
				}
			} else if (prop != null) {
				g.drawString("Property: " + prop.toString() + ", x: " + b
						+ ", y: " + a, mousePos.x + 30, mousePos.y + 30);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked!");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
