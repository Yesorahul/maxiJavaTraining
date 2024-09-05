package com.inheritance.assgin3;

public class PhoneCommunication extends Communication {
	
	@Override
	void sendMessage() {
		System.out.println("Communication through phone send message");
	}
	
	void callService() {
		System.out.println("Can be local, international from phone callSerivce");
	}
}
