package com.training.abstractfactory;

public class USC3POMale extends Robot {

	public USC3POMale(RobotAssembler assembler) {
		this.setModelType("C3PO");
		this.setSexType("M");
		
		this.assembler = assembler;
		
	}
}
