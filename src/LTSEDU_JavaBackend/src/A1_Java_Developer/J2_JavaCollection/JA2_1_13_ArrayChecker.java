package A1_Java_Developer.J2_JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JA2_1_13_ArrayChecker {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 5, 6, 7, 10);
        List<Integer> arr2 = Arrays.asList(9, 7, 4, 3, 2, 1);
        List<Integer> arr3 = Arrays.asList(1, 7, 2, 6, 3, 9);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your length of array: ");
        int Len = scanner.nextInt();

        List<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < Len; i++) {
            System.out.print("Element [" + (i + 1) + "]: ");
            listInt.add(scanner.nextInt());
        }

        ListChecker(listInt);
        ListChecker(arr1);
        ListChecker(arr2);
        ListChecker(arr3);
    }

    public static void ListChecker(List<Integer> arr) {
        int increasingCount = 0;
        int decreasingCount = 0;


        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                increasingCount++;
            } else if (arr.get(i) < arr.get(i - 1)){
                decreasingCount++;
            }
        }

        if (increasingCount == arr.size() - 1) {
            System.out.println("Mảng tăng");
        } else if (decreasingCount == arr.size() - 1) {
            System.out.println("Mảng giảm");
        } else {
            System.out.println("Mảng hỗn độn");
        }

    }
}
