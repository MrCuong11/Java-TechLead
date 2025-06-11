package org.example;

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


        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }


        String shortest = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
            }
        }

        // Display the result
        System.out.println("\nThe shortest string is: \""  + shortest + "\"");
        scanner.close();
    }
}
