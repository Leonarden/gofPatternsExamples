package com.training.abstractfactory;

public class JPC3POMale extends Robot {

	public JPC3POMale(RobotAssembler assembler) {
		this.setModelType("C3PO");
		this.setSexType("M");
		
		this.assembler = assembler;
		
	}
}
