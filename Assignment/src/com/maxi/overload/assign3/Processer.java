package com.maxi.overload.assign3;

public class Processer {
	void calculate(double a) {
		System.out.println("Square root : "+Math.sqrt(a));
	}
	void calculate(int a,int b) {
		System.out.println("Product : "+Math.multiplyExact(a, b));
	}
	void calculate(double a , double b) {
		System.out.println("differnce : "+(a-b));
	}
	void calculate(double a, int b) {
		System.out.println("Power : "+Math.pow(a, b));
	}
	
	void calculate(int a) {
		System.out.println("Square : "+Math.pow(a,2));
	}
}
