package com.maxi.overload.assign1;

public class Employee {
	String name;
	String designation;

	void calcBonus(double basicAllowance) {
		System.out.println("basicAllowance : "+basicAllowance);
	}
	
	void calcBonus(double basicAllowance, String gift) {
		System.out.println("basicAllowance : "+basicAllowance);
		System.out.println("gift : "+gift);
	}
	
	void calcBonus(double basicAllowance,String gift, double houseAllowance) {
		System.out.println("basicAllowance : "+basicAllowance);
		System.out.println("gift : "+gift);
		System.out.println("houseAllowance : "+houseAllowance);
	}

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
}
