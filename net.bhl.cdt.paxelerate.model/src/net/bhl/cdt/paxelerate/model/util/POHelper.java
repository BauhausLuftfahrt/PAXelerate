package net.bhl.cdt.paxelerate.model.util;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.Stairway;
import net.bhl.cdt.paxelerate.model.Stowage;

/**
 * This class is a helper class for.
 *
 * @author marc.engelmann
 */

public class POHelper {

	/**
	 * This method returns all objects identified by a specific ObjectOption
	 * within the cabin object.
	 * 
	 * @param option
	 *            the desired option
	 * @param cabin
	 *            the cabin which contains the objects
	 * @return All requested objects
	 */

	public static List<PhysicalObject> getObjectsByOption(ObjectOption option,
			Cabin cabin) {

		List<PhysicalObject> list = new ArrayList<>();

		switch (option) {

		case GALLEY:
			for (Galley galley : cabin.getGalleys()) {
				list.add(galley);
			}
			break;

		case LAVATORY:
			for (Lavatory lavatory : cabin.getLavatories()) {
				list.add(lavatory);
			}
			break;

		case SEAT:
			for (Seat seat : ModelHelper.getChildrenByClass(cabin,
					Seat.class)) {
				list.add(seat);
			}
			break;

		case STOWAGE:
			for (Stowage stowage : cabin.getStowages()) {
				list.add(stowage);
			}
			break;

		case STAIRWAY:
			for (Stairway stairway : cabin.getStairways()) {
				list.add(stairway);
			}
			break;

		case CURTAIN:
			for (Curtain curtain : cabin.getCurtains()) {
				list.add(curtain);
			}
			break;
		}
		return list;
	}
}
