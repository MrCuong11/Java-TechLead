package org.example;

import java.util.*;

public class Level4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        inputAndPrintBubbleSortIterations(scanner);
//        inputAndPrintPairCountWithTarget(scanner);
//        inputAndPrintLongestCommonSubstringLength(scanner);
//        inputAndPrintMaxSumWithGap(scanner);
//        inputAndPrintLongestCommonSubstring(scanner);
//        inputAndPrintMaxProductOfThree(scanner);
//        inputAndSortStringsByDistinctWords(scanner);
//        inputAndPrintSmallestMissingSum(scanner);
//        inputAndPrintLISWithDiffOne(scanner);
//        inputAndPrintLargestSubstringOverlap(scanner);
        scanner.close();
    }

//    Level 4, 4.1: Write a program that takes a list of integers as input and returns the minimum number of moves required to sort the list in ascending order using bubble sort
    public static void inputAndPrintBubbleSortIterations(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int soLanLap = demBubbleSort(arr);

        System.out.println("Số lần lặp : " + soLanLap);
    }

    public static int demBubbleSort(int[] arr) {
        int[] temp = arr.clone();
        int n = temp.length;
        int soLanLap = 0;
        boolean daHoanThanh;

        for (int i = 0; i < n - 1; i++) {
            daHoanThanh = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                    daHoanThanh = false;
                }
            }
            soLanLap++;
            if (daHoanThanh) {
                return soLanLap;
            }
        }
        return soLanLap;
    }

//    Level 4, 4.2: Write a program that takes a list of integers as input and returns the number of distinct subsequences of the list that sum up to a target value.
    public static void inputAndPrintPairCountWithTarget(Scanner scanner) {
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Mảng phải có ít nhất 1 phần tử.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = scanner.nextInt();

        int count = countSubsequencesWithSum(arr, target);
        System.out.println("Số dãy con có tổng bằng " + target + ": " + count);
    }

    // Đệ quy đếm số dãy con có tổng bằng target
    public static int countSubsequencesWithSum(int[] arr, int target) {
        return count(arr, target, 0);
    }

    private static int count(int[] arr, int target, int index) {
        if (target == 0) return 1;
        if (index == arr.length) return 0;

        // Chạy sâu vào nhánh include, sau đó sẽ chạy nhánh exclude
        int include = count(arr, target - arr[index], index + 1);
        int exclude = count(arr, target, index + 1);

        return include + exclude;
    }

//    Level 4, 4.3: Write a program that takes a list of strings as input and returns the length of the longest substring that appears in every string in the list.
    public static void inputAndPrintLongestCommonSubstringLength(Scanner scanner) {
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
        String chuoiNgan = strings[0];
        for (String s : strings) {
            if (s.length() < chuoiNgan.length()) {
                chuoiNgan = s;
            }
        }

        for (int len = chuoiNgan.length(); len > 0; len--) {
            for (int i = 0; i <= chuoiNgan.length() - len; i++) {
                String sub = chuoiNgan.substring(i, i + len);
                boolean timThay = true;
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

//    Level 4, 4.4: Write a program that takes a list of integers as input and returns the maximum sum of any contiguous subarray within the list, with the additional constraint that the subarray must not contain any consecutive integers

    public static void inputAndPrintMaxSumWithGap(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Tổng lớn nhất: " + timTongLonNhat(arr));
    }

    public static int timTongLonNhat(int[] arr) {
        int tongMax = 0;
        for (int i = 0; i < arr.length; i++) {
            int tong = arr[i];
            tongMax = Math.max(tongMax, tong);

            for (int j = i + 2; j < arr.length; j++) {
                tong += arr[j];
                tongMax = Math.max(tongMax, tong);
                j++;
            }
        }
        return tongMax;
    }

//    Level 4, 4.5: Write a program that takes a list of strings as input and returns the length of the longest common substring of the strings.

    public static void inputAndPrintLongestCommonSubstring(Scanner scanner) {
        System.out.print("Nhập số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        int result = longestCommonSubstring(strings);
        System.out.println("Chuỗi con chung dài nhất: " + result);
    }

    public static int longestCommonSubstring(String[] strings) {
        if (strings.length == 0) return 0;

        String base = strings[0];
        int maxLength = 0;

        for (int i = 0; i < base.length(); i++) {
            for (int j = i + 1; j <= base.length(); j++) {
                String sub = base.substring(i, j);
                boolean isCommon = true;
                for (int k = 1; k < strings.length; k++) {
                    if (!strings[k].contains(sub)) {
                        isCommon = false;
                        break;
                    }
                }
                if (isCommon) {
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }

        return maxLength;
    }


//    Level 4, 4.6: Write a program that takes a list of integers as input and returns the maximum product of any three distinct elements in the list.

    public static void inputAndPrintMaxProductOfThree(Scanner scanner) {
        System.out.print("Nhập: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maxProductOfThree(arr);
        System.out.println("Tích lớn nhất của 3 phần tử: " + result);
    }

    public static int maxProductOfThree(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int option1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int option2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(option1, option2);
    }


//    Level 4, 4.7: Write a program that takes a list of strings as input and returns the list sorted by the number of distinct words in each string, with the longest strings appearing first.

    public static void inputAndSortStringsByDistinctWords(Scanner scanner) {
        System.out.print("Nhập số chuỗi: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<String> strings = new ArrayList<>();
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

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


//  Level 4, 4.8  Write a program that takes a list of integers as input and returns the smallest positive integer that cannot be represented as the sum of any subset of the list, with the additional constraint that no subset can contain any consecutive integers.

    public static void inputAndPrintSmallestMissingSum(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = findSmallestMissing(nums);
        System.out.println(result);
    }

    public static int findSmallestMissing(int[] nums) {
        Arrays.sort(nums);
        TreeSet<Integer> sums = new TreeSet<>();
        sums.add(0);

        for (int num : nums) {
            Set<Integer> newSums = new HashSet<>();
            for (int sum : sums) {
                if (!sums.contains(sum + num - 1) && !sums.contains(sum + num + 1)) {
                    newSums.add(sum + num);
                }
            }
            sums.addAll(newSums);
        }

        int result = 1;
        while (sums.contains(result)) result++;
        return result;
    }


//    Level 4, 4.9 Write a program that takes a list of integers as input and returns the length of the longest increasing subsequence of the numbers, with the additional constraint that no two adjacent elements in the subsequence can differ by more than 1.
    public static void inputAndPrintLISWithDiffOne(Scanner scanner) {
        System.out.print("Nhập số lượng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = longestIncreasingSubsequenceDiffOne(arr);
        System.out.println("Độ dài LIS: " + result);
    }

    public static int longestIncreasingSubsequenceDiffOne(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && arr[i] - arr[j] <= 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }


// Level 4, 4.10: Write a program that takes a list of strings as input and returns the two strings with the largest overlap of substrings, where the substrings must be at lea	st k characters long (where k is a parameter to the function).

    public static void inputAndPrintLargestSubstringOverlap(Scanner scanner) {
        System.out.print("Nhập số chuỗi: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        System.out.print("Nhập giá trị k: ");
        int k = Integer.parseInt(scanner.nextLine());

        String[] result = findLargestSubstringOverlap(strings, k);

        System.out.println("Hai chuỗi có nhiều substring trùng nhau nhất (độ dài >= " + k + "):");
        System.out.println(result[0] + ", " + result[1]);
    }

    public static String[] findLargestSubstringOverlap(String[] strings, int k) {
        int maxOverlap = 0;
        String[] result = new String[2];

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                int overlap = countCommonSubstrings(strings[i], strings[j], k);
                if (overlap > maxOverlap) {
                    maxOverlap = overlap;
                    result[0] = strings[i];
                    result[1] = strings[j];
                }
            }
        }
        return result;
    }

    public static int countCommonSubstrings(String s1, String s2, int k) {
        Set<String> subs1 = new HashSet<>();
        Set<String> subs2 = new HashSet<>();

        for (int i = 0; i <= s1.length() - k; i++) {
            subs1.add(s1.substring(i, i + k));
        }
        for (int i = 0; i <= s2.length() - k; i++) {
            subs2.add(s2.substring(i, i + k));
        }

        subs1.retainAll(subs2);
        return subs1.size();
    }

}

