package LTSEDU_JavaBackend.src.A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Random;
import java.util.Scanner;

public class CP2_2_06_Sorting_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length of array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int randNum = random.nextInt(100);
            arr[i] = randNum;
        }

        System.out.print("Default array: ");
        int temp_2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp_2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp_2;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.print("\nEven array: ");
        for (int e = 0; e < arr.length; e++) {
            if (arr[e] % 2 == 0) {
                System.out.print(arr[e] + " ");
            }
        }

    }
}
