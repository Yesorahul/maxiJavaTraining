package com.maxi.basic.assign1;

import java.util.ArrayList;

public class TwoDim {
    public static void main(String[] args) {
        String[][] twoDimArray = {
            {"Sarah", "John", "Steve"},
            {"Alice", "Samantha", "Tom"},
            {"Sam", "Jessica", "Sophi"}
        };

        ArrayList<String> namesStartingWithS = new ArrayList<>();

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j].toLowerCase().startsWith("s")) {
                    namesStartingWithS.add(twoDimArray[i][j]);
                }
            }
        }

        String[] oneDimArray = namesStartingWithS.toArray(new String[0]);
       System.out.println("Names that start with 's':");
        for (String name : oneDimArray) {
            System.out.println(name);
        }
    }
}
