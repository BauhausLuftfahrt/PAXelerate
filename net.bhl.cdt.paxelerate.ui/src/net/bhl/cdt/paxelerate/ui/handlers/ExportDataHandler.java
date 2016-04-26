package net.bhl.cdt.paxelerate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.util.EMFModelLoader;
import net.bhl.cdt.paxelerate.ui.commands.ExportDataCommand;

/**
 * The Class ExportDataHandler.
 *
 * @author michael.schmidt
 * @version 1.0
 */

public class ExportDataHandler extends AbstractHandler {

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
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = null;

		if (selection == null) {
			firstElement = EMFModelLoader.loadCabin();
		} else {
			firstElement = selection.getFirstElement();
		}

		if (firstElement instanceof Cabin) {
			new ExportDataCommand((Cabin) firstElement).execute();
		}

		return null;
	}

}
