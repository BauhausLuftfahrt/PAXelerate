/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.monuments.MonumentsFactory;
import com.paxelerate.model.monuments.Obstacle;

import Cpacs.CabinFloorElementType;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface MonumentExtensions {

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void fromCPACS(Deck deck, CabinFloorElementType floorType) {

		double x = floorType.getX().getValue();
		double y = floorType.getY().getValue();

		double width = floorType.getWidth().getValue();
		double length = floorType.getLength().getValue();
		double height = floorType.getHeight().getValue();
		// double rotation = floorType.getX().getValue();

		// Multiply by 100 because of different units. (CPACS: Meters, PAXelerate:
		// Centimeters). Minus xZero as the position is referenced to global CoSy.
		EPoint position = EPointExtensions.create(x, y - width / 2.0);
		EPoint size = EPointExtensions.create(length, width, height);

		// Objects that are smaller than the simulation grid size must be enlarged
		if (size.getX() < 0.10) {
			size.setX(0.10);
		}

		Obstacle obstacle = MonumentsFactory.eINSTANCE.createObstacle();
		deck.getObstacles().add(obstacle);

		obstacle.setPosition(position);
		obstacle.setSize(size);

	}
}
