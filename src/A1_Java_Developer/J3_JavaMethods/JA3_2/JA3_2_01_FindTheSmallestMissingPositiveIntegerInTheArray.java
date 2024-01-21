package A1_Java_Developer.J3_JavaMethods.JA3_2;

import java.util.Scanner;

public class JA3_2_01_FindTheSmallestMissingPositiveIntegerInTheArray {
    public static void main(String[] args) {
        int result = inputArray();
        System.out.println("The smallest missing positive integer is: " + result);
    }

    static int inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer array: ");
        String[] string = scanner.nextLine().split("\\s+");
        int[] arr = new int[string.length];

        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }

        return sortArray(arr);
    }

    static int sortArray (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return getIntegerMissing(arr);
    }


    static int getIntegerMissing(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
