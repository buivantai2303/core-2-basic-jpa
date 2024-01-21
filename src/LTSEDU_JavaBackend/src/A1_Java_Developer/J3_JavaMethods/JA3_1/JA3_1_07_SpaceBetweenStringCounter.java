package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_07_SpaceBetweenStringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = scanner.nextLine();

        System.out.println("Result: " + getSpaceBetweenString(string));
    }

    static int getSpaceBetweenString(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' '){
                count++;
            }
        }

        return count;
    }
}
