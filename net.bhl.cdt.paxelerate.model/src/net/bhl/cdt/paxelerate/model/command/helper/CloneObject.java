/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.command.helper;

import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;


/**
 * The Class CloneObject
 *
 * @author michael.schmidt
 * @version 1.0
 * @since 0.8
 */

public class CloneObject {

	/** The row. */
	private Row row;
	private TravelClass travelClass;
	private int numberOfRows;

	public CloneObject(final TravelClass travelClass, int numberOfRows) {
		this.travelClass = travelClass;
		this.numberOfRows = numberOfRows;
	}

	public void performCloneObject() {
		for (int i = 0; i < numberOfRows; i++) {

			Row newRow = CabinFactory.eINSTANCE.createRow();
			travelClass.getRows().add(newRow);

			for (Seat seat : row.getSeats()) {

				Seat newSeat = CabinFactory.eINSTANCE.createSeat();

				newSeat.setXPosition(seat.getXPosition() + seat.getXDimension()
						+ travelClass.getSeatPitch());
				newSeat.setYPosition(seat.getYPosition());
				newSeat.setXDimension(seat.getXDimension());
				newSeat.setYDimension(seat.getYDimension());

				newRow.getSeats().add(newSeat);
			}

			row = newRow;
		}
	}

}
