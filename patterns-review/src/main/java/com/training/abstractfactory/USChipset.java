package com.training.abstractfactory;

public class USChipset implements Chipset {

	String data;
	
	public USChipset(String s) {
	
		if("F".equals(s))
			data = "US-CS-F-KERNEL-00011";
		else
			data = "US-CS-M-KERNEL-00001";
	}
	public String getData() {
		// TODO Auto-generated method stub
		return data;
	}

}
