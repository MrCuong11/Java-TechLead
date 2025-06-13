package org.example;

import java.util.*;

public class CollectionFrameWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        HashMap<String, String> products = new HashMap<>();
//
//        addProduct(products, "SP01", "Bút,5000,10");
//        addProduct(products, "SP02", "Vở,10000,5");
//        addProduct(products, "SP03", "Thước,7000,8");
//
//        displayProducts(products);
//
//        findProduct(products, "SP02");
//
//        removeProduct(products, "SP01");
//
//        updateProduct(products, "SP02", "Vở 200 trang,12000,6");
//
//        displayProducts(products);






//        String text = inputText(scanner);
//        String[] words = splitWords(text);
//        HashMap<String, Integer> wordCount = countWords(words);
//        displayResult(wordCount);







        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        List<Double> scores = inputScores(scanner, n);
        HashMap<String, Integer> stats = calculateDistribution(scores);
        displayStats(stats);

        scanner.close();
    }

//bai 8
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



    // bai 9
    public static String inputText(Scanner scanner) {
        System.out.println("Nhập văn bản:");
        return scanner.nextLine();
    }

    public static String[] splitWords(String text) {
        return text.toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", "")
                .split("\\s+");
    }
    public static HashMap<String, Integer> countWords(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void displayResult(HashMap<String, Integer> wordCount) {
        System.out.println("\nSố lần xuất hiện của từng từ:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }



    // bai 10
    public static List<Double> inputScores(Scanner sc, int n) {
        List<Double> scores = new ArrayList<>();
        System.out.println("Nhập điểm:");
        for (int i = 0; i < n; i++) {
            scores.add(sc.nextDouble());
        }
        return scores;
    }

    public static HashMap<String, Integer> calculateDistribution(List<Double> scores) {
        HashMap<String, Integer> stats = new HashMap<>();
        stats.put("Cao", 0);
        stats.put("Trung bình", 0);
        stats.put("Trượt", 0);

        for (double score : scores) {
            if (score >= 8.0) {
                stats.put("Cao", stats.get("Cao") + 1);
            } else if (score >= 5.0) {
                stats.put("Trung bình", stats.get("Trung bình") + 1);
            } else {
                stats.put("Trượt", stats.get("Trượt") + 1);
            }
        }

        return stats;
    }

    public static void displayStats(HashMap<String, Integer> stats) {
        System.out.println("\nPhân phối điểm:");
        for (String key : stats.keySet()) {
            System.out.println(key + ": " + stats.get(key));
        }
    }

}
