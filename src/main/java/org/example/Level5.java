package org.example;

import java.util.*;

public class Level5 {
    public static void main(String[] args) {
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




        List<Map<String, Integer>> input = new ArrayList<>();

        Map<String, Integer> obj1 = new HashMap<>();
        obj1.put("x", 1);
        obj1.put("y", 2);

        Map<String, Integer> obj2 = new HashMap<>();
        obj2.put("x", 2);
        obj2.put("y", 1);

        Map<String, Integer> obj3 = new HashMap<>();
        obj3.put("y", 2);
        obj3.put("x", 1);

        input.add(obj1);
        input.add(obj2);
        input.add(obj3);

        List<Map<String, Integer>> result = uniq(input);

        for (Map<String, Integer> map : result) {
            System.out.println(map);
        }






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
}
