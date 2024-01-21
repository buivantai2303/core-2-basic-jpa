package LTSEDU_JavaBackend.src.A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.util.Random;
import java.util.Scanner;

public class CP2_1_03_ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        String str;

        System.out.print("Enter your character string: ");
        str = scanner.nextLine();
        System.out.print("Enter your array length: ");
        length = scanner.nextInt();


        int[] arr = new int[length];

        for (int i = 0; i < length; i++){
            Random random = new Random();
            int ranNum = random.nextInt(100);
            arr[i] = ranNum;
        }

        System.out.print("\n- Default array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n- Reverse array: ");
        for (int i = 0; i < length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
            System.out.print(arr[i] + " ");;
        }


        String[] arr_2 = str.split("");

        System.out.print("\n- Convert string: ");
        for (int i = arr_2.length - 1; i >= 0; i--){
            System.out.print(arr_2[i]);;
        }

    }

}
