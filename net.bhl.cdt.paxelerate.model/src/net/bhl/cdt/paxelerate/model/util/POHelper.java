package net.bhl.cdt.paxelerate.model.util;

import java.util.List;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.Seat;

/**
 * 
 * @author marc.engelmann
 *
 */

// TODO: Implement these functions directly into Cabin.java ? // CabinImpl.java?

public class POHelper {

	/**
	 * 
	 * @param option
	 * @param cabin
	 * @return
	 */

	// TODO: Replace this by using the ObjectOption ENUM directly

	@SuppressWarnings("unchecked")
	@Deprecated
	public static List<PhysicalObject> getObjectByOption(ObjectOption option,
			Cabin cabin) {
		switch (option) {
		case GALLEY:
			return (List<PhysicalObject>) (Object) cabin.getGalleys();
		case LAVATORY:
			return (List<PhysicalObject>) (Object) cabin.getLavatories();
		case SEAT:
			return (List<PhysicalObject>) (Object) ModelHelper
					.getChildrenByClass(cabin, Seat.class);
		case STOWAGE:
			return (List<PhysicalObject>) (Object) cabin.getStowages();
		case STAIRWAY:
			return (List<PhysicalObject>) (Object) cabin.getStairways();
		case CURTAIN:
			return (List<PhysicalObject>) (Object) cabin.getCurtains();
		default:
			return null;
		}
	}
}
