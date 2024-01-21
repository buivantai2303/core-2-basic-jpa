package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.List;

public class JA2_2_10_MaxMinList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5);

        Integer var = list.stream().max(Integer::compare).get();
        Integer var_2 = list.stream().min(Integer::compare).get();

        System.out.println("Max: " + var);
        System.out.println("Min: " + var_2);
    }
}
