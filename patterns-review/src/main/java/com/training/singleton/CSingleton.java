package com.training.singleton;

public class CSingleton {
	
	private static CSingleton instance = null;
	
	private CSingleton() {}
	
	public static CSingleton getInstance() {
		
		if(instance==null) {
			synchronized(CSingleton.class) {
				if(instance==null)
					instance = new CSingleton();
			}
		}
		return instance;
	}

	public String doWork() {
		String mess = "DATA DATA DATA" + System.currentTimeMillis() % 3600;
		return mess;
	}
}
