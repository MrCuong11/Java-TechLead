package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Level5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        int[] arr = inputIntArray(scanner);
//        int[] reversed = reverseArray(arr);
//        System.out.println(Arrays.toString(reversed));





        // String[] arr = inputStringArray(scanner);
        // System.out.print("Nhập kích thước mỗi phần: ");
        // int size = scanner.nextInt();
        // List<List<String>> result = chunk(arr, size);
        // for (List<String> sublist : result) {
        //     System.out.println(sublist);
        // }


//        int[] numbers = {1, 2, 3, 2, 4, 3, 5};
//        int[] uniqueNumbers = uniq(numbers);
//        System.out.println("Mảng sau: " + Arrays.toString(uniqueNumbers));




//        List<Map<String, Integer>> input = new ArrayList<>();
//
//        Map<String, Integer> obj1 = new HashMap<>();
//        obj1.put("x", 1);
//        obj1.put("y", 2);
//
//        Map<String, Integer> obj2 = new HashMap<>();
//        obj2.put("x", 2);
//        obj2.put("y", 1);
//
//        Map<String, Integer> obj3 = new HashMap<>();
//        obj3.put("y", 2);
//        obj3.put("x", 1);
//
//        input.add(obj1);
//        input.add(obj2);
//        input.add(obj3);
//
//        List<Map<String, Integer>> result = uniq(input);
//
//        for (Map<String, Integer> map : result) {
//            System.out.println(map);
//        }



//        List<Map<String, Integer>> collect = new ArrayList<>();
//        collect.add(Map.of("a", 1, "b", 2));
//        collect.add(Map.of("a", 1, "b", 3));
//        collect.add(Map.of("a", 2, "b", 2));
//
//        System.out.println("Group by 'a':");
//        Map<Integer, List<Map<String, Integer>>> groupByA = groupBy(collect, "a");
//        System.out.println(groupByA);
//
//        System.out.println("\nGroup by 'b':");
//        Map<Integer, List<Map<String, Integer>>> groupByB = groupBy(collect, "b");
//        System.out.println(groupByB);





//        System.out.println(trimAll("    hello     world    "));
//        System.out.println(trimAll("   I    am    good      "));




//        List<String> keys = Arrays.asList("b", "a", "c");
//        List<Map<String, Integer>> collections = Arrays.asList(
//                Map.of("a", 1, "b", 1, "c", 2, "d", 4, "e", 5),
//                Map.of("a", 2, "b", 1, "c", 5, "d", 4, "e", 5),
//                Map.of("d", 4, "e", 5, "a", 22, "b", 11, "c", 51)
//        );
//        List<Map<String, Integer>> result = mapKey(keys, collections);
//        result.forEach(System.out::println);



//        List<Map<String, Integer>> arr = new ArrayList<>(Arrays.asList(
//                new HashMap<>(Map.of("id", 10, "order", 0)),
//                new HashMap<>(Map.of("id", 12, "order", 1)),
//                new HashMap<>(Map.of("id", 9,  "order", 2)),
//                new HashMap<>(Map.of("id", 11, "order", 3))
//        ));
//
//        switchOrder(arr, 9, 1);
//        arr.forEach(System.out::println);






//        List<Map<String, Object>> arr = List.of(
//                Map.of("a", 2, "b", 10),
//                Map.of("a", 12, "c", 11),
//                Map.of("a", 8, "b", 14, "d", 20),
//                Map.of("a", "8")
//        );
//
//        Map<String, Integer> result = sumAll(arr);
//        System.out.println(result);






//        Map<String, String> params = Map.of("name", "Jonny");
//
//        generateFileFromTemplate("C:\\Users\\NGUYEN MANH CUONG\\Downloads\\template.txt",
//                               "C:\\Users\\NGUYEN MANH CUONG\\Downloads\\output.txt",
//                               params);



        Map<String, String> params = new HashMap<>();
        params.put("title", "Search of skill");
        params.put("pageTitle", "Home page");
        params.put("content", "asdaksd aida jsdia jsd asod sdjasdoa.");

        generateFileFromTemplate("C:\\Users\\NGUYEN MANH CUONG\\Downloads\\template.html",
                               "C:\\Users\\NGUYEN MANH CUONG\\Downloads\\output.html",
                               params);


        scanner.close();
    }



//    5.1
    public static int[] inputIntArray(Scanner scanner) {
        System.out.print("Nhập: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[n - 1 - i] = arr[i];
        }
        return result;
    }


//    5.2

    public static String[] inputStringArray(Scanner scanner) {
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        System.out.println("Nhập phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        return arr;
    }

    public static <T> List<List<T>> chunk(T[] arr, int size) {
        List<List<T>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += size) {
            int end = Math.min(arr.length, i + size);
            List<T> sublist = new ArrayList<>();
            for (int j = i; j < end; j++) {
                sublist.add(arr[j]);
            }
            result.add(sublist);
        }
        return result;
    }

    // 5.3
    public static int[] uniq(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    // 5.4
    public static List<Map<String, Integer>> uniq(List<Map<String, Integer>> input) {
        Set<String> seen = new HashSet<>();
        List<Map<String, Integer>> result = new ArrayList<>();

        for (Map<String, Integer> obj : input) {
            String normalized = normalize(obj);
            if (!seen.contains(normalized)) {
                seen.add(normalized);
                result.add(obj);
            }
        }

        return result;
    }
    private static String normalize(Map<String, Integer> map) {
        return new TreeMap<>(map).toString();
    }



//    5.5
    public static Map<Integer, List<Map<String, Integer>>> groupBy(List<Map<String, Integer>> input, String field) {
        Map<Integer, List<Map<String, Integer>>> grouped = new HashMap<>();

        for (Map<String, Integer> obj : input) {
            Integer key = obj.get(field);
            grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(obj);
        }

        return grouped;
    }



//    5.6
    public static String trimAll(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }




//    5.7
    public static List<Map<String, Integer>> mapKey(List<String> keys, List<Map<String, Integer>> collections) {
        return collections.stream()
                .map(obj -> {
                    Map<String, Integer> filtered = new LinkedHashMap<>();
                    for (String key : keys) {
                        if (obj.containsKey(key)) {
                            filtered.put(key, obj.get(key));
                        }
                    }
                    return filtered;
                })
                .collect(Collectors.toList());
    }




//    5.8

    public static void switchOrder(List<Map<String, Integer>> arr, int targetId, int newOrder) {
        // Sort theo order
        arr.sort(Comparator.comparingInt(o -> o.get("order")));


        Map<String, Integer> target = null;
        for (Map<String, Integer> obj : arr) {
            if (obj.get("id") == targetId) {
                target = obj;
                break;
            }
        }

        if (target == null) {
            System.out.println("Không tìm thấy phần tử có id = " + targetId);
            return;
        }

        if (newOrder < 0) newOrder = 0;
        if (newOrder >= arr.size()) newOrder = arr.size() - 1;

// đúng vị trí
        if (target.get("order") == newOrder) return;

        // Xoá target khỏi danh sách
        arr.remove(target);
        arr.add(newOrder, target);

        // Cập nhật lại giá trị order
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).put("order", i);
        }
    }



//    5.9
    public static Map<String, Integer> sumAll(List<Map<String, Object>> input) {
        Map<String, Integer> result = new HashMap<>();

        for (Map<String, Object> obj : input) {
            //get key, value for each map
            for (Map.Entry<String, Object> entry : obj.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (value instanceof Number) {
                    //get value if it has type Number
                    int num = ((Number) value).intValue();
                    result.put(key, result.getOrDefault(key, 0) + num);
                }
            }
        }

        return result;
    }




//    5.10 - A
    public static void generateFileFromTemplate(String templatePath, String outputPath, Map<String, String> params) throws IOException {
        //  Đọc nội dung file template
        String content = new String(Files.readAllBytes(Paths.get(templatePath)));

        // Thay thế từng {{key}} bằng value tương ứng
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String placeholder = "\\{\\{" + entry.getKey() + "\\}\\}";
            content = content.replaceAll(placeholder, entry.getValue());
        }


        Files.write(Paths.get(outputPath), content.getBytes());
    }

}
