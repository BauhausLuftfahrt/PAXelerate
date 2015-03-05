package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.astar.Node.Property;

public class NodeProperty {
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	private int agentID;
	private Property property;

	public NodeProperty(int agentID, Property property) {
		this.agentID = agentID;
		this.property = property;
	}
}
