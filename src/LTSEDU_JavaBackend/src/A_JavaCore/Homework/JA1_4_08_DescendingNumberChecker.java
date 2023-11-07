package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_08_DescendingNumberChecker {
    public static void main(String[] args) {
        boolean Result = true;
        int NUM, END = 0, Temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        NUM = scanner.nextInt();

        while (NUM > 0){
            Temp = END;
            END = NUM % 10;
            if (Temp < END){
                Result = true;
            } else {
                Result = false;
            }
            NUM /= 10;
        }

        System.out.println("Result: " + Result);
    }
}
