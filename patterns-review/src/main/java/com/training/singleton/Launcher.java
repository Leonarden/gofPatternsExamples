package com.training.singleton;

public class Launcher {
	
	/**
	 * Launching 2 instances of runnable Concurrent class. Those instances will instance CSingleton inside method run
	 * @param args
	 */
	
	public  static void  main(String args[]) {
		
		Runnable run1 = new Concurrent();
		Runnable run2 = new Concurrent();
		
		
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		
		t1.start();
		t2.start();
		
		
		
		
		
		
		
	}

}
