package com.inheritance.assgin2;

public class AccountCurrent extends Account {
	@Override
	void withdraw(double amount) {
		balance = balance - amount - 2;
		System.out.println("withdraw in current: "+balance);
	}
	
	@Override
	void deposit(double amount) {
		balance = balance + amount + 2;

		System.out.println("deposit in current : "+balance);
	}
}
