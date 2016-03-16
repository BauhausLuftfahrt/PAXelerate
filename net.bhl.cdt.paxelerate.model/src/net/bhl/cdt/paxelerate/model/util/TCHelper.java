package net.bhl.cdt.paxelerate.model.util;

import java.util.List;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.BusinessClass;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.EconomyClass;
import net.bhl.cdt.paxelerate.model.FirstClass;
import net.bhl.cdt.paxelerate.model.PremiumEconomyClass;
import net.bhl.cdt.paxelerate.model.TravelClass;

/**
 * 
 * @author marc.engelmann
 *
 */

// TODO: Implement these functions directly into Cabin.java ? // CabinImpl.java?

public class TCHelper {

	/**
	 * 
	 * @author marc.engelmann
	 *
	 */
	public enum TC {
		FC, BC, EC, PEC;
	}

	/**
	 * 
	 * @param cabin
	 * @return
	 */
	public static List<FirstClass> getFirstClasses(Cabin cabin) {
		return ModelHelper.getChildrenByClass(cabin, FirstClass.class);
	}

	/**
	 * 
	 * @param cabin
	 * @return
	 */
	public static List<BusinessClass> getBusinessClasses(Cabin cabin) {
		return ModelHelper.getChildrenByClass(cabin, BusinessClass.class);
	}

	/**
	 * 
	 * @param cabin
	 * @return
	 */
	public static List<EconomyClass> getEconomyClasses(Cabin cabin) {
		return ModelHelper.getChildrenByClass(cabin, EconomyClass.class);
	}

	/**
	 * 
	 * @param cabin
	 * @return
	 */
	public static List<PremiumEconomyClass> getPremiumEconomyClasses(
			Cabin cabin) {
		return ModelHelper.getChildrenByClass(cabin, PremiumEconomyClass.class);
	}

	/**
	 * 
	 * @param travelclass
	 * @return
	 */
	public static <T extends TravelClass> TC getClassType(
			Class<T> travelclass) {

		switch (travelclass.getSimpleName()) {

		case "FirstClass":
			return TC.FC;
		case "BusinessClass":
			return TC.BC;
		case "EconomyClass":
			return TC.EC;
		case "PremiumEconomyClass":
			return TC.PEC;
		default:
			return null;
		}
	}
}
