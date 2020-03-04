package com.training.singleton;

public class Concurrent implements Runnable{
	
	private CSingleton singleton;

	public void run() {
		try {
		for(int i=0;i<1000;i++) {
			Thread.sleep(300);
			singleton = CSingleton.getInstance();
			Thread.sleep(100);
			System.out.println("Work: " +singleton.doWork());
			
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

}
