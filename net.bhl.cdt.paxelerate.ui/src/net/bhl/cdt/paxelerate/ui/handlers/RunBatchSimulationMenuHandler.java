/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import net.bhl.cdt.paxelerate.ui.commands.RunBatchSimulationMenuCommand;



/**
 * The Class SimulateBoardingHandler.
 *
 * @author michael.schmidt
 */

public class RunBatchSimulationMenuHandler extends AbstractHandler {

	/**
	 * Get selected Element.
	 *
	 * @param event            Selected Element
	 * @return null
	 * @throws ExecutionException             Exception
	 */
	@Override
	public final Object execute(final ExecutionEvent event) throws ExecutionException {
		
		new RunBatchSimulationMenuCommand().execute();
		
		return null;
	}
}
