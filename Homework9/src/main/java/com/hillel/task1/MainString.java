package com.hillel.task1;

public class MainString {
    public static void main(String[] args) {
        String str = getString("I love Java!!!");
        System.out.println("Our test String is: " + str);
        getLastCharFromString(str);
        isStringEndWith(str, "!!!");
        isStringStartWith(str, "I like");
        isStringContainValue(str, "Java");
        getPositionOfSubstring(str, "Java");
        replaceCharsInString(str, 'a', 'o');
        changeTpUpperCase(str);
        changeToLowerCase(str);
        cutSymbolsFromString(str);
    }

    private static String getString(String str) {
        return str;
    }

    private static void getLastCharFromString(String str) {
        System.out.println("Last char is: " + str.charAt(str.length() - 1));
    }

    private static void isStringEndWith(String str, String ending) {
        System.out.println("Is it last char \"!!!\" ? " + str.endsWith(ending));
    }

    private static void isStringStartWith(String str, String beginning) {
        System.out.println("String starts with \"I like\" ? " + str.startsWith(beginning));
    }

    private static void isStringContainValue(String str, String value) {
        System.out.println("Does string contain \" Java\"? " + str.contains(value));
    }

    private static void getPositionOfSubstring(String str, String value) {
        System.out.println("Position of \"Java\" is: " + str.indexOf(value));
    }

    private static void replaceCharsInString(String str, char source, char target) {
        System.out.println(str.replace(source, target));
    }

    private static void changeTpUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    private static void changeToLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    private static void cutSymbolsFromString(String str) {
        System.out.println(str.substring(7, 11));
    }


}
