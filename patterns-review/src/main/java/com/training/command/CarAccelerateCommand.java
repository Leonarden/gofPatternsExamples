package com.training.command;

public class CarAccelerateCommand implements Command {
	CarEngine engine;
	public CarAccelerateCommand(CarEngine engine) {
		this.engine = engine;
	}
	public void execute() {
		System.out.println("Accelerating  at" + engine.accelerate() +" miles/H");

	}

	public double getSpeed() {
		return engine.getSpeed();
	}
}
