/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import java.util.List;

import com.paxelerate.model.Deck;
import com.paxelerate.model.monuments.MonumentsFactory;
import com.paxelerate.model.monuments.Row;
import com.paxelerate.model.monuments.Seat;

import net.bhl.opensource.toolbox.emf.EObjectHelper;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface RowExtensions {

	/**
	 *
	 * @param tc
	 * @return
	 */
	static Row create(Deck deck) {
		Row row = MonumentsFactory.eINSTANCE.createRow();
		deck.getRows().add(row);
		return row;
	}

	/**
	 *
	 * @param seat
	 * @return
	 */
	static List<Seat> getAllSeats(Seat seat) {
		return EObjectHelper.getChildren(EObjectHelper.getParent(Row.class, seat), Seat.class);
	}

	/**
	 * @param row
	 * @return
	 */
	static int getRowNumber(Row row) {
		return EObjectHelper.getChildren(EObjectHelper.getParent(Deck.class, row), Row.class).indexOf(row) + 1;
	}
}
