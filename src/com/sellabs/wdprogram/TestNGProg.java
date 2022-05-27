/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

/**
 * @author Vikram
 *
 */
public class TestNGProg {

	@Test(priority = 1, testName = "TC_cool", description = "This is a cool test")
	public void B() {
		System.out.println("B");
	}

	@Test(priority = 4)
	public void D() {
		System.out.println(10 / 0);
	}

	@Test(priority = 2)
	public void A() {
		System.out.println("A");
	}

	@Test(priority = 3, dependsOnMethods = { "D" }, alwaysRun = true)
	public void C() {
		System.out.println("C");
	}
}
