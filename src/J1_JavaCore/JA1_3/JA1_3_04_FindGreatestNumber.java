package J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_04_FindGreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int c = scanner.nextInt();

        if (a > b && a > c){
            System.out.println("The greatest number: " + a);
        } else if ( a > b && a < c){
            System.out.println("The greatest number: " + c);
        } else if ( a < b && a > c){
            System.out.println("The greatest number: " + b);
        } else if ( a == b && b == c) {
            System.out.println("The greatest number: " + a);
        }
    }
}
