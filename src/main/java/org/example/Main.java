package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int findSmallest(int[] arr) {
        Arrays.sort(arr);
        int res = 1;
//[1 ,1 ,2 ,4,]
        for (int num : arr) {
            if (num > res) {
                break;
            }
            res += num;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập: ");
        String[] parts = scanner.nextLine().split("\\s+");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        int result = findSmallest(numbers);
        System.out.println("result: " + result);
    }
}