package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndFindSecondLargest(scanner);
//        inputAndFindLongestWord(scanner);



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


    //    Level 2, 2.2: Write a program that takes a list of strings as input and returns the longest word in the list.
    public static void inputAndFindLongestWord(Scanner scanner) {
        System.out.print("How many words do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

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



}
