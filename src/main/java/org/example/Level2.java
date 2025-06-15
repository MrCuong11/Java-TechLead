package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndFindSecondLargest(scanner);
//        inputAndFindLongestWord(scanner);
//        inputAndPrintLCS(scanner);
//        inputAndPrintSumDivisibleBy3And5(scanner);
//        inputAndPrintMaxSubarraySum(scanner);



        scanner.close();
    }

    //    Level 2, 2.1: Write a program that takes a list of numbers as input and returns the second largest number in the list
    public static Integer findSecondLargest(int[] numbers) {
        Arrays.sort(numbers);
        int largest = numbers[numbers.length - 1];

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] < largest) {
                return numbers[i];
            }
        }
        return null;
    }



    //    Level 2, 2.2: Write a program that takes a list of strings as input and returns the longest word in the list.
    public static void inputAndFindLongestWord(Scanner scanner) {
        System.out.print("How many words do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count <= 0) {
            System.out.println("Invalid number of words.");
            return;
        }

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
    }


    //    Level 2, 2.3: Write a program that takes two strings as input and returns the longest common subsequence of the two strings.
    public static void inputAndPrintLCS(Scanner scanner) {
        System.out.print("String 1: ");
        String s1 = scanner.nextLine();
        System.out.print("String 2: ");
        String s2 = scanner.nextLine();

        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (s1.charAt(i) == s2.charAt(j))
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                else
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);

        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--; j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) i--;
            else j--;
        }
        System.out.println("LCS: " + lcs.reverse());
    }

//    Level 2, 2.4: Write a program that takes a list of numbers as input and returns the sum of the numbers that are divisible by both 3 and 5.
    public static void inputAndPrintSumDivisibleBy3And5(Scanner scanner) {
        System.out.print("Enter how many numbers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            if (num % 3 == 0 && num % 5 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of numbers divisible by both 3 and 5: " + sum);
    }

//    Level 2, 2.5: Write a program that takes a list of integers as input and returns the maximum sum of any contiguous subarray within the list
    public static void inputAndPrintMaxSubarraySum(Scanner scanner) {
        System.out.print("Nhập danh sách số nguyên: ");
        String input = scanner.nextLine();
        String[] parts = input.trim().split("\\s+");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        int maxSoFar = numbers[0];
        int currentMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currentMax = Math.max(numbers[i], currentMax + numbers[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println("Tổng lớn nhất của mảng con liên tiếp là: " + maxSoFar);
    }


}
