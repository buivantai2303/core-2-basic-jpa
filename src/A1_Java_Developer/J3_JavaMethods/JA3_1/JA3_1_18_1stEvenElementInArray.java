package A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_18_1stEvenElementInArray {
    public static void main(String[] args) {
        int result = input();
        System.out.println("First even element: " + result);
    }

    static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer element: ");
        String[] string = scanner.nextLine().split("\\s+");

        int[] arr = new int[string.length];

        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }

        return findEven(arr);
    }

    static int findEven(int[] arr) {
        int firstElement = 0;
        for (int i : arr) {
            if (i % 2 == 0){
                firstElement = i;
                break;
            }
        }
        return firstElement;
    }
}
