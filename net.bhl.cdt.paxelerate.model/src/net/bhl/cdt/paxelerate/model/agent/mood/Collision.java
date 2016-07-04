/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.mood;

import net.bhl.cdt.paxelerate.model.astar.node.Node.Property;

/**
 * The Class Situation.
 *
 * @author marc.engelmann, tobias.bruegge-zobel
 * @version 1.0
 * @since 0.5
 * 
 */
public class Collision {

	/** The strategy. */
	private CollisionHandler strategy;

	/** The property. */
	private Property property;

	/**
	 * Instantiates a new situation.
	 *
	 * @param strategy
	 *            the strategy
	 * @param property
	 *            the property
	 */
	public Collision(CollisionHandler strategy, Property property) {
		this.strategy = strategy;
		this.property = property;
	}

	/**
	 * Handle.
	 */
	public void handle() {
		this.strategy.reactToCollision(property);
	}
}
