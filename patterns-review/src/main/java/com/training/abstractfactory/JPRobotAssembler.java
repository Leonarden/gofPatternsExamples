package com.training.abstractfactory;

public class JPRobotAssembler implements RobotAssembler {

	public Chipset createChipSet(String s) {
		return  new JPChipset(s);
	}

	public Sex createSex(String s) {
		return new JPSex(s);
	}

	public ThreeLaws programLaws() {
		
		return new JPThreeLaws();
	}

	public Model assignModel(String m) {
		return new JPModel(m);
	}

	

}
