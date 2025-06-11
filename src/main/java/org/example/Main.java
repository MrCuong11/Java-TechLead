package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many words do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();


        String[] words = new String[count];


        for (int i = 0; i < count; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.nextLine().trim();
        }


        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("\nThe longest word is: \"" + longestWord + "\"");
        scanner.close();
    }
}
