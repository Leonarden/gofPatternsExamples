package com.training.command;

public class CarStopCommand implements Command {

	CarEngine engine;
	public CarStopCommand(CarEngine engine) {
		this.engine = engine;
	}
	public void execute() {
		System.out.println("Stopping car from:" + engine.getSpeed() + " to 0  miles/H");

		engine.stop();
	}

	public double getSpeed() {
		return engine.getSpeed();
	}
}
