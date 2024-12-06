/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
/**
 * @author Marc.Engelmann
 *
 * @since 08.02.2023
 */
package com.paxelerate.gateway;

import com.paxelerate.execution.actions.BatchSimulationAction;

import Cpacs.CpacsFactory;
import Cpacs.CpacsType;
import net.bhl.opensource.cpacs.functions.CPACSInitializer;
import net.bhl.opensource.cpacs.functions.CPACSWriter;
import paxelerate.PaxelerateFactory;
import paxelerate.PaxelerateType;
import py4j.ClientServer;

/**
 * @author Marc.Engelmann
 * @since 08.02.2023
 *
 */
public class PaxelerateGateway {

	/**
	 * @param completeCpacsString
	 * @param target_path
	 */
	public String run_paxelerate(String completeCpacsString) {
		System.out.println("[paxelerate]: Executing boarding simulation.");

		CpacsType cpacs = CpacsFactory.eINSTANCE.createCpacsType();

		PaxelerateType tool = PaxelerateFactory.eINSTANCE.createPaxelerateType();
		CPACSInitializer.initFromStringWithToolspecific(cpacs, completeCpacsString, tool);

		BatchSimulationAction.run(cpacs, tool, null);

		return CPACSWriter.toString(cpacs);
	}

	public void terminate() {
		System.out.println("[paxelerate]: Gateway server terminated.");
		System.exit(0);
	}

	public static void main(String[] args) {

		PaxelerateGateway app = new PaxelerateGateway();
		ClientServer server = new ClientServer(app);
		server.startServer();

		System.out.println("[paxelerate]: Gateway server started.");

	}
}
