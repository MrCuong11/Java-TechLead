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
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

    // Tính và in kết quả
    System.out.println("Tổng lớn nhất: " + timTongLonNhat(arr));
}

    public static int timTongLonNhat(int[] arr) {
        int tongMax = 0;
        for (int i = 0; i < arr.length; i++) {
            int tong = arr[i];
            tongMax = Math.max(tongMax, tong);


            for (int j = i + 2; j < arr.length; j++) {
                tong += arr[j];
                tongMax = Math.max(tongMax, tong);
                j++;
            }
        }

        return tongMax;
    }
}