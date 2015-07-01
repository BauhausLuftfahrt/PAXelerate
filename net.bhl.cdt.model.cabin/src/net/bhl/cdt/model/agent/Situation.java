package net.bhl.cdt.model.agent;

public class Situation {

	private Strategy strategy;

	public Situation(Strategy strategy) {
		this.strategy = strategy;
	}

	public void handle() {
		this.strategy.reactToCollision();
	}
}
