package net.bhl.cdt.model.cabin.handlers;

import java.util.ArrayList;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.commands.MoveRowCommand;
import net.bhl.cdt.model.cabin.commands.SortPassengersCommand;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class SortPassengersHandler extends AbstractHandler {

	/**
	 * Get selected Element.
	 * 
	 * @param event
	 *            Selected Element
	 * @throws ExecutionException
	 *             Exception
	 * @return null
	 */
	private Cabin cabin;
	private ArrayList<Row> rowlist = new ArrayList<Row>();
	private ArrayList<Seat> seatlist = new ArrayList<Seat>();
	private ArrayList<Galley> galleylist = new ArrayList<Galley>();
	private ArrayList<Lavatory> lavatorylist = new ArrayList<Lavatory>();
	private ArrayList<Curtain> curtainlist = new ArrayList<Curtain>();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		for (Object object : selection.toList()) {
			if (object instanceof Row) {
				rowlist.add((Row) object);
			} else if (object instanceof Seat) {
				seatlist.add((Seat) object);
			} else if (object instanceof Galley) {
				galleylist.add((Galley) object);
			} else if (object instanceof Lavatory) {
				lavatorylist.add((Lavatory) object);
			} else if (object instanceof Curtain) {
				curtainlist.add((Curtain) object);
			} else {
				/* ignore other objects */
			}
		}
		if (!rowlist.isEmpty()) {
			cabin = ModelHelper.getParent(Cabin.class, rowlist.get(0));
		} else if (!seatlist.isEmpty()) {
			cabin = ModelHelper.getParent(Cabin.class, seatlist.get(0));
		} else if (!galleylist.isEmpty()) {
			cabin = ModelHelper.getParent(Cabin.class, galleylist.get(0));
		} else if (!lavatorylist.isEmpty()) {
			cabin = ModelHelper.getParent(Cabin.class, lavatorylist.get(0));
		} else if (!curtainlist.isEmpty()) {
			cabin = ModelHelper.getParent(Cabin.class, curtainlist.get(0));
		} else {
			cabin = null;
		}

		new SortPassengersCommand(cabin, rowlist, seatlist, galleylist,
				lavatorylist, curtainlist).execute();

		/*
		 * clear all lists in order to prevent the unintentioal movement of
		 * several items edited before
		 */
		rowlist.clear();
		seatlist.clear();
		galleylist.clear();
		lavatorylist.clear();
		curtainlist.clear();

		return null;
	}
}
