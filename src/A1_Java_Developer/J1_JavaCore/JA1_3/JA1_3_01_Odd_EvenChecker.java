package A1_Java_Developer.J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_01_Odd_EvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = scanner.nextInt();
        do {
            if (x % 2 == 0){
                System.out.println("- This is even number");
                break;
            } else if (x % 2 == 1) {
                System.out.println("- This is odd number");
                break;
            }
        } while (scanner.hasNextInt());
    }
}
