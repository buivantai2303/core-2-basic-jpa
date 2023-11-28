package A1_Java_Developer.J2_JavaCollection;

import java.util.Scanner;

public class JA2_1_16_IncreaseNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String Line = scanner.nextLine();

        char[] str = Line.toCharArray();

        for (int i = 1; i < str.length; i++) {
            if (str[i] > str[i - 1]) {
                System.out.println("Increase number");
            } else {
                System.out.println("Decrease number");
            }
        }
    }
}
