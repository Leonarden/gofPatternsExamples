package com.training.adapter;

public class InternationalFacilityAdapter implements InternationalFacility {

	NationalFacility facility;
	
	public InternationalFacilityAdapter(NationalFacility f) {
		facility = f;
	}
	
	
	public void shell() {
	
		facility.shellWithCurrency();

	}

	public void buy() {
		
		facility.buyWithCurrency();

	}

}
