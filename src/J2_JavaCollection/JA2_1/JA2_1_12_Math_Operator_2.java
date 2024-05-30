package J2_JavaCollection.JA2_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class JA2_1_12_Math_Operator_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }

        System.out.print("- Default array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Integer[] sortedArray = sortArray(arr);
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));
    }

    public static Integer[] sortArray(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(a -> a % 2 == 0 ? Integer.MAX_VALUE : a))
                .toArray(Integer[]::new);
    }
}


