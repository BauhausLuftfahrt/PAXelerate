/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.commands.DrawCabinCommand;

public class DrawCabinHandler extends AbstractHandler {

	/**
	 * Get selected Element.
	 * 
	 * @param event Selected Element
	 * @throws ExecutionException Exception
	 * @return null
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//Shell shell = HandlerUtil.getActiveShell(event);
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = selection.getFirstElement();
		//if (firstElement instanceof Cabin) {

			new DrawCabinCommand((Cabin) firstElement).execute();

		//}

		return null;
	}
}
