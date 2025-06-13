package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputAndSum(scanner);
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
}