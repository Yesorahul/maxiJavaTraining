package com.inheritance.assgin2;

public class Account {
	double balance = 500;
	
	void withdraw(double amount) {
		System.out.println("withdraw : "+amount);
	}
	
	void deposit(double amount) {
		System.out.println("deposit : "+amount);
	}
	
	double getBalance() {
		return balance;
	}
}
