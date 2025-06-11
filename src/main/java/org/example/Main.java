package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        // Input validation
        if (count <= 0) {
            System.out.println("Please enter a positive number!");
            scanner.close();
            return;
        }

        double[] numbers = new double[count];

        // Input numbers
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Find the largest number
        double largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("\nThe largest number in the list is: " + largest);

        scanner.close();
    }
}
