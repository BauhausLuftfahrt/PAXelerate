package net.bhl.cdt.model.agent;

import net.bhl.cdt.model.astar.Node.Property;
import net.bhl.cdt.model.cabin.util.FuncLib;

public class AgressiveMood extends AgentMood implements Strategy {

	public AgressiveMood(Agent agent) {
		super(agent);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("static-access")
	@Override
	public void reactToCollision(Property property) {
		// only pass if other passenger is stowing luggage
		// if (super.getAgent().getBlockingAgent().passengerStowsLuggage()) {
		if (property == Property.OBSTACLE) {
			super.getAgent().findNewPath();
			super.getAgent().setExitPathLoop(true);
		}
		// other wise if blocked act as passive agent
		else {
			try {
				super.getAgent().getThread().sleep(FuncLib.transformTime(1));
			} catch (InterruptedException e) {
			}
			super.getAgent().setExitPathLoop(false);

		}
	}
}