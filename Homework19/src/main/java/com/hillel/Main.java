package com.hillel;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Calculation calculation = new Calculation();
        int num1 = UserInput.getInt(scanner);
        int num2 = UserInput.getInt(scanner);
        char operation = UserInput.getOperation(scanner);
        int result = calculation.calc(num1, num2, operation);
        System.out.println("Result of your operation: " + result);
    }
}