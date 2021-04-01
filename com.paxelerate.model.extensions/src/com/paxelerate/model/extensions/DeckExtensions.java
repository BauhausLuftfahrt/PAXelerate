/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.ModelFactory;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.monuments.SeatGroup;

import Cpacs.DeckType;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringVectorExtensions;
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.LinearInterpolation;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;
import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * @author Marc.Engelmann
 * @since 26.04.2019
 *
 */

public interface DeckExtensions {

	/**
	 * @param object
	 * @return
	 */
	static Deck getBy(EObject object) {
		if (object instanceof Passenger) {
			return EObjectHelper.getParent(Deck.class, ((Passenger) object).getSeat());
		} else {
			return EObjectHelper.getParent(Deck.class, object);
		}
	}

	/**
	 * @param deck
	 * @return
	 */
	static EPoint getMaximumSize(Deck deck) {

		EPoint size = ModelFactory.eINSTANCE.createEPoint();

		double x = deck.getShapeFloor().get(deck.getShapeFloor().size() - 1).getX()
				- deck.getShapeFloor().get(0).getX();
		double y = 2.0 * deck.getShapeFloor().stream().mapToDouble(EPoint::getY).max().getAsDouble();

		size.setY(y);
		size.setX(x);
		size.setZ(deck.getHeight());
		return size;
	}

	/**
	 * @param parent
	 * @return
	 */
	static Double getShapeYDimensionAtX(Deck deck, double x) {

		// Transform data type
		List<DoubleVector> list = new ArrayList<>();

		for (EPoint point : deck.getShapeFloor()) {
			list.add(EPointExtensions.transform(point));
		}

		// Calculate result
		return LinearInterpolation.getYUsingClosestPointsAt(x, list);
	}

	/**
	 *
	 * @param deck
	 * @return
	 */
	static IntVector getSimulationDimensions(Deck deck) {
		double scale = EObjectHelper.getParent(Model.class, deck).getSettings().getSimulationGridResolution();
		return new IntVector(BHLMath.toInt(DeckExtensions.getMaximumSize(deck).getX() / scale),
				BHLMath.toInt(DeckExtensions.getMaximumSize(deck).getY() / scale));
	}

	/**
	 * @param tc
	 * @return
	 */
	static int getSeatPerClass(Deck deck, TravelClass tc) {
		return DeckExtensions.getSeatsIn(deck, tc).size();
	}

	/**
	 *
	 * @param position
	 * @param deck
	 * @return
	 */
	static boolean inSimulationBounds(IntVector position, Deck deck) {
		return position.getX() >= 0 && position.getY() >= 0
				&& position.getX() < DeckExtensions.getMaximumSize(deck).getX()
						/ DeckExtensions.getSimulationDimensions(deck).getX()
				&& position.getY() < DeckExtensions.getMaximumSize(deck).getY()
						/ DeckExtensions.getSimulationDimensions(deck).getY();
	}

	/**
	 * @param deck
	 * @return
	 */
	static List<TravelClass> getExistingClasses(Deck deck) {
		List<TravelClass> classes = new ArrayList<>();

		for (TravelClass tc : TravelClass.values()) {
			if (DeckExtensions.getSeatPerClass(deck, tc) > 0) {
				classes.add(tc);
			}
		}

		return classes;
	}

	static List<Seat> getSeatsIn(Deck deck, TravelClass tc) {
		return EObjectHelper.getFilteredChildren(deck, Seat.class,
				s -> EObjectHelper.getParent(SeatGroup.class, s).getTravelClass() == tc);
	}

	/**
	 * @param deckObject
	 * @return
	 */
	static Deck fromCPACS(DeckType deckType) {

		Deck deck = ModelFactory.eINSTANCE.createDeck();
		deck.setName(deckType.getUID());

		return deck;

	}

	/**
	 *
	 * @param cabin
	 * @param values
	 */
	static void geometryFromCPACS(Deck deck, DeckType deckType) {

		List<Double> geometryX = StringVectorExtensions.toDoubleList(deckType.getCabGeometry().getX());
		List<Double> geometryZ = deckType.getCabGeometry().getZ() == null ? null
				: StringVectorExtensions.toDoubleList(deckType.getCabGeometry().getZ());
		List<Double> geometryYZ1 = StringVectorExtensions.toDoubleList(deckType.getCabGeometry().getYZ1());

		for (int j = 0; j < geometryX.size(); j++) {

			EPoint vec = ModelFactory.eINSTANCE.createEPoint();
			vec.setX(geometryX.get(j));
			vec.setY(geometryYZ1.get(j));
			vec.setZ(geometryZ != null ? geometryZ.get(0) : 0.0);
			deck.getShapeFloor().add(vec);
		}
	}

}
