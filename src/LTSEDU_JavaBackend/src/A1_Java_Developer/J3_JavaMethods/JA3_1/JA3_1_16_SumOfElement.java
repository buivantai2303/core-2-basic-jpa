package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_16_SumOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer array: ");
        String[] string = scanner.nextLine().split("\\s+");

        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }

        System.out.println("Your sum: " + sumCalculator(arr));
    }

    static int sumCalculator(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        
        return sum;
    }
}
