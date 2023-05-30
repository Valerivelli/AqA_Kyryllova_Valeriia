package hw4.task6;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Integer userInput = getUserInput();
        validateUserInput(userInput);
    }

    private static void validateUserInput(Integer userInput) {
        if (userInput != null && userInput > 0){
            System.out.println("Your value is positive!");
        }
        else if (userInput != null && userInput < 0){
            System.out.println("Your value is negative!");
        }
        else if (userInput != null){
            System.out.println("Your value is 0!");
        }
    }

    private static Integer getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter any digits: ");

        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input format, pls enter digits");
            return null;
        }
    }
}
