package A1_Java_Developer.J2_JavaCollection;

import java.util.Scanner;

public class JA2_1_18_MangDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length of array: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[len - i - 1]){
                count++;
            } else {
                count = 0;
            }
        }

        if (count >= arr.length / 2) {
            System.out.println("La mang doi xung");
        } else {
            System.out.println("Khong la mang doi xung");
        }
    }
}
