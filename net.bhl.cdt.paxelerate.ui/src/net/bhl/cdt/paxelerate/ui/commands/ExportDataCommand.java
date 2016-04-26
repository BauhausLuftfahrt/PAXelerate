/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class Exporter.
 */

public class ExportDataCommand extends CDTCommand{
	
	/** The cabin. */
	private Cabin cabin;

	/** The Constant FILE_PATH. */
	private static final String FOLDER_NAME = "paxelerate",
			FILE_PATH = System.getProperty("user.home") + "/Documents/" + FOLDER_NAME + "/";
	/** The default fileName. */
	 String fileName = "export";
	 
	 
	 public ExportDataCommand(Cabin cabin) {
			this.cabin = cabin;
		}

	private boolean getPassengerInputData(String fileName) throws IOException, FileNotFoundException {
		
			Log.add(this, "Start data export...");
			
			File dir = new File(FILE_PATH);
			dir.mkdir();
			FileWriter writer = new FileWriter(FILE_PATH + fileName + ".xls");
			
			
			/** Create file header **/
			writer.append("id");
			writer.append("\t");
			writer.append("sex");
			writer.append("\t");
			writer.append("age");
			writer.append("\t");
			writer.append("height");
			writer.append("\t");
			writer.append("weight");
			writer.append("\t");
			writer.append("width");
			writer.append("\t");
			writer.append("depth");
			writer.append("\t");
			writer.append("walkingSpeed");
			writer.append("\t");
			writer.append("seatID");
			writer.append("\t");
			writer.append("luggage");
			writer.append("\t");
			writer.append("luggageStowTime");
			writer.append("\t");
			writer.append("luggageStowDistance");
			writer.append("\n");

			EList<Passenger> paxList = cabin.getPassengers();

			for (Passenger pax : paxList) {
				writer.append("" + pax.getId());
				writer.append("\t");
				writer.append("" + pax.getSex());
				writer.append("\t");
				writer.append("" + pax.getAge());
				writer.append("\t");
				writer.append("" + pax.getHeight());
				writer.append("\t");
				writer.append("" + pax.getWeight());
				writer.append("\t");
				writer.append("" + pax.getWidth());
				writer.append("\t");
				writer.append("" + pax.getDepth());
				writer.append("\t");
				writer.append("" + pax.getWalkingSpeed());
				writer.append("\t");
				writer.append("" + pax.getSeatID());
				writer.append("\t");
				writer.append("" + pax.getLuggage());
				writer.append("\t");
				writer.append("" + pax.getLuggageStowTime());
				writer.append("\t");
				writer.append("" + pax.getLuggageStowDistance());
				writer.append("\n");
				
			}
			
			writer.flush();
		    writer.close();
		    
		    Log.add(this, "...data export complete.");
			
		return true;

	}

	@Override
	protected void doRun() {
		Input input = new Input(WindowType.EXPORT_DATA, "Enter the filename.",
				IMessageProvider.INFORMATION);

		String fileName = input.getStringValue();
		try {
			getPassengerInputData(fileName);
		} catch (IOException e) {
			Log.add(this, "Data export failed!");
		}
	}

}
