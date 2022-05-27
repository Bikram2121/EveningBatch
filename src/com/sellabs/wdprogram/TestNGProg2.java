/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Vikram
 *
 */
public class TestNGProg2 {

	@Test(priority = 1)
	public void B() {
		Reporter.log("10", true);
	}

	@Test(priority = 4)
	public void D() {
		System.out.println("D");
	}

	@Test(priority = 2)
	public void A() {
		System.out.println("A");
	}

	@Test(priority = 3)
	public void C() {
		System.out.println("C");
	}

	@BeforeMethod
	public void precond() {
		System.out.println("before method");
	}
	@AfterMethod
	public void cond()
	{
		System.out.println("after metnod");
	}
}
