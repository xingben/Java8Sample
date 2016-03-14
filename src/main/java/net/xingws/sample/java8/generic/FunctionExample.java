/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author benxing
 * @FunctionalInterface
 * public interface Function<T, R> {
 * 		R apply(T t);
 * }
 */
public class FunctionExample {

	public static <T, R> List<R> FunctionSample(List<T> list, Function<T,R> f) {
		List<R> res = new ArrayList<R>();
		
		for(T t: list) {
			res.add(f.apply(t));
		}
		
		return res;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "bcd", "kkk444");
		
		FunctionSample(list, t -> {return t.length();}).stream().forEach(t -> System.out.println(t));
	}
}
