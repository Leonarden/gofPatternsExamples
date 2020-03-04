package com.training.abstractfactory;

public class USRobotAssembler implements RobotAssembler {

	public Chipset createChipSet(String s) {
	
		return new USChipset(s);
	}

	public Sex createSex(String s) {
		return new USSex(s);
	}

	public ThreeLaws programLaws() {
		
		return new USThreeLaws();
	}

	public Model assignModel(String m) {
		return new USModel(m);
	}


}
