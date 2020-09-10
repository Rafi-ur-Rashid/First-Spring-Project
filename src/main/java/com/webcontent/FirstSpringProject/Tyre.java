package com.webcontent.FirstSpringProject;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tire brand is RFL";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}
	
}
