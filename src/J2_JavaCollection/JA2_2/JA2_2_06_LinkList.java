package J2_JavaCollection.JA2_2;

import java.util.Collections;
import java.util.LinkedList;

public class JA2_2_06_LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 1, 4, 7, 8, 9, 6, 3, 2, 5);

        System.out.println(linkedList);
    }
}
