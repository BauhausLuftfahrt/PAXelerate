package net.bhl.cdt.paxelerate.model.agent.movement.options;

import java.util.ConcurrentModificationException;

import org.eclipse.swt.SWTException;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.agent.movement.MovementType;
import net.bhl.cdt.paxelerate.util.math.MathHelper;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Step extends MovementType {

	public Step(Agent agent, int scale) {
		super(agent, scale);
	}

	@Override
	public void performNextMovement() {

		Passenger passenger = agent.getPassenger();

		agent.setCurrentState(State.FOLLOWING_PATH);

		/*
		 * Go one step ahead. Do this by unblocking the current position and
		 * blocking the next position.
		 */
		agent.occupyOneStepAhead();

		if (agent.getCurrentPosition().getX() != 0
				&& agent.getCurrentPosition().getY() != 0
				&& agent.getCurrentPosition().getX() != 0
				&& agent.getCurrentPosition().getY() != 0) {

			/* update the walked distance */
			passenger.setDistanceWalked(passenger.getDistanceWalked()
					+ (int) (MathHelper.distanceBetween(
							agent.getDesiredPosition(),
							agent.getCurrentPosition()) * scale));
		}

		/* notify next step */
		agent.setLastMoveTime(System.currentTimeMillis());

		/* try to submit the properties back to the passenger */
		try {

			/* submit the agents position */
			passenger.setPositionX(agent.getDesiredPosition().getX() * scale);
			passenger.setPositionY(agent.getDesiredPosition().getY() * scale);

			/* submit the agents orientation */
			passenger.setOrientationInDegree(AgentFunctions.getRotation(agent));

			/* catch possible errors */
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		} catch (SWTException swt) {
			swt.printStackTrace();
		}

	}

}
