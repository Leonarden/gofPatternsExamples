package com.training.abstractfactory;

public abstract class RobotFactory {
	
	public Robot orderRobot(String model, String sex) {
		
		Robot r = createRobot(model, sex);
		
		r.assemble();
		
		if(!r.testChipset())
			System.out.println("Robot has wrong chipset, creation failed");
		else {
			System.out.println("Robot Chipset Installed");
		if(!r.testThreeLaws()) {
			System.out.println("Robot does not verifies the three laws of Asimov, creation aborted");
		}
		else {
		
		r.prepareForDelivery();
		
		return r;
		
		}
		
		}
		return null;
	}

	public abstract Robot createRobot(String model, String sex);
}
