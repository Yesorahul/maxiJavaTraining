package com.abstraction.assign1;

public class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Bonus : "+(amount*2));
	}

	
	void showProjects() {
		System.out.println("Sports actives in team lead");
	}

}
