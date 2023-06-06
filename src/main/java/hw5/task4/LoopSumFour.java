package hw5.task4;

import java.util.Scanner;

public class LoopSumFour {
    public static void main(String[] args) {
        int input = getUserInput();
        getInputSum(input);
    }

    private static void getInputSum(int input) {
        int result = 0;
        if (input == 0) {
            System.out.println(result);
        } else if (input > 0) {
            for (int i = 0; i < input + 1; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            for (int i = 0; i > input - 1; i--) {
                result += i;
            }
            System.out.println(result);
        }
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter any value: ");
        return scanner.nextInt();
    }
}
