package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.*;

public class JA2_2_11_CharacterSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String line = scanner.nextLine();

        String[] element = line.split("\\s+");

        List<String> list = new ArrayList<>(Arrays.asList(element));

        Collections.sort(list);

        System.out.println(list);
    }
}
