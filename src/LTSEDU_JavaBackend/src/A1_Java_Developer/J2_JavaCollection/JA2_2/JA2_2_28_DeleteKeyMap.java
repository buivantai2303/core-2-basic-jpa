package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.HashMap;
import java.util.Scanner;

public class JA2_2_28_DeleteKeyMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");

        System.out.print("Enter your key to delete: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        hashMap.remove(key);

        System.out.println(hashMap);
    }
}
