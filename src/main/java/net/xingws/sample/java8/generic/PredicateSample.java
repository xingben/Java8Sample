/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import net.xingws.sample.java8.data.Apple;
import net.xingws.sample.java8.data.Color;

/**
 * @author benxing
 * @FunctionalInterface
 * public interface Predicate<T> {
 * 		boolean test(T t);
 * }
 */
public class PredicateSample {

	static <T> List<T> filter(List<T> inventory, Predicate<T> predicate) {
		List<T> res = new ArrayList<T>();
		
		for(T item : inventory) {
			if(predicate.test(item)) {
				res.add(item);
			}
		}
		
		return res;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		///Passing by code
		List<Apple> apples = Arrays.asList(new Apple(Color.RED, 27.5), new Apple(Color.BLUE, 31.2), new Apple(Color.GREEN, 57.5));
		List<Apple> res = filter(apples, (apple) -> apple.getColor()==Color.RED || apple.getWeight()>50.0);
		res.stream().forEach((Apple apple) -> System.out.println(apple.toString()));
		
		//lambda for filter
		apples.stream().filter((Apple apple) -> apple.getColor()==Color.RED || apple.getWeight()>50.0).forEach((Apple apple) -> System.out.println(apple.toString()));
	}
}
