package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.*;

public class JA2_2_03_ReverseList {
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
        Collections.reverse(list);
        System.out.println(list);
    }
}
