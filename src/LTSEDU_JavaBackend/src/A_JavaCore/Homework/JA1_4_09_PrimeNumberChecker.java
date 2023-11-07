package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_09_PrimeNumberChecker {
    public static void main(String[] args) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int NUM = scanner.nextInt();

        for (int i = 2; i < NUM; i++) {
            if (NUM % i == 0){
                result = false;
            }
        }

        System.out.println("Result: " + result);
    }
}
