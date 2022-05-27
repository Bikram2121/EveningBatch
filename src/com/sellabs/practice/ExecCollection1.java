/**
 * 
 */
package com.sellabs.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sipun
 *
 */
public class ExecCollection1 {

	public void ops(){
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(6);
		l.add(3);
		l.add(9);
		l.add(3);
		l.add(78);
		
		Collections.sort(l);
		l.forEach(a -> System.out.println(a));
		Collections.sort(l , Collections.reverseOrder());
		
		/**for(int i=0 ; i<l.size();i++)  // first way and for each loop second way
		{
			System.out.println(l.get(i));
		} */
		
		/** Iterator<Integer> itr = l.iterator(); // third way
	while (itr.hasNext()) 
	{
		int val = itr.next();
		System.out.println(val); */
		
		 l.forEach(a -> System.out.println(a));  // fourth way 
		
		
		
	}
	
	
	public static void main(String[] args) {
		ExecCollection1 ec1= new ExecCollection1();
		ec1.ops();
		
	}
	
}
