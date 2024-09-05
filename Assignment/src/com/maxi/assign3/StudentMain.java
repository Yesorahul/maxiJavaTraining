package com.maxi.assign3;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student("Rahul","CSE");
		int[] marks = {70,80};
		System.out.println("grades : "+student.getGrades(marks)+"\n"+"names : "+student.name+ "\n department"+student.department);
	}
}
