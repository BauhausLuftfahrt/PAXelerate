package net.bhl.cdt.model.cabin.handlers;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.commands.FloodCabinCommand;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class FloodCabinHandler extends AbstractHandler {

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

			new FloodCabinCommand((Cabin) firstElement).execute();

		//}

		return null;
	}
}
