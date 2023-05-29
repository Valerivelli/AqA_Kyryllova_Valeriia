package hw4.task8;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        String userInput = getUserInpur();
        char[] ch = userInput.toCharArray();

        int value = Integer.parseInt(userInput);

        validationOfUserInput(ch, value);
    }

    private static void validationOfUserInput(char[] ch, int value) {
        if (value > 9 && value < 100 && ch.length == 2) {
            int firstValue = Integer.parseInt(String.valueOf(ch[0]));
            int secondValue = Integer.parseInt(String.valueOf(ch[1]));
            int mult = firstValue * secondValue;
            if (mult > value) {
                System.out.println("Result of multiplication: " + mult + " is bigger than your value!");
            } else System.out.println("Your value: " + value + " is bigger than multiplication of your digits!");

        }
    }

    private static String getUserInpur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a positive two-digit number: ");
        return scanner.nextLine();
    }
}
