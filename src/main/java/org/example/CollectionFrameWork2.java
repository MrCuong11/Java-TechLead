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







//        System.out.print("Nhập số lượng sinh viên: ");
//        int n = scanner.nextInt();
//
//        List<Double> scores = inputScores(scanner, n);
//        HashMap<String, Integer> stats = calculateDistribution(scores);
//        displayStats(stats);







//        HashMap<String, String> dictionary = new HashMap<>();
//
//        addWord(dictionary, scanner);
//        lookupWord(dictionary, scanner);






//        List<Map<String, Object>> products = new ArrayList<>();
//
//        // Thêm sản phẩm
//        products.add(createProduct("Bánh", "P001", 15000.0, "2024-06-01"));
//        products.add(createProduct("Nước", "P002", 10000.0, "2024-05-20"));
//        products.add(createProduct("Kẹo", "P003", 10000.0, "2024-06-05"));
//        products.add(createProduct("Sữa", "P004", 20000.0, "2024-04-10"));
//
//        // Sắp xếp theo tên
//        System.out.println("Sắp xếp theo tên:");
//        products.sort(Comparator.comparing(p -> (String) p.get("name")));
//        printProducts(products);
//
//        // Sắp xếp theo giá
//        System.out.println(" Sắp xếp theo giá:");
//        products.sort(Comparator.comparing(p -> (Double) p.get("price")));
//        printProducts(products);
//
//        // Sắp xếp theo ngày sản xuất
//        System.out.println(" Sắp xếp theo ngày sản xuất:");
//        products.sort(Comparator.comparing(p -> (String) p.get("date")));
//        printProducts(products);
//
//        // Sắp xếp theo giá rồi ngày
//        System.out.println(" Sắp xếp theo giá rồi ngày:");
//        products.sort(Comparator
//                .comparing((Map<String, Object> p) -> (Double) p.get("price"))
//                .thenComparing(p -> (String) p.get("date")));
//        printProducts(products);

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







    // Bai 11
    public static void addWord(HashMap<String, String> dict, Scanner sc) {
        System.out.print("Nhập từ: ");
        String word = sc.nextLine();
        System.out.print("Nhập định nghĩa: ");
        String definition = sc.nextLine();
        dict.put(word, definition);
    }

    public static void lookupWord(HashMap<String, String> dict, Scanner sc) {
        System.out.print("Nhập từ cần tra: ");
        String word = sc.nextLine();
        if (dict.containsKey(word)) {
            System.out.println("Định nghĩa: " + dict.get(word));
        } else {
            System.out.println("Không tìm thấy từ.");
        }
    }



    //bai 12
    // Tạo sản phẩm dưới dạng Map
    public static Map<String, Object> createProduct(String name, String code, double price, String date) {
        Map<String, Object> product = new HashMap<>();
        product.put("name", name);
        product.put("code", code);
        product.put("price", price);
        product.put("date", date);
        return product;
    }

    // In sản phẩm
    public static void printProducts(List<Map<String, Object>> products) {
        for (Map<String, Object> p : products) {
            System.out.println(p.get("name") + " - " + p.get("code") + " - " +
                    p.get("price") + "đ - " + p.get("date"));
        }
    }


    // Bai 13
    // Tìm các phần tử trùng lặp
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
    public static void displayDuplicates(Set<Integer> duplicates) {
        if (duplicates.isEmpty()) {
            System.out.println("Không có phần tử trùng lặp.");
        } else {
            System.out.println("Các phần tử trùng lặp:");
            for (int num : duplicates) {
                System.out.println(num);
            }
        }
    }


    // bai 14
    // Tìm phần tử chung (giao) giữa hai tập hợp
    public static HashSet<Integer> findIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> result = new HashSet<>(set1);
        result.retainAll(set2); // giữ lại các phần tử có trong cả hai tập
        return result;
    }
}
