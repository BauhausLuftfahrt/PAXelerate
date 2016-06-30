package net.bhl.cdt.paxelerate.model.agent.movement.options;

import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.agent.movement.MovementType;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;

/**
 * 
 * @author marc.engelmann
 *
 */
public class StowLuggage extends MovementType {

	public StowLuggage(Agent agent, int scale) {
		super(agent, scale);
	}

	@Override
	public void performNextMovement() {

		agent.setCurrentState(State.STOWING_LUGGAGE);
		agent.rotateAgent(90);

		/* sleep the thread as long as the luggage is stowed */
		long sleepTime = AStarHelper
				.time(agent.getPassenger().getLuggageStowTime());
		try {
			Thread.sleep(sleepTime);
			agent.increaseTotalWaitingTime(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
		/* notify everyone that the luggage is now stowed */
		agent.setAlreadyStowed(true);

	}

}
