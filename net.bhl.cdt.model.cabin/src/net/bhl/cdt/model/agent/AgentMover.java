/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.util.Vector;

public class AgentMover {
	/**
	 * This method blocks the agents position if the rotation is rectangular.
	 * 
	 * @param vector
	 *            is the vector of the agents position
	 * @param occupy
	 *            occupy or deoccupy the node
	 * @param property
	 *            set the property of the node
	 */
	public static void blockNode(Vector vector, boolean occupy,
			Property property, Passenger passenger) {

		/* check if the desired node is out of bounds */
		if (SimulationHandler.getMap().getNodeByCoordinate(vector.getX(),
				vector.getY()) != null
				&& SimulationHandler.getMap()
						.getNodeByCoordinate(vector.getX(), vector.getY())
						.getPassenger() != null) {

			/* check if the agent itself blocked the node */
			if (SimulationHandler.getMap()
					.getNodeByCoordinate(vector.getX(), vector.getY())
					.getPassenger().getId() == passenger.getId()
					|| SimulationHandler.getMap()
							.getNodeByCoordinate(vector.getX(), vector.getY())
							.getProperty() != Property.AGENT) {

				/* check if the node is no obstacle */
				if (SimulationHandler.getMap()
						.getNodeByCoordinate(vector.getX(), vector.getY())
						.getProperty() != Property.OBSTACLE) {

					/*
					 * set the node to the desired property and link the agent
					 * id
					 */
					SimulationHandler.getMap()
							.getNodeByCoordinate(vector.getX(), vector.getY())
							.setProperty(property, passenger);
				}
			}
		}
	}
}
