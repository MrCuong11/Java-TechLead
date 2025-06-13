package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        inputAndFindSecondLargest(scanner);



        scanner.close();
    }

    //    Level 2, 2.1: Write a program that takes a list of numbers as input and returns the second largest number in the list
    public static void inputAndFindSecondLargest(Scanner scanner) {
        System.out.print("enter? ");
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
    }
}
