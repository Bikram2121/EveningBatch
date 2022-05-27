package com.sellabs.browsers;

import com.sellabs.oops.WebDriver;

/**
 * @author Sipun
 *
 */
public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Firefox opens");
	}
	
	@Override
	public void get(String url) {
		System.out.println("url launches");
	}

	@Override
	public String getTitle() {
		return "dummy title";
		
	}
	
	
}
