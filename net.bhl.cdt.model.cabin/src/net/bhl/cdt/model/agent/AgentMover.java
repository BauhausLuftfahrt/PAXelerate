package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.RunAStar;
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
		if (RunAStar.getMap().getNodeByCoordinate(vector.getX(), vector.getY()) != null) {

			/* check if the agent itself blocked the node */
			if (RunAStar.getMap()
					.getNodeByCoordinate(vector.getX(), vector.getY())
					.getLinkedAgentID() == passenger.getId()
					|| RunAStar.getMap()
							.getNodeByCoordinate(vector.getX(), vector.getY())
							.getProperty() != Property.AGENT) {

				/* check if the node is no obstacle */
				if (RunAStar.getMap()
						.getNodeByCoordinate(vector.getX(), vector.getY())
						.getProperty() != Property.OBSTACLE) {

					/*
					 * set the node to the desired property and link the agent
					 * id
					 */
					RunAStar.getMap()
							.getNodeByCoordinate(vector.getX(), vector.getY())
							.setProperty(property, passenger.getId());
				}
			}
		}
	}
}
