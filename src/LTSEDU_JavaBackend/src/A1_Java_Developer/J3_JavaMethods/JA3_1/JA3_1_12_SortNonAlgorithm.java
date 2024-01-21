package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JA3_1_12_SortNonAlgorithm {
    public static void main(String[] args) {
        export(sort(input()));
        export(sortNonAlgorithm(input()));
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your array: ");
        String[] string = scanner.nextLine().split("\\s+");
        int[] arr = new int[string.length];

        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }
        return arr;
    }

    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    static int[] sortNonAlgorithm(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr){
            list.add(i);
        }
        Collections.sort(list);

        int[] sortedArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            sortedArr[i] = list.get(i);
        }
        return sortedArr;
    }

    static void export (int[] arr) {
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
