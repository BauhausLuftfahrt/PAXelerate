package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.Node.Property;

public interface Strategy {

	public void reactToCollision(Property property);

}
