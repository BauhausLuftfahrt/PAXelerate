package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.Node.Property;

public class Situation {

	private Strategy strategy;
	private Property property;

	public Situation(Strategy strategy, Property property) {
		this.strategy = strategy;
		this.property = property;
	}

	public void handle() {
		this.strategy.reactToCollision(property);
	}
}
