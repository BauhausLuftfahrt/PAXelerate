package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;

/**
 * The Class CloneObjectCommand.
 *
 * @author marc.engelmann
 */

public class CloneObjectCommand extends CDTCommand {

	/** The row. */
	private Row row;

	/**
	 * Instantiates a new clone object command.
	 *
	 * @param obj
	 *            the obj
	 */
	public CloneObjectCommand(final Object obj) {

		if (obj instanceof Row) {
			row = (Row) obj;
		}

	}

	/**
	 * This method executed the right click command.
	 */
	@Override
	protected final void doRun() {

		Input input = new Input(WindowType.CLONE_OBJECT, "Enter the number of rows you want to add (integer values).",
				IMessageProvider.INFORMATION);

		int numberOfRows = input.getIntegerValue();

		TravelClass travelclass = ModelHelper.getParent(TravelClass.class, row);
		Cabin cabin = ModelHelper.getParent(Cabin.class, row);

		for (int i = 0; i < numberOfRows; i++) {

			Row newRow = CabinFactory.eINSTANCE.createRow();
			travelclass.getRows().add(newRow);

			for (Seat seat : row.getSeats()) {

				Seat newSeat = CabinFactory.eINSTANCE.createSeat();

				newSeat.setXPosition(seat.getXPosition() + seat.getXDimension() + travelclass.getSeatPitch());
				newSeat.setYPosition(seat.getYPosition());
				newSeat.setXDimension(seat.getXDimension());
				newSeat.setYDimension(seat.getYDimension());

				newRow.getSeats().add(newSeat);
			}

			row = newRow;
		}

		new DrawCabinCommand(cabin).execute();

	}

}
