package com.training.abstractfactory;

public class USRobotFactory extends RobotFactory {

	@Override
	public Robot createRobot(String model, String sex) {
		Robot robot = null;
		RobotAssembler assembler = new USRobotAssembler();
		if(model.equals("C3PO") && sex.equals("M")) {
			robot = new USC3POMale(assembler);
		}
		if(model.equals("C3PO") && sex.equals("F")) {
			robot = new USC3POFemale(assembler);
		}
			
		return robot;
	}

}
