///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//
//package com.paxelerate.ui.handlers;
//
///**
// * @author Marc.Engelmann
// * @since 15.01.2019
// *
// */
//public class ImportCSVHandler extends BHLCommandHandler {
//
//	@Override
//	protected boolean canExecute() {
//		return true;
//	}
//
//	@Override
//	protected void didFinish() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	protected void perform() {
//
//		FilePicker.getFile(System.getProperty("user.home") + "/Documents/paxelerate", "csv").ifPresentOrElse(csv -> {
//
//			// Load all simulation data
//			final List<DataSet> data = CSVImport.importAll(csv.getPath(), "");
//
//			DataSet dataset = data.get(0);
//
//			// Import the cabin from CPACS file
//			Model modelFile = InitializeFromCPACSAction.run(
//					new File(DataKeys.IMPORT_PATH + dataset.getString(ImportKeys.CPACS_MODEL_NAME).get() + ".xml"));
//
//			GeneratePassengersAction.run(modelFile.getDeck(), MatchDataAction.run(modelFile, dataset));
//
//			model = Optional.of(modelFile);
//		}, () -> success = false);
//	}
//
//	@Override
//	protected void updateUI() {
//
//		if (success) {
////			updatePart(CabinPart.class);
//			updatePart(ModelExplorerPart.class);
//			updatePart(PassengerPart.class);
////			updatePart(SideViewPart.class);
//		}
//	}
//}
