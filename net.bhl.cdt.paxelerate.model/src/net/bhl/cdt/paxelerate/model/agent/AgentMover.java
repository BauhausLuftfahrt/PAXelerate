/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * The Class AgentMover.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
public class AgentMover {
	
	/**
	 * This method blocks the agents position if the rotation is rectangular.
	 *
	 * @param vector            is the vector of the agents position
	 * @param occupy            occupy or deoccupy the node
	 * @param property            set the property of the node
	 * @param passenger the passenger
	 */
	public static void blockNode(Vector vector, boolean occupy,
			Property property, Passenger passenger) {

		/* check if the desired node is out of bounds */
		if (SimulationHandler.getMap().get(vector.getX(), vector.getY()) != null
				&& SimulationHandler.getMap().get(vector.getX(), vector.getY())
						.getPassenger() != null) {

			/* check if the agent itself blocked the node */
			if (SimulationHandler.getMap().get(vector.getX(), vector.getY())
					.getPassenger().getId() == passenger.getId()
					|| SimulationHandler.getMap()
							.get(vector.getX(), vector.getY())
							.getProperty() != Property.AGENT) {

				/* check if the node is no obstacle */
				if (!SimulationHandler.getMap()
						.get(vector.getX(), vector.getY()).isObstacle()) {

					/*
					 * set the node to the desired property and link the agent
					 * id
					 */
					SimulationHandler.getMap().get(vector.getX(), vector.getY())
							.setProperty(property, passenger);
				}
			}
		}
	}
}
