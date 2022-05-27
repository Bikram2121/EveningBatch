/**
 * 
 */
package com.sellabs.practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Sipun
 *
 */
public class ExecCollection3 {
		
	public void ops()
	{
		Set<Integer> s = new TreeSet<Integer>(Collections.reverseOrder());
		s.add(11);
		s.add(5);
		s.add(3);
		s.add(8);
		s.add(14);
		s.add(3);
		
		/**for(int value : s)
		{
			*/
		
		/**Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
		int value = itr.next();
		System.out.println(value);
		} */
		
		s.forEach(a -> System.out.println(a));
	}
	
	
	public static void main(String[] args) {
		
		ExecCollection3 ec3 = new ExecCollection3();
		ec3.ops();
	}
}
