/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.enums;

/**
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 * @since 0.8
 *
 */

public enum State {

	/** The following path. */
	FOLLOWING_PATH,
	/** The waiting for row clearing. */
	WAITING_FOR_ROW_CLEARING,
	/** The clearing row. */
	CLEARING_ROW,
	/** The stowing luggage. */
	STOWING_LUGGAGE,
	/** The unfold seat. */
	UNFOLDING_SEAT,
	/** The preparing. */
	PREPARING,
	/** The queueing up. */
	QUEUEING_UP,
	/** The waiting for other passenger to seat. */
	WAITING_FOR_OTHER_PASSENGER_TO_SEAT,
	/** The returning to seat. */
	RETURNING_TO_SEAT;
}
