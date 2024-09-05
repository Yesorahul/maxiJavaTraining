package com.inheritance.assgin3;

public class WhatsAppCommunication extends Communication {
	void otherFeatures() {
		System.out.println("Communication from Whatsapp otherFeatures");
	}
	
	@Override
	void sendMessage() {
		System.out.println("Communication from whatsapp sendMessage");
	}
}
