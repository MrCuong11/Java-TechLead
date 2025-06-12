package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        int result = longestCommonSubstring(strings);
        System.out.println("Chuỗi con chung dài nhất: " + result);
    }

    public static int longestCommonSubstring(String[] strings) {
        if (strings.length == 0) return 0;

        String base = strings[0];
        int maxLength = 0;

        for (int i = 0; i < base.length(); i++) {
            for (int j = i + 1; j <= base.length(); j++) {
                String sub = base.substring(i, j);
                boolean isCommon = true;
                for (int k = 1; k < strings.length; k++) {
                    if (!strings[k].contains(sub)) {
                        isCommon = false;
                        break;
                    }
                }
                if (isCommon) {
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }

        return maxLength;
    }
}