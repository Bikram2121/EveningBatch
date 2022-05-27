/**
 * 
 */
package com.sellabs.oops;

/**
 * @author Vikram
 *
 */
public class MultiExec1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		m1.start();
		
		Multi2 m2 = new Multi2();
		m2.start();
	}

}
