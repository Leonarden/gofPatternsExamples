package com.training.abstractfactory;

public class USSex implements Sex{
	String data;
	public USSex(String s) {
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
