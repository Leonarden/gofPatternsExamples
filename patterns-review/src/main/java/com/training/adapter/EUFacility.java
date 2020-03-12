package com.training.adapter;

public class EUFacility extends NationalFacility {

	public EUFacility(String currency) {
		super(currency);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shellWithCurrency() {
		// TODO Auto-generated method stub

		System.out.println(" Wir verkaufen unsere Waren in  " + currency);
	}

	@Override
	public void buyWithCurrency() {
		System.out.println(" Wir kaufen Waren in  " + currency);

	}

}
