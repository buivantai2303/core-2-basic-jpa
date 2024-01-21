package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.HashMap;
import java.util.Scanner;

public class JA2_2_27_AvailableElementMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");

        System.out.print("Enter your key to check: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        System.out.println("Key " + key + " available state: " + hashMap.containsKey(key));
    }
}
