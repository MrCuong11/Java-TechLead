package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        // Nhập mảng
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tính và in kết quả
        int result = findMaxSum(arr);
        System.out.println("Tổng lớn nhất của dãy con: " + result);

        scanner.close();
    }

    public static int findMaxSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];

        int include = arr[0];
        int exclude = 0;

        // Duyệt từng phần tử trong mảng
        for (int i = 1; i < arr.length; i++) {
            // Lưu lại giá trị include cũ
            int temp = include;


            include = arr[i] + exclude;


            exclude = Math.max(temp, exclude);
        }

        return Math.max(include, exclude);
    }
}