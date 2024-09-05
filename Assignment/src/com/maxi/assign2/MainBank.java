package com.maxi.assign2;

public class MainBank {
	public static void main(String[] args) {
		Bank bank = new Bank(500);
		bank.deposit(800);
		System.out.println(bank.getBalance());
	}
}
