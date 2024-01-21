package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class JA2_2_13_Iterator {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>(Arrays.asList(1, 2, 5, 3, 4, 5, 6, 7));
        Iterator<Integer> iterator = hashset.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }
    }
}
