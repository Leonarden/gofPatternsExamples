package com.training.abstractfactory;

public class JPR2C2Male extends Robot {

	public JPR2C2Male(RobotAssembler assembler) {
		this.setModelType("R2C2");
		this.setSexType("M");
		
		this.assembler = assembler;
		
	}
}
