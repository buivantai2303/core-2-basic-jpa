package J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA2_2_04_CopyAList {
    public static void main(String[] args) {
        List<String> list_1 = Arrays.asList("1", "2", "3", "4");
        List<String> list_2 = Arrays.asList("A", "B", "C", "D");

        Collections.copy(list_1, list_2);

        System.out.println(list_1);
        System.out.println(list_2);
    }
}
