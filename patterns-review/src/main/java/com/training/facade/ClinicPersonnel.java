package com.training.facade;

import java.util.Random;

public class ClinicPersonnel {
	String[] medecine = {"Antibiotics","Vaccines","Anxiety drugs"};
	boolean closed = false;
	
	public String care() {
	
		int i = (int)(Math.random() * 100 % 3);;
		String s = "Caring patients " + medecine[i];
		return s;
		
	}

	public void open() {
		closed = false;
		System.out.println("Personnel ready");
	}
	
	public void close() {
		closed  = true;
		System.out.println("Personnel stopped");
	}



	public void startCaring() throws Exception{
		int k = 0;
		while(!closed && k<10) {
			Thread.sleep(100);
			System.out.println("Doctors and nurses "+ care());
			k++;
		}
	}
}
