package com.training.decorator;

public abstract class Vehicle {
	
	private double weight;
	private double cost;
	private String label;
	
	public abstract double getWeight();

	public abstract double getCost();
	
	public abstract String getLabel();
	
}
