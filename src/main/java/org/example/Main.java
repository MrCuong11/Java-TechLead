package org.example;
import java.util.*;

public class Main {
    public static int count(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> pairs = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                pairs.add(a + "," + b);
            }

            seen.add(num);
        }

        return pairs.size();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập dãy số
        System.out.print("Nhập các số nguyên: ");
        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        // Nhập giá trị target
        System.out.print("Nhập giá trị target: ");
        int target = scanner.nextInt();

        int result = count(numbers, target);
        System.out.println("Số cặp phân biệt có tổng bằng " + target + ": " + result);

        scanner.close();
    }
}