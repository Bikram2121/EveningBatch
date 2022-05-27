package com.sellabs.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExcepExec2 {
	
	public void ops(int a)
	{
		try {
			System.out.println(10/a);
		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
			System.out.println("Arithmetic issue occured");
			ae.printStackTrace(generateLog("System.log"));
		}
	}
	
	public PrintStream generateLog(String fileName)
	{
		PrintStream ps = null;
		try {
			ps = new PrintStream(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return ps;
	}
	
	public static void main(String[] args) {
		ExcepExec2 ee2 = new ExcepExec2();
		ee2.ops(0);

	}

}
