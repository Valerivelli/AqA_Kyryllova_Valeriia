package com.hillel.task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class MainMinChars {
    public static void main(String[] args) {

        String input = "fffff ab f 1234 jkjk";
        String result = findWordWithMinDistinctCharacters(input);
        System.out.println("Result: " + result);
    }

    public static String findWordWithMinDistinctCharacters(String input) {
        String[] words = input.split("\\s+");

        String result = null;
        int minDistinctCount = Integer.MAX_VALUE;

        for (String word : words) {
            int distinctCount = countDistinctCharacters(word);
            if (distinctCount < minDistinctCount) {
                minDistinctCount = distinctCount;
                result = word;
            }
        }

        return result;
    }

    public static int countDistinctCharacters(String word) {
        int[] charCounts = new int[256];
        int count = 0;

        for (char c : word.toCharArray()) {
            if (charCounts[c] == 0) {
                count++;
            }
            charCounts[c]++;
        }
        return count;
    }
}
