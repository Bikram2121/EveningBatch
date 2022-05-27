package com.sellabs.practice;

public class ExepExec1 {
	public void ops(int a)
	{
		try {
			System.out.println(10/a);
		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
			System.out.println("Arithmetic issue occured : " + ae.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		ExepExec1 ee1 = new ExepExec1();
		ee1.ops(0);
	}

}
