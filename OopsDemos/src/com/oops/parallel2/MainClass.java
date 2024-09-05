package com.oops.parallel2;

public class MainClass {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.getMileage();
			
		Vehicle vehicle1 = new Bike();
		vehicle1.getMileage();
	
		Bike bike = (Bike)vehicle1;
		bike.showAccesories();
	}

}
