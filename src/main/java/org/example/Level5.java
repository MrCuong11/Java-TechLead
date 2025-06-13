package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] arr = inputIntArray(scanner);
//        int[] reversed = reverseArray(arr);
//        System.out.println(Arrays.toString(reversed));

        // String[] arr = inputStringArray(scanner);
        // System.out.print("Nhập kích thước mỗi phần: ");
        // int size = scanner.nextInt();

        // List<List<String>> result = chunk(arr, size);

        // for (List<String> sublist : result) {
        //     System.out.println(sublist);
        // }

        scanner.close();
    }



//    5.1
    public static int[] inputIntArray(Scanner scanner) {
        System.out.print("Nhập: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[n - 1 - i] = arr[i];
        }
        return result;
    }


//    5.2

    public static String[] inputStringArray(Scanner scanner) {
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        System.out.println("Nhập phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        return arr;
    }

    public static <T> List<List<T>> chunk(T[] arr, int size) {
        List<List<T>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += size) {
            int end = Math.min(arr.length, i + size);
            List<T> sublist = new ArrayList<>();
            for (int j = i; j < end; j++) {
                sublist.add(arr[j]);
            }
            result.add(sublist);
        }
        return result;
    }
}
