package org.example;

import java.util.*;

public class Level3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndPrintSecondSmallest(scanner);
//        inputAndPrintMaxDifference(scanner);
//        inputAndPrintLISLength(scanner);
//        inputAndPrintSmallestUnreachableSum(scanner);
//        inputAndPrintMedianOfCombinedLists(scanner);
//        inputAndPrintPairCount(scanner);
//        inputAndPrintLargestOverlap(scanner);
//        inputAndPrintLongestPalindromeLength(scanner);
//        inputAndPrintMaxNonAdjacentSum(scanner);
//        inputAndSortStringsByUniqueChars(scanner);
        scanner.close();
    }


//    Level 3, 3.1: Write a program that takes a list of numbers as input and returns the second smallest number in the list.
    public static void inputAndPrintSecondSmallest(Scanner scanner) {
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal list: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        int secondSmallest = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > secondSmallest) {
                secondSmallest = numbers[i];
                break;
            }
        }

        System.out.println("The second smallest number is: " + secondSmallest);
    }

    // Level 3, 3.2: Write a program that takes a list of integers as input and returns the maximum difference between any two elements in the list.
    public static void inputAndPrintMaxDifference(Scanner scanner) {
        System.out.print("Nhập số lượng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int maxDiff = max - min;

        System.out.println("Hiệu lớn nhất là: " + maxDiff);
        System.out.println("(Được tính từ " + max + " - " + min + ")");
    }

//    Level 3, 3.3: Write a program that takes a list of integers as input and returns the longest increasing subsequence of the numbers
    public static void inputAndPrintLISLength(Scanner scanner) {
        System.out.print("Nhập số lượng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1;
        int endIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        endIndex = i;
                    }
                }
            }
        }

        System.out.println("Độ dài của chuỗi con tăng dần dài nhất: " + maxLength);
    }

//    Level 3, 3.5: Write a program that takes a list of numbers as input and returns the smallest positive integer that cannot be represented as the sum of any subset of the list.
    public static void inputAndPrintSmallestUnreachableSum(Scanner scanner) {
        System.out.print("Nhập: ");
        String[] parts = scanner.nextLine().split("\\s+");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(numbers);
        int res = 1;
        for (int num : numbers) {
            if (num > res) {
                break;
            }
            res += num;
        }

        System.out.println("result: " + res);
    }

//    Level 3, 3.6: Write a program that takes two lists of integers as input and returns the median of the combined list.
    public static void inputAndPrintMedianOfCombinedLists(Scanner scanner) {
        System.out.print("List 1: ");
        int[] list1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("List 2: ");
        int[] list2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] combined = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, combined, 0, list1.length);
        System.arraycopy(list2, 0, combined, list1.length, list2.length);

        Arrays.sort(combined);

        double median;
        int n = combined.length;
        if (n % 2 == 0) {
            median = (combined[n / 2 - 1] + combined[n / 2]) / 2.0;
        } else {
            median = combined[n / 2];
        }

        System.out.println("Median: " + median);
    }


//    Level 3, 3.8: Write a program that takes a list of numbers as input and returns the number of distinct pairs of numbers in the list that sum up to a target value.
    public static void inputAndPrintPairCount(Scanner scanner) {
        System.out.print("Nhập các số nguyên: ");
        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.print("Nhập giá trị target: ");
        int target = scanner.nextInt();

        Set<Integer> seen = new HashSet<>();
        Set<String> pairs = new HashSet<>();

        for (int num : numbers) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                pairs.add(a + "," + b);
            }

            seen.add(num);
        }

        System.out.println("Số cặp phân biệt có tổng bằng " + target + ": " + pairs.size());
    }

//    Level 3, 3.4: Write a program that takes a list of strings as input and returns the two strings with the largest overlap of characters.
    public static void inputAndPrintLargestOverlap(Scanner scanner) {
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
        System.out.println(result[0] + ", " + result[1]);
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


//    Level 3, 3.7: Write a program that takes a string as input and returns the length of the longest palindrome that can be formed by rearranging the characters in the string.
    public static void inputAndPrintLongestPalindromeLength(Scanner scanner) {
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        int result = findLongestPalindrome(input);
        System.out.println("palindrome dài nhất: " + result);
    }

    public static int findLongestPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "");

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length += 1;
        }

        return length;
    }

//    Level 3, 3.9: Write a program that takes a list of integers as input and returns the maximum sum of any contiguous subarray within the list, with the constraint that no two adjacent elements in the subarray can be selected
    public static void inputAndPrintMaxNonAdjacentSum(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int result = findMaxSum(arr);
        System.out.println("Tổng lớn nhất của dãy con: " + result);
    }

    public static int findMaxSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];

        int include = arr[0];
        int exclude = 0;

        for (int i = 1; i < arr.length; i++) {
            int temp = include;
            include = arr[i] + exclude;
            exclude = Math.max(temp, exclude);
        }

        return Math.max(include, exclude);
    }

//    Level 3, 3.10: Write a program that takes a list of strings as input and returns the list sorted by the number of distinct characters in each string, with the shortest strings appearing first.
    public static void inputAndSortStringsByUniqueChars(Scanner scanner) {
        List<String> danhSach = new ArrayList<>();

        System.out.print("Nhập số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập chuỗi " + (i + 1) + ": ");
            danhSach.add(scanner.nextLine());
        }

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
