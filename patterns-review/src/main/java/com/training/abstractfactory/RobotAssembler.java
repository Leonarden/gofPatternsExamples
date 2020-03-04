package com.training.abstractfactory;

public interface RobotAssembler {
	
	public Chipset createChipSet(String s);
	public Sex createSex(String s);
	public ThreeLaws programLaws();
	public Model assignModel(String m);

}
