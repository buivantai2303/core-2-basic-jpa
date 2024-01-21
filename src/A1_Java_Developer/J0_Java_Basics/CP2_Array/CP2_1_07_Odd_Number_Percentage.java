package A1_Java_Developer.J0_Java_Basics.CP2_Array;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class CP2_1_07_Odd_Number_Percentage {
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

        int OddCount = 0;

        System.out.print("Array full: " );
        for (int i = 0; i < num; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {
                OddCount++;
            }
        }

        double percentage = ((double) OddCount / (double) arr.length) * 100;
        DecimalFormat format = new DecimalFormat("#.##");
        String formatted  = format.format(percentage);
        System.out.println("\n- Percentage: " + formatted + "%");
    }
}
