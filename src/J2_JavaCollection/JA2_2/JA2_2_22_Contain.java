package J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class JA2_2_22_Contain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"));
        String s = "Hvit";

        boolean check = false;

        for (String i : set) {
            if ( i.equals(s) ) {
                check = true;
            }
            else {
                check = false;
            }

        }

        if (check) {
            System.out.println(" Chuỗi s chứa trong set");
        } else {
            System.out.println(" Chuỗi s không chứa trong set");
        }
    }
}