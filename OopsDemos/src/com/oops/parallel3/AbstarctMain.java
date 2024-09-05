package com.oops.parallel3;

public class AbstarctMain {

	public static void main(String[] args) {

		Shape shape = new Triangle();
		shape.area(12, 2);
		
		Triangle tri = new Triangle();
		tri.printTypes();
	}

}
