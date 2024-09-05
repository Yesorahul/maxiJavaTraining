package com.abstraction.assign1;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Manager("rahul", 10000, 12345, "Coding");
		employee.calcBonus(1000);
		employee.showProjects();
		Manager manager = (Manager)employee;
		manager.funClub();
		
		Employee employee1 = new TeamLead("rahulY", 1000, 123456);
		employee1.calcBonus(10);
		TeamLead teamLead= (TeamLead)employee1;
		teamLead.showProjects();
		
		Employee employee2 = new Developer("yeso", 1000, 123567, "abc");
	}

}
