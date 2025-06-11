package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String longestCommonSuffix(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int i = len1 - 1;
        int j = len2 - 1;
        StringBuilder result = new StringBuilder();


        while (i >= 0 && j >= 0 && s1.charAt(i) == s2.charAt(j)) {
            result.insert(0, s1.charAt(i));
            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = scanner.nextLine();
        System.out.print("String 2: ");
        String s2 = scanner.nextLine();

        String lcs = longestCommonSuffix(s1, s2);
        System.out.println("LSC: " + lcs);
    }
}
