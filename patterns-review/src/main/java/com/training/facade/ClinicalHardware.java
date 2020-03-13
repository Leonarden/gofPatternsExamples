package com.training.facade;

import java.util.Random;

public class ClinicalHardware {

	String[] hardware = {"Scanner","Blood Testing Lab","X-Ray"};
	Boolean stop = false;
	
	public String applyHW() {
		
		int i =  (int)(Math.random() * 100 % 3);
		String s = "Using now : " + hardware[i] + "";
		return s;
	}
	public void start() {
		System.out.println("Clinical Hardware ready");
		stop = false;
	}
	public void work() throws Exception{
		System.out.println("Clinical Hardware in use:");
		int k = 0;
		while(!stop && k<10) {
			System.out.println(applyHW());
			k++;
		}
	}
	
	public void stop() {
		System.out.println("Stopping Clinical hardware");
		stop = true;
	}
}
