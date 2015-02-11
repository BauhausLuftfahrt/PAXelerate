package net.bhl.cdt.model.cabin.handlers;

import net.bhl.cdt.model.cabin.commands.AboutViewCommand;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class AboutViewHandler extends AbstractHandler {

	/**
	 * Get selected Element.
	 * 
	 * @param event
	 *            Selected Element
	 * @throws ExecutionException
	 *             Exception
	 * @return null
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new AboutViewCommand().execute();
		return null;
	}
}
