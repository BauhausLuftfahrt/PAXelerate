package net.bhl.cdt.paxelerate.model.agent.enums;

/**
 * 
 * @author marc.engelmann
 *
 */

public enum State {

	/** The following path. */
	FOLLOWING_PATH,
	/** The waiting for row clearing. */
	WAITING_FOR_ROW_CLEARING,
	/** The clearing row. */
	CLEARING_ROW,
	/** The stowing luggage. */
	STOWING_LUGGAGE,
	/** The unfold seat. */
	UNFOLDING_SEAT,
	/** The preparing. */
	PREPARING,
	/** The queueing up. */
	QUEUEING_UP,
	/** The waiting for other passenger to seat. */
	WAITING_FOR_OTHER_PASSENGER_TO_SEAT,
	/** The returning to seat. */
	RETURNING_TO_SEAT;
}
