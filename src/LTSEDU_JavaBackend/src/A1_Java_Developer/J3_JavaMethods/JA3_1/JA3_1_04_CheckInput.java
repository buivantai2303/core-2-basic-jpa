package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_04_CheckInput {
    public static void main(String[] args) {
        entryNumber();
    }

    static void displayNumber(int x) {
        System.out.println("Result: " + x);
    }

    static void entryNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number: ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                displayNumber(number);
            } else {
                System.out.println("Invalid datatype!");
                break;
            }
        }
        scanner.close();
    }
}
