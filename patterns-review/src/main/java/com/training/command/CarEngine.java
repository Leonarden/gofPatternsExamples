package com.training.command;

public class CarEngine {
	double speed;
	public double accelerate() {
		speed = speed + 10;
		return speed;
	}
	public double decelerate() {
		if(speed==0)
			System.out.println("Vehicle is stopped");
		if(speed>10)
			speed = speed -10;
		return speed;
	}
	
	public void stop() {
		speed = 0;
	}
	

	public double getSpeed() {
		return speed;
	}
	
}
