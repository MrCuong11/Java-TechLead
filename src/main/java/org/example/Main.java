package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();


        int result = findLongestPalindrome(input);
        System.out.println("palindrome dài nhất: " + result);

        scanner.close();
    }

    public static int findLongestPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "");

        // Đếm số lần xuất hiện của mỗi ký tự
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        // Tính độ dài palindrome
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length += 1;
        }

        return length;
    }
}