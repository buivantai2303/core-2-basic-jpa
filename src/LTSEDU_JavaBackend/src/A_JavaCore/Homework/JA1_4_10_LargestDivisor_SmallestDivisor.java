package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_10_LargestDivisor_SmallestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BCNN = 0, UCLN = 0;

        System.out.print("Enter your number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter your number b: ");
        int b = scanner.nextInt();

        if ( a > 0 && b > 0){
            for (int i = 1; i <= a*b; i++){
                if (i % a == 0 && i % b == 0){
                    BCNN = i;
                    break;
                }
            }

            if (a > b){
                for (int i = 1; i <= a; i++){
                    if (a % i == 0 && b % i == 0){
                        UCLN = i;
                    }
                }
            }
            else {
                for (int i = 1; i <= b; i++){
                    if (a % i == 0 && b % i == 0){
                        UCLN = i;
                    }
                }
            }

            System.out.println("UCLN = " + UCLN + ", BCNN = " + BCNN);
        }
    }
}
