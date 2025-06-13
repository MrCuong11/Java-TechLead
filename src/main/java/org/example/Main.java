package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndSum(scanner);
//        inputAndPrintLength(scanner);
//        inputAndPrintSquare(scanner);
//        inputAndFindLargest(scanner);
//        inputAndFindShortestString(scanner);
//        inputAndSortNumbers(scanner);
//        inputAndSortStrings(scanner);
//        inputSortAndMedian(scanner);
//        inputAndCountWords(scanner);
//        inputAndCountStringsWithA(scanner);

        scanner.close();
    }


    // Level 1, 1.1: Write a program that takes two numbers as inputs and displays their sum.
    public static void inputAndSum(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }


//    Level 1, 1.2: Write a program that takes a string as input and displays the length of the string.
    public static void inputAndPrintLength(Scanner scanner) {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int length = userInput.length();
        System.out.println("The length of the string \"" + userInput + "\" is: " + length);
    }

//    Level 1, 1.3: Write a program that takes a number as input and displays its square. ( Tính bình phương )
    public static void inputAndPrintSquare(Scanner scanner) {
        System.out.print("Nhập một số: ");
        double number = scanner.nextDouble();
        double square = number * number;
        System.out.println("Bình phương của " + number + " là: " + square);
    }

//    Level 1, 1.4: Write a program that takes a list of numbers as input and displays the largest number in the list.
    public static void inputAndFindLargest(Scanner scanner) {
        System.out.print("enter? ");
        int count = scanner.nextInt();

        // Input validation
        if (count <= 0) {
            System.out.println("Please enter a positive number!");
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
    }


//    Level 1, 1.5: Write a program that takes a list of strings as input and displays the shortest string in the list.
    public static void inputAndFindShortestString(Scanner scanner) {
        System.out.print("enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count <= 0) {
            System.out.println("Please enter a positive number!");
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

        System.out.println("\nThe shortest string is: \""  + shortest + "\"");
    }

//    Level 1, 1.6: Write a program that takes a list of numbers as input and sorts the list in ascending order
    public static void inputAndSortNumbers(Scanner scanner) {
        System.out.print("enter? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number!");
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
    }


//    Level 1, 1.7: Write a program that takes a list of strings as input and sorts the list in alphabetical order

    public static void inputAndSortStrings(Scanner scanner) {
        System.out.print("enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }


        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted: " + Arrays.toString(words));
    }


//    Level 1, 1.8: Write a program that takes a list of numbers as input and returns the median of the numbers.( Tìm số trung vị ( số trung vị không phải số trung bình cộng ))
    public static void inputSortAndMedian(Scanner scanner) {
        System.out.print("numbers: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number!");
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
    }

//    Level 1, 1.9: Write a program that takes a string as input and returns the number of words in the string.
    public static void inputAndCountWords(Scanner scanner) {
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("The string is empty");
            return;
        }

        String[] words = input.split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }

//    Level 1, 1.10: Write a program that takes a list of strings as input and returns the number of strings that contain the letter 'a'.
    public static void inputAndCountStringsWithA(Scanner scanner) {
        System.out.print(" enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }

        String[] strings = new String[count];
        int stringsWithA = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();

            if (strings[i].toLowerCase().contains("a")) {
                stringsWithA++;
            }
        }

        System.out.println("Total strings entered: " + count);
        System.out.println("Strings containing 'a': " + stringsWithA);
    }
}