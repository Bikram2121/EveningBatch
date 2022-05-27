/**
 * 
 */
package com.sellabs.oops;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sipun
 *
 */
public class IOOperation {
	public void ops() throws IOException {
		/** Scanner scan = new Scanner(System.in);
		System.out.print("Enter your mobile number : ");
			String mobileNumber =  scan.nextLine();
			long mobNum = Long.parseLong(mobileNumber);
			System.out.println("Entered your number : " +mobNum);
			scan.close(); */
		
		
		
		String loc = System.getProperty("user.dir");
		// System.out.println(loc);
		File f = new File(loc + "\\Sample.txt");
		if(f.exists())
			{
			System.out.println("File already exists");
			System.out.println("Deleting the File : " +f.delete());
			}
		else {
			System.out.println("File doesn't exist.....creating one");
			System.out.println("File created : " + f.createNewFile());
		}
		
		
	}

}
