package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndPrintSecondSmallest(scanner);
//        inputAndPrintMaxDifference(scanner);
        scanner.close();
    }


//    Level 3, 3.1: Write a program that takes a list of numbers as input and returns the second smallest number in the list.
    public static void inputAndPrintSecondSmallest(Scanner scanner) {
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal list: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        int secondSmallest = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > secondSmallest) {
                secondSmallest = numbers[i];
                break;
            }
        }

        System.out.println("The second smallest number is: " + secondSmallest);
    }

    // Level 3, 3.2: Write a program that takes a list of integers as input and returns the maximum difference between any two elements in the list.
    public static void inputAndPrintMaxDifference(Scanner scanner) {
        System.out.print("Nhập số lượng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int maxDiff = max - min;

        System.out.println("Hiệu lớn nhất là: " + maxDiff);
        System.out.println("(Được tính từ " + max + " - " + min + ")");
    }

}
