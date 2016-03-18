package net.bhl.cdt.paxelerate.model.util;

import java.util.List;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.BusinessClass;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.EconomyClass;
import net.bhl.cdt.paxelerate.model.FirstClass;
import net.bhl.cdt.paxelerate.model.PremiumEconomyClass;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;

/**
 * 
 * @author marc.engelmann
 *
 */

// TODO: Implement these functions directly into Cabin.java ? // CabinImpl.java?

public class TCHelper {

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
	 * @param option
	 * @param cabin
	 * @return
	 */

	// TODO: make this better!
	@SuppressWarnings("unchecked")
	public static List<TravelClass> getClassesByOption(TravelOption option,
			Cabin cabin) {
		switch (option) {
		case FIRST_CLASS:
			return (List<TravelClass>) (Object) ModelHelper
					.getChildrenByClass(cabin, FirstClass.class);
		case BUSINESS_CLASS:
			return (List<TravelClass>) (Object) ModelHelper
					.getChildrenByClass(cabin, BusinessClass.class);
		case PREMIUM_ECONOMY_CLASS:
			return (List<TravelClass>) (Object) ModelHelper
					.getChildrenByClass(cabin, PremiumEconomyClass.class);
		case ECONOMY_CLASS:
			return (List<TravelClass>) (Object) ModelHelper
					.getChildrenByClass(cabin, EconomyClass.class);
		default:
			return null;
		}
	}
}
