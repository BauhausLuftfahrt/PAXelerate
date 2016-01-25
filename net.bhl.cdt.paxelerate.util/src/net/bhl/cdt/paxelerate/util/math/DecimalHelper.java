package net.bhl.cdt.paxelerate.util.math;
 
import java.math.BigDecimal;
 
/**
 * This utility class rounds a decimal number.
 * @author www.codejava.net
 *
 */
public class DecimalHelper {
	
	protected DecimalHelper () {
		
	}
 
    public static double round(double value, int numberOfDigitsAfterDecimalPoint) {
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint,
                BigDecimal.ROUND_HALF_UP);
        return bigDecimal.doubleValue();
    }
}