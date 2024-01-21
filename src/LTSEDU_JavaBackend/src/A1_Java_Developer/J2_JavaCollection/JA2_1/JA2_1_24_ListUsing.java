package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA2_1_24_ListUsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        System.out.print("Enter your length of list: ");
        int len = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            int num = scanner.nextInt();
            list.add(num);
        }

        System.out.println(list);
    }
}
