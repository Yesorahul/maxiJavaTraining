package com.oops.overloading;

public class ShapeMain {
	public static void main(String[] main) {
		Shape shape = new Shape();
		shape.area(1);
		shape.area(10.5f);

		int rec = shape.area(10, 20);
		System.out.println("rect : " + rec);
		System.out.println("Trianle : " + shape.area(10, 10.5f));

	}
}
