package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.List;

public class JA2_2_07_First_End_Element_InList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi");

        System.out.println("First position: " + list.indexOf("Dua"));
        System.out.println("Last position: " + list.lastIndexOf("Dua"));
    }
}
