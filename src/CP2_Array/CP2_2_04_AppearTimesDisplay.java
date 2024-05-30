package CP2_Array;

import java.util.Random;
import java.util.Scanner;

public class CP2_2_04_AppearTimesDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length of array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int randNum = random.nextInt(10);
            arr[i] = randNum;
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length - 1; j++) {

            }
        }

//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                count++;
//            } else {
//                if (count > 0) {
//                    System.out.println("'" + arr[i] + "' appears " + (count + 1) + " times consecutively");
//                    count = 0;
//                }
//            }
//        }
//
//        if (count > 0) {
//            System.out.println("'" + arr[arr.length - 1] + "' appears " + (count + 1) + " times consecutively");
//        }
    }
}
