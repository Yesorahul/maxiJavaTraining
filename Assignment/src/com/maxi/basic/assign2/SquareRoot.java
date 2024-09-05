package com.maxi.basic.assign2;

public class SquareRoot {
    public static void main(String[] args) {
        int[] array = {4, 9, 16, 25, 36};

        double[] squareRootArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            squareRootArray[i] = Math.sqrt(array[i]);
        }

        System.out.println("Square roots of the values:");
        for (double squareRoot : squareRootArray) {
            System.out.println(squareRoot);
        }
    }
}

