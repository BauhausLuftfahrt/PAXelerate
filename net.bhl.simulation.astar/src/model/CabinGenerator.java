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

	public CabinGenerator(double cabinLength, double cabinWidth, double rows, double aisleNumber, 
			double seatsPerRow) {
		this.cabinWidth = cabinWidth;
		this.cabinLength = cabinLength;
		this.rows = rows;
		this.seatsPerRow = seatsPerRow;
		this.aisleNumber = aisleNumber;
		//this.aisleWidth = aisleWidth;
		this.rowWidth = (this.cabinWidth-this.aisleWidth);
		this.seatWidth = (1/this.seatsPerRow)*this.rowWidth;
		this.distanceBetweenRows = this.cabinLength/this.rows;
		this.aisleWidth = 2*this.seatWidth;
	}

	public double[][] generateCabin() {
		//double[][] cabin = new double[(int) this.cabinWidth][(int) this.cabinLength];
	
		int rowCount=0;
		int seatCount=0;
		
		CabinNode[][] cabin = new CabinNode[(int) this.cabinWidth][(int) this.cabinLength];
		
		
		for (int i = 0; i < this.cabinLength; i++) {
			for (int j = 0; j <this.cabinWidth; j++) {
		}
		
		
		
		}
		
		
		
		
		
		/*for (int i = 0; i < this.cabinLength; i++) {
				
			System.out.print("|");
			
			double a = this.cabinWidth/((2*this.seatsPerRow)+2);
			if (i == (int)(this.distanceBetweenRows)*rowCount) {
				
				
				for (int j = 0; j <this.cabinWidth/(2*this.seatsPerRow); j++) {
					if (j*this.seatWidth <= this.rowWidth){
						System.out.print("X");
					}
					else if(j*this.seatWidth >= 2*this.rowWidth+this.aisleWidth) {
						System.out.print("X");
					}
					else {
						System.out.print(" ");
					}
					seatCount++;
				}
				System.out.print("|");
				rowCount++;
			}
			else {
				for (int j = 0; j <this.cabinWidth/(2*this.seatsPerRow); j++){
					System.out.print(" ");
				}
				System.out.print("|");
			}
			System.out.println();
		}*/

		return null;

	}
	
	
	public static void main(String[] args) {
		CabinGenerator generator = new CabinGenerator(300, 100, 70, 1, 3);
		generator.generateCabin();
	}

}
