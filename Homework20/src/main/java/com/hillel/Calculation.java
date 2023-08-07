package com.hillel;

public class Calculation {
    public static int calc(int num1, int num2, char operation) throws Exception {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new Exception("Invalid operation: " + operation);
        }
    }
}
