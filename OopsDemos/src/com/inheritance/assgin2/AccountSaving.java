package com.inheritance.assgin2;

public class AccountSaving extends Account {
	@Override
	void withdraw(double amount) {
		balance = balance - amount - 1;
		System.out.println("withdraw in saving: "+balance);
	}
	
	@Override
	void deposit(double amount) {
		balance = balance + amount +1;
		System.out.println("deposit in saving : "+balance);
	}

}
