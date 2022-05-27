/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Sipun
 *
 */
public class EnumExecution {

	
	public static void main(String[] args) {
		
		
		  Cars [] val = Cars.values();
		 	for(Cars carName : val)
		 	{
		  System.out.println(carName.getColor());
		  }
		 
		/*
		 * String color = Cars.RANGEROVER.getColor();
		 *  System.out.println(color);
		 */
	
		
	
	}

}
