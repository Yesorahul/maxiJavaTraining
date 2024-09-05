package com.oops.overloading;

public class Shape {
	void area(int a) {
		System.out.println("Square : "+a*a);
	}
	
	void area(float x) {
		System.out.println("Circle : "+(Math.PI*x*x));

	}
	
	int area(int a, int b) {
		return a*a;
	}
	
	double area(int a, float b) {
		return a*b;
	}
}
