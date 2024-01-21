package A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Scanner;

public class JA3_1_03_SquareNumberBasicTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = scanner.nextInt();

        if (checkingSquareNumber(x)){
            System.out.println(x + " is square number");
        } else {
            System.out.println(x + " is not square number");
        }
    }

    static boolean checkingSquareNumber(int x) {
        return Math.pow(Math.sqrt(x), 2) == x;
    }
}
