package org.example;

import java.util.ArrayList;
import java.util.Arrays;
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



        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1;
        int endIndex = 0;


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        endIndex = i;
                    }
                }
            }
        }

//        ArrayList<Integer> sequence = new ArrayList<>();
//        for (int i = endIndex; i >= 0; i = prev[i]) {
//            sequence.add(0, arr[i]);
//        }


        System.out.println("Độ dài của chuỗi con tăng dần dài nhất: " + maxLength);
//        System.out.println("Một chuỗi con tăng dần dài nhất: " + sequence);

        scanner.close();
    }
}
