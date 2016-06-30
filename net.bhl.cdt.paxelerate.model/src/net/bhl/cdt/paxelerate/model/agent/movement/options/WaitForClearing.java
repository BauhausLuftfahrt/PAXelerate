package net.bhl.cdt.paxelerate.model.agent.movement.options;

import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.agent.movement.MovementType;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.GaussianRandom;

/**
 * 
 * @author marc.engelmann, michael.schmidt
 *
 */
public class WaitForClearing extends MovementType {

	public WaitForClearing(Agent agent, int scale) {
		super(agent, scale);
	}

	@SuppressWarnings("static-access")
	@Override
	public void performNextMovement() {

		agent.setCurrentState(State.WAITING_FOR_ROW_CLEARING);

		SimulationProperties settings = SimulationHandler.getCabin()
				.getSimulationSettings();

		// TODO: only one passenger is detected, even if there are 2
		// already in the row!

		while (agent.waymakingAllowed() == false) {
			agent.increaseTotalWaitingTime(
					settings.getThreadSleepTimeDefault());
			try {
				agent.getThread().sleep((settings.getThreadSleepTimeDefault()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/* way making procedure is skipped */
		// if (anyoneNearMe()) {
		if (!agent.getWaitingCompleted()) {
			if (settings.isDeveloperMode()) {
				System.out.println("waymaking skipped. Delay simulated!");
			}

			long sleepTime = AStarHelper.time(GaussianRandom.gaussianRandom(
					settings.getPassengerProperties()
							.getSeatInterferenceProcessTimeMean(),
					GaussOptions.PERCENT_95, settings.getPassengerProperties()
							.getSeatInterferenceProcessTimeDeviation()));
			agent.increaseTotalWaitingTime(sleepTime);
			try {
				agent.getThread().sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			agent.raiseNumberOfSkippedWaymakings();
			agent.setWaitingCompleted(true);
			// continue;
		}

		// way making works as planned
		/*
		 * if (!waitingCompleted) {
		 * 
		 * for (Passenger pax : otherPassengersInRowBlockingMe) {
		 * 
		 * SimulationHandler.launchWaymakingAgent(pax, this.passenger);
		 * 
		 * }
		 * 
		 * while (!otherPassengerStoodUp()) { Thread.sleep(
		 * simSettings.getThreadSleepTimeDefault()); }
		 * 
		 * // TODO: calculate the waiting time!
		 * Thread.sleep(AStarHelper.time(simSettings
		 * .getSeatInterferenceStandingUpPassengerWaitingTime()));
		 * 
		 * waitingCompleted = true; }
		 */

	}

}
