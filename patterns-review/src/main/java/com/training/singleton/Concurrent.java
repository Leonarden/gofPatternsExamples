package com.training.singleton;

public class Concurrent implements Runnable{
	
	private CSingleton singleton;

	public void run() {
		try {
		for(int i=0;i<100;i++) {
			Thread.sleep(200);
			singleton = CSingleton.getInstance();
			Thread.sleep(50);
			System.out.println("From thread:" + this.toString() + "singleton:" + singleton.toString());
			System.out.println("Work: " +singleton.doWork());
			
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

}
