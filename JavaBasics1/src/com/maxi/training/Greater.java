package com.maxi.training;

public class Greater {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int z = 300;
		
		boolean a= x<y;
		boolean b= x>y;
		String result = (x>y && x>z)?"X is greater" : "x is lesser";
		System.out.println(result);
	}
}
