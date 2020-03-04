package com.training.decorator;

public class Car extends Vehicle {

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 1500.5;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "5 seat car";
	}

}
