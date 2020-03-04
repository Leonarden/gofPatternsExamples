package com.training.abstractfactory;

public class JPThreeLaws implements ThreeLaws{

	String[] data;
	
	public String[] getData() {
		data = ThreeLaws.baseLaws;
		return data;
	}
	

}
