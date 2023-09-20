package com.io;

import java.util.HashMap;

public class DuplicateCharacterFinder {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Convert the input string to lowercase to consider case-insensitivity.
        inputString = inputString.toLowerCase();

        // Create a HashMap to store character counts.
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Call the recursive function to find and print duplicate characters.
        findAndPrintDuplicates(inputString, charCountMap, 0);
    }

    public static void findAndPrintDuplicates(String inputString, HashMap<Character, Integer> charCountMap, int index) {
        // Base case: If we have processed the entire string, return.
        if (index == inputString.length()) {
            return;
        }

        char currentChar = inputString.charAt(index);

        // Update the character count in the HashMap.
        charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

        // If the count is 2, it's a duplicate character, so print it.
        if (charCountMap.get(currentChar) == 2) {
            System.out.println("Duplicate character: " + currentChar);
        }

        // Recursively process the next character in the string.
        findAndPrintDuplicates(inputString, charCountMap, index + 1);
    }
}
