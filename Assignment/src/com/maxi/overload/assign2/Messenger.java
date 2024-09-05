package com.maxi.overload.assign2;

public class Messenger {
	void sendMail(String message) {
		System.out.println("Message : "+message);
	}
	
	void sendMail(String tousername,String message) {
		System.out.println("Message : "+message);
		System.out.println("tousername : "+tousername);
	}
	
	void sendMail(String tousername,String message,String subject) {
		System.out.println("Message : "+message);
		System.out.println("tousername : "+tousername);
		System.out.println("subject : "+subject);
	}
}
