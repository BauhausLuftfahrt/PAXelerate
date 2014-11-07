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
	
	private int totalRows;
	private int BCRows;
	private int ECRows;
	private int FCRows;
	
	
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
		int emergencyLocation1 = 0;
		int emergencyLocation2 = 0;
		int ECpax = 0;
		
		
		
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
		
		ECpax = passengers - BCpax;
		createFront();
		System.out.println();	
		
		if ((int)cabinWidth<8) { 
			seatsPerRow = (int)cabinWidth-1;
		} else if ((int)cabinWidth>=8) {
			seatsPerRow = (int)cabinWidth-2;	
		}
		FCRows = FCpax/(seatsPerRow-4);
		BCRows = BCpax/(seatsPerRow-2);
		ECRows = ECpax / seatsPerRow;
		totalRows = BCRows + ECRows + FCRows;
		emergencyLocation1 = FCRows+BCRows;
		emergencyLocation2 = totalRows - 15;
		for (int i = 0; i <= cabinLength; i++) {
			
			//cabin[i][0].isWall = true; ???
			
			if (i == 0) {
				createDoor();
				createBlock();
			} else if(i<= FCRows) {
				createFCSeatRow();
			}
			else if (i<= (BCRows+FCRows)) {
				createBCSeatRow();
			}  
			
			else if (i<=totalRows) { 
				createSeatRow();
			}
			else {
				
				createEmptyRow();
				
			}
			
			if (i==emergencyLocation1) {
				createBlock();
				System.out.println();
				createEmergencyExit();
	
			}
			
			if (i==emergencyLocation2) {
				System.out.println();
				createEmergencyExit();
	
			}
			
			//System.out.print("|");
			System.out.println();
			rowCount ++;
		}
		createDoor();
		System.out.println();
		createBack();
		System.out.println();
		System.out.println();
		System.out.print(passengerNo);
		System.out.print(" passengers on board.");
		
		//double test = passengerNo%seatsPerRow;
		if ((passengerNo != passengers)) {
			System.out.println();
			System.out.print("Not all passengers could be seated!");
		} else {
			System.out.println();
			System.out.print("All passengers could be seated!");			
		}

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
	
	public void createFCSeatRow() {
		System.out.print(wallIcon);	
		for (int j = 1; j <= this.cabinWidth; j++) {
			int middle = 0;
			
			if(cabinWidth < 8) {
				middle = (int)cabinWidth/2+1;
				if (j != middle) {
					if((j==2)||(j==6)) {
						System.out.print(fSeatIcon);
						passengerNo ++;
					} else {
						System.out.print(spaceIcon);
						
					}
				}
				else {System.out.print(spaceIcon);}		
				
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
		System.out.println();	
		System.out.print(wallIcon);	
		for (int j = 1; j <= this.cabinWidth; j++) {
			int middle = 0;
			
			if(cabinWidth < 8) {
				middle = (int)cabinWidth/2+1;
				if (j != middle) {
						System.out.print(stopIcon);	
				}
				else {System.out.print(spaceIcon);}		
				
			} 		
		}		
		System.out.print(wallIcon);
		
	}
	
	public static void main(String[] args) {
		// Länge, Breite, Passagiere, davon Business, davon First, Notausgang 
		CabinGenerator generator = new CabinGenerator(40, 7, 210, 32, 4 ,99);
		generator.generateCabin();
		
	}

}
