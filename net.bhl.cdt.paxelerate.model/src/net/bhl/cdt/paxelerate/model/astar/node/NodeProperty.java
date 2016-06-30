/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar.node;

import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;

/**
 * This class defines the property values of a node.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 * @see node.java
 */
public class NodeProperty {
	
	/** The agent id. */
	private int agentID;
	
	/** The property. */
	private Property property;
	
	/**
	 * Instantiates a new node property.
	 *
	 * @param agentID the agent id
	 * @param property the property
	 */
	public NodeProperty(int agentID, Property property) {
		this.agentID = agentID;
		this.property = property;
	}
	
	/**
	 * Gets the agent id.
	 *
	 * @return the agent id
	 */
	public int getAgentID() {
		return agentID;
	}

	/**
	 * Sets the agent id.
	 *
	 * @param agentID the new agent id
	 */
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	/**
	 * Gets the property.
	 *
	 * @return the property
	 */
	public Property getProperty() {
		return property;
	}

	/**
	 * Sets the property.
	 *
	 * @param property the new property
	 */
	public void setProperty(Property property) {
		this.property = property;
	}
}
