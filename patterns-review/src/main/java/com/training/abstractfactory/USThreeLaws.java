package com.training.abstractfactory;

public class USThreeLaws implements ThreeLaws{

	String[] data;
	
	public String[] getData() {
		data = ThreeLaws.baseLaws;
		return data;
	}
	

}
