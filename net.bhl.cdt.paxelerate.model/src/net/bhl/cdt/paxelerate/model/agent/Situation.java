/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import net.bhl.cdt.paxelerate.model.astar.Node.Property;

public class Situation {

	private Strategy strategy;
	private Property property;

	public Situation(Strategy strategy, Property property) {
		this.strategy = strategy;
		this.property = property;
	}

	public void handle() {
		this.strategy.reactToCollision(property);
	}
}
