package com.maxi.assign4;

public class Trainer {
	
	String[] showCourses() {
		return new String[] {"JAVA","C"};
	}
	
	void showTrainer(String...names) {
		for (String name : names) {
			System.out.println("Name : "+name);
		}
	}
}
