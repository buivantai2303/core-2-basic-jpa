package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_3_03_FindGreater_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number 1: ");
        int S1 = scanner.nextInt();
        System.out.print("Enter your number 2: ");
        int S2 = scanner.nextInt();

        if ( S1 > S2 ){
            System.out.println("Number 1 is greater than Number 2");
        } else if ( S2 > S1) {
            System.out.println("Number 2 is greater than Number 1");
        } else if ( S1 == S2 ){
            System.out.println("Two number are the same");
        } else {
            System.out.println(("Wrong!"));
        }
    }
}
