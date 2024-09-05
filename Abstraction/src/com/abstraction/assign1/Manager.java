package com.abstraction.assign1;

public class Manager extends Employee {
	private String activity;
	
	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcBonus(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Bonus : " +(salary+amount));
	}

	@Override
	void showProjects() {
		// TODO Auto-generated method stub
		System.out.println("WORKING IN CLOUD COMPUTING");
	}
	
	void funClub() {
		System.out.println("Activity : "+activity);
	}
	

}
