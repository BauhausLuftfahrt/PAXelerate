package net.bhl.cdt.model.cabin.handlers;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.commands.DrawCabinCommand;
import net.bhl.cdt.model.cabin.commands.GenerateCabinCommand;
import net.bhl.cdt.model.cabin.commands.SimulateBoardingCommand;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

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
