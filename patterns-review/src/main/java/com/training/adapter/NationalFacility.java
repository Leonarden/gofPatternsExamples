package com.training.adapter;

public abstract class NationalFacility {
	
	String currency;
	
	public NationalFacility(String currency) {
		this.currency = currency;
	}

	public abstract void sellWithCurrency();
	
	public abstract void buyWithCurrency();
}
