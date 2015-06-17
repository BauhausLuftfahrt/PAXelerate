package net.bhl.cdt.model.agent;

public class AggressiveMood extends AgentMood implements Strategy {

	public AggressiveMood(Agent agent) {
		super(agent);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision() {

		if (super.getAgent().getBlockingAgent().passengerStowsLuggage()) {
			super.getAgent().findNewPath();
			super.getAgent().setExitPathLoop(true);
		}

		else {
			try {
				super.getAgent().getThread().sleep(10);
			} catch (InterruptedException e) {
			}
			super.getAgent().setExitPathLoop(false);

		}
	}
}