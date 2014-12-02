package net.bhl.cdt.model.astar;

public class CabinMap {
	
	private double[][] field;
	private double xStart;
	private double yStart;
	private double xTarget;
	private double yTarget;
	private double stepNumber;
	
	public CabinMap(double[][] field, double xStart, double yStart, double xTarget, double yTarget, double stepNumber) {
		this.field = field;
		this.xStart = xStart;
		this.yStart = yStart;
		this.xTarget = xTarget;
		this.yTarget = yTarget;
		this.stepNumber = stepNumber;
	}

}
