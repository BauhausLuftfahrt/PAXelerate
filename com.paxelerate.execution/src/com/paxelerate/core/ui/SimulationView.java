/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.core.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JPanel;

import com.paxelerate.core.sim.astar.Areamap;
import com.paxelerate.core.sim.astar.Node;
import com.paxelerate.core.sim.astar.Node.Layer;
import com.paxelerate.core.sim.astar.Node.Property;
import com.paxelerate.core.sim.astar.SimulationHandler;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.EPointExtensions;
import com.paxelerate.model.extensions.SeatExtensions;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;
import net.bhl.opensource.toolbox.time.TimeHelper;

/**
 * The Class SimulationView.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 *
 */

public class SimulationView extends JPanel {

	private static final long serialVersionUID = 2L;
	private static final int BOX_HEIGHT = 280, FPS = 60;
	private static double cabinWidth;
	private Areamap areamap;
	private int FONT_SIZE = 10;
	private SimulationHandler handler;

	/*
	 * Instantiates a new simulation view.
	 */
	public SimulationView(SimulationHandler handler) throws NullPointerException {

		this.handler = handler;

		setPreferredSize(new Dimension(
				GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width - 20, BOX_HEIGHT));
		cabinWidth = DeckExtensions.getMaximumSize(handler.getDeck()).getY()
				/ handler.getSettings().getSimulationGridResolution();

		Thread thread = new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						repaint();
						Thread.sleep(1000 / FPS);
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}
				}
			}

		};

		thread.start();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public final synchronized void paintComponent(final Graphics g) {

		FONT_SIZE = (int) (getSize().height / cabinWidth);

		super.paintComponent(g);

		g.setFont(new Font("Courier New", Font.PLAIN, FONT_SIZE));

		for (Node node : areamap.getNodes()) {

			int x = BHLMath.toInt(node.getPosition().getX());
			int y = BHLMath.toInt(node.getPosition().getY());

			g.setColor(Color.LIGHT_GRAY);

			if (node.getPassenger() != null) {

				g.setColor(switchColor(node.getPassenger().getState()));
				g.fillRect(x * FONT_SIZE, y * FONT_SIZE, FONT_SIZE, FONT_SIZE);

			} else if (node.getProperty(Layer.ASTAR) != Property.FREE) {

				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(x * FONT_SIZE, y * FONT_SIZE, FONT_SIZE, FONT_SIZE);

			}

//			else if (!node.influencingPassengers.isEmpty()) {
//
//				g.setColor(Color.GREEN);
//				g.fillRect(x * FONT_SIZE, y * FONT_SIZE, FONT_SIZE, FONT_SIZE);
//			}
		}

		for (Passenger passenger : handler.getPassengersByState(State.SEATED, false)) {

			DoubleVector position = EPointExtensions.transform(SeatExtensions.getCenter(passenger.getSeat()));
			g.setColor(Color.GREEN);
			g.fillRect(BHLMath.toInt(position.getX() / handler.getSettings().getSimulationGridResolution() * FONT_SIZE),
					BHLMath.toInt((position.getY() + DeckExtensions
							.getMaximumSize(EObjectHelper.getParent(Model.class, passenger).getDeck()).getY() / 2.0)
							/ handler.getSettings().getSimulationGridResolution() * FONT_SIZE),
					FONT_SIZE, FONT_SIZE);
		}

		g.setColor(Color.BLACK);

		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		g.drawString("Real Time: " + handler.getMasterBoardingTime() / 1000.0, 10, 20);

		double tens = handler.getMasterBoardingTime() / 1000.0 * handler.getSettings().getSimulationSpeedFactor();

		g.drawString("Sim. Time: " + TimeHelper.toTimeOfDay(tens) + " >> "
				+ handler.getSettings().getSimulationSpeedFactor() + "x", 10, 40);
		g.drawString("Passengers: " + handler.getPassengersByState(State.NOT_ACTIVE, true).size() + " / "
				+ handler.getPassengersByState(State.SEATED, false).size() + " / "
				+ handler.getPassengersByState(null, false).size(), 10, 60);

	}

	/**
	 * Reset simulation view.
	 */
	public final void resetSimulationView() {
		areamap = null;
	}

	/**
	 * Sets the areamap.
	 *
	 * @param areamap the new areamap
	 */
	public final void setAreamap(final Areamap areamap) {
		this.areamap = areamap;
	}

	/**
	 * Switch color.
	 *
	 * @param state the state
	 * @return the color
	 */
	public final Color switchColor(final State state) {
		switch (state) {
		case CALCULATE_NEW_PATH:
			return Color.ORANGE;
		case FOLLOW_PATH:
			return Color.DARK_GRAY;
		case QUEUE_UP:
			return Color.BLUE;
		case CLEAR_ROW:
			return Color.GREEN;
		case WAIT_FOR_ROW_CLEARING:
			return Color.RED;
		case RETURN_TO_SEAT:
			return Color.YELLOW;
		case STOW_LUGGAGE:
			return Color.CYAN;
		case UNFOLD_SEAT:
			return Color.MAGENTA;
		case RETRIEVE_LUGGAGE:
			return Color.PINK;
		default:
			return Color.DARK_GRAY;
		}
	}
}
