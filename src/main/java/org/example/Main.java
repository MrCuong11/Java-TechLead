package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();


        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal list: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        int secondLargest = numbers[count - 1];
        for (int i = count - 2; i >= 0; i--) {
            if (numbers[i] < secondLargest) {
                secondLargest = numbers[i];
                break;
            }
        }


        System.out.println("The second largest number is: " + secondLargest);

        // Close scanner
        scanner.close();
    }
}
