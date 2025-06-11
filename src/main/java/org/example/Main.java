package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a string: ");
        String input = scanner.nextLine();


        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("The string is empty. Word count: 0");
            scanner.close();
            return;
        }


        // regex \\s is a regular expression that matches one or more whitespace characters
        String[] words = input.split("\\s+");
        int wordCount = words.length;

        // Display results
        System.out.println("Number of words: " + wordCount);

        // Close scanner
        scanner.close();
    }
}
