/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author benxing
 * public interface Runnable<T> {
 * 		void run();
 * }
 */
public class RunnableSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		executor.submit(() ->  {
			int count = 2;	
			while(count > 0) {
				System.out.println(count);
				count--;
			}
		});
	}

}
