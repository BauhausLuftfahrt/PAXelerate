/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.monuments.MonumentsFactory;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.monuments.SeatGroup;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.Distance;
import net.bhl.opensource.toolbox.math.random.RandomHelper;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface SeatExtensions {

	/**
	 *
	 * @param row
	 * @param position
	 * @param dimension
	 * @return
	 */
	static Seat create(char letter, SeatGroup group, SeatLocation location) {

		Seat seat = MonumentsFactory.eINSTANCE.createSeat();
		group.getSeats().add(seat);
		seat.setId(RandomHelper.randomInt());
		seat.setLetter(letter);
		seat.setSeatLocation(location);
		return seat;
	}

	/**
	 * @param seat
	 * @return
	 */
	static EPoint getCenter(Seat seat) {
		return EPointExtensions.create(getPosition(seat).getX() + getSize(seat).getX() / 2.0,
				getPosition(seat).getY() + getSize(seat).getY() / 2.0);
	}

	/**
	 *
	 * @param door
	 * @param seat
	 * @return
	 */
	static Double getDistanceBetween(DoubleVector location, Seat seat) {
		return Distance.distanceBetween(location.getX(), location.getY(), getPosition(seat).getX(),
				(int) Math.round(getPosition(seat).getY() + getSize(seat).getY() / 2.0));
	}

	/**
	 * @param seat
	 * @return
	 */
	static EPoint getPosition(Seat seat) {
		EPoint size = getSize(seat);
		SeatGroup parent = EObjectHelper.getParent(SeatGroup.class, seat);

		double x = parent.getPosition().getX();
		double y = parent.getPosition().getY() + parent.getSeats().indexOf(seat) * size.getY();
		double z = 0;

		return EPointExtensions.create(x, y, z);
	}

	/**
	 * @param seat
	 * @return
	 */
	static EPoint getSize(Seat seat) {

		SeatGroup parent = EObjectHelper.getParent(SeatGroup.class, seat);

		double x = parent.getSize().getX();
		double y = parent.getSize().getY() / parent.getSeats().size();
		double z = parent.getSize().getZ();

		return EPointExtensions.create(x, y, z);
	}

	/**
	 * @param seat
	 * @return
	 */
	static TravelClass getTravelClass(Seat seat) {
		return EObjectHelper.getParent(SeatGroup.class, seat).getTravelClass();
	}

	/**
	 * Same side of aisle.
	 *
	 * @param checkSeat
	 * @param mySeat
	 * @return true, if successful
	 */
	static boolean sameSeatBlock(Seat checkSeat, Seat mySeat) {
		return EObjectHelper.getParent(SeatGroup.class, mySeat).getSeats().contains(checkSeat);
	}
}
