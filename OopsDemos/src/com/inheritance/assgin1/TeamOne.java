package com.inheritance.assgin1;

public class TeamOne extends Project {
	@Override
	void doTask() {
		System.out.println("Project implemented using Java");
	}
	
	void softwaresUsed(String... tools) {
		for (String tool : tools) {
			System.out.println("used software : "+tool);
		}
	}
}
