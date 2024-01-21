package A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_13_CheckInput {
    public static void main(String[] args) {
        inputCheck();
    }

    static void inputCheck(){
        int NUM;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your number: ");

            if (scanner.hasNextInt()) {
                NUM = scanner.nextInt();

                if (NUM >= 1 && NUM <= 100) {
                    System.out.println("Valid number: " + NUM);
                } else {
                    System.out.println("Outside the range of 1 to 100. Enter again!");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
                NUM = 0;
            }
        } while (NUM < 1 || NUM > 100);

    }
}
