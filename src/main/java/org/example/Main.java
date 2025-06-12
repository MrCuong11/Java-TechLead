package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        System.out.println("Kết quả: " + timChuoiChungDaiNhat(strings));
    }

    public static int timChuoiChungDaiNhat(String[] strings) {
        //tim chuoi ngan nhat
        String chuoiNgan = strings[0];
        for (String s : strings) {
            if (s.length() < chuoiNgan.length()) {
                chuoiNgan = s;
            }
        }

        // Kiểm tra từng độ dài có thể
        for (int len = chuoiNgan.length(); len > 0; len--) {
            for (int i = 0; i <= chuoiNgan.length() - len; i++) {
                String sub = chuoiNgan.substring(i, i + len);
                boolean timThay = true;

                // check neu khong co break luon
                for (String s : strings) {
                    if (!s.contains(sub)) {
                        timThay = false;
                        break;
                    }
                }

                if (timThay){
                    return len;
                }
            }
        }

        return 0;
    }
}