package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.*;

public class JA2_2_16_Iterator_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));

        ListIterator<Integer> listIn = list.listIterator();


        System.out.print("Iterating default: ");
        while (listIn.hasNext()) {
            System.out.print(listIn.next() + " ");
        }

        System.out.print("\nIterating backward: ");
        while (listIn.hasPrevious()) {
            System.out.print(listIn.previous() + " ");
        }

    }
}
