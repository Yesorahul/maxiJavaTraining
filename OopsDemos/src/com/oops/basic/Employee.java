package com.oops.basic;

public class Employee {

	String name ;
	double salary;
	void getDetails() {
		System.out.println("Name : "+name);
		System.out.println("salary : "+salary);
	}
	String greet(String message) {
		return message+" "+name;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}
