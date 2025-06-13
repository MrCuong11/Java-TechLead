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

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("target: ");
        int target = scanner.nextInt();

        System.out.println("Kết quả: " + demCapSo(arr, target));
    }

    public static int demCapSo(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) count++;
            }
        }
        return count;
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

}

