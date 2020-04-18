package com.training.adapter;

public class USFacility extends NationalFacility {

	//Concrete implementation of adaptee class
	
	public USFacility(String currency) {
		super(currency);
		
		
	}

	@Override
	public void sellWithCurrency() {
	

		System.out.println(" We are selling our goods in  " + currency);
	}

	@Override
	public void buyWithCurrency() {
		System.out.println(" We are buying goods in " + currency);

	}

}
