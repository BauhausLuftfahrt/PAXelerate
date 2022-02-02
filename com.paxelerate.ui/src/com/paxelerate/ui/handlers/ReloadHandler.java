///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//
//package com.paxelerate.ui.handlers;
//
//import java.util.ArrayList;
//
///**
// * @author Marc.Engelmann
// * @since 15.01.2019
// *
// */
//public class ReloadHandler extends BHLCommandHandler {
//
//	private final List<Costmap> costmaps = new ArrayList<>();
//	private final List<List<IntVector>> goals = new ArrayList<>();
//	private Areamap areamap;
//	private Deck deck;
//
//	@Override
//	protected boolean canExecute() {
//		return true;
//	}
//
//	@Override
//	protected void didFinish() {
//		System.out.println("Obstacle map calculations done!");
//	}
//
//	@Override
//	protected void perform() {
//
//		costmaps.clear();
//
//		model = EMFStorageHandler.load();
//
//		model.flatMap(m -> EObjectHelper.getFirstChild(m, Deck.class)).ifPresent(deck -> {
//
//			areamap = new Areamap(deck);
//
//			for (final Door door : DoorExtensions.getActiveDoors(deck)) {
//
//				if (door.getWaitingPassengers().isEmpty()) {
//					continue;
//				}
//
//				final List<IntVector> goalList = new ArrayList<>(SimulationFunctions.determineGoalForObject(door));
//				goals.add(goalList);
//				costmaps.add(new Costmap(SimulationFunctions.determineStartForDoor(door), goalList, areamap, null, 0));
//			}
//
//			this.deck = deck;
//
//		});
//	}
//
//	@Override
//	protected void updateUI() {
//
//		BHLPartManager.getPart(eps, HeatmapPart.class).ifPresent(p -> p.submitData(costmaps, goals, areamap, deck));
//	}
//}
