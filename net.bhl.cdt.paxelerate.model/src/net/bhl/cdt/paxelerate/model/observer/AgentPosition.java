/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.observer;

import net.bhl.cdt.paxelerate.model.ui.CabinViewPart;

/**
 * TODO: Description
 */
public class AgentPosition extends Observer {

	int[][] newPosition;
	int[] submitPosition;
	CabinViewPart cabinViewPart;
	
	/**
	 * TODO: Description
	 */
	@Override
	public void update(int i) {

		// /**********Get CabinView and ConsoleView************/
		// IWorkbenchPage page =
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		// cabinViewPart = (CabinViewPart)
		// page.findView("net.bhl.cdt.model.cabin.cabinview");
		// /***************************************************/
		//
		// newPosition = ((Agent) observedSubject)
		// .getCurrentAgentPosition();
		// submitPosition[0] = newPosition[i][0];
		// submitPosition[1] = newPosition[i][1];
		// cabinViewPart.submitPassengerCoordinates(0, submitPosition);

		// JFrame frame = TestAStar.frame;

		// System.out.println(((Agent) observedSubject).getAgentName() + ": "+
		// newPosition[i][0] + " " + newPosition[i][1]);

	}

}