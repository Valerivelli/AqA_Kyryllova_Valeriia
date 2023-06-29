package com.hillel.task2;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createStrings(3, 56);
        System.out.println("Our strings: \n" + stringBuilder);
        modifyStringWithInsert(stringBuilder, "=", "равно");
        System.out.println("Strings with \"insert\" method: \n" + stringBuilder);
        modifyStringWithReplace(stringBuilder, "=", "равно");
        System.out.println("Strings with \"replace\" method: \n" + stringBuilder);
    }

    private static StringBuilder createStrings(int firstValue, int secondValue) {
        StringBuilder resultOfOperation = new StringBuilder();
        resultOfOperation.append(firstValue).append(" + ").append(secondValue).append(" = ").append(firstValue + secondValue).append("\n")
                .append(firstValue).append(" - ").append(secondValue).append(" = ").append(firstValue - secondValue).append("\n")
                .append(firstValue).append(" * ").append(secondValue).append(" = ").append(firstValue * secondValue).append("\n");
        return resultOfOperation;
    }

    private static void modifyStringWithInsert(StringBuilder stringBuilder, String oldValue, String newValue) {
        int positionOfValue;
        while ((positionOfValue = stringBuilder.indexOf(oldValue)) != -1) {
            stringBuilder.deleteCharAt(positionOfValue);
            stringBuilder.insert(positionOfValue, newValue);
        }
    }

    private static void modifyStringWithReplace(StringBuilder stringBuilder, String oldValue, String newValue) {
        int positionOfValue;
        while ((positionOfValue = stringBuilder.indexOf(oldValue)) != -1) {
            stringBuilder.deleteCharAt(positionOfValue);
            stringBuilder.replace(positionOfValue, positionOfValue + 1, newValue);
        }
    }
}
