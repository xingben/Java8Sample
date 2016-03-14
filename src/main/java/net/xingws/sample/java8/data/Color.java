/**
 * 
 */
package net.xingws.sample.java8.data;

/**
 * @author benxing
 *
 */
public enum Color {
	RED(0),
	BLUE(1),
	GREEN(2);
	
	private final int value;
	
	Color(int i) {
		this.value = i;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
