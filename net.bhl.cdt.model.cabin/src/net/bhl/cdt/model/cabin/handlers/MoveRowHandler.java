package net.bhl.cdt.model.cabin.handlers;

import java.util.ArrayList;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.commands.MoveRowCommand;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class MoveRowHandler extends AbstractHandler {

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
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;	
		ArrayList<Row> rowList = new ArrayList<Row>();
		for(Object object:selection.toList()) {
			if(object instanceof Row) {
				rowList.add((Row)object);
			}
		}
		Cabin cabin = ModelHelper.getParent(Cabin.class, (Row) selection.getFirstElement());
		new MoveRowCommand(cabin, rowList).execute();
		return null;
	}
}
