package net.bhl.cdt.model.agent;

import java.util.HashMap;

import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.util.StopWatch;
import net.bhl.cdt.model.cabin.util.Vector3D;
import net.bhl.cdt.model.observer.Subject;

public class IssueScanner extends Subject implements Runnable {

	private Thread thread;
	private StopWatch watch;
	private boolean init = true;

	private HashMap<Integer, Vector3D> positionTracker = new HashMap<Integer, Vector3D>();

	@Override
	public void run() {

		watch = new StopWatch();
		watch.start();

		updateMap();

		while (true) {
			try {
				for (Passenger pax : SimulationHandler.getCabin()
						.getPassengers()) {
					checkMovement(pax);
				}
				updateMap();

				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}

	private void checkMovement(Passenger pax) {
		Vector3D data = positionTracker.get(pax.getId());
		if (noMovementDetected(pax)) {
			if (Math.abs(watch.getElapsedTime() - data.getZ()) > 5) {
				System.out.println(pax.getId() + " NOT MOVING!");
			}
		}
	}

	private boolean noMovementDetected(Passenger pax) {
		Vector3D data = positionTracker.get(pax.getId());
		return (pax.getPositionX() == data.getX() && pax.getPositionY() == data
				.getY());
	}

	private void updateMap() {
		for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
			int time = (int) watch.getElapsedTimeSecs();

			if (!init) {
				if (noMovementDetected(pax)) {
					time = positionTracker.get(pax.getId()).getZ();
				}
			}
			positionTracker.put(
					pax.getId(),
					new Vector3D((int) pax.getPositionX(), (int) pax
							.getPositionY(), time));
		}
		init = false;
	}

	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (getThread() == null) {
			setThread(new Thread(this, "Scanner"));
			getThread().start();
		}
	}

	/**
	 * This method returns the thread.
	 * 
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * This method sets the thread.
	 * 
	 * @param thread
	 *            the thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
