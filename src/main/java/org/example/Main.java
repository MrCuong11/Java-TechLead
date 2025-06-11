package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");

        double number = scanner.nextDouble();
        double square = number * number;
        System.out.println("Bình phương của " + number + " là: " + square);
        scanner.close();
    }
}
