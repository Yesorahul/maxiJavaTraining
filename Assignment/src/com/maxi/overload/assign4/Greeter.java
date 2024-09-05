package com.maxi.overload.assign4;

public class Greeter {
	String personName ;
	
	public Greeter(String personName) {
		super();
		this.personName = personName;
	}
	
	void greetUser(String... messages) {
		for (String message : messages) {
			System.out.println(message+":"+personName);
		}
	}
	void sayHello(String... names) {
		for (String name : names) {
			System.out.println("Welcome : "+ name);
		}
	}
}
