package A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA2_1_21_LengthOfString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of string array: ");
        int len = scanner.nextInt();
        String[] arr = new String[len];
        scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": " );
            arr[i] = scanner.nextLine();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 1) {
                list.add(arr[i].length());
            }
        }

        System.out.println("Length: " + list);
    }
}
