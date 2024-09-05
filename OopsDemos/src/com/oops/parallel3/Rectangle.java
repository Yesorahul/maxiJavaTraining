package com.oops.parallel3;

public abstract class Rectangle extends Shape {

	@Override
	void area(int a, int b) {
		System.out.println("Rectangle : " + a*b);
	}

}
