package model;

public class CabinGenerator {

	private double cabinWidth;
	private double cabinLength;

	private double aisleNumber;
	private double rows;
	private double seatsPerRow;
	private double distanceBetweenRows;
	private double aisleWidth;
	private double seatWidth;

	private double rowWidth;

	public CabinGenerator(double cabinLength, double cabinWidth, double rows,
			double aisleWidth, double seatsPerRow) {
		this.cabinWidth = cabinWidth;
		this.cabinLength = cabinLength;
		this.rows = rows;
		this.seatsPerRow = seatsPerRow;
		this.aisleWidth = aisleWidth;
		// this.aisleWidth = aisleWidth;
		//this.rowWidth = (this.cabinWidth - this.aisleWidth);
		//this.seatWidth = (1 / this.seatsPerRow) * this.rowWidth;
		this.distanceBetweenRows = this.cabinLength / this.rows;
		//this.aisleWidth = 2 * this.seatWidth;
	}
	
	

	public double getCabinWidth() {
		return cabinWidth;
	}



	public void setCabinWidth(double cabinWidth) {
		this.cabinWidth = cabinWidth;
	}



	public double getCabinLength() {
		return cabinLength;
	}



	public void setCabinLength(double cabinLength) {
		this.cabinLength = cabinLength;
	}



	public double getAisleNumber() {
		return aisleNumber;
	}



	public void setAisleNumber(double aisleNumber) {
		this.aisleNumber = aisleNumber;
	}



	public double getRows() {
		return rows;
	}



	public void setRows(double rows) {
		this.rows = rows;
	}



	public double getSeatsPerRow() {
		return seatsPerRow;
	}



	public void setSeatsPerRow(double seatsPerRow) {
		this.seatsPerRow = seatsPerRow;
	}



	public double getDistanceBetweenRows() {
		return distanceBetweenRows;
	}



	public void setDistanceBetweenRows(double distanceBetweenRows) {
		this.distanceBetweenRows = distanceBetweenRows;
	}



	public double getAisleWidth() {
		return aisleWidth;
	}



	public void setAisleWidth(double aisleWidth) {
		this.aisleWidth = aisleWidth;
	}



	public double getSeatWidth() {
		return seatWidth;
	}



	public void setSeatWidth(double seatWidth) {
		this.seatWidth = seatWidth;
	}



	public double getRowWidth() {
		return rowWidth;
	}



	public void setRowWidth(double rowWidth) {
		this.rowWidth = rowWidth;
	}



	public CabinNode[][] generateCabin() {
		CabinNode[][] cabin = CabinNode.createCabinNodes(this.cabinLength, this.cabinWidth);

		int rowCount = 0;
		int seatCount = 0;

		for (int i = 0; i < this.cabinLength; i++) {

			if (i == (int) (this.distanceBetweenRows) * rowCount) {

				for (int j = 0; j < this.cabinWidth; j++) {
					if (j<=this.seatsPerRow) {
						 cabin[i][j].setSeat(true);
						
					}
					
					else if (j>=this.seatsPerRow && j <=this.seatsPerRow+this.aisleWidth){
						cabin[i][j].setEmptySpace(true);
					}
					
					else {
						cabin[i][j].setSeat(true);
					}
				}
				rowCount++;
			}

		}
		return cabin;

	}
	
	public void printCabin(CabinNode[][] cabin) {
		for (int i = 0; i < this.cabinLength; i++) {

				for (int j = 0; j < this.cabinWidth; j++) {
					if (cabin[i][j].isSeat()) {
						 System.out.print("X");	
					}
					else {
						System.out.print(" ");
					}		
			}
				System.out.println();

		}
	}
	
	public int[][] createObstacleMap(CabinNode[][] cabin) {
		
		int[][] obstacleMap = new int[(int) this.cabinLength][(int) this.cabinWidth];
		for (int i = 0; i < this.cabinLength; i++) {

				for (int j = 0; j < this.cabinWidth; j++) {
					if (cabin[i][j].isSeat()) {
						 obstacleMap[i][j] = 100000;
					}
					else {
						obstacleMap[i][j] = 0;
					}		
			}
		}
		return obstacleMap;
	}
	
	
	

	public static void main(String[] args) {
		CabinGenerator generator = new CabinGenerator(45, 8, 15, 2, 2);
		generator.printCabin(generator.generateCabin());
		
		
	}

}
