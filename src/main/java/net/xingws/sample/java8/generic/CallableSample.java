/**
 * 
 */
package net.xingws.sample.java8.generic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author benxing
 * @FunctionalInterface
 * public interface Callable<V> {
 * 		V call();
 * }
 */
public class CallableSample {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		System.out.println(executor.submit(() -> {
			return 7;
		}).get());

	}

}
