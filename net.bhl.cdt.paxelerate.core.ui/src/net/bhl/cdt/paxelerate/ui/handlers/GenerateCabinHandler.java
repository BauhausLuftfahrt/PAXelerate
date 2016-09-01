/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.util.EMFModelLoader;
import net.bhl.cdt.paxelerate.ui.commands.GenerateCabinCommand;

/**
 * The Class GenerateCabinHandler.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */

public class GenerateCabinHandler extends AbstractHandler {

	/**
	 * Get selected Element.
	 *
	 * @param event
	 *            Selected Element
	 * @return null
	 * @throws ExecutionException
	 *             Exception
	 */
	@Override
	public final Object execute(final ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = null;

		// TODO: this does not work if the cabin has not once been refreshed
		// using a right click refresh.

		if (selection == null) {
			firstElement = EMFModelLoader.loadCabin();
		} else {
			firstElement = selection.getFirstElement();
		}

		if (firstElement instanceof Cabin) {
			new GenerateCabinCommand((Cabin) firstElement).execute();
		}

		return null;
	}
}