package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.util.Func;

public class PassiveMood extends AgentMood implements Strategy {

	public PassiveMood(Agent agent) {
		super(agent);
	}

	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision(Property property) {

		try {
			super.getAgent().getThread().sleep(Func.transformTime(1));
		} catch (InterruptedException e) {
		}
		super.getAgent().setExitPathLoop(false);

	}

}
