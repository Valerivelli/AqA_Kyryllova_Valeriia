package com.hillel.task1;

public class EvenArray {
    public static void main(String[] args) {
        int a = getArraySize();
        int[] array = new int[a];
        initializationOfArrayAndPrint(array);
    }

    private static void initializationOfArrayAndPrint(int[] array) {
        int var = 0;
        for (int i = 0; i < array.length; i++) {
            var += 2;
            array[i] = var;
        }
        for (int b : array) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (int b : array) {
            System.out.println(b);
        }
    }

    private static int getArraySize() {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        return a;
    }

}
