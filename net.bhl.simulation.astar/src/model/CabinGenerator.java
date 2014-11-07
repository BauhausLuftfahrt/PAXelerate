package model;

public class CabinGenerator {

	private double cabinWidth;
	static double cabinLength;

	
	private double aisleNumber;
	private int passengers;
	private int seatsPerRow;
	private double distanceBetweenRows;
	private double aisleWidth;
	private double seatWidth;
	
	private int BCpax;
	private int FCpax;
	
	private int emergencyExitInRow;
	private int passengerNo;
	
	private String eSeatIcon;
	private String bSeatIcon;
	private String fSeatIcon;
	private String spaceIcon;
	private String wallIcon;
	private String exitIcon;
	private String toiletteIcon;
	private String galleyIcon;
	private String doorIcon;
	private String blockSeatIcon;
	private String stopIcon;
	
	
	
	private double rowWidth;

	public CabinGenerator(double cabinLength, double cabinWidth, int passengers, int BCpax, int FCpax, int emergencyExitInRow) {
		this.cabinWidth = cabinWidth;
		this.cabinLength = cabinLength;
		this.passengers = passengers;
		this.seatsPerRow = seatsPerRow;
		this.aisleNumber = aisleNumber;
		//this.aisleWidth = aisleWidth;
		
		this.BCpax = BCpax;
		this.FCpax = FCpax;
		
		this.emergencyExitInRow = emergencyExitInRow;
		
		this.rowWidth = (this.cabinWidth-this.aisleWidth);
		//this.seatWidth = (1/this.seatsPerRow)*this.rowWidth;
		//this.distanceBetweenRows = this.cabinLength/this.rows;
		this.aisleWidth = 2*this.seatWidth;
	}

	public double[][] generateCabin() {
		//double[][] cabin = new double[(int) this.cabinWidth][(int) this.cabinLength];
	
		int rowCount=0;
		int seatCount=0;
		int numbRows = 0;
		int numbRowsBC = 0;
		
		
		eSeatIcon = "E";
		bSeatIcon = "B";
		fSeatIcon = "F";
		
		spaceIcon = " ";
		wallIcon = "|";
		exitIcon = "X";
		
		doorIcon = "O";
		toiletteIcon ="T";
		galleyIcon = "G";
		blockSeatIcon = "-";
		stopIcon = "_";
		
		
		CabinNode[][] cabin = new CabinNode[(int) this.cabinWidth][(int) this.cabinLength];
		
		
		createFront();
		System.out.println();	
		
		if ((int)cabinWidth<8) { 
			seatsPerRow = (int)cabinWidth-1;
		} else if ((int)cabinWidth>=8) {
			seatsPerRow = (int)cabinWidth-2;	
		}
		numbRowsBC = BCpax/(seatsPerRow-2);
		numbRows = passengers / seatsPerRow;
		
		for (int i = 0; i <= numbRows; i++) {
			
			//cabin[i][0].isWall = true; ???
			
			if (i == 0) {
				createDoor();
				System.out.println();	
				createBlock();
			} else if (i == numbRows) {
				createDoor();
			} else if (i<= numbRowsBC) {
				createBCSeatRow();
			}
			
			else { 
				createSeatRow();
			}
			
			
			
			//System.out.print("|");
			System.out.println();
			rowCount ++;
		}
		createBack();
		System.out.println();
		System.out.println();
		System.out.print(passengerNo);
		System.out.print(" Passengers on board.");
		
		double test = passengers%seatsPerRow;
		if ((test != 0)) {
			System.out.println();
			System.out.print("Not all passengers could be seated!");
		} else {
			System.out.println();
			System.out.print("All passengers could be seated!");			
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
	
	public void createSeatRow() {
		System.out.print(wallIcon);	
		for (int j = 1; j <= this.cabinWidth; j++) {
			int middle = 0;
			
			if(cabinWidth < 8) {
				middle = (int)cabinWidth/2+1;
				if (j != middle) {
					System.out.print(eSeatIcon);
					passengerNo ++;
				}
				else {System.out.print(spaceIcon);}		
				
			} else if (cabinWidth > 8) {
				
				int aisle1 = (int)cabinWidth/3;
				int aisle2 = (int)cabinWidth/3*2+1;
				
				if ((j == aisle1)||(j == aisle2)) {
					System.out.print(spaceIcon);
				}
				else {
					System.out.print(eSeatIcon);
					passengerNo ++;
				}		
	
			}		
    	}
		System.out.print(wallIcon);
	}
	
	public void createBCSeatRow() {
		System.out.print(wallIcon);	
		for (int j = 1; j <= this.cabinWidth; j++) {
			int middle = 0;
			
			if(cabinWidth < 8) {
				middle = (int)cabinWidth/2+1;
				if (j != middle) {
					if((j==2)||(j==6)) {
						System.out.print(blockSeatIcon);
					} else {
						System.out.print(bSeatIcon);
						passengerNo ++;
					}
				}
				else {System.out.print(spaceIcon);}		
				
			} else if (cabinWidth > 8) {
				
				int aisle1 = (int)cabinWidth/3;
				int aisle2 = (int)cabinWidth/3*2+1;
				
				if ((j == aisle1)||(j == aisle2)) {
					System.out.print(spaceIcon);
				}
				else {
					System.out.print(bSeatIcon);
					passengerNo ++;
				}		
	
			}		
    	}
		System.out.print(wallIcon);
	}
	
	public void createEmptyRow() {
		System.out.print(wallIcon);	
		for (int j = 0; j < this.cabinWidth; j++) {
		 System.out.print(spaceIcon);		
		}
		System.out.print(wallIcon);	
	}
	
	public void createDoor() {
		//System.out.print(wallIcon);	
		for (int j = 0; j <= this.cabinWidth+1; j++) {
		 if ((j == 0)||(j == cabinWidth+1)) {
		 System.out.print(doorIcon);	
		 }
		 else {System.out.print(spaceIcon);	}
		}
		//System.out.print(wallIcon);	
	}
	
	public void createEmergencyExit() {
		//System.out.print(wallIcon);	
		for (int j = 0; j <= this.cabinWidth+1; j++) {
		 if ((j == 0)||(j == cabinWidth+1)) {
		 System.out.print(exitIcon);	
		 }
		 else {System.out.print(spaceIcon);	}
		}
		//System.out.print(wallIcon);	
	}
	
	public void createBack() {
		 System.out.print("\\_______/");		
		
	}
	
	public void createToilette() {
		System.out.print(wallIcon);	
		for (int j = 0; j < this.cabinWidth; j++) {
			 if ((j == 0)||(j == cabinWidth-1)) {
			 System.out.print(toiletteIcon);	
			 }
			 else {System.out.print(spaceIcon);	}
			}		
		System.out.print(wallIcon);	
	}
	
	public void createFront() {
		System.out.print("  _____");
		System.out.println();
		 System.out.print(" /     \\");
		System.out.println();
		 System.out.print("/       \\");		
		
	}
	
	public void createBlock() {

		System.out.print(wallIcon);	
		for (int j = 1; j <= this.cabinWidth; j++) {
			int middle = 0;
			
			if(cabinWidth < 8) {
				middle = (int)cabinWidth/2+1;
				if (j != middle) {
					if((j==2)||(j==6)) {
						System.out.print(blockSeatIcon);
					} else {
						System.out.print(bSeatIcon);
						passengerNo ++;
					}
				}
				else {System.out.print(spaceIcon);}		
				
			} 
			else {
					System.out.print(bSeatIcon);
					passengerNo ++;
				}		
	
			}		
    	
		System.out.print(wallIcon);
		
	}
	
	public static void main(String[] args) {
		// Länge, Breite, Passagiere, davon Business, davon First, Notausgang 
		CabinGenerator generator = new CabinGenerator(10, 7, 202, 32, 0, 99);
		generator.generateCabin();
		
	}

}
