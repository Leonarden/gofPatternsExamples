package com.training.abstractfactory;

public class USC3POFemale extends Robot {

	public USC3POFemale(RobotAssembler assembler) {
		this.setModelType("C3PO");
		this.setSexType("F");
		
		this.assembler = assembler;
		
	}
	
}
