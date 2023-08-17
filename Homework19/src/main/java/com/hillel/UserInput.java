package com.hillel;

import java.util.Scanner;

public class UserInput {
    public static final String ALLOWED_OPERATION = "*/-+";

    public static int getInt(Scanner scanner) {
        System.out.println("Pls enter any numeric value:");
        return scanner.nextInt();
    }

    public static char getOperation(Scanner scanner) {
        System.out.println("Pls enter operation value: + ; - ; * ; / ");
        char operation;
        operation = scanner.next().charAt(0);
        if (!ALLOWED_OPERATION.contains(Character.toString(operation))) {
            System.out.println("Pls input correct operation!");
            operation = getOperation(scanner);
        }
        return operation;
    }
}
