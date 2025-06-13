package org.example;

import java.util.Scanner;

public class Level4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndPrintBubbleSortIterations(scanner);
//        inputAndPrintPairCountWithTarget(scanner);
        scanner.close();
    }

//    Level 4, 4.1: Write a program that takes a list of integers as input and returns the minimum number of moves required to sort the list in ascending order using bubble sort
    public static void inputAndPrintBubbleSortIterations(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int soLanLap = demBubbleSort(arr);

        System.out.println("Số lần lặp : " + soLanLap);
    }

    public static int demBubbleSort(int[] arr) {
        int[] temp = arr.clone();
        int n = temp.length;
        int soLanLap = 0;
        boolean daHoanThanh;

        for (int i = 0; i < n - 1; i++) {
            daHoanThanh = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                    daHoanThanh = false;
                }
            }
            soLanLap++;
            if (daHoanThanh) {
                return soLanLap;
            }
        }
        return soLanLap;
    }

//    Level 4, 4.2: Write a program that takes a list of integers as input and returns the number of distinct subsequences of the list that sum up to a target value.
    public static void inputAndPrintPairCountWithTarget(Scanner scanner) {
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("target: ");
        int target = scanner.nextInt();

        System.out.println("Kết quả: " + demCapSo(arr, target));
    }

    public static int demCapSo(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) count++;
            }
        }
        return count;
    }


}
