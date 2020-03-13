package com.training.facade;

import java.util.Random;

public class Bar {
	String[] beveranges = {"Cocktails","Spirits","Wines"};
	boolean closed = false;
	
	public String serve() {
		Random rnd = new Random(100);
		int i = Math.abs(rnd.nextInt()%3);
		String s = "Serving " + beveranges[i];
		return s;
		
	}

	public void open() {
		closed = false;
		System.out.println("Bar is open");
	}
	
	public void close() {
		closed  = true;
		System.out.println("Bar is closed");
	}



	public void runBar() throws Exception{
		int k = 0;
		while(!closed && k<10) {
			Thread.sleep(100);
			System.out.println("Disco Bar "+ serve());
			k++;
		}
	}
}
