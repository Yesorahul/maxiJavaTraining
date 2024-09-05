package com.maxi.overload.assign2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.sendMail("Welcome to this day");
		System.out.println();
		messenger.sendMail("Rahul", "Hi I have already been here");
		System.out.println();
		messenger.sendMail("yeso", "It's been 1 yr", "CAME HERE");
	}
}
