package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_02_DisplayFunction {
    public static void main(String[] args) {
        System.out.print("Enter your length of array: ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        displayArray(arr);
    }

    static void displayArray(int[] arr) {
        System.out.print("1. Display array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
