package hw4.task5;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        int value = getUserInpur();

        if (value > 9 && value < 100) {
            int firstValue = value / 10;
            int secondValue = value % 10;
            int sumOfValues = firstValue + secondValue;
            System.out.println("Weight of your number is: " + sumOfValues);
        }
        else System.out.println("Pls enter any positive two-digit number. Now it`s incorrect value!");
    }

    private static int getUserInpur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a positive two-digit number: ");
        return scanner.nextInt();
    }
}

