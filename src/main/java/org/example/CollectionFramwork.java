package org.example;

import java.util.*;

public class CollectionFramwork {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        HashSet<String> countries = new HashSet<>();
        HashMap<String, Integer> people = new HashMap<>();

//        ArrayList
//        numbers = inputNumbers(scanner);
//        displayNumbers(numbers);
//        sumNumbers(numbers);
//        findMaxMin(numbers);
//        removeElement(numbers, scanner);
//        checkExistence(numbers, scanner);



//        HashSet
//        addCountries(countries);
//        displayCountries(countries);
//        checkCountryExistence(countries, scanner);
//        removeCountry(countries, scanner);
//        countCountries(countries);



//        HashMap
//        addPeople(people, scanner);
//        displayNames(people);
//        findAgeByName(people, scanner);
//        removePerson(people, scanner);
//        checkPersonExists(people, scanner);



//        ArrayList
//        inputNumbers(scanner);
//        sortAscending(numbers);
//        sortDescending(numbers);






//   Bai 7
//        HashMap<String, List<Integer>> studentScores = new HashMap<>();
//
//        studentScores.put("A", Arrays.asList(8, 9, 7));
//        studentScores.put("B", Arrays.asList(6, 7, 5, 8));
//        studentScores.put("C", Arrays.asList(9, 10, 10));
//
//        calculateAndPrintAverages(studentScores);





        scanner.close();
    }

//  Bai 1
    // 1. Nhập số lượng và giá trị các phần tử
    public static ArrayList<Integer> inputNumbers(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử:");
        int n = scanner.nextInt();
        System.out.println("Nhập các số:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
    // 2. Hiển thị danh sách
    public static void displayNumbers(ArrayList<Integer> list) {
        System.out.println("Các phần tử trong ArrayList: " + list);
    }
    // 3. Tính tổng
    public static void sumNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Tổng các phần tử: " + sum);
    }
    // 4. Tìm max/min
    public static void findMaxMin(ArrayList<Integer> list) {
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    // 5. Xóa phần tử cụ thể
    public static void removeElement(ArrayList<Integer> list, Scanner scanner) {
        System.out.println("Nhập phần tử cần xóa:");
        int toRemove = scanner.nextInt();
        if (list.remove(Integer.valueOf(toRemove))) {
            System.out.println("Đã xóa " + toRemove);
        } else {
            System.out.println("Không tìm thấy phần tử cần xóa.");
        }
        System.out.println("Danh sách sau khi xóa: " + list);
    }
    // 6. Kiểm tra tồn tại phần tử
    public static void checkExistence(ArrayList<Integer> list, Scanner scanner) {
        System.out.println("Nhập phần tử cần kiểm tra:");
        int toCheck = scanner.nextInt();
        if (list.contains(toCheck)) {
            System.out.println(toCheck + " có tồn tại trong danh sách.");
        } else {
            System.out.println(toCheck + " không tồn tại trong danh sách.");
        }
    }




    //Bai 2
    // Thêm quốc gia vào HashSet
    public static void addCountries(HashSet<String> countries) {
        countries.add("Vietnam");
        countries.add("Japan");
        countries.add("France");
        countries.add("USA");
    }
    // Hiển thị danh sách quốc gia
    public static void displayCountries(HashSet<String> countries) {
        System.out.println("Danh sách quốc gia:");
        for (String country : countries) {
            System.out.println(" " + country);
        }
    }
    // Kiểm tra một quốc gia có tồn tại không
    public static void checkCountryExistence(HashSet<String> countries, Scanner scanner) {
        System.out.print("\nNhập tên quốc gia để kiểm tra: ");
        String checkCountry = scanner.nextLine();
        if (countries.contains(checkCountry)) {
            System.out.println(checkCountry + " có trong danh sách.");
        } else {
            System.out.println(checkCountry + " không có trong danh sách.");
        }
    }
    // Xóa một quốc gia
    public static void removeCountry(HashSet<String> countries, Scanner scanner) {
        System.out.print("\nNhập tên quốc gia để xóa: ");
        String removeCountry = scanner.nextLine();
        if (countries.remove(removeCountry)) {
            System.out.println(removeCountry + " đã được xóa.");
        } else {
            System.out.println(removeCountry + " không có trong danh sách.");
        }
    }
    // Đếm số lượng quốc gia
    public static void countCountries(HashSet<String> countries) {
        System.out.println("Số lượng quốc gia: " + countries.size());
    }



//Bai 3
// Thêm người vào HashMap
    public static void addPeople(HashMap<String, Integer> people, Scanner scanner) {
        System.out.print("Nhập số người cần thêm: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên người thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi của " + name + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();

            people.put(name, age);
        }
    }

    // Hiển thị tên tất cả mọi người
    public static void displayNames(HashMap<String, Integer> people) {
        System.out.println("\nDanh sách tên người:");
        for (String name : people.keySet()) {
            System.out.println(" " + name);
        }
    }

    // Tìm tuổi theo tên
    public static void findAgeByName(HashMap<String, Integer> people, Scanner scanner) {
        System.out.print("\nNhập tên người: ");
        String name = scanner.nextLine();
            if (people.containsKey(name)) {
                System.out.println(name + " có tuổi là: " + people.get(name));
            } else {
                System.out.println("Không tìm thấy " + name);
            }
    }

    // Xóa một người
    public static void removePerson(HashMap<String, Integer> people, Scanner scanner) {
        System.out.print("\nNhập tên người để xóa: ");
        String name = scanner.nextLine();
        if (people.remove(name) != null) {
            System.out.println("Đã xóa " + name + " khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy " + name + " để xóa.");
        }
    }

    // Kiểm tra người có tồn tại không
    public static void checkPersonExists(HashMap<String, Integer> people, Scanner scanner) {
        System.out.print("\nNhập tên người để kiểm tra: ");
        String name = scanner.nextLine();
        if (people.containsKey(name)) {
            System.out.println(name + " có trong danh sách.");
        } else {
            System.out.println(name + " không có trong danh sách.");
        }
    }



    // Bai 4
    public static void sortAscending(ArrayList<Integer> list) {
        ArrayList<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        System.out.println("Danh sách tăng dần: " + sorted);
    }
    public static void sortDescending(ArrayList<Integer> list) {
        ArrayList<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted, Collections.reverseOrder());
        System.out.println("Danh sách giảm dần: " + sorted);
    }




    // Bai 5
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int complement = target - num;
            if(numMap.containsKey(complement)){
                return new int []{numMap.get(complement), i};
            }
            numMap.put(num, i);
        }
        return null;
    }

//    Bai 6

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }



    //bai 7
    public static void calculateAndPrintAverages(HashMap<String, List<Integer>> scores) {

        for (Map.Entry<String, List<Integer>> entry : scores.entrySet()) {
            String student = entry.getKey();
            List<Integer> marks = entry.getValue();

            double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.printf(student, average);
        }
    }




}
