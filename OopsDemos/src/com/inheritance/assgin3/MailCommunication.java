package com.inheritance.assgin3;

public class MailCommunication extends Communication {
	
	@Override
	void sendMessage() {
		System.out.println("Communication using mail service");
	}
	
	String[] types = {"email","telegram","letter"};
	
	String[] showTypes() {
		return types;
	}
			
}
