/**
 * 
 */
package com.sellabs.practice;

import java.io.IOException;

import com.sellabs.oops.AbstractionConcept;
import com.sellabs.oops.AbstractionImpl;
import com.sellabs.oops.Child;
import com.sellabs.oops.EncapEx;
import com.sellabs.oops.IOOperation;
import com.sellabs.oops.ImplSampleInterfc;
import com.sellabs.oops.InterfcFunctional;
import com.sellabs.oops.Parent;
import com.sellabs.oops.SampleInterfc;
import com.sellabs.oops.SampleInterfcTwo;

/**
 * @author Sipun
 *
 */
 public class Exec  {
	
	 /** public Exec()
	{
		super(5);
	} 
	 * @throws IOException */
	
																							
 public static void main(String[] args) throws IOException
 {
	/** int a[] = {18,28,19,29};
	 for(int b : a)
	 {
	 System.out.println(b);
	*/
	 
	 //int arr[][] = {{2,4,5,7} , {9,1,0,8} , {7,4,1,2}};
	// System.out.println(arr[1][3] + arr[2][0]);
	 
	// SampleProg sp = new SampleProg();
	// sp.printMultValue(sp.getSumValue(8, 2), 7);
	 
	// String val1 = args[0];
	// int data1 = Integer.parseInt(val1);
	 
	// String val2 = args[1];
	// int data2 = Integer.parseInt(val2);
	 
	// System.out.println(data1 + data2);
	 
	// sp.getvalue(5);
	// sp.getvalue("vikram");
	 
	 //PracticeOne pone = new PracticeOne();
	 
	 //PracticeOne pone1 = new PracticeOne(2);
	 //Exec e = new Exec();
	 
	//PracticeOne.ops();
	 
	//Parent p = new Child();
	
	//p.opsThree();
	 
	// AbstractionConcept ac = new AbstractionImpl();
	// ac.add(1, 2);
	// ac.sub(4, 2);
	
	/** AbstractionConcept ac = new AbstractionConcept()
			 {
		 public void add(int a, int b) {
			 System.out.println(a+b);
		 }
			 };
			 ac.add(5,4);
			 ac.sub(7,4); */
	 
	// InterfcFunctional ifun = (a) -> System.out.println("value is :" +a);
	// ifun.opsOne("name");
 
	 /** EncapEx ex = new EncapEx();
	 System.out.println(ex.getValue());
	 ex.setValue(7);
	 System.out.println(ex.getValue());*/
	 
		/*
		 * IOOperation iop = new IOOperation(); iop.ops();
		 */
	 
	 BrowserHandle bh = new BrowserHandle(Browser.FIREFOX);

 }
 }
