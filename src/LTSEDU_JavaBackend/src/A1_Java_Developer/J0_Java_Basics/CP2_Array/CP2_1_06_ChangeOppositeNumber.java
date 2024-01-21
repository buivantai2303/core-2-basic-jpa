package LTSEDU_JavaBackend.src.A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Scanner;

public class CP2_1_06_ChangeOppositeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length of string number: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("- Element " + (i+1) + " = ");
            arr[i] = scanner.nextInt();
        }


        System.out.println("\nDefault string: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < length; i++) {
            arr[i] = arr[i] * (-1);
        }

        System.out.println("\n- New reversed string: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
