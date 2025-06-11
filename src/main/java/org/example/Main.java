package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many strings do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();


        if (count <= 0) {
            System.out.println("Please enter a positive number!");
            scanner.close();
            return;
        }

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }


        System.out.println("\nOriginal list: " + Arrays.toString(words));

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Sorted: " + Arrays.toString(words));


        scanner.close();
    }
}
