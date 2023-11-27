package A1_Java_Developer.J2_JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA2_1_15_StandardizeTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> name = new ArrayList<>();

        System.out.print("Enter your full name: ");
        String Line_1 = scanner.nextLine();



//        String email = Scan(fullName);
//        System.out.println("Your email: " + email);

    }

    public static String Scan(String fullName){
        String Email = fullName.replaceAll("\\s+", "").toLowerCase();
        return Email + "@hvitclan.com";
    }
}
