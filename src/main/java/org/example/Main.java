package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maxProductOfThree(arr);
        System.out.println("Tích lớn nhất của 3 phần tử: " + result);
    }

    public static int maxProductOfThree(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int option1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        // Tích của 2 số âm nhỏ nhất và số lớn nhất
        int option2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(option1, option2);
    }
}