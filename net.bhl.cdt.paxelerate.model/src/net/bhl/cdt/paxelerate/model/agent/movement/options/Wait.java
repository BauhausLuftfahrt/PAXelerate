package net.bhl.cdt.paxelerate.model.agent.movement.options;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.agent.mood.Collision;
import net.bhl.cdt.paxelerate.model.agent.movement.MovementType;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Wait extends MovementType {

	private Property property;

	public Wait(Agent agent, int scale, Property property) {
		super(agent, scale);
		this.property = property;
	}

	@Override
	public void performNextMovement() {

		agent.setCurrentState(State.QUEUEING_UP);

		/* raise the interrupts counter up by one */
		agent.raiseNumberOfInterrupts();

		SimulationHandler.getMap().get(agent.getCurrentPosition())
				.raiseNumberOfInterrupts();

		/* get the correct behavior for an obstacle avoidance */
		Collision collision = new Collision(agent.getMood(), property);

		/* Perform the correct behavior */
		collision.handle();

		agent.increaseTotalWaitingTime(agent.getWaitingTimeAfterCollision());
		/*
		 * the main loop is quit, if there is a new path calculated
		 */

	}

}
