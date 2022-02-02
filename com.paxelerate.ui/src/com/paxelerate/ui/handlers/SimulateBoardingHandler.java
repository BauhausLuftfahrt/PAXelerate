///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//
//package com.paxelerate.ui.handlers;
//
//import java.util.Optional;
//
//import com.paxelerate.execution.actions.SimulateBoardingAction;
//import com.paxelerate.execution.init.BoardingDelayCalculator;
//import com.paxelerate.model.Deck;
//import com.paxelerate.model.ModelFactory;
//
//
//
///**
// * This command starts the boarding simulation.
// *
// * @author Marc.Engelmann
// *
// */
//
//public class SimulateBoardingHandler extends BHLCommandHandler {
//
//	@Override
//	protected boolean canExecute() {
//		Optional<Deck> deck = Optional.of(EObjectHelper.getChildren(EMFStorageHandler.load().get(), Deck.class).get(0));
//		return deck.isPresent() ? deck.get().getPassengers().size() > 0 : false;
//	}
//
//	@Override
//	protected void didFinish() {
//		System.out.println("SimulateBoardingCommand: " + (success ? "DONE" : "ERROR"));
//	}
//
//	@Override
//	protected void perform() {
//
//		model = EMFStorageHandler.load();
//
//		model.flatMap(m -> EObjectHelper.getFirstChild(m, Deck.class)).ifPresent(deck -> {
//
//			deck.getPassengers().forEach(p -> {
//				p.setIsSeated(false);
//				p.getPath().clear();
//				p.setCurrentPosition(ModelFactory.eINSTANCE.createEPoint());
//				p.setDesiredPosition(ModelFactory.eINSTANCE.createEPoint());
//			});
//
//			System.out.println("SimulateBoardingCommand: Running Simulation ...");
//
//			// Apply delay to all passengers
//			BoardingDelayCalculator.calculateDelay(deck.getDoors(), deck.getPassengers());
//
//			try {
//				new SimulateBoardingAction(deck, 1, null);
//			} catch (final Exception e) {
//				System.out.println("SimulateBoardingCommand: Aborted due to error in SimulationHandler!");
//				e.printStackTrace();
//			}
//
//		});
//	}
//
//	@Override
//	protected void updateUI() {
//
////		updatePart(CabinPart.class);
////		updatePart(ModelElementPart.class);
////		updatePart(ModelExplorerPart.class);
////		updatePart(CrossSectionPart.class);
//
//	}
//}
