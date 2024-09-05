package com.inheritance.assgin1;

import java.util.Arrays;
import java.util.Iterator;

public class TeamTwo extends Project {

	@Override
	void doTask() {
		System.out.println("Project implemented using Python");
	}
	
	String[] values = {"Java","Spring"};
	String[] getTechStack() {
		return values;
	}
}