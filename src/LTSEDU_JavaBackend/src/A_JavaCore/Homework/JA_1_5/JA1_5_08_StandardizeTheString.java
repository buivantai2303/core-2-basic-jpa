package A_JavaCore.Homework.JA_1_5;

import java.util.Scanner;

public class JA1_5_08_StandardizeTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String email = Scan(fullName);
        System.out.println("Your email: " + email);

    }

    public static String Scan(String fullName){
        String Email = fullName.replaceAll("\\s+", "").toLowerCase();
        return Email + "@hvitclan.com";
    }
}
