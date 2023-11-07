package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_15_DecomposeNumberIntoPrimeFactors {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = scanner.nextInt();

        System.out.print("SNT: ");

        for(int i = 2;i<=num;i++){
            while (num%i==0){
                if (CheckSNT(i)){
                    System.out.print(i+" ");
                    num = num / i;
                }
            }
        }
    }

    public static boolean CheckSNT(int number){
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
