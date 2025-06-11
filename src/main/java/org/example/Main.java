package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("List 1: ");
        int[] list1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Input second list
        System.out.print("List 2: ");
        int[] list2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Combine the two lists
        int[] combined = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, combined, 0, list1.length);
        System.arraycopy(list2, 0, combined, list1.length, list2.length);

        // Sort the combined list
        Arrays.sort(combined);


        double median;
        int n = combined.length;
        if (n % 2 == 0) {
            median = (combined[n / 2 - 1] + combined[n / 2]) / 2.0;
        } else {
            median = combined[n / 2];
        }

//        System.out.println("Combined sorted list: " + Arrays.toString(combined));
        System.out.println("Median: " + median);

        scanner.close();
    }
}