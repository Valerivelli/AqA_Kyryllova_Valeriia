package hw5.task3;

import java.util.Scanner;

public class FactorialTaskThree {
    public static void main(String[] args) {
        int userInput = getUserInput();

        if (userInput >= 0) {
            System.out.println("Factorial of " + userInput + " is " + getFactorial(userInput));
        } else System.out.println("Pls enter positive value");

    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter any value for calculation factorial: ");
        return scanner.nextInt();
    }

    private static int getFactorial(int userInput) {
        int result = 1;
        for (int i = 1; i <= userInput; i++) {
            result = result * i;
        }
        return result;
    }
}
