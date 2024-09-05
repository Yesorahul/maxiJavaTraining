package com.maxi.overload.assign1;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee("Rahul","Traniee");
		Employee employee1 = new Employee("RahulY","Software Engineer");
		Employee employee2 = new Employee("RahulYe","Senior");
		Employee employee3 = new Employee("RahulYESO","TeamLead");
		
		Employee[] employeeArray = {employee,employee1,employee2,employee3};
		for (Employee employee4 : employeeArray) {
			switch(employee4.designation.toUpperCase()) {
			case "TRANIEE" :
				System.out.println("destination : "+employee4.designation);
				employee4.calcBonus(100.00);
				System.out.println();
				break;
			case "SOFTWARE ENGINEER" :
				System.out.println("destination : "+employee4.designation);
				employee.calcBonus(125, "car");
				System.out.println();
				break;
			case "SENIOR" :
				System.out.println("destination : "+employee4.designation);
				employee4.calcBonus(125, "car",1000);
				break;
			}
		}
	}
}
