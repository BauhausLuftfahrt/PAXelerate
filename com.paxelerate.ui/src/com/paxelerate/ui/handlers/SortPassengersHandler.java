///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//package com.paxelerate.ui.handlers;
//
//
///**
// * This class is used for sorting the Passenger.class objects depending on
// * predefined criteria.
// *
// *
// * @author Marc.Engelmann
// * @since 15.01.2019
// *
// */
//
//public class SortPassengersHandler extends BHLCommandHandler {
//
//	@Override
//	protected boolean canExecute() {
//		Optional<Deck> deck = Optional.of(EObjectHelper.getChildren(EMFStorageHandler.load().get(), Deck.class).get(0));
//		return deck.isPresent() ? deck.get().getPassengers().size() > 0 : false;
//	}
//
//	@Override
//	protected void didFinish() {
//		System.out.println("SortPassengersCommand: Sorting " + (success ? "done" : "failed") + ".");
//	}
//
//	@Override
//	protected void perform() {
//
//		model = EMFStorageHandler.load();
//
//		IOptionSelector.getValue(Arrays.asList(SortingScheme.values()), "Sort passengers ...")
//				.ifPresent(result -> EObjectHelper.getFirstChild(model.get(), Deck.class)
//						.ifPresent(c -> SortPassengersAction.sort(c, SortingScheme.get(result))));
//
//		if (success) {
//			model.ifPresent(EMFStorageHandler::save);
//		}
//
//	}
//
//	@Override
//	protected void updateUI() {
//
////		updatePart(CabinPart.class);
//		updatePart(ModelElementPart.class);
//		updatePart(ModelExplorerPart.class);
//
//	}
//}