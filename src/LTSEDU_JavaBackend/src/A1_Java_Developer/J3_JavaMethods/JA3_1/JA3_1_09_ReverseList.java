package A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JA3_1_09_ReverseList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your strings (comma-separated): ");
        String input = scanner.nextLine();

        List<String> stringList = new ArrayList<>();
        String[] inputArray = input.split("\\s+");

        for (String str : inputArray) {
            stringList.add(str.trim());
        }

        List<String> reversedList = getReverseString(stringList);

        System.out.println("Original List: " + stringList);
        System.out.println("Reversed List: " + reversedList);
    }

    static List<String> getReverseString(List<String> list) {
        List<String> newList = new ArrayList<>(list);
        Collections.reverse(newList);
        return newList;
    }
}
