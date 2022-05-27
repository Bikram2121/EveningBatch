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
public class ExecCollection2 {

	public List<Integer> generateData()
	{
		List<Integer> l = new ArrayList<Integer>();
			for(int i =0 ; i<10 ; i++)
			{
				l.add(i);
			}
			return l ;
	}
	
	public void ops()
	{
	List<Integer> value = generateData();
	/** value.forEach(a->System.out.println(a)); */  // first way
	/**for(int data : value)						//second way
	{
		System.out.println(data);
	} */
	
		for(int i =0 ; i< value.size(); i++)
		{
			System.out.println(value.get(i));
		}
	}
	public static void main(String[] args) {
		
		ExecCollection2 ec2 = new ExecCollection2();
		ec2.ops();  
	}
}
