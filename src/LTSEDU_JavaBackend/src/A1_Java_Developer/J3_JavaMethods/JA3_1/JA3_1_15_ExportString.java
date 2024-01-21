package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_15_ExportString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String string = scanner.nextLine();

        string = string.trim();

        System.out.println("Result: " + getStandardizeString(string));
    }

    static String getStandardizeString(String string) {
        return string;
    }
}
