package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JA2_2_24_FindTheIntersectionSetOf2Sets {
    public static void main(String[] args) {
        Integer[] arr_1 = {1, 2, 5, 0, 6, 7},
                arr_2 = { 0, 9, 7, 5, 3, 8};

        Set<Integer> set_1 = new HashSet<Integer>(Arrays.asList(arr_1));
        Set<Integer> set_2 = new HashSet<Integer>(Arrays.asList(arr_2));
        set_1.retainAll(set_2);

        System.out.println("Phần tử chung của 2 set là: " + set_1);


    }
}
