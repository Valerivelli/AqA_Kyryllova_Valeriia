package com.hillel.task3;

public class Average {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        initAndPrintArray(array1);
        initAndPrintArray(array2);

        double average1 = getAverage(array1);
        double average2 = getAverage(array2);

        if (average1 > average2) {
            System.out.println("Average of the first array: " + average1 + " is greater than average of the second array: " + average2);
        } else if (average2 > average1) {
            System.out.println("Average of the second array: " + average2 + " is greater than average of the first array: " + average1);
        } else System.out.println("Averages of the arrays are equal: " + average1);
    }

    private static double getAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / array.length;
    }

    private static void initAndPrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 6);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
