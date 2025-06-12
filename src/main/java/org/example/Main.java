package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();


        System.out.print("Nhập số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            System.out.print("Chuỗi " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }


        String[] result = findLargestOverlap(strings);


        System.out.println("\nHai chuỗi có nhiều ký tự trùng nhau nhất:");
        System.out.println(result[0] + ", " +result[1]);

        scanner.close();
    }

    public static String[] findLargestOverlap(List<String> strings) {
        String[] result = new String[2];
        int maxOverlap = -1;


        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                String str1 = strings.get(i);
                String str2 = strings.get(j);


                int overlap = calculateOverlap(str1, str2);

                if (overlap > maxOverlap) {
                    maxOverlap = overlap;
                    result[0] = str1;
                    result[1] = str2;
                }
            }
        }

        return result;
    }

    public static int calculateOverlap(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }


        set1.retainAll(set2);

        return set1.size();
    }
}