package A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class JA2_1_19_Average {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9, 6, 3, 2, 5};

        System.out.println("Average: " + Arrays.stream(arr).average());
    }
}
