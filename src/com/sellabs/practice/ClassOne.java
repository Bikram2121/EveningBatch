/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Sipun
 *
 */
public class ClassOne {
	/**
	public void opsOne()
	{
		
		System.out.println("ops-one");
		//String object creation
		
		String b = new String("Test");
		String b1 = new String("Test");
		
		//String Constant pool
		
		String a = "Test";
		String a1 = "Test";
		
		String val1 = b.concat(b1);
		System.out.println(val1);
		String val = a.concat(a1);
		System.out.println(val);
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a1));
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
		System.out.println(val.hashCode());
		System.out.println(val1.hashCode());
		System.out.println(System.identityHashCode(val));
		
		
		
		String a ="Vikku";
		String b = "Vikram";
		
		String val = a.toLowerCase();
		String val1 = b.toUpperCase();
		System.out.println(val);
		System.out.println(val1);
		
		int len = a.length();
		int len1 = b.length();
		System.out.println(len);
		System.out.println(len1);
		
		System.out.println(a.substring(0, 3));
		System.out.println(b.substring(2, 5));
		
		System.out.println(a.startsWith("Vi"));
		System.out.println(b.endsWith("im"));
		
		
		String largeString = "SNL's parody of Friends is interrupted when Matthew Perry objects to Colin Quinn's gay portrayal of Chandler Bing. Aired 10/04/97";
		String bigString = largeString.toLowerCase(); 
		System.out.println(bigString.contains("matthew"));
		
		
	}
	public void opsTwo()
	{
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Amazon");
		for(int i = 0; i<10;i++)
		{
			System.out.println(sb.append("Flipkart"));
		}
		System.out.println("Time taken by StringBuffer is : " + (System.currentTimeMillis() - startTime) + "ms");
		
		long StartTime = System.currentTimeMillis();
		StringBuilder sbd = new StringBuilder("Flipkart");
		for(int i=0; i<10; i++)
		{
			System.out.println(sbd.append("Amazon"));
		}
		System.out.println("Time taken by StringBuilder is :" + (System.currentTimeMillis() - StartTime)+ "ms");
	} */
			
	 public int getSumation(int a ,int b)
	{
		return (a+b);
	}
	 
	 public void printStatus(String status)
	 {
		 System.out.println(status);
	 }
}
