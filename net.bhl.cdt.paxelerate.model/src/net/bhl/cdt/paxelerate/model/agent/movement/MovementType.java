package net.bhl.cdt.paxelerate.model.agent.movement;

import net.bhl.cdt.paxelerate.model.agent.Agent;

/**
 * 
 * @author marc.engelmann
 *
 */
public abstract class MovementType implements MovementHandler {

	protected Agent agent;
	protected int scale;

	protected MovementType(Agent agent, int scale) {
		this.agent = agent;
		this.scale = scale;
	}

}
