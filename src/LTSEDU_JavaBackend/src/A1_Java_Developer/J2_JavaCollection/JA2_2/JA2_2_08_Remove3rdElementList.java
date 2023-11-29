package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA2_2_08_Remove3rdElementList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        System.out.println("Default list: " + list);
        list.remove(3);
        System.out.println("Removed list: " + list);
    }
}
