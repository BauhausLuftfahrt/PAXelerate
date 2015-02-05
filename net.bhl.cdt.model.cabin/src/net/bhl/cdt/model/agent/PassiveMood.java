package net.bhl.cdt.model.agent;

public class PassiveMood extends AgentMood implements Strategy {

	public PassiveMood(Agent agent) {
		super(agent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reactToCollision() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
			super.getAgent().setExitPathLoop(false);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
