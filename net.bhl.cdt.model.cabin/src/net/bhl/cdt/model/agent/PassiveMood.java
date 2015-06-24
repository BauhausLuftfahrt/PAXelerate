package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.cabin.util.FuncLib;

public class PassiveMood extends AgentMood implements Strategy {

	public PassiveMood(Agent agent) {
		super(agent);
	}

	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision() {

		try {
			super.getAgent().getThread().sleep(FuncLib.transformTime(2));
		} catch (InterruptedException e) {
		}
		super.getAgent().setExitPathLoop(false);

	}

}
