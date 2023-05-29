package hw4.task4;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        int value = getUserInpur();

        if (value > 9 && value < 100) {
            int secondValue = value % 10;
            int firstValue = value - secondValue;
            System.out.println("Your number contains from: " + firstValue + " and " + secondValue);
        } else System.out.println("Incorrect value!");
    }

    private static int getUserInpur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a positive two-digit number: ");
        return scanner.nextInt();
    }
}
