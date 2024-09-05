package com.maxi.assign5;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("11R","OnePlus","Metalic black");
		Mobile mobile1 = new Mobile("11","OnePlus","Metalic blue");
		Mobile mobile2 = new Mobile("galaxy","Samsung","black");
		Mobile mobile3 = new Mobile("12","OnePlus","Metalic blue");
		Mobile mobile4 = new Mobile("12R","OnePlus","Matte blue");

		
		Mobile[] mobileArray = {mobile,mobile1,mobile2,mobile3,mobile4};
		for (Mobile mobile6 : mobileArray) {
			mobile6.getDetails();	
		}
		System.out.println("------");
System.out.println();
		for (Mobile mobile6 : mobileArray) {
			if("Samsung".equals(mobile6.brand)){
				System.out.println("------");
				mobile6.getDetails();
			}
		}
	}
}
