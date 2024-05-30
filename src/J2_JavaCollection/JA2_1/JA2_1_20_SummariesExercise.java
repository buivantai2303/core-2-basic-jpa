package J2_JavaCollection.JA2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JA2_1_20_SummariesExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your length of array: ");
//        int len = scanner.nextInt();
//
//        int[] arr = new int[len];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }

        int a[] = {1,4,2,6,3,9,5,7};

        System.out.println("1. Display array: " + Arrays.toString(displayArr(a)));
        System.out.println("2. Display odd number in array: " + displayOddElement(a));
        System.out.println("3. Display prime number: " + displayOddPrime(a));
        System.out.println("4. Display prime number in even position: "  + displayMultipleElement(a));

    }

    public static int[] displayArr(int[] arr) {
        return arr;
    }

    public static List displayOddElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 1) {
                list.add(j);
            }
        }
        return list;
    }

    public static List displayOddPrime(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (PrimeNumCheck(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean PrimeNumCheck(int x) {
        if (x <= 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int displayMultipleElement(int[] arr) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (PrimeNumCheck(arr[i])) {
                    result *= arr[i];
                }
            }
        }
        return result;
    }
}
