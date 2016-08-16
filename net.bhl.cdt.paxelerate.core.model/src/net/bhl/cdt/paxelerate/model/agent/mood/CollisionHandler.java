/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.mood;

import net.bhl.cdt.paxelerate.model.agent.enums.Property;

/**
 * The Interface Strategy.
 *
 * @author marc.engelmann, tobias.bruegge-zobel
 * @version 1.0
 * @since 0.5
 * 
 */
public interface CollisionHandler {

	/**
	 * React to collision.
	 *
	 * @param property
	 *            the property
	 */

	public void reactToCollision(Property property);

}
