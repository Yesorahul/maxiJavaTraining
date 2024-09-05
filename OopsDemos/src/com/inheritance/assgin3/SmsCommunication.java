package com.inheritance.assgin3;

public class SmsCommunication extends Communication {
	
	void messageLenght() {
		System.out.println("Communication from SMS messageLength");
	}
	
	@Override
	void sendMessage() {
		System.out.println("Communication from SMS sendMessage");
	}
}
