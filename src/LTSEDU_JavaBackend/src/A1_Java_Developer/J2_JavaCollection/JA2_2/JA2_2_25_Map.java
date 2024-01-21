package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.HashMap;
import java.util.Map;

public class JA2_2_25_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map_1 = new HashMap<Integer, String>();
        HashMap<Integer, String> map_2 = new HashMap<Integer, String>();

        map_1.put(1, "Red");
        map_1.put(2, "Green");
        map_1.put(3, "Blue");

        map_2.put(4, "White");
        map_2.put(5, "Black");
        map_2.put(6, "Orange");

        System.out.println(map_1);
        System.out.println(map_2);
        map_2.putAll(map_1);
        System.out.println(map_2);
    }
}
