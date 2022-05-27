/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Sipun
 *
 */
public enum Cars {
	
	BMW("Blue"), AUDI("White") , PORCHE("Orange") , RANGEROVER("Black");
	
	private String color;
	
	private Cars(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
}
