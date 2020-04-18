package com.training.adapter;

public class InternationalFacilityAdapter implements InternationalFacility {

	NationalFacility facility; //this is the adaptee
	
	public InternationalFacilityAdapter(NationalFacility f) {
		facility = f;
	}
	
	
	public void sell() {
	
		facility.sellWithCurrency();

	}

	public void buy() {
		
		facility.buyWithCurrency();

	}

}
