package com.hillel;

public class Calculation {
    public int calc(int num1, int num2, char operation) throws Exception {
        switch (operation) {
            case '+':
                return getSum(num1, num2);
            case '-':
                return getDiff(num1, num2);
            case '*':
                return getMult(num1, num2);
            case '/':
                return getDiv(num1, num2);
            default:
                throw new Exception("Invalid operation: " + operation);
        }
    }

    private int getSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int getDiff(int num1, int num2) {
        return num1 - num2;
    }

    private static int getMult(int num1, int num2) {
        return num1 * num2;
    }

    private static int getDiv(int num1, int num2) {
        return num1 / num2;
    }

}
