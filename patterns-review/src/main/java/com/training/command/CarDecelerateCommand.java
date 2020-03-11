package com.training.command;

public class CarDecelerateCommand implements Command {

	CarEngine engine;
	public CarDecelerateCommand(CarEngine engine) {
		this.engine = engine;
	}
	public void execute() {
		System.out.println("Decelerating  at" + engine.decelerate() +" miles/H");

	}

	public double getSpeed() {
		return engine.getSpeed();
	}
}
