package A1_Java_Developer.J1_JavaCore.JA_1_5;

import java.util.Scanner;

public class JA1_5_04_FindFinalOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string 1: ");
        String str_1 = scanner.nextLine();
        System.out.print("Enter your string to find: ");
        String str_2 = scanner.nextLine();

        System.out.println("Last index: " + str_1.lastIndexOf(str_2));

    }
}
