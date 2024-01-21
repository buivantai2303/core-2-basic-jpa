package A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.Arrays;
import java.util.List;

public class JA2_1_26_ListCheckerWithCondition {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i) * list.get(i);
            list.set(i, temp);
        }

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 20) {
                count++;
            }
        }

        System.out.println("List: " + list +", number that bigger than 20: " + count);
    }
}
