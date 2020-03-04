package com.training.abstractfactory;

public class JPChipset implements Chipset {

	String data;
	
	public JPChipset(String s) {
	
		if("F".equals(s))
			data = "JP-CS-F-KERNEL-01111";
		else
			data = "JP-CS-M-KERNEL-00100";
	}
	public String getData() {
		
		return data;
	}

}
