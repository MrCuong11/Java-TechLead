package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\s+");
        int sum = 0;

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num % 3 == 0 && num % 5 == 0) {
                    sum += num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + part);
            }
        }

        System.out.println("Resolve: " + sum);
    }
}
