/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar;

import net.bhl.cdt.paxelerate.model.astar.Node.Property;

/**
 * This class defines the property values of a node.
 * 
 * @see node.java
 * @author marc.engelmann
 *
 */
public class NodeProperty {
	
	private int agentID;
	private Property property;
	
	/**
	 * 
	 * @param agentID
	 * @param property
	 */
	public NodeProperty(int agentID, Property property) {
		this.agentID = agentID;
		this.property = property;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAgentID() {
		return agentID;
	}

	/**
	 * 
	 * @param agentID
	 */
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	/**
	 * 
	 * @return
	 */
	public Property getProperty() {
		return property;
	}

	/**
	 * 
	 * @param property
	 */
	public void setProperty(Property property) {
		this.property = property;
	}
}
