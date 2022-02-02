///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//package com.paxelerate.ui.handlers;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
///**
// *
// * This command creates the passengers.
// *
// * @author Marc.Engelmann
// */
//
//public class GeneratePassengersHandler extends BHLCommandHandler {
//
//	@Override
//	protected boolean canExecute() {
//		Optional<Deck> deck = EObjectHelper.getFirstChild(EMFStorageHandler.load().get(), Deck.class);
//		return deck.isPresent() ? deck.get().getDoors().size() > 0 : false;
//	}
//
//	@Override
//	protected void didFinish() {
//		System.out.println("Passenger generation " + (success ? "done." : "aborted."));
//	}
//
//	@Override
//	protected void perform() {
//
//		Map<TravelClass, Integer> amounts = new HashMap<>();
//
//		model = EMFStorageHandler.load();
//
//		model.flatMap(m -> EObjectHelper.getFirstChild(m, Deck.class)).ifPresent(deck -> {
//
//			for (TravelClass tc : DeckExtensions.getExistingClasses(deck)) {
//
//				int seats = DeckExtensions.getSeatPerClass(deck, tc);
//
//				IInputCollector.get("Enter PAX in " + tc.getLiteral().toLowerCase() + " class? (Max: " + seats + ")",
//						Integer.class).ifPresentOrElse(amount -> {
//							amounts.put(tc, amount > seats ? seats : amount);
//						}, () -> success = false);
//
//			}
//
//			deck.getPassengers().clear();
//			GeneratePassengersAction.run(deck, amounts);
//
//		});
//
//	}
//
//	@Override
//	protected void updateUI() {
//
//		if (BHLPartManager.getPart(eps, PassengerPart.class) == null) {
//			createPart(PassengerPart.class);
//		}
//
//		updatePart(PassengerPart.class);
////		updatePart(CabinPart.class);
//		updatePart(ModelElementPart.class);
//		updatePart(ModelExplorerPart.class);
//
//	}
//}
