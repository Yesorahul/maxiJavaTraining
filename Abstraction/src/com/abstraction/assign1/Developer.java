package com.abstraction.assign1;

public class Developer extends TeamLead{
	String[] hobbies;
	
	public Developer(String empName, double salary, int empId, String...hobbies) {
		super(empName, salary, empId);
		this.hobbies = hobbies;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void showProjects() {
		System.out.println("Working in SpringBoot");
	}
	
	void showHobbies() {
		for (String hobby : hobbies) {
			System.out.println("Hobby : "+hobby);
		}
	}
}
