package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_11_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUM;

        do {
            System.out.println("Enter your number: ");
            NUM = scanner.nextInt();

            if (NUM >= 1 && NUM <= 100) {
                System.out.println("Within the range of 1 to 100");
            } else {
                System.out.println("Outside the range of 1 to 100. Enter again!");
            }
        } while (NUM < 1 || NUM > 100);
    }
}
