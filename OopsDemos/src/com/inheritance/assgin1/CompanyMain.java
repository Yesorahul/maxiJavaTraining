package com.inheritance.assgin1;

public class CompanyMain {

	public static void main(String[] args) {

		Project project = new TeamOne();
		project.doTask();
		TeamOne teamOne = (TeamOne) project;
		teamOne.softwaresUsed();
		
		Project project1 = new TeamTwo();
		TeamTwo teamtwo = (TeamTwo)project1;
		project1.doTask();
		for (String string : teamtwo.getTechStack()) {
			System.out.println(string);
		}
	}

}
