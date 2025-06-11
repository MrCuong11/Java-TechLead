package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int maxSubarraySum(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập danh sách số nguyên: ");
        String input = scanner.nextLine();
        String[] parts = input.trim().split("\\s+");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        int result = maxSubarraySum(numbers);
        System.out.println("Tổng lớn nhất của mảng con liên tiếp là: " + result);
    }
}
