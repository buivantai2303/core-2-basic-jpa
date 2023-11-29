package A1_Java_Developer.J2_JavaCollection.JA2_2;

import java.util.HashSet;
import java.util.Set;

public class JA2_2_18_HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Car");
        set.add("Volvo");
        set.add("BMW");
        set.add("Yamaha");
        set.add("Honda");

        set.add("Car");
        set.add("Volvo");
        set.add("BMW");
        set.add("Yamaha");
        set.add("Honda");


        System.out.println(set);

    }
}
