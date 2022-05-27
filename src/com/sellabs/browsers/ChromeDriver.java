/**
 * 
 */
package com.sellabs.browsers;

import com.sellabs.oops.WebDriver;

/**
 * @author Sipun
 *
 */
public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("Chrome opens");
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
