package net.bhl.cdt.paxelerate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import net.bhl.cdt.paxelerate.ui.commands.CloneObjectCommand;

/**
 * The Class CloneObjectHandler.
 *
 * @author marc.engelmann
 */

public class CloneObjectHandler extends AbstractHandler {

	/**
	 * Get selected Element.
	 *
	 * @param event            Selected Element
	 * @return null
	 * @throws ExecutionException             Exception
	 */
	@Override
	public final Object execute(final ExecutionEvent event) throws ExecutionException {

		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = selection.getFirstElement();

		new CloneObjectCommand(firstElement).execute();

		return null;
	}

}
