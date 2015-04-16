package net.bhl.cdt.model.agent;

public class PassiveMood extends AgentMood implements Strategy {

	public PassiveMood(Agent agent) {
		super(agent);
	}

	@Override
	public void reactToCollision() {

		try {
			super.getAgent().getThread().sleep(10);
		} catch (InterruptedException e) {
		}
		super.getAgent().setExitPathLoop(false);

	}

}
