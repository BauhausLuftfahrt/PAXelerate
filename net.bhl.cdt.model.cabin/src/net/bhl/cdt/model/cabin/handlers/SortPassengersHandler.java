package net.bhl.cdt.model.cabin.handlers;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.commands.SortPassengersCommand;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class SortPassengersHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = selection.getFirstElement();
		if (firstElement instanceof Cabin) {

			new SortPassengersCommand((Cabin) firstElement).execute();

		}

		return null;
	}
}
