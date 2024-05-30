package J1_JavaCore.JA1_4;

import java.util.Scanner;

public class JA1_4_04_CompleteOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        System.out.println(Logarithm(number));

    }

    public static boolean Logarithm(int n){
        boolean check = true;

        while (n > 0){
            int digit = n % 10;
            n = n / 10;
            if (digit % 2 == 0){
                check = false;
            }
        }

        return check;
    }
}
