package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA2_1_22_LengthArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of string array: ");
        int len = scanner.nextInt();
        String[] arr = new String[len];
        scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": " );
            arr[i] = scanner.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].length() > arr[i].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}
