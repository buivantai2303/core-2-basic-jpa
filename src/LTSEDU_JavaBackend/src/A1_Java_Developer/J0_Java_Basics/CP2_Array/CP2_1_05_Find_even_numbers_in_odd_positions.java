package LTSEDU_JavaBackend.src.A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Scanner;

public class CP2_1_05_Find_even_numbers_in_odd_positions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("- Element " + (i+1) + " = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Even numbers in odd positions: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1){
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
