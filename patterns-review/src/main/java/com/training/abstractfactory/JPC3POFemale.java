package com.training.abstractfactory;

public class JPC3POFemale extends Robot {

	public JPC3POFemale(RobotAssembler assembler) {
		this.setModelType("C3PO");
		this.setSexType("F");
		
		this.assembler = assembler;
		}


}
