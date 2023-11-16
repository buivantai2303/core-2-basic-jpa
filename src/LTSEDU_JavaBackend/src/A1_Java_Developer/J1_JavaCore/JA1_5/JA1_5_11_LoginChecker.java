package A1_Java_Developer.J1_JavaCore.JA1_5;

import java.util.Scanner;

public class JA1_5_11_LoginChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accountDefault = "nguyendongkhanh@hvitclan.vn";
        String passDefault = "123456";
        String acc, pass;


        do {
            System.out.print("Enter your account: ");
            acc = scanner.nextLine();
            System.out.print("Enter your password: ");
            pass = scanner.nextLine();

            if (acc.equals(accountDefault) && pass.equals(passDefault)){
                System.out.println("Login successful!");
            } else {
                System.out.println("Wrong account or password. Check and enter again!");
                System.out.println();
            }
        } while (!acc.equals(accountDefault) && !pass.equals(passDefault));
    }
}
