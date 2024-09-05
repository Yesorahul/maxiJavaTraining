package com.oops.basic;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Rahul", 100);
		String result = employee.greet("Hello");
		employee.getDetails();
		System.out.println(result);

		Employee employee1 = new Employee("Yeso", 1000);
		String result1 = employee1.greet("Hello");
		employee1.getDetails();
		System.out.println(result1);
	}
}
