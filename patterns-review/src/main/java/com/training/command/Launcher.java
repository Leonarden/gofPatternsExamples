package com.training.command;

public class Launcher {
	/**Example of the Command Pattern 
	 * 
	 * @param args
	 */
	public static void main(String[]args) {
		
		CarRaceControl carRaceControl = new CarRaceControl(2);
		
		long start = System.currentTimeMillis();
		
		carRaceControl.race(10000);
		
		
		
		long end = System.currentTimeMillis()-start;
		
		System.out.println("Executed in "+ end/1000 +" s" );
		
		
		
	}

}
