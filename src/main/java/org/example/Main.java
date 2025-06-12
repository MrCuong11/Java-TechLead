package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số chuỗi: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<String> strings = new ArrayList<>();
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

        // Integer.compare(x, y) trả về:
        //
        //-1 nếu x < y → x đứng trước
        //
        //1 nếu x > y → x đứng sau
        strings.sort((a, b) -> {
            int distinctA = countDistinctWords(a);
            int distinctB = countDistinctWords(b);

            if (distinctA != distinctB) {
                return Integer.compare(distinctB, distinctA);
            }

            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            }

            return a.compareTo(b);
        });

        System.out.println("Result:");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static int countDistinctWords(String s) {
        String[] words = s.toLowerCase().split("\\s+");
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        return unique.size();
    }
}