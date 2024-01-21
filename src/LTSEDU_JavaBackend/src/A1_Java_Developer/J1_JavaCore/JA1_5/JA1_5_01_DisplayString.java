package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_5;

import java.util.Scanner;

public class JA1_5_01_DisplayString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.print("Enter your string: ");
        str = scanner.nextLine();

        System.out.println("Lower case: " + str.toLowerCase());
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Length: " + str.length());


    }
}
