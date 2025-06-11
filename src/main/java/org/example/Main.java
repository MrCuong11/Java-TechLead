package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number!");
            scanner.close();
            return;
        }

        double[] numbers = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }


        System.out.println("\nOriginal list: " + Arrays.toString(numbers));


        Arrays.sort(numbers);


        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Close scanner
        scanner.close();
    }
}
