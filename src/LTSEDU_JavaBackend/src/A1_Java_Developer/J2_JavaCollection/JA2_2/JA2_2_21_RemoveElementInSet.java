package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JA2_2_21_RemoveElementInSet {
    public static void main(String[] args) {
        Set<Integer> set_1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set_2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7, 8));

        set_1.remove(4);


         set_2.removeAll(set_1);


        System.out.println(set_1);
        System.out.println(set_2);

        set_2.clear();
        set_1.clear();
    }
}
