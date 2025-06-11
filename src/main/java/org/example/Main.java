package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
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

        // Calculate median
        double median;
        if (count % 2 == 0) {
            int middleIndex1 = count / 2 - 1;
            int middleIndex2 = count / 2;
            median = (numbers[middleIndex1] + numbers[middleIndex2]) / 2.0;
        } else {
            int middleIndex = count / 2;
            median = numbers[middleIndex];
        }

        System.out.println("\nThe median: " + median);


        scanner.close();
    }
}
