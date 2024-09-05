package com.maxi.assign5;

public class Mobile {
	String model;
	String brand;
	String color;
	
	public Mobile(String model, String brand, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
	}
	
	void getDetails() {
		System.out.println("Model : "+model);
		System.out.println("brand : "+brand);
		System.out.println("color : "+color);
	}
}
