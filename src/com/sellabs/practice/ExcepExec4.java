package com.sellabs.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExcepExec4 {

	public void ops(int a)
	{
		try {
			System.out.println(10/a);
		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
			System.out.println("Arithmetic issue occured");
				try {
					ae.printStackTrace(generateLog("System.log"));
				} catch (FileNotFoundException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
	
	
	public PrintStream generateLog(String fileName) throws FileNotFoundException,SecurityException
	{
		PrintStream ps = null;
		ps = new PrintStream(new File(fileName));
		return ps;
		}
		
	
	public static void main(String[] args) {
		ExcepExec4 ee4 = new ExcepExec4();
		ee4.ops(0);
	}

}
