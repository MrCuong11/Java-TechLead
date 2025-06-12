package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        // Nhập mảng
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Đếm số lần lặp bubble sort
        int soLanLap = demBubbleSort(arr);

        System.out.println("Số lần lặp : " + soLanLap);
        scanner.close();
    }

    public static int demBubbleSort(int[] arr) {
        int[] temp = arr.clone();
        int n = temp.length;
        int soLanLap = 0;
        boolean daHoanThanh;

        // Vòng lặp chính của bubble sort
        for (int i = 0; i < n - 1; i++) {
            daHoanThanh = true;

            // trừ i nữa vì sau mỗi lần lặp, phần tử lớn nhất về cuối, bỏ nó
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
}