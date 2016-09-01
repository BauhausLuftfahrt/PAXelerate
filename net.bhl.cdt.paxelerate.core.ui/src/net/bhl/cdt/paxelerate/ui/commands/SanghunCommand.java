/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;


import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;




public class SanghunCommand extends CDTCommand {

	private Cabin cabin;
	//private Lavatory lavatory;
	//private Galley galley;

	public SanghunCommand(final Object obj) {
		this.cabin = (Cabin) obj;
		
	}

	/**
	 * This method executed the right click command.
	 */
	@Override
	protected final void doRun() {

		Log.add(this, "Sanghun Command is starting...!");
		
		TravelClass tc = CabinFactory.eINSTANCE.createTravelClass();
		cabin.getClasses().add(tc);
		
		tc.setTravelOption(TravelOption.ECONOMY_CLASS);
		tc.setRowStructure("2-2");
		tc.setSeatPitch(20);
		tc.setXDimensionOfSeats(80);
		tc.setYDimensionOfSeats(80);
		
		Lavatory lavaFront = CabinFactory.eINSTANCE.createLavatory();
		cabin.getLavatories().add(lavaFront);
		lavaFront.setXPosition(0);					
		lavaFront.setYPosition(0);
		lavaFront.setXDimension(100);
		lavaFront.setYDimension(160);
		
		Lavatory lavaRear = CabinFactory.eINSTANCE.createLavatory();
		cabin.getLavatories().add(lavaRear);
		lavaRear.setXPosition(2310);					
		lavaRear.setYPosition(0);
		lavaRear.setXDimension(100);
		lavaRear.setYDimension(160);
		
		Galley galleyFront = CabinFactory.eINSTANCE.createGalley();
		cabin.getGalleys().add(galleyFront);
		galleyFront.setXPosition(0);
		galleyFront.setYPosition(204);
		galleyFront.setXDimension(100);
		galleyFront.setYDimension(160);
		
		Galley galleyRear = CabinFactory.eINSTANCE.createGalley();
		cabin.getGalleys().add(galleyRear);
		galleyRear.setXPosition(2310);
		galleyRear.setYPosition(204);
		galleyRear.setXDimension(100);
		galleyRear.setYDimension(160);
		
		Door doorFront = CabinFactory.eINSTANCE.createDoor();
		cabin.getDoors().add(doorFront);
		doorFront.setXPosition(100);
		doorFront.setWidth(100);
		
		Door doorRear= CabinFactory.eINSTANCE.createDoor();
		cabin.getDoors().add(doorRear);
		doorRear.setXPosition(2210);
		doorRear.setWidth(100);
		
		int rowNumber=1;
		int numberOfseats=0;
		int xPos = 300;
		
		while(rowNumber != 11)
		{
			
			Row newRow = CabinFactory.eINSTANCE.createRow();
			tc.getRows().add(newRow);
			
			
			
			newRow.setRowNumber(rowNumber);
			
			int i = 0;
			int yPos = 0;
			
			while(i != 4){
				
				if(i == 2 )
				{
					yPos= yPos+44;
				}
					Seat newSeat = CabinFactory.eINSTANCE.createSeat();
					newRow.getSeats().add(newSeat);
					//newSeat.setXDimension(50);
					//newSeat.setYDimension(50);
					newSeat.setXPosition(xPos);					
					newSeat.setYPosition(yPos);
						
					i++;
					numberOfseats++;
					yPos = yPos + 80;	
				
				}
			
			xPos = xPos + 200;
			yPos=0;
			rowNumber++;
			
		
		
		}
		
		Integer totalRowInt = rowNumber -1;
		String totalRowStr = totalRowInt.toString();
		String resultRow = "the number of rows is ".concat(totalRowStr);
		
		Integer totalSeatInt = numberOfseats;
		String totalSeatStr = totalSeatInt.toString();
		String resultSeat = "the number of seats is ".concat(totalSeatStr);
		
		Log.add(this, resultRow);
		Log.add(this, resultSeat);
		
		
		Log.add(this, "...finished!");
		
		
		
		
	}
}


