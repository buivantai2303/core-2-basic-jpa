package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.List;

public class JA2_2_01_ListPrintPosition {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i) + " ");
        }
    }


}
