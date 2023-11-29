package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JA2_2_20_NullSetChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<String>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"));

        if (!set.isEmpty()){
            System.out.println("Set nay coo phan tu");
        } else {
            System.out.println("Null set");
        }


    }
}
