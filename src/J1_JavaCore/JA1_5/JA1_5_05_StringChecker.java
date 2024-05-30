package J1_JavaCore.JA1_5;

import java.util.Scanner;

public class JA1_5_05_StringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str_1, str_2;

        System.out.print("Enter your string 1: ");
        str_1 = scanner.nextLine();
        System.out.print("Enter your string 2: ");
        str_2 = scanner.nextLine();

        if (str_1.contains(str_2)){
            System.out.println("String has exist");
        } else {
            System.out.println("String has not exist");
        }
    }


}
