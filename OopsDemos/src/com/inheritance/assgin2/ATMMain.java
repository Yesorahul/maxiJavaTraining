package com.inheritance.assgin2;

public class ATMMain {
	public static void main(String[] args) {
		Account account = new AccountSaving();
		account.deposit(100);
		account.withdraw(50);
		double savingbalance = account.getBalance();
		System.out.println(savingbalance);
 
		Account currentAccount = new AccountCurrent();
		currentAccount.deposit(200);
		currentAccount.withdraw(100);
		double currentbalance = currentAccount.getBalance();
		System.out.println(currentbalance);
	}
}
