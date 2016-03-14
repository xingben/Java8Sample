/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author benxing
 *
 */
public class SupplySample {

	public static <T> List<T> createSupply(int count, Supplier<T> supply) {
		List<T> res = new ArrayList<T>();
		for(int i=0; i<count; ++i) {
			res.add(supply.get());
		}
		
		return res;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
