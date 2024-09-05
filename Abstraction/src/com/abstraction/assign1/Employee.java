package com.abstraction.assign1;

public abstract class Employee {
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME= "MAXIMUS";
	
	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}
	
	abstract void calcBonus(double amount);
	String[] showCourses() {
		return new String[] {"java","C","SAP","PYHTHON"};
		
	}
	
	abstract void showProjects();
	final void showRules() {
		officeHours();
		System.out.println("Optional Leaves");
	}
	
	private void officeHours() {
		System.out.println("10hrs per day");
	}
}
