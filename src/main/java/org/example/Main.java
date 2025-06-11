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


        String[] strings = new String[count];
        int stringsWithA = 0;

        // Input strings and count those with 'a'
        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();

            if (strings[i].toLowerCase().contains("a")) {
                stringsWithA++;
            }
        }

        System.out.println("Total strings entered: " + count);
        System.out.println("Strings containing 'a': " + stringsWithA);


        scanner.close();
    }
}
