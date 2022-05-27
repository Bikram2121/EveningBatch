package com.sellabs.practice;

import com.sellabs.exception.InvalidData;

public class ExcepExec5 {
	public void ops(int a) throws InvalidData 
	{
		if(a>0)
		{
			System.out.println("value of a : " +a);
			}
		else 
		{
			//throw new NullPointerException("Value 0 or negative");
			throw new InvalidData("Data is invalid");
		}
	}
	
	
	public static void main(String[] args) {
		ExcepExec5 ee5 = new ExcepExec5();
		try {
			ee5.ops(0);
		} catch (InvalidData id) {
			// TODO Auto-generated catch block
			id.printStackTrace(); 
		}
		
	}

}
