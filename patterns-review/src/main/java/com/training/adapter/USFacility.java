package com.training.adapter;

public class USFacility extends NationalFacility {

	public USFacility(String currency) {
		super(currency);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shellWithCurrency() {
		// TODO Auto-generated method stub

		System.out.println(" We are selling our goods in  " + currency);
	}

	@Override
	public void buyWithCurrency() {
		System.out.println(" We are buying goods in " + currency);

	}

}
