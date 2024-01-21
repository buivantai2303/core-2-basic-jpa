package A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Random;
import java.util.Scanner;

public class CP2_2_01_BubbleShort {
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

        System.out.print("Original array: ");
        DisplayARR(arr);



        System.out.print("\nBubble sorted array: ");
        DisplayARR(BubbleSort(arr));

    }


    public static int[] BubbleSort (int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void DisplayARR(int[] arr) {
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
