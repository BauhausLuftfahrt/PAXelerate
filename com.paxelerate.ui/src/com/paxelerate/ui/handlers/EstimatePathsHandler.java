///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//package com.paxelerate.ui.handlers;
//
//import java.util.Optional;
//
//import com.paxelerate.core.simulation.astar.SimulationHandler;
//import com.paxelerate.execution.init.BoardingDelayCalculator;
//import com.paxelerate.model.Deck;
//
//
///**
// *
// *
// * @author Marc.Engelmann
// *
// */
//
//public class EstimatePathsHandler extends BHLCommandHandler {
//
//	@Override
//	protected boolean canExecute() {
//		Optional<Deck> deck = Optional.of(EObjectHelper.getChildren(EMFStorageHandler.load().get(), Deck.class).get(0));
//		return deck.isPresent() ? deck.get().getPassengers().size() > 0 : false;
//	}
//
//	@Override
//	protected void didFinish() {
//		System.out.println("Paths estimated!");
//	}
//
//	@Override
//	protected void perform() {
//
//		model = EMFStorageHandler.load();
//
//		System.out.println("EstimatePathsCommand: Calculating paths ...");
//
//		model.flatMap(m -> EObjectHelper.getFirstChild(m, Deck.class)).ifPresent(deck -> {
//
//			// Calculate the delay and reassign doors
//			BoardingDelayCalculator.calculateDelay(deck.getDoors(), deck.getPassengers());
//
//			try {
//				new SimulationHandler(deck, true, null);
//			} catch (final Exception e) {
//				System.out.println("EstimatePathsCommand: Aborted due to error in SimulationHandler!");
//				e.printStackTrace();
//			}
//		});
//	}
//
//	@Override
//	protected void updateUI() {
////		updatePart(CabinPart.class);
//	}
//}
