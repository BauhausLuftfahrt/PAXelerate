/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.astar.AreaMap;
import net.bhl.cdt.paxelerate.model.astar.Node;
import net.bhl.cdt.paxelerate.model.astar.Node.Property;
import net.bhl.cdt.paxelerate.model.astar.Path;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.time.TimeHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Screen;

/**
 * 
 * @author marc.engelmann
 *
 */
public class SimulationView extends JPanel implements MouseListener {

	private static final long serialVersionUID = 2L;
	private static final int BOX_WIDTH = 1000, BOX_HEIGHT = 300, STEP_SIZE = 2;
	private AreaMap areamap;
	private final Button leftButton, rightButton;

	private int pointZero = 0, FONT_SIZE = 10;
	private static StopWatch watch;

	private static double cabinWidth;

	public static StopWatch getWatch() {
		return watch;
	}

	public SimulationView() {
		this.setPreferredSize(new Dimension(Screen.getWidth() - 20, BOX_HEIGHT));
		cabinWidth = SimulationHandler.getCabin().getYDimension() / (double) SimulationHandler.getCabin().getSimulationSettings().getScale();

		Thread gameThread = new Thread() {
			@Override
			public void run() {
				while (true) {
					repaint();
				}
			}
		};

		gameThread.start();

		watch = new StopWatch();
		watch.start();

		leftButton = new Button();
		rightButton = new Button();

		addMouseListener(this);

		leftButton.setFocusable(false);
		rightButton.setFocusable(false);

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
				if (pointZero < areamap.getDimensions().getY() - (BOX_WIDTH / FONT_SIZE) - STEP_SIZE) {
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
		case RETURNING_TO_SEAT:
			return Color.YELLOW;
		case STOWING_LUGGAGE:
			return Color.CYAN;
		default:
			return Color.DARK_GRAY;
		}
	}

	@Override
	public void paintComponent(Graphics g) {

		FONT_SIZE = (int) (getSize().height / cabinWidth);

		super.paintComponent(g);

		g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));

		for (int x = 0; x < areamap.getDimensions().getX(); x++) {
			for (int y = pointZero; y < areamap.getDimensions().getY(); y++) {

				Node node = areamap.getNodeByCoordinate(x, y);
				g.setColor(Color.LIGHT_GRAY);
				if (node != null && node.getTypeForPrinting() != null) {

					if (node.getTypeForPrinting().equals("O") || node.getTypeForPrinting().equals(" ")) {
						g.setColor(switchColor(
								SimulationHandler.getAgentByPassenger(node.getPassenger()).getCurrentState()));
						g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE - 1));
						if (!node.isHidden()) {
							g.drawString("O", x * FONT_SIZE, (y - pointZero) * FONT_SIZE);
						}
					} else {
						g.setColor(Color.LIGHT_GRAY);
						g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));
						if (node.getTypeForPrinting() != null) {
							g.drawString(node.getTypeForPrinting(), x * FONT_SIZE, (y - pointZero) * FONT_SIZE);
						}
					}
				}
			}
		}

		g.setColor(Color.BLACK);

		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		g.drawString("Real Time: " + watch.getElapsedTimeTens(), 10, 20);

		double tens = watch.getElapsedTimeTens()
				* SimulationHandler.getCabin().getSimulationSettings().getSimulationSpeedFactor();

		g.drawString(
				"Sim. Time: " + TimeHelper.toTimeOfDay(tens) + " >> "
						+ SimulationHandler.getCabin().getSimulationSettings().getSimulationSpeedFactor() + "x",
				10, 40);
		g.drawString("Passengers: " + SimulationHandler.getNumberOfSeatedPassengers() + " / "
				+ SimulationHandler.getNumberOfPassengersInCabin() + " / "
				+ SimulationHandler.getCabin().getPassengers().size(), 10, 60);

		Point mouse = getMousePosition();

		if (mouse != null) {

			Agent agent = null;

			int b = mouse.x / FONT_SIZE;
			int a = mouse.y / FONT_SIZE;

			Node node = areamap.getNodeByCoordinate(b, a);

			if (node != null) {
				Property property = node.getProperty();

				if (property == Property.AGENT) {
					agent = SimulationHandler.getAgentByPassenger(node.getPassenger());
				}

				g.setColor(Color.LIGHT_GRAY);

				g.fillRect(mouse.x + 10, mouse.y + 10, 250, 120);

				g.setColor(Color.BLACK);

				if (node != null && agent != null) {
					if (node.getProperty() == Property.AGENT) {
						g.drawString("Passenger: " + node.getPassenger().getId() + ", x: "
								+ agent.getCurrentPosition().getX() + ", y: " + agent.getCurrentPosition().getY(),
								mouse.x + 30, mouse.y + 30);
						g.drawString("Seat " + node.getPassenger().getSeatRef().getName(), mouse.x + 30, mouse.y + 50);
						g.drawString("State: " + agent.getCurrentState().toString(), mouse.x + 30, mouse.y + 70);
						g.drawString("Mode: " + agent.getAgentMode().toString(), mouse.x + 30, mouse.y + 90);

						Passenger other = agent.getOtherPassengersInRowBlockingMe();

						if (other != null) {
							g.drawString("Waiting for passenger " + other.getId() + " on seat "
									+ other.getSeatRef().getName(), mouse.x + 30, mouse.y + 110);
						}

						g.setColor(Color.GRAY);

						for (Path path : agent.getPathList()) {
							for (Node pathNode : path.getWaypoints()) {
								g.drawString("•", (pathNode.getPosition().getX() - pointZero) * FONT_SIZE,
										pathNode.getPosition().getY() * FONT_SIZE);
							}
						}
					}
				} else if (property != null) {
					g.setColor(Color.BLACK);
					g.drawString("Property: " + property.toString() + ", x: " + b + ", y: " + a, mouse.x + 30,
							mouse.y + 30);
				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (getMousePosition() != null) {

			int a = getMousePosition().x / FONT_SIZE;
			int b = getMousePosition().y / FONT_SIZE;

			Node node = areamap.getNodeByCoordinate(b, a);
			if (node != null) {
				if (node.getProperty() == Property.AGENT && node.getPassenger() != null) {
					SimulationHandler.removePassenger(node.getPassenger());
				}
			}

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//
	}
}
