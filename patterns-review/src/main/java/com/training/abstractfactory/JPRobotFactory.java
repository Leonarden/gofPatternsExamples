package com.training.abstractfactory;

public class JPRobotFactory extends RobotFactory {

	@Override
	public Robot createRobot(String model, String sex) {
		Robot robot = null;
		RobotAssembler assembler = new JPRobotAssembler();
		if(model.equals("C3PO") && sex.equals("M")) {
			robot = new JPC3POMale(assembler);
		}
		if(model.equals("C3PO") && sex.equals("F")) {
			robot = new JPC3POFemale(assembler);
		}
		if(model.equals("R2C2") && sex.equals("M")) {
			robot = new JPR2C2Male(assembler);
		}
			
			return robot;
	}

}
