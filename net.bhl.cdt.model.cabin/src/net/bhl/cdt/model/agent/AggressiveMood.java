package net.bhl.cdt.model.agent;

public class AggressiveMood extends AgentMood implements Strategy {

	public AggressiveMood(Agent agent) {
		super(agent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reactToCollision() {

		super.getAgent().findNewPath();
		super.getAgent().setExitPathLoop(true);
	}
}