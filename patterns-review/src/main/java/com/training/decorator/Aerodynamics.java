package com.training.decorator;

public  class Aerodynamics extends ExtrasDecorator {

	Vehicle vehicle;
	public Aerodynamics(Vehicle v) {
		vehicle = v;
	}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 100.1 + vehicle.getWeight();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4000.20 + vehicle.getCost();
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return vehicle.getLabel() + " Improved Aerodynamics";
	}

}
