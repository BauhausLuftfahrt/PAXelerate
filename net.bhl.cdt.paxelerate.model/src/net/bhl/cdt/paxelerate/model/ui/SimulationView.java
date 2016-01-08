/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.ui;

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
import net.bhl.cdt.paxelerate.util.Func;
import net.bhl.cdt.paxelerate.util.math.StopWatch;
import net.bhl.cdt.paxelerate.util.time.TimeHelper;

/**
 * 
 * @author marc.engelmann
 *
 */
public class SimulationView extends JPanel implements MouseListener {

	private static final long serialVersionUID = 2L;
	private static final int BOX_WIDTH = 1000, BOX_HEIGHT = 300, STEP_SIZE = 2;
	private AreaMap areamap;
	private final Button leftButton, rightButton, faster, slower, stop;

	private int speedPosition = 2, pointZero = 0, FONT_SIZE = 10;
	private static StopWatch watch;

	private int[] possibleSpeeds = { 1, 2, 5, 10, 20, 50, 100 };

	private static double cabinWidth;

	// Unused variable
	//private boolean interrupted = false;

	public static StopWatch getWatch() {
		return watch;
	}

	public SimulationView() {
		System.out.println(Func.getLineNumber());
		this.setPreferredSize(
				new Dimension(Func.GetScreenWorkingWidth() - 20, BOX_HEIGHT));
		System.out.println(Func.getLineNumber());
		cabinWidth = SimulationHandler.getCabin().getCabinWidth()
				/ (double) SimulationHandler.getCabin().getScale();
		System.out.println(Func.getLineNumber());
		Thread gameThread = new Thread() {

			public void run() {
				while (true) {
					repaint();
				}
			}
		};
		System.out.println(Func.getLineNumber());
		gameThread.start(); // Callback run()
		watch = new StopWatch();
		watch.start();
		System.out.println(Func.getLineNumber());
		leftButton = new Button();
		rightButton = new Button();

		faster = new Button();
		slower = new Button();

		stop = new Button();

		int j = 0;
		for (int i : possibleSpeeds) {
			if (i == SimulationHandler.getCabin().getSimulationSettings()
					.getSimulationSpeedFactor()) {
				speedPosition = j;
				break;
			}
			j++;
		}
		System.out.println(Func.getLineNumber());
		addMouseListener(this);

		leftButton.setFocusable(false);
		rightButton.setFocusable(false);
		faster.setFocusable(false);
		slower.setFocusable(false);
		stop.setFocusable(false);
		System.out.println(Func.getLineNumber());
		faster.setLabel("faster");
		faster.setEnabled(true);
		faster.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (speedPosition < possibleSpeeds.length) {
					speedPosition++;
					SimulationHandler.getCabin().getSimulationSettings()
							.setSimulationSpeedFactor(
									possibleSpeeds[speedPosition]);
				}
			}
		});
		System.out.println(Func.getLineNumber());
		slower.setLabel("slower");
		slower.setEnabled(true);
		slower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (speedPosition > 0) {
					speedPosition--;
					SimulationHandler.getCabin().getSimulationSettings()
							.setSimulationSpeedFactor(
									possibleSpeeds[speedPosition]);
				}
			}
		});
		System.out.println(Func.getLineNumber());
		stop.setLabel("STOP");
		stop.setEnabled(true);
		stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Unused variable
				//interrupted = true;
			}
		});
		System.out.println(Func.getLineNumber());
		this.add(slower);
		this.add(faster);

		this.add(stop);

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
		System.out.println(Func.getLineNumber());

	}

	public void setAreamap(AreaMap areamap) {
		this.areamap = areamap;
		System.out.println(Func.getLineNumber());
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

		// performInterupt();

		FONT_SIZE = (int) (getSize().height / cabinWidth);

		super.paintComponent(g); // Paint background
		g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));
		for (int x = pointZero; x < areamap.getDimensions().getY(); x++) {
			for (int y = 0; y < areamap.getDimensions().getX(); y++) {

				Node node = areamap.getNodeByCoordinate(y, x);
				g.setColor(Color.LIGHT_GRAY);
				if (node.getTypeForPrinting() != null) {
					try {
						if (node.getTypeForPrinting().equals("O")
								|| node.getTypeForPrinting().equals(" ")) {
							g.setColor(
									switchColor(SimulationHandler
											.getAgentByPassenger(
													node.getPassenger())
											.getCurrentState()));
							g.setFont(new Font("Courier New", Font.PLAIN,
									FONT_SIZE - 1));
							if (!node.isHidden()) {
								g.drawString("O", (x - pointZero) * FONT_SIZE,
										y * FONT_SIZE);
							}
						} else {
							g.setColor(Color.LIGHT_GRAY);
							g.setFont(new Font("Courier New", Font.PLAIN,
									FONT_SIZE));
							if (node.getTypeForPrinting() != null) {
								g.drawString(node.getTypeForPrinting(),
										(x - pointZero) * FONT_SIZE,
										y * FONT_SIZE);
							}
						}
					} catch (NullPointerException e) {
						// Should not happen!
					}
				}
			}
		}
		// g.setColor(Color.BLACK);
		// g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE + 2));
		// for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
		// Agent agent = SimulationHandler.getAgentByPassenger(pax);
		// g.drawString("#", (agent.getDesiredPosition().getY() - pointZero)
		// * FONT_SIZE, agent.getDesiredPosition().getX() * FONT_SIZE);
		// }

		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		g.drawString("Real Time: " + watch.getElapsedTimeTens(), 10, 20);

		double tens = watch.getElapsedTimeTens() * SimulationHandler.getCabin()
				.getSimulationSettings().getSimulationSpeedFactor();

		g.drawString("Sim. Time: " + TimeHelper.toTimeOfDay(tens)
				+ " >> " + SimulationHandler.getCabin().getSimulationSettings()
						.getSimulationSpeedFactor()
				+ "x", 10, 40);
		g.drawString("Passengers: "
				+ SimulationHandler.getNumberOfSeatedPassengers() + " / "
				+ SimulationHandler.getNumberOfPassengersInCabin() + " / "
				+ SimulationHandler.getCabin().getPassengers().size(), 10, 60);
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
				if (areamap.getNodeByCoordinate(b, a)
						.getProperty() == Property.AGENT) {
					pax = areamap.getNodeByCoordinate(b, a).getPassenger();
				}
			} catch (NullPointerException e) {

			}
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(mousePos.x + 10, mousePos.y + 10, 250, 120);
			g.setColor(Color.BLACK);
			if (areamap.getNodeByCoordinate(b, a) != null && pax != null) {
				if (areamap.getNodeByCoordinate(b, a)
						.getProperty() == Property.AGENT) {
					g.drawString(
							"Passenger: " + pax.getId() + ", x: "
									+ SimulationHandler.getAgentByPassenger(pax)
											.getCurrentPosition().getX()
									+ ", y: "
									+ SimulationHandler.getAgentByPassenger(pax)
											.getCurrentPosition().getY(),
							mousePos.x + 30, mousePos.y + 30);
					g.drawString("Seat " + pax.getSeatRef().getName(),
							mousePos.x + 30, mousePos.y + 50);
					g.drawString(
							"State: "
									+ SimulationHandler.getAgentByPassenger(pax)
											.getCurrentState().toString(),
							mousePos.x + 30, mousePos.y + 70);
					g.drawString(
							"Mode: " + SimulationHandler
									.getAgentByPassenger(pax).getAgentMode()
									.toString(),
							mousePos.x + 30, mousePos.y + 90);
					try {
						g.drawString("Waiting for passenger "
								+ SimulationHandler.getAgentByPassenger(pax)
										.getOtherPassengersInRowBlockingMe()
										.getId()
								+ " on seat "
								+ SimulationHandler.getAgentByPassenger(pax)
										.getOtherPassengersInRowBlockingMe()
										.getSeatRef().getName(),
								mousePos.x + 30, mousePos.y + 110);
					} catch (NullPointerException e) {
						//
					}
					g.setColor(Color.GRAY);
					for (Path path : SimulationHandler.getAgentByPassenger(pax)
							.getPathList()) {
						for (Node node : path.getWaypoints()) {
							g.drawString("•",
									(node.getPosition().getY() - pointZero)
											* FONT_SIZE,
									node.getPosition().getX() * FONT_SIZE);
						}
					}
				}
			} else if (prop != null) {
				g.setColor(Color.BLACK);
				g.drawString("Property: " + prop.toString() + ", x: " + b
						+ ", y: " + a, mousePos.x + 30, mousePos.y + 30);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked!");

		Passenger pax = null;
		int a = 0;
		int b = 0;

		Point mousePos = getMousePosition();
		if (mousePos != null) {
			try {
				a = (int) (mousePos.x / FONT_SIZE);
				b = (int) (mousePos.y / FONT_SIZE);
				if (areamap.getNodeByCoordinate(b, a)
						.getProperty() == Property.AGENT) {
					pax = areamap.getNodeByCoordinate(b, a).getPassenger();
				}
			} catch (NullPointerException beep) {

			}

			if (pax != null) {
				SimulationHandler.removePassenger(pax);
			}

		}
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
