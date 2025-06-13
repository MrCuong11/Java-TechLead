package org.example;

import java.util.HashMap;
import java.util.Map;

public class CollectionFrameWork2 {
    public static void main(String[] args) {
        HashMap<String, String> products = new HashMap<>();

        addProduct(products, "SP01", "Bút,5000,10");
        addProduct(products, "SP02", "Vở,10000,5");
        addProduct(products, "SP03", "Thước,7000,8");

        displayProducts(products);

        findProduct(products, "SP02");

        removeProduct(products, "SP01");

        updateProduct(products, "SP02", "Vở 200 trang,12000,6");

        displayProducts(products);
    }


    public static void addProduct(HashMap<String, String> products, String code, String info) {
        products.put(code, info);
    }

    public static void displayProducts(HashMap<String, String> products) {
        System.out.println("\nDanh sách sản phẩm:");
        for (Map.Entry<String, String> entry : products.entrySet()) {
            System.out.println("Mã: " + entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void findProduct(HashMap<String, String> products, String code) {
        if (products.containsKey(code)) {
            System.out.println("\nTìm thấy " + code + ": " + products.get(code));
        } else {
            System.out.println("\nKhông tìm thấy mã sản phẩm: " + code);
        }
    }

    public static void removeProduct(HashMap<String, String> products, String code) {
        if (products.remove(code) != null) {
            System.out.println("\nĐã xóa sản phẩm có mã: " + code);
        } else {
            System.out.println("\nKhông tìm thấy để xóa: " + code);
        }
    }

    public static void updateProduct(HashMap<String, String> products, String code, String newInfo) {
        if (products.containsKey(code)) {
            products.put(code, newInfo);
            System.out.println("\nĐã cập nhật " + code + " thành: " + newInfo);
        } else {
            System.out.println("\nKhông tìm thấy sản phẩm để cập nhật: ");
        }
    }
}
