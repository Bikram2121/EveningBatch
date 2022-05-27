 /**
 * 
 */
package com.sellabs.oops;

/**
 * @author Vikram
 *
 */
public class ThreadExample extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("selenium");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("testing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
