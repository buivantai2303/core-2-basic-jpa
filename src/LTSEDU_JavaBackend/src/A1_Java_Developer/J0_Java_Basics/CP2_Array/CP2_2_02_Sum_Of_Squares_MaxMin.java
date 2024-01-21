package LTSEDU_JavaBackend.src.A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Random;
import java.util.Scanner;

public class CP2_2_02_Sum_Of_Squares_MaxMin {
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
        DisplayArr(arr);
        System.out.print("\nSorted array: ");
        DisplayArr(BubbleSort(arr));
        System.out.print("\nSum of squares max and min: ");
        int sumOfSquares = DisplaySum(BubbleSort(arr));
        System.out.print(sumOfSquares);

    }

    public static int[] BubbleSort (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    public static void DisplayArr (int [] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int DisplaySum(int[] arr) {
        return (arr[0]) * (arr[0]) +  (arr[arr.length - 1] * (arr[arr.length - 1]));
    }


}
