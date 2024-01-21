package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_05_GetCharacterBetweenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = scanner.nextLine();

        System.out.println("Result: " + getMiddleCharacter(string));
    }

    public static String getMiddleCharacter(String string) {
        int position;
        int length;

        if (string.length() % 2 == 0) {
            length = 2;
            position = string.length() / 2 - 1;
        } else {
            length = 1;
            position = string.length() / 2;
        }

        return string.substring(position, position + length);
    }
}
