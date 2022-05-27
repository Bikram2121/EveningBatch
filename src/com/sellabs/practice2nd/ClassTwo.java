/**
 * 
 */
package com.sellabs.practice2nd;

import com.sellabs.practice.ClassOne;

/**
 * @author Vikram
 *		
 */
public class ClassTwo extends ClassOne{
	
	
	@Override
	public int getSumation(int a , int b)
	{
		if((a>0) && (b>0))
		{
	     return super.getSumation(a, b);
		}
		else 
		{
			System.out.println("Negative number");
			return 0;
		}
	}
	

	
public static void main(String[] args) {
	ClassOne cone = new ClassOne();
	//cone.opsOne();
	
	/**StringBuffer sbuffer = new StringBuffer("mada");
	sbuffer.append(29);
	System.out.println(sbuffer); */
	
	/** String a = "madam";
	StringBuffer sb = new StringBuffer("madams");
	String revstrn = sb.reverse().toString();
	if(revstrn.equals(a))
	{
		System.out.println("Palindrome");
	}
	else {
		 System.out.println("Not palindrome");
	}
	
	
	//cone.opsTwo(); */
	
	// String firstname = args[0];
	// String lastname = args[1];
	 
	// System.out.println(firstname.concat(" " + lastname));
	
	
	
	System.out.println(cone.getSumation(-2, 4));
	
	
}
}
