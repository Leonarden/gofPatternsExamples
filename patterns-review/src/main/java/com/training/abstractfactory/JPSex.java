package com.training.abstractfactory;

public class JPSex implements Sex{
	String data;
	public JPSex(String s) {
		if("F".equalsIgnoreCase(s))
			data = "FEMALE";
		else
			data = "MALE";
	}
	public String getData() {
		return data;
		
	}
	public void setData(String d) {
		data = d;
		
	}

}
