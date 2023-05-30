package hw4.task7;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        int userInput = getUserInput();

        if (userInput > 99 && userInput < 1000){
            int result = userInput -1;
            System.out.println("Your result is: " + result);
        }
        else System.out.println("Incorrect value! Pls enter value from 100 to 1000.");
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a positive two-digit number: ");
        return scanner.nextInt();
    }
}
