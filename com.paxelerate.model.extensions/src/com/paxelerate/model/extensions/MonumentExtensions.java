/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.monuments.MonumentsFactory;
import com.paxelerate.model.monuments.Obstacle;

import Cpacs.ClassDividerElementsType;
import Cpacs.DeckComponent2DBaseType;
import Cpacs.DeckComponentBaseType;
import Cpacs.DeckElementBaseType;
import Cpacs.GalleyElementType;
import Cpacs.GalleyElementsType;
import Cpacs.GenericFloorElementsType;
import Cpacs.LavatoryElementsType;
import Cpacs.LuggageCompartmentElementsType;

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
	static void genericsfromCPACS(Deck deck, DeckComponent2DBaseType floorType, GenericFloorElementsType templates) {

		DeckElementBaseType template = templates.getGenericFloorElement().stream()
				.filter(s -> s.getUID().contentEquals(floorType.getDeckElementUID().getValue())).findFirst().get();

		double x = floorType.getTransformation().getTranslation().getX().getValue();
		double y = floorType.getTransformation().getTranslation().getY().getValue();

		double width = template.getGeometry().getBoundingBox().getDeltaY().getValue();
		double length = template.getGeometry().getBoundingBox().getDeltaX().getValue();
		double height = template.getGeometry().getBoundingBox().getDeltaZ().getValue();

		EPoint position = EPointExtensions.create(x, y);
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

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void galleyfromCPACS(Deck deck, DeckComponent2DBaseType floorType, GalleyElementsType templates) {

		GalleyElementType template = templates.getGalleyElement().stream()
				.filter(s -> s.getUID().contentEquals(floorType.getDeckElementUID().getValue())).findFirst().get();

		double x = floorType.getTransformation().getTranslation().getX().getValue();
		double y = floorType.getTransformation().getTranslation().getY().getValue();

		double width = template.getGeometry().getBoundingBox().getDeltaY().getValue();
		double length = template.getGeometry().getBoundingBox().getDeltaX().getValue();
		double height = template.getGeometry().getBoundingBox().getDeltaZ().getValue();

		EPoint position = EPointExtensions.create(x, y);
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

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void lavatoryFromCPACS(Deck deck, DeckComponent2DBaseType floorType, LavatoryElementsType templates) {

		DeckElementBaseType template = templates.getLavatoryElement().stream()
				.filter(s -> s.getUID().contentEquals(floorType.getDeckElementUID().getValue())).findFirst().get();

		double x = floorType.getTransformation().getTranslation().getX().getValue();
		double y = floorType.getTransformation().getTranslation().getY().getValue();

		double width = template.getGeometry().getBoundingBox().getDeltaY().getValue();
		double length = template.getGeometry().getBoundingBox().getDeltaX().getValue();
		double height = template.getGeometry().getBoundingBox().getDeltaZ().getValue();

		EPoint position = EPointExtensions.create(x, y);
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

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void dividerFromCPACS(Deck deck, DeckComponent2DBaseType floorType, ClassDividerElementsType templates) {

		DeckElementBaseType template = templates.getClassDividerElement().stream()
				.filter(s -> s.getUID().contentEquals(floorType.getDeckElementUID().getValue())).findFirst().get();

		double x = floorType.getTransformation().getTranslation().getX().getValue();
		double y = floorType.getTransformation().getTranslation().getY().getValue();

		double width = template.getGeometry().getBoundingBox().getDeltaY().getValue();
		double length = template.getGeometry().getBoundingBox().getDeltaX().getValue();
		double height = template.getGeometry().getBoundingBox().getDeltaZ().getValue();

		EPoint position = EPointExtensions.create(x, y);
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

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void luggageFromCPACS(Deck deck, DeckComponentBaseType floorType, LuggageCompartmentElementsType templates) {

		DeckElementBaseType template = templates.getLuggageCompartmentElement().stream()
				.filter(s -> s.getUID().contentEquals(floorType.getDeckElementUID().getValue())).findFirst().get();

		double x = floorType.getTransformation().getTranslation().getX().getValue();
		double y = floorType.getTransformation().getTranslation().getY().getValue();

		double width = template.getGeometry().getBoundingBox().getDeltaY().getValue();
		double length = template.getGeometry().getBoundingBox().getDeltaX().getValue();
		double height = template.getGeometry().getBoundingBox().getDeltaZ().getValue();

		EPoint position = EPointExtensions.create(x, y);
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
