package A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_08_StandardlizeTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = scanner.nextLine();

        System.out.println(getStandardlizeString(string));
    }

    static String getStandardlizeString(String string) {
        return string.replaceAll("\\s+", " ").trim();
    }
}
