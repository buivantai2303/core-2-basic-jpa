package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.*;

public class JA2_2_19_DeleteElementCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();


        System.out.print("Enter number of value: ");
        int len = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < len; i++) {
            System.out.print("Enter value " + i + ": ");
            set.add(scanner.nextLine());
        }
        System.out.println("-----------");
        System.out.println("Default set: " + set);
        System.out.println("-----------");
        System.out.print("Select element you want to remove: ");
        String element = scanner.nextLine();

        set.remove(element);
        System.out.println("New set: " + set);
    }
}
