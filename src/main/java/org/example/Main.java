package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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


        scanner.close();
    }
}
