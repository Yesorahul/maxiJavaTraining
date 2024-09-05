package com.maxi.basic.assign3;

public class Registration {
	public static void main(String[] args) {
		String[] userNames = {"Rahul","Yeso","Keerthan"}; 
		String inputName = "asd";
		boolean isUnique = false;
        for (String username : userNames) {
            if (username.equalsIgnoreCase(inputName)) {
                isUnique = true;
                break;
            }
        }

        if (isUnique) {
            System.out.println("You are registered.");
        } else {
            System.out.println("Name is not unique.");
        }
	}
}
