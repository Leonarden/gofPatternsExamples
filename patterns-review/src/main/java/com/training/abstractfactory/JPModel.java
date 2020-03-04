package com.training.abstractfactory;

import java.time.Instant;
import java.util.Date;

public class JPModel implements Model {

	String data;
	
	public JPModel(String modeltag) {
		if("C3PO".equals(modeltag))
			data = "JP-C3PO-BUILD:" + Date.from(Instant.now());
		else
			data = "JP-R2C2-BUILD:" + Date.from(Instant.now());
	}
	
	public String getData() {
	
		return data;
	}

	public void setData(String d) {
		data = d;
	}
}
