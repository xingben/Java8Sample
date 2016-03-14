/**
 * 
 */
package net.xingws.sample.java8.data;

/**
 * @author benxing
 *
 */
public class Apple {
	private final Color color;
	private final double weight;
	
	
	public Apple(Color color, double weight) {
		this.color = color;
		this.weight = weight;
	}


	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		System.out.println(String.format("color = %s  weight = %f", this.color, this.weight));
		return String.format("color = %s  weight = %f", this.color, this.weight);
	}
}
