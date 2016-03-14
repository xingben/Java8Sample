/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author benxing
 * @FunctionalInterface
 * public interface Consumer<T> {
 * 		void accept(T t);
 * }
 */
public class ConsumeSample {

	static public <T> void consumerExample(List<T> list, Consumer<T> c) {
		for(T t : list) {
			c.accept(t);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "bcd", null);
		
		consumerExample(list,  s -> {if(s != null) System.out.println(s.length());});
	}

}
