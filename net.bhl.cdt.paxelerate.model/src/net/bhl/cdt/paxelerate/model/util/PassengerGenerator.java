package net.bhl.cdt.paxelerate.model.util;

import java.util.Map;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;

/**
 * The Class PassengerGenerator.
 *
 * @author marc.engelmann
 */
public class PassengerGenerator {

	/**
	 * Apply delay.
	 *
	 * @param passenger the passenger
	 * @param delays the delays
	 */
	public static void applyDelay(Passenger passenger,
			Map<Integer, Double> delays) {

		/* get the passengers parent cabin object */
		Cabin cabin = ModelHelper.getParent(Cabin.class, passenger);

		/* calculate the step size for the delay */
		double stepsize = 60.0 / cabin.getSimulationSettings()
				.getPassengersBoardingPerMinute();

		/* get the linked door of the passenger */
		Door door = passenger.getDoor();
		int id = door.getId();

		/* if there is no delay before, set it to zero */
		if (delays.get(id) == null) {
			delays.put(id, 0.0);
		}

		/* read out the delay value of the door and assign it */
		passenger.setStartBoardingAfterDelay(delays.get(id));

		/* increase the delay of the corresponding door */
		delays.put(id, delays.get(id) + stepsize);
	}
}
