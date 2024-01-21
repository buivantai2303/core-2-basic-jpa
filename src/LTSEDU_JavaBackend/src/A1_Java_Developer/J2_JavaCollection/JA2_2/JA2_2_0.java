package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA2_2_0 {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(123, 421, 723, 89, 90, 61, 33, 22, 54);
        for (int i : listInt) {
            if (IncreaseFilter(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean IncreaseFilter(int x) {
        int lastDigit = -1;
        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit >= lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            x /= 10;
        }
        return true;
    }




}
