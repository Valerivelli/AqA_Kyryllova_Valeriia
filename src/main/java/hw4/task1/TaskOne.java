package hw4.task1;

import java.util.Scanner;

public class TaskOne {
    private static final float COEFICIENT = 2.54f;

    public static void main(String[] args) {
        String userInput = getUserInput();
        int intValue = getIntValue(userInput);
        convertValues(userInput, intValue);
    }


    private static void convertValues(String userInput, int intValue) {
        if (userInput.contains("cm")) {
            float resultConvertCmToInch = intValue / COEFICIENT;
            System.out.println("User Input: " + resultConvertCmToInch + " inch");
        } else if (userInput.contains("inch")) {
            float resultConvertInchToCm = intValue * COEFICIENT;
            System.out.println("User input: " + resultConvertInchToCm + " cm");
        } else System.out.println("Pls enter correct value: in inch or cm");
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter your value (inch or cm)");
        return scanner.nextLine();
    }

    private static int getIntValue(String userInput) {
        String numberValue = userInput.replaceAll("[^0-9]", "");
        return Integer.parseInt(numberValue);
    }


}
