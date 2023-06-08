package hw5.task4;

import java.util.Scanner;

public class LoopSumFour {
    public static void main(String[] args) {
        String userInput = getUserInput();
        char[] ch = userInput.toCharArray();
        System.out.println(getInputSum(ch));
    }

    private static int getInputSum(char[] ch) {
        int sum = 0;
        for (char c : ch) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter any value: ");
        return scanner.nextLine();
    }
}
