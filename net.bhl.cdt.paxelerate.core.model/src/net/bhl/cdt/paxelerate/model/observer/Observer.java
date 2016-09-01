/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.observer;


/**
 * TODO: Description.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */

public abstract class Observer {

	/** The observed subject. */
	Subject observedSubject;

	/**
	 * Update.
	 *
	 * @param i the i
	 */
	public abstract void update(int i);
}