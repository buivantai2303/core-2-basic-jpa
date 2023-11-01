package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_1_02_BasicInOutPut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String STR1 = scanner.nextLine();

        System.out.println("Your string: " + STR1);
    }
}