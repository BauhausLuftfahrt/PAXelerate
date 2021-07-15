/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.paxelerate.core.simulation.astar.SimulationHandler;
import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.ModelFactory;
import com.paxelerate.model.SimulationResult;
import com.paxelerate.model.agent.Passenger;

import net.bhl.opensource.toolbox.time.TimeHelper;

/**
 * @author Michael.Schmidt, Marc.Engelmann
 * @since 22.08.2019
 *
 */
public class ExportResultsAction {

	/**
	 *
	 * @param handler
	 * @param cabin
	 * @param boardingStatus
	 * @param time
	 * @param simulationTime
	 */
	static void setSimulationData(SimulationHandler handler, Model model, List<ArrayList<Integer>> boardingStatus,
			double time, double simulationTime) {

		Deck deck = model.getDeck();

		SimulationResult result = ModelFactory.eINSTANCE.createSimulationResult();
		model.getSimulationResults().add(result);

		result.setPassengers(deck.getPassengers().size());

		result.setBoardingTime(
				handler.getMasterBoardingTime() * model.getSettings().getSimulationSpeedFactor() / 1000.0);

		result.setSimulationTime(simulationTime);

		result.setId(model.getSimulationResults().size() + 1);

		result.setName(new SimpleDateFormat("dd.MM, HH:mm").format(new Date()));

		result.setDate(new Date());

		result.setBoardingTimeString(TimeHelper.toTimeOfDay(time));

		result.setWaymakingCompleted(handler.getPassengersByState(null, true).stream()
				.mapToInt(Passenger::getNumberOfMakeWayOperations).sum());

		result.setLayoutConceptType(model.getSettings().getSeatType());

//		result.setLuggageStorageFillingDegree(deck.getLuggageStorages().stream()
//				.mapToDouble(s -> 100 - s.getFreeVolume() * 100 / s.getNetVolume()).average().orElse(0));

		// TODO: WRONG!
//			r.setTotalLargeBagsStowed(deck.getLuggageStorages().stream().mapToInt(l -> l.getMaximumLargeBags()).sum());

//		result.setTotalStorageVolume(
//				deck.getLuggageStorages().stream().mapToDouble(LuggageStorage::getNetVolume).sum());

		result.setAverageNumberOfActivePassengers(
				(int) boardingStatus.stream().mapToDouble(l -> l.get(2)).average().orElse(0));

		result.setMaxNumberOfActivePassengers(boardingStatus.stream().mapToInt(l -> l.get(2)).max().orElse(0));

		result.setAverageNumberOfBags(
				deck.getPassengers().stream().mapToDouble(p -> p.getLuggage().size()).average().orElse(0));
	}

}
