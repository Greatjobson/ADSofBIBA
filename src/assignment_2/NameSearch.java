//package assignment_2;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
//
//public class NameSearch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Генерируем 100 имён
//        MyArrayList<String> names = new MyArrayList<>();
//
//        // ОБЯЗАТЕЛЬНО сортируем для бинарного поиска
//        names.sort();
//
//        // Выводим все имена
//        System.out.println("Available names:");
//        System.out.println(names.toString());
//
//        System.out.println("Maximum number of names: "+ names.size());
//        // Запрос имени
//        System.out.print("Enter the name you want to search: ");
//        String target = scanner.nextLine();
//
//        // Выбор способа поиска
//        System.out.print("Choose search method: 1 - Linear Search, 2 - Binary Search: ");
//        int method = scanner.nextInt();
//
//        int index = -1; // индекс найденного элемента
//        long startTime = System.nanoTime(); // старт таймера
//
//        if (method == 1) {
//            index = linearSearch(names, target);
//        } else if (method == 2) {
//            index = binarySearch(names, target);
//        } else {
//            System.out.println("Invalid search method selected.");
//            return;
//        }
//
//        long endTime = System.nanoTime(); // конец таймера
//
//        if (index != -1) {
//            System.out.println("Name found at index: " + index);
//        } else {
//            System.out.println("Name not found.");
//        }
//        System.out.println("Search took " + (endTime - startTime) + " nanoseconds.");
//    }
//
//    // Линейный поиск
//    private static <T> int linearSearch(MyArrayList<T> array, String target) {
//        for (int i = 0; i < array.size(); i++) {
//            if (array.get(i).equals(target)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    // Бинарный поиск
//    private static int binarySearch(String[] array, String target) {
//        int left = 0;
//        int right = array.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            int comparison = target.compareTo(array[mid]);
//            if (comparison == 0) {
//                return mid;
//            } else if (comparison < 0) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    // Генератор случайных имён
//    public static <T> generateNames(int size) {
//        String[] baseNames = {"Anna", "Ben", "Carl", "Diana", "Ethan", "Fiona", "George", "Hannah", "Ivan", "Julia",
//                "Kevin", "Laura", "Mike", "Nina", "Oscar", "Paula", "Quinn", "Ryan", "Sophia", "Tom",
//                "Uma", "Victor", "Wendy", "Xander", "Yara", "Zoe"};
//
//        Random random = new Random();
//        MyArrayList<T> names = new MyArrayList<>();
//
//        for (int i = 0; i < size; i++) {
//            names.add((T)  (baseNames[random.nextInt(baseNames.length)] + i)); // Добавляем индекс для уникальности
//        }
//
//        return names;
//    }
//}
//
