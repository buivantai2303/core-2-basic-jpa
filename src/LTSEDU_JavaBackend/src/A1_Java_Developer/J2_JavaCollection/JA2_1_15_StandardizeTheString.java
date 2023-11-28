package A1_Java_Developer.J2_JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JA2_1_15_StandardizeTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String email = generateEmail(fullName);
        System.out.println("Your email: " + email);
    }

    public static String generateEmail(String fullName) {
        List<String> names = Arrays.asList(fullName.split("\\s+"));

        StringBuilder firstEmail = new StringBuilder();
        for (int i = 0; i < names.size() - 1; i++) {
            firstEmail.append(names.get(i).substring(0, 1).toUpperCase());
        }

        String lastEmail = names.get(names.size() - 1).substring(0, 1).toUpperCase() + names.get(names.size() - 1).substring(1).toLowerCase();

        return lastEmail + firstEmail + "@hvitclan.com";
    }
}
