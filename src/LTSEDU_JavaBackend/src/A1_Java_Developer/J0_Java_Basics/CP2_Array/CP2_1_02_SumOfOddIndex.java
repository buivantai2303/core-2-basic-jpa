package LTSEDU_JavaBackend.src.A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Random;
import java.util.Scanner;

public class CP2_1_02_SumOfOddIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int num = scanner.nextInt();

        System.out.println("----------------------");

        int[] arr = new int[num];

        for (int i = 0; i < num; i++){
            Random rand = new Random();
            int ranNum = rand.nextInt(100);
            arr[i] = ranNum;
        }

        System.out.print("Array full: " );
        for (int i = 0; i < num; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n----------------------");
        System.out.print("Odd index in array: ");

        for (int i = 0; i < num; i++){
            if ( i % 2 == 1){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n----------------------");
        System.out.print("Sum of odd index in array: ");

        int sum = 0;

        for (int i = 0; i < num; i++){
            if ( i % 2 == 1){
                sum += arr[i];
            }
        }

        System.out.println("Sum: " + sum);

    }
}
