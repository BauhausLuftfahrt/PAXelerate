package net.bhl.cdt.model.agent;

public abstract class AgentMood implements Strategy {

	private Agent agent;

	public AgentMood(Agent agent) {
		this.setAgent(agent);
	}

	public abstract void reactToCollision();

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}
}
