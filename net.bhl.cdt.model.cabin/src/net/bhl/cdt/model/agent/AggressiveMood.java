package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.RunAStar;

public class AggressiveMood extends AgentMood implements Strategy {

	public AggressiveMood(Agent agent) {
		super(agent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reactToCollision() {

		super.getAgent().findNewPath(RunAStar.getCostMap());
		super.getAgent().setExitPathLoop(true);
	}
}