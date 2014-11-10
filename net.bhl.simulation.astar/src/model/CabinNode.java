package model;



public class CabinNode {

	private boolean isSeat = false;
	private boolean isDoor = false;
	private boolean isEmergencyExit = false;
	private boolean isEmptySpace = false;
	
	
	
	public boolean isSeat() {
		return isSeat;
	}
	public void setSeat(boolean isSeat) {
		this.isSeat = isSeat;
	}
	public boolean isDoor() {
		return isDoor;
	}
	public void setDoor(boolean isDoor) {
		this.isDoor = isDoor;
	}
	public boolean isEmergencyExit() {
		return isEmergencyExit;
	}
	public void setEmergencyExit(boolean isEmergencyExit) {
		this.isEmergencyExit = isEmergencyExit;
	}
	public boolean isEmptySpace() {
		return isEmptySpace;
	}
	public void setEmptySpace(boolean isEmptySpace) {
		this.isEmptySpace = isEmptySpace;
	}
	
	
	public static CabinNode[][] createCabinNodes(double length, double width) {
		CabinNode[][] cabin = new CabinNode[(int)length][(int)width];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
		     cabin[i][j] = new CabinNode();
			}	
		}
		return cabin;
	}

	
}
