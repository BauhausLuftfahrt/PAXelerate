package net.bhl.cdt.paxelerate.model.agent.movement;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Movement {

	/**
	 * 
	 */
	private MovementHandler strategy;

	/**
	 * 
	 * @param strategy
	 */
	public Movement(MovementHandler strategy) {
		this.strategy = strategy;
	}

	/**
	 * 
	 */
	public void perform() {
		this.strategy.performNextMovement();
	}
}