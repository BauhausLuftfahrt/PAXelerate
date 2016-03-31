package net.bhl.cdt.paxelerate.model.util;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;

/**
 * 
 * @author marc.engelmann
 *
 */

public class TCHelper {

	/**
	 * 
	 * @param option
	 * @param cabin
	 * @return
	 */
	public static List<TravelClass> getClassesByOption(TravelOption option,
			Cabin cabin) {

		List<TravelClass> list = new ArrayList<TravelClass>();

		for (TravelClass travelclass : cabin.getClasses()) {
			if (travelclass.getClassType() == option) {
				list.add(travelclass);
			}
		}

		return list;
	}
}
