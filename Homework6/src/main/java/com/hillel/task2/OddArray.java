package com.hillel.task2;

public class OddArray {
    public static void main(String[] args) {
        int[] array = new int[50];
        initializationOfArrayAndPrint(array);
    }

    private static void initializationOfArrayAndPrint(int[] array) {
        for (int i = 0, var = 1; i < array.length; var = var + 2, i++) {
            array[i] = var;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}



