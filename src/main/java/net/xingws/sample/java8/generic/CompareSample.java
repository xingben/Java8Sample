/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.Arrays;
import java.util.List;

import net.xingws.sample.java8.data.Apple;
import net.xingws.sample.java8.data.Color;

/**
 * @author benxing
 *
 */
public class CompareSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple(Color.BLUE, 31.2), new Apple(Color.RED, 31.1), new Apple(Color.GREEN, 57.5));
		
		apples.sort(( a1,  a2) -> (int)(a1.getWeight() - a2.getWeight()));
		apples.stream().forEach(Apple::toString);
	}

}
