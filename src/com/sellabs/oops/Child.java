package com.sellabs.oops;

public class Child extends Parent {

	@Override
	public void opsThree()
	{
		super.opsThree();
		System.out.println("modified");
	}
	
	
	
	public void opsFive()
	{
		System.out.println("five");
	}

}
