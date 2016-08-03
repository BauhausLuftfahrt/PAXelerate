package net.bhl.cdt.paxelerate.model.storage;

import net.bhl.cdt.paxelerate.model.PassengerMood;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class MoodStorage.
 * 
 * @author michael.schmidt
 * @version 1.0
 * @since 0.7
 *
 */
public class MoodStorage {

	/** The passive count. */
	private int counter = 0, aggressiveCount = 0, passiveCount = 0;

	/**
	 * Instantiates a new mood storage.
	 */
	public MoodStorage() {

	}

	/**
	 * Adds the value.
	 *
	 * @param type the type
	 */
	public void addValue(PassengerMood type) {
		counter++;

		switch (type) {
		default:
			passiveCount++;
			break;
		case AGGRESSIVE:
			aggressiveCount++;
			break;
		case PASSIVE:
			passiveCount++;
			break;

		}

	}

	/**
	 * Gets the mood count.
	 *
	 * @param type the type
	 * @return the mood count
	 */
	public int getMoodCount(PassengerMood type) {
		switch (type) {
		default:
			return passiveCount;

		case PASSIVE:
			return passiveCount;

		case AGGRESSIVE:
			return aggressiveCount;

		}
	}

	/**
	 * Gets the mood percentage.
	 *
	 * @param type the type
	 * @return the mood percentage
	 */
	public double getMoodPercentage(PassengerMood type) {
		try {
			switch (type) {
			default:
				return passiveCount / (double) counter;

			case PASSIVE:
				return passiveCount / (double) counter;

			case AGGRESSIVE:
				return aggressiveCount / (double) counter;

			}
		} catch (ArithmeticException e) {
			Log.add(this, "Storage: ArithmeticException");
			e.printStackTrace();
			return 0;
		}
	}

}
