/**
 * 
 */
package com.sellabs.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sipun
 *
 */
public class ExecCollections {

	public void ops()
	{
		List c = new ArrayList();
		c.add("Hi");
		c.add('D');
		c.add(true);
		c.add(4);
		
		c.add(2, "Hello");
		for (Object val : c)
		{
			System.out.println(val);
		}
		System.out.println("================================================");

		c.remove(4);
		for (Object val : c)
		{
			System.out.println(val);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		ExecCollections ec = new ExecCollections();
		ec.ops();
	}
}
