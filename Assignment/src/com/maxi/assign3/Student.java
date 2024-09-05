package com.maxi.assign3;

public class Student {
	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("name : "+name);
		System.out.println("department : "+department);
	}
	
	String getGrades(int[] marks) {
		int sum = 0;
		double average = 0.0;
		for (int mark : marks) {
			sum+=mark;
		}
		average=sum/marks.length;
		if(average>90 && average <100)
			return "A";
		else if(average>80 && average <90)
			return "B";
		else if(average>70 && average <80)
			return "c";
		else if(average>60 && average <70)
			return "D";
		else
			return "fail";
	}
}
