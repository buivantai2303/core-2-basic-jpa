package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JA2_2_02_ConvertListToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        System.out.print("Enter your length of list: ");
        int len = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            String num = scanner.nextLine();
            list.add(num);
        }


        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
