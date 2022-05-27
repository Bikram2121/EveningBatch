package com.sellabs.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExcepExec3 {
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
			} catch (FileNotFoundException fe) {
				// TODO Auto-generated catch block
				fe.printStackTrace();
			}
			catch (SecurityException se) {
				System.out.println(se.getMessage());
			}	catch (Exception e) {
				System.out.println(e.getMessage());
			} 
				return ps;
			}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcepExec3 ee3 = new ExcepExec3();
		ee3.ops(0);
	}

}

