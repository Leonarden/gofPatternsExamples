package com.training.decorator;

public  class SuperTurbo extends ExtrasDecorator {

	Vehicle vehicle;
	
	public SuperTurbo(Vehicle v) {
		vehicle = v;
	}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 10.1 + vehicle.getWeight();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 2000.10 + vehicle.getCost();
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return vehicle.getLabel() + " SuperTurbo";
	}

}
