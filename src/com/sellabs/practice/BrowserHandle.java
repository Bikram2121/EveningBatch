/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Sipun
 *
 */
public class BrowserHandle {
	
	public BrowserHandle(Browser browser) {
		switch (browser) {
		case CHROME:
			System.out.println("Chrome launches");
			break;
		case FIREFOX:
			System.out.println("Firefox launches");
			break; 
		case EDGE:
			System.out.println("Edge launches");

		default:
			System.out.println("=============");
			break;	
	}
	
	}
}
