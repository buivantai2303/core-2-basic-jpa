package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_4;

import java.util.Scanner;

public class JA1_4_13_AllDivisorOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        System.out.print("Divisors: ");
        for ( int i = 1; i <= num; i++ ){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
