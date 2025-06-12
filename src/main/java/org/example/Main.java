package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> danhSach = new ArrayList<>();

        System.out.print("Nhập số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Nhập các chuỗi
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập chuỗi " + (i + 1) + ": ");
            danhSach.add(scanner.nextLine());
        }

        // Sắp xếp danh sách
        Collections.sort(danhSach, (s1, s2) -> {
            int kyTuKhacNhau1 = demKyTuKhacNhau(s1);
            int kyTuKhacNhau2 = demKyTuKhacNhau(s2);

            if (kyTuKhacNhau1 != kyTuKhacNhau2) {
                return kyTuKhacNhau1 - kyTuKhacNhau2;
            }
            return s1.length() - s2.length();
        });

        System.out.println("\nKết quả sau khi sắp xếp:");
        for (String str : danhSach) {
            System.out.println(str);
        }
    }

    public static int demKyTuKhacNhau(String str) {
        Set<Character> kyTuKhacNhau = new HashSet<>();

        for (char c : str.toCharArray()) {
            kyTuKhacNhau.add(c);
        }

        return kyTuKhacNhau.size();
    }
}