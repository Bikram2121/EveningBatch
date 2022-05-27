/**
 * 
 */
package com.sellabs.oops;

/**
 * @author Sipun
 *
 */
public class EncapEx {
	private int value = 10;
/**	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		if (value>0) {
			this.value = value;
		}
		else {
			System.out.println("value should be positive");
		}
	} */

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
}
