package com.training.abstractfactory;

import java.time.Instant;
import java.util.Date;

public class USModel implements Model {

	String data;
	
	public USModel(String modeltag) {
		if("C3PO".equals(modeltag))
			data = "US-C3PO-BUILD:" + Date.from(Instant.now());
		else
			data = "US-R2C2-BUILD:" + Date.from(Instant.now());
	}
	
	public String getData() {
	
		return data;
	}

	public void setData(String d) {
		data = d;
	}
	
}
