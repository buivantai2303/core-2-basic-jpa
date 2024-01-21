package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JA2_2_12_HashMapAppear {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 1, 3, 3, 4, 3, 5, 5);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println("Appear times: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " , ");
        }
    }
}
