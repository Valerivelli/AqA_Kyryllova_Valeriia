package hw4.task3;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        int value = getUserInpur();

        //return reversed value
        if (value > 9 && value < 100) {
            int firstValue = value / 10;
            int secondValue = value % 10;
            System.out.println(secondValue + " " + firstValue);
        } else System.out.println("Incorrect value");

    }

    private static int getUserInpur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter value: ");
        return scanner.nextInt();
    }
}
