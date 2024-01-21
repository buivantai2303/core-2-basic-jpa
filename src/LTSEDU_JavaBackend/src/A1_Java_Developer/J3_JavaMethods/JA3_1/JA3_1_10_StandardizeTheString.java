package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA3_1_10_StandardizeTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String string = scanner.nextLine();

        string = string.trim();

        System.out.println("Result: " + getStandardizeString(string));
    }

    static String getStandardizeString(String string) {
        String[] newString = string.split("\\s+");
        for (int i = 0; i < newString.length; i++) {
            newString[i] = newString[i].substring(0, 1).toUpperCase() + newString[i].substring(1).toLowerCase();
        }

        return String.join(" ", newString);
    }
}
